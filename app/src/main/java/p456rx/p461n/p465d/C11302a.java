package p456rx.p461n.p465d;

import java.util.concurrent.atomic.AtomicReference;
import p456rx.InterfaceC11198k;
import p456rx.p474t.C11381e;

/* compiled from: SequentialSubscription.java */
/* renamed from: rx.n.d.a */
/* loaded from: classes3.dex */
public final class C11302a extends AtomicReference<InterfaceC11198k> implements InterfaceC11198k {
    public C11302a() {
    }

    /* renamed from: a */
    public InterfaceC11198k m40414a() {
        InterfaceC11198k interfaceC11198k = (InterfaceC11198k) super.get();
        return interfaceC11198k == EnumC11303b.INSTANCE ? C11381e.m40676c() : interfaceC11198k;
    }

    /* renamed from: b */
    public boolean m40415b(InterfaceC11198k interfaceC11198k) {
        InterfaceC11198k interfaceC11198k2;
        do {
            interfaceC11198k2 = get();
            if (interfaceC11198k2 == EnumC11303b.INSTANCE) {
                if (interfaceC11198k == null) {
                    return false;
                }
                interfaceC11198k.unsubscribe();
                return false;
            }
        } while (!compareAndSet(interfaceC11198k2, interfaceC11198k));
        return true;
    }

    /* renamed from: c */
    public boolean m40416c(InterfaceC11198k interfaceC11198k) {
        InterfaceC11198k interfaceC11198k2;
        do {
            interfaceC11198k2 = get();
            if (interfaceC11198k2 == EnumC11303b.INSTANCE) {
                if (interfaceC11198k == null) {
                    return false;
                }
                interfaceC11198k.unsubscribe();
                return false;
            }
        } while (!compareAndSet(interfaceC11198k2, interfaceC11198k));
        if (interfaceC11198k2 == null) {
            return true;
        }
        interfaceC11198k2.unsubscribe();
        return true;
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return get() == EnumC11303b.INSTANCE;
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        InterfaceC11198k andSet;
        InterfaceC11198k interfaceC11198k = get();
        EnumC11303b enumC11303b = EnumC11303b.INSTANCE;
        if (interfaceC11198k == enumC11303b || (andSet = getAndSet(enumC11303b)) == null || andSet == enumC11303b) {
            return;
        }
        andSet.unsubscribe();
    }

    public C11302a(InterfaceC11198k interfaceC11198k) {
        lazySet(interfaceC11198k);
    }
}
