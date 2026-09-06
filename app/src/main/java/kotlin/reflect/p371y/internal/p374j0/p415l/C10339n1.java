package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.utils.C10739f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10370n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10391h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: TypeUtils.java */
/* renamed from: kotlin.f0.y.e.j0.l.n1 */
/* loaded from: classes3.dex */
public class C10339n1 {

    /* renamed from: a */
    public static final AbstractC10335m0 f40152a = C10394k.m37053d(EnumC10393j.f40282H, new String[0]);

    /* renamed from: b */
    public static final AbstractC10335m0 f40153b = C10394k.m37053d(EnumC10393j.f40268A, new String[0]);

    /* renamed from: c */
    public static final AbstractC10335m0 f40154c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final AbstractC10335m0 f40155d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils.java */
    /* renamed from: kotlin.f0.y.e.j0.l.n1$a */
    public static class a extends AbstractC10349r {

        /* renamed from: g */
        private final String f40156g;

        public a(String str) {
            this.f40156g = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
        /* renamed from: a1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void m36790a1(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = 3
                goto L14
            L13:
                r5 = 2
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1.a.m36790a1(int):void");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public AbstractC10335m0 mo33545S0(boolean z) {
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
            if (c10300a1 == null) {
                m36790a1(0);
            }
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
        /* renamed from: X0 */
        protected AbstractC10335m0 mo33694X0() {
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
        /* renamed from: Z0 */
        public AbstractC10349r mo33695Z0(AbstractC10335m0 abstractC10335m0) {
            if (abstractC10335m0 == null) {
                m36790a1(2);
            }
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
        /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a mo36558Y0(AbstractC10363g abstractC10363g) {
            if (abstractC10363g == null) {
                m36790a1(3);
            }
            return this;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
        public String toString() {
            String str = this.f40156g;
            if (str == null) {
                m36790a1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m36768a(int r24) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1.m36768a(int):void");
    }

    /* renamed from: b */
    public static boolean m36769b(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(28);
        }
        if (abstractC10311e0.mo33691P0()) {
            return true;
        }
        return C10302b0.m36583b(abstractC10311e0) && m36769b(C10302b0.m36582a(abstractC10311e0).m37162X0());
    }

    /* renamed from: c */
    public static boolean m36770c(AbstractC10311e0 abstractC10311e0, Function1<AbstractC10348q1, Boolean> function1) {
        if (function1 == null) {
            m36768a(43);
        }
        return m36771d(abstractC10311e0, function1, null);
    }

    /* renamed from: d */
    private static boolean m36771d(AbstractC10311e0 abstractC10311e0, Function1<AbstractC10348q1, Boolean> function1, C10739f<AbstractC10311e0> c10739f) {
        if (function1 == null) {
            m36768a(44);
        }
        if (abstractC10311e0 == null) {
            return false;
        }
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (m36789v(abstractC10311e0)) {
            return function1.invoke(mo36635R0).booleanValue();
        }
        if (c10739f != null && c10739f.contains(abstractC10311e0)) {
            return false;
        }
        if (function1.invoke(mo36635R0).booleanValue()) {
            return true;
        }
        if (c10739f == null) {
            c10739f = C10739f.m38540c();
        }
        c10739f.add(abstractC10311e0);
        AbstractC10425y abstractC10425y = mo36635R0 instanceof AbstractC10425y ? (AbstractC10425y) mo36635R0 : null;
        if (abstractC10425y != null && (m36771d(abstractC10425y.m37161W0(), function1, c10739f) || m36771d(abstractC10425y.m37162X0(), function1, c10739f))) {
            return true;
        }
        if ((mo36635R0 instanceof C10343p) && m36771d(((C10343p) mo36635R0).m36794a1(), function1, c10739f)) {
            return true;
        }
        InterfaceC10312e1 mo35993O0 = abstractC10311e0.mo35993O0();
        if (mo35993O0 instanceof C10308d0) {
            Iterator<AbstractC10311e0> it = ((C10308d0) mo35993O0).mo35998a().iterator();
            while (it.hasNext()) {
                if (m36771d(it.next(), function1, c10739f)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC10318g1 interfaceC10318g1 : abstractC10311e0.mo35991M0()) {
            if (!interfaceC10318g1.mo36710c()) {
                if (m36771d(interfaceC10318g1.getType(), function1, c10739f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static AbstractC10311e0 m36772e(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, C10333l1 c10333l1) {
        if (abstractC10311e0 == null) {
            m36768a(20);
        }
        if (abstractC10311e02 == null) {
            m36768a(21);
        }
        if (c10333l1 == null) {
            m36768a(22);
        }
        AbstractC10311e0 m36759p = c10333l1.m36759p(abstractC10311e02, EnumC10351r1.INVARIANT);
        if (m36759p != null) {
            return m36784q(m36759p, abstractC10311e0.mo33691P0());
        }
        return null;
    }

    /* renamed from: f */
    public static InterfaceC10552e m36773f(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(30);
        }
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        if (mo32891w instanceof InterfaceC10552e) {
            return (InterfaceC10552e) mo32891w;
        }
        return null;
    }

    /* renamed from: g */
    public static List<InterfaceC10318g1> m36774g(List<InterfaceC10554e1> list) {
        if (list == null) {
            m36768a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<InterfaceC10554e1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10324i1(it.next().mo36400s()));
        }
        List<InterfaceC10318g1> m38569E0 = C10749c0.m38569E0(arrayList);
        if (m38569E0 == null) {
            m36768a(17);
        }
        return m38569E0;
    }

    /* renamed from: h */
    public static List<AbstractC10311e0> m36775h(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(18);
        }
        C10333l1 m36746f = C10333l1.m36746f(abstractC10311e0);
        Collection<AbstractC10311e0> mo35998a = abstractC10311e0.mo35993O0().mo35998a();
        ArrayList arrayList = new ArrayList(mo35998a.size());
        Iterator<AbstractC10311e0> it = mo35998a.iterator();
        while (it.hasNext()) {
            AbstractC10311e0 m36772e = m36772e(abstractC10311e0, it.next(), m36746f);
            if (m36772e != null) {
                arrayList.add(m36772e);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static InterfaceC10554e1 m36776i(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(62);
        }
        if (abstractC10311e0.mo35993O0().mo32891w() instanceof InterfaceC10554e1) {
            return (InterfaceC10554e1) abstractC10311e0.mo35993O0().mo32891w();
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m36777j(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(29);
        }
        if (abstractC10311e0.mo35993O0().mo32891w() instanceof InterfaceC10552e) {
            return false;
        }
        Iterator<AbstractC10311e0> it = m36775h(abstractC10311e0).iterator();
        while (it.hasNext()) {
            if (m36779l(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m36778k(AbstractC10311e0 abstractC10311e0) {
        return abstractC10311e0 != null && abstractC10311e0.mo35993O0() == f40152a.mo35993O0();
    }

    /* renamed from: l */
    public static boolean m36779l(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(27);
        }
        if (abstractC10311e0.mo33691P0()) {
            return true;
        }
        if (C10302b0.m36583b(abstractC10311e0) && m36779l(C10302b0.m36582a(abstractC10311e0).m37162X0())) {
            return true;
        }
        if (C10347q0.m36809c(abstractC10311e0)) {
            return false;
        }
        if (m36780m(abstractC10311e0)) {
            return m36777j(abstractC10311e0);
        }
        if (abstractC10311e0 instanceof AbstractC10310e) {
            InterfaceC10554e1 m36954d = ((AbstractC10310e) abstractC10311e0).m36631X0().m36954d();
            return m36954d == null || m36777j(m36954d.mo36400s());
        }
        InterfaceC10312e1 mo35993O0 = abstractC10311e0.mo35993O0();
        if (mo35993O0 instanceof C10308d0) {
            Iterator<AbstractC10311e0> it = mo35993O0.mo35998a().iterator();
            while (it.hasNext()) {
                if (m36779l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m36780m(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(59);
        }
        return m36776i(abstractC10311e0) != null || (abstractC10311e0.mo35993O0() instanceof InterfaceC10370n);
    }

    /* renamed from: n */
    public static AbstractC10311e0 m36781n(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(2);
        }
        return m36783p(abstractC10311e0, false);
    }

    /* renamed from: o */
    public static AbstractC10311e0 m36782o(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(1);
        }
        return m36783p(abstractC10311e0, true);
    }

    /* renamed from: p */
    public static AbstractC10311e0 m36783p(AbstractC10311e0 abstractC10311e0, boolean z) {
        if (abstractC10311e0 == null) {
            m36768a(3);
        }
        AbstractC10348q1 mo33545S0 = abstractC10311e0.mo36635R0().mo33545S0(z);
        if (mo33545S0 == null) {
            m36768a(4);
        }
        return mo33545S0;
    }

    /* renamed from: q */
    public static AbstractC10311e0 m36784q(AbstractC10311e0 abstractC10311e0, boolean z) {
        if (abstractC10311e0 == null) {
            m36768a(8);
        }
        if (z) {
            return m36782o(abstractC10311e0);
        }
        if (abstractC10311e0 == null) {
            m36768a(9);
        }
        return abstractC10311e0;
    }

    /* renamed from: r */
    public static AbstractC10335m0 m36785r(AbstractC10335m0 abstractC10335m0, boolean z) {
        if (abstractC10335m0 == null) {
            m36768a(5);
        }
        if (!z) {
            if (abstractC10335m0 == null) {
                m36768a(7);
            }
            return abstractC10335m0;
        }
        AbstractC10335m0 mo33545S0 = abstractC10335m0.mo33545S0(true);
        if (mo33545S0 == null) {
            m36768a(6);
        }
        return mo33545S0;
    }

    /* renamed from: s */
    public static InterfaceC10318g1 m36786s(InterfaceC10554e1 interfaceC10554e1) {
        if (interfaceC10554e1 == null) {
            m36768a(45);
        }
        return new C10353s0(interfaceC10554e1);
    }

    /* renamed from: t */
    public static AbstractC10335m0 m36787t(InterfaceC10561h interfaceC10561h, InterfaceC10218h interfaceC10218h, Function1<AbstractC10363g, AbstractC10335m0> function1) {
        if (!C10394k.m37054m(interfaceC10561h)) {
            return m36788u(interfaceC10561h.mo32877h(), interfaceC10218h, function1);
        }
        C10391h m37053d = C10394k.m37053d(EnumC10393j.f40280G, interfaceC10561h.toString());
        if (m37053d == null) {
            m36768a(11);
        }
        return m37053d;
    }

    /* renamed from: u */
    public static AbstractC10335m0 m36788u(InterfaceC10312e1 interfaceC10312e1, InterfaceC10218h interfaceC10218h, Function1<AbstractC10363g, AbstractC10335m0> function1) {
        if (interfaceC10312e1 == null) {
            m36768a(12);
        }
        if (interfaceC10218h == null) {
            m36768a(13);
        }
        if (function1 == null) {
            m36768a(14);
        }
        AbstractC10335m0 m36671k = C10314f0.m36671k(C10300a1.f40041g.m36577h(), interfaceC10312e1, m36774g(interfaceC10312e1.getParameters()), false, interfaceC10218h, function1);
        if (m36671k == null) {
            m36768a(15);
        }
        return m36671k;
    }

    /* renamed from: v */
    public static boolean m36789v(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36768a(0);
        }
        return abstractC10311e0 == f40154c || abstractC10311e0 == f40155d;
    }
}
