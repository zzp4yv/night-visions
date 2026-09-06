package com.google.android.gms.internal.ads;

import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.au */
/* loaded from: classes2.dex */
final class C6468au {
    /* renamed from: a */
    static int m14766a(int i2, byte[] bArr, int i3, int i4, C6505bu c6505bu) throws zzdok {
        if ((i2 >>> 3) == 0) {
            throw zzdok.m19753d();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return m14775j(bArr, i3, c6505bu);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return m14773h(bArr, i3, c6505bu) + c6505bu.f18356a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzdok.m19753d();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = m14773h(bArr, i3, c6505bu);
            i7 = c6505bu.f18356a;
            if (i7 == i6) {
                break;
            }
            i3 = m14766a(i7, bArr, i3, i4, c6505bu);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzdok.m19756g();
        }
        return i3;
    }

    /* renamed from: b */
    static int m14767b(int i2, byte[] bArr, int i3, int i4, zzdoj<?> zzdojVar, C6505bu c6505bu) {
        C6691gv c6691gv = (C6691gv) zzdojVar;
        int m14773h = m14773h(bArr, i3, c6505bu);
        c6691gv.mo15174Z0(c6505bu.f18356a);
        while (m14773h < i4) {
            int m14773h2 = m14773h(bArr, m14773h, c6505bu);
            if (i2 != c6505bu.f18356a) {
                break;
            }
            m14773h = m14773h(bArr, m14773h2, c6505bu);
            c6691gv.mo15174Z0(c6505bu.f18356a);
        }
        return m14773h;
    }

    /* renamed from: c */
    static int m14768c(int i2, byte[] bArr, int i3, int i4, zzdqu zzdquVar, C6505bu c6505bu) throws zzdok {
        if ((i2 >>> 3) == 0) {
            throw zzdok.m19753d();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int m14775j = m14775j(bArr, i3, c6505bu);
            zzdquVar.m19791k(i2, Long.valueOf(c6505bu.f18357b));
            return m14775j;
        }
        if (i5 == 1) {
            zzdquVar.m19791k(i2, Long.valueOf(m14780o(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int m14773h = m14773h(bArr, i3, c6505bu);
            int i6 = c6505bu.f18356a;
            if (i6 < 0) {
                throw zzdok.m19751b();
            }
            if (i6 > bArr.length - m14773h) {
                throw zzdok.m19750a();
            }
            if (i6 == 0) {
                zzdquVar.m19791k(i2, zzdmr.f25661f);
            } else {
                zzdquVar.m19791k(i2, zzdmr.m19595A(bArr, m14773h, i6));
            }
            return m14773h + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzdok.m19753d();
            }
            zzdquVar.m19791k(i2, Integer.valueOf(m14779n(bArr, i3)));
            return i3 + 4;
        }
        zzdqu m19784i = zzdqu.m19784i();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int m14773h2 = m14773h(bArr, i3, c6505bu);
            int i9 = c6505bu.f18356a;
            i8 = i9;
            if (i9 == i7) {
                i3 = m14773h2;
                break;
            }
            int m14768c = m14768c(i8, bArr, m14773h2, i4, m19784i, c6505bu);
            i8 = i9;
            i3 = m14768c;
        }
        if (i3 > i4 || i8 != i7) {
            throw zzdok.m19756g();
        }
        zzdquVar.m19791k(i2, m19784i);
        return i3;
    }

    /* renamed from: d */
    static int m14769d(int i2, byte[] bArr, int i3, C6505bu c6505bu) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c6505bu.f18356a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            c6505bu.f18356a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            c6505bu.f18356a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            c6505bu.f18356a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                c6505bu.f18356a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* renamed from: e */
    static int m14770e(InterfaceC6877lw<?> interfaceC6877lw, int i2, byte[] bArr, int i3, int i4, zzdoj<?> zzdojVar, C6505bu c6505bu) throws IOException {
        int m14772g = m14772g(interfaceC6877lw, bArr, i3, i4, c6505bu);
        zzdojVar.add(c6505bu.f18358c);
        while (m14772g < i4) {
            int m14773h = m14773h(bArr, m14772g, c6505bu);
            if (i2 != c6505bu.f18356a) {
                break;
            }
            m14772g = m14772g(interfaceC6877lw, bArr, m14773h, i4, c6505bu);
            zzdojVar.add(c6505bu.f18358c);
        }
        return m14772g;
    }

    /* renamed from: f */
    static int m14771f(InterfaceC6877lw interfaceC6877lw, byte[] bArr, int i2, int i3, int i4, C6505bu c6505bu) throws IOException {
        C6470aw c6470aw = (C6470aw) interfaceC6877lw;
        Object mo14823c = c6470aw.mo14823c();
        int m14831o = c6470aw.m14831o(mo14823c, bArr, i2, i3, i4, c6505bu);
        c6470aw.mo14826f(mo14823c);
        c6505bu.f18358c = mo14823c;
        return m14831o;
    }

    /* renamed from: g */
    static int m14772g(InterfaceC6877lw interfaceC6877lw, byte[] bArr, int i2, int i3, C6505bu c6505bu) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = m14769d(i5, bArr, i4, c6505bu);
            i5 = c6505bu.f18356a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzdok.m19750a();
        }
        Object mo14823c = interfaceC6877lw.mo14823c();
        int i7 = i5 + i6;
        interfaceC6877lw.mo14827g(mo14823c, bArr, i6, i7, c6505bu);
        interfaceC6877lw.mo14826f(mo14823c);
        c6505bu.f18358c = mo14823c;
        return i7;
    }

    /* renamed from: h */
    static int m14773h(byte[] bArr, int i2, C6505bu c6505bu) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return m14769d(b2, bArr, i3, c6505bu);
        }
        c6505bu.f18356a = b2;
        return i3;
    }

    /* renamed from: i */
    static int m14774i(byte[] bArr, int i2, zzdoj<?> zzdojVar, C6505bu c6505bu) throws IOException {
        C6691gv c6691gv = (C6691gv) zzdojVar;
        int m14773h = m14773h(bArr, i2, c6505bu);
        int i3 = c6505bu.f18356a + m14773h;
        while (m14773h < i3) {
            m14773h = m14773h(bArr, m14773h, c6505bu);
            c6691gv.mo15174Z0(c6505bu.f18356a);
        }
        if (m14773h == i3) {
            return m14773h;
        }
        throw zzdok.m19750a();
    }

    /* renamed from: j */
    static int m14775j(byte[] bArr, int i2, C6505bu c6505bu) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            c6505bu.f18357b = j2;
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
        c6505bu.f18357b = j3;
        return i4;
    }

    /* renamed from: k */
    static int m14776k(byte[] bArr, int i2, C6505bu c6505bu) throws zzdok {
        int m14773h = m14773h(bArr, i2, c6505bu);
        int i3 = c6505bu.f18356a;
        if (i3 < 0) {
            throw zzdok.m19751b();
        }
        if (i3 == 0) {
            c6505bu.f18358c = HttpUrl.FRAGMENT_ENCODE_SET;
            return m14773h;
        }
        c6505bu.f18358c = new String(bArr, m14773h, i3, zzdod.f25772a);
        return m14773h + i3;
    }

    /* renamed from: l */
    static int m14777l(byte[] bArr, int i2, C6505bu c6505bu) throws zzdok {
        int m14773h = m14773h(bArr, i2, c6505bu);
        int i3 = c6505bu.f18356a;
        if (i3 < 0) {
            throw zzdok.m19751b();
        }
        if (i3 == 0) {
            c6505bu.f18358c = HttpUrl.FRAGMENT_ENCODE_SET;
            return m14773h;
        }
        c6505bu.f18358c = C6804jx.m15386m(bArr, m14773h, i3);
        return m14773h + i3;
    }

    /* renamed from: m */
    static int m14778m(byte[] bArr, int i2, C6505bu c6505bu) throws zzdok {
        int m14773h = m14773h(bArr, i2, c6505bu);
        int i3 = c6505bu.f18356a;
        if (i3 < 0) {
            throw zzdok.m19751b();
        }
        if (i3 > bArr.length - m14773h) {
            throw zzdok.m19750a();
        }
        if (i3 == 0) {
            c6505bu.f18358c = zzdmr.f25661f;
            return m14773h;
        }
        c6505bu.f18358c = zzdmr.m19595A(bArr, m14773h, i3);
        return m14773h + i3;
    }

    /* renamed from: n */
    static int m14779n(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: o */
    static long m14780o(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* renamed from: p */
    static double m14781p(byte[] bArr, int i2) {
        return Double.longBitsToDouble(m14780o(bArr, i2));
    }

    /* renamed from: q */
    static float m14782q(byte[] bArr, int i2) {
        return Float.intBitsToFloat(m14779n(bArr, i2));
    }
}
