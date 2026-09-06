package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10407g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10413m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10416p;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.d */
/* loaded from: classes3.dex */
public final class C10307d {

    /* renamed from: a */
    public static final C10307d f40047a = new C10307d();

    private C10307d() {
    }

    /* renamed from: a */
    private final boolean m36597a(InterfaceC10416p interfaceC10416p, InterfaceC10411k interfaceC10411k, InterfaceC10411k interfaceC10411k2) {
        if (interfaceC10416p.mo35951j(interfaceC10411k) == interfaceC10416p.mo35951j(interfaceC10411k2) && interfaceC10416p.mo35929W(interfaceC10411k) == interfaceC10416p.mo35929W(interfaceC10411k2)) {
            if ((interfaceC10416p.mo35970s0(interfaceC10411k) == null) == (interfaceC10416p.mo35970s0(interfaceC10411k2) == null) && interfaceC10416p.mo35902A0(interfaceC10416p.mo35937c(interfaceC10411k), interfaceC10416p.mo35937c(interfaceC10411k2))) {
                if (interfaceC10416p.mo35972t0(interfaceC10411k, interfaceC10411k2)) {
                    return true;
                }
                int mo35951j = interfaceC10416p.mo35951j(interfaceC10411k);
                for (int i2 = 0; i2 < mo35951j; i2++) {
                    InterfaceC10413m mo35946g0 = interfaceC10416p.mo35946g0(interfaceC10411k, i2);
                    InterfaceC10413m mo35946g02 = interfaceC10416p.mo35946g0(interfaceC10411k2, i2);
                    if (interfaceC10416p.mo35918L(mo35946g0) != interfaceC10416p.mo35918L(mo35946g02)) {
                        return false;
                    }
                    if (!interfaceC10416p.mo35918L(mo35946g0) && (interfaceC10416p.mo35952j0(mo35946g0) != interfaceC10416p.mo35952j0(mo35946g02) || !m36598c(interfaceC10416p, interfaceC10416p.mo35980x0(mo35946g0), interfaceC10416p.mo35980x0(mo35946g02)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m36598c(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        if (interfaceC10409i == interfaceC10409i2) {
            return true;
        }
        InterfaceC10411k mo35933a = interfaceC10416p.mo35933a(interfaceC10409i);
        InterfaceC10411k mo35933a2 = interfaceC10416p.mo35933a(interfaceC10409i2);
        if (mo35933a != null && mo35933a2 != null) {
            return m36597a(interfaceC10416p, mo35933a, mo35933a2);
        }
        InterfaceC10407g mo35919M = interfaceC10416p.mo35919M(interfaceC10409i);
        InterfaceC10407g mo35919M2 = interfaceC10416p.mo35919M(interfaceC10409i2);
        return mo35919M != null && mo35919M2 != null && m36597a(interfaceC10416p, interfaceC10416p.mo35945g(mo35919M), interfaceC10416p.mo35945g(mo35919M2)) && m36597a(interfaceC10416p, interfaceC10416p.mo35941e(mo35919M), interfaceC10416p.mo35941e(mo35919M2));
    }

    /* renamed from: b */
    public final boolean m36599b(InterfaceC10416p interfaceC10416p, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        C9768m.m32346f(interfaceC10416p, "context");
        C9768m.m32346f(interfaceC10409i, "a");
        C9768m.m32346f(interfaceC10409i2, "b");
        return m36598c(interfaceC10416p, interfaceC10409i, interfaceC10409i2);
    }
}
