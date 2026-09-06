package kotlin.reflect.p371y.internal.p374j0.p415l.p419w1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1;

/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.f0.y.e.j0.l.w1.p */
/* loaded from: classes3.dex */
public interface InterfaceC10416p extends InterfaceC10419s {

    /* compiled from: TypeSystemContext.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.w1.p$a */
    public static final class a {
        /* renamed from: a */
        public static List<InterfaceC10411k> m37097a(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n) {
            C9768m.m32346f(interfaceC10411k, "$receiver");
            C9768m.m32346f(interfaceC10414n, "constructor");
            return null;
        }

        /* renamed from: b */
        public static InterfaceC10413m m37098b(InterfaceC10416p interfaceC10416p, InterfaceC10412l interfaceC10412l, int i2) {
            C9768m.m32346f(interfaceC10412l, "$receiver");
            if (interfaceC10412l instanceof InterfaceC10411k) {
                return interfaceC10416p.mo35946g0((InterfaceC10409i) interfaceC10412l, i2);
            }
            if (interfaceC10412l instanceof C10401a) {
                InterfaceC10413m interfaceC10413m = ((C10401a) interfaceC10412l).get(i2);
                C9768m.m32345e(interfaceC10413m, "get(index)");
                return interfaceC10413m;
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC10412l + ", " + C9757g0.m32298b(interfaceC10412l.getClass())).toString());
        }

        /* renamed from: c */
        public static InterfaceC10413m m37099c(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k, int i2) {
            C9768m.m32346f(interfaceC10411k, "$receiver");
            boolean z = false;
            if (i2 >= 0 && i2 < interfaceC10416p.mo35951j(interfaceC10411k)) {
                z = true;
            }
            if (z) {
                return interfaceC10416p.mo35946g0(interfaceC10411k, i2);
            }
            return null;
        }

        /* renamed from: d */
        public static boolean m37100d(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            return interfaceC10416p.mo35929W(interfaceC10416p.mo35948h0(interfaceC10409i)) != interfaceC10416p.mo35929W(interfaceC10416p.mo35926T(interfaceC10409i));
        }

        /* renamed from: e */
        public static boolean m37101e(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
            return (mo35933a != null ? interfaceC10416p.mo35943f(mo35933a) : null) != null;
        }

        /* renamed from: f */
        public static boolean m37102f(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k) {
            C9768m.m32346f(interfaceC10411k, "$receiver");
            return interfaceC10416p.mo35928V(interfaceC10416p.mo35937c(interfaceC10411k));
        }

        /* renamed from: g */
        public static boolean m37103g(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
            return (mo35933a != null ? interfaceC10416p.mo35970s0(mo35933a) : null) != null;
        }

        /* renamed from: h */
        public static boolean m37104h(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            InterfaceC10407g mo35919M = interfaceC10416p.mo35919M(interfaceC10409i);
            return (mo35919M != null ? interfaceC10416p.mo35982y0(mo35919M) : null) != null;
        }

        /* renamed from: i */
        public static boolean m37105i(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k) {
            C9768m.m32346f(interfaceC10411k, "$receiver");
            return interfaceC10416p.mo35966q0(interfaceC10416p.mo35937c(interfaceC10411k));
        }

        /* renamed from: j */
        public static boolean m37106j(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            return (interfaceC10409i instanceof InterfaceC10411k) && interfaceC10416p.mo35929W((InterfaceC10411k) interfaceC10409i);
        }

        /* renamed from: k */
        public static boolean m37107k(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            return interfaceC10416p.mo35963p(interfaceC10416p.mo35977w(interfaceC10409i)) && !interfaceC10416p.mo35964p0(interfaceC10409i);
        }

        /* renamed from: l */
        public static InterfaceC10411k m37108l(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            InterfaceC10411k mo35945g;
            C9768m.m32346f(interfaceC10409i, "$receiver");
            InterfaceC10407g mo35919M = interfaceC10416p.mo35919M(interfaceC10409i);
            if (mo35919M != null && (mo35945g = interfaceC10416p.mo35945g(mo35919M)) != null) {
                return mo35945g;
            }
            InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
            C9768m.m32343c(mo35933a);
            return mo35933a;
        }

        /* renamed from: m */
        public static int m37109m(InterfaceC10416p interfaceC10416p, InterfaceC10412l interfaceC10412l) {
            C9768m.m32346f(interfaceC10412l, "$receiver");
            if (interfaceC10412l instanceof InterfaceC10411k) {
                return interfaceC10416p.mo35951j((InterfaceC10409i) interfaceC10412l);
            }
            if (interfaceC10412l instanceof C10401a) {
                return ((C10401a) interfaceC10412l).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC10412l + ", " + C9757g0.m32298b(interfaceC10412l.getClass())).toString());
        }

        /* renamed from: n */
        public static InterfaceC10414n m37110n(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "$receiver");
            InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
            if (mo35933a == null) {
                mo35933a = interfaceC10416p.mo35948h0(interfaceC10409i);
            }
            return interfaceC10416p.mo35937c(mo35933a);
        }

        /* renamed from: o */
        public static InterfaceC10411k m37111o(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i) {
            InterfaceC10411k mo35941e;
            C9768m.m32346f(interfaceC10409i, "$receiver");
            InterfaceC10407g mo35919M = interfaceC10416p.mo35919M(interfaceC10409i);
            if (mo35919M != null && (mo35941e = interfaceC10416p.mo35941e(mo35919M)) != null) {
                return mo35941e;
            }
            InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
            C9768m.m32343c(mo35933a);
            return mo35933a;
        }
    }

    /* renamed from: A */
    C10309d1.c mo35901A(InterfaceC10411k interfaceC10411k);

    /* renamed from: A0 */
    boolean mo35902A0(InterfaceC10414n interfaceC10414n, InterfaceC10414n interfaceC10414n2);

    /* renamed from: B */
    boolean mo35903B(InterfaceC10409i interfaceC10409i);

    /* renamed from: B0 */
    List<InterfaceC10409i> mo35904B0(InterfaceC10415o interfaceC10415o);

    /* renamed from: C */
    boolean mo35905C(InterfaceC10409i interfaceC10409i);

    /* renamed from: D */
    InterfaceC10415o mo35907D(InterfaceC10414n interfaceC10414n, int i2);

    /* renamed from: D0 */
    InterfaceC10413m mo35908D0(InterfaceC10411k interfaceC10411k, int i2);

    /* renamed from: E0 */
    boolean mo35910E0(InterfaceC10411k interfaceC10411k);

    /* renamed from: F */
    InterfaceC10415o mo35911F(InterfaceC10414n interfaceC10414n);

    /* renamed from: G */
    InterfaceC10409i mo35912G(InterfaceC10409i interfaceC10409i, boolean z);

    /* renamed from: H */
    InterfaceC10411k mo35913H(InterfaceC10405e interfaceC10405e);

    /* renamed from: I */
    boolean mo35915I(InterfaceC10409i interfaceC10409i);

    /* renamed from: J */
    boolean mo35916J(InterfaceC10411k interfaceC10411k);

    /* renamed from: L */
    boolean mo35918L(InterfaceC10413m interfaceC10413m);

    /* renamed from: M */
    InterfaceC10407g mo35919M(InterfaceC10409i interfaceC10409i);

    /* renamed from: N */
    EnumC10421u mo35920N(InterfaceC10415o interfaceC10415o);

    /* renamed from: O */
    InterfaceC10409i mo35921O(List<? extends InterfaceC10409i> list);

    /* renamed from: P */
    EnumC10402b mo35922P(InterfaceC10404d interfaceC10404d);

    /* renamed from: Q */
    InterfaceC10409i mo35923Q(InterfaceC10409i interfaceC10409i);

    /* renamed from: R */
    int mo35924R(InterfaceC10412l interfaceC10412l);

    /* renamed from: S */
    InterfaceC10413m mo35925S(InterfaceC10403c interfaceC10403c);

    /* renamed from: T */
    InterfaceC10411k mo35926T(InterfaceC10409i interfaceC10409i);

    /* renamed from: U */
    InterfaceC10409i mo35927U(InterfaceC10404d interfaceC10404d);

    /* renamed from: V */
    boolean mo35928V(InterfaceC10414n interfaceC10414n);

    /* renamed from: W */
    boolean mo35929W(InterfaceC10411k interfaceC10411k);

    /* renamed from: X */
    List<InterfaceC10413m> mo35930X(InterfaceC10409i interfaceC10409i);

    /* renamed from: Y */
    boolean mo35931Y(InterfaceC10409i interfaceC10409i);

    /* renamed from: Z */
    boolean mo35932Z(InterfaceC10414n interfaceC10414n);

    /* renamed from: a */
    InterfaceC10411k mo35933a(InterfaceC10409i interfaceC10409i);

    /* renamed from: b */
    boolean mo35935b(InterfaceC10411k interfaceC10411k);

    /* renamed from: c */
    InterfaceC10414n mo35937c(InterfaceC10411k interfaceC10411k);

    /* renamed from: c0 */
    InterfaceC10413m mo35938c0(InterfaceC10409i interfaceC10409i);

    /* renamed from: d */
    InterfaceC10411k mo35939d(InterfaceC10411k interfaceC10411k, boolean z);

    /* renamed from: d0 */
    InterfaceC10403c mo35940d0(InterfaceC10404d interfaceC10404d);

    /* renamed from: e */
    InterfaceC10411k mo35941e(InterfaceC10407g interfaceC10407g);

    /* renamed from: e0 */
    List<InterfaceC10415o> mo35942e0(InterfaceC10414n interfaceC10414n);

    /* renamed from: f */
    InterfaceC10404d mo35943f(InterfaceC10411k interfaceC10411k);

    /* renamed from: f0 */
    boolean mo35944f0(InterfaceC10409i interfaceC10409i);

    /* renamed from: g */
    InterfaceC10411k mo35945g(InterfaceC10407g interfaceC10407g);

    /* renamed from: g0 */
    InterfaceC10413m mo35946g0(InterfaceC10409i interfaceC10409i, int i2);

    /* renamed from: h */
    int mo35947h(InterfaceC10414n interfaceC10414n);

    /* renamed from: h0 */
    InterfaceC10411k mo35948h0(InterfaceC10409i interfaceC10409i);

    /* renamed from: j */
    int mo35951j(InterfaceC10409i interfaceC10409i);

    /* renamed from: j0 */
    EnumC10421u mo35952j0(InterfaceC10413m interfaceC10413m);

    /* renamed from: k */
    boolean mo35953k(InterfaceC10404d interfaceC10404d);

    /* renamed from: k0 */
    boolean mo35954k0(InterfaceC10414n interfaceC10414n);

    /* renamed from: m0 */
    InterfaceC10415o mo35958m0(InterfaceC10420t interfaceC10420t);

    /* renamed from: n */
    List<InterfaceC10411k> mo35959n(InterfaceC10411k interfaceC10411k, InterfaceC10414n interfaceC10414n);

    /* renamed from: n0 */
    boolean mo35960n0(InterfaceC10411k interfaceC10411k);

    /* renamed from: o */
    boolean mo35961o(InterfaceC10415o interfaceC10415o, InterfaceC10414n interfaceC10414n);

    /* renamed from: o0 */
    boolean mo35962o0(InterfaceC10409i interfaceC10409i);

    /* renamed from: p */
    boolean mo35963p(InterfaceC10414n interfaceC10414n);

    /* renamed from: p0 */
    boolean mo35964p0(InterfaceC10409i interfaceC10409i);

    /* renamed from: q */
    boolean mo35965q(InterfaceC10404d interfaceC10404d);

    /* renamed from: q0 */
    boolean mo35966q0(InterfaceC10414n interfaceC10414n);

    /* renamed from: r */
    InterfaceC10412l mo35967r(InterfaceC10411k interfaceC10411k);

    /* renamed from: r0 */
    InterfaceC10411k mo35968r0(InterfaceC10411k interfaceC10411k, EnumC10402b enumC10402b);

    /* renamed from: s */
    boolean mo35969s(InterfaceC10409i interfaceC10409i);

    /* renamed from: s0 */
    InterfaceC10405e mo35970s0(InterfaceC10411k interfaceC10411k);

    /* renamed from: t */
    Collection<InterfaceC10409i> mo35971t(InterfaceC10414n interfaceC10414n);

    /* renamed from: u */
    InterfaceC10413m mo35973u(InterfaceC10412l interfaceC10412l, int i2);

    /* renamed from: u0 */
    boolean mo35974u0(InterfaceC10414n interfaceC10414n);

    /* renamed from: v */
    Collection<InterfaceC10409i> mo35975v(InterfaceC10411k interfaceC10411k);

    /* renamed from: v0 */
    boolean mo35976v0(InterfaceC10411k interfaceC10411k);

    /* renamed from: w */
    InterfaceC10414n mo35977w(InterfaceC10409i interfaceC10409i);

    /* renamed from: w0 */
    boolean mo35978w0(InterfaceC10411k interfaceC10411k);

    /* renamed from: x */
    boolean mo35979x(InterfaceC10414n interfaceC10414n);

    /* renamed from: x0 */
    InterfaceC10409i mo35980x0(InterfaceC10413m interfaceC10413m);

    /* renamed from: y */
    InterfaceC10410j mo35981y(InterfaceC10407g interfaceC10407g);

    /* renamed from: y0 */
    InterfaceC10406f mo35982y0(InterfaceC10407g interfaceC10407g);

    /* renamed from: z */
    boolean mo35983z(InterfaceC10409i interfaceC10409i);

    /* renamed from: z0 */
    boolean mo35984z0(InterfaceC10409i interfaceC10409i);
}
