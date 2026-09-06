package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.z */
/* loaded from: classes2.dex */
public abstract class AbstractC10643z extends AbstractC10624k implements InterfaceC10571k0 {

    /* renamed from: j */
    private final C10127c f41128j;

    /* renamed from: k */
    private final String f41129k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10643z(InterfaceC10559g0 interfaceC10559g0, C10127c c10127c) {
        super(interfaceC10559g0, InterfaceC10587g.f40808c.m37735b(), c10127c.m35426h(), InterfaceC10708z0.f41247a);
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(c10127c, "fqName");
        this.f41128j = c10127c;
        this.f41129k = "package " + c10127c + " of " + interfaceC10559g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        C9768m.m32346f(interfaceC10595o, "visitor");
        return interfaceC10595o.mo35678f(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0
    /* renamed from: d */
    public final C10127c mo37712d() {
        return this.f41128j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
        return interfaceC10708z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j
    public String toString() {
        return this.f41129k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10559g0 mo32876b() {
        InterfaceC10576m mo32876b = super.mo32876b();
        C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC10559g0) mo32876b;
    }
}
