package p241e.p294g.p295a.p297b.p300b.p301a;

import androidx.core.widget.NestedScrollView;
import p241e.p294g.p295a.p304c.C8947f;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
/* renamed from: e.g.a.b.b.a.a */
/* loaded from: classes2.dex */
final class C8930a implements C11186e.a<C8947f> {

    /* renamed from: f */
    final NestedScrollView f34501f;

    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.a$a */
    class a implements NestedScrollView.InterfaceC0319b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34502a;

        a(AbstractC11197j abstractC11197j) {
            this.f34502a = abstractC11197j;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0319b
        /* renamed from: a */
        public void mo211a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            if (this.f34502a.isUnsubscribed()) {
                return;
            }
            this.f34502a.onNext(C8947f.m28580b(C8930a.this.f34501f, i2, i3, i4, i5));
        }
    }

    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.a$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8930a.this.f34501f.setOnScrollChangeListener((NestedScrollView.InterfaceC0319b) null);
        }
    }

    C8930a(NestedScrollView nestedScrollView) {
        this.f34501f = nestedScrollView;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super C8947f> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34501f.setOnScrollChangeListener(aVar);
    }
}
