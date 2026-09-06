package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.C9211a1;
import io.sentry.C9438i2;
import io.sentry.C9473l4;
import io.sentry.C9484n1;
import io.sentry.C9550s0;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.cache.C9237b;
import io.sentry.android.core.internal.threaddump.C9269b;
import io.sentry.android.core.internal.threaddump.C9270c;
import io.sentry.cache.C9360q;
import io.sentry.cache.InterfaceC9361r;
import io.sentry.hints.AbstractC9422e;
import io.sentry.hints.C9418a;
import io.sentry.hints.InterfaceC9419b;
import io.sentry.hints.InterfaceC9421d;
import io.sentry.protocol.C9518j;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9531w;
import io.sentry.transport.C9578o;
import io.sentry.transport.InterfaceC9580q;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class AnrV2Integration implements Integration, Closeable {

    /* renamed from: f */
    static final long f35774f = TimeUnit.DAYS.toMillis(91);

    /* renamed from: g */
    private final Context f35775g;

    /* renamed from: h */
    private final InterfaceC9580q f35776h;

    /* renamed from: i */
    private SentryAndroidOptions f35777i;

    /* renamed from: io.sentry.android.core.AnrV2Integration$a */
    static class RunnableC9217a implements Runnable {

        /* renamed from: f */
        private final Context f35778f;

        /* renamed from: g */
        private final InterfaceC9625v1 f35779g;

        /* renamed from: h */
        private final SentryAndroidOptions f35780h;

        /* renamed from: i */
        private final long f35781i;

        RunnableC9217a(Context context, InterfaceC9625v1 interfaceC9625v1, SentryAndroidOptions sentryAndroidOptions, InterfaceC9580q interfaceC9580q) {
            this.f35778f = context;
            this.f35779g = interfaceC9625v1;
            this.f35780h = sentryAndroidOptions;
            this.f35781i = interfaceC9580q.mo30147a() - AnrV2Integration.f35774f;
        }

        /* renamed from: a */
        private byte[] m30105a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }

        /* renamed from: b */
        private C9219c m30106b(ApplicationExitInfo applicationExitInfo, boolean z) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        C9219c c9219c = new C9219c(C9219c.a.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                        return c9219c;
                    }
                    byte[] m30105a = m30105a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m30105a)));
                        try {
                            List<C9531w> m30271f = new C9270c(this.f35780h, z).m30271f(C9269b.m30260c(bufferedReader));
                            if (m30271f.isEmpty()) {
                                C9219c c9219c2 = new C9219c(C9219c.a.ERROR, m30105a);
                                bufferedReader.close();
                                return c9219c2;
                            }
                            C9219c c9219c3 = new C9219c(C9219c.a.DUMP, m30105a, m30271f);
                            bufferedReader.close();
                            return c9219c3;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f35780h.getLogger().mo30213b(EnumC9554s4.WARNING, "Failed to parse ANR thread dump", th2);
                        return new C9219c(C9219c.a.ERROR, m30105a);
                    }
                } catch (Throwable th3) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                this.f35780h.getLogger().mo30213b(EnumC9554s4.WARNING, "Failed to read ANR thread dump", th4);
                return new C9219c(C9219c.a.NO_DUMP);
            }
        }

        /* renamed from: c */
        private void m30107c(ApplicationExitInfo applicationExitInfo, boolean z) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z2 = applicationExitInfo.getImportance() != 100;
            C9219c m30106b = m30106b(applicationExitInfo, z2);
            if (m30106b.f35785a == C9219c.a.NO_DUMP) {
                this.f35780h.getLogger().mo30214c(EnumC9554s4.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            C9218b c9218b = new C9218b(this.f35780h.getFlushTimeoutMillis(), this.f35780h.getLogger(), timestamp, z, z2);
            C9484n1 m31778a = C9609m.m31778a(c9218b);
            C9473l4 c9473l4 = new C9473l4();
            C9219c.a aVar = m30106b.f35785a;
            if (aVar == C9219c.a.ERROR) {
                C9518j c9518j = new C9518j();
                c9518j.m31378d("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                c9473l4.m30994A0(c9518j);
            } else if (aVar == C9219c.a.DUMP) {
                c9473l4.m30996C0(m30106b.f35787c);
            }
            c9473l4.m31011z0(EnumC9554s4.FATAL);
            c9473l4.m30997D0(C9211a1.m30009d(timestamp));
            if (this.f35780h.isAttachAnrThreadDump() && (bArr = m30106b.f35786b) != null) {
                m31778a.m31081l(C9550s0.m31573b(bArr));
            }
            if (this.f35779g.mo31159t(c9473l4, m31778a).equals(C9525q.f36725f) || c9218b.mo30477e()) {
                return;
            }
            this.f35780h.getLogger().mo30214c(EnumC9554s4.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c9473l4.m30579G());
        }

        /* renamed from: d */
        private void m30108d(List<ApplicationExitInfo> list, Long l) {
            Collections.reverse(list);
            for (ApplicationExitInfo applicationExitInfo : list) {
                if (applicationExitInfo.getReason() == 6) {
                    if (applicationExitInfo.getTimestamp() < this.f35781i) {
                        this.f35780h.getLogger().mo30214c(EnumC9554s4.DEBUG, "ANR happened too long ago %s.", applicationExitInfo);
                    } else if (l == null || applicationExitInfo.getTimestamp() > l.longValue()) {
                        m30107c(applicationExitInfo, false);
                    } else {
                        this.f35780h.getLogger().mo30214c(EnumC9554s4.DEBUG, "ANR has already been reported %s.", applicationExitInfo);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f35778f.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f35780h.getLogger().mo30214c(EnumC9554s4.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            InterfaceC9361r envelopeDiskCache = this.f35780h.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof C9360q) && this.f35780h.isEnableAutoSessionTracking()) {
                C9360q c9360q = (C9360q) envelopeDiskCache;
                if (!c9360q.m30635G()) {
                    this.f35780h.getLogger().mo30214c(EnumC9554s4.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    c9360q.m30637y();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long m30159U = C9237b.m30159U(this.f35780h);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationExitInfo next = it.next();
                if (next.getReason() == 6) {
                    arrayList.remove(next);
                    applicationExitInfo = next;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f35780h.getLogger().mo30214c(EnumC9554s4.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f35781i) {
                this.f35780h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (m30159U != null && applicationExitInfo.getTimestamp() <= m30159U.longValue()) {
                this.f35780h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f35780h.isReportHistoricalAnrs()) {
                m30108d(arrayList, m30159U);
            }
            m30107c(applicationExitInfo, true);
        }
    }

    @ApiStatus.Internal
    /* renamed from: io.sentry.android.core.AnrV2Integration$b */
    public static final class C9218b extends AbstractC9422e implements InterfaceC9421d, InterfaceC9419b {

        /* renamed from: d */
        private final long f35782d;

        /* renamed from: e */
        private final boolean f35783e;

        /* renamed from: f */
        private final boolean f35784f;

        public C9218b(long j2, InterfaceC9637w1 interfaceC9637w1, long j3, boolean z, boolean z2) {
            super(j2, interfaceC9637w1);
            this.f35782d = j3;
            this.f35783e = z;
            this.f35784f = z2;
        }

        @Override // io.sentry.hints.InterfaceC9421d
        /* renamed from: a */
        public boolean mo30109a() {
            return this.f35783e;
        }

        @Override // io.sentry.hints.InterfaceC9419b
        /* renamed from: c */
        public Long mo30102c() {
            return Long.valueOf(this.f35782d);
        }

        @Override // io.sentry.hints.InterfaceC9419b
        /* renamed from: d */
        public /* synthetic */ boolean mo30103d() {
            return C9418a.m30834a(this);
        }

        @Override // io.sentry.hints.InterfaceC9419b
        /* renamed from: f */
        public String mo30104f() {
            return this.f35784f ? "anr_background" : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, C9578o.m31694b());
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        this.f35777i = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f35777i.isAnrEnabled()));
        if (this.f35777i.getCacheDirPath() == null) {
            this.f35777i.getLogger().mo30214c(EnumC9554s4.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f35777i.isAnrEnabled()) {
            try {
                c9647x4.getExecutorService().submit(new RunnableC9217a(this.f35775g, interfaceC9625v1, this.f35777i, this.f35776h));
            } catch (Throwable th) {
                c9647x4.getLogger().mo30213b(EnumC9554s4.DEBUG, "Failed to start AnrProcessor.", th);
            }
            c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "AnrV2Integration installed.", new Object[0]);
            mo30003a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f35777i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    AnrV2Integration(Context context, InterfaceC9580q interfaceC9580q) {
        this.f35775g = context;
        this.f35776h = interfaceC9580q;
    }

    /* renamed from: io.sentry.android.core.AnrV2Integration$c */
    static final class C9219c {

        /* renamed from: a */
        final a f35785a;

        /* renamed from: b */
        final byte[] f35786b;

        /* renamed from: c */
        final List<C9531w> f35787c;

        /* renamed from: io.sentry.android.core.AnrV2Integration$c$a */
        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        C9219c(a aVar) {
            this.f35785a = aVar;
            this.f35786b = null;
            this.f35787c = null;
        }

        C9219c(a aVar, byte[] bArr) {
            this.f35785a = aVar;
            this.f35786b = bArr;
            this.f35787c = null;
        }

        C9219c(a aVar, byte[] bArr, List<C9531w> list) {
            this.f35785a = aVar;
            this.f35786b = bArr;
            this.f35787c = list;
        }
    }
}
