package p323h.p324a.p329z.p334e.p338d;

import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p329z.p332c.InterfaceCallableC9079d;
import p323h.p324a.p329z.p334e.p338d.C9113p;

/* compiled from: ObservableJust.java */
/* renamed from: h.a.z.e.d.m */
/* loaded from: classes2.dex */
public final class C9110m<T> extends AbstractC9043m<T> implements InterfaceCallableC9079d<T> {

    /* renamed from: f */
    private final T f35097f;

    public C9110m(T t) {
        this.f35097f = t;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceCallableC9079d, java.util.concurrent.Callable
    public T call() {
        return this.f35097f;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        C9113p.a aVar = new C9113p.a(interfaceC9047q, this.f35097f);
        interfaceC9047q.mo29219b(aVar);
        aVar.run();
    }
}
