package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10170d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p421y1.C10428b;

/* compiled from: utils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.y */
/* loaded from: classes3.dex */
public final class C10381y {
    /* renamed from: a */
    private static final AbstractC10311e0 m36979a(AbstractC10311e0 abstractC10311e0) {
        return C10428b.m37167a(abstractC10311e0).m37166d();
    }

    /* renamed from: b */
    private static final String m36980b(InterfaceC10312e1 interfaceC10312e1) {
        StringBuilder sb = new StringBuilder();
        m36981c("type: " + interfaceC10312e1, sb);
        m36981c("hashCode: " + interfaceC10312e1.hashCode(), sb);
        m36981c("javaClass: " + interfaceC10312e1.getClass().getCanonicalName(), sb);
        for (InterfaceC10576m mo32887c = interfaceC10312e1.mo32887c(); mo32887c != null; mo32887c = mo32887c.mo32876b()) {
            m36981c("fqName: " + AbstractC10139c.f39377g.mo35500q(mo32887c), sb);
            m36981c("javaClass: " + mo32887c.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    private static final StringBuilder m36981c(String str, StringBuilder sb) {
        C9768m.m32346f(str, "<this>");
        sb.append(str);
        C9768m.m32345e(sb, "append(value)");
        sb.append('\n');
        C9768m.m32345e(sb, "append('\\n')");
        return sb;
    }

    /* renamed from: d */
    public static final AbstractC10311e0 m36982d(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, InterfaceC10378v interfaceC10378v) {
        boolean z;
        C9768m.m32346f(abstractC10311e0, "subtype");
        C9768m.m32346f(abstractC10311e02, "supertype");
        C9768m.m32346f(interfaceC10378v, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C10375s(abstractC10311e0, null));
        InterfaceC10312e1 mo35993O0 = abstractC10311e02.mo35993O0();
        while (!arrayDeque.isEmpty()) {
            C10375s c10375s = (C10375s) arrayDeque.poll();
            AbstractC10311e0 m36960b = c10375s.m36960b();
            InterfaceC10312e1 mo35993O02 = m36960b.mo35993O0();
            if (interfaceC10378v.mo36962a(mo35993O02, mo35993O0)) {
                boolean mo33691P0 = m36960b.mo33691P0();
                for (C10375s m36959a = c10375s.m36959a(); m36959a != null; m36959a = m36959a.m36959a()) {
                    AbstractC10311e0 m36960b2 = m36959a.m36960b();
                    List<InterfaceC10318g1> mo35991M0 = m36960b2.mo35991M0();
                    if (!(mo35991M0 instanceof Collection) || !mo35991M0.isEmpty()) {
                        Iterator<T> it = mo35991M0.iterator();
                        while (it.hasNext()) {
                            if (((InterfaceC10318g1) it.next()).mo36708a() != EnumC10351r1.INVARIANT) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        AbstractC10311e0 m36758n = C10170d.m36010f(AbstractC10315f1.f40104c.m36681a(m36960b2), false, 1, null).m36726c().m36758n(m36960b, EnumC10351r1.INVARIANT);
                        C9768m.m32345e(m36758n, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        m36960b = m36979a(m36758n);
                    } else {
                        m36960b = AbstractC10315f1.f40104c.m36681a(m36960b2).m36726c().m36758n(m36960b, EnumC10351r1.INVARIANT);
                        C9768m.m32345e(m36960b, "{\n                    Ty…ARIANT)\n                }");
                    }
                    mo33691P0 = mo33691P0 || m36960b2.mo33691P0();
                }
                InterfaceC10312e1 mo35993O03 = m36960b.mo35993O0();
                if (interfaceC10378v.mo36962a(mo35993O03, mo35993O0)) {
                    return C10339n1.m36783p(m36960b, mo33691P0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m36980b(mo35993O03) + ", \n\nsupertype: " + m36980b(mo35993O0) + " \n" + interfaceC10378v.mo36962a(mo35993O03, mo35993O0));
            }
            for (AbstractC10311e0 abstractC10311e03 : mo35993O02.mo35998a()) {
                C9768m.m32345e(abstractC10311e03, "immediateSupertype");
                arrayDeque.add(new C10375s(abstractC10311e03, c10375s));
            }
        }
        return null;
    }
}
