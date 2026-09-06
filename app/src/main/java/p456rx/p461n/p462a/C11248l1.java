package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.AbstractC11197j;
import p456rx.p461n.p463b.C11287c;

/* compiled from: SingleLiftObservableOperator.java */
/* renamed from: rx.n.a.l1 */
/* loaded from: classes3.dex */
final class C11248l1<T> extends AbstractC11196i<T> {

    /* renamed from: g */
    final AbstractC11197j<? super T> f42411g;

    C11248l1(AbstractC11197j<? super T> abstractC11197j) {
        this.f42411g = abstractC11197j;
    }

    @Override // p456rx.AbstractC11196i
    /* renamed from: c */
    public void mo29130c(T t) {
        this.f42411g.setProducer(new C11287c(this.f42411g, t));
    }

    @Override // p456rx.AbstractC11196i
    public void onError(Throwable th) {
        this.f42411g.onError(th);
    }
}
