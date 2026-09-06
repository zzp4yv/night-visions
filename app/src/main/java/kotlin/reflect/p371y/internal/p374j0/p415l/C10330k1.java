package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10592l;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.k1 */
/* loaded from: classes3.dex */
public final class C10330k1 {
    /* renamed from: a */
    public static final AbstractC10335m0 m36734a(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        AbstractC10335m0 abstractC10335m0 = mo36635R0 instanceof AbstractC10335m0 ? (AbstractC10335m0) mo36635R0 : null;
        if (abstractC10335m0 != null) {
            return abstractC10335m0;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC10311e0).toString());
    }

    /* renamed from: b */
    public static final AbstractC10311e0 m36735b(AbstractC10311e0 abstractC10311e0, List<? extends InterfaceC10318g1> list, InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(list, "newArguments");
        C9768m.m32346f(interfaceC10587g, "newAnnotations");
        return m36738e(abstractC10311e0, list, interfaceC10587g, null, 4, null);
    }

    /* renamed from: c */
    public static final AbstractC10311e0 m36736c(AbstractC10311e0 abstractC10311e0, List<? extends InterfaceC10318g1> list, InterfaceC10587g interfaceC10587g, List<? extends InterfaceC10318g1> list2) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(list, "newArguments");
        C9768m.m32346f(interfaceC10587g, "newAnnotations");
        C9768m.m32346f(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == abstractC10311e0.mo35991M0()) && interfaceC10587g == abstractC10311e0.getAnnotations()) {
            return abstractC10311e0;
        }
        C10300a1 mo35992N0 = abstractC10311e0.mo35992N0();
        if ((interfaceC10587g instanceof C10592l) && interfaceC10587g.isEmpty()) {
            interfaceC10587g = InterfaceC10587g.f40808c.m37735b();
        }
        C10300a1 m36586a = C10303b1.m36586a(mo35992N0, interfaceC10587g);
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (mo36635R0 instanceof AbstractC10425y) {
            AbstractC10425y abstractC10425y = (AbstractC10425y) mo36635R0;
            return C10314f0.m36664d(m36737d(abstractC10425y.m37161W0(), list, m36586a), m36737d(abstractC10425y.m37162X0(), list2, m36586a));
        }
        if (mo36635R0 instanceof AbstractC10335m0) {
            return m36737d((AbstractC10335m0) mo36635R0, list, m36586a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final AbstractC10335m0 m36737d(AbstractC10335m0 abstractC10335m0, List<? extends InterfaceC10318g1> list, C10300a1 c10300a1) {
        C9768m.m32346f(abstractC10335m0, "<this>");
        C9768m.m32346f(list, "newArguments");
        C9768m.m32346f(c10300a1, "newAttributes");
        return (list.isEmpty() && c10300a1 == abstractC10335m0.mo35992N0()) ? abstractC10335m0 : list.isEmpty() ? abstractC10335m0.mo33547U0(c10300a1) : C10314f0.m36669i(c10300a1, abstractC10335m0.mo35993O0(), list, abstractC10335m0.mo33691P0(), null, 16, null);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC10311e0 m36738e(AbstractC10311e0 abstractC10311e0, List list, InterfaceC10587g interfaceC10587g, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = abstractC10311e0.mo35991M0();
        }
        if ((i2 & 2) != 0) {
            interfaceC10587g = abstractC10311e0.getAnnotations();
        }
        if ((i2 & 4) != 0) {
            list2 = list;
        }
        return m36736c(abstractC10311e0, list, interfaceC10587g, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC10335m0 m36739f(AbstractC10335m0 abstractC10335m0, List list, C10300a1 c10300a1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = abstractC10335m0.mo35991M0();
        }
        if ((i2 & 2) != 0) {
            c10300a1 = abstractC10335m0.mo35992N0();
        }
        return m36737d(abstractC10335m0, list, c10300a1);
    }
}
