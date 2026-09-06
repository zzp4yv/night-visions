package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p471q.C11361c;
import p456rx.p474t.C11380d;

/* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
/* renamed from: rx.n.a.o1 */
/* loaded from: classes3.dex */
public final class C11257o1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Single<? extends T> f42447f;

    /* renamed from: g */
    final C11186e<?> f42448g;

    /* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
    /* renamed from: rx.n.a.o1$a */
    class a extends AbstractC11196i<T> {

        /* renamed from: g */
        final /* synthetic */ AbstractC11196i f42449g;

        a(AbstractC11196i abstractC11196i) {
            this.f42449g = abstractC11196i;
        }

        @Override // p456rx.AbstractC11196i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42449g.mo29130c(t);
        }

        @Override // p456rx.AbstractC11196i
        public void onError(Throwable th) {
            this.f42449g.onError(th);
        }
    }

    /* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
    /* renamed from: rx.n.a.o1$b */
    class b extends AbstractC11197j<Object> {

        /* renamed from: f */
        boolean f42451f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11196i f42452g;

        /* renamed from: h */
        final /* synthetic */ C11380d f42453h;

        b(AbstractC11196i abstractC11196i, C11380d c11380d) {
            this.f42452g = abstractC11196i;
            this.f42453h = c11380d;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42451f) {
                return;
            }
            this.f42451f = true;
            this.f42453h.m40673b(this.f42452g);
            C11257o1.this.f42447f.m39928t(this.f42452g);
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42451f) {
                C11361c.m40578j(th);
            } else {
                this.f42451f = true;
                this.f42452g.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public C11257o1(Single<? extends T> single, C11186e<?> c11186e) {
        this.f42447f = single;
        this.f42448g = c11186e;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i);
        C11380d c11380d = new C11380d();
        abstractC11196i.m40149b(c11380d);
        b bVar = new b(aVar, c11380d);
        c11380d.m40673b(bVar);
        this.f42448g.m40058E0(bVar);
    }
}
