package p456rx.p461n.p464c;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11378b;
import p456rx.p474t.C11379c;
import p456rx.p474t.C11381e;

/* compiled from: ExecutorScheduler.java */
/* renamed from: rx.n.c.c */
/* loaded from: classes3.dex */
public final class C11290c extends AbstractC11195h {

    /* renamed from: a */
    final Executor f42776a;

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: rx.n.c.c$a */
    static final class a extends AbstractC11195h.a implements Runnable {

        /* renamed from: f */
        final Executor f42777f;

        /* renamed from: h */
        final ConcurrentLinkedQueue<RunnableC11297j> f42779h = new ConcurrentLinkedQueue<>();

        /* renamed from: i */
        final AtomicInteger f42780i = new AtomicInteger();

        /* renamed from: g */
        final C11378b f42778g = new C11378b();

        /* renamed from: j */
        final ScheduledExecutorService f42781j = C11291d.m40388a();

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: rx.n.c.c$a$a, reason: collision with other inner class name */
        class C11562a implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ C11379c f42782f;

            C11562a(C11379c c11379c) {
                this.f42782f = c11379c;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                a.this.f42778g.m40670d(this.f42782f);
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: rx.n.c.c$a$b */
        class b implements InterfaceC11204a {

            /* renamed from: f */
            final /* synthetic */ C11379c f42784f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC11204a f42785g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC11198k f42786h;

            b(C11379c c11379c, InterfaceC11204a interfaceC11204a, InterfaceC11198k interfaceC11198k) {
                this.f42784f = c11379c;
                this.f42785g = interfaceC11204a;
                this.f42786h = interfaceC11198k;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                if (this.f42784f.isUnsubscribed()) {
                    return;
                }
                InterfaceC11198k mo40146c = a.this.mo40146c(this.f42785g);
                this.f42784f.m40671a(mo40146c);
                if (mo40146c.getClass() == RunnableC11297j.class) {
                    ((RunnableC11297j) mo40146c).m40403b(this.f42786h);
                }
            }
        }

        public a(Executor executor) {
            this.f42777f = executor;
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            if (isUnsubscribed()) {
                return C11381e.m40676c();
            }
            RunnableC11297j runnableC11297j = new RunnableC11297j(C11361c.m40585q(interfaceC11204a), this.f42778g);
            this.f42778g.m40667a(runnableC11297j);
            this.f42779h.offer(runnableC11297j);
            if (this.f42780i.getAndIncrement() == 0) {
                try {
                    this.f42777f.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f42778g.m40670d(runnableC11297j);
                    this.f42780i.decrementAndGet();
                    C11361c.m40578j(e2);
                    throw e2;
                }
            }
            return runnableC11297j;
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            if (j2 <= 0) {
                return mo40146c(interfaceC11204a);
            }
            if (isUnsubscribed()) {
                return C11381e.m40676c();
            }
            InterfaceC11204a m40585q = C11361c.m40585q(interfaceC11204a);
            C11379c c11379c = new C11379c();
            C11379c c11379c2 = new C11379c();
            c11379c2.m40671a(c11379c);
            this.f42778g.m40667a(c11379c2);
            InterfaceC11198k m40674a = C11381e.m40674a(new C11562a(c11379c2));
            RunnableC11297j runnableC11297j = new RunnableC11297j(new b(c11379c2, m40585q, m40674a));
            c11379c.m40671a(runnableC11297j);
            try {
                runnableC11297j.m40402a(this.f42781j.schedule(runnableC11297j, j2, timeUnit));
                return m40674a;
            } catch (RejectedExecutionException e2) {
                C11361c.m40578j(e2);
                throw e2;
            }
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42778g.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f42778g.isUnsubscribed()) {
                RunnableC11297j poll = this.f42779h.poll();
                if (poll == null) {
                    return;
                }
                if (!poll.isUnsubscribed()) {
                    if (this.f42778g.isUnsubscribed()) {
                        this.f42779h.clear();
                        return;
                    }
                    poll.run();
                }
                if (this.f42780i.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f42779h.clear();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            this.f42778g.unsubscribe();
            this.f42779h.clear();
        }
    }

    public C11290c(Executor executor) {
        this.f42776a = executor;
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new a(this.f42776a);
    }
}
