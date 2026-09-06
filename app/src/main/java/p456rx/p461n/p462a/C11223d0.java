package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;

/* compiled from: OnSubscribeThrow.java */
/* renamed from: rx.n.a.d0 */
/* loaded from: classes3.dex */
public final class C11223d0<T> implements C11186e.a<T> {

    /* renamed from: f */
    private final Throwable f42228f;

    public C11223d0(Throwable th) {
        this.f42228f = th;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        abstractC11197j.onError(this.f42228f);
    }
}
