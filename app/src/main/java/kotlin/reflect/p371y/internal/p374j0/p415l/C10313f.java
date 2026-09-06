package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10742u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.C10401a;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10402b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10421u;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10404d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10405e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10408h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10412l;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10413m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10414n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10415o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10416p;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10420t;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.f */
/* loaded from: classes3.dex */
public final class C10313f {

    /* renamed from: a */
    public static final C10313f f40078a = new C10313f();

    /* renamed from: b */
    public static boolean f40079b;

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40080a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40081b;

        static {
            int[] iArr = new int[EnumC10421u.values().length];
            iArr[EnumC10421u.INV.ordinal()] = 1;
            iArr[EnumC10421u.OUT.ordinal()] = 2;
            iArr[EnumC10421u.IN.ordinal()] = 3;
            f40080a = iArr;
            int[] iArr2 = new int[C10309d1.b.values().length];
            iArr2[C10309d1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[C10309d1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[C10309d1.b.SKIP_LOWER.ordinal()] = 3;
            f40081b = iArr2;
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f$b */
    static final class b extends Lambda implements Function1<C10309d1.a, C10742u> {

        /* renamed from: f */
        final /* synthetic */ List<InterfaceC10411k> f40082f;

        /* renamed from: g */
        final /* synthetic */ C10309d1 f40083g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC10416p f40084h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC10411k f40085i;

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.f$b$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f */
            final /* synthetic */ C10309d1 f40086f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC10416p f40087g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC10411k f40088h;

            /* renamed from: i */
            final /* synthetic */ InterfaceC10411k f40089i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10309d1 c10309d1, InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
                super(0);
                this.f40086f = c10309d1;
                this.f40087g = interfaceC10416p;
                this.f40088h = interfaceC10411k;
                this.f40089i = interfaceC10411k2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C10313f.f40078a.m36656q(this.f40086f, this.f40087g.mo35967r(this.f40088h), this.f40089i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends InterfaceC10411k> list, C10309d1 c10309d1, InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k) {
            super(1);
            this.f40082f = list;
            this.f40083g = c10309d1;
            this.f40084h = interfaceC10416p;
            this.f40085i = interfaceC10411k;
        }

        /* renamed from: b */
        public final void m36659b(C10309d1.a aVar) {
            C9768m.m32346f(aVar, "$this$runForkingPoint");
            Iterator<InterfaceC10411k> it = this.f40082f.iterator();
            while (it.hasNext()) {
                aVar.mo36626a(new a(this.f40083g, this.f40084h, it.next(), this.f40085i));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10742u invoke(C10309d1.a aVar) {
            m36659b(aVar);
            return C10742u.f41439a;
        }
    }

    private C10313f() {
    }

    /* renamed from: a */
    private final Boolean m36636a(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (!m36618j.mo35916J(interfaceC10411k) && !m36618j.mo35916J(interfaceC10411k2)) {
            return null;
        }
        if (m36639d(m36618j, interfaceC10411k) && m36639d(m36618j, interfaceC10411k2)) {
            return Boolean.TRUE;
        }
        if (m36618j.mo35916J(interfaceC10411k)) {
            if (m36640e(m36618j, c10309d1, interfaceC10411k, interfaceC10411k2, false)) {
                return Boolean.TRUE;
            }
        } else if (m36618j.mo35916J(interfaceC10411k2) && (m36638c(m36618j, interfaceC10411k) || m36640e(m36618j, c10309d1, interfaceC10411k2, interfaceC10411k, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: b */
    private static final boolean m36637b(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k) {
        if (!(interfaceC10411k instanceof InterfaceC10404d)) {
            return false;
        }
        InterfaceC10413m mo35925S = interfaceC10416p.mo35925S(interfaceC10416p.mo35940d0((InterfaceC10404d) interfaceC10411k));
        return !interfaceC10416p.mo35918L(mo35925S) && interfaceC10416p.mo35916J(interfaceC10416p.mo35926T(interfaceC10416p.mo35980x0(mo35925S)));
    }

    /* renamed from: c */
    private static final boolean m36638c(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k) {
        boolean z;
        InterfaceC10414n mo35937c = interfaceC10416p.mo35937c(interfaceC10411k);
        if (mo35937c instanceof InterfaceC10408h) {
            Collection<InterfaceC10409i> mo35971t = interfaceC10416p.mo35971t(mo35937c);
            if (!(mo35971t instanceof Collection) || !mo35971t.isEmpty()) {
                Iterator<T> it = mo35971t.iterator();
                while (it.hasNext()) {
                    InterfaceC10411k mo35933a = interfaceC10416p.mo35933a((InterfaceC10409i) it.next());
                    if (mo35933a != null && interfaceC10416p.mo35916J(mo35933a)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static final boolean m36639d(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k) {
        return interfaceC10416p.mo35916J(interfaceC10411k) || m36637b(interfaceC10416p, interfaceC10411k);
    }

    /* renamed from: e */
    private static final boolean m36640e(InterfaceC10416p interfaceC10416p, C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2, boolean z) {
        Collection<InterfaceC10409i> mo35975v = interfaceC10416p.mo35975v(interfaceC10411k);
        if (!(mo35975v instanceof Collection) || !mo35975v.isEmpty()) {
            for (InterfaceC10409i interfaceC10409i : mo35975v) {
                if (C9768m.m32341a(interfaceC10416p.mo35977w(interfaceC10409i), interfaceC10416p.mo35937c(interfaceC10411k2)) || (z && m36649t(f40078a, c10309d1, interfaceC10411k2, interfaceC10409i, false, 8, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        if (r10 != false) goto L82;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean m36641f(kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1 r15, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k r16, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10313f.m36641f(kotlin.f0.y.e.j0.l.d1, kotlin.f0.y.e.j0.l.w1.k, kotlin.f0.y.e.j0.l.w1.k):java.lang.Boolean");
    }

    /* renamed from: g */
    private final List<InterfaceC10411k> m36642g(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n) {
        String m38599e0;
        C10309d1.c mo35901A;
        InterfaceC10416p m36618j = c10309d1.m36618j();
        List<InterfaceC10411k> mo35959n = m36618j.mo35959n(interfaceC10411k, interfaceC10414n);
        if (mo35959n != null) {
            return mo35959n;
        }
        if (!m36618j.mo35928V(interfaceC10414n) && m36618j.mo35976v0(interfaceC10411k)) {
            return C10784u.m38888j();
        }
        if (m36618j.mo35974u0(interfaceC10414n)) {
            if (!m36618j.mo35902A0(m36618j.mo35937c(interfaceC10411k), interfaceC10414n)) {
                return C10784u.m38888j();
            }
            InterfaceC10411k mo35968r0 = m36618j.mo35968r0(interfaceC10411k, EnumC10402b.FOR_SUBTYPING);
            if (mo35968r0 != null) {
                interfaceC10411k = mo35968r0;
            }
            return C10782t.m38883e(interfaceC10411k);
        }
        C10738e c10738e = new C10738e();
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
                InterfaceC10411k mo35968r02 = m36618j.mo35968r0(pop, EnumC10402b.FOR_SUBTYPING);
                if (mo35968r02 == null) {
                    mo35968r02 = pop;
                }
                if (m36618j.mo35902A0(m36618j.mo35937c(mo35968r02), interfaceC10414n)) {
                    c10738e.add(mo35968r02);
                    mo35901A = C10309d1.c.C11522c.f40071a;
                } else {
                    mo35901A = m36618j.mo35951j(mo35968r02) == 0 ? C10309d1.c.b.f40070a : c10309d1.m36618j().mo35901A(mo35968r02);
                }
                if (!(!C9768m.m32341a(mo35901A, C10309d1.c.C11522c.f40071a))) {
                    mo35901A = null;
                }
                if (mo35901A != null) {
                    InterfaceC10416p m36618j2 = c10309d1.m36618j();
                    Iterator<InterfaceC10409i> it = m36618j2.mo35971t(m36618j2.mo35937c(pop)).iterator();
                    while (it.hasNext()) {
                        m36616h.add(mo35901A.mo36629a(c10309d1, it.next()));
                    }
                }
            }
        }
        c10309d1.m36614e();
        return c10738e;
    }

    /* renamed from: h */
    private final List<InterfaceC10411k> m36643h(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n) {
        return m36652w(c10309d1, m36642g(c10309d1, interfaceC10411k, interfaceC10414n));
    }

    /* renamed from: i */
    private final boolean m36644i(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2, boolean z) {
        InterfaceC10416p m36618j = c10309d1.m36618j();
        InterfaceC10409i m36623o = c10309d1.m36623o(c10309d1.m36624p(interfaceC10409i));
        InterfaceC10409i m36623o2 = c10309d1.m36623o(c10309d1.m36624p(interfaceC10409i2));
        C10313f c10313f = f40078a;
        Boolean m36641f = c10313f.m36641f(c10309d1, m36618j.mo35948h0(m36623o), m36618j.mo35926T(m36623o2));
        if (m36641f == null) {
            Boolean m36613c = c10309d1.m36613c(m36623o, m36623o2, z);
            return m36613c != null ? m36613c.booleanValue() : c10313f.m36650u(c10309d1, m36618j.mo35948h0(m36623o), m36618j.mo35926T(m36623o2));
        }
        boolean booleanValue = m36641f.booleanValue();
        c10309d1.m36613c(m36623o, m36623o2, z);
        return booleanValue;
    }

    /* renamed from: m */
    private final InterfaceC10415o m36645m(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        InterfaceC10409i mo35980x0;
        int mo35951j = interfaceC10416p.mo35951j(interfaceC10409i);
        int i2 = 0;
        while (true) {
            if (i2 >= mo35951j) {
                return null;
            }
            InterfaceC10413m mo35946g0 = interfaceC10416p.mo35946g0(interfaceC10409i, i2);
            InterfaceC10413m interfaceC10413m = interfaceC10416p.mo35918L(mo35946g0) ^ true ? mo35946g0 : null;
            if (interfaceC10413m != null && (mo35980x0 = interfaceC10416p.mo35980x0(interfaceC10413m)) != null) {
                boolean z = interfaceC10416p.mo35903B(interfaceC10416p.mo35948h0(mo35980x0)) && interfaceC10416p.mo35903B(interfaceC10416p.mo35948h0(interfaceC10409i2));
                if (C9768m.m32341a(mo35980x0, interfaceC10409i2) || (z && C9768m.m32341a(interfaceC10416p.mo35977w(mo35980x0), interfaceC10416p.mo35977w(interfaceC10409i2)))) {
                    break;
                }
                InterfaceC10415o m36645m = m36645m(interfaceC10416p, mo35980x0, interfaceC10409i2);
                if (m36645m != null) {
                    return m36645m;
                }
            }
            i2++;
        }
        return interfaceC10416p.mo35907D(interfaceC10416p.mo35977w(interfaceC10409i), i2);
    }

    /* renamed from: n */
    private final boolean m36646n(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k) {
        String m38599e0;
        InterfaceC10416p m36618j = c10309d1.m36618j();
        InterfaceC10414n mo35937c = m36618j.mo35937c(interfaceC10411k);
        if (m36618j.mo35928V(mo35937c)) {
            return m36618j.mo35963p(mo35937c);
        }
        if (m36618j.mo35963p(m36618j.mo35937c(interfaceC10411k))) {
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
                C10309d1.c cVar = m36618j.mo35976v0(pop) ? C10309d1.c.C11522c.f40071a : C10309d1.c.b.f40070a;
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
                        if (m36618j.mo35963p(m36618j.mo35937c(mo36629a))) {
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

    /* renamed from: o */
    private final boolean m36647o(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
        return (!interfaceC10416p.mo35979x(interfaceC10416p.mo35977w(interfaceC10409i)) || interfaceC10416p.mo35969s(interfaceC10409i) || interfaceC10416p.mo35905C(interfaceC10409i) || interfaceC10416p.mo35915I(interfaceC10409i) || !C9768m.m32341a(interfaceC10416p.mo35937c(interfaceC10416p.mo35948h0(interfaceC10409i)), interfaceC10416p.mo35937c(interfaceC10416p.mo35926T(interfaceC10409i)))) ? false : true;
    }

    /* renamed from: p */
    private final boolean m36648p(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
        InterfaceC10411k interfaceC10411k3;
        InterfaceC10411k interfaceC10411k4;
        InterfaceC10405e mo35970s0 = interfaceC10416p.mo35970s0(interfaceC10411k);
        if (mo35970s0 == null || (interfaceC10411k3 = interfaceC10416p.mo35913H(mo35970s0)) == null) {
            interfaceC10411k3 = interfaceC10411k;
        }
        InterfaceC10405e mo35970s02 = interfaceC10416p.mo35970s0(interfaceC10411k2);
        if (mo35970s02 == null || (interfaceC10411k4 = interfaceC10416p.mo35913H(mo35970s02)) == null) {
            interfaceC10411k4 = interfaceC10411k2;
        }
        if (interfaceC10416p.mo35937c(interfaceC10411k3) != interfaceC10416p.mo35937c(interfaceC10411k4)) {
            return false;
        }
        if (interfaceC10416p.mo35905C(interfaceC10411k) || !interfaceC10416p.mo35905C(interfaceC10411k2)) {
            return !interfaceC10416p.mo35929W(interfaceC10411k) || interfaceC10416p.mo35929W(interfaceC10411k2);
        }
        return false;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m36649t(C10313f c10313f, C10309d1 c10309d1, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        return c10313f.m36658s(c10309d1, interfaceC10409i, interfaceC10409i2, z);
    }

    /* renamed from: u */
    private final boolean m36650u(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
        InterfaceC10409i mo35980x0;
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (f40079b) {
            if (!m36618j.mo35935b(interfaceC10411k) && !m36618j.mo35932Z(m36618j.mo35937c(interfaceC10411k))) {
                c10309d1.m36620l(interfaceC10411k);
            }
            if (!m36618j.mo35935b(interfaceC10411k2)) {
                c10309d1.m36620l(interfaceC10411k2);
            }
        }
        if (!C10304c.f40043a.m36592d(c10309d1, interfaceC10411k, interfaceC10411k2)) {
            return false;
        }
        C10313f c10313f = f40078a;
        Boolean m36636a = c10313f.m36636a(c10309d1, m36618j.mo35948h0(interfaceC10411k), m36618j.mo35926T(interfaceC10411k2));
        if (m36636a != null) {
            boolean booleanValue = m36636a.booleanValue();
            C10309d1.m36612d(c10309d1, interfaceC10411k, interfaceC10411k2, false, 4, null);
            return booleanValue;
        }
        InterfaceC10414n mo35937c = m36618j.mo35937c(interfaceC10411k2);
        if ((m36618j.mo35902A0(m36618j.mo35937c(interfaceC10411k), mo35937c) && m36618j.mo35947h(mo35937c) == 0) || m36618j.mo35954k0(m36618j.mo35937c(interfaceC10411k2))) {
            return true;
        }
        List<InterfaceC10411k> m36655l = c10313f.m36655l(c10309d1, interfaceC10411k, mo35937c);
        int i2 = 10;
        ArrayList<InterfaceC10411k> arrayList = new ArrayList(C10786v.m38911u(m36655l, 10));
        for (InterfaceC10411k interfaceC10411k3 : m36655l) {
            InterfaceC10411k mo35933a = m36618j.mo35933a(c10309d1.m36623o(interfaceC10411k3));
            if (mo35933a != null) {
                interfaceC10411k3 = mo35933a;
            }
            arrayList.add(interfaceC10411k3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f40078a.m36646n(c10309d1, interfaceC10411k);
        }
        if (size == 1) {
            return f40078a.m36656q(c10309d1, m36618j.mo35967r((InterfaceC10411k) C10780s.m38830U(arrayList)), interfaceC10411k2);
        }
        C10401a c10401a = new C10401a(m36618j.mo35947h(mo35937c));
        int mo35947h = m36618j.mo35947h(mo35937c);
        int i3 = 0;
        boolean z = false;
        while (i3 < mo35947h) {
            z = z || m36618j.mo35920N(m36618j.mo35907D(mo35937c, i3)) != EnumC10421u.OUT;
            if (!z) {
                ArrayList arrayList2 = new ArrayList(C10786v.m38911u(arrayList, i2));
                for (InterfaceC10411k interfaceC10411k4 : arrayList) {
                    InterfaceC10413m mo35908D0 = m36618j.mo35908D0(interfaceC10411k4, i3);
                    if (mo35908D0 != null) {
                        if (!(m36618j.mo35952j0(mo35908D0) == EnumC10421u.INV)) {
                            mo35908D0 = null;
                        }
                        if (mo35908D0 != null && (mo35980x0 = m36618j.mo35980x0(mo35908D0)) != null) {
                            arrayList2.add(mo35980x0);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + interfaceC10411k4 + ", subType: " + interfaceC10411k + ", superType: " + interfaceC10411k2).toString());
                }
                c10401a.add(m36618j.mo35938c0(m36618j.mo35921O(arrayList2)));
            }
            i3++;
            i2 = 10;
        }
        if (z || !f40078a.m36656q(c10309d1, c10401a, interfaceC10411k2)) {
            return c10309d1.m36625q(new b(arrayList, c10309d1, m36618j, interfaceC10411k2));
        }
        return true;
    }

    /* renamed from: v */
    private final boolean m36651v(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2, InterfaceC10414n interfaceC10414n) {
        InterfaceC10415o mo35958m0;
        InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
        if (!(mo35933a instanceof InterfaceC10404d)) {
            return false;
        }
        InterfaceC10404d interfaceC10404d = (InterfaceC10404d) mo35933a;
        if (interfaceC10416p.mo35965q(interfaceC10404d) || !interfaceC10416p.mo35918L(interfaceC10416p.mo35925S(interfaceC10416p.mo35940d0(interfaceC10404d))) || interfaceC10416p.mo35922P(interfaceC10404d) != EnumC10402b.FOR_SUBTYPING) {
            return false;
        }
        InterfaceC10414n mo35977w = interfaceC10416p.mo35977w(interfaceC10409i2);
        InterfaceC10420t interfaceC10420t = mo35977w instanceof InterfaceC10420t ? (InterfaceC10420t) mo35977w : null;
        return (interfaceC10420t == null || (mo35958m0 = interfaceC10416p.mo35958m0(interfaceC10420t)) == null || !interfaceC10416p.mo35961o(mo35958m0, interfaceC10414n)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private final List<InterfaceC10411k> m36652w(C10309d1 c10309d1, List<? extends InterfaceC10411k> list) {
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC10412l mo35967r = m36618j.mo35967r((InterfaceC10411k) next);
            int mo35924R = m36618j.mo35924R(mo35967r);
            int i2 = 0;
            while (true) {
                if (i2 >= mo35924R) {
                    break;
                }
                if (!(m36618j.mo35919M(m36618j.mo35980x0(m36618j.mo35973u(mo35967r, i2))) == null)) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    /* renamed from: j */
    public final EnumC10421u m36653j(EnumC10421u enumC10421u, EnumC10421u enumC10421u2) {
        C9768m.m32346f(enumC10421u, "declared");
        C9768m.m32346f(enumC10421u2, "useSite");
        EnumC10421u enumC10421u3 = EnumC10421u.INV;
        if (enumC10421u == enumC10421u3) {
            return enumC10421u2;
        }
        if (enumC10421u2 == enumC10421u3 || enumC10421u == enumC10421u2) {
            return enumC10421u;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m36654k(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        C9768m.m32346f(c10309d1, "state");
        C9768m.m32346f(interfaceC10409i, "a");
        C9768m.m32346f(interfaceC10409i2, "b");
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (interfaceC10409i == interfaceC10409i2) {
            return true;
        }
        C10313f c10313f = f40078a;
        if (c10313f.m36647o(m36618j, interfaceC10409i) && c10313f.m36647o(m36618j, interfaceC10409i2)) {
            InterfaceC10409i m36623o = c10309d1.m36623o(c10309d1.m36624p(interfaceC10409i));
            InterfaceC10409i m36623o2 = c10309d1.m36623o(c10309d1.m36624p(interfaceC10409i2));
            InterfaceC10411k mo35948h0 = m36618j.mo35948h0(m36623o);
            if (!m36618j.mo35902A0(m36618j.mo35977w(m36623o), m36618j.mo35977w(m36623o2))) {
                return false;
            }
            if (m36618j.mo35951j(mo35948h0) == 0) {
                return m36618j.mo35983z(m36623o) || m36618j.mo35983z(m36623o2) || m36618j.mo35929W(mo35948h0) == m36618j.mo35929W(m36618j.mo35948h0(m36623o2));
            }
        }
        return m36649t(c10313f, c10309d1, interfaceC10409i, interfaceC10409i2, false, 8, null) && m36649t(c10313f, c10309d1, interfaceC10409i2, interfaceC10409i, false, 8, null);
    }

    /* renamed from: l */
    public final List<InterfaceC10411k> m36655l(C10309d1 c10309d1, InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n) {
        String m38599e0;
        C10309d1.c cVar;
        C9768m.m32346f(c10309d1, "state");
        C9768m.m32346f(interfaceC10411k, "subType");
        C9768m.m32346f(interfaceC10414n, "superConstructor");
        InterfaceC10416p m36618j = c10309d1.m36618j();
        if (m36618j.mo35976v0(interfaceC10411k)) {
            return f40078a.m36643h(c10309d1, interfaceC10411k, interfaceC10414n);
        }
        if (!m36618j.mo35928V(interfaceC10414n) && !m36618j.mo35966q0(interfaceC10414n)) {
            return f40078a.m36642g(c10309d1, interfaceC10411k, interfaceC10414n);
        }
        C10738e<InterfaceC10411k> c10738e = new C10738e();
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
                if (m36618j.mo35976v0(pop)) {
                    c10738e.add(pop);
                    cVar = C10309d1.c.C11522c.f40071a;
                } else {
                    cVar = C10309d1.c.b.f40070a;
                }
                if (!(!C9768m.m32341a(cVar, C10309d1.c.C11522c.f40071a))) {
                    cVar = null;
                }
                if (cVar != null) {
                    InterfaceC10416p m36618j2 = c10309d1.m36618j();
                    Iterator<InterfaceC10409i> it = m36618j2.mo35971t(m36618j2.mo35937c(pop)).iterator();
                    while (it.hasNext()) {
                        m36616h.add(cVar.mo36629a(c10309d1, it.next()));
                    }
                }
            }
        }
        c10309d1.m36614e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10411k interfaceC10411k2 : c10738e) {
            C10313f c10313f = f40078a;
            C9768m.m32345e(interfaceC10411k2, "it");
            C10794z.m38933z(arrayList, c10313f.m36643h(c10309d1, interfaceC10411k2, interfaceC10414n));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final boolean m36656q(C10309d1 c10309d1, InterfaceC10412l interfaceC10412l, InterfaceC10411k interfaceC10411k) {
        int i2;
        int i3;
        boolean m36654k;
        int i4;
        C9768m.m32346f(c10309d1, "<this>");
        C9768m.m32346f(interfaceC10412l, "capturedSubArguments");
        C9768m.m32346f(interfaceC10411k, "superType");
        InterfaceC10416p m36618j = c10309d1.m36618j();
        InterfaceC10414n mo35937c = m36618j.mo35937c(interfaceC10411k);
        int mo35924R = m36618j.mo35924R(interfaceC10412l);
        int mo35947h = m36618j.mo35947h(mo35937c);
        if (mo35924R != mo35947h || mo35924R != m36618j.mo35951j(interfaceC10411k)) {
            return false;
        }
        for (int i5 = 0; i5 < mo35947h; i5++) {
            InterfaceC10413m mo35946g0 = m36618j.mo35946g0(interfaceC10411k, i5);
            if (!m36618j.mo35918L(mo35946g0)) {
                InterfaceC10409i mo35980x0 = m36618j.mo35980x0(mo35946g0);
                InterfaceC10413m mo35973u = m36618j.mo35973u(interfaceC10412l, i5);
                m36618j.mo35952j0(mo35973u);
                EnumC10421u enumC10421u = EnumC10421u.INV;
                InterfaceC10409i mo35980x02 = m36618j.mo35980x0(mo35973u);
                C10313f c10313f = f40078a;
                EnumC10421u m36653j = c10313f.m36653j(m36618j.mo35920N(m36618j.mo35907D(mo35937c, i5)), m36618j.mo35952j0(mo35946g0));
                if (m36653j == null) {
                    return c10309d1.m36621m();
                }
                if (m36653j == enumC10421u && (c10313f.m36651v(m36618j, mo35980x02, mo35980x0, mo35937c) || c10313f.m36651v(m36618j, mo35980x0, mo35980x02, mo35937c))) {
                    continue;
                } else {
                    i2 = c10309d1.f40061g;
                    if (i2 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + mo35980x02).toString());
                    }
                    i3 = c10309d1.f40061g;
                    c10309d1.f40061g = i3 + 1;
                    int i6 = a.f40080a[m36653j.ordinal()];
                    if (i6 == 1) {
                        m36654k = c10313f.m36654k(c10309d1, mo35980x02, mo35980x0);
                    } else if (i6 == 2) {
                        m36654k = m36649t(c10313f, c10309d1, mo35980x02, mo35980x0, false, 8, null);
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m36654k = m36649t(c10313f, c10309d1, mo35980x0, mo35980x02, false, 8, null);
                    }
                    i4 = c10309d1.f40061g;
                    c10309d1.f40061g = i4 - 1;
                    if (!m36654k) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m36657r(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        C9768m.m32346f(c10309d1, "state");
        C9768m.m32346f(interfaceC10409i, "subType");
        C9768m.m32346f(interfaceC10409i2, "superType");
        return m36649t(this, c10309d1, interfaceC10409i, interfaceC10409i2, false, 8, null);
    }

    /* renamed from: s */
    public final boolean m36658s(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2, boolean z) {
        C9768m.m32346f(c10309d1, "state");
        C9768m.m32346f(interfaceC10409i, "subType");
        C9768m.m32346f(interfaceC10409i2, "superType");
        if (interfaceC10409i == interfaceC10409i2) {
            return true;
        }
        if (c10309d1.mo35985f(interfaceC10409i, interfaceC10409i2)) {
            return m36644i(c10309d1, interfaceC10409i, interfaceC10409i2, z);
        }
        return false;
    }
}
