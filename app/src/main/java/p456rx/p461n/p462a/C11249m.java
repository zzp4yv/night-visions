package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p470p.C11358f;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11380d;
import p456rx.p474t.C11381e;

/* compiled from: OnSubscribeDelaySubscriptionOther.java */
/* renamed from: rx.n.a.m */
/* loaded from: classes3.dex */
public final class C11249m<T, U> implements C11186e.a<T> {

    /* renamed from: f */
    final C11186e<? extends T> f42412f;

    /* renamed from: g */
    final C11186e<U> f42413g;

    /* compiled from: OnSubscribeDelaySubscriptionOther.java */
    /* renamed from: rx.n.a.m$a */
    class a extends AbstractC11197j<U> {

        /* renamed from: f */
        boolean f42414f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11197j f42415g;

        /* renamed from: h */
        final /* synthetic */ C11380d f42416h;

        a(AbstractC11197j abstractC11197j, C11380d c11380d) {
            this.f42415g = abstractC11197j;
            this.f42416h = c11380d;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42414f) {
                return;
            }
            this.f42414f = true;
            this.f42416h.m40673b(C11381e.m40676c());
            C11249m.this.f42412f.m40089c1(this.f42415g);
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42414f) {
                C11361c.m40578j(th);
            } else {
                this.f42414f = true;
                this.f42415g.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(U u) {
            onCompleted();
        }
    }

    public C11249m(C11186e<? extends T> c11186e, C11186e<U> c11186e2) {
        this.f42412f = c11186e;
        this.f42413g = c11186e2;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        C11380d c11380d = new C11380d();
        abstractC11197j.add(c11380d);
        a aVar = new a(C11358f.m40561c(abstractC11197j), c11380d);
        c11380d.m40673b(aVar);
        this.f42413g.m40089c1(aVar);
    }
}
