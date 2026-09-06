package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.Single;

/* compiled from: SingleToObservable.java */
/* renamed from: rx.n.a.t1 */
/* loaded from: classes3.dex */
public final class C11272t1<T> implements C11186e.a<T> {

    /* renamed from: f */
    final Single.InterfaceC11181j<T> f42615f;

    public C11272t1(Single.InterfaceC11181j<T> interfaceC11181j) {
        this.f42615f = interfaceC11181j;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        C11248l1 c11248l1 = new C11248l1(abstractC11197j);
        abstractC11197j.add(c11248l1);
        this.f42615f.call(c11248l1);
    }
}
