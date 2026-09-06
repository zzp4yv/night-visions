package p456rx.p461n.p464c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p466e.C11310g;
import p456rx.p461n.p466e.C11315l;
import p456rx.p461n.p466e.ThreadFactoryC11312i;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11378b;
import p456rx.p474t.C11381e;

/* compiled from: NewThreadWorker.java */
/* renamed from: rx.n.c.h */
/* loaded from: classes3.dex */
public class C11295h extends AbstractC11195h.a implements InterfaceC11198k {

    /* renamed from: f */
    private static final boolean f42799f;

    /* renamed from: j */
    private static volatile Object f42803j;

    /* renamed from: l */
    private final ScheduledExecutorService f42805l;

    /* renamed from: m */
    volatile boolean f42806m;

    /* renamed from: k */
    private static final Object f42804k = new Object();

    /* renamed from: h */
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f42801h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final AtomicReference<ScheduledExecutorService> f42802i = new AtomicReference<>();

    /* renamed from: g */
    public static final int f42800g = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* compiled from: NewThreadWorker.java */
    /* renamed from: rx.n.c.h$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11295h.m40394h();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int m40433a = C11310g.m40433a();
        f42799f = !z && (m40433a == 0 || m40433a >= 21);
    }

    public C11295h(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m40396m(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m40395i((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f42805l = newScheduledThreadPool;
    }

    /* renamed from: f */
    public static void m40392f(ScheduledExecutorService scheduledExecutorService) {
        f42801h.remove(scheduledExecutorService);
    }

    /* renamed from: g */
    static Method m40393g(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    static void m40394h() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f42801h.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            C11192a.m40140e(th);
            C11361c.m40578j(th);
        }
    }

    /* renamed from: i */
    public static void m40395i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f42802i;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC11312i("RxSchedulerPurge-"));
            if (atomicReference.compareAndSet(null, newScheduledThreadPool)) {
                a aVar = new a();
                int i2 = f42800g;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i2, i2, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f42801h.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: m */
    public static boolean m40396m(ScheduledExecutorService scheduledExecutorService) {
        Method m40393g;
        if (f42799f) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f42803j;
                Object obj2 = f42804k;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    m40393g = m40393g(scheduledExecutorService);
                    if (m40393g != null) {
                        obj2 = m40393g;
                    }
                    f42803j = obj2;
                } else {
                    m40393g = (Method) obj;
                }
            } else {
                m40393g = m40393g(scheduledExecutorService);
            }
            if (m40393g != null) {
                try {
                    m40393g.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e2) {
                    C11361c.m40578j(e2);
                } catch (IllegalArgumentException e3) {
                    C11361c.m40578j(e3);
                } catch (InvocationTargetException e4) {
                    C11361c.m40578j(e4);
                }
            }
        }
        return false;
    }

    @Override // p456rx.AbstractC11195h.a
    /* renamed from: c */
    public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
        return mo40147d(interfaceC11204a, 0L, null);
    }

    @Override // p456rx.AbstractC11195h.a
    /* renamed from: d */
    public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
        return this.f42806m ? C11381e.m40676c() : m40397j(interfaceC11204a, j2, timeUnit);
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f42806m;
    }

    /* renamed from: j */
    public RunnableC11297j m40397j(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
        RunnableC11297j runnableC11297j = new RunnableC11297j(C11361c.m40585q(interfaceC11204a));
        runnableC11297j.m40402a(j2 <= 0 ? this.f42805l.submit(runnableC11297j) : this.f42805l.schedule(runnableC11297j, j2, timeUnit));
        return runnableC11297j;
    }

    /* renamed from: k */
    public RunnableC11297j m40398k(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit, C11315l c11315l) {
        RunnableC11297j runnableC11297j = new RunnableC11297j(C11361c.m40585q(interfaceC11204a), c11315l);
        c11315l.m40464a(runnableC11297j);
        runnableC11297j.m40402a(j2 <= 0 ? this.f42805l.submit(runnableC11297j) : this.f42805l.schedule(runnableC11297j, j2, timeUnit));
        return runnableC11297j;
    }

    /* renamed from: l */
    public RunnableC11297j m40399l(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit, C11378b c11378b) {
        RunnableC11297j runnableC11297j = new RunnableC11297j(C11361c.m40585q(interfaceC11204a), c11378b);
        c11378b.m40667a(runnableC11297j);
        runnableC11297j.m40402a(j2 <= 0 ? this.f42805l.submit(runnableC11297j) : this.f42805l.schedule(runnableC11297j, j2, timeUnit));
        return runnableC11297j;
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        this.f42806m = true;
        this.f42805l.shutdownNow();
        m40392f(this.f42805l);
    }
}
