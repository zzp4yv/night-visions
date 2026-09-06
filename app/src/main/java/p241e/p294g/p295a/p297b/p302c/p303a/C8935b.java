package p241e.p294g.p295a.p297b.p302c.p303a;

import androidx.recyclerview.widget.RecyclerView;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: RecyclerViewScrollEventOnSubscribe.java */
/* renamed from: e.g.a.b.c.a.b */
/* loaded from: classes2.dex */
final class C8935b implements C11186e.a<C8934a> {

    /* renamed from: f */
    final RecyclerView f34511f;

    /* compiled from: RecyclerViewScrollEventOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.b$a */
    class a extends RecyclerView.AbstractC0607t {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34512a;

        a(AbstractC11197j abstractC11197j) {
            this.f34512a = abstractC11197j;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            if (this.f34512a.isUnsubscribed()) {
                return;
            }
            this.f34512a.onNext(C8934a.m28563b(recyclerView, i2, i3));
        }
    }

    /* compiled from: RecyclerViewScrollEventOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.b$b */
    class b extends AbstractC11199a {

        /* renamed from: f */
        final /* synthetic */ RecyclerView.AbstractC0607t f34514f;

        b(RecyclerView.AbstractC0607t abstractC0607t) {
            this.f34514f = abstractC0607t;
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8935b.this.f34511f.removeOnScrollListener(this.f34514f);
        }
    }

    public C8935b(RecyclerView recyclerView) {
        this.f34511f = recyclerView;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super C8934a> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b(aVar));
        this.f34511f.addOnScrollListener(aVar);
    }
}
