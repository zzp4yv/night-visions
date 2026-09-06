package p456rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.p461n.p464c.C11290c;
import p456rx.p461n.p464c.C11291d;
import p456rx.p461n.p464c.C11293f;
import p456rx.p461n.p464c.C11301n;
import p456rx.p461n.p464c.InterfaceC11298k;
import p456rx.p471q.C11361c;
import p456rx.p471q.C11364f;
import p456rx.p471q.C11365g;

/* loaded from: classes.dex */
public final class Schedulers {

    /* renamed from: a */
    private static final AtomicReference<Schedulers> f43067a = new AtomicReference<>();

    /* renamed from: b */
    private final AbstractC11195h f43068b;

    /* renamed from: c */
    private final AbstractC11195h f43069c;

    /* renamed from: d */
    private final AbstractC11195h f43070d;

    private Schedulers() {
        C11365g m40613f = C11364f.m40607c().m40613f();
        AbstractC11195h m40622g = m40613f.m40622g();
        if (m40622g != null) {
            this.f43068b = m40622g;
        } else {
            this.f43068b = C11365g.m40615a();
        }
        AbstractC11195h m40623i = m40613f.m40623i();
        if (m40623i != null) {
            this.f43069c = m40623i;
        } else {
            this.f43069c = C11365g.m40617c();
        }
        AbstractC11195h m40624j = m40613f.m40624j();
        if (m40624j != null) {
            this.f43070d = m40624j;
        } else {
            this.f43070d = C11365g.m40619e();
        }
    }

    /* renamed from: a */
    private static Schedulers m40657a() {
        while (true) {
            AtomicReference<Schedulers> atomicReference = f43067a;
            Schedulers schedulers = atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (atomicReference.compareAndSet(null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.m40659b();
        }
    }

    public static AbstractC11195h computation() {
        return C11361c.m40574f(m40657a().f43068b);
    }

    public static AbstractC11195h from(Executor executor) {
        return new C11290c(executor);
    }

    public static AbstractC11195h immediate() {
        return C11293f.f42795a;
    }

    /* renamed from: io */
    public static AbstractC11195h m40658io() {
        return C11361c.m40579k(m40657a().f43069c);
    }

    public static AbstractC11195h newThread() {
        return C11361c.m40580l(m40657a().f43070d);
    }

    public static void reset() {
        Schedulers andSet = f43067a.getAndSet(null);
        if (andSet != null) {
            andSet.m40659b();
        }
    }

    public static void shutdown() {
        Schedulers m40657a = m40657a();
        m40657a.m40659b();
        synchronized (m40657a) {
            C11291d.f42790h.shutdown();
        }
    }

    public static void start() {
        Schedulers m40657a = m40657a();
        m40657a.m40660c();
        synchronized (m40657a) {
            C11291d.f42790h.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static AbstractC11195h trampoline() {
        return C11301n.f42848a;
    }

    /* renamed from: b */
    synchronized void m40659b() {
        Object obj = this.f43068b;
        if (obj instanceof InterfaceC11298k) {
            ((InterfaceC11298k) obj).shutdown();
        }
        Object obj2 = this.f43069c;
        if (obj2 instanceof InterfaceC11298k) {
            ((InterfaceC11298k) obj2).shutdown();
        }
        Object obj3 = this.f43070d;
        if (obj3 instanceof InterfaceC11298k) {
            ((InterfaceC11298k) obj3).shutdown();
        }
    }

    /* renamed from: c */
    synchronized void m40660c() {
        Object obj = this.f43068b;
        if (obj instanceof InterfaceC11298k) {
            ((InterfaceC11298k) obj).start();
        }
        Object obj2 = this.f43069c;
        if (obj2 instanceof InterfaceC11298k) {
            ((InterfaceC11298k) obj2).start();
        }
        Object obj3 = this.f43070d;
        if (obj3 instanceof InterfaceC11298k) {
            ((InterfaceC11298k) obj3).start();
        }
    }
}
