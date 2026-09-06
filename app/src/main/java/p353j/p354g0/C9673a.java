package p353j.p354g0;

import kotlin.jvm.internal.C9768m;
import p353j.C9662b;
import p353j.C9670f;
import p353j.C9688t;
import p353j.C9693y;

/* compiled from: Buffer.kt */
/* renamed from: j.g0.a */
/* loaded from: classes3.dex */
public final class C9673a {

    /* renamed from: a */
    private static final byte[] f37049a = C9662b.m31979a("0123456789abcdef");

    /* renamed from: a */
    public static final C9670f.a m32070a(C9670f c9670f, C9670f.a aVar) {
        C9768m.m32346f(c9670f, "$this$commonReadAndWriteUnsafe");
        C9768m.m32346f(aVar, "unsafeCursor");
        if (!(aVar.f37040f == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f37040f = c9670f;
        aVar.f37041g = true;
        return aVar;
    }

    /* renamed from: b */
    public static final byte[] m32071b() {
        return f37049a;
    }

    /* renamed from: c */
    public static final boolean m32072c(C9693y c9693y, int i2, byte[] bArr, int i3, int i4) {
        C9768m.m32346f(c9693y, "segment");
        C9768m.m32346f(bArr, "bytes");
        int i5 = c9693y.f37093d;
        byte[] bArr2 = c9693y.f37091b;
        while (i3 < i4) {
            if (i2 == i5) {
                c9693y = c9693y.f37096g;
                C9768m.m32343c(c9693y);
                byte[] bArr3 = c9693y.f37091b;
                bArr2 = bArr3;
                i2 = c9693y.f37092c;
                i5 = c9693y.f37093d;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m32073d(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (c9670f.m32047m(j3) == ((byte) 13)) {
                String m32027Z = c9670f.m32027Z(j3);
                c9670f.skip(2L);
                return m32027Z;
            }
        }
        String m32027Z2 = c9670f.m32027Z(j2);
        c9670f.skip(1L);
        return m32027Z2;
    }

    /* renamed from: e */
    public static final int m32074e(C9670f c9670f, C9688t c9688t, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        C9693y c9693y;
        C9768m.m32346f(c9670f, "$this$selectPrefix");
        C9768m.m32346f(c9688t, "options");
        C9693y c9693y2 = c9670f.f37038f;
        if (c9693y2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c9693y2.f37091b;
        int i6 = c9693y2.f37092c;
        int i7 = c9693y2.f37093d;
        int[] m32147n = c9688t.m32147n();
        C9693y c9693y3 = c9693y2;
        int i8 = 0;
        int i9 = -1;
        loop0: while (true) {
            int i10 = i8 + 1;
            int i11 = m32147n[i8];
            int i12 = i10 + 1;
            int i13 = m32147n[i10];
            if (i13 != -1) {
                i9 = i13;
            }
            if (c9693y3 == null) {
                break;
            }
            if (i11 >= 0) {
                i2 = i6 + 1;
                int i14 = bArr[i6] & 255;
                int i15 = i12 + i11;
                while (i12 != i15) {
                    if (i14 == m32147n[i12]) {
                        i3 = m32147n[i12 + i11];
                        if (i2 == i7) {
                            c9693y3 = c9693y3.f37096g;
                            C9768m.m32343c(c9693y3);
                            i2 = c9693y3.f37092c;
                            bArr = c9693y3.f37091b;
                            i7 = c9693y3.f37093d;
                            if (c9693y3 == c9693y2) {
                                c9693y3 = null;
                            }
                        }
                    } else {
                        i12++;
                    }
                }
                return i9;
            }
            int i16 = i12 + (i11 * (-1));
            while (true) {
                int i17 = i6 + 1;
                int i18 = i12 + 1;
                if ((bArr[i6] & 255) != m32147n[i12]) {
                    return i9;
                }
                boolean z2 = i18 == i16;
                if (i17 == i7) {
                    C9768m.m32343c(c9693y3);
                    C9693y c9693y4 = c9693y3.f37096g;
                    C9768m.m32343c(c9693y4);
                    i5 = c9693y4.f37092c;
                    byte[] bArr2 = c9693y4.f37091b;
                    i4 = c9693y4.f37093d;
                    if (c9693y4 != c9693y2) {
                        c9693y = c9693y4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        c9693y = null;
                    }
                } else {
                    C9693y c9693y5 = c9693y3;
                    i4 = i7;
                    i5 = i17;
                    c9693y = c9693y5;
                }
                if (z2) {
                    i3 = m32147n[i18];
                    i2 = i5;
                    i7 = i4;
                    c9693y3 = c9693y;
                    break;
                }
                i6 = i5;
                i7 = i4;
                i12 = i18;
                c9693y3 = c9693y;
            }
            if (i3 >= 0) {
                return i3;
            }
            i8 = -i3;
            i6 = i2;
        }
        if (z) {
            return -2;
        }
        return i9;
    }

    /* renamed from: f */
    public static /* synthetic */ int m32075f(C9670f c9670f, C9688t c9688t, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m32074e(c9670f, c9688t, z);
    }
}
