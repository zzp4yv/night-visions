package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.aw */
/* loaded from: classes2.dex */
final class C6470aw<T> implements InterfaceC6877lw<T> {

    /* renamed from: a */
    private static final int[] f18185a = new int[0];

    /* renamed from: b */
    private static final Unsafe f18186b = C6693gx.m15216r();

    /* renamed from: c */
    private final int[] f18187c;

    /* renamed from: d */
    private final Object[] f18188d;

    /* renamed from: e */
    private final int f18189e;

    /* renamed from: f */
    private final int f18190f;

    /* renamed from: g */
    private final zzdpk f18191g;

    /* renamed from: h */
    private final boolean f18192h;

    /* renamed from: i */
    private final boolean f18193i;

    /* renamed from: j */
    private final boolean f18194j;

    /* renamed from: k */
    private final boolean f18195k;

    /* renamed from: l */
    private final int[] f18196l;

    /* renamed from: m */
    private final int f18197m;

    /* renamed from: n */
    private final int f18198n;

    /* renamed from: o */
    private final InterfaceC6544cw f18199o;

    /* renamed from: p */
    private final AbstractC6839kv f18200p;

    /* renamed from: q */
    private final AbstractC6545cx<?, ?> f18201q;

    /* renamed from: r */
    private final AbstractC7245vu<?> f18202r;

    /* renamed from: s */
    private final InterfaceC7209uv f18203s;

    private C6470aw(int[] iArr, Object[] objArr, int i2, int i3, zzdpk zzdpkVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, InterfaceC6544cw interfaceC6544cw, AbstractC6839kv abstractC6839kv, AbstractC6545cx<?, ?> abstractC6545cx, AbstractC7245vu<?> abstractC7245vu, InterfaceC7209uv interfaceC7209uv) {
        this.f18187c = iArr;
        this.f18188d = objArr;
        this.f18189e = i2;
        this.f18190f = i3;
        this.f18193i = zzdpkVar instanceof zzdob;
        this.f18194j = z;
        this.f18192h = abstractC7245vu != null && abstractC7245vu.mo15964h(zzdpkVar);
        this.f18195k = false;
        this.f18196l = iArr2;
        this.f18197m = i4;
        this.f18198n = i5;
        this.f18199o = interfaceC6544cw;
        this.f18200p = abstractC6839kv;
        this.f18201q = abstractC6545cx;
        this.f18202r = abstractC7245vu;
        this.f18191g = zzdpkVar;
        this.f18203s = interfaceC7209uv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private static boolean m14783A(Object obj, int i2, InterfaceC6877lw interfaceC6877lw) {
        return interfaceC6877lw.mo14830j(C6693gx.m15190L(obj, i2 & 1048575));
    }

    /* renamed from: B */
    private final int m14784B(int i2, int i3) {
        if (i2 < this.f18189e || i2 > this.f18190f) {
            return -1;
        }
        return m14785C(i2, i3);
    }

    /* renamed from: C */
    private final int m14785C(int i2, int i3) {
        int length = (this.f18187c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f18187c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* renamed from: D */
    private static zzdqu m14786D(Object obj) {
        zzdob zzdobVar = (zzdob) obj;
        zzdqu zzdquVar = zzdobVar.zzhhd;
        if (zzdquVar != zzdqu.m19782f()) {
            return zzdquVar;
        }
        zzdqu m19784i = zzdqu.m19784i();
        zzdobVar.zzhhd = m19784i;
        return m19784i;
    }

    /* renamed from: E */
    private final void m14787E(T t, int i2, int i3) {
        C6693gx.m15212n(t, m14800R(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m14788F(T r19, com.google.android.gms.internal.ads.InterfaceC7211ux r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6470aw.m14788F(java.lang.Object, com.google.android.gms.internal.ads.ux):void");
    }

    /* renamed from: G */
    private final void m14789G(T t, T t2, int i2) {
        int m14799Q = m14799Q(i2);
        int i3 = this.f18187c[i2];
        long j2 = m14799Q & 1048575;
        if (m14819y(t2, i3, i2)) {
            Object m15190L = C6693gx.m15190L(t, j2);
            Object m15190L2 = C6693gx.m15190L(t2, j2);
            if (m15190L != null && m15190L2 != null) {
                C6693gx.m15205g(t, j2, zzdod.m19746g(m15190L, m15190L2));
                m14787E(t, i3, i2);
            } else if (m15190L2 != null) {
                C6693gx.m15205g(t, j2, m15190L2);
                m14787E(t, i3, i2);
            }
        }
    }

    /* renamed from: H */
    private final boolean m14790H(T t, T t2, int i2) {
        return m14791I(t, i2) == m14791I(t2, i2);
    }

    /* renamed from: I */
    private final boolean m14791I(T t, int i2) {
        if (!this.f18194j) {
            int m14800R = m14800R(i2);
            return (C6693gx.m15183E(t, (long) (m14800R & 1048575)) & (1 << (m14800R >>> 20))) != 0;
        }
        int m14799Q = m14799Q(i2);
        long j2 = m14799Q & 1048575;
        switch ((m14799Q & 267386880) >>> 20) {
            case 0:
                return C6693gx.m15189K(t, j2) != 0.0d;
            case 1:
                return C6693gx.m15187I(t, j2) != 0.0f;
            case 2:
                return C6693gx.m15184F(t, j2) != 0;
            case 3:
                return C6693gx.m15184F(t, j2) != 0;
            case 4:
                return C6693gx.m15183E(t, j2) != 0;
            case 5:
                return C6693gx.m15184F(t, j2) != 0;
            case 6:
                return C6693gx.m15183E(t, j2) != 0;
            case 7:
                return C6693gx.m15186H(t, j2);
            case 8:
                Object m15190L = C6693gx.m15190L(t, j2);
                if (m15190L instanceof String) {
                    return !((String) m15190L).isEmpty();
                }
                if (m15190L instanceof zzdmr) {
                    return !zzdmr.f25661f.equals(m15190L);
                }
                throw new IllegalArgumentException();
            case 9:
                return C6693gx.m15190L(t, j2) != null;
            case 10:
                return !zzdmr.f25661f.equals(C6693gx.m15190L(t, j2));
            case 11:
                return C6693gx.m15183E(t, j2) != 0;
            case 12:
                return C6693gx.m15183E(t, j2) != 0;
            case 13:
                return C6693gx.m15183E(t, j2) != 0;
            case 14:
                return C6693gx.m15184F(t, j2) != 0;
            case 15:
                return C6693gx.m15183E(t, j2) != 0;
            case 16:
                return C6693gx.m15184F(t, j2) != 0;
            case 17:
                return C6693gx.m15190L(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: J */
    private static <E> List<E> m14792J(Object obj, long j2) {
        return (List) C6693gx.m15190L(obj, j2);
    }

    /* renamed from: K */
    private final void m14793K(T t, int i2) {
        if (this.f18194j) {
            return;
        }
        int m14800R = m14800R(i2);
        long j2 = m14800R & 1048575;
        C6693gx.m15212n(t, j2, C6693gx.m15183E(t, j2) | (1 << (m14800R >>> 20)));
    }

    /* renamed from: L */
    private static <T> double m14794L(T t, long j2) {
        return ((Double) C6693gx.m15190L(t, j2)).doubleValue();
    }

    /* renamed from: M */
    private static <T> float m14795M(T t, long j2) {
        return ((Float) C6693gx.m15190L(t, j2)).floatValue();
    }

    /* renamed from: N */
    private final InterfaceC6877lw m14796N(int i2) {
        int i3 = (i2 / 3) << 1;
        InterfaceC6877lw interfaceC6877lw = (InterfaceC6877lw) this.f18188d[i3];
        if (interfaceC6877lw != null) {
            return interfaceC6877lw;
        }
        InterfaceC6877lw<T> m15178c = C6692gw.m15176b().m15178c((Class) this.f18188d[i3 + 1]);
        this.f18188d[i3] = m15178c;
        return m15178c;
    }

    /* renamed from: O */
    private final Object m14797O(int i2) {
        return this.f18188d[(i2 / 3) << 1];
    }

    /* renamed from: P */
    private final zzdog m14798P(int i2) {
        return (zzdog) this.f18188d[((i2 / 3) << 1) + 1];
    }

    /* renamed from: Q */
    private final int m14799Q(int i2) {
        return this.f18187c[i2 + 1];
    }

    /* renamed from: R */
    private final int m14800R(int i2) {
        return this.f18187c[i2 + 2];
    }

    /* renamed from: S */
    private static boolean m14801S(int i2) {
        return (i2 & 536870912) != 0;
    }

    /* renamed from: T */
    private final int m14802T(int i2) {
        if (i2 < this.f18189e || i2 > this.f18190f) {
            return -1;
        }
        return m14785C(i2, 0);
    }

    /* renamed from: U */
    private static <T> int m14803U(T t, long j2) {
        return ((Integer) C6693gx.m15190L(t, j2)).intValue();
    }

    /* renamed from: V */
    private static <T> long m14804V(T t, long j2) {
        return ((Long) C6693gx.m15190L(t, j2)).longValue();
    }

    /* renamed from: W */
    private static <T> boolean m14805W(T t, long j2) {
        return ((Boolean) C6693gx.m15190L(t, j2)).booleanValue();
    }

    /* renamed from: k */
    private static <UT, UB> int m14806k(AbstractC6545cx<UT, UB> abstractC6545cx, T t) {
        return abstractC6545cx.mo15004i(abstractC6545cx.mo15005j(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: l */
    private final int m14807l(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C6505bu c6505bu) throws IOException {
        int m14775j;
        Unsafe unsafe = f18186b;
        long j3 = this.f18187c[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(C6468au.m14781p(bArr, i2)));
                    m14775j = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(C6468au.m14782q(bArr, i2)));
                    m14775j = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    m14775j = C6468au.m14775j(bArr, i2, c6505bu);
                    unsafe.putObject(t, j2, Long.valueOf(c6505bu.f18357b));
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    m14775j = C6468au.m14773h(bArr, i2, c6505bu);
                    unsafe.putObject(t, j2, Integer.valueOf(c6505bu.f18356a));
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(C6468au.m14780o(bArr, i2)));
                    m14775j = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(C6468au.m14779n(bArr, i2)));
                    m14775j = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    m14775j = C6468au.m14775j(bArr, i2, c6505bu);
                    unsafe.putObject(t, j2, Boolean.valueOf(c6505bu.f18357b != 0));
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int m14773h = C6468au.m14773h(bArr, i2, c6505bu);
                    int i10 = c6505bu.f18356a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        if ((i7 & 536870912) != 0 && !C6804jx.m15384k(bArr, m14773h, m14773h + i10)) {
                            throw zzdok.m19757h();
                        }
                        unsafe.putObject(t, j2, new String(bArr, m14773h, i10, zzdod.f25772a));
                        m14773h += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return m14773h;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int m14772g = C6468au.m14772g(m14796N(i9), bArr, i2, i3, c6505bu);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, c6505bu.f18358c);
                    } else {
                        unsafe.putObject(t, j2, zzdod.m19746g(object, c6505bu.f18358c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m14772g;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    m14775j = C6468au.m14778m(bArr, i2, c6505bu);
                    unsafe.putObject(t, j2, c6505bu.f18358c);
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int m14773h2 = C6468au.m14773h(bArr, i2, c6505bu);
                    int i11 = c6505bu.f18356a;
                    zzdog m14798P = m14798P(i9);
                    if (m14798P != null && !m14798P.mo14954a(i11)) {
                        m14786D(t).m19791k(i4, Long.valueOf(i11));
                        return m14773h2;
                    }
                    unsafe.putObject(t, j2, Integer.valueOf(i11));
                    m14775j = m14773h2;
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    m14775j = C6468au.m14773h(bArr, i2, c6505bu);
                    unsafe.putObject(t, j2, Integer.valueOf(zzdnd.m19606B(c6505bu.f18356a)));
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    m14775j = C6468au.m14775j(bArr, i2, c6505bu);
                    unsafe.putObject(t, j2, Long.valueOf(zzdnd.m19608w(c6505bu.f18357b)));
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    m14775j = C6468au.m14771f(m14796N(i9), bArr, i2, i3, (i4 & (-8)) | 4, c6505bu);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, c6505bu.f18358c);
                    } else {
                        unsafe.putObject(t, j2, zzdod.m19746g(object2, c6505bu.f18358c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m14775j;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private final int m14808m(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, C6505bu c6505bu) throws IOException {
        int m14773h;
        int i9 = i2;
        Unsafe unsafe = f18186b;
        zzdoj zzdojVar = (zzdoj) unsafe.getObject(t, j3);
        if (!zzdojVar.mo16107m0()) {
            int size = zzdojVar.size();
            zzdojVar = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j3, zzdojVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    C7171tu c7171tu = (C7171tu) zzdojVar;
                    int m14773h2 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i10 = c6505bu.f18356a + m14773h2;
                    while (m14773h2 < i10) {
                        c7171tu.m15911f(C6468au.m14781p(bArr, m14773h2));
                        m14773h2 += 8;
                    }
                    if (m14773h2 == i10) {
                        return m14773h2;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 1) {
                    C7171tu c7171tu2 = (C7171tu) zzdojVar;
                    c7171tu2.m15911f(C6468au.m14781p(bArr, i2));
                    while (true) {
                        int i11 = i9 + 8;
                        if (i11 >= i3) {
                            return i11;
                        }
                        i9 = C6468au.m14773h(bArr, i11, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return i11;
                        }
                        c7171tu2.m15911f(C6468au.m14781p(bArr, i9));
                    }
                }
                return i9;
            case 19:
            case 36:
                if (i6 == 2) {
                    C6543cv c6543cv = (C6543cv) zzdojVar;
                    int m14773h3 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i12 = c6505bu.f18356a + m14773h3;
                    while (m14773h3 < i12) {
                        c6543cv.m14994i(C6468au.m14782q(bArr, m14773h3));
                        m14773h3 += 4;
                    }
                    if (m14773h3 == i12) {
                        return m14773h3;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 5) {
                    C6543cv c6543cv2 = (C6543cv) zzdojVar;
                    c6543cv2.m14994i(C6468au.m14782q(bArr, i2));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i3) {
                            return i13;
                        }
                        i9 = C6468au.m14773h(bArr, i13, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return i13;
                        }
                        c6543cv2.m14994i(C6468au.m14782q(bArr, i9));
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    C6987ov c6987ov = (C6987ov) zzdojVar;
                    int m14773h4 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i14 = c6505bu.f18356a + m14773h4;
                    while (m14773h4 < i14) {
                        m14773h4 = C6468au.m14775j(bArr, m14773h4, c6505bu);
                        c6987ov.m15693i(c6505bu.f18357b);
                    }
                    if (m14773h4 == i14) {
                        return m14773h4;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 0) {
                    C6987ov c6987ov2 = (C6987ov) zzdojVar;
                    int m14775j = C6468au.m14775j(bArr, i9, c6505bu);
                    c6987ov2.m15693i(c6505bu.f18357b);
                    while (m14775j < i3) {
                        int m14773h5 = C6468au.m14773h(bArr, m14775j, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return m14775j;
                        }
                        m14775j = C6468au.m14775j(bArr, m14773h5, c6505bu);
                        c6987ov2.m15693i(c6505bu.f18357b);
                    }
                    return m14775j;
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return C6468au.m14774i(bArr, i9, zzdojVar, c6505bu);
                }
                if (i6 == 0) {
                    return C6468au.m14767b(i4, bArr, i2, i3, zzdojVar, c6505bu);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    C6987ov c6987ov3 = (C6987ov) zzdojVar;
                    int m14773h6 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i15 = c6505bu.f18356a + m14773h6;
                    while (m14773h6 < i15) {
                        c6987ov3.m15693i(C6468au.m14780o(bArr, m14773h6));
                        m14773h6 += 8;
                    }
                    if (m14773h6 == i15) {
                        return m14773h6;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 1) {
                    C6987ov c6987ov4 = (C6987ov) zzdojVar;
                    c6987ov4.m15693i(C6468au.m14780o(bArr, i2));
                    while (true) {
                        int i16 = i9 + 8;
                        if (i16 >= i3) {
                            return i16;
                        }
                        i9 = C6468au.m14773h(bArr, i16, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return i16;
                        }
                        c6987ov4.m15693i(C6468au.m14780o(bArr, i9));
                    }
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    C6691gv c6691gv = (C6691gv) zzdojVar;
                    int m14773h7 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i17 = c6505bu.f18356a + m14773h7;
                    while (m14773h7 < i17) {
                        c6691gv.mo15174Z0(C6468au.m14779n(bArr, m14773h7));
                        m14773h7 += 4;
                    }
                    if (m14773h7 == i17) {
                        return m14773h7;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 5) {
                    C6691gv c6691gv2 = (C6691gv) zzdojVar;
                    c6691gv2.mo15174Z0(C6468au.m14779n(bArr, i2));
                    while (true) {
                        int i18 = i9 + 4;
                        if (i18 >= i3) {
                            return i18;
                        }
                        i9 = C6468au.m14773h(bArr, i18, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return i18;
                        }
                        c6691gv2.mo15174Z0(C6468au.m14779n(bArr, i9));
                    }
                }
                return i9;
            case 25:
            case 42:
                if (i6 == 2) {
                    C6542cu c6542cu = (C6542cu) zzdojVar;
                    m14773h = C6468au.m14773h(bArr, i9, c6505bu);
                    int i19 = c6505bu.f18356a + m14773h;
                    while (m14773h < i19) {
                        m14773h = C6468au.m14775j(bArr, m14773h, c6505bu);
                        c6542cu.m14990f(c6505bu.f18357b != 0);
                    }
                    if (m14773h != i19) {
                        throw zzdok.m19750a();
                    }
                    return m14773h;
                }
                if (i6 == 0) {
                    C6542cu c6542cu2 = (C6542cu) zzdojVar;
                    i9 = C6468au.m14775j(bArr, i9, c6505bu);
                    c6542cu2.m14990f(c6505bu.f18357b != 0);
                    while (i9 < i3) {
                        int m14773h8 = C6468au.m14773h(bArr, i9, c6505bu);
                        if (i4 == c6505bu.f18356a) {
                            i9 = C6468au.m14775j(bArr, m14773h8, c6505bu);
                            c6542cu2.m14990f(c6505bu.f18357b != 0);
                        }
                    }
                }
                return i9;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        i9 = C6468au.m14773h(bArr, i9, c6505bu);
                        int i20 = c6505bu.f18356a;
                        if (i20 < 0) {
                            throw zzdok.m19751b();
                        }
                        if (i20 == 0) {
                            zzdojVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            zzdojVar.add(new String(bArr, i9, i20, zzdod.f25772a));
                            i9 += i20;
                        }
                        while (i9 < i3) {
                            int m14773h9 = C6468au.m14773h(bArr, i9, c6505bu);
                            if (i4 == c6505bu.f18356a) {
                                i9 = C6468au.m14773h(bArr, m14773h9, c6505bu);
                                int i21 = c6505bu.f18356a;
                                if (i21 < 0) {
                                    throw zzdok.m19751b();
                                }
                                if (i21 == 0) {
                                    zzdojVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    zzdojVar.add(new String(bArr, i9, i21, zzdod.f25772a));
                                    i9 += i21;
                                }
                            }
                        }
                    } else {
                        i9 = C6468au.m14773h(bArr, i9, c6505bu);
                        int i22 = c6505bu.f18356a;
                        if (i22 < 0) {
                            throw zzdok.m19751b();
                        }
                        if (i22 == 0) {
                            zzdojVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            int i23 = i9 + i22;
                            if (!C6804jx.m15384k(bArr, i9, i23)) {
                                throw zzdok.m19757h();
                            }
                            zzdojVar.add(new String(bArr, i9, i22, zzdod.f25772a));
                            i9 = i23;
                        }
                        while (i9 < i3) {
                            int m14773h10 = C6468au.m14773h(bArr, i9, c6505bu);
                            if (i4 == c6505bu.f18356a) {
                                i9 = C6468au.m14773h(bArr, m14773h10, c6505bu);
                                int i24 = c6505bu.f18356a;
                                if (i24 < 0) {
                                    throw zzdok.m19751b();
                                }
                                if (i24 == 0) {
                                    zzdojVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i25 = i9 + i24;
                                    if (!C6804jx.m15384k(bArr, i9, i25)) {
                                        throw zzdok.m19757h();
                                    }
                                    zzdojVar.add(new String(bArr, i9, i24, zzdod.f25772a));
                                    i9 = i25;
                                }
                            }
                        }
                    }
                }
                return i9;
            case 27:
                if (i6 == 2) {
                    return C6468au.m14770e(m14796N(i7), i4, bArr, i2, i3, zzdojVar, c6505bu);
                }
                return i9;
            case 28:
                if (i6 == 2) {
                    int m14773h11 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i26 = c6505bu.f18356a;
                    if (i26 < 0) {
                        throw zzdok.m19751b();
                    }
                    if (i26 > bArr.length - m14773h11) {
                        throw zzdok.m19750a();
                    }
                    if (i26 == 0) {
                        zzdojVar.add(zzdmr.f25661f);
                    } else {
                        zzdojVar.add(zzdmr.m19595A(bArr, m14773h11, i26));
                        m14773h11 += i26;
                    }
                    while (m14773h11 < i3) {
                        int m14773h12 = C6468au.m14773h(bArr, m14773h11, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return m14773h11;
                        }
                        m14773h11 = C6468au.m14773h(bArr, m14773h12, c6505bu);
                        int i27 = c6505bu.f18356a;
                        if (i27 < 0) {
                            throw zzdok.m19751b();
                        }
                        if (i27 > bArr.length - m14773h11) {
                            throw zzdok.m19750a();
                        }
                        if (i27 == 0) {
                            zzdojVar.add(zzdmr.f25661f);
                        } else {
                            zzdojVar.add(zzdmr.m19595A(bArr, m14773h11, i27));
                            m14773h11 += i27;
                        }
                    }
                    return m14773h11;
                }
                return i9;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        m14773h = C6468au.m14767b(i4, bArr, i2, i3, zzdojVar, c6505bu);
                    }
                    return i9;
                }
                m14773h = C6468au.m14774i(bArr, i9, zzdojVar, c6505bu);
                zzdob zzdobVar = (zzdob) t;
                zzdqu zzdquVar = zzdobVar.zzhhd;
                if (zzdquVar == zzdqu.m19782f()) {
                    zzdquVar = null;
                }
                zzdqu zzdquVar2 = (zzdqu) C6951nw.m15629b(i5, zzdojVar, m14798P(i7), zzdquVar, this.f18201q);
                if (zzdquVar2 != null) {
                    zzdobVar.zzhhd = zzdquVar2;
                }
                return m14773h;
            case 33:
            case 47:
                if (i6 == 2) {
                    C6691gv c6691gv3 = (C6691gv) zzdojVar;
                    int m14773h13 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i28 = c6505bu.f18356a + m14773h13;
                    while (m14773h13 < i28) {
                        m14773h13 = C6468au.m14773h(bArr, m14773h13, c6505bu);
                        c6691gv3.mo15174Z0(zzdnd.m19606B(c6505bu.f18356a));
                    }
                    if (m14773h13 == i28) {
                        return m14773h13;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 0) {
                    C6691gv c6691gv4 = (C6691gv) zzdojVar;
                    int m14773h14 = C6468au.m14773h(bArr, i9, c6505bu);
                    c6691gv4.mo15174Z0(zzdnd.m19606B(c6505bu.f18356a));
                    while (m14773h14 < i3) {
                        int m14773h15 = C6468au.m14773h(bArr, m14773h14, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return m14773h14;
                        }
                        m14773h14 = C6468au.m14773h(bArr, m14773h15, c6505bu);
                        c6691gv4.mo15174Z0(zzdnd.m19606B(c6505bu.f18356a));
                    }
                    return m14773h14;
                }
                return i9;
            case 34:
            case 48:
                if (i6 == 2) {
                    C6987ov c6987ov5 = (C6987ov) zzdojVar;
                    int m14773h16 = C6468au.m14773h(bArr, i9, c6505bu);
                    int i29 = c6505bu.f18356a + m14773h16;
                    while (m14773h16 < i29) {
                        m14773h16 = C6468au.m14775j(bArr, m14773h16, c6505bu);
                        c6987ov5.m15693i(zzdnd.m19608w(c6505bu.f18357b));
                    }
                    if (m14773h16 == i29) {
                        return m14773h16;
                    }
                    throw zzdok.m19750a();
                }
                if (i6 == 0) {
                    C6987ov c6987ov6 = (C6987ov) zzdojVar;
                    int m14775j2 = C6468au.m14775j(bArr, i9, c6505bu);
                    c6987ov6.m15693i(zzdnd.m19608w(c6505bu.f18357b));
                    while (m14775j2 < i3) {
                        int m14773h17 = C6468au.m14773h(bArr, m14775j2, c6505bu);
                        if (i4 != c6505bu.f18356a) {
                            return m14775j2;
                        }
                        m14775j2 = C6468au.m14775j(bArr, m14773h17, c6505bu);
                        c6987ov6.m15693i(zzdnd.m19608w(c6505bu.f18357b));
                    }
                    return m14775j2;
                }
                return i9;
            case 49:
                if (i6 == 3) {
                    InterfaceC6877lw m14796N = m14796N(i7);
                    int i30 = (i4 & (-8)) | 4;
                    i9 = C6468au.m14771f(m14796N, bArr, i2, i3, i30, c6505bu);
                    zzdojVar.add(c6505bu.f18358c);
                    while (i9 < i3) {
                        int m14773h18 = C6468au.m14773h(bArr, i9, c6505bu);
                        if (i4 == c6505bu.f18356a) {
                            i9 = C6468au.m14771f(m14796N, bArr, m14773h18, i3, i30, c6505bu);
                            zzdojVar.add(c6505bu.f18358c);
                        }
                    }
                }
                return i9;
            default:
                return i9;
        }
    }

    /* renamed from: n */
    private final <K, V> int m14809n(T t, byte[] bArr, int i2, int i3, int i4, long j2, C6505bu c6505bu) throws IOException {
        Unsafe unsafe = f18186b;
        Object m14797O = m14797O(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.f18203s.mo15938c(object)) {
            Object mo15940e = this.f18203s.mo15940e(m14797O);
            this.f18203s.mo15936a(mo15940e, object);
            unsafe.putObject(t, j2, mo15940e);
            object = mo15940e;
        }
        this.f18203s.mo15942g(m14797O);
        this.f18203s.mo15943h(object);
        int m14773h = C6468au.m14773h(bArr, i2, c6505bu);
        int i5 = c6505bu.f18356a;
        if (i5 < 0 || i5 > i3 - m14773h) {
            throw zzdok.m19750a();
        }
        throw null;
    }

    /* renamed from: p */
    static <T> C6470aw<T> m14810p(Class<T> cls, InterfaceC7320xv interfaceC7320xv, InterfaceC6544cw interfaceC6544cw, AbstractC6839kv abstractC6839kv, AbstractC6545cx<?, ?> abstractC6545cx, AbstractC7245vu<?> abstractC7245vu, InterfaceC7209uv interfaceC7209uv) {
        int i2;
        int charAt;
        int charAt2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt3;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        char charAt10;
        int i16;
        int i17;
        boolean z;
        int i18;
        C6766iw c6766iw;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        Class<?> cls2;
        String str;
        int i22;
        int i23;
        Field m14813s;
        int i24;
        char charAt11;
        int i25;
        Field m14813s2;
        Field m14813s3;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        char charAt16;
        if (!(interfaceC7320xv instanceof C6766iw)) {
            ((C7358yw) interfaceC7320xv).mo15355c();
            throw new NoSuchMethodError();
        }
        C6766iw c6766iw2 = (C6766iw) interfaceC7320xv;
        int i30 = 0;
        boolean z2 = c6766iw2.mo15355c() == zzdob.zze.f25767j;
        String m15356d = c6766iw2.m15356d();
        int length = m15356d.length();
        int charAt17 = m15356d.charAt(0);
        if (charAt17 >= 55296) {
            int i31 = charAt17 & 8191;
            int i32 = 1;
            int i33 = 13;
            while (true) {
                i2 = i32 + 1;
                charAt16 = m15356d.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i31 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i32 = i2;
            }
            charAt17 = i31 | (charAt16 << i33);
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int charAt18 = m15356d.charAt(i2);
        if (charAt18 >= 55296) {
            int i35 = charAt18 & 8191;
            int i36 = 13;
            while (true) {
                i29 = i34 + 1;
                charAt15 = m15356d.charAt(i34);
                if (charAt15 < 55296) {
                    break;
                }
                i35 |= (charAt15 & 8191) << i36;
                i36 += 13;
                i34 = i29;
            }
            charAt18 = i35 | (charAt15 << i36);
            i34 = i29;
        }
        if (charAt18 == 0) {
            iArr = f18185a;
            i7 = 0;
            i4 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i6 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt19 = m15356d.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt10 = m15356d.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt19 = i38 | (charAt10 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt20 = m15356d.charAt(i37);
            if (charAt20 >= 55296) {
                int i41 = charAt20 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt9 = m15356d.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt20 = i41 | (charAt9 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            charAt = m15356d.charAt(i40);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt8 = m15356d.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt = i44 | (charAt8 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt21 = m15356d.charAt(i43);
            if (charAt21 >= 55296) {
                int i47 = charAt21 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt7 = m15356d.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt21 = i47 | (charAt7 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt2 = m15356d.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt6 = m15356d.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt2 = i50 | (charAt6 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt22 = m15356d.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt5 = m15356d.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt22 = i53 | (charAt5 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt23 = m15356d.charAt(i52);
            if (charAt23 >= 55296) {
                int i56 = charAt23 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i9 = i57 + 1;
                    charAt4 = m15356d.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i57 = i9;
                }
                charAt23 = i56 | (charAt4 << i58);
                i3 = i9;
            } else {
                i3 = i55;
            }
            int i59 = i3 + 1;
            int charAt24 = m15356d.charAt(i3);
            if (charAt24 >= 55296) {
                int i60 = charAt24 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt3 = m15356d.charAt(i61);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                charAt24 = i60 | (charAt3 << i62);
                i59 = i8;
            }
            int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
            int i63 = (charAt19 << 1) + charAt20;
            i4 = charAt21;
            i5 = i63;
            i6 = charAt24;
            i30 = charAt19;
            i34 = i59;
            int i64 = charAt22;
            iArr = iArr2;
            i7 = i64;
        }
        Unsafe unsafe = f18186b;
        Object[] m15357e = c6766iw2.m15357e();
        Class<?> cls3 = c6766iw2.mo15354b().getClass();
        int i65 = i34;
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr = new Object[charAt2 << 1];
        int i66 = i6 + i7;
        int i67 = i6;
        int i68 = i65;
        int i69 = i66;
        int i70 = 0;
        int i71 = 0;
        while (i68 < length) {
            int i72 = i68 + 1;
            int charAt25 = m15356d.charAt(i68);
            int i73 = length;
            if (charAt25 >= 55296) {
                int i74 = charAt25 & 8191;
                int i75 = i72;
                int i76 = 13;
                while (true) {
                    i28 = i75 + 1;
                    charAt14 = m15356d.charAt(i75);
                    i16 = i6;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i74 |= (charAt14 & 8191) << i76;
                    i76 += 13;
                    i75 = i28;
                    i6 = i16;
                }
                charAt25 = i74 | (charAt14 << i76);
                i17 = i28;
            } else {
                i16 = i6;
                i17 = i72;
            }
            int i77 = i17 + 1;
            int charAt26 = m15356d.charAt(i17);
            if (charAt26 >= 55296) {
                int i78 = charAt26 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i27 = i79 + 1;
                    charAt13 = m15356d.charAt(i79);
                    z = z2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i27;
                    z2 = z;
                }
                charAt26 = i78 | (charAt13 << i80);
                i18 = i27;
            } else {
                z = z2;
                i18 = i77;
            }
            int i81 = charAt26 & 255;
            int i82 = i4;
            if ((charAt26 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int i83 = charAt;
            if (i81 >= 51) {
                int i84 = i18 + 1;
                int charAt27 = m15356d.charAt(i18);
                char c2 = 55296;
                if (charAt27 >= 55296) {
                    int i85 = charAt27 & 8191;
                    int i86 = 13;
                    while (true) {
                        i26 = i84 + 1;
                        charAt12 = m15356d.charAt(i84);
                        if (charAt12 < c2) {
                            break;
                        }
                        i85 |= (charAt12 & 8191) << i86;
                        i86 += 13;
                        i84 = i26;
                        c2 = 55296;
                    }
                    charAt27 = i85 | (charAt12 << i86);
                    i84 = i26;
                }
                int i87 = i81 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    objArr[((i71 / 3) << 1) + 1] = m15357e[i5];
                    i5++;
                } else if (i87 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i71 / 3) << 1) + 1] = m15357e[i5];
                    i5++;
                }
                int i89 = charAt27 << 1;
                Object obj = m15357e[i89];
                if (obj instanceof Field) {
                    m14813s2 = (Field) obj;
                } else {
                    m14813s2 = m14813s(cls3, (String) obj);
                    m15357e[i89] = m14813s2;
                }
                c6766iw = c6766iw2;
                String str2 = m15356d;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m14813s2);
                int i90 = i89 + 1;
                Object obj2 = m15357e[i90];
                if (obj2 instanceof Field) {
                    m14813s3 = (Field) obj2;
                } else {
                    m14813s3 = m14813s(cls3, (String) obj2);
                    m15357e[i90] = m14813s3;
                }
                cls2 = cls3;
                i20 = i5;
                i18 = i88;
                str = str2;
                i23 = 0;
                i22 = (int) unsafe.objectFieldOffset(m14813s3);
                i21 = i30;
            } else {
                c6766iw = c6766iw2;
                String str3 = m15356d;
                int i91 = i5 + 1;
                Field m14813s4 = m14813s(cls3, (String) m15357e[i5]);
                if (i81 == 9 || i81 == 17) {
                    i19 = 1;
                    objArr[((i71 / 3) << 1) + 1] = m14813s4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i19 = 1;
                        i25 = i91 + 1;
                        objArr[((i71 / 3) << 1) + 1] = m15357e[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i19 = 1;
                        if ((charAt17 & 1) == 1) {
                            i25 = i91 + 1;
                            objArr[((i71 / 3) << 1) + 1] = m15357e[i91];
                        }
                    } else {
                        if (i81 == 50) {
                            int i92 = i67 + 1;
                            iArr[i67] = i71;
                            int i93 = (i71 / 3) << 1;
                            int i94 = i91 + 1;
                            objArr[i93] = m15357e[i91];
                            if ((charAt26 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 0) {
                                i91 = i94 + 1;
                                objArr[i93 + 1] = m15357e[i94];
                                i67 = i92;
                            } else {
                                i91 = i94;
                                i19 = 1;
                                i67 = i92;
                            }
                        }
                        i19 = 1;
                    }
                    i91 = i25;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(m14813s4);
                if ((charAt17 & 1) != i19 || i81 > 17) {
                    i20 = i91;
                    i21 = i30;
                    cls2 = cls3;
                    str = str3;
                    i22 = 0;
                    i23 = 0;
                } else {
                    int i95 = i18 + 1;
                    str = str3;
                    int charAt28 = str.charAt(i18);
                    if (charAt28 >= 55296) {
                        int i96 = charAt28 & 8191;
                        int i97 = 13;
                        while (true) {
                            i24 = i95 + 1;
                            charAt11 = str.charAt(i95);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i95 = i24;
                        }
                        charAt28 = i96 | (charAt11 << i97);
                        i95 = i24;
                    }
                    int i98 = (i30 << 1) + (charAt28 / 32);
                    Object obj3 = m15357e[i98];
                    i20 = i91;
                    if (obj3 instanceof Field) {
                        m14813s = (Field) obj3;
                    } else {
                        m14813s = m14813s(cls3, (String) obj3);
                        m15357e[i98] = m14813s;
                    }
                    i21 = i30;
                    cls2 = cls3;
                    i22 = (int) unsafe.objectFieldOffset(m14813s);
                    i23 = charAt28 % 32;
                    i18 = i95;
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i69] = objectFieldOffset;
                    i69++;
                }
            }
            int i99 = i71 + 1;
            iArr3[i71] = charAt25;
            int i100 = i99 + 1;
            iArr3[i99] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i81 << 20);
            i71 = i100 + 1;
            iArr3[i100] = (i23 << 20) | i22;
            i30 = i21;
            m15356d = str;
            i68 = i18;
            cls3 = cls2;
            i4 = i82;
            length = i73;
            i6 = i16;
            z2 = z;
            charAt = i83;
            i5 = i20;
            c6766iw2 = c6766iw;
        }
        return new C6470aw<>(iArr3, objArr, charAt, i4, c6766iw2.mo15354b(), z2, false, iArr, i6, i66, interfaceC6544cw, abstractC6839kv, abstractC6545cx, abstractC7245vu, interfaceC7209uv);
    }

    /* renamed from: q */
    private final <K, V, UT, UB> UB m14811q(int i2, int i3, Map<K, V> map, zzdog zzdogVar, UB ub, AbstractC6545cx<UT, UB> abstractC6545cx) {
        C7172tv<?, ?> mo15942g = this.f18203s.mo15942g(m14797O(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzdogVar.mo14954a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC6545cx.mo15008m();
                }
                C6801ju m19600x = zzdmr.m19600x(zzdpc.m19770a(mo15942g, next.getKey(), next.getValue()));
                try {
                    zzdpc.m19771b(m19600x.m15373b(), mo15942g, next.getKey(), next.getValue());
                    abstractC6545cx.mo14997b(ub, i3, m19600x.m15372a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: r */
    private final <UT, UB> UB m14812r(Object obj, int i2, UB ub, AbstractC6545cx<UT, UB> abstractC6545cx) {
        zzdog m14798P;
        int i3 = this.f18187c[i2];
        Object m15190L = C6693gx.m15190L(obj, m14799Q(i2) & 1048575);
        return (m15190L == null || (m14798P = m14798P(i2)) == null) ? ub : (UB) m14811q(i2, i3, this.f18203s.mo15943h(m15190L), m14798P, ub, abstractC6545cx);
    }

    /* renamed from: s */
    private static Field m14813s(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: t */
    private static void m14814t(int i2, Object obj, InterfaceC7211ux interfaceC7211ux) throws IOException {
        if (obj instanceof String) {
            interfaceC7211ux.mo15877X(i2, (String) obj);
        } else {
            interfaceC7211ux.mo15862I(i2, (zzdmr) obj);
        }
    }

    /* renamed from: u */
    private static <UT, UB> void m14815u(AbstractC6545cx<UT, UB> abstractC6545cx, T t, InterfaceC7211ux interfaceC7211ux) throws IOException {
        abstractC6545cx.mo14999d(abstractC6545cx.mo15005j(t), interfaceC7211ux);
    }

    /* renamed from: v */
    private final <K, V> void m14816v(InterfaceC7211ux interfaceC7211ux, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            interfaceC7211ux.mo15875V(i2, this.f18203s.mo15942g(m14797O(i3)), this.f18203s.mo15937b(obj));
        }
    }

    /* renamed from: w */
    private final void m14817w(Object obj, int i2, InterfaceC6840kw interfaceC6840kw) throws IOException {
        if (m14801S(i2)) {
            C6693gx.m15205g(obj, i2 & 1048575, interfaceC6840kw.mo15455M());
        } else if (this.f18193i) {
            C6693gx.m15205g(obj, i2 & 1048575, interfaceC6840kw.mo15469a());
        } else {
            C6693gx.m15205g(obj, i2 & 1048575, interfaceC6840kw.mo15462T());
        }
    }

    /* renamed from: x */
    private final void m14818x(T t, T t2, int i2) {
        long m14799Q = m14799Q(i2) & 1048575;
        if (m14791I(t2, i2)) {
            Object m15190L = C6693gx.m15190L(t, m14799Q);
            Object m15190L2 = C6693gx.m15190L(t2, m14799Q);
            if (m15190L != null && m15190L2 != null) {
                C6693gx.m15205g(t, m14799Q, zzdod.m19746g(m15190L, m15190L2));
                m14793K(t, i2);
            } else if (m15190L2 != null) {
                C6693gx.m15205g(t, m14799Q, m15190L2);
                m14793K(t, i2);
            }
        }
    }

    /* renamed from: y */
    private final boolean m14819y(T t, int i2, int i3) {
        return C6693gx.m15183E(t, (long) (m14800R(i3) & 1048575)) == i2;
    }

    /* renamed from: z */
    private final boolean m14820z(T t, int i2, int i3, int i4) {
        return this.f18194j ? m14791I(t, i2) : (i3 & i4) != 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: a */
    public final void mo14821a(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.f18187c.length; i2 += 3) {
            int m14799Q = m14799Q(i2);
            long j2 = 1048575 & m14799Q;
            int i3 = this.f18187c[i2];
            switch ((m14799Q & 267386880) >>> 20) {
                case 0:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15202d(t, j2, C6693gx.m15189K(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15203e(t, j2, C6693gx.m15187I(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15204f(t, j2, C6693gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15204f(t, j2, C6693gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15212n(t, j2, C6693gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15204f(t, j2, C6693gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15212n(t, j2, C6693gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15206h(t, j2, C6693gx.m15186H(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15205g(t, j2, C6693gx.m15190L(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m14818x(t, t2, i2);
                    break;
                case 10:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15205g(t, j2, C6693gx.m15190L(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15212n(t, j2, C6693gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15212n(t, j2, C6693gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15212n(t, j2, C6693gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15204f(t, j2, C6693gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15212n(t, j2, C6693gx.m15183E(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m14791I(t2, i2)) {
                        C6693gx.m15204f(t, j2, C6693gx.m15184F(t2, j2));
                        m14793K(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m14818x(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f18200p.mo15442b(t, t2, j2);
                    break;
                case 50:
                    C6951nw.m15637g(this.f18203s, t, t2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m14819y(t2, i3, i2)) {
                        C6693gx.m15205g(t, j2, C6693gx.m15190L(t2, j2));
                        m14787E(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m14789G(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m14819y(t2, i3, i2)) {
                        C6693gx.m15205g(t, j2, C6693gx.m15190L(t2, j2));
                        m14787E(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m14789G(t, t2, i2);
                    break;
            }
        }
        if (this.f18194j) {
            return;
        }
        C6951nw.m15638h(this.f18201q, t, t2);
        if (this.f18192h) {
            C6951nw.m15636f(this.f18202r, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.ads.C6951nw.m15608H(com.google.android.gms.internal.ads.C6693gx.m15190L(r10, r6), com.google.android.gms.internal.ads.C6693gx.m15190L(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15184F(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15184F(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15183E(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15183E(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15184F(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15184F(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15183E(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15183E(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15183E(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15183E(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15183E(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15183E(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.ads.C6951nw.m15608H(com.google.android.gms.internal.ads.C6693gx.m15190L(r10, r6), com.google.android.gms.internal.ads.C6693gx.m15190L(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.ads.C6951nw.m15608H(com.google.android.gms.internal.ads.C6693gx.m15190L(r10, r6), com.google.android.gms.internal.ads.C6693gx.m15190L(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.ads.C6951nw.m15608H(com.google.android.gms.internal.ads.C6693gx.m15190L(r10, r6), com.google.android.gms.internal.ads.C6693gx.m15190L(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15186H(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15186H(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15183E(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15183E(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15184F(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15184F(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15183E(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15183E(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15184F(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15184F(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.ads.C6693gx.m15184F(r10, r6) == com.google.android.gms.internal.ads.C6693gx.m15184F(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.C6693gx.m15187I(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.C6693gx.m15187I(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.C6693gx.m15189K(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.C6693gx.m15189K(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.ads.C6951nw.m15608H(com.google.android.gms.internal.ads.C6693gx.m15190L(r10, r6), com.google.android.gms.internal.ads.C6693gx.m15190L(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo14822b(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6470aw.mo14822b(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: c */
    public final T mo14823c() {
        return (T) this.f18199o.mo14995a(this.f18191g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: d */
    public final int mo14824d(T t) {
        int i2;
        int m19748i;
        int length = this.f18187c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int m14799Q = m14799Q(i4);
            int i5 = this.f18187c[i4];
            long j2 = 1048575 & m14799Q;
            int i6 = 37;
            switch ((m14799Q & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19748i(Double.doubleToLongBits(C6693gx.m15189K(t, j2)));
                    i3 = i2 + m19748i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    m19748i = Float.floatToIntBits(C6693gx.m15187I(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19748i(C6693gx.m15184F(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19748i(C6693gx.m15184F(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15183E(t, j2);
                    i3 = i2 + m19748i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19748i(C6693gx.m15184F(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15183E(t, j2);
                    i3 = i2 + m19748i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19747h(C6693gx.m15186H(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    m19748i = ((String) C6693gx.m15190L(t, j2)).hashCode();
                    i3 = i2 + m19748i;
                    break;
                case 9:
                    Object m15190L = C6693gx.m15190L(t, j2);
                    if (m15190L != null) {
                        i6 = m15190L.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15190L(t, j2).hashCode();
                    i3 = i2 + m19748i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15183E(t, j2);
                    i3 = i2 + m19748i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15183E(t, j2);
                    i3 = i2 + m19748i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15183E(t, j2);
                    i3 = i2 + m19748i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19748i(C6693gx.m15184F(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15183E(t, j2);
                    i3 = i2 + m19748i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    m19748i = zzdod.m19748i(C6693gx.m15184F(t, j2));
                    i3 = i2 + m19748i;
                    break;
                case 17:
                    Object m15190L2 = C6693gx.m15190L(t, j2);
                    if (m15190L2 != null) {
                        i6 = m15190L2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15190L(t, j2).hashCode();
                    i3 = i2 + m19748i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    m19748i = C6693gx.m15190L(t, j2).hashCode();
                    i3 = i2 + m19748i;
                    break;
                case 51:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19748i(Double.doubleToLongBits(m14794L(t, j2)));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = Float.floatToIntBits(m14795M(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = m14803U(t, j2);
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = m14803U(t, j2);
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19747h(m14805W(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = ((String) C6693gx.m15190L(t, j2)).hashCode();
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = C6693gx.m15190L(t, j2).hashCode();
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = C6693gx.m15190L(t, j2).hashCode();
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = m14803U(t, j2);
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = m14803U(t, j2);
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = m14803U(t, j2);
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = m14803U(t, j2);
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = zzdod.m19748i(m14804V(t, j2));
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m14819y(t, i5, i4)) {
                        i2 = i3 * 53;
                        m19748i = C6693gx.m15190L(t, j2).hashCode();
                        i3 = i2 + m19748i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.f18201q.mo15005j(t).hashCode();
        return this.f18192h ? (hashCode * 53) + this.f18202r.mo15965i(t).hashCode() : hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a26  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14825e(T r14, com.google.android.gms.internal.ads.InterfaceC7211ux r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6470aw.mo14825e(java.lang.Object, com.google.android.gms.internal.ads.ux):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: f */
    public final void mo14826f(T t) {
        int i2;
        int i3 = this.f18197m;
        while (true) {
            i2 = this.f18198n;
            if (i3 >= i2) {
                break;
            }
            long m14799Q = m14799Q(this.f18196l[i3]) & 1048575;
            Object m15190L = C6693gx.m15190L(t, m14799Q);
            if (m15190L != null) {
                C6693gx.m15205g(t, m14799Q, this.f18203s.mo15939d(m15190L));
            }
            i3++;
        }
        int length = this.f18196l.length;
        while (i2 < length) {
            this.f18200p.mo15443e(t, this.f18196l[i2]);
            i2++;
        }
        this.f18201q.mo15002g(t);
        if (this.f18192h) {
            this.f18202r.mo15963g(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020f, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e2, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14827g(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.C6505bu r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6470aw.mo14827g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:348:0x05ce A[LOOP:5: B:346:0x05ca->B:348:0x05ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05db  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14828h(T r13, com.google.android.gms.internal.ads.InterfaceC6840kw r14, com.google.android.gms.internal.ads.zzdno r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6470aw.mo14828h(java.lang.Object, com.google.android.gms.internal.ads.kw, com.google.android.gms.internal.ads.zzdno):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: i */
    public final int mo14829i(T t) {
        int i2;
        int i3;
        long j2;
        int m19659z0;
        int m19655w0;
        int m19651s;
        int m15645o;
        int m19635h0;
        int m19637j0;
        int m19619I;
        int m15645o2;
        int m19635h02;
        int m19637j02;
        int i4 = 267386880;
        if (this.f18194j) {
            Unsafe unsafe = f18186b;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.f18187c.length) {
                int m14799Q = m14799Q(i5);
                int i7 = (m14799Q & i4) >>> 20;
                int i8 = this.f18187c[i5];
                long j3 = m14799Q & 1048575;
                int i9 = (i7 < zzdnv.f25709O.m19712g() || i7 > zzdnv.f25722b0.m19712g()) ? 0 : this.f18187c[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19619I(i8, 0.0d);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19656x(i8, 0.0f);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19659z0(i8, C6693gx.m15184F(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19611B0(i8, C6693gx.m15184F(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19640m(i8, C6693gx.m15183E(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19615F0(i8, 0L);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19649r(i8, 0);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19655w0(i8, true);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m14791I(t, i5)) {
                            Object m15190L = C6693gx.m15190L(t, j3);
                            m19619I = m15190L instanceof zzdmr ? zzdni.m19620J(i8, (zzdmr) m15190L) : zzdni.m19632c0(i8, (String) m15190L);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m14791I(t, i5)) {
                            m19619I = C6951nw.m15656z(i8, C6693gx.m15190L(t, j3), m14796N(i5));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19620J(i8, (zzdmr) C6693gx.m15190L(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19644o(i8, C6693gx.m15183E(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19653t(i8, C6693gx.m15183E(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19651s(i8, 0);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19617G0(i8, 0L);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19648q(i8, C6693gx.m15183E(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19613D0(i8, C6693gx.m15184F(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m14791I(t, i5)) {
                            m19619I = zzdni.m19622L(i8, (zzdpk) C6693gx.m15190L(t, j3), m14796N(i5));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m19619I = C6951nw.m15628a0(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 19:
                        m19619I = C6951nw.m15626Z(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 20:
                        m19619I = C6951nw.m15619S(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 21:
                        m19619I = C6951nw.m15620T(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 22:
                        m19619I = C6951nw.m15623W(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 23:
                        m19619I = C6951nw.m15628a0(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 24:
                        m19619I = C6951nw.m15626Z(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 25:
                        m19619I = C6951nw.m15630b0(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 26:
                        m19619I = C6951nw.m15601A(i8, m14792J(t, j3));
                        i6 += m19619I;
                        break;
                    case 27:
                        m19619I = C6951nw.m15602B(i8, m14792J(t, j3), m14796N(i5));
                        i6 += m19619I;
                        break;
                    case 28:
                        m19619I = C6951nw.m15604D(i8, m14792J(t, j3));
                        i6 += m19619I;
                        break;
                    case 29:
                        m19619I = C6951nw.m15624X(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 30:
                        m19619I = C6951nw.m15622V(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 31:
                        m19619I = C6951nw.m15626Z(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 32:
                        m19619I = C6951nw.m15628a0(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 33:
                        m19619I = C6951nw.m15625Y(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 34:
                        m19619I = C6951nw.m15621U(i8, m14792J(t, j3), false);
                        i6 += m19619I;
                        break;
                    case 35:
                        m15645o2 = C6951nw.m15645o((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 36:
                        m15645o2 = C6951nw.m15644n((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 37:
                        m15645o2 = C6951nw.m15632c0((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 38:
                        m15645o2 = C6951nw.m15634d0((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 39:
                        m15645o2 = C6951nw.m15641k((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 40:
                        m15645o2 = C6951nw.m15645o((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 41:
                        m15645o2 = C6951nw.m15644n((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 42:
                        m15645o2 = C6951nw.m15646p((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 43:
                        m15645o2 = C6951nw.m15642l((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 44:
                        m15645o2 = C6951nw.m15640j((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 45:
                        m15645o2 = C6951nw.m15644n((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 46:
                        m15645o2 = C6951nw.m15645o((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 47:
                        m15645o2 = C6951nw.m15643m((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 48:
                        m15645o2 = C6951nw.m15639i((List) unsafe.getObject(t, j3));
                        if (m15645o2 <= 0) {
                            break;
                        } else {
                            if (this.f18195k) {
                                unsafe.putInt(t, i9, m15645o2);
                            }
                            m19635h02 = zzdni.m19635h0(i8);
                            m19637j02 = zzdni.m19637j0(m15645o2);
                            m19619I = m19635h02 + m19637j02 + m15645o2;
                            i6 += m19619I;
                            break;
                        }
                    case 49:
                        m19619I = C6951nw.m15605E(i8, m14792J(t, j3), m14796N(i5));
                        i6 += m19619I;
                        break;
                    case 50:
                        m19619I = this.f18203s.mo15941f(i8, C6693gx.m15190L(t, j3), m14797O(i5));
                        i6 += m19619I;
                        break;
                    case 51:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19619I(i8, 0.0d);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19656x(i8, 0.0f);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19659z0(i8, m14804V(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19611B0(i8, m14804V(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19640m(i8, m14803U(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19615F0(i8, 0L);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19649r(i8, 0);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19655w0(i8, true);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m14819y(t, i8, i5)) {
                            Object m15190L2 = C6693gx.m15190L(t, j3);
                            m19619I = m15190L2 instanceof zzdmr ? zzdni.m19620J(i8, (zzdmr) m15190L2) : zzdni.m19632c0(i8, (String) m15190L2);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m14819y(t, i8, i5)) {
                            m19619I = C6951nw.m15656z(i8, C6693gx.m15190L(t, j3), m14796N(i5));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19620J(i8, (zzdmr) C6693gx.m15190L(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19644o(i8, m14803U(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19653t(i8, m14803U(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19651s(i8, 0);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19617G0(i8, 0L);
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19648q(i8, m14803U(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19613D0(i8, m14804V(t, j3));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m14819y(t, i8, i5)) {
                            m19619I = zzdni.m19622L(i8, (zzdpk) C6693gx.m15190L(t, j3), m14796N(i5));
                            i6 += m19619I;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
                i4 = 267386880;
            }
            return i6 + m14806k(this.f18201q, t);
        }
        Unsafe unsafe2 = f18186b;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f18187c.length; i13 += 3) {
            int m14799Q2 = m14799Q(i13);
            int[] iArr = this.f18187c;
            int i14 = iArr[i13];
            int i15 = (m14799Q2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & 1048575;
                i3 = 1 << (i16 >>> 20);
                if (i17 != i10) {
                    i12 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i2 = i16;
            } else {
                i2 = (!this.f18195k || i15 < zzdnv.f25709O.m19712g() || i15 > zzdnv.f25722b0.m19712g()) ? 0 : this.f18187c[i13 + 2] & 1048575;
                i3 = 0;
            }
            long j4 = m14799Q2 & 1048575;
            switch (i15) {
                case 0:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        i11 += zzdni.m19619I(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        i11 += zzdni.m19656x(i14, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        m19659z0 = zzdni.m19659z0(i14, unsafe2.getLong(t, j4));
                        i11 += m19659z0;
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        m19659z0 = zzdni.m19611B0(i14, unsafe2.getLong(t, j4));
                        i11 += m19659z0;
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        m19659z0 = zzdni.m19640m(i14, unsafe2.getInt(t, j4));
                        i11 += m19659z0;
                    }
                    break;
                case 5:
                    j2 = 0;
                    if ((i12 & i3) != 0) {
                        m19659z0 = zzdni.m19615F0(i14, 0L);
                        i11 += m19659z0;
                    }
                    break;
                case 6:
                    if ((i12 & i3) != 0) {
                        i11 += zzdni.m19649r(i14, 0);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 7:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19655w0(i14, true);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 8:
                    if ((i12 & i3) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        m19655w0 = object instanceof zzdmr ? zzdni.m19620J(i14, (zzdmr) object) : zzdni.m19632c0(i14, (String) object);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 9:
                    if ((i12 & i3) != 0) {
                        m19655w0 = C6951nw.m15656z(i14, unsafe2.getObject(t, j4), m14796N(i13));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 10:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19620J(i14, (zzdmr) unsafe2.getObject(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 11:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19644o(i14, unsafe2.getInt(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 12:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19653t(i14, unsafe2.getInt(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 13:
                    if ((i12 & i3) != 0) {
                        m19651s = zzdni.m19651s(i14, 0);
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 14:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19617G0(i14, 0L);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 15:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19648q(i14, unsafe2.getInt(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 16:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19613D0(i14, unsafe2.getLong(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 17:
                    if ((i12 & i3) != 0) {
                        m19655w0 = zzdni.m19622L(i14, (zzdpk) unsafe2.getObject(t, j4), m14796N(i13));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 18:
                    m19655w0 = C6951nw.m15628a0(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 19:
                    m19655w0 = C6951nw.m15626Z(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 20:
                    m19655w0 = C6951nw.m15619S(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 21:
                    m19655w0 = C6951nw.m15620T(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 22:
                    m19655w0 = C6951nw.m15623W(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 23:
                    m19655w0 = C6951nw.m15628a0(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 24:
                    m19655w0 = C6951nw.m15626Z(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 25:
                    m19655w0 = C6951nw.m15630b0(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 26:
                    m19655w0 = C6951nw.m15601A(i14, (List) unsafe2.getObject(t, j4));
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 27:
                    m19655w0 = C6951nw.m15602B(i14, (List) unsafe2.getObject(t, j4), m14796N(i13));
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 28:
                    m19655w0 = C6951nw.m15604D(i14, (List) unsafe2.getObject(t, j4));
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 29:
                    m19655w0 = C6951nw.m15624X(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 30:
                    m19655w0 = C6951nw.m15622V(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 31:
                    m19655w0 = C6951nw.m15626Z(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 32:
                    m19655w0 = C6951nw.m15628a0(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 33:
                    m19655w0 = C6951nw.m15625Y(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 34:
                    m19655w0 = C6951nw.m15621U(i14, (List) unsafe2.getObject(t, j4), false);
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 35:
                    m15645o = C6951nw.m15645o((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 36:
                    m15645o = C6951nw.m15644n((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 37:
                    m15645o = C6951nw.m15632c0((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 38:
                    m15645o = C6951nw.m15634d0((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 39:
                    m15645o = C6951nw.m15641k((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 40:
                    m15645o = C6951nw.m15645o((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 41:
                    m15645o = C6951nw.m15644n((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 42:
                    m15645o = C6951nw.m15646p((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 43:
                    m15645o = C6951nw.m15642l((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 44:
                    m15645o = C6951nw.m15640j((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 45:
                    m15645o = C6951nw.m15644n((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 46:
                    m15645o = C6951nw.m15645o((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 47:
                    m15645o = C6951nw.m15643m((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 48:
                    m15645o = C6951nw.m15639i((List) unsafe2.getObject(t, j4));
                    if (m15645o > 0) {
                        if (this.f18195k) {
                            unsafe2.putInt(t, i2, m15645o);
                        }
                        m19635h0 = zzdni.m19635h0(i14);
                        m19637j0 = zzdni.m19637j0(m15645o);
                        m19651s = m19635h0 + m19637j0 + m15645o;
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 49:
                    m19655w0 = C6951nw.m15605E(i14, (List) unsafe2.getObject(t, j4), m14796N(i13));
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 50:
                    m19655w0 = this.f18203s.mo15941f(i14, unsafe2.getObject(t, j4), m14797O(i13));
                    i11 += m19655w0;
                    j2 = 0;
                    break;
                case 51:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19619I(i14, 0.0d);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 52:
                    if (m14819y(t, i14, i13)) {
                        m19651s = zzdni.m19656x(i14, 0.0f);
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 53:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19659z0(i14, m14804V(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 54:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19611B0(i14, m14804V(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 55:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19640m(i14, m14803U(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 56:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19615F0(i14, 0L);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 57:
                    if (m14819y(t, i14, i13)) {
                        m19651s = zzdni.m19649r(i14, 0);
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 58:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19655w0(i14, true);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 59:
                    if (m14819y(t, i14, i13)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        m19655w0 = object2 instanceof zzdmr ? zzdni.m19620J(i14, (zzdmr) object2) : zzdni.m19632c0(i14, (String) object2);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 60:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = C6951nw.m15656z(i14, unsafe2.getObject(t, j4), m14796N(i13));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 61:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19620J(i14, (zzdmr) unsafe2.getObject(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 62:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19644o(i14, m14803U(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 63:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19653t(i14, m14803U(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 64:
                    if (m14819y(t, i14, i13)) {
                        m19651s = zzdni.m19651s(i14, 0);
                        i11 += m19651s;
                    }
                    j2 = 0;
                    break;
                case 65:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19617G0(i14, 0L);
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 66:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19648q(i14, m14803U(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 67:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19613D0(i14, m14804V(t, j4));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                case 68:
                    if (m14819y(t, i14, i13)) {
                        m19655w0 = zzdni.m19622L(i14, (zzdpk) unsafe2.getObject(t, j4), m14796N(i13));
                        i11 += m19655w0;
                    }
                    j2 = 0;
                    break;
                default:
                    j2 = 0;
                    break;
            }
        }
        int m14806k = i11 + m14806k(this.f18201q, t);
        return this.f18192h ? m14806k + this.f18202r.mo15965i(t).m16127n() : m14806k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC6877lw
    /* renamed from: j */
    public final boolean mo14830j(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.f18197m) {
                return !this.f18192h || this.f18202r.mo15965i(t).m16123d();
            }
            int i6 = this.f18196l[i4];
            int i7 = this.f18187c[i6];
            int m14799Q = m14799Q(i6);
            if (this.f18194j) {
                i2 = 0;
            } else {
                int i8 = this.f18187c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = f18186b.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & m14799Q) != 0) && !m14820z(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & m14799Q) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (m14819y(t, i7, i6) && !m14783A(t, m14799Q, m14796N(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.f18203s.mo15937b(C6693gx.m15190L(t, m14799Q & 1048575)).isEmpty()) {
                            this.f18203s.mo15942g(m14797O(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) C6693gx.m15190L(t, m14799Q & 1048575);
                if (!list.isEmpty()) {
                    InterfaceC6877lw m14796N = m14796N(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        }
                        if (!m14796N.mo14830j(list.get(i11))) {
                            z = false;
                            break;
                        }
                        i11++;
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m14820z(t, i6, i5, i2) && !m14783A(t, m14799Q, m14796N(i6))) {
                return false;
            }
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    final int m14831o(T t, byte[] bArr, int i2, int i3, int i4, C6505bu c6505bu) throws IOException {
        Unsafe unsafe;
        int i5;
        Object obj;
        C6470aw<T> c6470aw;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj2;
        C6505bu c6505bu2;
        int i12;
        int i13;
        int i14;
        C6505bu c6505bu3;
        int i15;
        C6505bu c6505bu4;
        int i16;
        int i17;
        C6505bu c6505bu5;
        int i18;
        int i19;
        int i20;
        C6470aw<T> c6470aw2 = this;
        Object obj3 = t;
        byte[] bArr2 = bArr;
        int i21 = i3;
        int i22 = i4;
        C6505bu c6505bu6 = c6505bu;
        Unsafe unsafe2 = f18186b;
        int i23 = i2;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b2 = bArr2[i23];
                if (b2 < 0) {
                    i7 = C6468au.m14769d(b2, bArr2, i29, c6505bu6);
                    i6 = c6505bu6.f18356a;
                } else {
                    i6 = b2;
                    i7 = i29;
                }
                int i30 = i6 >>> 3;
                int i31 = i6 & 7;
                int m14784B = i30 > i24 ? c6470aw2.m14784B(i30, i25 / 3) : c6470aw2.m14802T(i30);
                if (m14784B == -1) {
                    i8 = i30;
                    i9 = i7;
                    i10 = i6;
                    unsafe = unsafe2;
                    i5 = i22;
                    i11 = 0;
                } else {
                    int[] iArr = c6470aw2.f18187c;
                    int i32 = iArr[m14784B + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = i6;
                    long j2 = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[m14784B + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i28) {
                            if (i28 != -1) {
                                unsafe2.putInt(obj3, i28, i27);
                            }
                            i27 = unsafe2.getInt(obj3, i37);
                            i28 = i37;
                        }
                        switch (i33) {
                            case 0:
                                i12 = m14784B;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                i16 = i7;
                                if (i31 != 1) {
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    C6693gx.m15202d(obj3, j2, C6468au.m14781p(bArr2, i16));
                                    i23 = i16 + 8;
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 1:
                                i12 = m14784B;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                i16 = i7;
                                if (i31 != 5) {
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    C6693gx.m15203e(obj3, j2, C6468au.m14782q(bArr2, i16));
                                    i23 = i16 + 4;
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 2:
                            case 3:
                                i12 = m14784B;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                i16 = i7;
                                if (i31 != 0) {
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    int m14775j = C6468au.m14775j(bArr2, i16, c6505bu);
                                    unsafe2.putLong(t, j2, c6505bu.f18357b);
                                    i27 |= i36;
                                    i23 = m14775j;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu;
                                    i28 = i15;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 4:
                            case 11:
                                i12 = m14784B;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                i16 = i7;
                                if (i31 != 0) {
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i23 = C6468au.m14773h(bArr2, i16, c6505bu4);
                                    unsafe2.putInt(obj3, j2, c6505bu4.f18356a);
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 5:
                            case 14:
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                if (i31 != 1) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i15 = i28;
                                    i16 = i7;
                                    unsafe2.putLong(t, j2, C6468au.m14780o(bArr2, i7));
                                    i23 = i16 + 8;
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 6:
                            case 13:
                                i17 = i3;
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu5 = c6505bu;
                                if (i31 != 5) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j2, C6468au.m14779n(bArr2, i7));
                                    i23 = i7 + 4;
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu5;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 7:
                                i17 = i3;
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu5 = c6505bu;
                                if (i31 != 0) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    int m14775j2 = C6468au.m14775j(bArr2, i7, c6505bu5);
                                    C6693gx.m15206h(obj3, j2, c6505bu5.f18357b != 0);
                                    i27 |= i36;
                                    i23 = m14775j2;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu5;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 8:
                                i17 = i3;
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu5 = c6505bu;
                                if (i31 != 2) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i23 = (i32 & 536870912) == 0 ? C6468au.m14776k(bArr2, i7, c6505bu5) : C6468au.m14777l(bArr2, i7, c6505bu5);
                                    unsafe2.putObject(obj3, j2, c6505bu5.f18358c);
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu5;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 9:
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu5 = c6505bu;
                                if (i31 != 2) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i17 = i3;
                                    i23 = C6468au.m14772g(c6470aw2.m14796N(i12), bArr2, i7, i17, c6505bu5);
                                    if ((i27 & i36) == 0) {
                                        unsafe2.putObject(obj3, j2, c6505bu5.f18358c);
                                    } else {
                                        unsafe2.putObject(obj3, j2, zzdod.m19746g(unsafe2.getObject(obj3, j2), c6505bu5.f18358c));
                                    }
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu5;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 10:
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                if (i31 != 2) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i23 = C6468au.m14778m(bArr2, i7, c6505bu4);
                                    unsafe2.putObject(obj3, j2, c6505bu4.f18358c);
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 12:
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                if (i31 != 0) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i23 = C6468au.m14773h(bArr2, i7, c6505bu4);
                                    int i38 = c6505bu4.f18356a;
                                    zzdog m14798P = c6470aw2.m14798P(i12);
                                    if (m14798P == null || m14798P.mo14954a(i38)) {
                                        unsafe2.putInt(obj3, j2, i38);
                                        i27 |= i36;
                                        i26 = i14;
                                        i25 = i12;
                                        i24 = i13;
                                        c6505bu6 = c6505bu4;
                                        i21 = i3;
                                        i22 = i4;
                                    } else {
                                        m14786D(t).m19791k(i14, Long.valueOf(i38));
                                        i26 = i14;
                                        i25 = i12;
                                        i24 = i13;
                                        c6505bu6 = c6505bu4;
                                        i21 = i3;
                                        i22 = i4;
                                    }
                                }
                                break;
                            case 15:
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c6505bu4 = c6505bu;
                                if (i31 != 0) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i23 = C6468au.m14773h(bArr2, i7, c6505bu4);
                                    unsafe2.putInt(obj3, j2, zzdnd.m19606B(c6505bu4.f18356a));
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 16:
                                i12 = m14784B;
                                i13 = i30;
                                i14 = i34;
                                if (i31 != 0) {
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    int m14775j3 = C6468au.m14775j(bArr2, i7, c6505bu);
                                    c6505bu4 = c6505bu;
                                    unsafe2.putLong(t, j2, zzdnd.m19608w(c6505bu.f18357b));
                                    i27 |= i36;
                                    i23 = m14775j3;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c6505bu6 = c6505bu4;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 17:
                                if (i31 != 3) {
                                    i12 = m14784B;
                                    i13 = i30;
                                    i14 = i34;
                                    i15 = i28;
                                    i16 = i7;
                                    i9 = i16;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i28 = i15;
                                    i10 = i14;
                                    i5 = i4;
                                    break;
                                } else {
                                    i23 = C6468au.m14771f(c6470aw2.m14796N(m14784B), bArr, i7, i3, (i30 << 3) | 4, c6505bu);
                                    if ((i27 & i36) == 0) {
                                        c6505bu3 = c6505bu;
                                        unsafe2.putObject(obj3, j2, c6505bu3.f18358c);
                                    } else {
                                        c6505bu3 = c6505bu;
                                        unsafe2.putObject(obj3, j2, zzdod.m19746g(unsafe2.getObject(obj3, j2), c6505bu3.f18358c));
                                    }
                                    i27 |= i36;
                                    bArr2 = bArr;
                                    i21 = i3;
                                    i26 = i34;
                                    i25 = m14784B;
                                    i24 = i30;
                                    i22 = i4;
                                    c6505bu6 = c6505bu3;
                                }
                            default:
                                i12 = m14784B;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                i16 = i7;
                                i9 = i16;
                                i11 = i12;
                                unsafe = unsafe2;
                                i8 = i13;
                                i28 = i15;
                                i10 = i14;
                                i5 = i4;
                                break;
                        }
                    } else {
                        int i39 = i28;
                        int i40 = i7;
                        bArr2 = bArr;
                        C6505bu c6505bu7 = c6505bu6;
                        if (i33 != 27) {
                            i18 = i27;
                            if (i33 <= 49) {
                                i8 = i30;
                                i20 = i34;
                                i11 = m14784B;
                                unsafe = unsafe2;
                                i23 = m14808m(t, bArr, i40, i3, i34, i30, i31, m14784B, i32, i33, j2, c6505bu);
                                if (i23 == i40) {
                                    i5 = i4;
                                    i9 = i23;
                                } else {
                                    c6470aw2 = this;
                                    obj3 = t;
                                    bArr2 = bArr;
                                    i21 = i3;
                                    i22 = i4;
                                    c6505bu6 = c6505bu;
                                    i28 = i39;
                                    i25 = i11;
                                    i27 = i18;
                                    i24 = i8;
                                    i26 = i20;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i8 = i30;
                                i19 = i40;
                                i20 = i34;
                                i11 = m14784B;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i23 = m14807l(t, bArr, i19, i3, i20, i8, i31, i32, i33, j2, i11, c6505bu);
                                    if (i23 != i19) {
                                        c6470aw2 = this;
                                        obj3 = t;
                                        i21 = i3;
                                        i22 = i4;
                                        i26 = i20;
                                        i24 = i8;
                                        i28 = i39;
                                        i25 = i11;
                                        i27 = i18;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        c6505bu6 = c6505bu;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m14809n(t, bArr, i19, i3, i11, j2, c6505bu);
                                    if (i23 != i19) {
                                        c6470aw2 = this;
                                        obj3 = t;
                                        bArr2 = bArr;
                                        i21 = i3;
                                        i22 = i4;
                                        c6505bu6 = c6505bu;
                                        i28 = i39;
                                        i25 = i11;
                                        i27 = i18;
                                        i24 = i8;
                                        i26 = i20;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i5 = i4;
                                    i9 = i19;
                                }
                                i5 = i4;
                                i9 = i23;
                            }
                        } else if (i31 == 2) {
                            zzdoj zzdojVar = (zzdoj) unsafe2.getObject(obj3, j2);
                            if (!zzdojVar.mo16107m0()) {
                                int size = zzdojVar.size();
                                zzdojVar = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j2, zzdojVar);
                            }
                            i23 = C6468au.m14770e(c6470aw2.m14796N(m14784B), i34, bArr, i40, i3, zzdojVar, c6505bu);
                            i22 = i4;
                            i24 = i30;
                            i26 = i34;
                            i25 = m14784B;
                            c6505bu6 = c6505bu7;
                            i28 = i39;
                            i27 = i27;
                            i21 = i3;
                        } else {
                            i18 = i27;
                            i8 = i30;
                            i19 = i40;
                            i20 = i34;
                            i11 = m14784B;
                            unsafe = unsafe2;
                            i5 = i4;
                            i9 = i19;
                        }
                        i28 = i39;
                        i27 = i18;
                        i10 = i20;
                    }
                }
                if (i10 != i5 || i5 == 0) {
                    if (this.f18192h) {
                        c6505bu2 = c6505bu;
                        if (c6505bu2.f18359d != zzdno.m19702d()) {
                            int i41 = i8;
                            if (c6505bu2.f18359d.m19704a(this.f18191g, i41) != null) {
                                zzdob.zzc zzcVar = (zzdob.zzc) t;
                                if (zzcVar.zzhhj.m16122c()) {
                                    zzcVar.zzhhj = (C7356yu) zzcVar.zzhhj.clone();
                                }
                                throw new NoSuchMethodError();
                            }
                            i23 = C6468au.m14768c(i10, bArr, i9, i3, m14786D(t), c6505bu);
                            obj3 = t;
                            i21 = i3;
                            i26 = i10;
                            c6470aw2 = this;
                            c6505bu6 = c6505bu2;
                            i24 = i41;
                            i25 = i11;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i22 = i5;
                        } else {
                            obj2 = t;
                        }
                    } else {
                        obj2 = t;
                        c6505bu2 = c6505bu;
                    }
                    i23 = C6468au.m14768c(i10, bArr, i9, i3, m14786D(t), c6505bu);
                    i26 = i10;
                    c6470aw2 = this;
                    c6505bu6 = c6505bu2;
                    i24 = i8;
                    obj3 = obj2;
                    i25 = i11;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i21 = i3;
                    i22 = i5;
                } else {
                    c6470aw = this;
                    obj = t;
                    i23 = i9;
                    i26 = i10;
                }
            } else {
                unsafe = unsafe2;
                i5 = i22;
                obj = obj3;
                c6470aw = c6470aw2;
            }
        }
        if (i28 != -1) {
            unsafe.putInt(obj, i28, i27);
        }
        zzdqu zzdquVar = null;
        for (int i42 = c6470aw.f18197m; i42 < c6470aw.f18198n; i42++) {
            zzdquVar = (zzdqu) c6470aw.m14812r(obj, c6470aw.f18196l[i42], zzdquVar, c6470aw.f18201q);
        }
        if (zzdquVar != null) {
            c6470aw.f18201q.mo15013r(obj, zzdquVar);
        }
        if (i5 == 0) {
            if (i23 != i3) {
                throw zzdok.m19756g();
            }
        } else if (i23 > i3 || i26 != i5) {
            throw zzdok.m19756g();
        }
        return i23;
    }
}
