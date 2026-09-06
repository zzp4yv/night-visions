package p241e.p294g.p295a.p304c;

import android.view.View;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: ViewClickOnSubscribe.java */
/* renamed from: e.g.a.c.b */
/* loaded from: classes2.dex */
final class C8943b implements C11186e.a<Void> {

    /* renamed from: f */
    final View f34526f;

    /* compiled from: ViewClickOnSubscribe.java */
    /* renamed from: e.g.a.c.b$a */
    class a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f34527f;

        a(AbstractC11197j abstractC11197j) {
            this.f34527f = abstractC11197j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f34527f.isUnsubscribed()) {
                return;
            }
            this.f34527f.onNext(null);
        }
    }

    /* compiled from: ViewClickOnSubscribe.java */
    /* renamed from: e.g.a.c.b$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8943b.this.f34526f.setOnClickListener(null);
        }
    }

    C8943b(View view) {
        this.f34526f = view;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Void> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34526f.setOnClickListener(aVar);
    }
}
