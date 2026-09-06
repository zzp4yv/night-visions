package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sv */
/* loaded from: classes2.dex */
final class C7135sv implements InterfaceC7357yv {

    /* renamed from: a */
    private InterfaceC7357yv[] f20542a;

    C7135sv(InterfaceC7357yv... interfaceC7357yvArr) {
        this.f20542a = interfaceC7357yvArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7357yv
    /* renamed from: a */
    public final InterfaceC7320xv mo15151a(Class<?> cls) {
        for (InterfaceC7357yv interfaceC7357yv : this.f20542a) {
            if (interfaceC7357yv.mo15152b(cls)) {
                return interfaceC7357yv.mo15151a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7357yv
    /* renamed from: b */
    public final boolean mo15152b(Class<?> cls) {
        for (InterfaceC7357yv interfaceC7357yv : this.f20542a) {
            if (interfaceC7357yv.mo15152b(cls)) {
                return true;
            }
        }
        return false;
    }
}
