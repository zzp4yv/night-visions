package p456rx.p461n.p462a;

import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: SingleDoOnSubscribe.java */
/* renamed from: rx.n.a.i1 */
/* loaded from: classes3.dex */
public final class C11239i1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Single.InterfaceC11181j<T> f42328f;

    /* renamed from: g */
    final InterfaceC11204a f42329g;

    public C11239i1(Single.InterfaceC11181j<T> interfaceC11181j, InterfaceC11204a interfaceC11204a) {
        this.f42328f = interfaceC11181j;
        this.f42329g = interfaceC11204a;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        try {
            this.f42329g.call();
            this.f42328f.call(abstractC11196i);
        } catch (Throwable th) {
            C11192a.m40140e(th);
            abstractC11196i.onError(th);
        }
    }
}
