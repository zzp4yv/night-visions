package io.sentry;

import io.sentry.C9389d5;
import io.sentry.cache.C9360q;
import io.sentry.cache.InterfaceC9361r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* compiled from: PreviousSessionFinalizer.java */
/* renamed from: io.sentry.l3 */
/* loaded from: classes2.dex */
final class RunnableC9472l3 implements Runnable {

    /* renamed from: f */
    private static final Charset f36448f = Charset.forName("UTF-8");

    /* renamed from: g */
    private final C9647x4 f36449g;

    /* renamed from: h */
    private final InterfaceC9625v1 f36450h;

    RunnableC9472l3(C9647x4 c9647x4, InterfaceC9625v1 interfaceC9625v1) {
        this.f36449g = c9647x4;
        this.f36450h = interfaceC9625v1;
    }

    /* renamed from: a */
    private Date m30984a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f36448f));
            try {
                String readLine = bufferedReader.readLine();
                this.f36449g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date m30010e = C9211a1.m30010e(readLine);
                bufferedReader.close();
                return m30010e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36449g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error reading the crash marker file.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            this.f36449g.getLogger().mo30212a(EnumC9554s4.ERROR, e3, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f36449g.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f36449g.getLogger().mo30214c(EnumC9554s4.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f36449g.isEnableAutoSessionTracking()) {
            this.f36449g.getLogger().mo30214c(EnumC9554s4.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        InterfaceC9361r envelopeDiskCache = this.f36449g.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C9360q) && !((C9360q) envelopeDiskCache).m30635G()) {
            this.f36449g.getLogger().mo30214c(EnumC9554s4.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File m30625C = C9360q.m30625C(cacheDirPath);
        InterfaceC9340c2 serializer = this.f36449g.getSerializer();
        if (m30625C.exists()) {
            this.f36449g.getLogger().mo30214c(EnumC9554s4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m30625C), f36448f));
                try {
                    C9389d5 c9389d5 = (C9389d5) serializer.mo30489c(bufferedReader, C9389d5.class);
                    if (c9389d5 == null) {
                        this.f36449g.getLogger().mo30214c(EnumC9554s4.ERROR, "Stream from path %s resulted in a null envelope.", m30625C.getAbsolutePath());
                    } else {
                        File file = new File(this.f36449g.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f36449g.getLogger().mo30214c(EnumC9554s4.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date m30984a = m30984a(file);
                            if (!file.delete()) {
                                this.f36449g.getLogger().mo30214c(EnumC9554s4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            c9389d5.m30752p(C9389d5.b.Crashed, null, true);
                            date = m30984a;
                        }
                        if (c9389d5.m30743f() == null) {
                            c9389d5.m30741d(date);
                        }
                        this.f36450h.mo31158s(C9416h4.m30830a(serializer, c9389d5, this.f36449g.getSdkVersion()));
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
                this.f36449g.getLogger().mo30213b(EnumC9554s4.ERROR, "Error processing previous session.", th2);
            }
            if (m30625C.delete()) {
                return;
            }
            this.f36449g.getLogger().mo30214c(EnumC9554s4.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
