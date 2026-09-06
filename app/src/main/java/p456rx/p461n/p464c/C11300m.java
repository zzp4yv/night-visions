package p456rx.p461n.p464c;

import p456rx.AbstractC11195h;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11204a;

/* compiled from: SleepingAction.java */
/* renamed from: rx.n.c.m */
/* loaded from: classes3.dex */
class C11300m implements InterfaceC11204a {

    /* renamed from: f */
    private final InterfaceC11204a f42845f;

    /* renamed from: g */
    private final AbstractC11195h.a f42846g;

    /* renamed from: h */
    private final long f42847h;

    public C11300m(InterfaceC11204a interfaceC11204a, AbstractC11195h.a aVar, long j2) {
        this.f42845f = interfaceC11204a;
        this.f42846g = aVar;
        this.f42847h = j2;
    }

    @Override // p456rx.p460m.InterfaceC11204a
    public void call() {
        if (this.f42846g.isUnsubscribed()) {
            return;
        }
        long mo40145b = this.f42847h - this.f42846g.mo40145b();
        if (mo40145b > 0) {
            try {
                Thread.sleep(mo40145b);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                C11192a.m40138c(e2);
            }
        }
        if (this.f42846g.isUnsubscribed()) {
            return;
        }
        this.f42845f.call();
    }
}
