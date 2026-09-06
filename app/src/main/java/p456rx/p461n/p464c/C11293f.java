package p456rx.p461n.p464c;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11195h;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p474t.C11377a;
import p456rx.p474t.C11381e;

/* compiled from: ImmediateScheduler.java */
/* renamed from: rx.n.c.f */
/* loaded from: classes3.dex */
public final class C11293f extends AbstractC11195h {

    /* renamed from: a */
    public static final C11293f f42795a = new C11293f();

    /* compiled from: ImmediateScheduler.java */
    /* renamed from: rx.n.c.f$a */
    final class a extends AbstractC11195h.a implements InterfaceC11198k {

        /* renamed from: f */
        final C11377a f42796f = new C11377a();

        a() {
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: c */
        public InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a) {
            interfaceC11204a.call();
            return C11381e.m40676c();
        }

        @Override // p456rx.AbstractC11195h.a
        /* renamed from: d */
        public InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit) {
            return mo40146c(new C11300m(interfaceC11204a, this, C11293f.this.now() + timeUnit.toMillis(j2)));
        }

        @Override // p456rx.InterfaceC11198k
        public boolean isUnsubscribed() {
            return this.f42796f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11198k
        public void unsubscribe() {
            this.f42796f.unsubscribe();
        }
    }

    private C11293f() {
    }

    @Override // p456rx.AbstractC11195h
    public AbstractC11195h.a createWorker() {
        return new a();
    }
}
