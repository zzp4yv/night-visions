package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10365i;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.q0 */
/* loaded from: classes3.dex */
public final class C10347q0 {
    /* renamed from: a */
    public static final C10298a m36807a(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (mo36635R0 instanceof C10298a) {
            return (C10298a) mo36635R0;
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC10335m0 m36808b(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C10298a m36807a = m36807a(abstractC10311e0);
        if (m36807a != null) {
            return m36807a.m36559a1();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m36809c(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return abstractC10311e0.mo36635R0() instanceof C10343p;
    }

    /* renamed from: d */
    private static final C10308d0 m36810d(C10308d0 c10308d0) {
        AbstractC10311e0 abstractC10311e0;
        Collection<AbstractC10311e0> mo35998a = c10308d0.mo35998a();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35998a, 10));
        Iterator<T> it = mo35998a.iterator();
        boolean z = false;
        while (true) {
            abstractC10311e0 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC10311e0 abstractC10311e02 = (AbstractC10311e0) it.next();
            if (C10339n1.m36779l(abstractC10311e02)) {
                abstractC10311e02 = m36812f(abstractC10311e02.mo36635R0(), false, 1, null);
                z = true;
            }
            arrayList.add(abstractC10311e02);
        }
        if (!z) {
            return null;
        }
        AbstractC10311e0 m36603i = c10308d0.m36603i();
        if (m36603i != null) {
            if (C10339n1.m36779l(m36603i)) {
                m36603i = m36812f(m36603i.mo36635R0(), false, 1, null);
            }
            abstractC10311e0 = m36603i;
        }
        return new C10308d0(arrayList).m36606m(abstractC10311e0);
    }

    /* renamed from: e */
    public static final AbstractC10348q1 m36811e(AbstractC10348q1 abstractC10348q1, boolean z) {
        C9768m.m32346f(abstractC10348q1, "<this>");
        C10343p m36799b = C10343p.f40159g.m36799b(abstractC10348q1, z);
        if (m36799b != null) {
            return m36799b;
        }
        AbstractC10335m0 m36813g = m36813g(abstractC10348q1);
        return m36813g != null ? m36813g : abstractC10348q1.mo33545S0(false);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC10348q1 m36812f(AbstractC10348q1 abstractC10348q1, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m36811e(abstractC10348q1, z);
    }

    /* renamed from: g */
    private static final AbstractC10335m0 m36813g(AbstractC10311e0 abstractC10311e0) {
        C10308d0 m36810d;
        InterfaceC10312e1 mo35993O0 = abstractC10311e0.mo35993O0();
        C10308d0 c10308d0 = mo35993O0 instanceof C10308d0 ? (C10308d0) mo35993O0 : null;
        if (c10308d0 == null || (m36810d = m36810d(c10308d0)) == null) {
            return null;
        }
        return m36810d.m36602h();
    }

    /* renamed from: h */
    public static final AbstractC10335m0 m36814h(AbstractC10335m0 abstractC10335m0, boolean z) {
        C9768m.m32346f(abstractC10335m0, "<this>");
        C10343p m36799b = C10343p.f40159g.m36799b(abstractC10335m0, z);
        if (m36799b != null) {
            return m36799b;
        }
        AbstractC10335m0 m36813g = m36813g(abstractC10335m0);
        return m36813g == null ? abstractC10335m0.mo33545S0(false) : m36813g;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC10335m0 m36815i(AbstractC10335m0 abstractC10335m0, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m36814h(abstractC10335m0, z);
    }

    /* renamed from: j */
    public static final AbstractC10335m0 m36816j(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
        C9768m.m32346f(abstractC10335m0, "<this>");
        C9768m.m32346f(abstractC10335m02, "abbreviatedType");
        return C10317g0.m36706a(abstractC10335m0) ? abstractC10335m0 : new C10298a(abstractC10335m0, abstractC10335m02);
    }

    /* renamed from: k */
    public static final C10365i m36817k(C10365i c10365i) {
        C9768m.m32346f(c10365i, "<this>");
        return new C10365i(c10365i.m36934X0(), c10365i.mo35993O0(), c10365i.m36936Z0(), c10365i.mo35992N0(), c10365i.mo33691P0(), true);
    }
}
