package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes2.dex */
final class C7546r3 {

    /* renamed from: a */
    private static final Class<?> f27883a = m21341F();

    /* renamed from: b */
    private static final AbstractC7487h4<?, ?> f27884b = m21372g(false);

    /* renamed from: c */
    private static final AbstractC7487h4<?, ?> f27885c = m21372g(true);

    /* renamed from: d */
    private static final AbstractC7487h4<?, ?> f27886d = new C7493i4();

    /* renamed from: A */
    static int m21336A(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7575w2) {
            C7575w2 c7575w2 = (C7575w2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22197n0(c7575w2.mo21440e(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22197n0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: B */
    public static AbstractC7487h4<?, ?> m21337B() {
        return f27886d;
    }

    /* renamed from: C */
    public static void m21338C(int i2, List<Long> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21014l(i2, list, z);
    }

    /* renamed from: D */
    static int m21339D(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21340E(list) + (size * zzen.m22191g0(i2));
    }

    /* renamed from: E */
    static int m21340E(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7521n2) {
            C7521n2 c7521n2 = (C7521n2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22165B0(c7521n2.m21243f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22165B0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: F */
    private static Class<?> m21341F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static void m21342G(int i2, List<Long> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21023u(i2, list, z);
    }

    /* renamed from: H */
    static int m21343H(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21344I(list) + (size * zzen.m22191g0(i2));
    }

    /* renamed from: I */
    static int m21344I(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7521n2) {
            C7521n2 c7521n2 = (C7521n2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22194k0(c7521n2.m21243f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22194k0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: J */
    private static Class<?> m21345J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static void m21346K(int i2, List<Long> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21022t(i2, list, z);
    }

    /* renamed from: L */
    static int m21347L(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21348M(list) + (size * zzen.m22191g0(i2));
    }

    /* renamed from: M */
    static int m21348M(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7521n2) {
            C7521n2 c7521n2 = (C7521n2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22198o0(c7521n2.m21243f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22198o0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: N */
    public static void m21349N(int i2, List<Long> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21021s(i2, list, z);
    }

    /* renamed from: O */
    static int m21350O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21351P(list) + (size * zzen.m22191g0(i2));
    }

    /* renamed from: P */
    static int m21351P(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7521n2) {
            C7521n2 c7521n2 = (C7521n2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22202s0(c7521n2.m21243f(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22202s0(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: Q */
    public static void m21352Q(int i2, List<Long> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21015m(i2, list, z);
    }

    /* renamed from: R */
    static int m21353R(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzen.m22207x0(i2, 0);
    }

    /* renamed from: S */
    static int m21354S(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: T */
    public static void m21355T(int i2, List<Integer> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21012j(i2, list, z);
    }

    /* renamed from: U */
    static int m21356U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzen.m22200q0(i2, 0L);
    }

    /* renamed from: V */
    static int m21357V(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: W */
    public static void m21358W(int i2, List<Integer> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21017o(i2, list, z);
    }

    /* renamed from: X */
    static int m21359X(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzen.m22174H(i2, true);
    }

    /* renamed from: Y */
    static int m21360Y(List<?> list) {
        return list.size();
    }

    /* renamed from: Z */
    public static void m21361Z(int i2, List<Integer> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21024v(i2, list, z);
    }

    /* renamed from: a */
    static int m21362a(int i2, Object obj, InterfaceC7534p3 interfaceC7534p3) {
        return obj instanceof zzft ? zzen.m22185c(i2, (zzft) obj) : zzen.m22172F(i2, (zzgo) obj, interfaceC7534p3);
    }

    /* renamed from: a0 */
    public static void m21363a0(int i2, List<Integer> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21016n(i2, list, z);
    }

    /* renamed from: b */
    static int m21364b(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int m22191g0 = zzen.m22191g0(i2) * size;
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            while (i3 < size) {
                Object mo22311e = zzfvVar.mo22311e(i3);
                m22191g0 += mo22311e instanceof zzdu ? zzen.m22175I((zzdu) mo22311e) : zzen.m22177K((String) mo22311e);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                m22191g0 += obj instanceof zzdu ? zzen.m22175I((zzdu) obj) : zzen.m22177K((String) obj);
                i3++;
            }
        }
        return m22191g0;
    }

    /* renamed from: b0 */
    public static void m21365b0(int i2, List<Integer> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21018p(i2, list, z);
    }

    /* renamed from: c */
    static int m21366c(int i2, List<?> list, InterfaceC7534p3 interfaceC7534p3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m22191g0 = zzen.m22191g0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            m22191g0 += obj instanceof zzft ? zzen.m22187d((zzft) obj) : zzen.m22189e((zzgo) obj, interfaceC7534p3);
        }
        return m22191g0;
    }

    /* renamed from: c0 */
    public static void m21367c0(int i2, List<Integer> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21013k(i2, list, z);
    }

    /* renamed from: d */
    static int m21368d(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m21370e(list) + (list.size() * zzen.m22191g0(i2));
    }

    /* renamed from: d0 */
    public static void m21369d0(int i2, List<Boolean> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21011i(i2, list, z);
    }

    /* renamed from: e */
    static int m21370e(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7575w2) {
            C7575w2 c7575w2 = (C7575w2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22188d0(c7575w2.mo21440e(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22188d0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public static AbstractC7487h4<?, ?> m21371f() {
        return f27884b;
    }

    /* renamed from: g */
    private static AbstractC7487h4<?, ?> m21372g(boolean z) {
        try {
            Class<?> m21345J = m21345J();
            if (m21345J == null) {
                return null;
            }
            return (AbstractC7487h4) m21345J.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    static <UT, UB> UB m21373h(int i2, int i3, UB ub, AbstractC7487h4<UT, UB> abstractC7487h4) {
        if (ub == null) {
            ub = abstractC7487h4.mo21125a();
        }
        abstractC7487h4.mo21128d(ub, i2, i3);
        return ub;
    }

    /* renamed from: i */
    static <UT, UB> UB m21374i(int i2, List<Integer> list, zzfk zzfkVar, UB ub, AbstractC7487h4<UT, UB> abstractC7487h4) {
        if (zzfkVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (zzfkVar.mo20979d(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) m21373h(i2, intValue, ub, abstractC7487h4);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfkVar.mo20979d(intValue2)) {
                    ub = (UB) m21373h(i2, intValue2, ub, abstractC7487h4);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: j */
    public static void m21375j(int i2, List<String> list, InterfaceC7589y4 interfaceC7589y4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo20988A(i2, list);
    }

    /* renamed from: k */
    public static void m21376k(int i2, List<?> list, InterfaceC7589y4 interfaceC7589y4, InterfaceC7534p3 interfaceC7534p3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo20998K(i2, list, interfaceC7534p3);
    }

    /* renamed from: l */
    public static void m21377l(int i2, List<Double> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21025w(i2, list, z);
    }

    /* renamed from: m */
    static <T, FT extends zzey<FT>> void m21378m(AbstractC7461d2<FT> abstractC7461d2, T t, T t2) {
        C7485h2<FT> mo21032b = abstractC7461d2.mo21032b(t2);
        if (mo21032b.f27756b.isEmpty()) {
            return;
        }
        abstractC7461d2.mo21039i(t).m21117f(mo21032b);
    }

    /* renamed from: n */
    static <T> void m21379n(InterfaceC7444a3 interfaceC7444a3, T t, T t2, long j2) {
        C7505k4.m21198j(t, j2, interfaceC7444a3.mo20976g(C7505k4.m21179F(t, j2), C7505k4.m21179F(t2, j2)));
    }

    /* renamed from: o */
    static <T, UT, UB> void m21380o(AbstractC7487h4<UT, UB> abstractC7487h4, T t, T t2) {
        abstractC7487h4.mo21132h(t, abstractC7487h4.mo21140p(abstractC7487h4.mo21135k(t), abstractC7487h4.mo21135k(t2)));
    }

    /* renamed from: p */
    public static void m21381p(Class<?> cls) {
        Class<?> cls2;
        if (!zzfd.class.isAssignableFrom(cls) && (cls2 = f27883a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: q */
    static boolean m21382q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: r */
    static int m21383r(int i2, List<zzdu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m22191g0 = size * zzen.m22191g0(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            m22191g0 += zzen.m22175I(list.get(i3));
        }
        return m22191g0;
    }

    /* renamed from: s */
    static int m21384s(int i2, List<zzgo> list, InterfaceC7534p3 interfaceC7534p3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzen.m22181U(i2, list.get(i4), interfaceC7534p3);
        }
        return i3;
    }

    /* renamed from: t */
    static int m21385t(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21386u(list) + (size * zzen.m22191g0(i2));
    }

    /* renamed from: u */
    static int m21386u(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7575w2) {
            C7575w2 c7575w2 = (C7575w2) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22193i0(c7575w2.mo21440e(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.m22193i0(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public static AbstractC7487h4<?, ?> m21387v() {
        return f27885c;
    }

    /* renamed from: w */
    public static void m21388w(int i2, List<zzdu> list, InterfaceC7589y4 interfaceC7589y4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21026x(i2, list);
    }

    /* renamed from: x */
    public static void m21389x(int i2, List<?> list, InterfaceC7589y4 interfaceC7589y4, InterfaceC7534p3 interfaceC7534p3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo20996I(i2, list, interfaceC7534p3);
    }

    /* renamed from: y */
    public static void m21390y(int i2, List<Float> list, InterfaceC7589y4 interfaceC7589y4, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC7589y4.mo21028z(i2, list, z);
    }

    /* renamed from: z */
    static int m21391z(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m21336A(list) + (size * zzen.m22191g0(i2));
    }
}
