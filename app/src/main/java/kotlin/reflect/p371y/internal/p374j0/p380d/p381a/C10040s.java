package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9926h0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9946e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9944c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10063l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.s */
/* loaded from: classes2.dex */
public final class C10040s implements InterfaceC10155e {

    /* renamed from: a */
    public static final a f38306a = new a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: b */
        private final boolean m33800b(InterfaceC10705y interfaceC10705y) {
            if (interfaceC10705y.mo37028f().size() != 1) {
                return false;
            }
            InterfaceC10576m mo32876b = interfaceC10705y.mo32876b();
            InterfaceC10552e interfaceC10552e = mo32876b instanceof InterfaceC10552e ? (InterfaceC10552e) mo32876b : null;
            if (interfaceC10552e == null) {
                return false;
            }
            List<InterfaceC10566i1> mo37028f = interfaceC10705y.mo37028f();
            C9768m.m32345e(mo37028f, "f.valueParameters");
            InterfaceC10561h mo32891w = ((InterfaceC10566i1) C10780s.m38866s0(mo37028f)).getType().mo35993O0().mo32891w();
            InterfaceC10552e interfaceC10552e2 = mo32891w instanceof InterfaceC10552e ? (InterfaceC10552e) mo32891w : null;
            return interfaceC10552e2 != null && AbstractC9881h.m32756q0(interfaceC10552e) && C9768m.m32341a(C10202a.m36074h(interfaceC10552e), C10202a.m36074h(interfaceC10552e2));
        }

        /* renamed from: c */
        private final AbstractC10063l m33801c(InterfaceC10705y interfaceC10705y, InterfaceC10566i1 interfaceC10566i1) {
            if (C10073v.m34041e(interfaceC10705y) || m33800b(interfaceC10705y)) {
                AbstractC10311e0 type = interfaceC10566i1.getType();
                C9768m.m32345e(type, "valueParameterDescriptor.type");
                return C10073v.m34043g(C10424a.m37154t(type));
            }
            AbstractC10311e0 type2 = interfaceC10566i1.getType();
            C9768m.m32345e(type2, "valueParameterDescriptor.type");
            return C10073v.m34043g(type2);
        }

        /* renamed from: a */
        public final boolean m33802a(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
            List<Pair> m38580L0;
            C9768m.m32346f(interfaceC10540a, "superDescriptor");
            C9768m.m32346f(interfaceC10540a2, "subDescriptor");
            if ((interfaceC10540a2 instanceof C9946e) && (interfaceC10540a instanceof InterfaceC10705y)) {
                C9946e c9946e = (C9946e) interfaceC10540a2;
                c9946e.mo37028f().size();
                InterfaceC10705y interfaceC10705y = (InterfaceC10705y) interfaceC10540a;
                interfaceC10705y.mo37028f().size();
                List<InterfaceC10566i1> mo37028f = c9946e.mo37019a().mo37028f();
                C9768m.m32345e(mo37028f, "subDescriptor.original.valueParameters");
                List<InterfaceC10566i1> mo37028f2 = interfaceC10705y.mo37019a().mo37028f();
                C9768m.m32345e(mo37028f2, "superDescriptor.original.valueParameters");
                m38580L0 = C10749c0.m38580L0(mo37028f, mo37028f2);
                for (Pair pair : m38580L0) {
                    InterfaceC10566i1 interfaceC10566i1 = (InterfaceC10566i1) pair.m37646a();
                    InterfaceC10566i1 interfaceC10566i12 = (InterfaceC10566i1) pair.m37647b();
                    C9768m.m32345e(interfaceC10566i1, "subParameter");
                    boolean z = m33801c((InterfaceC10705y) interfaceC10540a2, interfaceC10566i1) instanceof AbstractC10063l.d;
                    C9768m.m32345e(interfaceC10566i12, "superParameter");
                    if (z != (m33801c(interfaceC10705y, interfaceC10566i12) instanceof AbstractC10063l.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m33799c(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e) {
        if ((interfaceC10540a instanceof InterfaceC10543b) && (interfaceC10540a2 instanceof InterfaceC10705y) && !AbstractC9881h.m32743f0(interfaceC10540a2)) {
            C9921f c9921f = C9921f.f37848n;
            InterfaceC10705y interfaceC10705y = (InterfaceC10705y) interfaceC10540a2;
            C10130f name = interfaceC10705y.getName();
            C9768m.m32345e(name, "subDescriptor.name");
            if (!c9921f.m33089l(name)) {
                C9926h0.a aVar = C9926h0.f37865a;
                C10130f name2 = interfaceC10705y.getName();
                C9768m.m32345e(name2, "subDescriptor.name");
                if (!aVar.m33134k(name2)) {
                    return false;
                }
            }
            InterfaceC10543b m33104e = C9924g0.m33104e((InterfaceC10543b) interfaceC10540a);
            boolean z = interfaceC10540a instanceof InterfaceC10705y;
            InterfaceC10705y interfaceC10705y2 = z ? (InterfaceC10705y) interfaceC10540a : null;
            if ((!(interfaceC10705y2 != null && interfaceC10705y.mo37775w0() == interfaceC10705y2.mo37775w0())) && (m33104e == null || !interfaceC10705y.mo37775w0())) {
                return true;
            }
            if ((interfaceC10552e instanceof InterfaceC9944c) && interfaceC10705y.mo37774d0() == null && m33104e != null && !C9924g0.m33105f(interfaceC10552e, m33104e)) {
                if ((m33104e instanceof InterfaceC10705y) && z && C9921f.m33087k((InterfaceC10705y) m33104e) != null) {
                    String m34039c = C10073v.m34039c(interfaceC10705y, false, false, 2, null);
                    InterfaceC10705y mo37019a = ((InterfaceC10705y) interfaceC10540a).mo37019a();
                    C9768m.m32345e(mo37019a, "superDescriptor.original");
                    if (C9768m.m32341a(m34039c, C10073v.m34039c(mo37019a, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e
    /* renamed from: a */
    public InterfaceC10155e.a mo33227a() {
        return InterfaceC10155e.a.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10155e
    /* renamed from: b */
    public InterfaceC10155e.b mo33228b(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10540a, "superDescriptor");
        C9768m.m32346f(interfaceC10540a2, "subDescriptor");
        return m33799c(interfaceC10540a, interfaceC10540a2, interfaceC10552e) ? InterfaceC10155e.b.INCOMPATIBLE : f38306a.m33802a(interfaceC10540a, interfaceC10540a2) ? InterfaceC10155e.b.INCOMPATIBLE : InterfaceC10155e.b.UNKNOWN;
    }
}
