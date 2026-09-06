package p456rx.p461n.p466e;

import p456rx.InterfaceC11193f;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;

/* compiled from: ActionObserver.java */
/* renamed from: rx.n.e.a */
/* loaded from: classes3.dex */
public final class C11304a<T> implements InterfaceC11193f<T> {

    /* renamed from: f */
    final InterfaceC11205b<? super T> f42860f;

    /* renamed from: g */
    final InterfaceC11205b<? super Throwable> f42861g;

    /* renamed from: h */
    final InterfaceC11204a f42862h;

    public C11304a(InterfaceC11205b<? super T> interfaceC11205b, InterfaceC11205b<? super Throwable> interfaceC11205b2, InterfaceC11204a interfaceC11204a) {
        this.f42860f = interfaceC11205b;
        this.f42861g = interfaceC11205b2;
        this.f42862h = interfaceC11204a;
    }

    @Override // p456rx.InterfaceC11193f
    public void onCompleted() {
        this.f42862h.call();
    }

    @Override // p456rx.InterfaceC11193f
    public void onError(Throwable th) {
        this.f42861g.call(th);
    }

    @Override // p456rx.InterfaceC11193f
    public void onNext(T t) {
        this.f42860f.call(t);
    }
}
