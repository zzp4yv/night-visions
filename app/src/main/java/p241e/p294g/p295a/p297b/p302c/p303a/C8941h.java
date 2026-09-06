package p241e.p294g.p295a.p297b.p302c.p303a;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: ToolbarItemClickOnSubscribe.java */
/* renamed from: e.g.a.b.c.a.h */
/* loaded from: classes2.dex */
final class C8941h implements C11186e.a<MenuItem> {

    /* renamed from: f */
    final Toolbar f34522f;

    /* compiled from: ToolbarItemClickOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.h$a */
    class a implements Toolbar.InterfaceC0150f {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34523a;

        a(AbstractC11197j abstractC11197j) {
            this.f34523a = abstractC11197j;
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0150f
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f34523a.isUnsubscribed()) {
                return true;
            }
            this.f34523a.onNext(menuItem);
            return true;
        }
    }

    /* compiled from: ToolbarItemClickOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.h$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8941h.this.f34522f.setOnMenuItemClickListener(null);
        }
    }

    C8941h(Toolbar toolbar) {
        this.f34522f = toolbar;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super MenuItem> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34522f.setOnMenuItemClickListener(aVar);
    }
}
