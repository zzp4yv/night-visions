package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10542a1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9969h;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.r */
/* loaded from: classes3.dex */
public final class C10069r implements InterfaceC10708z0 {

    /* renamed from: b */
    private final C9969h f38480b;

    public C10069r(C9969h c9969h) {
        C9768m.m32346f(c9969h, "packageFragment");
        this.f38480b = c9969h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0
    /* renamed from: a */
    public InterfaceC10542a1 mo33980a() {
        InterfaceC10542a1 interfaceC10542a1 = InterfaceC10542a1.f40728a;
        C9768m.m32345e(interfaceC10542a1, "NO_SOURCE_FILE");
        return interfaceC10542a1;
    }

    public String toString() {
        return this.f38480b + ": " + this.f38480b.m33427N0().keySet();
    }
}
