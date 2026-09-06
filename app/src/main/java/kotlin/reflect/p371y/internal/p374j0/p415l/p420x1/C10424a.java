package kotlin.reflect.p371y.internal.p374j0.p415l.p420x1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10310e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10303b1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10330k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10343p;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10353s0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10383u0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10391h;

/* compiled from: TypeUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.x1.a */
/* loaded from: classes3.dex */
public final class C10424a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.x1.a$a */
    static final class a extends Lambda implements Function1<AbstractC10348q1, Boolean> {

        /* renamed from: f */
        public static final a f40384f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10348q1 abstractC10348q1) {
            C9768m.m32346f(abstractC10348q1, "it");
            InterfaceC10561h mo32891w = abstractC10348q1.mo35993O0().mo32891w();
            return Boolean.valueOf(mo32891w != null ? C10424a.m37150p(mo32891w) : false);
        }
    }

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.x1.a$b */
    static final class b extends Lambda implements Function1<AbstractC10348q1, Boolean> {

        /* renamed from: f */
        public static final b f40385f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10348q1 abstractC10348q1) {
            C9768m.m32346f(abstractC10348q1, "it");
            InterfaceC10561h mo32891w = abstractC10348q1.mo35993O0().mo32891w();
            boolean z = false;
            if (mo32891w != null && ((mo32891w instanceof InterfaceC10551d1) || (mo32891w instanceof InterfaceC10554e1))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final InterfaceC10318g1 m37135a(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return new C10324i1(abstractC10311e0);
    }

    /* renamed from: b */
    public static final boolean m37136b(AbstractC10311e0 abstractC10311e0, Function1<? super AbstractC10348q1, Boolean> function1) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(function1, "predicate");
        return C10339n1.m36770c(abstractC10311e0, function1);
    }

    /* renamed from: c */
    private static final boolean m37137c(AbstractC10311e0 abstractC10311e0, InterfaceC10312e1 interfaceC10312e1, Set<? extends InterfaceC10554e1> set) {
        Iterable<IndexedValue> m38578K0;
        boolean z;
        if (C9768m.m32341a(abstractC10311e0.mo35993O0(), interfaceC10312e1)) {
            return true;
        }
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        InterfaceC10564i interfaceC10564i = mo32891w instanceof InterfaceC10564i ? (InterfaceC10564i) mo32891w : null;
        List<InterfaceC10554e1> mo32884w = interfaceC10564i != null ? interfaceC10564i.mo32884w() : null;
        m38578K0 = C10749c0.m38578K0(abstractC10311e0.mo35991M0());
        if (!(m38578K0 instanceof Collection) || !((Collection) m38578K0).isEmpty()) {
            for (IndexedValue indexedValue : m38578K0) {
                int index = indexedValue.getIndex();
                InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) indexedValue.m38648b();
                InterfaceC10554e1 interfaceC10554e1 = mo32884w != null ? (InterfaceC10554e1) C10780s.m38833X(mo32884w, index) : null;
                if (((interfaceC10554e1 == null || set == null || !set.contains(interfaceC10554e1)) ? false : true) || interfaceC10318g1.mo36710c()) {
                    z = false;
                } else {
                    AbstractC10311e0 type = interfaceC10318g1.getType();
                    C9768m.m32345e(type, "argument.type");
                    z = m37137c(type, interfaceC10312e1, set);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m37138d(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return m37136b(abstractC10311e0, a.f40384f);
    }

    /* renamed from: e */
    public static final InterfaceC10318g1 m37139e(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1, InterfaceC10554e1 interfaceC10554e1) {
        C9768m.m32346f(abstractC10311e0, "type");
        C9768m.m32346f(enumC10351r1, "projectionKind");
        if ((interfaceC10554e1 != null ? interfaceC10554e1.mo37672n() : null) == enumC10351r1) {
            enumC10351r1 = EnumC10351r1.INVARIANT;
        }
        return new C10324i1(enumC10351r1, abstractC10311e0);
    }

    /* renamed from: f */
    public static final Set<InterfaceC10554e1> m37140f(AbstractC10311e0 abstractC10311e0, Set<? extends InterfaceC10554e1> set) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m37141g(abstractC10311e0, abstractC10311e0, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private static final void m37141g(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, Set<InterfaceC10554e1> set, Set<? extends InterfaceC10554e1> set2) {
        boolean m38577K;
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        if (mo32891w instanceof InterfaceC10554e1) {
            if (!C9768m.m32341a(abstractC10311e0.mo35993O0(), abstractC10311e02.mo35993O0())) {
                set.add(mo32891w);
                return;
            }
            for (AbstractC10311e0 abstractC10311e03 : ((InterfaceC10554e1) mo32891w).getUpperBounds()) {
                C9768m.m32345e(abstractC10311e03, "upperBound");
                m37141g(abstractC10311e03, abstractC10311e02, set, set2);
            }
            return;
        }
        InterfaceC10561h mo32891w2 = abstractC10311e0.mo35993O0().mo32891w();
        InterfaceC10564i interfaceC10564i = mo32891w2 instanceof InterfaceC10564i ? (InterfaceC10564i) mo32891w2 : null;
        List<InterfaceC10554e1> mo32884w = interfaceC10564i != null ? interfaceC10564i.mo32884w() : null;
        int i2 = 0;
        for (InterfaceC10318g1 interfaceC10318g1 : abstractC10311e0.mo35991M0()) {
            int i3 = i2 + 1;
            InterfaceC10554e1 interfaceC10554e1 = mo32884w != null ? (InterfaceC10554e1) C10780s.m38833X(mo32884w, i2) : null;
            if (!((interfaceC10554e1 == null || set2 == null || !set2.contains(interfaceC10554e1)) ? false : true) && !interfaceC10318g1.mo36710c()) {
                m38577K = C10749c0.m38577K(set, interfaceC10318g1.getType().mo35993O0().mo32891w());
                if (!m38577K && !C9768m.m32341a(interfaceC10318g1.getType().mo35993O0(), abstractC10311e02.mo35993O0())) {
                    AbstractC10311e0 type = interfaceC10318g1.getType();
                    C9768m.m32345e(type, "argument.type");
                    m37141g(type, abstractC10311e02, set, set2);
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: h */
    public static final AbstractC9881h m37142h(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        AbstractC9881h mo36004o = abstractC10311e0.mo35993O0().mo36004o();
        C9768m.m32345e(mo36004o, "constructor.builtIns");
        return mo36004o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r3 = r2;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0 m37143i(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1 r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9768m.m32346f(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            kotlin.f0.y.e.j0.l.e0 r4 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0) r4
            kotlin.f0.y.e.j0.l.e1 r4 = r4.mo35993O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r4 = r4.mo32891w()
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
            if (r5 == 0) goto L39
            r3 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e) r3
        L39:
            r4 = 0
            if (r3 != 0) goto L3d
            goto L4e
        L3d:
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r3.mo32878i()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f.INTERFACE
            if (r5 == r6) goto L4e
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.mo32878i()
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f.ANNOTATION_CLASS
            if (r3 == r5) goto L4e
            r4 = 1
        L4e:
            if (r4 == 0) goto L1c
            r3 = r2
        L51:
            kotlin.f0.y.e.j0.l.e0 r3 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0) r3
            if (r3 != 0) goto L68
            java.util.List r7 = r7.getUpperBounds()
            kotlin.jvm.internal.C9768m.m32345e(r7, r1)
            java.lang.Object r7 = kotlin.collections.C10780s.m38830U(r7)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.jvm.internal.C9768m.m32345e(r7, r0)
            r3 = r7
            kotlin.f0.y.e.j0.l.e0 r3 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0) r3
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a.m37143i(kotlin.reflect.jvm.internal.impl.descriptors.e1):kotlin.f0.y.e.j0.l.e0");
    }

    /* renamed from: j */
    public static final boolean m37144j(InterfaceC10554e1 interfaceC10554e1) {
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        return m37146l(interfaceC10554e1, null, null, 6, null);
    }

    /* renamed from: k */
    public static final boolean m37145k(InterfaceC10554e1 interfaceC10554e1, InterfaceC10312e1 interfaceC10312e1, Set<? extends InterfaceC10554e1> set) {
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        List<AbstractC10311e0> upperBounds = interfaceC10554e1.getUpperBounds();
        C9768m.m32345e(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (AbstractC10311e0 abstractC10311e0 : upperBounds) {
                C9768m.m32345e(abstractC10311e0, "upperBound");
                if (m37137c(abstractC10311e0, interfaceC10554e1.mo36400s().mo35993O0(), set) && (interfaceC10312e1 == null || C9768m.m32341a(abstractC10311e0.mo35993O0(), interfaceC10312e1))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m37146l(InterfaceC10554e1 interfaceC10554e1, InterfaceC10312e1 interfaceC10312e1, Set set, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC10312e1 = null;
        }
        if ((i2 & 4) != 0) {
            set = null;
        }
        return m37145k(interfaceC10554e1, interfaceC10312e1, set);
    }

    /* renamed from: m */
    public static final boolean m37147m(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        if (!(abstractC10311e0 instanceof AbstractC10310e)) {
            if (!((abstractC10311e0 instanceof C10343p) && (((C10343p) abstractC10311e0).m36794a1() instanceof AbstractC10310e))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m37148n(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        if (!(abstractC10311e0 instanceof C10383u0)) {
            if (!((abstractC10311e0 instanceof C10343p) && (((C10343p) abstractC10311e0).m36794a1() instanceof C10383u0))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m37149o(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(abstractC10311e02, "superType");
        return InterfaceC10361e.f40181a.mo36920d(abstractC10311e0, abstractC10311e02);
    }

    /* renamed from: p */
    public static final boolean m37150p(InterfaceC10561h interfaceC10561h) {
        C9768m.m32346f(interfaceC10561h, "<this>");
        return (interfaceC10561h instanceof InterfaceC10554e1) && (((InterfaceC10554e1) interfaceC10561h).mo32876b() instanceof InterfaceC10551d1);
    }

    /* renamed from: q */
    public static final boolean m37151q(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return C10339n1.m36780m(abstractC10311e0);
    }

    /* renamed from: r */
    public static final boolean m37152r(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "type");
        return (abstractC10311e0 instanceof C10391h) && ((C10391h) abstractC10311e0).m37044Y0().m37050q();
    }

    /* renamed from: s */
    public static final AbstractC10311e0 m37153s(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        AbstractC10311e0 m36781n = C10339n1.m36781n(abstractC10311e0);
        C9768m.m32345e(m36781n, "makeNotNullable(this)");
        return m36781n;
    }

    /* renamed from: t */
    public static final AbstractC10311e0 m37154t(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        AbstractC10311e0 m36782o = C10339n1.m36782o(abstractC10311e0);
        C9768m.m32345e(m36782o, "makeNullable(this)");
        return m36782o;
    }

    /* renamed from: u */
    public static final AbstractC10311e0 m37155u(AbstractC10311e0 abstractC10311e0, InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(interfaceC10587g, "newAnnotations");
        return (abstractC10311e0.getAnnotations().isEmpty() && interfaceC10587g.isEmpty()) ? abstractC10311e0 : abstractC10311e0.mo36635R0().mo33547U0(C10303b1.m36586a(abstractC10311e0.mo35992N0(), interfaceC10587g));
    }

    /* renamed from: v */
    public static final AbstractC10311e0 m37156v(AbstractC10311e0 abstractC10311e0, C10333l1 c10333l1, Map<InterfaceC10312e1, ? extends InterfaceC10318g1> map, EnumC10351r1 enumC10351r1, Set<? extends InterfaceC10554e1> set) {
        AbstractC10348q1 abstractC10348q1;
        C9768m.m32346f(abstractC10311e0, "<this>");
        C9768m.m32346f(c10333l1, "substitutor");
        C9768m.m32346f(map, "substitutionMap");
        C9768m.m32346f(enumC10351r1, "variance");
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (mo36635R0 instanceof AbstractC10425y) {
            AbstractC10425y abstractC10425y = (AbstractC10425y) mo36635R0;
            AbstractC10335m0 m37161W0 = abstractC10425y.m37161W0();
            if (!m37161W0.mo35993O0().getParameters().isEmpty() && m37161W0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10554e1> parameters = m37161W0.mo35993O0().getParameters();
                C9768m.m32345e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
                for (InterfaceC10554e1 interfaceC10554e1 : parameters) {
                    InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) C10780s.m38833X(abstractC10311e0.mo35991M0(), interfaceC10554e1.mo37670g());
                    if ((set != null && set.contains(interfaceC10554e1)) || interfaceC10318g1 == null || !map.containsKey(interfaceC10318g1.getType().mo35993O0())) {
                        interfaceC10318g1 = new C10353s0(interfaceC10554e1);
                    }
                    arrayList.add(interfaceC10318g1);
                }
                m37161W0 = C10330k1.m36739f(m37161W0, arrayList, null, 2, null);
            }
            AbstractC10335m0 m37162X0 = abstractC10425y.m37162X0();
            if (!m37162X0.mo35993O0().getParameters().isEmpty() && m37162X0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10554e1> parameters2 = m37162X0.mo35993O0().getParameters();
                C9768m.m32345e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C10786v.m38911u(parameters2, 10));
                for (InterfaceC10554e1 interfaceC10554e12 : parameters2) {
                    InterfaceC10318g1 interfaceC10318g12 = (InterfaceC10318g1) C10780s.m38833X(abstractC10311e0.mo35991M0(), interfaceC10554e12.mo37670g());
                    if ((set != null && set.contains(interfaceC10554e12)) || interfaceC10318g12 == null || !map.containsKey(interfaceC10318g12.getType().mo35993O0())) {
                        interfaceC10318g12 = new C10353s0(interfaceC10554e12);
                    }
                    arrayList2.add(interfaceC10318g12);
                }
                m37162X0 = C10330k1.m36739f(m37162X0, arrayList2, null, 2, null);
            }
            abstractC10348q1 = C10314f0.m36664d(m37161W0, m37162X0);
        } else {
            if (!(mo36635R0 instanceof AbstractC10335m0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10335m0 abstractC10335m0 = (AbstractC10335m0) mo36635R0;
            if (abstractC10335m0.mo35993O0().getParameters().isEmpty() || abstractC10335m0.mo35993O0().mo32891w() == null) {
                abstractC10348q1 = abstractC10335m0;
            } else {
                List<InterfaceC10554e1> parameters3 = abstractC10335m0.mo35993O0().getParameters();
                C9768m.m32345e(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C10786v.m38911u(parameters3, 10));
                for (InterfaceC10554e1 interfaceC10554e13 : parameters3) {
                    InterfaceC10318g1 interfaceC10318g13 = (InterfaceC10318g1) C10780s.m38833X(abstractC10311e0.mo35991M0(), interfaceC10554e13.mo37670g());
                    if ((set != null && set.contains(interfaceC10554e13)) || interfaceC10318g13 == null || !map.containsKey(interfaceC10318g13.getType().mo35993O0())) {
                        interfaceC10318g13 = new C10353s0(interfaceC10554e13);
                    }
                    arrayList3.add(interfaceC10318g13);
                }
                abstractC10348q1 = C10330k1.m36739f(abstractC10335m0, arrayList3, null, 2, null);
            }
        }
        AbstractC10311e0 m36758n = c10333l1.m36758n(C10345p1.m36804b(abstractC10348q1, mo36635R0), enumC10351r1);
        C9768m.m32345e(m36758n, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return m36758n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.f0.y.e.j0.l.q1] */
    /* renamed from: w */
    public static final AbstractC10311e0 m37157w(AbstractC10311e0 abstractC10311e0) {
        AbstractC10335m0 abstractC10335m0;
        C9768m.m32346f(abstractC10311e0, "<this>");
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (mo36635R0 instanceof AbstractC10425y) {
            AbstractC10425y abstractC10425y = (AbstractC10425y) mo36635R0;
            AbstractC10335m0 m37161W0 = abstractC10425y.m37161W0();
            if (!m37161W0.mo35993O0().getParameters().isEmpty() && m37161W0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10554e1> parameters = m37161W0.mo35993O0().getParameters();
                C9768m.m32345e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C10786v.m38911u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C10353s0((InterfaceC10554e1) it.next()));
                }
                m37161W0 = C10330k1.m36739f(m37161W0, arrayList, null, 2, null);
            }
            AbstractC10335m0 m37162X0 = abstractC10425y.m37162X0();
            if (!m37162X0.mo35993O0().getParameters().isEmpty() && m37162X0.mo35993O0().mo32891w() != null) {
                List<InterfaceC10554e1> parameters2 = m37162X0.mo35993O0().getParameters();
                C9768m.m32345e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C10786v.m38911u(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C10353s0((InterfaceC10554e1) it2.next()));
                }
                m37162X0 = C10330k1.m36739f(m37162X0, arrayList2, null, 2, null);
            }
            abstractC10335m0 = C10314f0.m36664d(m37161W0, m37162X0);
        } else {
            if (!(mo36635R0 instanceof AbstractC10335m0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10335m0 abstractC10335m02 = (AbstractC10335m0) mo36635R0;
            boolean isEmpty = abstractC10335m02.mo35993O0().getParameters().isEmpty();
            abstractC10335m0 = abstractC10335m02;
            if (!isEmpty) {
                InterfaceC10561h mo32891w = abstractC10335m02.mo35993O0().mo32891w();
                abstractC10335m0 = abstractC10335m02;
                if (mo32891w != null) {
                    List<InterfaceC10554e1> parameters3 = abstractC10335m02.mo35993O0().getParameters();
                    C9768m.m32345e(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C10786v.m38911u(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C10353s0((InterfaceC10554e1) it3.next()));
                    }
                    abstractC10335m0 = C10330k1.m36739f(abstractC10335m02, arrayList3, null, 2, null);
                }
            }
        }
        return C10345p1.m36804b(abstractC10335m0, mo36635R0);
    }

    /* renamed from: x */
    public static final boolean m37158x(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        return m37136b(abstractC10311e0, b.f40385f);
    }
}
