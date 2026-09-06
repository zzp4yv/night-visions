package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10404d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10414n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10416p;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.c */
/* loaded from: classes3.dex */
public final class C10304c {

    /* renamed from: a */
    public static final C10304c f40043a = new C10304c();

    private C10304c() {
    }

    /* renamed from: c */
    private final boolean m36588c(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n) {
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (m36618j.mo35944f0(interfaceC10411k)) {
            return true;
        }
        if (m36618j.mo35929W(interfaceC10411k)) {
            return false;
        }
        if (c10309d1.m36622n() && m36618j.mo35960n0(interfaceC10411k)) {
            return true;
        }
        return m36618j.mo35902A0(m36618j.mo35937c(interfaceC10411k), interfaceC10414n);
    }

    /* renamed from: e */
    private final boolean m36589e(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (C10313f.f40079b) {
            if (!m36618j.mo35935b(interfaceC10411k) && !m36618j.mo35932Z(m36618j.mo35937c(interfaceC10411k))) {
                c10309d1.m36620l(interfaceC10411k);
            }
            if (!m36618j.mo35935b(interfaceC10411k2)) {
                c10309d1.m36620l(interfaceC10411k2);
            }
        }
        if (m36618j.mo35929W(interfaceC10411k2) || m36618j.mo35905C(interfaceC10411k) || m36618j.mo35915I(interfaceC10411k)) {
            return true;
        }
        if ((interfaceC10411k instanceof InterfaceC10404d) && m36618j.mo35953k((InterfaceC10404d) interfaceC10411k)) {
            return true;
        }
        C10304c c10304c = f40043a;
        if (c10304c.m36590a(c10309d1, interfaceC10411k, C10309d1.c.b.f40070a)) {
            return true;
        }
        if (m36618j.mo35905C(interfaceC10411k2) || c10304c.m36590a(c10309d1, interfaceC10411k2, C10309d1.c.d.f40072a) || m36618j.mo35976v0(interfaceC10411k)) {
            return false;
        }
        return c10304c.m36591b(c10309d1, interfaceC10411k, m36618j.mo35937c(interfaceC10411k2));
    }

    /* renamed from: a */
    public final boolean m36590a(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, C10309d1.c cVar) {
        String m38599e0;
        C9768m.m32346f(c10309d1, "<this>");
        C9768m.m32346f(interfaceC10411k, "type");
        C9768m.m32346f(cVar, "supertypesPolicy");
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (!((m36618j.mo35976v0(interfaceC10411k) && !m36618j.mo35929W(interfaceC10411k)) || m36618j.mo35905C(interfaceC10411k))) {
            c10309d1.m36619k();
            ArrayDeque<InterfaceC10411k> m36616h = c10309d1.m36616h();
            C9768m.m32343c(m36616h);
            Set<InterfaceC10411k> m36617i = c10309d1.m36617i();
            C9768m.m32343c(m36617i);
            m36616h.push(interfaceC10411k);
            while (!m36616h.isEmpty()) {
                if (m36617i.size() > 1000) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Too many supertypes for type: ");
                    sb.append(interfaceC10411k);
                    sb.append(". Supertypes = ");
                    m38599e0 = C10749c0.m38599e0(m36617i, null, null, null, 0, null, null, 63, null);
                    sb.append(m38599e0);
                    throw new IllegalStateException(sb.toString().toString());
                }
                InterfaceC10411k pop = m36616h.pop();
                C9768m.m32345e(pop, "current");
                if (m36617i.add(pop)) {
                    C10309d1.c cVar2 = m36618j.mo35929W(pop) ? C10309d1.c.C11522c.f40071a : cVar;
                    if (!(!C9768m.m32341a(cVar2, C10309d1.c.C11522c.f40071a))) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        continue;
                    } else {
                        InterfaceC10416p m36618j2 = c10309d1.m36618j();
                        Iterator<InterfaceC10409i> it = m36618j2.mo35971t(m36618j2.mo35937c(pop)).iterator();
                        while (it.hasNext()) {
                            InterfaceC10411k mo36629a = cVar2.mo36629a(c10309d1, it.next());
                            if ((m36618j.mo35976v0(mo36629a) && !m36618j.mo35929W(mo36629a)) || m36618j.mo35905C(mo36629a)) {
                                c10309d1.m36614e();
                            } else {
                                m36616h.add(mo36629a);
                            }
                        }
                    }
                }
            }
            c10309d1.m36614e();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m36591b(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n) {
        String m38599e0;
        C9768m.m32346f(c10309d1, "state");
        C9768m.m32346f(interfaceC10411k, "start");
        C9768m.m32346f(interfaceC10414n, "end");
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (f40043a.m36588c(c10309d1, interfaceC10411k, interfaceC10414n)) {
            return true;
        }
        c10309d1.m36619k();
        ArrayDeque<InterfaceC10411k> m36616h = c10309d1.m36616h();
        C9768m.m32343c(m36616h);
        Set<InterfaceC10411k> m36617i = c10309d1.m36617i();
        C9768m.m32343c(m36617i);
        m36616h.push(interfaceC10411k);
        while (!m36616h.isEmpty()) {
            if (m36617i.size() > 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(interfaceC10411k);
                sb.append(". Supertypes = ");
                m38599e0 = C10749c0.m38599e0(m36617i, null, null, null, 0, null, null, 63, null);
                sb.append(m38599e0);
                throw new IllegalStateException(sb.toString().toString());
            }
            InterfaceC10411k pop = m36616h.pop();
            C9768m.m32345e(pop, "current");
            if (m36617i.add(pop)) {
                C10309d1.c cVar = m36618j.mo35929W(pop) ? C10309d1.c.C11522c.f40071a : C10309d1.c.b.f40070a;
                if (!(!C9768m.m32341a(cVar, C10309d1.c.C11522c.f40071a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC10416p m36618j2 = c10309d1.m36618j();
                    Iterator<InterfaceC10409i> it = m36618j2.mo35971t(m36618j2.mo35937c(pop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC10411k mo36629a = cVar.mo36629a(c10309d1, it.next());
                        if (f40043a.m36588c(c10309d1, mo36629a, interfaceC10414n)) {
                            c10309d1.m36614e();
                            return true;
                        }
                        m36616h.add(mo36629a);
                    }
                }
            }
        }
        c10309d1.m36614e();
        return false;
    }

    /* renamed from: d */
    public final boolean m36592d(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
        C9768m.m32346f(c10309d1, "state");
        C9768m.m32346f(interfaceC10411k, "subType");
        C9768m.m32346f(interfaceC10411k2, "superType");
        return m36589e(c10309d1, interfaceC10411k, interfaceC10411k2);
    }
}
