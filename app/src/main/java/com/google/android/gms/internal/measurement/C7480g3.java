package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* loaded from: classes2.dex */
final class C7480g3<T> implements InterfaceC7534p3<T> {

    /* renamed from: a */
    private static final int[] f27732a = new int[0];

    /* renamed from: b */
    private static final Unsafe f27733b = C7505k4.m21208t();

    /* renamed from: c */
    private final int[] f27734c;

    /* renamed from: d */
    private final Object[] f27735d;

    /* renamed from: e */
    private final int f27736e;

    /* renamed from: f */
    private final int f27737f;

    /* renamed from: g */
    private final zzgo f27738g;

    /* renamed from: h */
    private final boolean f27739h;

    /* renamed from: i */
    private final boolean f27740i;

    /* renamed from: j */
    private final boolean f27741j;

    /* renamed from: k */
    private final boolean f27742k;

    /* renamed from: l */
    private final int[] f27743l;

    /* renamed from: m */
    private final int f27744m;

    /* renamed from: n */
    private final int f27745n;

    /* renamed from: o */
    private final InterfaceC7498j3 f27746o;

    /* renamed from: p */
    private final AbstractC7551s2 f27747p;

    /* renamed from: q */
    private final AbstractC7487h4<?, ?> f27748q;

    /* renamed from: r */
    private final AbstractC7461d2<?> f27749r;

    /* renamed from: s */
    private final InterfaceC7444a3 f27750s;

    private C7480g3(int[] iArr, Object[] objArr, int i2, int i3, zzgo zzgoVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, InterfaceC7498j3 interfaceC7498j3, AbstractC7551s2 abstractC7551s2, AbstractC7487h4<?, ?> abstractC7487h4, AbstractC7461d2<?> abstractC7461d2, InterfaceC7444a3 interfaceC7444a3) {
        this.f27734c = iArr;
        this.f27735d = objArr;
        this.f27736e = i2;
        this.f27737f = i3;
        this.f27740i = zzgoVar instanceof zzfd;
        this.f27741j = z;
        this.f27739h = abstractC7461d2 != null && abstractC7461d2.mo21038h(zzgoVar);
        this.f27742k = false;
        this.f27743l = iArr2;
        this.f27744m = i4;
        this.f27745n = i5;
        this.f27746o = interfaceC7498j3;
        this.f27747p = abstractC7551s2;
        this.f27748q = abstractC7487h4;
        this.f27749r = abstractC7461d2;
        this.f27738g = zzgoVar;
        this.f27750s = interfaceC7444a3;
    }

    /* renamed from: A */
    private final void m21057A(T t, T t2, int i2) {
        long m21072P = m21072P(i2) & 1048575;
        if (m21058B(t2, i2)) {
            Object m21179F = C7505k4.m21179F(t, m21072P);
            Object m21179F2 = C7505k4.m21179F(t2, m21072P);
            if (m21179F != null && m21179F2 != null) {
                C7505k4.m21198j(t, m21072P, zzff.m22290e(m21179F, m21179F2));
                m21065I(t, i2);
            } else if (m21179F2 != null) {
                C7505k4.m21198j(t, m21072P, m21179F2);
                m21065I(t, i2);
            }
        }
    }

    /* renamed from: B */
    private final boolean m21058B(T t, int i2) {
        if (!this.f27741j) {
            int m21074R = m21074R(i2);
            return (C7505k4.m21190b(t, (long) (m21074R & 1048575)) & (1 << (m21074R >>> 20))) != 0;
        }
        int m21072P = m21072P(i2);
        long j2 = m21072P & 1048575;
        switch ((m21072P & 267386880) >>> 20) {
            case 0:
                return C7505k4.m21176C(t, j2) != 0.0d;
            case 1:
                return C7505k4.m21212x(t, j2) != 0.0f;
            case 2:
                return C7505k4.m21203o(t, j2) != 0;
            case 3:
                return C7505k4.m21203o(t, j2) != 0;
            case 4:
                return C7505k4.m21190b(t, j2) != 0;
            case 5:
                return C7505k4.m21203o(t, j2) != 0;
            case 6:
                return C7505k4.m21190b(t, j2) != 0;
            case 7:
                return C7505k4.m21211w(t, j2);
            case 8:
                Object m21179F = C7505k4.m21179F(t, j2);
                if (m21179F instanceof String) {
                    return !((String) m21179F).isEmpty();
                }
                if (m21179F instanceof zzdu) {
                    return !zzdu.f28037f.equals(m21179F);
                }
                throw new IllegalArgumentException();
            case 9:
                return C7505k4.m21179F(t, j2) != null;
            case 10:
                return !zzdu.f28037f.equals(C7505k4.m21179F(t, j2));
            case 11:
                return C7505k4.m21190b(t, j2) != 0;
            case 12:
                return C7505k4.m21190b(t, j2) != 0;
            case 13:
                return C7505k4.m21190b(t, j2) != 0;
            case 14:
                return C7505k4.m21203o(t, j2) != 0;
            case 15:
                return C7505k4.m21190b(t, j2) != 0;
            case 16:
                return C7505k4.m21203o(t, j2) != 0;
            case 17:
                return C7505k4.m21179F(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: C */
    private final boolean m21059C(T t, int i2, int i3) {
        return C7505k4.m21190b(t, (long) (m21074R(i3) & 1048575)) == i2;
    }

    /* renamed from: D */
    private final boolean m21060D(T t, int i2, int i3, int i4) {
        return this.f27741j ? m21058B(t, i2) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    private static boolean m21061E(Object obj, int i2, InterfaceC7534p3 interfaceC7534p3) {
        return interfaceC7534p3.mo21099e(C7505k4.m21179F(obj, i2 & 1048575));
    }

    /* renamed from: F */
    private static <T> double m21062F(T t, long j2) {
        return ((Double) C7505k4.m21179F(t, j2)).doubleValue();
    }

    /* renamed from: G */
    private final int m21063G(int i2, int i3) {
        int length = (this.f27734c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f27734c[i5];
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

    /* renamed from: H */
    private final Object m21064H(int i2) {
        return this.f27735d[(i2 / 3) << 1];
    }

    /* renamed from: I */
    private final void m21065I(T t, int i2) {
        if (this.f27741j) {
            return;
        }
        int m21074R = m21074R(i2);
        long j2 = m21074R & 1048575;
        C7505k4.m21196h(t, j2, C7505k4.m21190b(t, j2) | (1 << (m21074R >>> 20)));
    }

    /* renamed from: J */
    private final void m21066J(T t, int i2, int i3) {
        C7505k4.m21196h(t, m21074R(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m21067K(T r19, com.google.android.gms.internal.measurement.InterfaceC7589y4 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7480g3.m21067K(java.lang.Object, com.google.android.gms.internal.measurement.y4):void");
    }

    /* renamed from: L */
    private final void m21068L(T t, T t2, int i2) {
        int m21072P = m21072P(i2);
        int i3 = this.f27734c[i2];
        long j2 = m21072P & 1048575;
        if (m21059C(t2, i3, i2)) {
            Object m21179F = C7505k4.m21179F(t, j2);
            Object m21179F2 = C7505k4.m21179F(t2, j2);
            if (m21179F != null && m21179F2 != null) {
                C7505k4.m21198j(t, j2, zzff.m22290e(m21179F, m21179F2));
                m21066J(t, i3, i2);
            } else if (m21179F2 != null) {
                C7505k4.m21198j(t, j2, m21179F2);
                m21066J(t, i3, i2);
            }
        }
    }

    /* renamed from: M */
    private static <T> float m21069M(T t, long j2) {
        return ((Float) C7505k4.m21179F(t, j2)).floatValue();
    }

    /* renamed from: N */
    private final zzfk m21070N(int i2) {
        return (zzfk) this.f27735d[((i2 / 3) << 1) + 1];
    }

    /* renamed from: O */
    private final boolean m21071O(T t, T t2, int i2) {
        return m21058B(t, i2) == m21058B(t2, i2);
    }

    /* renamed from: P */
    private final int m21072P(int i2) {
        return this.f27734c[i2 + 1];
    }

    /* renamed from: Q */
    private static <T> int m21073Q(T t, long j2) {
        return ((Integer) C7505k4.m21179F(t, j2)).intValue();
    }

    /* renamed from: R */
    private final int m21074R(int i2) {
        return this.f27734c[i2 + 2];
    }

    /* renamed from: S */
    private static <T> long m21075S(T t, long j2) {
        return ((Long) C7505k4.m21179F(t, j2)).longValue();
    }

    /* renamed from: T */
    private static zzhy m21076T(Object obj) {
        zzfd zzfdVar = (zzfd) obj;
        zzhy zzhyVar = zzfdVar.zzb;
        if (zzhyVar != zzhy.m22330a()) {
            return zzhyVar;
        }
        zzhy m22333g = zzhy.m22333g();
        zzfdVar.zzb = m22333g;
        return m22333g;
    }

    /* renamed from: U */
    private static boolean m21077U(int i2) {
        return (i2 & 536870912) != 0;
    }

    /* renamed from: V */
    private static <T> boolean m21078V(T t, long j2) {
        return ((Boolean) C7505k4.m21179F(t, j2)).booleanValue();
    }

    /* renamed from: W */
    private final int m21079W(int i2) {
        if (i2 < this.f27736e || i2 > this.f27737f) {
            return -1;
        }
        return m21063G(i2, 0);
    }

    /* renamed from: k */
    private final int m21080k(int i2, int i3) {
        if (i2 < this.f27736e || i2 > this.f27737f) {
            return -1;
        }
        return m21063G(i2, i3);
    }

    /* renamed from: l */
    private static <UT, UB> int m21081l(AbstractC7487h4<UT, UB> abstractC7487h4, T t) {
        return abstractC7487h4.mo21143s(abstractC7487h4.mo21135k(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: m */
    private final int m21082m(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C7514m1 c7514m1) throws IOException {
        int m21159k;
        Unsafe unsafe = f27733b;
        long j3 = this.f27734c[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(C7496j1.m21161m(bArr, i2)));
                    m21159k = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(C7496j1.m21163o(bArr, i2)));
                    m21159k = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    m21159k = C7496j1.m21159k(bArr, i2, c7514m1);
                    unsafe.putObject(t, j2, Long.valueOf(c7514m1.f27838b));
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    m21159k = C7496j1.m21157i(bArr, i2, c7514m1);
                    unsafe.putObject(t, j2, Integer.valueOf(c7514m1.f27837a));
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(C7496j1.m21160l(bArr, i2)));
                    m21159k = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(C7496j1.m21156h(bArr, i2)));
                    m21159k = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    m21159k = C7496j1.m21159k(bArr, i2, c7514m1);
                    unsafe.putObject(t, j2, Boolean.valueOf(c7514m1.f27838b != 0));
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int m21157i = C7496j1.m21157i(bArr, i2, c7514m1);
                    int i10 = c7514m1.f27837a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        if ((i7 & 536870912) != 0 && !C7523n4.m21253g(bArr, m21157i, m21157i + i10)) {
                            throw zzfo.m22303h();
                        }
                        unsafe.putObject(t, j2, new String(bArr, m21157i, i10, zzff.f28137a));
                        m21157i += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return m21157i;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int m21155g = C7496j1.m21155g(m21086r(i9), bArr, i2, i3, c7514m1);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, c7514m1.f27839c);
                    } else {
                        unsafe.putObject(t, j2, zzff.m22290e(object, c7514m1.f27839c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m21155g;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    m21159k = C7496j1.m21165q(bArr, i2, c7514m1);
                    unsafe.putObject(t, j2, c7514m1.f27839c);
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int m21157i2 = C7496j1.m21157i(bArr, i2, c7514m1);
                    int i11 = c7514m1.f27837a;
                    zzfk m21070N = m21070N(i9);
                    if (m21070N != null && !m21070N.mo20979d(i11)) {
                        m21076T(t).m22334c(i4, Long.valueOf(i11));
                        return m21157i2;
                    }
                    unsafe.putObject(t, j2, Integer.valueOf(i11));
                    m21159k = m21157i2;
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    m21159k = C7496j1.m21157i(bArr, i2, c7514m1);
                    unsafe.putObject(t, j2, Integer.valueOf(zzeg.m22161k(c7514m1.f27837a)));
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    m21159k = C7496j1.m21159k(bArr, i2, c7514m1);
                    unsafe.putObject(t, j2, Long.valueOf(zzeg.m22159b(c7514m1.f27838b)));
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    m21159k = C7496j1.m21154f(m21086r(i9), bArr, i2, i3, (i4 & (-8)) | 4, c7514m1);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, c7514m1.f27839c);
                    } else {
                        unsafe.putObject(t, j2, zzff.m22290e(object2, c7514m1.f27839c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m21159k;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    private final int m21083n(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, C7514m1 c7514m1) throws IOException {
        int m21157i;
        int i9 = i2;
        Unsafe unsafe = f27733b;
        zzfl zzflVar = (zzfl) unsafe.getObject(t, j3);
        if (!zzflVar.mo21145a()) {
            int size = zzflVar.size();
            zzflVar = zzflVar.mo20982d(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j3, zzflVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    C7449b2 c7449b2 = (C7449b2) zzflVar;
                    int m21157i2 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i10 = c7514m1.f27837a + m21157i2;
                    while (m21157i2 < i10) {
                        c7449b2.m20983f(C7496j1.m21161m(bArr, m21157i2));
                        m21157i2 += 8;
                    }
                    if (m21157i2 == i10) {
                        return m21157i2;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 1) {
                    C7449b2 c7449b22 = (C7449b2) zzflVar;
                    c7449b22.m20983f(C7496j1.m21161m(bArr, i2));
                    while (true) {
                        int i11 = i9 + 8;
                        if (i11 >= i3) {
                            return i11;
                        }
                        i9 = C7496j1.m21157i(bArr, i11, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return i11;
                        }
                        c7449b22.m20983f(C7496j1.m21161m(bArr, i9));
                    }
                }
                return i9;
            case 19:
            case 36:
                if (i6 == 2) {
                    C7509l2 c7509l2 = (C7509l2) zzflVar;
                    int m21157i3 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i12 = c7514m1.f27837a + m21157i3;
                    while (m21157i3 < i12) {
                        c7509l2.m21233f(C7496j1.m21163o(bArr, m21157i3));
                        m21157i3 += 4;
                    }
                    if (m21157i3 == i12) {
                        return m21157i3;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 5) {
                    C7509l2 c7509l22 = (C7509l2) zzflVar;
                    c7509l22.m21233f(C7496j1.m21163o(bArr, i2));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i3) {
                            return i13;
                        }
                        i9 = C7496j1.m21157i(bArr, i13, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return i13;
                        }
                        c7509l22.m21233f(C7496j1.m21163o(bArr, i9));
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    C7575w2 c7575w2 = (C7575w2) zzflVar;
                    int m21157i4 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i14 = c7514m1.f27837a + m21157i4;
                    while (m21157i4 < i14) {
                        m21157i4 = C7496j1.m21159k(bArr, m21157i4, c7514m1);
                        c7575w2.mo21439G0(c7514m1.f27838b);
                    }
                    if (m21157i4 == i14) {
                        return m21157i4;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 0) {
                    C7575w2 c7575w22 = (C7575w2) zzflVar;
                    int m21159k = C7496j1.m21159k(bArr, i9, c7514m1);
                    c7575w22.mo21439G0(c7514m1.f27838b);
                    while (m21159k < i3) {
                        int m21157i5 = C7496j1.m21157i(bArr, m21159k, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return m21159k;
                        }
                        m21159k = C7496j1.m21159k(bArr, m21157i5, c7514m1);
                        c7575w22.mo21439G0(c7514m1.f27838b);
                    }
                    return m21159k;
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return C7496j1.m21158j(bArr, i9, zzflVar, c7514m1);
                }
                if (i6 == 0) {
                    return C7496j1.m21150b(i4, bArr, i2, i3, zzflVar, c7514m1);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    C7575w2 c7575w23 = (C7575w2) zzflVar;
                    int m21157i6 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i15 = c7514m1.f27837a + m21157i6;
                    while (m21157i6 < i15) {
                        c7575w23.mo21439G0(C7496j1.m21160l(bArr, m21157i6));
                        m21157i6 += 8;
                    }
                    if (m21157i6 == i15) {
                        return m21157i6;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 1) {
                    C7575w2 c7575w24 = (C7575w2) zzflVar;
                    c7575w24.mo21439G0(C7496j1.m21160l(bArr, i2));
                    while (true) {
                        int i16 = i9 + 8;
                        if (i16 >= i3) {
                            return i16;
                        }
                        i9 = C7496j1.m21157i(bArr, i16, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return i16;
                        }
                        c7575w24.mo21439G0(C7496j1.m21160l(bArr, i9));
                    }
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    C7521n2 c7521n2 = (C7521n2) zzflVar;
                    int m21157i7 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i17 = c7514m1.f27837a + m21157i7;
                    while (m21157i7 < i17) {
                        c7521n2.m21244h(C7496j1.m21156h(bArr, m21157i7));
                        m21157i7 += 4;
                    }
                    if (m21157i7 == i17) {
                        return m21157i7;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 5) {
                    C7521n2 c7521n22 = (C7521n2) zzflVar;
                    c7521n22.m21244h(C7496j1.m21156h(bArr, i2));
                    while (true) {
                        int i18 = i9 + 4;
                        if (i18 >= i3) {
                            return i18;
                        }
                        i9 = C7496j1.m21157i(bArr, i18, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return i18;
                        }
                        c7521n22.m21244h(C7496j1.m21156h(bArr, i9));
                    }
                }
                return i9;
            case 25:
            case 42:
                if (i6 == 2) {
                    C7508l1 c7508l1 = (C7508l1) zzflVar;
                    m21157i = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i19 = c7514m1.f27837a + m21157i;
                    while (m21157i < i19) {
                        m21157i = C7496j1.m21159k(bArr, m21157i, c7514m1);
                        c7508l1.m21230f(c7514m1.f27838b != 0);
                    }
                    if (m21157i != i19) {
                        throw zzfo.m22296a();
                    }
                    return m21157i;
                }
                if (i6 == 0) {
                    C7508l1 c7508l12 = (C7508l1) zzflVar;
                    i9 = C7496j1.m21159k(bArr, i9, c7514m1);
                    c7508l12.m21230f(c7514m1.f27838b != 0);
                    while (i9 < i3) {
                        int m21157i8 = C7496j1.m21157i(bArr, i9, c7514m1);
                        if (i4 == c7514m1.f27837a) {
                            i9 = C7496j1.m21159k(bArr, m21157i8, c7514m1);
                            c7508l12.m21230f(c7514m1.f27838b != 0);
                        }
                    }
                }
                return i9;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        i9 = C7496j1.m21157i(bArr, i9, c7514m1);
                        int i20 = c7514m1.f27837a;
                        if (i20 < 0) {
                            throw zzfo.m22297b();
                        }
                        if (i20 == 0) {
                            zzflVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            zzflVar.add(new String(bArr, i9, i20, zzff.f28137a));
                            i9 += i20;
                        }
                        while (i9 < i3) {
                            int m21157i9 = C7496j1.m21157i(bArr, i9, c7514m1);
                            if (i4 == c7514m1.f27837a) {
                                i9 = C7496j1.m21157i(bArr, m21157i9, c7514m1);
                                int i21 = c7514m1.f27837a;
                                if (i21 < 0) {
                                    throw zzfo.m22297b();
                                }
                                if (i21 == 0) {
                                    zzflVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    zzflVar.add(new String(bArr, i9, i21, zzff.f28137a));
                                    i9 += i21;
                                }
                            }
                        }
                    } else {
                        i9 = C7496j1.m21157i(bArr, i9, c7514m1);
                        int i22 = c7514m1.f27837a;
                        if (i22 < 0) {
                            throw zzfo.m22297b();
                        }
                        if (i22 == 0) {
                            zzflVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            int i23 = i9 + i22;
                            if (!C7523n4.m21253g(bArr, i9, i23)) {
                                throw zzfo.m22303h();
                            }
                            zzflVar.add(new String(bArr, i9, i22, zzff.f28137a));
                            i9 = i23;
                        }
                        while (i9 < i3) {
                            int m21157i10 = C7496j1.m21157i(bArr, i9, c7514m1);
                            if (i4 == c7514m1.f27837a) {
                                i9 = C7496j1.m21157i(bArr, m21157i10, c7514m1);
                                int i24 = c7514m1.f27837a;
                                if (i24 < 0) {
                                    throw zzfo.m22297b();
                                }
                                if (i24 == 0) {
                                    zzflVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i25 = i9 + i24;
                                    if (!C7523n4.m21253g(bArr, i9, i25)) {
                                        throw zzfo.m22303h();
                                    }
                                    zzflVar.add(new String(bArr, i9, i24, zzff.f28137a));
                                    i9 = i25;
                                }
                            }
                        }
                    }
                }
                return i9;
            case 27:
                if (i6 == 2) {
                    return C7496j1.m21153e(m21086r(i7), i4, bArr, i2, i3, zzflVar, c7514m1);
                }
                return i9;
            case 28:
                if (i6 == 2) {
                    int m21157i11 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i26 = c7514m1.f27837a;
                    if (i26 < 0) {
                        throw zzfo.m22297b();
                    }
                    if (i26 > bArr.length - m21157i11) {
                        throw zzfo.m22296a();
                    }
                    if (i26 == 0) {
                        zzflVar.add(zzdu.f28037f);
                    } else {
                        zzflVar.add(zzdu.m22152q(bArr, m21157i11, i26));
                        m21157i11 += i26;
                    }
                    while (m21157i11 < i3) {
                        int m21157i12 = C7496j1.m21157i(bArr, m21157i11, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return m21157i11;
                        }
                        m21157i11 = C7496j1.m21157i(bArr, m21157i12, c7514m1);
                        int i27 = c7514m1.f27837a;
                        if (i27 < 0) {
                            throw zzfo.m22297b();
                        }
                        if (i27 > bArr.length - m21157i11) {
                            throw zzfo.m22296a();
                        }
                        if (i27 == 0) {
                            zzflVar.add(zzdu.f28037f);
                        } else {
                            zzflVar.add(zzdu.m22152q(bArr, m21157i11, i27));
                            m21157i11 += i27;
                        }
                    }
                    return m21157i11;
                }
                return i9;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        m21157i = C7496j1.m21150b(i4, bArr, i2, i3, zzflVar, c7514m1);
                    }
                    return i9;
                }
                m21157i = C7496j1.m21158j(bArr, i9, zzflVar, c7514m1);
                zzfd zzfdVar = (zzfd) t;
                zzhy zzhyVar = zzfdVar.zzb;
                if (zzhyVar == zzhy.m22330a()) {
                    zzhyVar = null;
                }
                zzhy zzhyVar2 = (zzhy) C7546r3.m21374i(i5, zzflVar, m21070N(i7), zzhyVar, this.f27748q);
                if (zzhyVar2 != null) {
                    zzfdVar.zzb = zzhyVar2;
                }
                return m21157i;
            case 33:
            case 47:
                if (i6 == 2) {
                    C7521n2 c7521n23 = (C7521n2) zzflVar;
                    int m21157i13 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i28 = c7514m1.f27837a + m21157i13;
                    while (m21157i13 < i28) {
                        m21157i13 = C7496j1.m21157i(bArr, m21157i13, c7514m1);
                        c7521n23.m21244h(zzeg.m22161k(c7514m1.f27837a));
                    }
                    if (m21157i13 == i28) {
                        return m21157i13;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 0) {
                    C7521n2 c7521n24 = (C7521n2) zzflVar;
                    int m21157i14 = C7496j1.m21157i(bArr, i9, c7514m1);
                    c7521n24.m21244h(zzeg.m22161k(c7514m1.f27837a));
                    while (m21157i14 < i3) {
                        int m21157i15 = C7496j1.m21157i(bArr, m21157i14, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return m21157i14;
                        }
                        m21157i14 = C7496j1.m21157i(bArr, m21157i15, c7514m1);
                        c7521n24.m21244h(zzeg.m22161k(c7514m1.f27837a));
                    }
                    return m21157i14;
                }
                return i9;
            case 34:
            case 48:
                if (i6 == 2) {
                    C7575w2 c7575w25 = (C7575w2) zzflVar;
                    int m21157i16 = C7496j1.m21157i(bArr, i9, c7514m1);
                    int i29 = c7514m1.f27837a + m21157i16;
                    while (m21157i16 < i29) {
                        m21157i16 = C7496j1.m21159k(bArr, m21157i16, c7514m1);
                        c7575w25.mo21439G0(zzeg.m22159b(c7514m1.f27838b));
                    }
                    if (m21157i16 == i29) {
                        return m21157i16;
                    }
                    throw zzfo.m22296a();
                }
                if (i6 == 0) {
                    C7575w2 c7575w26 = (C7575w2) zzflVar;
                    int m21159k2 = C7496j1.m21159k(bArr, i9, c7514m1);
                    c7575w26.mo21439G0(zzeg.m22159b(c7514m1.f27838b));
                    while (m21159k2 < i3) {
                        int m21157i17 = C7496j1.m21157i(bArr, m21159k2, c7514m1);
                        if (i4 != c7514m1.f27837a) {
                            return m21159k2;
                        }
                        m21159k2 = C7496j1.m21159k(bArr, m21157i17, c7514m1);
                        c7575w26.mo21439G0(zzeg.m22159b(c7514m1.f27838b));
                    }
                    return m21159k2;
                }
                return i9;
            case 49:
                if (i6 == 3) {
                    InterfaceC7534p3 m21086r = m21086r(i7);
                    int i30 = (i4 & (-8)) | 4;
                    i9 = C7496j1.m21154f(m21086r, bArr, i2, i3, i30, c7514m1);
                    zzflVar.add(c7514m1.f27839c);
                    while (i9 < i3) {
                        int m21157i18 = C7496j1.m21157i(bArr, i9, c7514m1);
                        if (i4 == c7514m1.f27837a) {
                            i9 = C7496j1.m21154f(m21086r, bArr, m21157i18, i3, i30, c7514m1);
                            zzflVar.add(c7514m1.f27839c);
                        }
                    }
                }
                return i9;
            default:
                return i9;
        }
    }

    /* renamed from: o */
    private final <K, V> int m21084o(T t, byte[] bArr, int i2, int i3, int i4, long j2, C7514m1 c7514m1) throws IOException {
        Unsafe unsafe = f27733b;
        Object m21064H = m21064H(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.f27750s.mo20975f(object)) {
            Object mo20973d = this.f27750s.mo20973d(m21064H);
            this.f27750s.mo20976g(mo20973d, object);
            unsafe.putObject(t, j2, mo20973d);
            object = mo20973d;
        }
        this.f27750s.zzf(m21064H);
        this.f27750s.mo20972c(object);
        int m21157i = C7496j1.m21157i(bArr, i2, c7514m1);
        int i5 = c7514m1.f27837a;
        if (i5 < 0 || i5 > i3 - m21157i) {
            throw zzfo.m22296a();
        }
        throw null;
    }

    /* renamed from: q */
    static <T> C7480g3<T> m21085q(Class<T> cls, InterfaceC7468e3 interfaceC7468e3, InterfaceC7498j3 interfaceC7498j3, AbstractC7551s2 abstractC7551s2, AbstractC7487h4<?, ?> abstractC7487h4, AbstractC7461d2<?> abstractC7461d2, InterfaceC7444a3 interfaceC7444a3) {
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
        C7522n3 c7522n3;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        Class<?> cls2;
        String str;
        int i22;
        int i23;
        Field m21089u;
        int i24;
        char charAt11;
        int i25;
        Field m21089u2;
        Field m21089u3;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        char charAt16;
        if (!(interfaceC7468e3 instanceof C7522n3)) {
            ((C7469e4) interfaceC7468e3).mo21047a();
            int i30 = zzfd.zze.f28132j;
            throw new NoSuchMethodError();
        }
        C7522n3 c7522n32 = (C7522n3) interfaceC7468e3;
        int i31 = 0;
        boolean z2 = c7522n32.mo21047a() == zzfd.zze.f28132j;
        String m21245d = c7522n32.m21245d();
        int length = m21245d.length();
        int charAt17 = m21245d.charAt(0);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 1;
            int i34 = 13;
            while (true) {
                i2 = i33 + 1;
                charAt16 = m21245d.charAt(i33);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i33 = i2;
            }
            charAt17 = i32 | (charAt16 << i34);
        } else {
            i2 = 1;
        }
        int i35 = i2 + 1;
        int charAt18 = m21245d.charAt(i2);
        if (charAt18 >= 55296) {
            int i36 = charAt18 & 8191;
            int i37 = 13;
            while (true) {
                i29 = i35 + 1;
                charAt15 = m21245d.charAt(i35);
                if (charAt15 < 55296) {
                    break;
                }
                i36 |= (charAt15 & 8191) << i37;
                i37 += 13;
                i35 = i29;
            }
            charAt18 = i36 | (charAt15 << i37);
            i35 = i29;
        }
        if (charAt18 == 0) {
            iArr = f27732a;
            i7 = 0;
            i4 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i6 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt19 = m21245d.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt10 = m21245d.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt20 = m21245d.charAt(i38);
            if (charAt20 >= 55296) {
                int i42 = charAt20 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt9 = m21245d.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt20 = i42 | (charAt9 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            charAt = m21245d.charAt(i41);
            if (charAt >= 55296) {
                int i45 = charAt & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt8 = m21245d.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt = i45 | (charAt8 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt21 = m21245d.charAt(i44);
            if (charAt21 >= 55296) {
                int i48 = charAt21 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt7 = m21245d.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt21 = i48 | (charAt7 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt2 = m21245d.charAt(i47);
            if (charAt2 >= 55296) {
                int i51 = charAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt6 = m21245d.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt2 = i51 | (charAt6 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt22 = m21245d.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt5 = m21245d.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt23 = m21245d.charAt(i53);
            if (charAt23 >= 55296) {
                int i57 = charAt23 & 8191;
                int i58 = i56;
                int i59 = 13;
                while (true) {
                    i9 = i58 + 1;
                    charAt4 = m21245d.charAt(i58);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i58 = i9;
                }
                charAt23 = i57 | (charAt4 << i59);
                i3 = i9;
            } else {
                i3 = i56;
            }
            int i60 = i3 + 1;
            int charAt24 = m21245d.charAt(i3);
            if (charAt24 >= 55296) {
                int i61 = charAt24 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i8 = i62 + 1;
                    charAt3 = m21245d.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i63;
                    i63 += 13;
                    i62 = i8;
                }
                charAt24 = i61 | (charAt3 << i63);
                i60 = i8;
            }
            int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
            int i64 = (charAt19 << 1) + charAt20;
            i4 = charAt21;
            i5 = i64;
            i6 = charAt24;
            i31 = charAt19;
            i35 = i60;
            int i65 = charAt22;
            iArr = iArr2;
            i7 = i65;
        }
        Unsafe unsafe = f27733b;
        Object[] m21246e = c7522n32.m21246e();
        Class<?> cls3 = c7522n32.mo21049c().getClass();
        int i66 = i35;
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr = new Object[charAt2 << 1];
        int i67 = i6 + i7;
        int i68 = i6;
        int i69 = i66;
        int i70 = i67;
        int i71 = 0;
        int i72 = 0;
        while (i69 < length) {
            int i73 = i69 + 1;
            int charAt25 = m21245d.charAt(i69);
            int i74 = length;
            if (charAt25 >= 55296) {
                int i75 = charAt25 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i28 = i76 + 1;
                    charAt14 = m21245d.charAt(i76);
                    i16 = i6;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i28;
                    i6 = i16;
                }
                charAt25 = i75 | (charAt14 << i77);
                i17 = i28;
            } else {
                i16 = i6;
                i17 = i73;
            }
            int i78 = i17 + 1;
            int charAt26 = m21245d.charAt(i17);
            if (charAt26 >= 55296) {
                int i79 = charAt26 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i27 = i80 + 1;
                    charAt13 = m21245d.charAt(i80);
                    z = z2;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i27;
                    z2 = z;
                }
                charAt26 = i79 | (charAt13 << i81);
                i18 = i27;
            } else {
                z = z2;
                i18 = i78;
            }
            int i82 = charAt26 & 255;
            int i83 = i4;
            if ((charAt26 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i84 = charAt;
            if (i82 >= 51) {
                int i85 = i18 + 1;
                int charAt27 = m21245d.charAt(i18);
                char c2 = 55296;
                if (charAt27 >= 55296) {
                    int i86 = charAt27 & 8191;
                    int i87 = 13;
                    while (true) {
                        i26 = i85 + 1;
                        charAt12 = m21245d.charAt(i85);
                        if (charAt12 < c2) {
                            break;
                        }
                        i86 |= (charAt12 & 8191) << i87;
                        i87 += 13;
                        i85 = i26;
                        c2 = 55296;
                    }
                    charAt27 = i86 | (charAt12 << i87);
                    i85 = i26;
                }
                int i88 = i82 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    objArr[((i72 / 3) << 1) + 1] = m21246e[i5];
                    i5++;
                } else if (i88 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i72 / 3) << 1) + 1] = m21246e[i5];
                    i5++;
                }
                int i90 = charAt27 << 1;
                Object obj = m21246e[i90];
                if (obj instanceof Field) {
                    m21089u2 = (Field) obj;
                } else {
                    m21089u2 = m21089u(cls3, (String) obj);
                    m21246e[i90] = m21089u2;
                }
                c7522n3 = c7522n32;
                String str2 = m21245d;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m21089u2);
                int i91 = i90 + 1;
                Object obj2 = m21246e[i91];
                if (obj2 instanceof Field) {
                    m21089u3 = (Field) obj2;
                } else {
                    m21089u3 = m21089u(cls3, (String) obj2);
                    m21246e[i91] = m21089u3;
                }
                cls2 = cls3;
                i20 = i5;
                i18 = i89;
                str = str2;
                i23 = 0;
                i22 = (int) unsafe.objectFieldOffset(m21089u3);
                i21 = i31;
            } else {
                c7522n3 = c7522n32;
                String str3 = m21245d;
                int i92 = i5 + 1;
                Field m21089u4 = m21089u(cls3, (String) m21246e[i5]);
                if (i82 == 9 || i82 == 17) {
                    i19 = 1;
                    objArr[((i72 / 3) << 1) + 1] = m21089u4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i19 = 1;
                        i25 = i92 + 1;
                        objArr[((i72 / 3) << 1) + 1] = m21246e[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i19 = 1;
                        if ((charAt17 & 1) == 1) {
                            i25 = i92 + 1;
                            objArr[((i72 / 3) << 1) + 1] = m21246e[i92];
                        }
                    } else {
                        if (i82 == 50) {
                            int i93 = i68 + 1;
                            iArr[i68] = i72;
                            int i94 = (i72 / 3) << 1;
                            int i95 = i92 + 1;
                            objArr[i94] = m21246e[i92];
                            if ((charAt26 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 0) {
                                i92 = i95 + 1;
                                objArr[i94 + 1] = m21246e[i95];
                                i68 = i93;
                            } else {
                                i92 = i95;
                                i19 = 1;
                                i68 = i93;
                            }
                        }
                        i19 = 1;
                    }
                    i92 = i25;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(m21089u4);
                if ((charAt17 & 1) != i19 || i82 > 17) {
                    i20 = i92;
                    i21 = i31;
                    cls2 = cls3;
                    str = str3;
                    i22 = 0;
                    i23 = 0;
                } else {
                    int i96 = i18 + 1;
                    str = str3;
                    int charAt28 = str.charAt(i18);
                    if (charAt28 >= 55296) {
                        int i97 = charAt28 & 8191;
                        int i98 = 13;
                        while (true) {
                            i24 = i96 + 1;
                            charAt11 = str.charAt(i96);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i97 |= (charAt11 & 8191) << i98;
                            i98 += 13;
                            i96 = i24;
                        }
                        charAt28 = i97 | (charAt11 << i98);
                        i96 = i24;
                    }
                    int i99 = (i31 << 1) + (charAt28 / 32);
                    Object obj3 = m21246e[i99];
                    i20 = i92;
                    if (obj3 instanceof Field) {
                        m21089u = (Field) obj3;
                    } else {
                        m21089u = m21089u(cls3, (String) obj3);
                        m21246e[i99] = m21089u;
                    }
                    i21 = i31;
                    cls2 = cls3;
                    i22 = (int) unsafe.objectFieldOffset(m21089u);
                    i23 = charAt28 % 32;
                    i18 = i96;
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
            }
            int i100 = i72 + 1;
            iArr3[i72] = charAt25;
            int i101 = i100 + 1;
            iArr3[i100] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i82 << 20);
            i72 = i101 + 1;
            iArr3[i101] = (i23 << 20) | i22;
            i31 = i21;
            m21245d = str;
            i69 = i18;
            cls3 = cls2;
            i4 = i83;
            length = i74;
            i6 = i16;
            z2 = z;
            charAt = i84;
            i5 = i20;
            c7522n32 = c7522n3;
        }
        return new C7480g3<>(iArr3, objArr, charAt, i4, c7522n32.mo21049c(), z2, false, iArr, i6, i67, interfaceC7498j3, abstractC7551s2, abstractC7487h4, abstractC7461d2, interfaceC7444a3);
    }

    /* renamed from: r */
    private final InterfaceC7534p3 m21086r(int i2) {
        int i3 = (i2 / 3) << 1;
        InterfaceC7534p3 interfaceC7534p3 = (InterfaceC7534p3) this.f27735d[i3];
        if (interfaceC7534p3 != null) {
            return interfaceC7534p3;
        }
        InterfaceC7534p3<T> m21235b = C7510l3.m21234a().m21235b((Class) this.f27735d[i3 + 1]);
        this.f27735d[i3] = m21235b;
        return m21235b;
    }

    /* renamed from: s */
    private final <K, V, UT, UB> UB m21087s(int i2, int i3, Map<K, V> map, zzfk zzfkVar, UB ub, AbstractC7487h4<UT, UB> abstractC7487h4) {
        C7593z2<?, ?> zzf = this.f27750s.zzf(m21064H(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzfkVar.mo20979d(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC7487h4.mo21125a();
                }
                C7556t1 m22155x = zzdu.m22155x(zzgg.m22316a(zzf, next.getKey(), next.getValue()));
                try {
                    zzgg.m22317b(m22155x.m21405b(), zzf, next.getKey(), next.getValue());
                    abstractC7487h4.mo21129e(ub, i3, m22155x.m21404a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: t */
    private final <UT, UB> UB m21088t(Object obj, int i2, UB ub, AbstractC7487h4<UT, UB> abstractC7487h4) {
        zzfk m21070N;
        int i3 = this.f27734c[i2];
        Object m21179F = C7505k4.m21179F(obj, m21072P(i2) & 1048575);
        return (m21179F == null || (m21070N = m21070N(i2)) == null) ? ub : (UB) m21087s(i2, i3, this.f27750s.mo20972c(m21179F), m21070N, ub, abstractC7487h4);
    }

    /* renamed from: u */
    private static Field m21089u(Class<?> cls, String str) {
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

    /* renamed from: v */
    private static List<?> m21090v(Object obj, long j2) {
        return (List) C7505k4.m21179F(obj, j2);
    }

    /* renamed from: w */
    private static void m21091w(int i2, Object obj, InterfaceC7589y4 interfaceC7589y4) throws IOException {
        if (obj instanceof String) {
            interfaceC7589y4.mo21009g(i2, (String) obj);
        } else {
            interfaceC7589y4.mo20992E(i2, (zzdu) obj);
        }
    }

    /* renamed from: x */
    private static <UT, UB> void m21092x(AbstractC7487h4<UT, UB> abstractC7487h4, T t, InterfaceC7589y4 interfaceC7589y4) throws IOException {
        abstractC7487h4.mo21131g(abstractC7487h4.mo21135k(t), interfaceC7589y4);
    }

    /* renamed from: y */
    private final <K, V> void m21093y(InterfaceC7589y4 interfaceC7589y4, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            interfaceC7589y4.mo21002O(i2, this.f27750s.zzf(m21064H(i3)), this.f27750s.mo20971b(obj));
        }
    }

    /* renamed from: z */
    private final void m21094z(Object obj, int i2, InterfaceC7540q3 interfaceC7540q3) throws IOException {
        if (m21077U(i2)) {
            C7505k4.m21198j(obj, i2 & 1048575, interfaceC7540q3.mo21315j());
        } else if (this.f27740i) {
            C7505k4.m21198j(obj, i2 & 1048575, interfaceC7540q3.mo21329w());
        } else {
            C7505k4.m21198j(obj, i2 & 1048575, interfaceC7540q3.mo21311f());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: a */
    public final T mo21095a() {
        return (T) this.f27746o.mo21147c(this.f27738g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: b */
    public final int mo21096b(T t) {
        int i2;
        int i3;
        long j2;
        int m22184b0;
        int m22180T;
        int m22163A0;
        int m21353R;
        int m21357V;
        int m22191g0;
        int m22198o0;
        int m22164B;
        int m21357V2;
        int m22191g02;
        int m22198o02;
        int i4 = 267386880;
        int i5 = 1;
        if (this.f27741j) {
            Unsafe unsafe = f27733b;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f27734c.length) {
                int m21072P = m21072P(i6);
                int i8 = (m21072P & i4) >>> 20;
                int i9 = this.f27734c[i6];
                long j3 = m21072P & 1048575;
                int i10 = (i8 < zzex.f28074O.m22249a() || i8 > zzex.f28087b0.m22249a()) ? 0 : this.f27734c[i6 + 2] & 1048575;
                switch (i8) {
                    case 0:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22164B(i9, 0.0d);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22166C(i9, 0.0f);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22184b0(i9, C7505k4.m21203o(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22192h0(i9, C7505k4.m21203o(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22195l0(i9, C7505k4.m21190b(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22200q0(i9, 0L);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22207x0(i9, 0);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22174H(i9, true);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m21058B(t, i6)) {
                            Object m21179F = C7505k4.m21179F(t, j3);
                            m22164B = m21179F instanceof zzdu ? zzen.m22180T(i9, (zzdu) m21179F) : zzen.m22173G(i9, (String) m21179F);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m21058B(t, i6)) {
                            m22164B = C7546r3.m21362a(i9, C7505k4.m21179F(t, j3), m21086r(i6));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22180T(i9, (zzdu) C7505k4.m21179F(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22199p0(i9, C7505k4.m21190b(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22167C0(i9, C7505k4.m21190b(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22163A0(i9, 0);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22204u0(i9, 0L);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22203t0(i9, C7505k4.m21190b(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22196m0(i9, C7505k4.m21203o(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m21058B(t, i6)) {
                            m22164B = zzen.m22181U(i9, (zzgo) C7505k4.m21179F(t, j3), m21086r(i6));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m22164B = C7546r3.m21356U(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 19:
                        m22164B = C7546r3.m21353R(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 20:
                        m22164B = C7546r3.m21368d(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 21:
                        m22164B = C7546r3.m21385t(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 22:
                        m22164B = C7546r3.m21343H(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 23:
                        m22164B = C7546r3.m21356U(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 24:
                        m22164B = C7546r3.m21353R(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 25:
                        m22164B = C7546r3.m21359X(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 26:
                        m22164B = C7546r3.m21364b(i9, m21090v(t, j3));
                        i7 += m22164B;
                        break;
                    case 27:
                        m22164B = C7546r3.m21366c(i9, m21090v(t, j3), m21086r(i6));
                        i7 += m22164B;
                        break;
                    case 28:
                        m22164B = C7546r3.m21383r(i9, m21090v(t, j3));
                        i7 += m22164B;
                        break;
                    case 29:
                        m22164B = C7546r3.m21347L(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 30:
                        m22164B = C7546r3.m21339D(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 31:
                        m22164B = C7546r3.m21353R(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 32:
                        m22164B = C7546r3.m21356U(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 33:
                        m22164B = C7546r3.m21350O(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 34:
                        m22164B = C7546r3.m21391z(i9, m21090v(t, j3), false);
                        i7 += m22164B;
                        break;
                    case 35:
                        m21357V2 = C7546r3.m21357V((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 36:
                        m21357V2 = C7546r3.m21354S((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 37:
                        m21357V2 = C7546r3.m21370e((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 38:
                        m21357V2 = C7546r3.m21386u((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 39:
                        m21357V2 = C7546r3.m21344I((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 40:
                        m21357V2 = C7546r3.m21357V((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 41:
                        m21357V2 = C7546r3.m21354S((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 42:
                        m21357V2 = C7546r3.m21360Y((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 43:
                        m21357V2 = C7546r3.m21348M((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 44:
                        m21357V2 = C7546r3.m21340E((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 45:
                        m21357V2 = C7546r3.m21354S((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 46:
                        m21357V2 = C7546r3.m21357V((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 47:
                        m21357V2 = C7546r3.m21351P((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 48:
                        m21357V2 = C7546r3.m21336A((List) unsafe.getObject(t, j3));
                        if (m21357V2 <= 0) {
                            break;
                        } else {
                            if (this.f27742k) {
                                unsafe.putInt(t, i10, m21357V2);
                            }
                            m22191g02 = zzen.m22191g0(i9);
                            m22198o02 = zzen.m22198o0(m21357V2);
                            m22164B = m22191g02 + m22198o02 + m21357V2;
                            i7 += m22164B;
                            break;
                        }
                    case 49:
                        m22164B = C7546r3.m21384s(i9, m21090v(t, j3), m21086r(i6));
                        i7 += m22164B;
                        break;
                    case 50:
                        m22164B = this.f27750s.mo20977h(i9, C7505k4.m21179F(t, j3), m21064H(i6));
                        i7 += m22164B;
                        break;
                    case 51:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22164B(i9, 0.0d);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22166C(i9, 0.0f);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22184b0(i9, m21075S(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22192h0(i9, m21075S(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22195l0(i9, m21073Q(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22200q0(i9, 0L);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22207x0(i9, 0);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22174H(i9, true);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m21059C(t, i9, i6)) {
                            Object m21179F2 = C7505k4.m21179F(t, j3);
                            m22164B = m21179F2 instanceof zzdu ? zzen.m22180T(i9, (zzdu) m21179F2) : zzen.m22173G(i9, (String) m21179F2);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m21059C(t, i9, i6)) {
                            m22164B = C7546r3.m21362a(i9, C7505k4.m21179F(t, j3), m21086r(i6));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22180T(i9, (zzdu) C7505k4.m21179F(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22199p0(i9, m21073Q(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22167C0(i9, m21073Q(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22163A0(i9, 0);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22204u0(i9, 0L);
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22203t0(i9, m21073Q(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22196m0(i9, m21075S(t, j3));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m21059C(t, i9, i6)) {
                            m22164B = zzen.m22181U(i9, (zzgo) C7505k4.m21179F(t, j3), m21086r(i6));
                            i7 += m22164B;
                            break;
                        } else {
                            break;
                        }
                }
                i6 += 3;
                i4 = 267386880;
            }
            return i7 + m21081l(this.f27748q, t);
        }
        Unsafe unsafe2 = f27733b;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < this.f27734c.length) {
            int m21072P2 = m21072P(i12);
            int[] iArr = this.f27734c;
            int i15 = iArr[i12];
            int i16 = (m21072P2 & 267386880) >>> 20;
            if (i16 <= 17) {
                int i17 = iArr[i12 + 2];
                int i18 = i17 & 1048575;
                i3 = i5 << (i17 >>> 20);
                if (i18 != i11) {
                    i14 = unsafe2.getInt(t, i18);
                    i11 = i18;
                }
                i2 = i17;
            } else {
                i2 = (!this.f27742k || i16 < zzex.f28074O.m22249a() || i16 > zzex.f28087b0.m22249a()) ? 0 : this.f27734c[i12 + 2] & 1048575;
                i3 = 0;
            }
            long j4 = m21072P2 & 1048575;
            switch (i16) {
                case 0:
                    j2 = 0;
                    if ((i14 & i3) != 0) {
                        i13 += zzen.m22164B(i15, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j2 = 0;
                    if ((i14 & i3) != 0) {
                        i13 += zzen.m22166C(i15, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i14 & i3) != 0) {
                        m22184b0 = zzen.m22184b0(i15, unsafe2.getLong(t, j4));
                        i13 += m22184b0;
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i14 & i3) != 0) {
                        m22184b0 = zzen.m22192h0(i15, unsafe2.getLong(t, j4));
                        i13 += m22184b0;
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i14 & i3) != 0) {
                        m22184b0 = zzen.m22195l0(i15, unsafe2.getInt(t, j4));
                        i13 += m22184b0;
                    }
                    break;
                case 5:
                    j2 = 0;
                    if ((i14 & i3) != 0) {
                        m22184b0 = zzen.m22200q0(i15, 0L);
                        i13 += m22184b0;
                    }
                    break;
                case 6:
                    if ((i14 & i3) != 0) {
                        i13 += zzen.m22207x0(i15, 0);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 7:
                    if ((i14 & i3) != 0) {
                        i13 += zzen.m22174H(i15, true);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 8:
                    if ((i14 & i3) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        m22180T = object instanceof zzdu ? zzen.m22180T(i15, (zzdu) object) : zzen.m22173G(i15, (String) object);
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 9:
                    if ((i14 & i3) != 0) {
                        m22180T = C7546r3.m21362a(i15, unsafe2.getObject(t, j4), m21086r(i12));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 10:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22180T(i15, (zzdu) unsafe2.getObject(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 11:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22199p0(i15, unsafe2.getInt(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 12:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22167C0(i15, unsafe2.getInt(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 13:
                    if ((i14 & i3) != 0) {
                        m22163A0 = zzen.m22163A0(i15, 0);
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 14:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22204u0(i15, 0L);
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 15:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22203t0(i15, unsafe2.getInt(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 16:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22196m0(i15, unsafe2.getLong(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 17:
                    if ((i14 & i3) != 0) {
                        m22180T = zzen.m22181U(i15, (zzgo) unsafe2.getObject(t, j4), m21086r(i12));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 18:
                    m22180T = C7546r3.m21356U(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 19:
                    m21353R = C7546r3.m21353R(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 20:
                    m21353R = C7546r3.m21368d(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 21:
                    m21353R = C7546r3.m21385t(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 22:
                    m21353R = C7546r3.m21343H(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 23:
                    m21353R = C7546r3.m21356U(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 24:
                    m21353R = C7546r3.m21353R(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 25:
                    m21353R = C7546r3.m21359X(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 26:
                    m22180T = C7546r3.m21364b(i15, (List) unsafe2.getObject(t, j4));
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 27:
                    m22180T = C7546r3.m21366c(i15, (List) unsafe2.getObject(t, j4), m21086r(i12));
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 28:
                    m22180T = C7546r3.m21383r(i15, (List) unsafe2.getObject(t, j4));
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 29:
                    m22180T = C7546r3.m21347L(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 30:
                    m21353R = C7546r3.m21339D(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 31:
                    m21353R = C7546r3.m21353R(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 32:
                    m21353R = C7546r3.m21356U(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 33:
                    m21353R = C7546r3.m21350O(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 34:
                    m21353R = C7546r3.m21391z(i15, (List) unsafe2.getObject(t, j4), false);
                    i13 += m21353R;
                    j2 = 0;
                    break;
                case 35:
                    m21357V = C7546r3.m21357V((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 36:
                    m21357V = C7546r3.m21354S((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 37:
                    m21357V = C7546r3.m21370e((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 38:
                    m21357V = C7546r3.m21386u((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 39:
                    m21357V = C7546r3.m21344I((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 40:
                    m21357V = C7546r3.m21357V((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 41:
                    m21357V = C7546r3.m21354S((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 42:
                    m21357V = C7546r3.m21360Y((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 43:
                    m21357V = C7546r3.m21348M((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 44:
                    m21357V = C7546r3.m21340E((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 45:
                    m21357V = C7546r3.m21354S((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 46:
                    m21357V = C7546r3.m21357V((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 47:
                    m21357V = C7546r3.m21351P((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 48:
                    m21357V = C7546r3.m21336A((List) unsafe2.getObject(t, j4));
                    if (m21357V > 0) {
                        if (this.f27742k) {
                            unsafe2.putInt(t, i2, m21357V);
                        }
                        m22191g0 = zzen.m22191g0(i15);
                        m22198o0 = zzen.m22198o0(m21357V);
                        m22163A0 = m22191g0 + m22198o0 + m21357V;
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 49:
                    m22180T = C7546r3.m21384s(i15, (List) unsafe2.getObject(t, j4), m21086r(i12));
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 50:
                    m22180T = this.f27750s.mo20977h(i15, unsafe2.getObject(t, j4), m21064H(i12));
                    i13 += m22180T;
                    j2 = 0;
                    break;
                case 51:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22164B(i15, 0.0d);
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 52:
                    if (m21059C(t, i15, i12)) {
                        m22163A0 = zzen.m22166C(i15, 0.0f);
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 53:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22184b0(i15, m21075S(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 54:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22192h0(i15, m21075S(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 55:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22195l0(i15, m21073Q(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 56:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22200q0(i15, 0L);
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 57:
                    if (m21059C(t, i15, i12)) {
                        m22163A0 = zzen.m22207x0(i15, 0);
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 58:
                    if (m21059C(t, i15, i12)) {
                        m22163A0 = zzen.m22174H(i15, true);
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 59:
                    if (m21059C(t, i15, i12)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        m22180T = object2 instanceof zzdu ? zzen.m22180T(i15, (zzdu) object2) : zzen.m22173G(i15, (String) object2);
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 60:
                    if (m21059C(t, i15, i12)) {
                        m22180T = C7546r3.m21362a(i15, unsafe2.getObject(t, j4), m21086r(i12));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 61:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22180T(i15, (zzdu) unsafe2.getObject(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 62:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22199p0(i15, m21073Q(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 63:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22167C0(i15, m21073Q(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 64:
                    if (m21059C(t, i15, i12)) {
                        m22163A0 = zzen.m22163A0(i15, 0);
                        i13 += m22163A0;
                    }
                    j2 = 0;
                    break;
                case 65:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22204u0(i15, 0L);
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 66:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22203t0(i15, m21073Q(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 67:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22196m0(i15, m21075S(t, j4));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                case 68:
                    if (m21059C(t, i15, i12)) {
                        m22180T = zzen.m22181U(i15, (zzgo) unsafe2.getObject(t, j4), m21086r(i12));
                        i13 += m22180T;
                    }
                    j2 = 0;
                    break;
                default:
                    j2 = 0;
                    break;
            }
            i12 += 3;
            i5 = 1;
        }
        int i19 = 0;
        int m21081l = i13 + m21081l(this.f27748q, t);
        if (!this.f27739h) {
            return m21081l;
        }
        C7485h2<?> mo21032b = this.f27749r.mo21032b(t);
        for (int i20 = 0; i20 < mo21032b.f27756b.m21431k(); i20++) {
            Map.Entry<?, Object> m21429i = mo21032b.f27756b.m21429i(i20);
            i19 += C7485h2.m21106a((zzey) m21429i.getKey(), m21429i.getValue());
        }
        for (Map.Entry<?, Object> entry : mo21032b.f27756b.m21432n()) {
            i19 += C7485h2.m21106a((zzey) entry.getKey(), entry.getValue());
        }
        return m21081l + i19;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: c */
    public final int mo21097c(T t) {
        int i2;
        int m22287b;
        int length = this.f27734c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int m21072P = m21072P(i4);
            int i5 = this.f27734c[i4];
            long j2 = 1048575 & m21072P;
            int i6 = 37;
            switch ((m21072P & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    m22287b = zzff.m22287b(Double.doubleToLongBits(C7505k4.m21176C(t, j2)));
                    i3 = i2 + m22287b;
                    break;
                case 1:
                    i2 = i3 * 53;
                    m22287b = Float.floatToIntBits(C7505k4.m21212x(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 2:
                    i2 = i3 * 53;
                    m22287b = zzff.m22287b(C7505k4.m21203o(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 3:
                    i2 = i3 * 53;
                    m22287b = zzff.m22287b(C7505k4.m21203o(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 4:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21190b(t, j2);
                    i3 = i2 + m22287b;
                    break;
                case 5:
                    i2 = i3 * 53;
                    m22287b = zzff.m22287b(C7505k4.m21203o(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 6:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21190b(t, j2);
                    i3 = i2 + m22287b;
                    break;
                case 7:
                    i2 = i3 * 53;
                    m22287b = zzff.m22288c(C7505k4.m21211w(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 8:
                    i2 = i3 * 53;
                    m22287b = ((String) C7505k4.m21179F(t, j2)).hashCode();
                    i3 = i2 + m22287b;
                    break;
                case 9:
                    Object m21179F = C7505k4.m21179F(t, j2);
                    if (m21179F != null) {
                        i6 = m21179F.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21179F(t, j2).hashCode();
                    i3 = i2 + m22287b;
                    break;
                case 11:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21190b(t, j2);
                    i3 = i2 + m22287b;
                    break;
                case 12:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21190b(t, j2);
                    i3 = i2 + m22287b;
                    break;
                case 13:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21190b(t, j2);
                    i3 = i2 + m22287b;
                    break;
                case 14:
                    i2 = i3 * 53;
                    m22287b = zzff.m22287b(C7505k4.m21203o(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 15:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21190b(t, j2);
                    i3 = i2 + m22287b;
                    break;
                case 16:
                    i2 = i3 * 53;
                    m22287b = zzff.m22287b(C7505k4.m21203o(t, j2));
                    i3 = i2 + m22287b;
                    break;
                case 17:
                    Object m21179F2 = C7505k4.m21179F(t, j2);
                    if (m21179F2 != null) {
                        i6 = m21179F2.hashCode();
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
                    m22287b = C7505k4.m21179F(t, j2).hashCode();
                    i3 = i2 + m22287b;
                    break;
                case 50:
                    i2 = i3 * 53;
                    m22287b = C7505k4.m21179F(t, j2).hashCode();
                    i3 = i2 + m22287b;
                    break;
                case 51:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22287b(Double.doubleToLongBits(m21062F(t, j2)));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = Float.floatToIntBits(m21069M(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = m21073Q(t, j2);
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = m21073Q(t, j2);
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22288c(m21078V(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = ((String) C7505k4.m21179F(t, j2)).hashCode();
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = C7505k4.m21179F(t, j2).hashCode();
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = C7505k4.m21179F(t, j2).hashCode();
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = m21073Q(t, j2);
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = m21073Q(t, j2);
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = m21073Q(t, j2);
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = m21073Q(t, j2);
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = zzff.m22287b(m21075S(t, j2));
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m21059C(t, i5, i4)) {
                        i2 = i3 * 53;
                        m22287b = C7505k4.m21179F(t, j2).hashCode();
                        i3 = i2 + m22287b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.f27748q.mo21135k(t).hashCode();
        return this.f27739h ? (hashCode * 53) + this.f27749r.mo21032b(t).hashCode() : hashCode;
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo21098d(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.C7514m1 r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7480g3.mo21098d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.m1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: e */
    public final boolean mo21099e(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.f27744m) {
                return !this.f27739h || this.f27749r.mo21032b(t).m21122q();
            }
            int i6 = this.f27743l[i4];
            int i7 = this.f27734c[i6];
            int m21072P = m21072P(i6);
            if (this.f27741j) {
                i2 = 0;
            } else {
                int i8 = this.f27734c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = f27733b.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & m21072P) != 0) && !m21060D(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & m21072P) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (m21059C(t, i7, i6) && !m21061E(t, m21072P, m21086r(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.f27750s.mo20971b(C7505k4.m21179F(t, m21072P & 1048575)).isEmpty()) {
                            this.f27750s.zzf(m21064H(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) C7505k4.m21179F(t, m21072P & 1048575);
                if (!list.isEmpty()) {
                    InterfaceC7534p3 m21086r = m21086r(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        }
                        if (!m21086r.mo21099e(list.get(i11))) {
                            z = false;
                            break;
                        }
                        i11++;
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m21060D(t, i6, i5, i2) && !m21061E(t, m21072P, m21086r(i6))) {
                return false;
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: f */
    public final void mo21100f(T t) {
        int i2;
        int i3 = this.f27744m;
        while (true) {
            i2 = this.f27745n;
            if (i3 >= i2) {
                break;
            }
            long m21072P = m21072P(this.f27743l[i3]) & 1048575;
            Object m21179F = C7505k4.m21179F(t, m21072P);
            if (m21179F != null) {
                C7505k4.m21198j(t, m21072P, this.f27750s.mo20974e(m21179F));
            }
            i3++;
        }
        int length = this.f27743l.length;
        while (i2 < length) {
            this.f27747p.mo21402e(t, this.f27743l[i2]);
            i2++;
        }
        this.f27748q.mo21141q(t);
        if (this.f27739h) {
            this.f27749r.mo21040j(t);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.measurement.C7546r3.m21382q(com.google.android.gms.internal.measurement.C7505k4.m21179F(r10, r6), com.google.android.gms.internal.measurement.C7505k4.m21179F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21203o(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21203o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21190b(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21190b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21203o(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21203o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21190b(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21190b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21190b(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21190b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21190b(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21190b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.measurement.C7546r3.m21382q(com.google.android.gms.internal.measurement.C7505k4.m21179F(r10, r6), com.google.android.gms.internal.measurement.C7505k4.m21179F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.measurement.C7546r3.m21382q(com.google.android.gms.internal.measurement.C7505k4.m21179F(r10, r6), com.google.android.gms.internal.measurement.C7505k4.m21179F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.measurement.C7546r3.m21382q(com.google.android.gms.internal.measurement.C7505k4.m21179F(r10, r6), com.google.android.gms.internal.measurement.C7505k4.m21179F(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21211w(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21211w(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21190b(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21190b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21203o(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21203o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21190b(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21190b(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21203o(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21203o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.measurement.C7505k4.m21203o(r10, r6) == com.google.android.gms.internal.measurement.C7505k4.m21203o(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C7505k4.m21212x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C7505k4.m21212x(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C7505k4.m21176C(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C7505k4.m21176C(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.C7546r3.m21382q(com.google.android.gms.internal.measurement.C7505k4.m21179F(r10, r6), com.google.android.gms.internal.measurement.C7505k4.m21179F(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo21101g(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7480g3.mo21101g(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo21102h(T r14, com.google.android.gms.internal.measurement.InterfaceC7589y4 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7480g3.mo21102h(java.lang.Object, com.google.android.gms.internal.measurement.y4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:348:0x05ce A[LOOP:5: B:346:0x05ca->B:348:0x05ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05db  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo21103i(T r13, com.google.android.gms.internal.measurement.InterfaceC7540q3 r14, com.google.android.gms.internal.measurement.zzeq r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7480g3.mo21103i(java.lang.Object, com.google.android.gms.internal.measurement.q3, com.google.android.gms.internal.measurement.zzeq):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7534p3
    /* renamed from: j */
    public final void mo21104j(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.f27734c.length; i2 += 3) {
            int m21072P = m21072P(i2);
            long j2 = 1048575 & m21072P;
            int i3 = this.f27734c[i2];
            switch ((m21072P & 267386880) >>> 20) {
                case 0:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21194f(t, j2, C7505k4.m21176C(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21195g(t, j2, C7505k4.m21212x(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21197i(t, j2, C7505k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21197i(t, j2, C7505k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21196h(t, j2, C7505k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21197i(t, j2, C7505k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21196h(t, j2, C7505k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21199k(t, j2, C7505k4.m21211w(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21198j(t, j2, C7505k4.m21179F(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m21057A(t, t2, i2);
                    break;
                case 10:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21198j(t, j2, C7505k4.m21179F(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21196h(t, j2, C7505k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21196h(t, j2, C7505k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21196h(t, j2, C7505k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21197i(t, j2, C7505k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21196h(t, j2, C7505k4.m21190b(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m21058B(t2, i2)) {
                        C7505k4.m21197i(t, j2, C7505k4.m21203o(t2, j2));
                        m21065I(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m21057A(t, t2, i2);
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
                    this.f27747p.mo21401c(t, t2, j2);
                    break;
                case 50:
                    C7546r3.m21379n(this.f27750s, t, t2, j2);
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
                    if (m21059C(t2, i3, i2)) {
                        C7505k4.m21198j(t, j2, C7505k4.m21179F(t2, j2));
                        m21066J(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m21068L(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m21059C(t2, i3, i2)) {
                        C7505k4.m21198j(t, j2, C7505k4.m21179F(t2, j2));
                        m21066J(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m21068L(t, t2, i2);
                    break;
            }
        }
        if (this.f27741j) {
            return;
        }
        C7546r3.m21380o(this.f27748q, t, t2);
        if (this.f27739h) {
            C7546r3.m21378m(this.f27749r, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    final int m21105p(T t, byte[] bArr, int i2, int i3, int i4, C7514m1 c7514m1) throws IOException {
        Unsafe unsafe;
        int i5;
        Object obj;
        C7480g3<T> c7480g3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj2;
        C7514m1 c7514m12;
        int i12;
        int i13;
        int i14;
        C7514m1 c7514m13;
        int i15;
        C7514m1 c7514m14;
        int i16;
        int i17;
        C7514m1 c7514m15;
        int i18;
        int i19;
        int i20;
        C7480g3<T> c7480g32 = this;
        Object obj3 = t;
        byte[] bArr2 = bArr;
        int i21 = i3;
        int i22 = i4;
        C7514m1 c7514m16 = c7514m1;
        Unsafe unsafe2 = f27733b;
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
                    i7 = C7496j1.m21152d(b2, bArr2, i29, c7514m16);
                    i6 = c7514m16.f27837a;
                } else {
                    i6 = b2;
                    i7 = i29;
                }
                int i30 = i6 >>> 3;
                int i31 = i6 & 7;
                int m21080k = i30 > i24 ? c7480g32.m21080k(i30, i25 / 3) : c7480g32.m21079W(i30);
                if (m21080k == -1) {
                    i8 = i30;
                    i9 = i7;
                    i10 = i6;
                    unsafe = unsafe2;
                    i5 = i22;
                    i11 = 0;
                } else {
                    int[] iArr = c7480g32.f27734c;
                    int i32 = iArr[m21080k + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = i6;
                    long j2 = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[m21080k + 2];
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
                                i12 = m21080k;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    C7505k4.m21194f(obj3, j2, C7496j1.m21161m(bArr2, i16));
                                    i23 = i16 + 8;
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 1:
                                i12 = m21080k;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    C7505k4.m21195g(obj3, j2, C7496j1.m21163o(bArr2, i16));
                                    i23 = i16 + 4;
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 2:
                            case 3:
                                i12 = m21080k;
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
                                    int m21159k = C7496j1.m21159k(bArr2, i16, c7514m1);
                                    unsafe2.putLong(t, j2, c7514m1.f27838b);
                                    i27 |= i36;
                                    i23 = m21159k;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m1;
                                    i28 = i15;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 4:
                            case 11:
                                i12 = m21080k;
                                i13 = i30;
                                i15 = i28;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    i23 = C7496j1.m21157i(bArr2, i16, c7514m14);
                                    unsafe2.putInt(obj3, j2, c7514m14.f27837a);
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 5:
                            case 14:
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    unsafe2.putLong(t, j2, C7496j1.m21160l(bArr2, i7));
                                    i23 = i16 + 8;
                                    i27 |= i36;
                                    i28 = i15;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 6:
                            case 13:
                                i17 = i3;
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m15 = c7514m1;
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
                                    unsafe2.putInt(obj3, j2, C7496j1.m21156h(bArr2, i7));
                                    i23 = i7 + 4;
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m15;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 7:
                                i17 = i3;
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m15 = c7514m1;
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
                                    int m21159k2 = C7496j1.m21159k(bArr2, i7, c7514m15);
                                    C7505k4.m21199k(obj3, j2, c7514m15.f27838b != 0);
                                    i27 |= i36;
                                    i23 = m21159k2;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m15;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 8:
                                i17 = i3;
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m15 = c7514m1;
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
                                    i23 = (i32 & 536870912) == 0 ? C7496j1.m21162n(bArr2, i7, c7514m15) : C7496j1.m21164p(bArr2, i7, c7514m15);
                                    unsafe2.putObject(obj3, j2, c7514m15.f27839c);
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m15;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 9:
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m15 = c7514m1;
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
                                    i23 = C7496j1.m21155g(c7480g32.m21086r(i12), bArr2, i7, i17, c7514m15);
                                    if ((i27 & i36) == 0) {
                                        unsafe2.putObject(obj3, j2, c7514m15.f27839c);
                                    } else {
                                        unsafe2.putObject(obj3, j2, zzff.m22290e(unsafe2.getObject(obj3, j2), c7514m15.f27839c));
                                    }
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m15;
                                    i22 = i4;
                                    i21 = i17;
                                }
                            case 10:
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    i23 = C7496j1.m21165q(bArr2, i7, c7514m14);
                                    unsafe2.putObject(obj3, j2, c7514m14.f27839c);
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 12:
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    i23 = C7496j1.m21157i(bArr2, i7, c7514m14);
                                    int i38 = c7514m14.f27837a;
                                    zzfk m21070N = c7480g32.m21070N(i12);
                                    if (m21070N == null || m21070N.mo20979d(i38)) {
                                        unsafe2.putInt(obj3, j2, i38);
                                        i27 |= i36;
                                        i26 = i14;
                                        i25 = i12;
                                        i24 = i13;
                                        c7514m16 = c7514m14;
                                        i21 = i3;
                                        i22 = i4;
                                    } else {
                                        m21076T(t).m22334c(i14, Long.valueOf(i38));
                                        i26 = i14;
                                        i25 = i12;
                                        i24 = i13;
                                        c7514m16 = c7514m14;
                                        i21 = i3;
                                        i22 = i4;
                                    }
                                }
                                break;
                            case 15:
                                i12 = m21080k;
                                i13 = i30;
                                i14 = i34;
                                bArr2 = bArr;
                                c7514m14 = c7514m1;
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
                                    i23 = C7496j1.m21157i(bArr2, i7, c7514m14);
                                    unsafe2.putInt(obj3, j2, zzeg.m22161k(c7514m14.f27837a));
                                    i27 |= i36;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 16:
                                i12 = m21080k;
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
                                    int m21159k3 = C7496j1.m21159k(bArr2, i7, c7514m1);
                                    c7514m14 = c7514m1;
                                    unsafe2.putLong(t, j2, zzeg.m22159b(c7514m1.f27838b));
                                    i27 |= i36;
                                    i23 = m21159k3;
                                    i26 = i14;
                                    i25 = i12;
                                    i24 = i13;
                                    c7514m16 = c7514m14;
                                    i21 = i3;
                                    i22 = i4;
                                }
                            case 17:
                                if (i31 != 3) {
                                    i12 = m21080k;
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
                                    i23 = C7496j1.m21154f(c7480g32.m21086r(m21080k), bArr, i7, i3, (i30 << 3) | 4, c7514m1);
                                    if ((i27 & i36) == 0) {
                                        c7514m13 = c7514m1;
                                        unsafe2.putObject(obj3, j2, c7514m13.f27839c);
                                    } else {
                                        c7514m13 = c7514m1;
                                        unsafe2.putObject(obj3, j2, zzff.m22290e(unsafe2.getObject(obj3, j2), c7514m13.f27839c));
                                    }
                                    i27 |= i36;
                                    bArr2 = bArr;
                                    i21 = i3;
                                    i26 = i34;
                                    i25 = m21080k;
                                    i24 = i30;
                                    i22 = i4;
                                    c7514m16 = c7514m13;
                                }
                            default:
                                i12 = m21080k;
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
                        C7514m1 c7514m17 = c7514m16;
                        if (i33 != 27) {
                            i18 = i27;
                            if (i33 <= 49) {
                                i8 = i30;
                                i20 = i34;
                                i11 = m21080k;
                                unsafe = unsafe2;
                                i23 = m21083n(t, bArr, i40, i3, i34, i30, i31, m21080k, i32, i33, j2, c7514m1);
                                if (i23 == i40) {
                                    i5 = i4;
                                    i9 = i23;
                                } else {
                                    c7480g32 = this;
                                    obj3 = t;
                                    bArr2 = bArr;
                                    i21 = i3;
                                    i22 = i4;
                                    c7514m16 = c7514m1;
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
                                i11 = m21080k;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i23 = m21082m(t, bArr, i19, i3, i20, i8, i31, i32, i33, j2, i11, c7514m1);
                                    if (i23 != i19) {
                                        c7480g32 = this;
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
                                        c7514m16 = c7514m1;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m21084o(t, bArr, i19, i3, i11, j2, c7514m1);
                                    if (i23 != i19) {
                                        c7480g32 = this;
                                        obj3 = t;
                                        bArr2 = bArr;
                                        i21 = i3;
                                        i22 = i4;
                                        c7514m16 = c7514m1;
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
                            zzfl zzflVar = (zzfl) unsafe2.getObject(obj3, j2);
                            if (!zzflVar.mo21145a()) {
                                int size = zzflVar.size();
                                zzflVar = zzflVar.mo20982d(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j2, zzflVar);
                            }
                            i23 = C7496j1.m21153e(c7480g32.m21086r(m21080k), i34, bArr, i40, i3, zzflVar, c7514m1);
                            i22 = i4;
                            i24 = i30;
                            i26 = i34;
                            i25 = m21080k;
                            c7514m16 = c7514m17;
                            i28 = i39;
                            i27 = i27;
                            i21 = i3;
                        } else {
                            i18 = i27;
                            i8 = i30;
                            i19 = i40;
                            i20 = i34;
                            i11 = m21080k;
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
                    if (this.f27739h) {
                        c7514m12 = c7514m1;
                        if (c7514m12.f27840d != zzeq.m22245a()) {
                            int i41 = i8;
                            if (c7514m12.f27840d.m22248b(this.f27738g, i41) != null) {
                                zzfd.zzd zzdVar = (zzfd.zzd) t;
                                zzdVar.m22284B();
                                C7485h2<zzfd.C7599a> c7485h2 = zzdVar.zzc;
                                throw new NoSuchMethodError();
                            }
                            i23 = C7496j1.m21151c(i10, bArr, i9, i3, m21076T(t), c7514m1);
                            obj3 = t;
                            i21 = i3;
                            i26 = i10;
                            c7480g32 = this;
                            c7514m16 = c7514m12;
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
                        c7514m12 = c7514m1;
                    }
                    i23 = C7496j1.m21151c(i10, bArr, i9, i3, m21076T(t), c7514m1);
                    i26 = i10;
                    c7480g32 = this;
                    c7514m16 = c7514m12;
                    i24 = i8;
                    obj3 = obj2;
                    i25 = i11;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i21 = i3;
                    i22 = i5;
                } else {
                    c7480g3 = this;
                    obj = t;
                    i23 = i9;
                    i26 = i10;
                }
            } else {
                unsafe = unsafe2;
                i5 = i22;
                obj = obj3;
                c7480g3 = c7480g32;
            }
        }
        if (i28 != -1) {
            unsafe.putInt(obj, i28, i27);
        }
        zzhy zzhyVar = null;
        for (int i42 = c7480g3.f27744m; i42 < c7480g3.f27745n; i42++) {
            zzhyVar = (zzhy) c7480g3.m21088t(obj, c7480g3.f27743l[i42], zzhyVar, c7480g3.f27748q);
        }
        if (zzhyVar != null) {
            c7480g3.f27748q.mo21138n(obj, zzhyVar);
        }
        if (i5 == 0) {
            if (i23 != i3) {
                throw zzfo.m22302g();
            }
        } else if (i23 > i3 || i26 != i5) {
            throw zzfo.m22302g();
        }
        return i23;
    }
}
