package p241e.p294g.p295a.p297b.p298a.p299a;

import com.google.android.material.appbar.AppBarLayout;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
/* renamed from: e.g.a.b.a.a.a */
/* loaded from: classes2.dex */
final class C8926a implements C11186e.a<Integer> {

    /* renamed from: f */
    final AppBarLayout f34492f;

    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.a$a */
    class a implements AppBarLayout.InterfaceC7895e {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34493a;

        a(AbstractC11197j abstractC11197j) {
            this.f34493a = abstractC11197j;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7893c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
            if (this.f34493a.isUnsubscribed()) {
                return;
            }
            this.f34493a.onNext(Integer.valueOf(i2));
        }
    }

    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.a$b */
    class b extends AbstractC11199a {

        /* renamed from: f */
        final /* synthetic */ AppBarLayout.InterfaceC7895e f34495f;

        b(AppBarLayout.InterfaceC7895e interfaceC7895e) {
            this.f34495f = interfaceC7895e;
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8926a.this.f34492f.m23718p(this.f34495f);
        }
    }

    C8926a(AppBarLayout appBarLayout) {
        this.f34492f = appBarLayout;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Integer> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b(aVar));
        this.f34492f.m23708b(aVar);
    }
}
