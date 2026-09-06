package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.InterfaceC11194g;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p471q.C11361c;

/* compiled from: OnSubscribeMap.java */
/* renamed from: rx.n.a.w */
/* loaded from: classes3.dex */
public final class C11277w<T, R> implements C11186e.a<R> {

    /* renamed from: f */
    final C11186e<T> f42642f;

    /* renamed from: g */
    final InterfaceC11208e<? super T, ? extends R> f42643g;

    /* compiled from: OnSubscribeMap.java */
    /* renamed from: rx.n.a.w$a */
    static final class a<T, R> extends AbstractC11197j<T> {

        /* renamed from: f */
        final AbstractC11197j<? super R> f42644f;

        /* renamed from: g */
        final InterfaceC11208e<? super T, ? extends R> f42645g;

        /* renamed from: h */
        boolean f42646h;

        public a(AbstractC11197j<? super R> abstractC11197j, InterfaceC11208e<? super T, ? extends R> interfaceC11208e) {
            this.f42644f = abstractC11197j;
            this.f42645g = interfaceC11208e;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42646h) {
                return;
            }
            this.f42644f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42646h) {
                C11361c.m40578j(th);
            } else {
                this.f42646h = true;
                this.f42644f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            try {
                this.f42644f.onNext(this.f42645g.call(t));
            } catch (Throwable th) {
                C11192a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11197j
        public void setProducer(InterfaceC11194g interfaceC11194g) {
            this.f42644f.setProducer(interfaceC11194g);
        }
    }

    public C11277w(C11186e<T> c11186e, InterfaceC11208e<? super T, ? extends R> interfaceC11208e) {
        this.f42642f = c11186e;
        this.f42643g = interfaceC11208e;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super R> abstractC11197j) {
        a aVar = new a(abstractC11197j, this.f42643g);
        abstractC11197j.add(aVar);
        this.f42642f.m40089c1(aVar);
    }
}
