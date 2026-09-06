package p456rx.p474t;

import java.util.concurrent.atomic.AtomicReference;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: BooleanSubscription.java */
/* renamed from: rx.t.a */
/* loaded from: classes3.dex */
public final class C11377a implements InterfaceC11198k {

    /* renamed from: f */
    static final InterfaceC11204a f43084f = new a();

    /* renamed from: g */
    final AtomicReference<InterfaceC11204a> f43085g;

    /* compiled from: BooleanSubscription.java */
    /* renamed from: rx.t.a$a */
    static class a implements InterfaceC11204a {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
        }
    }

    public C11377a() {
        this.f43085g = new AtomicReference<>();
    }

    /* renamed from: a */
    public static C11377a m40664a() {
        return new C11377a();
    }

    /* renamed from: b */
    public static C11377a m40665b(InterfaceC11204a interfaceC11204a) {
        return new C11377a(interfaceC11204a);
    }

    @Override // p456rx.InterfaceC11198k
    public boolean isUnsubscribed() {
        return this.f43085g.get() == f43084f;
    }

    @Override // p456rx.InterfaceC11198k
    public void unsubscribe() {
        InterfaceC11204a andSet;
        InterfaceC11204a interfaceC11204a = this.f43085g.get();
        InterfaceC11204a interfaceC11204a2 = f43084f;
        if (interfaceC11204a == interfaceC11204a2 || (andSet = this.f43085g.getAndSet(interfaceC11204a2)) == null || andSet == interfaceC11204a2) {
            return;
        }
        andSet.call();
    }

    private C11377a(InterfaceC11204a interfaceC11204a) {
        this.f43085g = new AtomicReference<>(interfaceC11204a);
    }
}
