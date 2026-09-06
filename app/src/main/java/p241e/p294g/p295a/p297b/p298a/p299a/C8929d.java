package p241e.p294g.p295a.p297b.p298a.p299a;

import com.google.android.material.snackbar.Snackbar;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: SnackbarDismissesOnSubscribe.java */
/* renamed from: e.g.a.b.a.a.d */
/* loaded from: classes2.dex */
final class C8929d implements C11186e.a<Integer> {

    /* renamed from: f */
    final Snackbar f34497f;

    /* compiled from: SnackbarDismissesOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.d$a */
    class a extends Snackbar.C8025b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11197j f34498a;

        a(AbstractC11197j abstractC11197j) {
            this.f34498a = abstractC11197j;
        }

        @Override // com.google.android.material.snackbar.Snackbar.C8025b
        public void onDismissed(Snackbar snackbar, int i2) {
            if (this.f34498a.isUnsubscribed()) {
                return;
            }
            this.f34498a.onNext(Integer.valueOf(i2));
        }
    }

    /* compiled from: SnackbarDismissesOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.d$b */
    class b extends AbstractC11199a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8929d.this.f34497f.m24767d0(null);
        }
    }

    C8929d(Snackbar snackbar) {
        this.f34497f = snackbar;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super Integer> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b());
        this.f34497f.m24767d0(aVar);
    }
}
