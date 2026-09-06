package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes2.dex */
final class C7581x2 implements InterfaceC7462d3 {

    /* renamed from: a */
    private InterfaceC7462d3[] f27934a;

    C7581x2(InterfaceC7462d3... interfaceC7462d3Arr) {
        this.f27934a = interfaceC7462d3Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7462d3
    /* renamed from: a */
    public final boolean mo21041a(Class<?> cls) {
        for (InterfaceC7462d3 interfaceC7462d3 : this.f27934a) {
            if (interfaceC7462d3.mo21041a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7462d3
    /* renamed from: b */
    public final InterfaceC7468e3 mo21042b(Class<?> cls) {
        for (InterfaceC7462d3 interfaceC7462d3 : this.f27934a) {
            if (interfaceC7462d3.mo21041a(cls)) {
                return interfaceC7462d3.mo21042b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
