package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10542a1;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10084e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10277t;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10255e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.s */
/* loaded from: classes3.dex */
public final class C10070s implements InterfaceC10256f {

    /* renamed from: b */
    private final InterfaceC10068q f38481b;

    /* renamed from: c */
    private final C10277t<C10084e> f38482c;

    /* renamed from: d */
    private final boolean f38483d;

    /* renamed from: e */
    private final EnumC10255e f38484e;

    public C10070s(InterfaceC10068q interfaceC10068q, C10277t<C10084e> c10277t, boolean z, EnumC10255e enumC10255e) {
        C9768m.m32346f(interfaceC10068q, "binaryClass");
        C9768m.m32346f(enumC10255e, "abiStability");
        this.f38481b = interfaceC10068q;
        this.f38482c = c10277t;
        this.f38483d = z;
        this.f38484e = enumC10255e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0
    /* renamed from: a */
    public InterfaceC10542a1 mo33980a() {
        InterfaceC10542a1 interfaceC10542a1 = InterfaceC10542a1.f40728a;
        C9768m.m32345e(interfaceC10542a1, "NO_SOURCE_FILE");
        return interfaceC10542a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f
    /* renamed from: c */
    public String mo33981c() {
        return "Class '" + this.f38481b.mo34028e().m35409b().m35420b() + '\'';
    }

    /* renamed from: d */
    public final InterfaceC10068q m34029d() {
        return this.f38481b;
    }

    public String toString() {
        return C10070s.class.getSimpleName() + ": " + this.f38481b;
    }
}
