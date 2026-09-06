package p456rx.p474t;

import p456rx.InterfaceC11198k;
import p456rx.p461n.p465d.C11302a;

/* compiled from: SerialSubscription.java */
/* renamed from: rx.t.d */
/* loaded from: classes3.dex */
public final class C11380d implements InterfaceC11198k {

    /* renamed from: f */
    final C11302a f43089f = new C11302a();

    /* renamed from: a */
    public InterfaceC11198k m40672a() {
        return this.f43089f.m40414a();
    }

    /* renamed from: b */
    public void m40673b(InterfaceC11198k interfaceC11198k) {
        if (interfaceC11198k == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f43089f.m40416c(interfaceC11198k);
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f43089f.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        this.f43089f.unsubscribe();
    }
}
