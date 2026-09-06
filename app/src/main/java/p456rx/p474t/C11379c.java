package p456rx.p474t;

import p456rx.InterfaceC11198k;
import p456rx.p461n.p465d.C11302a;

/* compiled from: MultipleAssignmentSubscription.java */
/* renamed from: rx.t.c */
/* loaded from: classes3.dex */
public final class C11379c implements InterfaceC11198k {

    /* renamed from: f */
    final C11302a f43088f = new C11302a();

    /* renamed from: a */
    public void m40671a(InterfaceC11198k interfaceC11198k) {
        if (interfaceC11198k == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f43088f.m40415b(interfaceC11198k);
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f43088f.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        this.f43088f.unsubscribe();
    }
}
