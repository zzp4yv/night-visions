package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p461n.p463b.C11285a;
import p456rx.p461n.p465d.C11302a;
import p456rx.p471q.C11361c;

/* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
/* renamed from: rx.n.a.e0 */
/* loaded from: classes3.dex */
public final class C11226e0<T> implements C11186e.a<T> {

    /* renamed from: f */
    final C11186e<T> f42235f;

    /* renamed from: g */
    final long f42236g;

    /* renamed from: h */
    final TimeUnit f42237h;

    /* renamed from: i */
    final AbstractC11195h f42238i;

    /* renamed from: j */
    final C11186e<? extends T> f42239j;

    /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
    /* renamed from: rx.n.a.e0$a */
    static final class a<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42240f;

        /* renamed from: g */
        final C11285a f42241g;

        a(AbstractC11197j<? super T> abstractC11197j, C11285a c11285a) {
            this.f42240f = abstractC11197j;
            this.f42241g = c11285a;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42240f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42240f.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42240f.onNext(t);
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42241g.m40375c(interfaceC11194g);
        }
    }

    /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
    /* renamed from: rx.n.a.e0$b */
    static final class b<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42242f;

        /* renamed from: g */
        final long f42243g;

        /* renamed from: h */
        final TimeUnit f42244h;

        /* renamed from: i */
        final AbstractC11195h.a f42245i;

        /* renamed from: j */
        final C11186e<? extends T> f42246j;

        /* renamed from: k */
        final C11285a f42247k = new C11285a();

        /* renamed from: l */
        final AtomicLong f42248l = new AtomicLong();

        /* renamed from: m */
        final C11302a f42249m;

        /* renamed from: n */
        final C11302a f42250n;

        /* renamed from: o */
        long f42251o;

        /* compiled from: OnSubscribeTimeoutTimedWithFallback.java */
        /* renamed from: rx.n.a.e0$b$a */
        final class a implements InterfaceC11204a {

            /* renamed from: f */
            final long f42252f;

            a(long j2) {
                this.f42252f = j2;
            }

            @Override // p456rx.p460m.InterfaceC11204a
            public void call() {
                b.this.m40199c(this.f42252f);
            }
        }

        b(AbstractC11197j<? super T> abstractC11197j, long j2, TimeUnit timeUnit, AbstractC11195h.a aVar, C11186e<? extends T> c11186e) {
            this.f42242f = abstractC11197j;
            this.f42243g = j2;
            this.f42244h = timeUnit;
            this.f42245i = aVar;
            this.f42246j = c11186e;
            C11302a c11302a = new C11302a();
            this.f42249m = c11302a;
            this.f42250n = new C11302a(this);
            add(aVar);
            add(c11302a);
        }

        /* renamed from: c */
        void m40199c(long j2) {
            if (this.f42248l.compareAndSet(j2, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.f42246j == null) {
                    this.f42242f.onError(new TimeoutException());
                    return;
                }
                long j3 = this.f42251o;
                if (j3 != 0) {
                    this.f42247k.m40374b(j3);
                }
                a aVar = new a(this.f42242f, this.f42247k);
                if (this.f42250n.m40415b(aVar)) {
                    this.f42246j.m40058E0(aVar);
                }
            }
        }

        /* renamed from: d */
        void m40200d(long j2) {
            this.f42249m.m40415b(this.f42245i.mo40147d(new a(j2), this.f42243g, this.f42244h));
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42248l.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f42249m.unsubscribe();
                this.f42242f.onCompleted();
                this.f42245i.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42248l.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C11361c.m40578j(th);
                return;
            }
            this.f42249m.unsubscribe();
            this.f42242f.onError(th);
            this.f42245i.unsubscribe();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            long j2 = this.f42248l.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.f42248l.compareAndSet(j2, j3)) {
                    InterfaceC11198k interfaceC11198k = this.f42249m.get();
                    if (interfaceC11198k != null) {
                        interfaceC11198k.unsubscribe();
                    }
                    this.f42251o++;
                    this.f42242f.onNext(t);
                    m40200d(j3);
                }
            }
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42247k.m40375c(interfaceC11194g);
        }
    }

    public C11226e0(C11186e<T> c11186e, long j2, TimeUnit timeUnit, AbstractC11195h abstractC11195h, C11186e<? extends T> c11186e2) {
        this.f42235f = c11186e;
        this.f42236g = j2;
        this.f42237h = timeUnit;
        this.f42238i = abstractC11195h;
        this.f42239j = c11186e2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        b bVar = new b(abstractC11197j, this.f42236g, this.f42237h, this.f42238i.createWorker(), this.f42239j);
        abstractC11197j.add(bVar.f42250n);
        abstractC11197j.setProducer(bVar.f42247k);
        bVar.m40200d(0L);
        this.f42235f.m40058E0(bVar);
    }
}
