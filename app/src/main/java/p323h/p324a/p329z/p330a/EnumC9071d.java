package p323h.p324a.p329z.p330a;

import p323h.p324a.InterfaceC9041k;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.InterfaceC9051u;
import p323h.p324a.p329z.p332c.InterfaceC9077b;

/* compiled from: EmptyDisposable.java */
/* renamed from: h.a.z.a.d */
/* loaded from: classes2.dex */
public enum EnumC9071d implements InterfaceC9077b<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: u */
    public static void m29255u(InterfaceC9041k<?> interfaceC9041k) {
        interfaceC9041k.mo29186b(INSTANCE);
        interfaceC9041k.mo29185a();
    }

    /* renamed from: v */
    public static void m29256v(InterfaceC9047q<?> interfaceC9047q) {
        interfaceC9047q.mo29219b(INSTANCE);
        interfaceC9047q.mo29218a();
    }

    /* renamed from: x */
    public static void m29257x(Throwable th, InterfaceC9047q<?> interfaceC9047q) {
        interfaceC9047q.mo29219b(INSTANCE);
        interfaceC9047q.onError(th);
    }

    /* renamed from: y */
    public static void m29258y(Throwable th, InterfaceC9051u<?> interfaceC9051u) {
        interfaceC9051u.mo29132b(INSTANCE);
        interfaceC9051u.onError(th);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public void clear() {
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9078c
    /* renamed from: g */
    public int mo29259g(int i2) {
        return i2 & 2;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public boolean isEmpty() {
        return true;
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: k */
    public void mo29115k() {
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public Object poll() throws Exception {
        return null;
    }

    @Override // p323h.p324a.p327x.InterfaceC9056c
    /* renamed from: q */
    public boolean mo29116q() {
        return this == INSTANCE;
    }
}
