package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.collections.C10749c0;
import kotlin.collections.C10771n0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10590j;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.EnumC9891c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10184m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10193v;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10303b1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: functionTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.b.g */
/* loaded from: classes2.dex */
public final class C9880g {
    /* renamed from: a */
    public static final int m32705a(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10583c mo33271l = abstractC10311e0.getAnnotations().mo33271l(C9884k.a.f37530D);
        if (mo33271l == null) {
            return 0;
        }
        AbstractC10178g abstractC10178g = (AbstractC10178g) C10771n0.m38779j(mo33271l.mo33159a(), C9884k.f37508i);
        C9768m.m32344d(abstractC10178g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((C10184m) abstractC10178g).mo36023b().intValue();
    }

    /* renamed from: b */
    public static final AbstractC10335m0 m32706b(AbstractC9881h abstractC9881h, InterfaceC10587g interfaceC10587g, AbstractC10311e0 abstractC10311e0, List<? extends AbstractC10311e0> list, List<? extends AbstractC10311e0> list2, List<C10130f> list3, AbstractC10311e0 abstractC10311e02, boolean z) {
        C9768m.m32346f(abstractC9881h, "builtIns");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(list, "contextReceiverTypes");
        C9768m.m32346f(list2, "parameterTypes");
        C9768m.m32346f(abstractC10311e02, "returnType");
        List<InterfaceC10318g1> m32711g = m32711g(abstractC10311e0, list, list2, list3, abstractC10311e02, abstractC9881h);
        InterfaceC10552e m32710f = m32710f(abstractC9881h, list2.size() + list.size() + (abstractC10311e0 == null ? 0 : 1), z);
        if (abstractC10311e0 != null) {
            interfaceC10587g = m32724t(interfaceC10587g, abstractC9881h);
        }
        if (!list.isEmpty()) {
            interfaceC10587g = m32723s(interfaceC10587g, abstractC9881h, list.size());
        }
        return C10314f0.m36667g(C10303b1.m36587b(interfaceC10587g), m32710f, m32711g);
    }

    /* renamed from: d */
    public static final C10130f m32708d(AbstractC10311e0 abstractC10311e0) {
        String mo36023b;
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10583c mo33271l = abstractC10311e0.getAnnotations().mo33271l(C9884k.a.f37532E);
        if (mo33271l == null) {
            return null;
        }
        Object m38868t0 = C10780s.m38868t0(mo33271l.mo33159a().values());
        C10193v c10193v = m38868t0 instanceof C10193v ? (C10193v) m38868t0 : null;
        if (c10193v != null && (mo36023b = c10193v.mo36023b()) != null) {
            if (!C10130f.m35450A(mo36023b)) {
                mo36023b = null;
            }
            if (mo36023b != null) {
                return C10130f.m35454x(mo36023b);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final List<AbstractC10311e0> m32709e(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        m32719o(abstractC10311e0);
        int m32705a = m32705a(abstractC10311e0);
        if (m32705a == 0) {
            return C10784u.m38888j();
        }
        List<InterfaceC10318g1> subList = abstractC10311e0.mo35991M0().subList(0, m32705a);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            AbstractC10311e0 type = ((InterfaceC10318g1) it.next()).getType();
            C9768m.m32345e(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final InterfaceC10552e m32710f(AbstractC9881h abstractC9881h, int i2, boolean z) {
        C9768m.m32346f(abstractC9881h, "builtIns");
        InterfaceC10552e m32785X = z ? abstractC9881h.m32785X(i2) : abstractC9881h.m32767C(i2);
        C9768m.m32345e(m32785X, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return m32785X;
    }

    /* renamed from: g */
    public static final List<InterfaceC10318g1> m32711g(AbstractC10311e0 abstractC10311e0, List<? extends AbstractC10311e0> list, List<? extends AbstractC10311e0> list2, List<C10130f> list3, AbstractC10311e0 abstractC10311e02, AbstractC9881h abstractC9881h) {
        C10130f c10130f;
        Map m38794f;
        List<? extends InterfaceC10583c> m38608n0;
        C9768m.m32346f(list, "contextReceiverTypes");
        C9768m.m32346f(list2, "parameterTypes");
        C9768m.m32346f(abstractC10311e02, "returnType");
        C9768m.m32346f(abstractC9881h, "builtIns");
        int i2 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (abstractC10311e0 != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C10424a.m37135a((AbstractC10311e0) it.next()));
        }
        arrayList.addAll(arrayList2);
        C10734a.m38508a(arrayList, abstractC10311e0 != null ? C10424a.m37135a(abstractC10311e0) : null);
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10784u.m38898t();
            }
            AbstractC10311e0 abstractC10311e03 = (AbstractC10311e0) obj;
            if (list3 == null || (c10130f = list3.get(i2)) == null || c10130f.m35458y()) {
                c10130f = null;
            }
            if (c10130f != null) {
                C10127c c10127c = C9884k.a.f37532E;
                C10130f m35454x = C10130f.m35454x("name");
                String m35455k = c10130f.m35455k();
                C9768m.m32345e(m35455k, "name.asString()");
                m38794f = C10775p0.m38794f(C10740s.m38547a(m35454x, new C10193v(m35455k)));
                C10590j c10590j = new C10590j(abstractC9881h, c10127c, m38794f);
                InterfaceC10587g.a aVar = InterfaceC10587g.f40808c;
                m38608n0 = C10749c0.m38608n0(abstractC10311e03.getAnnotations(), c10590j);
                abstractC10311e03 = C10424a.m37155u(abstractC10311e03, aVar.m37734a(m38608n0));
            }
            arrayList.add(C10424a.m37135a(abstractC10311e03));
            i2 = i3;
        }
        arrayList.add(C10424a.m37135a(abstractC10311e02));
        return arrayList;
    }

    /* renamed from: h */
    public static final EnumC9891c m32712h(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        if ((interfaceC10576m instanceof InterfaceC10552e) && AbstractC9881h.m32726A0(interfaceC10576m)) {
            return m32713i(C10202a.m36075i(interfaceC10576m));
        }
        return null;
    }

    /* renamed from: i */
    private static final EnumC9891c m32713i(C10128d c10128d) {
        if (!c10128d.m35435f() || c10128d.m35434e()) {
            return null;
        }
        EnumC9891c.a aVar = EnumC9891c.f37649f;
        String m35455k = c10128d.m35438i().m35455k();
        C9768m.m32345e(m35455k, "shortName().asString()");
        C10127c m35423e = c10128d.m35441l().m35423e();
        C9768m.m32345e(m35423e, "toSafe().parent()");
        return aVar.m32899b(m35455k, m35423e);
    }

    /* renamed from: j */
    public static final AbstractC10311e0 m32714j(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        m32719o(abstractC10311e0);
        if (!m32722r(abstractC10311e0)) {
            return null;
        }
        return abstractC10311e0.mo35991M0().get(m32705a(abstractC10311e0)).getType();
    }

    /* renamed from: k */
    public static final AbstractC10311e0 m32715k(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        m32719o(abstractC10311e0);
        AbstractC10311e0 type = ((InterfaceC10318g1) C10780s.m38844g0(abstractC10311e0.mo35991M0())).getType();
        C9768m.m32345e(type, "arguments.last().type");
        return type;
    }

    /* renamed from: l */
    public static final List<InterfaceC10318g1> m32716l(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        m32719o(abstractC10311e0);
        return abstractC10311e0.mo35991M0().subList(m32705a(abstractC10311e0) + (m32717m(abstractC10311e0) ? 1 : 0), r0.size() - 1);
    }

    /* renamed from: m */
    public static final boolean m32717m(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return m32719o(abstractC10311e0) && m32722r(abstractC10311e0);
    }

    /* renamed from: n */
    public static final boolean m32718n(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        EnumC9891c m32712h = m32712h(interfaceC10576m);
        return m32712h == EnumC9891c.f37650g || m32712h == EnumC9891c.f37651h;
    }

    /* renamed from: o */
    public static final boolean m32719o(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        return mo32891w != null && m32718n(mo32891w);
    }

    /* renamed from: p */
    public static final boolean m32720p(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        return (mo32891w != null ? m32712h(mo32891w) : null) == EnumC9891c.f37650g;
    }

    /* renamed from: q */
    public static final boolean m32721q(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        return (mo32891w != null ? m32712h(mo32891w) : null) == EnumC9891c.f37651h;
    }

    /* renamed from: r */
    private static final boolean m32722r(AbstractC10311e0 abstractC10311e0) {
        return abstractC10311e0.getAnnotations().mo33271l(C9884k.a.f37528C) != null;
    }

    /* renamed from: s */
    public static final InterfaceC10587g m32723s(InterfaceC10587g interfaceC10587g, AbstractC9881h abstractC9881h, int i2) {
        Map m38794f;
        List<? extends InterfaceC10583c> m38608n0;
        C9768m.m32346f(interfaceC10587g, "<this>");
        C9768m.m32346f(abstractC9881h, "builtIns");
        C10127c c10127c = C9884k.a.f37530D;
        if (interfaceC10587g.mo33270R0(c10127c)) {
            return interfaceC10587g;
        }
        InterfaceC10587g.a aVar = InterfaceC10587g.f40808c;
        m38794f = C10775p0.m38794f(C10740s.m38547a(C9884k.f37508i, new C10184m(i2)));
        m38608n0 = C10749c0.m38608n0(interfaceC10587g, new C10590j(abstractC9881h, c10127c, m38794f));
        return aVar.m37734a(m38608n0);
    }

    /* renamed from: t */
    public static final InterfaceC10587g m32724t(InterfaceC10587g interfaceC10587g, AbstractC9881h abstractC9881h) {
        Map m38797i;
        List<? extends InterfaceC10583c> m38608n0;
        C9768m.m32346f(interfaceC10587g, "<this>");
        C9768m.m32346f(abstractC9881h, "builtIns");
        C10127c c10127c = C9884k.a.f37528C;
        if (interfaceC10587g.mo33270R0(c10127c)) {
            return interfaceC10587g;
        }
        InterfaceC10587g.a aVar = InterfaceC10587g.f40808c;
        m38797i = C10777q0.m38797i();
        m38608n0 = C10749c0.m38608n0(interfaceC10587g, new C10590j(abstractC9881h, c10127c, m38797i));
        return aVar.m37734a(m38608n0);
    }
}
