package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p326b0.C9032a;
import p323h.p324a.p327x.C9055b;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p329z.p330a.C9073f;
import p323h.p324a.p329z.p330a.EnumC9070c;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p330a.InterfaceC9069b;
import p323h.p324a.p329z.p340f.C9124a;

/* compiled from: ExecutorScheduler.java */
/* renamed from: h.a.z.g.d */
/* loaded from: classes2.dex */
public final class C9130d extends AbstractC9048r {

    /* renamed from: b */
    static final AbstractC9048r f35197b = C9032a.m29164c();

    /* renamed from: c */
    final boolean f35198c;

    /* renamed from: d */
    final Executor f35199d;

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: h.a.z.g.d$a */
    final class a implements Runnable {

        /* renamed from: f */
        private final b f35200f;

        a(b bVar) {
            this.f35200f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f35200f;
            bVar.f35203g.m29261a(C9130d.this.mo29221b(bVar));
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: h.a.z.g.d$b */
    static final class b extends AtomicReference<Runnable> implements Runnable, InterfaceC9056c {

        /* renamed from: f */
        final C9073f f35202f;

        /* renamed from: g */
        final C9073f f35203g;

        b(Runnable runnable) {
            super(runnable);
            this.f35202f = new C9073f();
            this.f35203g = new C9073f();
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            if (getAndSet(null) != null) {
                this.f35202f.mo29115k();
                this.f35203g.mo29115k();
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    C9073f c9073f = this.f35202f;
                    EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
                    c9073f.lazySet(enumC9070c);
                    this.f35203g.lazySet(enumC9070c);
                } catch (Throwable th) {
                    lazySet(null);
                    this.f35202f.lazySet(EnumC9070c.DISPOSED);
                    this.f35203g.lazySet(EnumC9070c.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: h.a.z.g.d$c */
    public static final class c extends AbstractC9048r.b implements Runnable {

        /* renamed from: f */
        final boolean f35204f;

        /* renamed from: g */
        final Executor f35205g;

        /* renamed from: i */
        volatile boolean f35207i;

        /* renamed from: j */
        final AtomicInteger f35208j = new AtomicInteger();

        /* renamed from: k */
        final C9055b f35209k = new C9055b();

        /* renamed from: h */
        final C9124a<Runnable> f35206h = new C9124a<>();

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: h.a.z.g.d$c$a */
        static final class a extends AtomicBoolean implements Runnable, InterfaceC9056c {

            /* renamed from: f */
            final Runnable f35210f;

            a(Runnable runnable) {
                this.f35210f = runnable;
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: k */
            public void mo29115k() {
                lazySet(true);
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: q */
            public boolean mo29116q() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f35210f.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: h.a.z.g.d$c$b */
        static final class b extends AtomicInteger implements Runnable, InterfaceC9056c {

            /* renamed from: f */
            final Runnable f35211f;

            /* renamed from: g */
            final InterfaceC9069b f35212g;

            /* renamed from: h */
            volatile Thread f35213h;

            b(Runnable runnable, InterfaceC9069b interfaceC9069b) {
                this.f35211f = runnable;
                this.f35212g = interfaceC9069b;
            }

            /* renamed from: a */
            void m29352a() {
                InterfaceC9069b interfaceC9069b = this.f35212g;
                if (interfaceC9069b != null) {
                    interfaceC9069b.mo29240c(this);
                }
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: k */
            public void mo29115k() {
                while (true) {
                    int i2 = get();
                    if (i2 >= 2) {
                        return;
                    }
                    if (i2 == 0) {
                        if (compareAndSet(0, 4)) {
                            m29352a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f35213h;
                        if (thread != null) {
                            thread.interrupt();
                            this.f35213h = null;
                        }
                        set(4);
                        m29352a();
                        return;
                    }
                }
            }

            @Override // p323h.p324a.p327x.InterfaceC9056c
            /* renamed from: q */
            public boolean mo29116q() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f35213h = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f35213h = null;
                        return;
                    }
                    try {
                        this.f35211f.run();
                        this.f35213h = null;
                        if (compareAndSet(1, 2)) {
                            m29352a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        this.f35213h = null;
                        if (compareAndSet(1, 2)) {
                            m29352a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: h.a.z.g.d$c$c, reason: collision with other inner class name */
        final class RunnableC11484c implements Runnable {

            /* renamed from: f */
            private final C9073f f35214f;

            /* renamed from: g */
            private final Runnable f35215g;

            RunnableC11484c(C9073f c9073f, Runnable runnable) {
                this.f35214f = c9073f;
                this.f35215g = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35214f.m29261a(c.this.mo29224b(this.f35215g));
            }
        }

        public c(Executor executor, boolean z) {
            this.f35205g = executor;
            this.f35204f = z;
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: b */
        public InterfaceC9056c mo29224b(Runnable runnable) {
            InterfaceC9056c aVar;
            if (this.f35207i) {
                return EnumC9071d.INSTANCE;
            }
            Runnable m29149q = C9030a.m29149q(runnable);
            if (this.f35204f) {
                aVar = new b(m29149q, this.f35209k);
                this.f35209k.mo29239b(aVar);
            } else {
                aVar = new a(m29149q);
            }
            this.f35206h.offer(aVar);
            if (this.f35208j.getAndIncrement() == 0) {
                try {
                    this.f35205g.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f35207i = true;
                    this.f35206h.clear();
                    C9030a.m29147o(e2);
                    return EnumC9071d.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // p323h.p324a.AbstractC9048r.b
        /* renamed from: c */
        public InterfaceC9056c mo29225c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (j2 <= 0) {
                return mo29224b(runnable);
            }
            if (this.f35207i) {
                return EnumC9071d.INSTANCE;
            }
            C9073f c9073f = new C9073f();
            C9073f c9073f2 = new C9073f(c9073f);
            RunnableC9136j runnableC9136j = new RunnableC9136j(new RunnableC11484c(c9073f2, C9030a.m29149q(runnable)), this.f35209k);
            this.f35209k.mo29239b(runnableC9136j);
            Executor executor = this.f35205g;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    runnableC9136j.m29365a(((ScheduledExecutorService) executor).schedule((Callable) runnableC9136j, j2, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.f35207i = true;
                    C9030a.m29147o(e2);
                    return EnumC9071d.INSTANCE;
                }
            } else {
                runnableC9136j.m29365a(new FutureC9129c(C9130d.f35197b.mo29222c(runnableC9136j, j2, timeUnit)));
            }
            c9073f.m29261a(runnableC9136j);
            return c9073f2;
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            if (this.f35207i) {
                return;
            }
            this.f35207i = true;
            this.f35209k.mo29115k();
            if (this.f35208j.getAndIncrement() == 0) {
                this.f35206h.clear();
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35207i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9124a<Runnable> c9124a = this.f35206h;
            int i2 = 1;
            while (!this.f35207i) {
                do {
                    Runnable poll = c9124a.poll();
                    if (poll != null) {
                        poll.run();
                    } else if (this.f35207i) {
                        c9124a.clear();
                        return;
                    } else {
                        i2 = this.f35208j.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } while (!this.f35207i);
                c9124a.clear();
                return;
            }
            c9124a.clear();
        }
    }

    public C9130d(Executor executor, boolean z) {
        this.f35199d = executor;
        this.f35198c = z;
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: a */
    public AbstractC9048r.b mo29220a() {
        return new c(this.f35199d, this.f35198c);
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: b */
    public InterfaceC9056c mo29221b(Runnable runnable) {
        Runnable m29149q = C9030a.m29149q(runnable);
        try {
            if (this.f35199d instanceof ExecutorService) {
                CallableC9135i callableC9135i = new CallableC9135i(m29149q);
                callableC9135i.m29347a(((ExecutorService) this.f35199d).submit(callableC9135i));
                return callableC9135i;
            }
            if (this.f35198c) {
                c.b bVar = new c.b(m29149q, null);
                this.f35199d.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(m29149q);
            this.f35199d.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e2) {
            C9030a.m29147o(e2);
            return EnumC9071d.INSTANCE;
        }
    }

    @Override // p323h.p324a.AbstractC9048r
    /* renamed from: c */
    public InterfaceC9056c mo29222c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Runnable m29149q = C9030a.m29149q(runnable);
        if (!(this.f35199d instanceof ScheduledExecutorService)) {
            b bVar = new b(m29149q);
            bVar.f35202f.m29261a(f35197b.mo29222c(new a(bVar), j2, timeUnit));
            return bVar;
        }
        try {
            CallableC9135i callableC9135i = new CallableC9135i(m29149q);
            callableC9135i.m29347a(((ScheduledExecutorService) this.f35199d).schedule(callableC9135i, j2, timeUnit));
            return callableC9135i;
        } catch (RejectedExecutionException e2) {
            C9030a.m29147o(e2);
            return EnumC9071d.INSTANCE;
        }
    }
}
