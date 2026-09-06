package io.sentry.cache;

import io.sentry.C9211a1;
import io.sentry.C9389d5;
import io.sentry.C9395e4;
import io.sentry.C9416h4;
import io.sentry.C9459j4;
import io.sentry.C9484n1;
import io.sentry.C9647x4;
import io.sentry.EnumC9547r4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.InterfaceC9419b;
import io.sentry.hints.InterfaceC9429l;
import io.sentry.hints.InterfaceC9431n;
import io.sentry.transport.C9583t;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeCache.java */
@ApiStatus.Internal
/* renamed from: io.sentry.cache.q */
/* loaded from: classes2.dex */
public class C9360q extends AbstractC9358o implements InterfaceC9361r {

    /* renamed from: k */
    private final CountDownLatch f36235k;

    /* renamed from: l */
    private final Map<C9416h4, String> f36236l;

    public C9360q(C9647x4 c9647x4, String str, int i2) {
        super(c9647x4, str, i2);
        this.f36236l = new WeakHashMap();
        this.f36235k = new CountDownLatch(1);
    }

    /* renamed from: A */
    private synchronized File m30624A(C9416h4 c9416h4) {
        String str;
        if (this.f36236l.containsKey(c9416h4)) {
            str = this.f36236l.get(c9416h4);
        } else {
            String str2 = (c9416h4.m30831b().m30849a() != null ? c9416h4.m30831b().m30849a().toString() : UUID.randomUUID().toString()) + ".envelope";
            this.f36236l.put(c9416h4, str2);
            str = str2;
        }
        return new File(this.f36232i.getAbsolutePath(), str);
    }

    /* renamed from: C */
    public static File m30625C(String str) {
        return new File(str, "previous_session.json");
    }

    /* renamed from: E */
    private void m30627E(C9484n1 c9484n1) {
        Date date;
        Object m31780c = C9609m.m31780c(c9484n1);
        if (m31780c instanceof InterfaceC9419b) {
            File m30625C = m30625C(this.f36232i.getAbsolutePath());
            if (!m30625C.exists()) {
                this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            InterfaceC9637w1 logger = this.f36230g.getLogger();
            EnumC9554s4 enumC9554s4 = EnumC9554s4.WARNING;
            logger.mo30214c(enumC9554s4, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m30625C), AbstractC9358o.f36229f));
                try {
                    C9389d5 c9389d5 = (C9389d5) this.f36231h.mo30489c(bufferedReader, C9389d5.class);
                    if (c9389d5 != null) {
                        InterfaceC9419b interfaceC9419b = (InterfaceC9419b) m31780c;
                        Long mo30102c = interfaceC9419b.mo30102c();
                        if (mo30102c != null) {
                            date = C9211a1.m30009d(mo30102c.longValue());
                            Date m30747k = c9389d5.m30747k();
                            if (m30747k == null || date.before(m30747k)) {
                                this.f36230g.getLogger().mo30214c(enumC9554s4, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            date = null;
                        }
                        c9389d5.m30753q(C9389d5.b.Abnormal, null, true, interfaceC9419b.mo30104f());
                        c9389d5.m30741d(date);
                        m30631O(m30625C, c9389d5);
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error processing previous session.", th2);
            }
        }
    }

    /* renamed from: F */
    private void m30628F(File file, C9416h4 c9416h4) {
        Iterable<C9459j4> m30832c = c9416h4.m30832c();
        if (!m30832c.iterator().hasNext()) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        C9459j4 next = m30832c.iterator().next();
        if (!EnumC9547r4.Session.equals(next.m30910i().m30919b())) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.INFO, "Current envelope has a different envelope type %s", next.m30910i().m30919b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.m30909h()), AbstractC9358o.f36229f));
            try {
                C9389d5 c9389d5 = (C9389d5) this.f36231h.mo30489c(bufferedReader, C9389d5.class);
                if (c9389d5 == null) {
                    this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "Item of type %s returned null by the parser.", next.m30910i().m30919b());
                } else {
                    m30631O(file, c9389d5);
                }
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Item failed to process.", th2);
        }
    }

    /* renamed from: L */
    private void m30629L() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f36230g.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(C9211a1.m30012g(C9211a1.m30008c()).getBytes(AbstractC9358o.f36229f));
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
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    /* renamed from: M */
    private void m30630M(File file, C9416h4 c9416h4) {
        if (file.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f36231h.mo30488b(c9416h4, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30212a(EnumC9554s4.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    /* renamed from: O */
    private void m30631O(File file, C9389d5 c9389d5) {
        if (file.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Overwriting session to offline storage: %s", c9389d5.m30746j());
            if (!file.delete()) {
                this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC9358o.f36229f));
                try {
                    this.f36231h.mo30487a(c9389d5, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            this.f36230g.getLogger().mo30212a(EnumC9554s4.ERROR, th3, "Error writing Session to offline storage: %s", c9389d5.m30746j());
        }
    }

    /* renamed from: w */
    private File[] m30632w() {
        File[] listFiles;
        return (!m30618g() || (listFiles = this.f36232i.listFiles(new FilenameFilter() { // from class: io.sentry.cache.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean endsWith;
                endsWith = str.endsWith(".envelope");
                return endsWith;
            }
        })) == null) ? new File[0] : listFiles;
    }

    /* renamed from: x */
    public static InterfaceC9361r m30633x(C9647x4 c9647x4) {
        String cacheDirPath = c9647x4.getCacheDirPath();
        int maxCacheItems = c9647x4.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new C9360q(c9647x4, cacheDirPath, maxCacheItems);
        }
        c9647x4.getLogger().mo30214c(EnumC9554s4.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return C9583t.m31704c();
    }

    /* renamed from: z */
    public static File m30634z(String str) {
        return new File(str, "session.json");
    }

    /* renamed from: G */
    public boolean m30635G() {
        try {
            return this.f36235k.await(this.f36230g.getFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    /* renamed from: Z */
    public void mo30163Z(C9416h4 c9416h4, C9484n1 c9484n1) {
        C9613q.m31802c(c9416h4, "Envelope is required.");
        m30619t(m30632w());
        File m30634z = m30634z(this.f36232i.getAbsolutePath());
        File m30625C = m30625C(this.f36232i.getAbsolutePath());
        if (C9609m.m31781d(c9484n1, InterfaceC9429l.class) && !m30634z.delete()) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (C9609m.m31781d(c9484n1, InterfaceC9419b.class)) {
            m30627E(c9484n1);
        }
        if (C9609m.m31781d(c9484n1, InterfaceC9431n.class)) {
            if (m30634z.exists()) {
                this.f36230g.getLogger().mo30214c(EnumC9554s4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m30634z), AbstractC9358o.f36229f));
                    try {
                        C9389d5 c9389d5 = (C9389d5) this.f36231h.mo30489c(bufferedReader, C9389d5.class);
                        if (c9389d5 != null) {
                            m30631O(m30625C, c9389d5);
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error processing session.", th2);
                }
            }
            m30628F(m30634z, c9416h4);
            boolean exists = new File(this.f36230g.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!exists) {
                File file = new File(this.f36230g.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f36230g.getLogger().mo30214c(EnumC9554s4.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    exists = true;
                }
            }
            C9395e4.m30762a().m30763b(exists);
            m30637y();
        }
        File m30624A = m30624A(c9416h4);
        if (m30624A.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.WARNING, "Not adding Envelope to offline storage because it already exists: %s", m30624A.getAbsolutePath());
            return;
        }
        this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Adding Envelope to offline storage: %s", m30624A.getAbsolutePath());
        m30630M(m30624A, c9416h4);
        if (C9609m.m31781d(c9484n1, UncaughtExceptionHandlerIntegration.C9208a.class)) {
            m30629L();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<C9416h4> iterator() {
        File[] m30632w = m30632w();
        ArrayList arrayList = new ArrayList(m30632w.length);
        for (File file : m30632w) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f36231h.mo30490d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e2) {
                this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e2);
            }
        }
        return arrayList.iterator();
    }

    @Override // io.sentry.cache.InterfaceC9361r
    /* renamed from: p */
    public void mo30636p(C9416h4 c9416h4) {
        C9613q.m31802c(c9416h4, "Envelope is required.");
        File m30624A = m30624A(c9416h4);
        if (!m30624A.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Envelope was not cached: %s", m30624A.getAbsolutePath());
            return;
        }
        this.f36230g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Discarding envelope from cache: %s", m30624A.getAbsolutePath());
        if (m30624A.delete()) {
            return;
        }
        this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "Failed to delete envelope: %s", m30624A.getAbsolutePath());
    }

    /* renamed from: y */
    public void m30637y() {
        this.f36235k.countDown();
    }
}
