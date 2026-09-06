package p323h.p324a.p329z.p341g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p328y.InterfaceC9065f;

/* compiled from: SchedulerPoolFactory.java */
/* renamed from: h.a.z.g.k */
/* loaded from: classes2.dex */
public final class C9137k {

    /* renamed from: a */
    public static final boolean f35248a;

    /* renamed from: b */
    public static final int f35249b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f35250c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f35251d = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: h.a.z.g.k$a */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C9137k.f35251d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C9137k.f35251d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: h.a.z.g.k$b */
    static final class b implements InterfaceC9065f<String, String> {
        b() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9065f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo4660a(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean m29367b = m29367b(true, "rx2.purge-enabled", true, true, bVar);
        f35248a = m29367b;
        f35249b = m29368c(m29367b, "rx2.purge-period-seconds", 1, 1, bVar);
        m29369d();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m29366a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m29370e(f35248a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    static boolean m29367b(boolean z, String str, boolean z2, boolean z3, InterfaceC9065f<String, String> interfaceC9065f) {
        if (!z) {
            return z3;
        }
        try {
            String mo4660a = interfaceC9065f.mo4660a(str);
            return mo4660a == null ? z2 : "true".equals(mo4660a);
        } catch (Throwable unused) {
            return z2;
        }
    }

    /* renamed from: c */
    static int m29368c(boolean z, String str, int i2, int i3, InterfaceC9065f<String, String> interfaceC9065f) {
        if (!z) {
            return i3;
        }
        try {
            String mo4660a = interfaceC9065f.mo4660a(str);
            return mo4660a == null ? i2 : Integer.parseInt(mo4660a);
        } catch (Throwable unused) {
            return i2;
        }
    }

    /* renamed from: d */
    public static void m29369d() {
        m29371f(f35248a);
    }

    /* renamed from: e */
    static void m29370e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f35251d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: f */
    static void m29371f(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f35250c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC9134h("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                a aVar = new a();
                int i2 = f35249b;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i2, i2, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
