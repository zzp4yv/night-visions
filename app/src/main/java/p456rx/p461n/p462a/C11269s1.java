package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p471q.C11361c;

/* compiled from: SingleTimeout.java */
/* renamed from: rx.n.a.s1 */
/* loaded from: classes3.dex */
public final class C11269s1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Single.InterfaceC11181j<T> f42595f;

    /* renamed from: g */
    final long f42596g;

    /* renamed from: h */
    final TimeUnit f42597h;

    /* renamed from: i */
    final AbstractC11195h f42598i;

    /* renamed from: j */
    final Single.InterfaceC11181j<? extends T> f42599j;

    /* compiled from: SingleTimeout.java */
    /* renamed from: rx.n.a.s1$a */
    static final class a<T> extends AbstractC11196i<T> implements InterfaceC11204a {

        /* renamed from: g */
        final AbstractC11196i<? super T> f42600g;

        /* renamed from: h */
        final AtomicBoolean f42601h = new AtomicBoolean();

        /* renamed from: i */
        final Single.InterfaceC11181j<? extends T> f42602i;

        /* compiled from: SingleTimeout.java */
        /* renamed from: rx.n.a.s1$a$a, reason: collision with other inner class name */
        static final class C11556a<T> extends AbstractC11196i<T> {

            /* renamed from: g */
            final AbstractC11196i<? super T> f42603g;

            C11556a(AbstractC11196i<? super T> abstractC11196i) {
                this.f42603g = abstractC11196i;
            }

            @Override // p456rx.AbstractC11196i
            /* renamed from: c */
            public void mo29130c(T t) {
                this.f42603g.mo29130c(t);
            }

            @Override // p456rx.AbstractC11196i
            public void onError(Throwable th) {
                this.f42603g.onError(th);
            }
        }

        a(AbstractC11196i<? super T> abstractC11196i, Single.InterfaceC11181j<? extends T> interfaceC11181j) {
            this.f42600g = abstractC11196i;
            this.f42602i = interfaceC11181j;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            if (this.f42601h.compareAndSet(false, true)) {
                try {
                    this.f42600g.mo29130c(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            if (this.f42601h.compareAndSet(false, true)) {
                try {
                    Single.InterfaceC11181j<? extends T> interfaceC11181j = this.f42602i;
                    if (interfaceC11181j == null) {
                        this.f42600g.onError(new TimeoutException());
                    } else {
                        C11556a c11556a = new C11556a(this.f42600g);
                        this.f42600g.m40149b(c11556a);
                        interfaceC11181j.call(c11556a);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            if (!this.f42601h.compareAndSet(false, true)) {
                C11361c.m40578j(th);
                return;
            }
            try {
                this.f42600g.onError(th);
            } finally {
                unsubscribe();
            }
        }
    }

    public C11269s1(Single.InterfaceC11181j<T> interfaceC11181j, long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h, Single.InterfaceC11181j<? extends T> interfaceC11181j2) {
        this.f42595f = interfaceC11181j;
        this.f42596g = j2;
        this.f42597h = timeUnit;
        this.f42598i = abstractC11195h;
        this.f42599j = interfaceC11181j2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i, this.f42599j);
        AbstractC11195h.a createWorker = this.f42598i.createWorker();
        aVar.m40149b(createWorker);
        abstractC11196i.m40149b(aVar);
        createWorker.mo40147d(aVar, this.f42596g, this.f42597h);
        this.f42595f.call(aVar);
    }
}
