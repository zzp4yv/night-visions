package p456rx.p461n.p466e;

import p456rx.AbstractC11197j;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;

/* compiled from: ActionSubscriber.java */
/* renamed from: rx.n.e.b */
/* loaded from: classes3.dex */
public final class C11305b<T> extends AbstractC11197j<T> {

    /* renamed from: f */
    final InterfaceC11205b<? super T> f42863f;

    /* renamed from: g */
    final InterfaceC11205b<Throwable> f42864g;

    /* renamed from: h */
    final InterfaceC11204a f42865h;

    public C11305b(InterfaceC11205b<? super T> interfaceC11205b, InterfaceC11205b<Throwable> interfaceC11205b2, InterfaceC11204a interfaceC11204a) {
        this.f42863f = interfaceC11205b;
        this.f42864g = interfaceC11205b2;
        this.f42865h = interfaceC11204a;
    }

    @Override // p456rx.InterfaceC11193f
    public void onCompleted() {
        this.f42865h.call();
    }

    @Override // p456rx.InterfaceC11193f
    public void onError(Throwable th) {
        this.f42864g.call(th);
    }

    @Override // p456rx.InterfaceC11193f
    public void onNext(T t) {
        this.f42863f.call(t);
    }
}
