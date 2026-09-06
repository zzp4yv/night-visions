package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10625k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10628m;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: suspendFunctionTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.b.l */
/* loaded from: classes2.dex */
public final class C9885l {

    /* renamed from: a */
    private static final C10642y f37612a;

    static {
        C10628m c10628m = new C10628m(C10394k.f40355a.m37062i(), C9884k.f37509j);
        EnumC10555f enumC10555f = EnumC10555f.INTERFACE;
        C10130f m35425g = C9884k.f37512m.m35425g();
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        InterfaceC10297n interfaceC10297n = C10289f.f40008b;
        C10642y c10642y = new C10642y(c10628m, enumC10555f, false, false, m35425g, interfaceC10708z0, interfaceC10297n);
        c10642y.m38004N0(EnumC10550d0.ABSTRACT);
        c10642y.m38006P0(C10695t.f41220e);
        c10642y.m38005O0(C10782t.m38883e(C10625k0.m37875S0(c10642y, InterfaceC10587g.f40808c.m37735b(), false, EnumC10351r1.IN_VARIANCE, C10130f.m35454x("T"), 0, interfaceC10297n)));
        c10642y.m38002L0();
        f37612a = c10642y;
    }

    /* renamed from: a */
    public static final AbstractC10335m0 m32837a(AbstractC10311e0 abstractC10311e0) {
        AbstractC10335m0 m32706b;
        C9768m.m32346f(abstractC10311e0, "suspendFunType");
        C9880g.m32721q(abstractC10311e0);
        AbstractC9881h m37142h = C10424a.m37142h(abstractC10311e0);
        InterfaceC10587g annotations = abstractC10311e0.getAnnotations();
        AbstractC10311e0 m32714j = C9880g.m32714j(abstractC10311e0);
        List<AbstractC10311e0> m32709e = C9880g.m32709e(abstractC10311e0);
        List<InterfaceC10318g1> m32716l = C9880g.m32716l(abstractC10311e0);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m32716l, 10));
        Iterator<T> it = m32716l.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10318g1) it.next()).getType());
        }
        C10300a1 m36577h = C10300a1.f40041g.m36577h();
        InterfaceC10312e1 mo32877h = f37612a.mo32877h();
        C9768m.m32345e(mo32877h, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List m38610p0 = C10749c0.m38610p0(arrayList, C10314f0.m36669i(m36577h, mo32877h, C10782t.m38883e(C10424a.m37135a(C9880g.m32715k(abstractC10311e0))), false, null, 16, null));
        AbstractC10335m0 m32774I = C10424a.m37142h(abstractC10311e0).m32774I();
        C9768m.m32345e(m32774I, "suspendFunType.builtIns.nullableAnyType");
        m32706b = C9880g.m32706b(m37142h, annotations, m32714j, m32709e, m38610p0, null, m32774I, (r17 & 128) != 0 ? false : false);
        return m32706b.mo33545S0(abstractC10311e0.mo33691P0());
    }
}
