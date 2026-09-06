package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.C9055b;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.EnumC9071d;

/* compiled from: SingleScheduler.java */
/* renamed from: h.a.z.g.l */
/* loaded from: classes2.dex */
public final class C9138l extends AbstractC9048r {

    /* renamed from: b */
    static final ThreadFactoryC9134h f35252b;

    /* renamed from: c */
    static final ScheduledExecutorService f35253c;

    /* renamed from: d */
    final ThreadFactory f35254d;

    /* renamed from: e */
    final AtomicReference<ScheduledExecutorService> f35255e;

    /* compiled from: SingleScheduler.java */
    /* renamed from: h.a.z.g.l$a */
    static final class a extends AbstractC9048r.b {

        /* renamed from: f */
        final ScheduledExecutorService f35256f;

        /* renamed from: g */
        final C9055b f35257g = new C9055b();

        /* renamed from: h */
        volatile boolean f35258h;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f35256f = scheduledExecutorService;
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: c */
        public InterfaceC9056c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f35258h) {
                return EnumC9071d.INSTANCE;
            }
            RunnableC9136j runnableC9136j = new RunnableC9136j(C9030a.m29149q(runnable), this.f35257g);
            this.f35257g.mo29239b(runnableC9136j);
            try {
                runnableC9136j.m29365a(j2 <= 0 ? this.f35256f.submit((Callable) runnableC9136j) : this.f35256f.schedule((Callable) runnableC9136j, j2, timeUnit));
                return runnableC9136j;
            } catch (RejectedExecutionException e2) {
                mo29115k();
                C9030a.m29147o(e2);
                return EnumC9071d.INSTANCE;
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f35258h) {
                return;
            }
            this.f35258h = true;
            this.f35257g.mo29115k();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35258h;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f35253c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f35252b = new ThreadFactoryC9134h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C9138l() {
        this(f35252b);
    }

    /* renamed from: d */
    static ScheduledExecutorService m29373d(ThreadFactory threadFactory) {
        return C9137k.m29366a(threadFactory);
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: a */
    public AbstractC9048r.b mo29220a() {
        return new a(this.f35255e.get());
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: c */
    public InterfaceC9056c mo29222c(Runnable runnable, long j2, TimeUnit timeUnit) {
        CallableC9135i callableC9135i = new CallableC9135i(C9030a.m29149q(runnable));
        try {
            callableC9135i.m29347a(j2 <= 0 ? this.f35255e.get().submit(callableC9135i) : this.f35255e.get().schedule(callableC9135i, j2, timeUnit));
            return callableC9135i;
        } catch (RejectedExecutionException e2) {
            C9030a.m29147o(e2);
            return EnumC9071d.INSTANCE;
        }
    }

    public C9138l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f35255e = atomicReference;
        this.f35254d = threadFactory;
        atomicReference.lazySet(m29373d(threadFactory));
    }
}
