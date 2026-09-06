package p456rx.p461n.p462a;

import java.util.concurrent.Callable;
import p456rx.AbstractC11196i;
import p456rx.Single;
import p456rx.exceptions.C11192a;

/* compiled from: SingleFromCallable.java */
/* renamed from: rx.n.a.j1 */
/* loaded from: classes3.dex */
public final class C11242j1<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    final Callable<? extends T> f42356f;

    public C11242j1(Callable<? extends T> callable) {
        this.f42356f = callable;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        try {
            abstractC11196i.mo29130c(this.f42356f.call());
        } catch (Throwable th) {
            C11192a.m40140e(th);
            abstractC11196i.onError(th);
        }
    }
}
