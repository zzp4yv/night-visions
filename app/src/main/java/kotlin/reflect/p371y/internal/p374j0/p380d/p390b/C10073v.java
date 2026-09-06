package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9921f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9924g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10063l;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.v */
/* loaded from: classes3.dex */
public final class C10073v {
    /* renamed from: a */
    private static final void m34037a(StringBuilder sb, AbstractC10311e0 abstractC10311e0) {
        sb.append(m34043g(abstractC10311e0));
    }

    /* renamed from: b */
    public static final String m34038b(InterfaceC10705y interfaceC10705y, boolean z, boolean z2) {
        String m35455k;
        C9768m.m32346f(interfaceC10705y, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC10705y instanceof InterfaceC10573l) {
                m35455k = "<init>";
            } else {
                m35455k = interfaceC10705y.getName().m35455k();
                C9768m.m32345e(m35455k, "name.asString()");
            }
            sb.append(m35455k);
        }
        sb.append("(");
        InterfaceC10702w0 mo37032m0 = interfaceC10705y.mo37032m0();
        if (mo37032m0 != null) {
            AbstractC10311e0 type = mo37032m0.getType();
            C9768m.m32345e(type, "it.type");
            m34037a(sb, type);
        }
        Iterator<InterfaceC10566i1> it = interfaceC10705y.mo37028f().iterator();
        while (it.hasNext()) {
            AbstractC10311e0 type2 = it.next().getType();
            C9768m.m32345e(type2, "parameter.type");
            m34037a(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (C10055d.m33953c(interfaceC10705y)) {
                sb.append("V");
            } else {
                AbstractC10311e0 returnType = interfaceC10705y.getReturnType();
                C9768m.m32343c(returnType);
                m34037a(sb, returnType);
            }
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public static /* synthetic */ String m34039c(InterfaceC10705y interfaceC10705y, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return m34038b(interfaceC10705y, z, z2);
    }

    /* renamed from: d */
    public static final String m34040d(InterfaceC10540a interfaceC10540a) {
        C9768m.m32346f(interfaceC10540a, "<this>");
        C10075x c10075x = C10075x.f38488a;
        if (C10154d.m35804E(interfaceC10540a)) {
            return null;
        }
        InterfaceC10576m mo32876b = interfaceC10540a.mo32876b();
        InterfaceC10552e interfaceC10552e = mo32876b instanceof InterfaceC10552e ? (InterfaceC10552e) mo32876b : null;
        if (interfaceC10552e == null || interfaceC10552e.getName().m35458y()) {
            return null;
        }
        InterfaceC10540a mo37019a = interfaceC10540a.mo37019a();
        InterfaceC10706y0 interfaceC10706y0 = mo37019a instanceof InterfaceC10706y0 ? (InterfaceC10706y0) mo37019a : null;
        if (interfaceC10706y0 == null) {
            return null;
        }
        return C10072u.m34036a(c10075x, interfaceC10552e, m34039c(interfaceC10706y0, false, false, 3, null));
    }

    /* renamed from: e */
    public static final boolean m34041e(InterfaceC10540a interfaceC10540a) {
        InterfaceC10705y m33087k;
        C9768m.m32346f(interfaceC10540a, "f");
        if (!(interfaceC10540a instanceof InterfaceC10705y)) {
            return false;
        }
        InterfaceC10705y interfaceC10705y = (InterfaceC10705y) interfaceC10540a;
        if (!C9768m.m32341a(interfaceC10705y.getName().m35455k(), "remove") || interfaceC10705y.mo37028f().size() != 1 || C9924g0.m33107h((InterfaceC10543b) interfaceC10540a)) {
            return false;
        }
        List<InterfaceC10566i1> mo37028f = interfaceC10705y.mo37019a().mo37028f();
        C9768m.m32345e(mo37028f, "f.original.valueParameters");
        AbstractC10311e0 type = ((InterfaceC10566i1) C10780s.m38866s0(mo37028f)).getType();
        C9768m.m32345e(type, "f.original.valueParameters.single().type");
        AbstractC10063l m34043g = m34043g(type);
        AbstractC10063l.d dVar = m34043g instanceof AbstractC10063l.d ? (AbstractC10063l.d) m34043g : null;
        if ((dVar != null ? dVar.m34005i() : null) != EnumC10207e.INT || (m33087k = C9921f.m33087k(interfaceC10705y)) == null) {
            return false;
        }
        List<InterfaceC10566i1> mo37028f2 = m33087k.mo37019a().mo37028f();
        C9768m.m32345e(mo37028f2, "overridden.original.valueParameters");
        AbstractC10311e0 type2 = ((InterfaceC10566i1) C10780s.m38866s0(mo37028f2)).getType();
        C9768m.m32345e(type2, "overridden.original.valueParameters.single().type");
        AbstractC10063l m34043g2 = m34043g(type2);
        InterfaceC10576m mo32876b = m33087k.mo32876b();
        C9768m.m32345e(mo32876b, "overridden.containingDeclaration");
        return C9768m.m32341a(C10202a.m36075i(mo32876b), C9884k.a.f37565c0.m35428j()) && (m34043g2 instanceof AbstractC10063l.c) && C9768m.m32341a(((AbstractC10063l.c) m34043g2).m34004i(), "java/lang/Object");
    }

    /* renamed from: f */
    public static final String m34042f(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "<this>");
        C9896c c9896c = C9896c.f37667a;
        C10128d m35428j = C10202a.m36074h(interfaceC10552e).m35428j();
        C9768m.m32345e(m35428j, "fqNameSafe.toUnsafe()");
        C10126b m32929n = c9896c.m32929n(m35428j);
        if (m32929n == null) {
            return C10055d.m33952b(interfaceC10552e, null, 2, null);
        }
        String m36111f = C10206d.m36107b(m32929n).m36111f();
        C9768m.m32345e(m36111f, "byClassId(it).internalName");
        return m36111f;
    }

    /* renamed from: g */
    public static final AbstractC10063l m34043g(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return (AbstractC10063l) C10055d.m33955e(abstractC10311e0, C10065n.f38475a, C10049a0.f38354e, C10077z.f38490a, null, null, 32, null);
    }
}
