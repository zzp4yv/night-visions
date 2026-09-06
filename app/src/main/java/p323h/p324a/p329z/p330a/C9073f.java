package p323h.p324a.p329z.p330a;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p327x.InterfaceC9056c;

/* compiled from: SequentialDisposable.java */
/* renamed from: h.a.z.a.f */
/* loaded from: classes2.dex */
public final class C9073f extends AtomicReference<InterfaceC9056c> implements InterfaceC9056c {
    public C9073f() {
    }

    /* renamed from: a */
    public boolean m29261a(InterfaceC9056c interfaceC9056c) {
        return EnumC9070c.m29252v(this, interfaceC9056c);
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
        EnumC9070c.m29250g(this);
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return EnumC9070c.m29251u(get());
    }

    public C9073f(InterfaceC9056c interfaceC9056c) {
        lazySet(interfaceC9056c);
    }
}
