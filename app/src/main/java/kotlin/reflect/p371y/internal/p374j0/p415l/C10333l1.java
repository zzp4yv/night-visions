package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10591k;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10592l;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.utils.C10736c;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10170d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10366j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10391h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;
import kotlin.reflect.p371y.internal.p374j0.p415l.p421y1.C10428b;

/* compiled from: TypeSubstitutor.java */
/* renamed from: kotlin.f0.y.e.j0.l.l1 */
/* loaded from: classes3.dex */
public class C10333l1 {

    /* renamed from: a */
    public static final C10333l1 f40139a = m36747g(AbstractC10327j1.f40132b);

    /* renamed from: b */
    private final AbstractC10327j1 f40140b;

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$a */
    static class a implements Function1<C10127c, Boolean> {
        a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m36762b(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(C10127c c10127c) {
            if (c10127c == null) {
                m36762b(0);
            }
            return Boolean.valueOf(!c10127c.equals(C9884k.a.f37550Q));
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f40141a;

        static {
            int[] iArr = new int[d.values().length];
            f40141a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40141a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40141a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$c */
    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$d */
    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C10333l1(AbstractC10327j1 abstractC10327j1) {
        if (abstractC10327j1 == null) {
            m36741a(7);
        }
        this.f40140b = abstractC10327j1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m36741a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1.m36741a(int):void");
    }

    /* renamed from: b */
    private static void m36742b(int i2, InterfaceC10318g1 interfaceC10318g1, AbstractC10327j1 abstractC10327j1) {
        if (i2 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m36751o(interfaceC10318g1) + "; substitution: " + m36751o(abstractC10327j1));
    }

    /* renamed from: c */
    public static EnumC10351r1 m36743c(EnumC10351r1 enumC10351r1, InterfaceC10318g1 interfaceC10318g1) {
        if (enumC10351r1 == null) {
            m36741a(35);
        }
        if (interfaceC10318g1 == null) {
            m36741a(36);
        }
        if (!interfaceC10318g1.mo36710c()) {
            return m36744d(enumC10351r1, interfaceC10318g1.mo36708a());
        }
        EnumC10351r1 enumC10351r12 = EnumC10351r1.OUT_VARIANCE;
        if (enumC10351r12 == null) {
            m36741a(37);
        }
        return enumC10351r12;
    }

    /* renamed from: d */
    public static EnumC10351r1 m36744d(EnumC10351r1 enumC10351r1, EnumC10351r1 enumC10351r12) {
        if (enumC10351r1 == null) {
            m36741a(38);
        }
        if (enumC10351r12 == null) {
            m36741a(39);
        }
        EnumC10351r1 enumC10351r13 = EnumC10351r1.INVARIANT;
        if (enumC10351r1 == enumC10351r13) {
            if (enumC10351r12 == null) {
                m36741a(40);
            }
            return enumC10351r12;
        }
        if (enumC10351r12 == enumC10351r13) {
            if (enumC10351r1 == null) {
                m36741a(41);
            }
            return enumC10351r1;
        }
        if (enumC10351r1 == enumC10351r12) {
            if (enumC10351r12 == null) {
                m36741a(42);
            }
            return enumC10351r12;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC10351r1 + "' and projection kind '" + enumC10351r12 + "' cannot be combined");
    }

    /* renamed from: e */
    private static d m36745e(EnumC10351r1 enumC10351r1, EnumC10351r1 enumC10351r12) {
        EnumC10351r1 enumC10351r13 = EnumC10351r1.IN_VARIANCE;
        return (enumC10351r1 == enumC10351r13 && enumC10351r12 == EnumC10351r1.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (enumC10351r1 == EnumC10351r1.OUT_VARIANCE && enumC10351r12 == enumC10351r13) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    /* renamed from: f */
    public static C10333l1 m36746f(AbstractC10311e0 abstractC10311e0) {
        if (abstractC10311e0 == null) {
            m36741a(6);
        }
        return m36747g(AbstractC10315f1.m36677i(abstractC10311e0.mo35993O0(), abstractC10311e0.mo35991M0()));
    }

    /* renamed from: g */
    public static C10333l1 m36747g(AbstractC10327j1 abstractC10327j1) {
        if (abstractC10327j1 == null) {
            m36741a(0);
        }
        return new C10333l1(abstractC10327j1);
    }

    /* renamed from: h */
    public static C10333l1 m36748h(AbstractC10327j1 abstractC10327j1, AbstractC10327j1 abstractC10327j12) {
        if (abstractC10327j1 == null) {
            m36741a(3);
        }
        if (abstractC10327j12 == null) {
            m36741a(4);
        }
        return m36747g(C10382u.m36983i(abstractC10327j1, abstractC10327j12));
    }

    /* renamed from: i */
    private static InterfaceC10587g m36749i(InterfaceC10587g interfaceC10587g) {
        if (interfaceC10587g == null) {
            m36741a(33);
        }
        return !interfaceC10587g.mo33270R0(C9884k.a.f37550Q) ? interfaceC10587g : new C10592l(interfaceC10587g, new a());
    }

    /* renamed from: l */
    private static InterfaceC10318g1 m36750l(AbstractC10311e0 abstractC10311e0, InterfaceC10318g1 interfaceC10318g1, InterfaceC10554e1 interfaceC10554e1, InterfaceC10318g1 interfaceC10318g12) {
        if (abstractC10311e0 == null) {
            m36741a(26);
        }
        if (interfaceC10318g1 == null) {
            m36741a(27);
        }
        if (interfaceC10318g12 == null) {
            m36741a(28);
        }
        if (!abstractC10311e0.getAnnotations().mo33270R0(C9884k.a.f37550Q)) {
            if (interfaceC10318g1 == null) {
                m36741a(29);
            }
            return interfaceC10318g1;
        }
        InterfaceC10312e1 mo35993O0 = interfaceC10318g1.getType().mo35993O0();
        if (!(mo35993O0 instanceof C10366j)) {
            return interfaceC10318g1;
        }
        InterfaceC10318g1 mo35997f = ((C10366j) mo35993O0).mo35997f();
        EnumC10351r1 mo36708a = mo35997f.mo36708a();
        d m36745e = m36745e(interfaceC10318g12.mo36708a(), mo36708a);
        d dVar = d.OUT_IN_IN_POSITION;
        return m36745e == dVar ? new C10324i1(mo35997f.getType()) : (interfaceC10554e1 != null && m36745e(interfaceC10554e1.mo37672n(), mo36708a) == dVar) ? new C10324i1(mo35997f.getType()) : interfaceC10318g1;
    }

    /* renamed from: o */
    private static String m36751o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (C10736c.m38523a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* renamed from: r */
    private InterfaceC10318g1 m36752r(InterfaceC10318g1 interfaceC10318g1, int i2) throws c {
        AbstractC10311e0 type = interfaceC10318g1.getType();
        EnumC10351r1 mo36708a = interfaceC10318g1.mo36708a();
        if (type.mo35993O0().mo32887c() instanceof InterfaceC10554e1) {
            return interfaceC10318g1;
        }
        AbstractC10335m0 m36808b = C10347q0.m36808b(type);
        AbstractC10311e0 m36759p = m36808b != null ? m36757m().m36759p(m36808b, EnumC10351r1.INVARIANT) : null;
        AbstractC10311e0 m36735b = C10330k1.m36735b(type, m36753s(type.mo35993O0().getParameters(), type.mo35991M0(), i2), this.f40140b.mo36727d(type.getAnnotations()));
        if ((m36735b instanceof AbstractC10335m0) && (m36759p instanceof AbstractC10335m0)) {
            m36735b = C10347q0.m36816j((AbstractC10335m0) m36735b, (AbstractC10335m0) m36759p);
        }
        return new C10324i1(mo36708a, m36735b);
    }

    /* renamed from: s */
    private List<InterfaceC10318g1> m36753s(List<InterfaceC10554e1> list, List<InterfaceC10318g1> list2, int i2) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i3 = 0; i3 < list.size(); i3++) {
            InterfaceC10554e1 interfaceC10554e1 = list.get(i3);
            InterfaceC10318g1 interfaceC10318g1 = list2.get(i3);
            InterfaceC10318g1 m36754u = m36754u(interfaceC10318g1, interfaceC10554e1, i2 + 1);
            int i4 = b.f40141a[m36745e(interfaceC10554e1.mo37672n(), m36754u.mo36708a()).ordinal()];
            if (i4 == 1 || i4 == 2) {
                m36754u = C10339n1.m36786s(interfaceC10554e1);
            } else if (i4 == 3) {
                EnumC10351r1 mo37672n = interfaceC10554e1.mo37672n();
                EnumC10351r1 enumC10351r1 = EnumC10351r1.INVARIANT;
                if (mo37672n != enumC10351r1 && !m36754u.mo36710c()) {
                    m36754u = new C10324i1(enumC10351r1, m36754u.getType());
                }
            }
            if (m36754u != interfaceC10318g1) {
                z = true;
            }
            arrayList.add(m36754u);
        }
        return !z ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private InterfaceC10318g1 m36754u(InterfaceC10318g1 interfaceC10318g1, InterfaceC10554e1 interfaceC10554e1, int i2) throws c {
        if (interfaceC10318g1 == null) {
            m36741a(18);
        }
        m36742b(i2, interfaceC10318g1, this.f40140b);
        if (interfaceC10318g1.mo36710c()) {
            return interfaceC10318g1;
        }
        AbstractC10311e0 type = interfaceC10318g1.getType();
        if (type instanceof InterfaceC10342o1) {
            InterfaceC10342o1 interfaceC10342o1 = (InterfaceC10342o1) type;
            AbstractC10348q1 mo36566v = interfaceC10342o1.mo36566v();
            AbstractC10311e0 mo36563H = interfaceC10342o1.mo36563H();
            InterfaceC10318g1 m36754u = m36754u(new C10324i1(interfaceC10318g1.mo36708a(), mo36566v), interfaceC10554e1, i2 + 1);
            return m36754u.mo36710c() ? m36754u : new C10324i1(m36754u.mo36708a(), C10345p1.m36806d(m36754u.getType().mo36635R0(), m36759p(mo36563H, interfaceC10318g1.mo36708a())));
        }
        if (!C10399w.m37085a(type) && !(type.mo36635R0() instanceof InterfaceC10332l0)) {
            InterfaceC10318g1 mo33536e = this.f40140b.mo33536e(type);
            InterfaceC10318g1 m36750l = mo33536e != null ? m36750l(type, mo33536e, interfaceC10554e1, interfaceC10318g1) : null;
            EnumC10351r1 mo36708a = interfaceC10318g1.mo36708a();
            if (m36750l == null && C10302b0.m36583b(type) && !C10306c1.m36596b(type)) {
                AbstractC10425y m36582a = C10302b0.m36582a(type);
                int i3 = i2 + 1;
                InterfaceC10318g1 m36754u2 = m36754u(new C10324i1(mo36708a, m36582a.m37161W0()), interfaceC10554e1, i3);
                InterfaceC10318g1 m36754u3 = m36754u(new C10324i1(mo36708a, m36582a.m37162X0()), interfaceC10554e1, i3);
                return (m36754u2.getType() == m36582a.m37161W0() && m36754u3.getType() == m36582a.m37162X0()) ? interfaceC10318g1 : new C10324i1(m36754u2.mo36708a(), C10314f0.m36664d(C10330k1.m36734a(m36754u2.getType()), C10330k1.m36734a(m36754u3.getType())));
            }
            if (!AbstractC9881h.m32750m0(type) && !C10317g0.m36706a(type)) {
                if (m36750l != null) {
                    d m36745e = m36745e(mo36708a, m36750l.mo36708a());
                    if (!C10170d.m36008d(type)) {
                        int i4 = b.f40141a[m36745e.ordinal()];
                        if (i4 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i4 == 2) {
                            return new C10324i1(EnumC10351r1.OUT_VARIANCE, type.mo35993O0().mo36004o().m32774I());
                        }
                    }
                    InterfaceC10337n m36595a = C10306c1.m36595a(type);
                    if (m36750l.mo36710c()) {
                        return m36750l;
                    }
                    AbstractC10311e0 mo33690K = m36595a != null ? m36595a.mo33690K(m36750l.getType()) : C10339n1.m36784q(m36750l.getType(), type.mo33691P0());
                    if (!type.getAnnotations().isEmpty()) {
                        mo33690K = C10424a.m37155u(mo33690K, new C10591k(mo33690K.getAnnotations(), m36749i(this.f40140b.mo36727d(type.getAnnotations()))));
                    }
                    if (m36745e == d.NO_CONFLICT) {
                        mo36708a = m36744d(mo36708a, m36750l.mo36708a());
                    }
                    return new C10324i1(mo36708a, mo33690K);
                }
                interfaceC10318g1 = m36752r(interfaceC10318g1, i2);
                if (interfaceC10318g1 == null) {
                    m36741a(25);
                }
            }
        }
        return interfaceC10318g1;
    }

    /* renamed from: j */
    public AbstractC10327j1 m36755j() {
        AbstractC10327j1 abstractC10327j1 = this.f40140b;
        if (abstractC10327j1 == null) {
            m36741a(8);
        }
        return abstractC10327j1;
    }

    /* renamed from: k */
    public boolean m36756k() {
        return this.f40140b.mo33537f();
    }

    /* renamed from: m */
    public C10333l1 m36757m() {
        AbstractC10327j1 abstractC10327j1 = this.f40140b;
        return ((abstractC10327j1 instanceof C10305c0) && abstractC10327j1.mo36012b()) ? new C10333l1(new C10305c0(((C10305c0) this.f40140b).m36594j(), ((C10305c0) this.f40140b).m36593i(), false)) : this;
    }

    /* renamed from: n */
    public AbstractC10311e0 m36758n(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1) {
        if (abstractC10311e0 == null) {
            m36741a(9);
        }
        if (enumC10351r1 == null) {
            m36741a(10);
        }
        if (m36756k()) {
            if (abstractC10311e0 == null) {
                m36741a(11);
            }
            return abstractC10311e0;
        }
        try {
            AbstractC10311e0 type = m36754u(new C10324i1(enumC10351r1, abstractC10311e0), null, 0).getType();
            if (type == null) {
                m36741a(12);
            }
            return type;
        } catch (c e2) {
            C10391h m37053d = C10394k.m37053d(EnumC10393j.f40280G, e2.getMessage());
            if (m37053d == null) {
                m36741a(13);
            }
            return m37053d;
        }
    }

    /* renamed from: p */
    public AbstractC10311e0 m36759p(AbstractC10311e0 abstractC10311e0, EnumC10351r1 enumC10351r1) {
        if (abstractC10311e0 == null) {
            m36741a(14);
        }
        if (enumC10351r1 == null) {
            m36741a(15);
        }
        InterfaceC10318g1 m36760q = m36760q(new C10324i1(enumC10351r1, m36755j().mo36728g(abstractC10311e0, enumC10351r1)));
        if (m36760q == null) {
            return null;
        }
        return m36760q.getType();
    }

    /* renamed from: q */
    public InterfaceC10318g1 m36760q(InterfaceC10318g1 interfaceC10318g1) {
        if (interfaceC10318g1 == null) {
            m36741a(16);
        }
        InterfaceC10318g1 m36761t = m36761t(interfaceC10318g1);
        return (this.f40140b.mo36685a() || this.f40140b.mo36012b()) ? C10428b.m37169c(m36761t, this.f40140b.mo36012b()) : m36761t;
    }

    /* renamed from: t */
    public InterfaceC10318g1 m36761t(InterfaceC10318g1 interfaceC10318g1) {
        if (interfaceC10318g1 == null) {
            m36741a(17);
        }
        if (m36756k()) {
            return interfaceC10318g1;
        }
        try {
            return m36754u(interfaceC10318g1, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
