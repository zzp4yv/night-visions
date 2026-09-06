package p241e.p294g.p295a.p304c;

import android.view.View;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;
import p456rx.p460m.InterfaceCallableC11207d;

/* compiled from: ViewLongClickOnSubscribe.java */
/* renamed from: e.g.a.c.e */
/* loaded from: classes2.dex */
final class C8946e implements C11186e.a<Void> {

    /* renamed from: f */
    final View f34535f;

    /* renamed from: g */
    final InterfaceCallableC11207d<Boolean> f34536g;

    /* compiled from: ViewLongClickOnSubscribe.java */
    /* renamed from: e.g.a.c.e$a */
    class a implements View.OnLongClickListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f34537f;

        a(AbstractC11197j abstractC11197j) {
            this.f34537f = abstractC11197j;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!C8946e.this.f34536g.call().booleanValue()) {
                return false;
            }
            if (this.f34537f.isUnsubscribed()) {
                return true;
            }
            this.f34537f.onNext(null);
            return true;
        }
    }

    /* compiled from: ViewLongClickOnSubscribe.java */
    /* renamed from: e.g.a.c.e$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8946e.this.f34535f.setOnLongClickListener(null);
        }
    }

    C8946e(View view, InterfaceCallableC11207d<Boolean> interfaceCallableC11207d) {
        this.f34535f = view;
        this.f34536g = interfaceCallableC11207d;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Void> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34535f.setOnLongClickListener(aVar);
    }
}
