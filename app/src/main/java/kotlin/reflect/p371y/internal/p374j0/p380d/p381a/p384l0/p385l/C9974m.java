package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782t;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10606b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9954d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9978d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10000j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10015y;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.m */
/* loaded from: classes2.dex */
public final class C9974m extends AbstractC10606b {

    /* renamed from: p */
    private final C9957g f38151p;

    /* renamed from: q */
    private final InterfaceC10015y f38152q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9974m(C9957g c9957g, InterfaceC10015y interfaceC10015y, int i2, InterfaceC10576m interfaceC10576m) {
        super(c9957g.m33286e(), interfaceC10576m, new C9954d(c9957g, interfaceC10015y, false, 4, null), interfaceC10015y.getName(), EnumC10351r1.INVARIANT, false, i2, InterfaceC10708z0.f41247a, c9957g.m33282a().m33262v());
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC10015y, "javaTypeParameter");
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        this.f38151p = c9957g;
        this.f38152q = interfaceC10015y;
    }

    /* renamed from: N0 */
    private final List<AbstractC10311e0> m33495N0() {
        Collection<InterfaceC10000j> upperBounds = this.f38152q.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC10335m0 m32791i = this.f38151p.m33285d().mo37021o().m32791i();
            C9768m.m32345e(m32791i, "c.module.builtIns.anyType");
            AbstractC10335m0 m32774I = this.f38151p.m33285d().mo37021o().m32774I();
            C9768m.m32345e(m32774I, "c.module.builtIns.nullableAnyType");
            return C10782t.m38883e(C10314f0.m36664d(m32791i, m32774I));
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f38151p.m33288g().m33525o((InterfaceC10000j) it.next(), C9978d.m33530d(EnumC9940k.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10612e
    /* renamed from: A0 */
    protected List<AbstractC10311e0> mo33496A0(List<? extends AbstractC10311e0> list) {
        C9768m.m32346f(list, "bounds");
        return this.f38151p.m33282a().m33258r().m33747i(this, list, this.f38151p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10612e
    /* renamed from: L0 */
    protected void mo33497L0(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10612e
    /* renamed from: M0 */
    protected List<AbstractC10311e0> mo33498M0() {
        return m33495N0();
    }
}
