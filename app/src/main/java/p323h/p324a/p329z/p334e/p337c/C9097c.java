package p323h.p324a.p329z.p334e.p337c;

import p323h.p324a.AbstractC9040j;
import p323h.p324a.InterfaceC9041k;
import p323h.p324a.p327x.C9057d;
import p323h.p324a.p329z.p332c.InterfaceCallableC9079d;

/* compiled from: MaybeJust.java */
/* renamed from: h.a.z.e.c.c */
/* loaded from: classes2.dex */
public final class C9097c<T> extends AbstractC9040j<T> implements InterfaceCallableC9079d<T> {

    /* renamed from: f */
    final T f35008f;

    public C9097c(T t) {
        this.f35008f = t;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceCallableC9079d, java.util.concurrent.Callable
    public T call() {
        return this.f35008f;
    }

    @Override // p323h.p324a.AbstractC9040j
    /* renamed from: e */
    protected void mo29184e(InterfaceC9041k<? super T> interfaceC9041k) {
        interfaceC9041k.mo29186b(C9057d.m29242a());
        interfaceC9041k.onSuccess(this.f35008f);
    }
}
