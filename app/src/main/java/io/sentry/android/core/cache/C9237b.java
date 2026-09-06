package io.sentry.android.core.cache;

import io.sentry.C9416h4;
import io.sentry.C9484n1;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.C9307q0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C9277g;
import io.sentry.cache.C9360q;
import io.sentry.transport.InterfaceC9580q;
import io.sentry.util.C9608l;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidEnvelopeCache.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.cache.b */
/* loaded from: classes2.dex */
public final class C9237b extends C9360q {

    /* renamed from: m */
    private final InterfaceC9580q f35870m;

    public C9237b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, C9277g.m30272b());
    }

    /* renamed from: P */
    public static boolean m30157P(C9647x4 c9647x4) {
        String outboxPath = c9647x4.getOutboxPath();
        if (outboxPath == null) {
            c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean exists = file.exists();
            if (exists && !file.delete()) {
                c9647x4.getLogger().mo30214c(EnumC9554s4.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return exists;
        } catch (Throwable th) {
            c9647x4.getLogger().mo30213b(EnumC9554s4.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30162S(SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.C9218b c9218b) {
        Long mo30102c = c9218b.mo30102c();
        sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "Writing last reported ANR marker with timestamp %d", mo30102c);
        m30160V(mo30102c);
    }

    /* renamed from: U */
    public static Long m30159U(C9647x4 c9647x4) {
        File file = new File((String) C9613q.m31802c(c9647x4.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
        } catch (Throwable th) {
            c9647x4.getLogger().mo30213b(EnumC9554s4.ERROR, "Error reading last ANR marker", th);
        }
        if (!file.exists() || !file.canRead()) {
            c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
            return null;
        }
        String m31777c = C9608l.m31777c(file);
        if (m31777c.equals("null")) {
            return null;
        }
        return Long.valueOf(Long.parseLong(m31777c.trim()));
    }

    /* renamed from: V */
    private void m30160V(Long l) {
        String cacheDirPath = this.f36230g.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l).getBytes(f36229f));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }

    /* renamed from: W */
    private void m30161W() {
        String outboxPath = this.f36230g.getOutboxPath();
        if (outboxPath == null) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    @Override // io.sentry.cache.C9360q, io.sentry.cache.InterfaceC9361r
    /* renamed from: Z */
    public void mo30163Z(C9416h4 c9416h4, C9484n1 c9484n1) {
        super.mo30163Z(c9416h4, c9484n1);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f36230g;
        Long m30392c = C9307q0.m30389e().m30392c();
        if (C9609m.m31781d(c9484n1, UncaughtExceptionHandlerIntegration.C9208a.class) && m30392c != null) {
            long mo30147a = this.f35870m.mo30147a() - m30392c.longValue();
            if (mo30147a <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(mo30147a));
                m30161W();
            }
        }
        C9609m.m31788k(c9484n1, AnrV2Integration.C9218b.class, new C9609m.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.C9609m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                C9237b.this.m30162S(sentryAndroidOptions, (AnrV2Integration.C9218b) obj);
            }
        });
    }

    C9237b(SentryAndroidOptions sentryAndroidOptions, InterfaceC9580q interfaceC9580q) {
        super(sentryAndroidOptions, (String) C9613q.m31802c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f35870m = interfaceC9580q;
    }
}
