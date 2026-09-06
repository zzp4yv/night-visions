package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10625k0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: DescriptorSubstitutor.java */
/* renamed from: kotlin.f0.y.e.j0.l.t */
/* loaded from: classes3.dex */
public class C10355t {
    /* renamed from: a */
    private static /* synthetic */ void m36824a(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 4 ? 3 : 2];
        switch (i2) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i2 == 4) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static C10333l1 m36825b(List<InterfaceC10554e1> list, AbstractC10327j1 abstractC10327j1, InterfaceC10576m interfaceC10576m, List<InterfaceC10554e1> list2) {
        if (list == null) {
            m36824a(0);
        }
        if (abstractC10327j1 == null) {
            m36824a(1);
        }
        if (interfaceC10576m == null) {
            m36824a(2);
        }
        if (list2 == null) {
            m36824a(3);
        }
        C10333l1 m36826c = m36826c(list, abstractC10327j1, interfaceC10576m, list2, null);
        if (m36826c != null) {
            return m36826c;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: c */
    public static C10333l1 m36826c(List<InterfaceC10554e1> list, AbstractC10327j1 abstractC10327j1, InterfaceC10576m interfaceC10576m, List<InterfaceC10554e1> list2, boolean[] zArr) {
        if (list == null) {
            m36824a(5);
        }
        if (abstractC10327j1 == null) {
            m36824a(6);
        }
        if (interfaceC10576m == null) {
            m36824a(7);
        }
        if (list2 == null) {
            m36824a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i2 = 0;
        for (InterfaceC10554e1 interfaceC10554e1 : list) {
            C10625k0 m37874R0 = C10625k0.m37874R0(interfaceC10576m, interfaceC10554e1.getAnnotations(), interfaceC10554e1.mo37669F(), interfaceC10554e1.mo37672n(), interfaceC10554e1.getName(), i2, InterfaceC10708z0.f41247a, interfaceC10554e1.mo37671h0());
            hashMap.put(interfaceC10554e1.mo32877h(), new C10324i1(m37874R0.mo36400s()));
            hashMap2.put(interfaceC10554e1, m37874R0);
            list2.add(m37874R0);
            i2++;
        }
        AbstractC10315f1 m36678j = AbstractC10315f1.m36678j(hashMap);
        C10333l1 m36748h = C10333l1.m36748h(abstractC10327j1, m36678j);
        C10333l1 m36748h2 = C10333l1.m36748h(abstractC10327j1.m36729h(), m36678j);
        for (InterfaceC10554e1 interfaceC10554e12 : list) {
            C10625k0 c10625k0 = (C10625k0) hashMap2.get(interfaceC10554e12);
            for (AbstractC10311e0 abstractC10311e0 : interfaceC10554e12.getUpperBounds()) {
                InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
                AbstractC10311e0 m36759p = (((mo32891w instanceof InterfaceC10554e1) && C10424a.m37144j((InterfaceC10554e1) mo32891w)) ? m36748h : m36748h2).m36759p(abstractC10311e0, EnumC10351r1.OUT_VARIANCE);
                if (m36759p == null) {
                    return null;
                }
                if (m36759p != abstractC10311e0 && zArr != null) {
                    zArr[0] = true;
                }
                c10625k0.m37879N0(m36759p);
            }
            c10625k0.m37881W0();
        }
        return m36748h;
    }
}
