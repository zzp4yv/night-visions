package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9964c;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e;

/* compiled from: FieldOverridabilityCondition.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.n */
/* loaded from: classes2.dex */
public final class C9985n implements InterfaceC10155e {
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e
    /* renamed from: a */
    public InterfaceC10155e.a mo33227a() {
        return InterfaceC10155e.a.BOTH;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e
    /* renamed from: b */
    public InterfaceC10155e.b mo33228b(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10540a, "superDescriptor");
        C9768m.m32346f(interfaceC10540a2, "subDescriptor");
        if (!(interfaceC10540a2 instanceof InterfaceC10696t0) || !(interfaceC10540a instanceof InterfaceC10696t0)) {
            return InterfaceC10155e.b.UNKNOWN;
        }
        InterfaceC10696t0 interfaceC10696t0 = (InterfaceC10696t0) interfaceC10540a2;
        InterfaceC10696t0 interfaceC10696t02 = (InterfaceC10696t0) interfaceC10540a;
        return !C9768m.m32341a(interfaceC10696t0.getName(), interfaceC10696t02.getName()) ? InterfaceC10155e.b.UNKNOWN : (C9964c.m33307a(interfaceC10696t0) && C9964c.m33307a(interfaceC10696t02)) ? InterfaceC10155e.b.OVERRIDABLE : (C9964c.m33307a(interfaceC10696t0) || C9964c.m33307a(interfaceC10696t02)) ? InterfaceC10155e.b.INCOMPATIBLE : InterfaceC10155e.b.UNKNOWN;
    }
}
