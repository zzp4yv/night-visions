package p456rx;

import p456rx.p461n.p466e.C11315l;

/* compiled from: SingleSubscriber.java */
/* renamed from: rx.i */
/* loaded from: classes3.dex */
public abstract class AbstractC11196i<T> implements InterfaceC11198k {

    /* renamed from: f */
    private final C11315l f42137f = new C11315l();

    /* renamed from: b */
    public final void m40149b(InterfaceC11198k interfaceC11198k) {
        this.f42137f.m40464a(interfaceC11198k);
    }

    /* renamed from: c */
    public abstract void mo29130c(T t);

    @Override // p456rx.InterfaceC11198k
    public final boolean isUnsubscribed() {
        return this.f42137f.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    @Override // p456rx.InterfaceC11198k
    public final void unsubscribe() {
        this.f42137f.unsubscribe();
    }
}
