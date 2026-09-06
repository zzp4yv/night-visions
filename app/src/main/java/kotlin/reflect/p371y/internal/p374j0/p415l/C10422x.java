package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.HashSet;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10414n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10415o;

/* compiled from: expandedTypeUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.x */
/* loaded from: classes3.dex */
public final class C10422x {
    /* renamed from: a */
    public static final InterfaceC10409i m37129a(InterfaceC10336m1 interfaceC10336m1, InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10336m1, "<this>");
        C9768m.m32346f(interfaceC10409i, "inlineClassType");
        return m37130b(interfaceC10336m1, interfaceC10409i, new HashSet());
    }

    /* renamed from: b */
    private static final InterfaceC10409i m37130b(InterfaceC10336m1 interfaceC10336m1, InterfaceC10409i interfaceC10409i, HashSet<InterfaceC10414n> hashSet) {
        InterfaceC10409i m37130b;
        InterfaceC10409i mo35906C0;
        InterfaceC10414n mo35977w = interfaceC10336m1.mo35977w(interfaceC10409i);
        if (!hashSet.add(mo35977w)) {
            return null;
        }
        InterfaceC10415o mo35911F = interfaceC10336m1.mo35911F(mo35977w);
        if (mo35911F != null) {
            InterfaceC10409i mo35957m = interfaceC10336m1.mo35957m(mo35911F);
            m37130b = m37130b(interfaceC10336m1, mo35957m, hashSet);
            if (m37130b == null) {
                return null;
            }
            boolean z = interfaceC10336m1.mo35934a0(interfaceC10336m1.mo35977w(mo35957m)) || ((mo35957m instanceof InterfaceC10411k) && interfaceC10336m1.mo35910E0((InterfaceC10411k) mo35957m));
            if ((m37130b instanceof InterfaceC10411k) && interfaceC10336m1.mo35910E0((InterfaceC10411k) m37130b) && interfaceC10336m1.mo35964p0(interfaceC10409i) && z) {
                mo35906C0 = interfaceC10336m1.mo35906C0(mo35957m);
            } else if (!interfaceC10336m1.mo35964p0(m37130b) && interfaceC10336m1.mo35962o0(interfaceC10409i)) {
                mo35906C0 = interfaceC10336m1.mo35906C0(m37130b);
            }
            return mo35906C0;
        }
        if (!interfaceC10336m1.mo35934a0(mo35977w)) {
            return interfaceC10409i;
        }
        InterfaceC10409i mo35936b0 = interfaceC10336m1.mo35936b0(interfaceC10409i);
        if (mo35936b0 == null || (m37130b = m37130b(interfaceC10336m1, mo35936b0, hashSet)) == null) {
            return null;
        }
        if (interfaceC10336m1.mo35964p0(interfaceC10409i)) {
            return interfaceC10336m1.mo35964p0(m37130b) ? interfaceC10409i : ((m37130b instanceof InterfaceC10411k) && interfaceC10336m1.mo35910E0((InterfaceC10411k) m37130b)) ? interfaceC10409i : interfaceC10336m1.mo35906C0(m37130b);
        }
        return m37130b;
    }
}
