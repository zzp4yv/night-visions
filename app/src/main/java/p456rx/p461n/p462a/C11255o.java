package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p471q.C11361c;

/* compiled from: OnSubscribeFilter.java */
/* renamed from: rx.n.a.o */
/* loaded from: classes3.dex */
public final class C11255o<T> implements C11186e.a<T> {

    /* renamed from: f */
    final C11186e<T> f42441f;

    /* renamed from: g */
    final InterfaceC11208e<? super T, Boolean> f42442g;

    /* compiled from: OnSubscribeFilter.java */
    /* renamed from: rx.n.a.o$a */
    static final class a<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super T> f42443f;

        /* renamed from: g */
        final InterfaceC11208e<? super T, Boolean> f42444g;

        /* renamed from: h */
        boolean f42445h;

        public a(AbstractC11197j<? super T> abstractC11197j, InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
            this.f42443f = abstractC11197j;
            this.f42444g = interfaceC11208e;
            request(0L);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42445h) {
                return;
            }
            this.f42443f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42445h) {
                C11361c.m40578j(th);
            } else {
                this.f42445h = true;
                this.f42443f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                if (this.f42444g.call(t).booleanValue()) {
                    this.f42443f.onNext(t);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                C11192a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            super.setProducer(interfaceC11194g);
            this.f42443f.setProducer(interfaceC11194g);
        }
    }

    public C11255o(C11186e<T> c11186e, InterfaceC11208e<? super T, Boolean> interfaceC11208e) {
        this.f42441f = c11186e;
        this.f42442g = interfaceC11208e;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42442g);
        abstractC11197j.add(aVar);
        this.f42441f.m40089c1(aVar);
    }
}
