package p456rx.p461n.p462a;

import p456rx.AbstractC11195h;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: OperatorSubscribeOn.java */
/* renamed from: rx.n.a.z0 */
/* loaded from: classes3.dex */
public final class C11284z0<T> implements C11186e.a<T> {

    /* renamed from: f */
    final AbstractC11195h f42715f;

    /* renamed from: g */
    final C11186e<T> f42716g;

    /* renamed from: h */
    final boolean f42717h;

    /* compiled from: OperatorSubscribeOn.java */
    /* renamed from: rx.n.a.z0$a */
    static final class a<T> extends AbstractC11197j<T> implements InterfaceC11204a {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42718f;

        /* renamed from: g */
        final boolean f42719g;

        /* renamed from: h */
        final AbstractC11195h.a f42720h;

        /* renamed from: i */
        C11186e<T> f42721i;

        /* renamed from: j */
        Thread f42722j;

        /* compiled from: OperatorSubscribeOn.java */
        /* renamed from: rx.n.a.z0$a$a, reason: collision with other inner class name */
        class C11558a implements InterfaceC11194g {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11194g f42723f;

            /* compiled from: OperatorSubscribeOn.java */
            /* renamed from: rx.n.a.z0$a$a$a, reason: collision with other inner class name */
            class C11559a implements InterfaceC11204a {

                /* renamed from: f */
                final /* synthetic */ long f42725f;

                C11559a(long j2) {
                    this.f42725f = j2;
                }

                @Override // p456rx.p460m.InterfaceC11204a
                public void call() {
                    C11558a.this.f42723f.request(this.f42725f);
                }
            }

            C11558a(InterfaceC11194g interfaceC11194g) {
                this.f42723f = interfaceC11194g;
            }

            @Override // p456rx.InterfaceC11194g
            public void request(long j2) {
                if (a.this.f42722j != Thread.currentThread()) {
                    a aVar = a.this;
                    if (aVar.f42719g) {
                        aVar.f42720h.mo40146c(new C11559a(j2));
                        return;
                    }
                }
                this.f42723f.request(j2);
            }
        }

        a(AbstractC11197j<? super T> abstractC11197j, boolean z, AbstractC11195h.a aVar, C11186e<T> c11186e) {
            this.f42718f = abstractC11197j;
            this.f42719g = z;
            this.f42720h = aVar;
            this.f42721i = c11186e;
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
            C11186e<T> c11186e = this.f42721i;
            this.f42721i = null;
            this.f42722j = Thread.currentThread();
            c11186e.m40089c1(this);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            try {
                this.f42718f.onCompleted();
            } finally {
                this.f42720h.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            try {
                this.f42718f.onError(th);
            } finally {
                this.f42720h.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42718f.onNext(t);
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42718f.setProducer(new C11558a(interfaceC11194g));
        }
    }

    public C11284z0(C11186e<T> c11186e, AbstractC11195h abstractC11195h, boolean z) {
        this.f42715f = abstractC11195h;
        this.f42716g = c11186e;
        this.f42717h = z;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        AbstractC11195h.a createWorker = this.f42715f.createWorker();
        a aVar = new a(abstractC11197j, this.f42717h, createWorker, this.f42716g);
        abstractC11197j.add(aVar);
        abstractC11197j.add(createWorker);
        createWorker.mo40146c(aVar);
    }
}
