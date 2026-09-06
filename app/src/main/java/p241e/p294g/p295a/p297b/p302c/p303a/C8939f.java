package p241e.p294g.p295a.p297b.p302c.p303a;

import androidx.appcompat.widget.SearchView;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
/* renamed from: e.g.a.b.c.a.f */
/* loaded from: classes2.dex */
final class C8939f implements C11186e.a<C8940g> {

    /* renamed from: f */
    final SearchView f34516f;

    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.f$a */
    class a implements SearchView.InterfaceC0139l {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34517a;

        a(AbstractC11197j abstractC11197j) {
            this.f34517a = abstractC11197j;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0139l
        /* renamed from: a */
        public boolean mo817a(String str) {
            if (this.f34517a.isUnsubscribed()) {
                return false;
            }
            this.f34517a.onNext(C8940g.m28569b(C8939f.this.f34516f, str, false));
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0139l
        /* renamed from: b */
        public boolean mo818b(String str) {
            if (this.f34517a.isUnsubscribed()) {
                return false;
            }
            AbstractC11197j abstractC11197j = this.f34517a;
            SearchView searchView = C8939f.this.f34516f;
            abstractC11197j.onNext(C8940g.m28569b(searchView, searchView.getQuery(), true));
            return true;
        }
    }

    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.f$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8939f.this.f34516f.setOnQueryTextListener(null);
        }
    }

    C8939f(SearchView searchView) {
        this.f34516f = searchView;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super C8940g> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34516f.setOnQueryTextListener(aVar);
        SearchView searchView = this.f34516f;
        abstractC11197j.onNext(C8940g.m28569b(searchView, searchView.getQuery(), false));
    }
}
