package p456rx.p461n.p464c;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p466e.ThreadFactoryC11312i;
import p456rx.p474t.C11378b;
import p456rx.p474t.C11381e;

/* compiled from: CachedThreadScheduler.java */
/* renamed from: rx.n.c.a */
/* loaded from: classes3.dex */
public final class C11288a extends AbstractC11195h implements InterfaceC11298k {

    /* renamed from: f */
    private static final long f42738f;

    /* renamed from: g */
    private static final TimeUnit f42739g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final c f42740h;

    /* renamed from: i */
    static final a f42741i;

    /* renamed from: j */
    final ThreadFactory f42742j;

    /* renamed from: k */
    final AtomicReference<a> f42743k = new AtomicReference<>(f42741i);

    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$a */
    static final class a {

        /* renamed from: a */
        private final ThreadFactory f42744a;

        /* renamed from: b */
        private final long f42745b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<c> f42746c;

        /* renamed from: d */
        private final C11378b f42747d;

        /* renamed from: e */
        private final ScheduledExecutorService f42748e;

        /* renamed from: f */
        private final Future<?> f42749f;

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$a$a, reason: collision with other inner class name */
        class ThreadFactoryC11560a implements ThreadFactory {

            /* renamed from: f */
            final /* synthetic */ ThreadFactory f42750f;

            ThreadFactoryC11560a(ThreadFactory threadFactory) {
                this.f42750f = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f42750f.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$a$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.m40378a();
            }
        }

        a(ThreadFactory threadFactory, long j2, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.f42744a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f42745b = nanos;
            this.f42746c = new ConcurrentLinkedQueue<>();
            this.f42747d = new C11378b();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC11560a(threadFactory));
                C11295h.m40396m(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f42748e = scheduledExecutorService;
            this.f42749f = scheduledFuture;
        }

        /* renamed from: a */
        void m40378a() {
            if (this.f42746c.isEmpty()) {
                return;
            }
            long m40380c = m40380c();
            Iterator<c> it = this.f42746c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.m40383n() > m40380c) {
                    return;
                }
                if (this.f42746c.remove(next)) {
                    this.f42747d.m40670d(next);
                }
            }
        }

        /* renamed from: b */
        c m40379b() {
            if (this.f42747d.isUnsubscribed()) {
                return C11288a.f42740h;
            }
            while (!this.f42746c.isEmpty()) {
                c poll = this.f42746c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f42744a);
            this.f42747d.m40667a(cVar);
            return cVar;
        }

        /* renamed from: c */
        long m40380c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m40381d(c cVar) {
            cVar.m40384o(m40380c() + this.f42745b);
            this.f42746c.offer(cVar);
        }

        /* renamed from: e */
        void m40382e() {
            try {
                Future<?> future = this.f42749f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f42748e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f42747d.unsubscribe();
            }
        }
    }

    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$b */
    static final class b extends AbstractC11195h.a implements InterfaceC11204a {

        /* renamed from: g */
        private final a f42754g;

        /* renamed from: h */
        private final c f42755h;

        /* renamed from: f */
        private final C11378b f42753f = new C11378b();

        /* renamed from: i */
        final AtomicBoolean f42756i = new AtomicBoolean();

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$b$a */
        class a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11204a f42757f;

            a(InterfaceC11204a interfaceC11204a) {
                this.f42757f = interfaceC11204a;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.f42757f.call();
            }
        }

        b(a aVar) {
            this.f42754g = aVar;
            this.f42755h = aVar.m40379b();
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            return mo40147d(interfaceC11204a, 0L, null);
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            this.f42754g.m40381d(this.f42755h);
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            if (this.f42753f.isUnsubscribed()) {
                return C11381e.m40676c();
            }
            RunnableC11297j m40397j = this.f42755h.m40397j(new a(interfaceC11204a), j2, timeUnit);
            this.f42753f.m40667a(m40397j);
            m40397j.m40404c(this.f42753f);
            return m40397j;
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42753f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            if (this.f42756i.compareAndSet(false, true)) {
                this.f42755h.mo40146c(this);
            }
            this.f42753f.unsubscribe();
        }
    }

    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$c */
    static final class c extends C11295h {

        /* renamed from: n */
        private long f42759n;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f42759n = 0L;
        }

        /* renamed from: n */
        public long m40383n() {
            return this.f42759n;
        }

        /* renamed from: o */
        public void m40384o(long j2) {
            this.f42759n = j2;
        }
    }

    static {
        c cVar = new c(ThreadFactoryC11312i.f42888f);
        f42740h = cVar;
        cVar.unsubscribe();
        a aVar = new a(null, 0L, null);
        f42741i = aVar;
        aVar.m40382e();
        f42738f = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public C11288a(ThreadFactory threadFactory) {
        this.f42742j = threadFactory;
        start();
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new b(this.f42743k.get());
    }

    @Override // p456rx.p461n.p464c.InterfaceC11298k
    public void shutdown() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f42743k.get();
            aVar2 = f42741i;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f42743k.compareAndSet(aVar, aVar2));
        aVar.m40382e();
    }

    @Override // p456rx.p461n.p464c.InterfaceC11298k
    public void start() {
        a aVar = new a(this.f42742j, f42738f, f42739g);
        if (this.f42743k.compareAndSet(f42741i, aVar)) {
            return;
        }
        aVar.m40382e();
    }
}
