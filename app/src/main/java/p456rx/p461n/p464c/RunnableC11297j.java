package p456rx.p461n.p464c;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.InterfaceC11198k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p466e.C11315l;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11378b;

/* compiled from: ScheduledAction.java */
/* renamed from: rx.n.c.j */
/* loaded from: classes3.dex */
public final class RunnableC11297j extends AtomicReference<Thread> implements Runnable, InterfaceC11198k {

    /* renamed from: f */
    final C11315l f42818f;

    /* renamed from: g */
    final InterfaceC11204a f42819g;

    /* compiled from: ScheduledAction.java */
    /* renamed from: rx.n.c.j$a */
    final class a implements InterfaceC11198k {

        /* renamed from: f */
        private final Future<?> f42820f;

        a(Future<?> future) {
            this.f42820f = future;
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42820f.isCancelled();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            if (RunnableC11297j.this.get() != Thread.currentThread()) {
                this.f42820f.cancel(true);
            } else {
                this.f42820f.cancel(false);
            }
        }
    }

    /* compiled from: ScheduledAction.java */
    /* renamed from: rx.n.c.j$b */
    static final class b extends AtomicBoolean implements InterfaceC11198k {

        /* renamed from: f */
        final RunnableC11297j f42822f;

        /* renamed from: g */
        final C11315l f42823g;

        public b(RunnableC11297j runnableC11297j, C11315l c11315l) {
            this.f42822f = runnableC11297j;
            this.f42823g = c11315l;
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42822f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f42823g.m40465b(this.f42822f);
            }
        }
    }

    /* compiled from: ScheduledAction.java */
    /* renamed from: rx.n.c.j$c */
    static final class c extends AtomicBoolean implements InterfaceC11198k {

        /* renamed from: f */
        final RunnableC11297j f42824f;

        /* renamed from: g */
        final C11378b f42825g;

        public c(RunnableC11297j runnableC11297j, C11378b c11378b) {
            this.f42824f = runnableC11297j;
            this.f42825g = c11378b;
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42824f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f42825g.m40670d(this.f42824f);
            }
        }
    }

    public RunnableC11297j(InterfaceC11204a interfaceC11204a) {
        this.f42819g = interfaceC11204a;
        this.f42818f = new C11315l();
    }

    /* renamed from: a */
    public void m40402a(Future<?> future) {
        this.f42818f.m40464a(new a(future));
    }

    /* renamed from: b */
    public void m40403b(InterfaceC11198k interfaceC11198k) {
        this.f42818f.m40464a(interfaceC11198k);
    }

    /* renamed from: c */
    public void m40404c(C11378b c11378b) {
        this.f42818f.m40464a(new c(this, c11378b));
    }

    /* renamed from: d */
    void m40405d(Throwable th) {
        C11361c.m40578j(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f42818f.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.f42819g.call();
            } finally {
                unsubscribe();
            }
        } catch (OnErrorNotImplementedException e2) {
            m40405d(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e2));
        } catch (Throwable th) {
            m40405d(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
        }
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        if (this.f42818f.isUnsubscribed()) {
            return;
        }
        this.f42818f.unsubscribe();
    }

    public RunnableC11297j(InterfaceC11204a interfaceC11204a, C11378b c11378b) {
        this.f42819g = interfaceC11204a;
        this.f42818f = new C11315l(new c(this, c11378b));
    }

    public RunnableC11297j(InterfaceC11204a interfaceC11204a, C11315l c11315l) {
        this.f42819g = interfaceC11204a;
        this.f42818f = new C11315l(new b(this, c11315l));
    }
}
