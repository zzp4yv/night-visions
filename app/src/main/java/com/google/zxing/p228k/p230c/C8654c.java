package com.google.zxing.p228k.p230c;

import com.google.zxing.WriterException;
import com.google.zxing.common.reedsolomon.C8590a;
import com.google.zxing.common.reedsolomon.C8592c;
import com.google.zxing.p222g.C8603a;
import com.google.zxing.p222g.EnumC8605c;
import com.google.zxing.p228k.p229b.C8651c;
import com.google.zxing.p228k.p229b.EnumC8649a;
import com.google.zxing.p228k.p229b.EnumC8650b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Encoder.java */
/* renamed from: com.google.zxing.k.c.c */
/* loaded from: classes2.dex */
public final class C8654c {

    /* renamed from: a */
    private static final int[] f32957a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder.java */
    /* renamed from: com.google.zxing.k.c.c$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32958a;

        static {
            int[] iArr = new int[EnumC8650b.values().length];
            f32958a = iArr;
            try {
                iArr[EnumC8650b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32958a[EnumC8650b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32958a[EnumC8650b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32958a[EnumC8650b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    static void m27459a(String str, C8603a c8603a, String str2) throws WriterException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                c8603a.m27285e(b2, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException(e2);
        }
    }

    /* renamed from: b */
    static void m27460b(CharSequence charSequence, C8603a c8603a) throws WriterException {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int m27474p = m27474p(charSequence.charAt(i2));
            if (m27474p == -1) {
                throw new WriterException();
            }
            int i3 = i2 + 1;
            if (i3 < length) {
                int m27474p2 = m27474p(charSequence.charAt(i3));
                if (m27474p2 == -1) {
                    throw new WriterException();
                }
                c8603a.m27285e((m27474p * 45) + m27474p2, 11);
                i2 += 2;
            } else {
                c8603a.m27285e(m27474p, 6);
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    static void m27461c(String str, EnumC8650b enumC8650b, C8603a c8603a, String str2) throws WriterException {
        int i2 = a.f32958a[enumC8650b.ordinal()];
        if (i2 == 1) {
            m27466h(str, c8603a);
            return;
        }
        if (i2 == 2) {
            m27460b(str, c8603a);
        } else if (i2 == 3) {
            m27459a(str, c8603a, str2);
        } else {
            if (i2 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(enumC8650b)));
            }
            m27463e(str, c8603a);
        }
    }

    /* renamed from: d */
    private static void m27462d(EnumC8605c enumC8605c, C8603a c8603a) {
        c8603a.m27285e(EnumC8650b.ECI.m27436g(), 4);
        c8603a.m27285e(enumC8605c.m27302k(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m27463e(java.lang.String r6, com.google.zxing.p222g.C8603a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = -1
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.m27285e(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            goto L55
        L54:
            throw r7
        L55:
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p228k.p230c.C8654c.m27463e(java.lang.String, com.google.zxing.g.a):void");
    }

    /* renamed from: f */
    static void m27464f(int i2, C8651c c8651c, EnumC8650b enumC8650b, C8603a c8603a) throws WriterException {
        int m27437k = enumC8650b.m27437k(c8651c);
        int i3 = 1 << m27437k;
        if (i2 < i3) {
            c8603a.m27285e(i2, m27437k);
            return;
        }
        throw new WriterException(i2 + " is bigger than " + (i3 - 1));
    }

    /* renamed from: g */
    static void m27465g(EnumC8650b enumC8650b, C8603a c8603a) {
        c8603a.m27285e(enumC8650b.m27436g(), 4);
    }

    /* renamed from: h */
    static void m27466h(CharSequence charSequence, C8603a c8603a) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                c8603a.m27285e((charAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    c8603a.m27285e((charAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    c8603a.m27285e(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m27467i(EnumC8650b enumC8650b, C8603a c8603a, C8603a c8603a2, C8651c c8651c) {
        return c8603a.m27288i() + enumC8650b.m27437k(c8651c) + c8603a2.m27288i();
    }

    /* renamed from: j */
    private static int m27468j(C8653b c8653b) {
        return C8655d.m27481a(c8653b) + C8655d.m27483c(c8653b) + C8655d.m27484d(c8653b) + C8655d.m27485e(c8653b);
    }

    /* renamed from: k */
    private static int m27469k(C8603a c8603a, EnumC8649a enumC8649a, C8651c c8651c, C8653b c8653b) throws WriterException {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            C8656e.m27489a(c8603a, enumC8649a, c8651c, i4, c8653b);
            int m27468j = m27468j(c8653b);
            if (m27468j < i2) {
                i3 = i4;
                i2 = m27468j;
            }
        }
        return i3;
    }

    /* renamed from: l */
    private static EnumC8650b m27470l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m27477s(str)) {
            return EnumC8650b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (m27474p(charAt) == -1) {
                    return EnumC8650b.BYTE;
                }
                z = true;
            }
        }
        return z ? EnumC8650b.ALPHANUMERIC : z2 ? EnumC8650b.NUMERIC : EnumC8650b.BYTE;
    }

    /* renamed from: m */
    private static C8651c m27471m(int i2, EnumC8649a enumC8649a) throws WriterException {
        for (int i3 = 1; i3 <= 40; i3++) {
            C8651c m27439e = C8651c.m27439e(i3);
            if (m27480v(i2, m27439e, enumC8649a)) {
                return m27439e;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.p228k.p230c.C8657f m27472n(java.lang.String r7, com.google.zxing.p228k.p229b.EnumC8649a r8, java.util.Map<com.google.zxing.EnumC8589c, ?> r9) throws com.google.zxing.WriterException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            com.google.zxing.c r2 = com.google.zxing.EnumC8589c.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1c
            com.google.zxing.c r3 = com.google.zxing.EnumC8589c.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            com.google.zxing.k.b.b r4 = m27470l(r7, r3)
            com.google.zxing.g.a r5 = new com.google.zxing.g.a
            r5.<init>()
            com.google.zxing.k.b.b r6 = com.google.zxing.p228k.p229b.EnumC8650b.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            com.google.zxing.g.c r2 = com.google.zxing.p222g.EnumC8605c.m27301g(r3)
            if (r2 == 0) goto L36
            m27462d(r2, r5)
        L36:
            if (r9 == 0) goto L41
            com.google.zxing.c r2 = com.google.zxing.EnumC8589c.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L5d
            com.google.zxing.c r0 = com.google.zxing.EnumC8589c.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.google.zxing.k.b.b r0 = com.google.zxing.p228k.p229b.EnumC8650b.FNC1_FIRST_POSITION
            m27465g(r0, r5)
        L5d:
            m27465g(r4, r5)
            com.google.zxing.g.a r0 = new com.google.zxing.g.a
            r0.<init>()
            m27461c(r7, r4, r0, r3)
            if (r9 == 0) goto L95
            com.google.zxing.c r1 = com.google.zxing.EnumC8589c.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L95
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            com.google.zxing.k.b.c r9 = com.google.zxing.p228k.p229b.C8651c.m27439e(r9)
            int r1 = m27467i(r4, r5, r0, r9)
            boolean r1 = m27480v(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L99
        L8d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            com.google.zxing.k.b.c r9 = m27478t(r8, r4, r5, r0)
        L99:
            com.google.zxing.g.a r1 = new com.google.zxing.g.a
            r1.<init>()
            r1.m27284d(r5)
            if (r4 != r6) goto La8
            int r7 = r0.m27289j()
            goto Lac
        La8:
            int r7 = r7.length()
        Lac:
            m27464f(r7, r9, r4, r1)
            r1.m27284d(r0)
            com.google.zxing.k.b.c$b r7 = r9.m27441c(r8)
            int r0 = r9.m27442d()
            int r2 = r7.m27449d()
            int r0 = r0 - r2
            m27479u(r0, r1)
            int r2 = r9.m27442d()
            int r7 = r7.m27448c()
            com.google.zxing.g.a r7 = m27476r(r1, r2, r0, r7)
            com.google.zxing.k.c.f r0 = new com.google.zxing.k.c.f
            r0.<init>()
            r0.m27510c(r8)
            r0.m27513f(r4)
            r0.m27514g(r9)
            int r1 = r9.m27440b()
            com.google.zxing.k.c.b r2 = new com.google.zxing.k.c.b
            r2.<init>(r1, r1)
            int r1 = m27469k(r7, r8, r9, r2)
            r0.m27511d(r1)
            com.google.zxing.p228k.p230c.C8656e.m27489a(r7, r8, r9, r1, r2)
            r0.m27512e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p228k.p230c.C8654c.m27472n(java.lang.String, com.google.zxing.k.b.a, java.util.Map):com.google.zxing.k.c.f");
    }

    /* renamed from: o */
    static byte[] m27473o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[length + i2];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new C8592c(C8590a.f32754e).m27242b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m27474p(int i2) {
        int[] iArr = f32957a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: q */
    static void m27475q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) throws WriterException {
        if (i5 >= i4) {
            throw new WriterException("Block ID too large");
        }
        int i6 = i2 % i4;
        int i7 = i4 - i6;
        int i8 = i2 / i4;
        int i9 = i8 + 1;
        int i10 = i3 / i4;
        int i11 = i10 + 1;
        int i12 = i8 - i10;
        int i13 = i9 - i11;
        if (i12 != i13) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i4 != i7 + i6) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i5 < i7) {
            iArr[0] = i10;
            iArr2[0] = i12;
        } else {
            iArr[0] = i11;
            iArr2[0] = i13;
        }
    }

    /* renamed from: r */
    static C8603a m27476r(C8603a c8603a, int i2, int i3, int i4) throws WriterException {
        if (c8603a.m27289j() != i3) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i4);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            m27475q(i2, i3, i4, i8, iArr, iArr2);
            int i9 = iArr[0];
            byte[] bArr = new byte[i9];
            c8603a.m27290l(i5 << 3, bArr, 0, i9);
            byte[] m27473o = m27473o(bArr, iArr2[0]);
            arrayList.add(new C8652a(bArr, m27473o));
            i6 = Math.max(i6, i9);
            i7 = Math.max(i7, m27473o.length);
            i5 += iArr[0];
        }
        if (i3 != i5) {
            throw new WriterException("Data bytes does not match offset");
        }
        C8603a c8603a2 = new C8603a();
        for (int i10 = 0; i10 < i6; i10++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] m27450a = ((C8652a) it.next()).m27450a();
                if (i10 < m27450a.length) {
                    c8603a2.m27285e(m27450a[i10], 8);
                }
            }
        }
        for (int i11 = 0; i11 < i7; i11++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] m27451b = ((C8652a) it2.next()).m27451b();
                if (i11 < m27451b.length) {
                    c8603a2.m27285e(m27451b[i11], 8);
                }
            }
        }
        if (i2 == c8603a2.m27289j()) {
            return c8603a2;
        }
        throw new WriterException("Interleaving error: " + i2 + " and " + c8603a2.m27289j() + " differ.");
    }

    /* renamed from: s */
    private static boolean m27477s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = bytes[i2] & 255;
                if ((i3 < 129 || i3 > 159) && (i3 < 224 || i3 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C8651c m27478t(EnumC8649a enumC8649a, EnumC8650b enumC8650b, C8603a c8603a, C8603a c8603a2) throws WriterException {
        return m27471m(m27467i(enumC8650b, c8603a, c8603a2, m27471m(m27467i(enumC8650b, c8603a, c8603a2, C8651c.m27439e(1)), enumC8649a)), enumC8649a);
    }

    /* renamed from: u */
    static void m27479u(int i2, C8603a c8603a) throws WriterException {
        int i3 = i2 << 3;
        if (c8603a.m27288i() > i3) {
            throw new WriterException("data bits cannot fit in the QR Code" + c8603a.m27288i() + " > " + i3);
        }
        for (int i4 = 0; i4 < 4 && c8603a.m27288i() < i3; i4++) {
            c8603a.m27283b(false);
        }
        int m27288i = c8603a.m27288i() & 7;
        if (m27288i > 0) {
            while (m27288i < 8) {
                c8603a.m27283b(false);
                m27288i++;
            }
        }
        int m27289j = i2 - c8603a.m27289j();
        for (int i5 = 0; i5 < m27289j; i5++) {
            c8603a.m27285e((i5 & 1) == 0 ? 236 : 17, 8);
        }
        if (c8603a.m27288i() != i3) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    /* renamed from: v */
    private static boolean m27480v(int i2, C8651c c8651c, EnumC8649a enumC8649a) {
        return c8651c.m27442d() - c8651c.m27441c(enumC8649a).m27449d() >= (i2 + 7) / 8;
    }
}
