package p241e.p294g.p295a.p297b.p300b.p301a;

import p024c.p085v.p086a.C1020c;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: SwipeRefreshLayoutRefreshOnSubscribe.java */
/* renamed from: e.g.a.b.b.a.d */
/* loaded from: classes2.dex */
final class C8933d implements C11186e.a<Void> {

    /* renamed from: f */
    final C1020c f34505f;

    /* compiled from: SwipeRefreshLayoutRefreshOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.d$a */
    class a implements C1020c.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34506a;

        a(AbstractC11197j abstractC11197j) {
            this.f34506a = abstractC11197j;
        }

        @Override // p024c.p085v.p086a.C1020c.j
        /* renamed from: a */
        public void mo6522a() {
            if (this.f34506a.isUnsubscribed()) {
                return;
            }
            this.f34506a.onNext(null);
        }
    }

    /* compiled from: SwipeRefreshLayoutRefreshOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.d$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8933d.this.f34505f.setOnRefreshListener(null);
        }
    }

    C8933d(C1020c c1020c) {
        this.f34505f = c1020c;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Void> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34505f.setOnRefreshListener(aVar);
    }
}
