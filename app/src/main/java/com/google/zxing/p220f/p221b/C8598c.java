package com.google.zxing.p220f.p221b;

import com.google.zxing.common.reedsolomon.C8590a;
import com.google.zxing.common.reedsolomon.C8592c;
import com.google.zxing.p222g.C8603a;
import com.google.zxing.p222g.C8604b;

/* compiled from: Encoder.java */
/* renamed from: com.google.zxing.f.b.c */
/* loaded from: classes2.dex */
public final class C8598c {

    /* renamed from: a */
    private static final int[] f32777a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m27253a(C8603a c8603a, int i2, int i3) {
        int[] iArr = new int[i3];
        int m27288i = c8603a.m27288i() / i2;
        for (int i4 = 0; i4 < m27288i; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= c8603a.m27287h((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m27254b(C8604b c8604b, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 <= i7) {
                    c8604b.m27298i(i6, i5);
                    c8604b.m27298i(i6, i7);
                    c8604b.m27298i(i5, i6);
                    c8604b.m27298i(i7, i6);
                    i6++;
                }
            }
        }
        int i8 = i2 - i3;
        c8604b.m27298i(i8, i8);
        int i9 = i8 + 1;
        c8604b.m27298i(i9, i8);
        c8604b.m27298i(i8, i9);
        int i10 = i2 + i3;
        c8604b.m27298i(i10, i8);
        c8604b.m27298i(i10, i9);
        c8604b.m27298i(i10, i10 - 1);
    }

    /* renamed from: c */
    private static void m27255c(C8604b c8604b, boolean z, int i2, C8603a c8603a) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (c8603a.m27287h(i4)) {
                    c8604b.m27298i(i5, i3 - 5);
                }
                if (c8603a.m27287h(i4 + 7)) {
                    c8604b.m27298i(i3 + 5, i5);
                }
                if (c8603a.m27287h(20 - i4)) {
                    c8604b.m27298i(i5, i3 + 5);
                }
                if (c8603a.m27287h(27 - i4)) {
                    c8604b.m27298i(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (c8603a.m27287h(i4)) {
                c8604b.m27298i(i6, i3 - 7);
            }
            if (c8603a.m27287h(i4 + 10)) {
                c8604b.m27298i(i3 + 7, i6);
            }
            if (c8603a.m27287h(29 - i4)) {
                c8604b.m27298i(i6, i3 + 7);
            }
            if (c8603a.m27287h(39 - i4)) {
                c8604b.m27298i(i3 - 7, i6);
            }
            i4++;
        }
    }

    /* renamed from: d */
    public static C8596a m27256d(byte[] bArr, int i2, int i3) {
        C8603a c8603a;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        C8603a m27267a = new C8599d(bArr).m27267a();
        int m27288i = ((m27267a.m27288i() * i2) / 100) + 11;
        int m27288i2 = m27267a.m27288i() + m27288i;
        int i8 = 0;
        int i9 = 1;
        if (i3 == 0) {
            C8603a c8603a2 = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 <= 32) {
                boolean z2 = i10 <= 3;
                int i12 = z2 ? i10 + 1 : i10;
                int m27261i = m27261i(i12, z2);
                if (m27288i2 <= m27261i) {
                    if (c8603a2 == null || i11 != f32777a[i12]) {
                        int i13 = f32777a[i12];
                        i11 = i13;
                        c8603a2 = m27260h(m27267a, i13);
                    }
                    int i14 = m27261i - (m27261i % i11);
                    if ((!z2 || c8603a2.m27288i() <= (i11 << 6)) && c8603a2.m27288i() + m27288i <= i14) {
                        c8603a = c8603a2;
                        i4 = i11;
                        z = z2;
                        i5 = i12;
                        i6 = m27261i;
                    }
                }
                i10++;
                i8 = 0;
                i9 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z = i3 < 0;
        i5 = Math.abs(i3);
        if (i5 > (z ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
        }
        i6 = m27261i(i5, z);
        i4 = f32777a[i5];
        int i15 = i6 - (i6 % i4);
        c8603a = m27260h(m27267a, i4);
        if (c8603a.m27288i() + m27288i > i15) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z && c8603a.m27288i() > (i4 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        C8603a m27257e = m27257e(c8603a, i6, i4);
        int m27288i3 = c8603a.m27288i() / i4;
        C8603a m27258f = m27258f(z, i5, m27288i3);
        int i16 = (z ? 11 : 14) + (i5 << 2);
        int[] iArr = new int[i16];
        int i17 = 2;
        if (z) {
            for (int i18 = 0; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
            i7 = i16;
        } else {
            int i19 = i16 / 2;
            i7 = i16 + 1 + (((i19 - 1) / 15) * 2);
            int i20 = i7 / 2;
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[(i19 - i21) - i9] = (i20 - r14) - 1;
                iArr[i19 + i21] = (i21 / 15) + i21 + i20 + i9;
            }
        }
        C8604b c8604b = new C8604b(i7);
        int i22 = 0;
        int i23 = 0;
        while (i22 < i5) {
            int i24 = ((i5 - i22) << i17) + (z ? 9 : 12);
            int i25 = 0;
            while (i25 < i24) {
                int i26 = i25 << 1;
                while (i8 < i17) {
                    if (m27257e.m27287h(i23 + i26 + i8)) {
                        int i27 = i22 << 1;
                        c8604b.m27298i(iArr[i27 + i8], iArr[i27 + i25]);
                    }
                    if (m27257e.m27287h((i24 << 1) + i23 + i26 + i8)) {
                        int i28 = i22 << 1;
                        c8604b.m27298i(iArr[i28 + i25], iArr[((i16 - 1) - i28) - i8]);
                    }
                    if (m27257e.m27287h((i24 << 2) + i23 + i26 + i8)) {
                        int i29 = (i16 - 1) - (i22 << 1);
                        c8604b.m27298i(iArr[i29 - i8], iArr[i29 - i25]);
                    }
                    if (m27257e.m27287h((i24 * 6) + i23 + i26 + i8)) {
                        int i30 = i22 << 1;
                        c8604b.m27298i(iArr[((i16 - 1) - i30) - i25], iArr[i30 + i8]);
                    }
                    i8++;
                    i17 = 2;
                }
                i25++;
                i8 = 0;
                i17 = 2;
            }
            i23 += i24 << 3;
            i22++;
            i8 = 0;
            i17 = 2;
        }
        m27255c(c8604b, z, i7, m27258f);
        if (z) {
            m27254b(c8604b, i7 / 2, 5);
        } else {
            int i31 = i7 / 2;
            m27254b(c8604b, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i33 < (i16 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i7; i34 += 2) {
                    int i35 = i31 - i32;
                    c8604b.m27298i(i35, i34);
                    int i36 = i31 + i32;
                    c8604b.m27298i(i36, i34);
                    c8604b.m27298i(i34, i35);
                    c8604b.m27298i(i34, i36);
                }
                i33 += 15;
                i32 += 16;
            }
        }
        C8596a c8596a = new C8596a();
        c8596a.m27248c(z);
        c8596a.m27251f(i7);
        c8596a.m27249d(i5);
        c8596a.m27247b(m27288i3);
        c8596a.m27250e(c8604b);
        return c8596a;
    }

    /* renamed from: e */
    private static C8603a m27257e(C8603a c8603a, int i2, int i3) {
        int m27288i = c8603a.m27288i() / i3;
        C8592c c8592c = new C8592c(m27259g(i3));
        int i4 = i2 / i3;
        int[] m27253a = m27253a(c8603a, i3, i4);
        c8592c.m27242b(m27253a, i4 - m27288i);
        C8603a c8603a2 = new C8603a();
        c8603a2.m27285e(0, i2 % i3);
        for (int i5 : m27253a) {
            c8603a2.m27285e(i5, i3);
        }
        return c8603a2;
    }

    /* renamed from: f */
    static C8603a m27258f(boolean z, int i2, int i3) {
        C8603a c8603a = new C8603a();
        if (z) {
            c8603a.m27285e(i2 - 1, 2);
            c8603a.m27285e(i3 - 1, 6);
            return m27257e(c8603a, 28, 4);
        }
        c8603a.m27285e(i2 - 1, 5);
        c8603a.m27285e(i3 - 1, 11);
        return m27257e(c8603a, 40, 4);
    }

    /* renamed from: g */
    private static C8590a m27259g(int i2) {
        if (i2 == 4) {
            return C8590a.f32753d;
        }
        if (i2 == 6) {
            return C8590a.f32752c;
        }
        if (i2 == 8) {
            return C8590a.f32756g;
        }
        if (i2 == 10) {
            return C8590a.f32751b;
        }
        if (i2 == 12) {
            return C8590a.f32750a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    /* renamed from: h */
    static C8603a m27260h(C8603a c8603a, int i2) {
        C8603a c8603a2 = new C8603a();
        int m27288i = c8603a.m27288i();
        int i3 = (1 << i2) - 2;
        int i4 = 0;
        while (i4 < m27288i) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i4 + i6;
                if (i7 >= m27288i || c8603a.m27287h(i7)) {
                    i5 |= 1 << ((i2 - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                c8603a2.m27285e(i8, i2);
            } else if (i8 == 0) {
                c8603a2.m27285e(i5 | 1, i2);
            } else {
                c8603a2.m27285e(i5, i2);
                i4 += i2;
            }
            i4--;
            i4 += i2;
        }
        return c8603a2;
    }

    /* renamed from: i */
    private static int m27261i(int i2, boolean z) {
        return ((z ? 88 : 112) + (i2 << 4)) * i2;
    }
}
