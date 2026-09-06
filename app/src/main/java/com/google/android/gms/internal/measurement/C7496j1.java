package com.google.android.gms.internal.measurement;

import java.io.IOException;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes2.dex */
final class C7496j1 {
    /* renamed from: a */
    static int m21149a(int i2, byte[] bArr, int i3, int i4, C7514m1 c7514m1) throws zzfo {
        if ((i2 >>> 3) == 0) {
            throw zzfo.m22299d();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return m21159k(bArr, i3, c7514m1);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return m21157i(bArr, i3, c7514m1) + c7514m1.f27837a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzfo.m22299d();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = m21157i(bArr, i3, c7514m1);
            i7 = c7514m1.f27837a;
            if (i7 == i6) {
                break;
            }
            i3 = m21149a(i7, bArr, i3, i4, c7514m1);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzfo.m22302g();
        }
        return i3;
    }

    /* renamed from: b */
    static int m21150b(int i2, byte[] bArr, int i3, int i4, zzfl<?> zzflVar, C7514m1 c7514m1) {
        C7521n2 c7521n2 = (C7521n2) zzflVar;
        int m21157i = m21157i(bArr, i3, c7514m1);
        c7521n2.m21244h(c7514m1.f27837a);
        while (m21157i < i4) {
            int m21157i2 = m21157i(bArr, m21157i, c7514m1);
            if (i2 != c7514m1.f27837a) {
                break;
            }
            m21157i = m21157i(bArr, m21157i2, c7514m1);
            c7521n2.m21244h(c7514m1.f27837a);
        }
        return m21157i;
    }

    /* renamed from: c */
    static int m21151c(int i2, byte[] bArr, int i3, int i4, zzhy zzhyVar, C7514m1 c7514m1) throws zzfo {
        if ((i2 >>> 3) == 0) {
            throw zzfo.m22299d();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int m21159k = m21159k(bArr, i3, c7514m1);
            zzhyVar.m22334c(i2, Long.valueOf(c7514m1.f27838b));
            return m21159k;
        }
        if (i5 == 1) {
            zzhyVar.m22334c(i2, Long.valueOf(m21160l(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int m21157i = m21157i(bArr, i3, c7514m1);
            int i6 = c7514m1.f27837a;
            if (i6 < 0) {
                throw zzfo.m22297b();
            }
            if (i6 > bArr.length - m21157i) {
                throw zzfo.m22296a();
            }
            if (i6 == 0) {
                zzhyVar.m22334c(i2, zzdu.f28037f);
            } else {
                zzhyVar.m22334c(i2, zzdu.m22152q(bArr, m21157i, i6));
            }
            return m21157i + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzfo.m22299d();
            }
            zzhyVar.m22334c(i2, Integer.valueOf(m21156h(bArr, i3)));
            return i3 + 4;
        }
        zzhy m22333g = zzhy.m22333g();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int m21157i2 = m21157i(bArr, i3, c7514m1);
            int i9 = c7514m1.f27837a;
            i8 = i9;
            if (i9 == i7) {
                i3 = m21157i2;
                break;
            }
            int m21151c = m21151c(i8, bArr, m21157i2, i4, m22333g, c7514m1);
            i8 = i9;
            i3 = m21151c;
        }
        if (i3 > i4 || i8 != i7) {
            throw zzfo.m22302g();
        }
        zzhyVar.m22334c(i2, m22333g);
        return i3;
    }

    /* renamed from: d */
    static int m21152d(int i2, byte[] bArr, int i3, C7514m1 c7514m1) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c7514m1.f27837a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            c7514m1.f27837a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            c7514m1.f27837a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            c7514m1.f27837a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                c7514m1.f27837a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* renamed from: e */
    static int m21153e(InterfaceC7534p3<?> interfaceC7534p3, int i2, byte[] bArr, int i3, int i4, zzfl<?> zzflVar, C7514m1 c7514m1) throws IOException {
        int m21155g = m21155g(interfaceC7534p3, bArr, i3, i4, c7514m1);
        zzflVar.add(c7514m1.f27839c);
        while (m21155g < i4) {
            int m21157i = m21157i(bArr, m21155g, c7514m1);
            if (i2 != c7514m1.f27837a) {
                break;
            }
            m21155g = m21155g(interfaceC7534p3, bArr, m21157i, i4, c7514m1);
            zzflVar.add(c7514m1.f27839c);
        }
        return m21155g;
    }

    /* renamed from: f */
    static int m21154f(InterfaceC7534p3 interfaceC7534p3, byte[] bArr, int i2, int i3, int i4, C7514m1 c7514m1) throws IOException {
        C7480g3 c7480g3 = (C7480g3) interfaceC7534p3;
        Object mo21095a = c7480g3.mo21095a();
        int m21105p = c7480g3.m21105p(mo21095a, bArr, i2, i3, i4, c7514m1);
        c7480g3.mo21100f(mo21095a);
        c7514m1.f27839c = mo21095a;
        return m21105p;
    }

    /* renamed from: g */
    static int m21155g(InterfaceC7534p3 interfaceC7534p3, byte[] bArr, int i2, int i3, C7514m1 c7514m1) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = m21152d(i5, bArr, i4, c7514m1);
            i5 = c7514m1.f27837a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzfo.m22296a();
        }
        Object mo21095a = interfaceC7534p3.mo21095a();
        int i7 = i5 + i6;
        interfaceC7534p3.mo21098d(mo21095a, bArr, i6, i7, c7514m1);
        interfaceC7534p3.mo21100f(mo21095a);
        c7514m1.f27839c = mo21095a;
        return i7;
    }

    /* renamed from: h */
    static int m21156h(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m21157i(byte[] bArr, int i2, C7514m1 c7514m1) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return m21152d(b2, bArr, i3, c7514m1);
        }
        c7514m1.f27837a = b2;
        return i3;
    }

    /* renamed from: j */
    static int m21158j(byte[] bArr, int i2, zzfl<?> zzflVar, C7514m1 c7514m1) throws IOException {
        C7521n2 c7521n2 = (C7521n2) zzflVar;
        int m21157i = m21157i(bArr, i2, c7514m1);
        int i3 = c7514m1.f27837a + m21157i;
        while (m21157i < i3) {
            m21157i = m21157i(bArr, m21157i, c7514m1);
            c7521n2.m21244h(c7514m1.f27837a);
        }
        if (m21157i == i3) {
            return m21157i;
        }
        throw zzfo.m22296a();
    }

    /* renamed from: k */
    static int m21159k(byte[] bArr, int i2, C7514m1 c7514m1) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            c7514m1.f27838b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        c7514m1.f27838b = j3;
        return i4;
    }

    /* renamed from: l */
    static long m21160l(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* renamed from: m */
    static double m21161m(byte[] bArr, int i2) {
        return Double.longBitsToDouble(m21160l(bArr, i2));
    }

    /* renamed from: n */
    static int m21162n(byte[] bArr, int i2, C7514m1 c7514m1) throws zzfo {
        int m21157i = m21157i(bArr, i2, c7514m1);
        int i3 = c7514m1.f27837a;
        if (i3 < 0) {
            throw zzfo.m22297b();
        }
        if (i3 == 0) {
            c7514m1.f27839c = HttpUrl.FRAGMENT_ENCODE_SET;
            return m21157i;
        }
        c7514m1.f27839c = new String(bArr, m21157i, i3, zzff.f28137a);
        return m21157i + i3;
    }

    /* renamed from: o */
    static float m21163o(byte[] bArr, int i2) {
        return Float.intBitsToFloat(m21156h(bArr, i2));
    }

    /* renamed from: p */
    static int m21164p(byte[] bArr, int i2, C7514m1 c7514m1) throws zzfo {
        int m21157i = m21157i(bArr, i2, c7514m1);
        int i3 = c7514m1.f27837a;
        if (i3 < 0) {
            throw zzfo.m22297b();
        }
        if (i3 == 0) {
            c7514m1.f27839c = HttpUrl.FRAGMENT_ENCODE_SET;
            return m21157i;
        }
        c7514m1.f27839c = C7523n4.m21257k(bArr, m21157i, i3);
        return m21157i + i3;
    }

    /* renamed from: q */
    static int m21165q(byte[] bArr, int i2, C7514m1 c7514m1) throws zzfo {
        int m21157i = m21157i(bArr, i2, c7514m1);
        int i3 = c7514m1.f27837a;
        if (i3 < 0) {
            throw zzfo.m22297b();
        }
        if (i3 > bArr.length - m21157i) {
            throw zzfo.m22296a();
        }
        if (i3 == 0) {
            c7514m1.f27839c = zzdu.f28037f;
            return m21157i;
        }
        c7514m1.f27839c = zzdu.m22152q(bArr, m21157i, i3);
        return m21157i + i3;
    }
}
