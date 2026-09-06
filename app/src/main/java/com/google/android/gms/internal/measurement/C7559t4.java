package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t4 */
/* loaded from: classes2.dex */
final class C7559t4 extends AbstractC7529o4 {
    C7559t4() {
    }

    /* renamed from: e */
    private static int m21408e(byte[] bArr, int i2, long j2, int i3) {
        int m21254h;
        int m21255i;
        int m21256j;
        if (i3 == 0) {
            m21254h = C7523n4.m21254h(i2);
            return m21254h;
        }
        if (i3 == 1) {
            m21255i = C7523n4.m21255i(i2, C7505k4.m21189a(bArr, j2));
            return m21255i;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        m21256j = C7523n4.m21256j(i2, C7505k4.m21189a(bArr, j2), C7505k4.m21189a(bArr, j2 + 1));
        return m21256j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0061, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC7529o4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int mo21269a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7559t4.mo21269a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7529o4
    /* renamed from: b */
    final int mo21270b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        char c2;
        long j2;
        long j3;
        long j4;
        int i4;
        char charAt;
        long j5 = i2;
        long j6 = i3 + j5;
        int length = charSequence.length();
        if (length > i3 || bArr.length - i3 < i2) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i2 + i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i5 = 0;
        while (true) {
            c2 = 128;
            j2 = 1;
            if (i5 >= length || (charAt = charSequence.charAt(i5)) >= 128) {
                break;
            }
            C7505k4.m21200l(bArr, j5, (byte) charAt);
            i5++;
            j5 = 1 + j5;
        }
        if (i5 == length) {
            return (int) j5;
        }
        while (i5 < length) {
            char charAt3 = charSequence.charAt(i5);
            if (charAt3 >= c2 || j5 >= j6) {
                if (charAt3 < 2048 && j5 <= j6 - 2) {
                    long j7 = j5 + j2;
                    C7505k4.m21200l(bArr, j5, (byte) ((charAt3 >>> 6) | 960));
                    C7505k4.m21200l(bArr, j7, (byte) ((charAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j5 > j6 - 3) {
                        if (j5 > j6 - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i4)))) {
                                throw new C7541q4(i5, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(j5);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char charAt4 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j8 = j5 + 1;
                                C7505k4.m21200l(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j9 = j8 + 1;
                                C7505k4.m21200l(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = j9 + 1;
                                C7505k4.m21200l(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j10 + 1;
                                C7505k4.m21200l(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new C7541q4(i5 - 1, length);
                    }
                    long j11 = j5 + j2;
                    C7505k4.m21200l(bArr, j5, (byte) ((charAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    C7505k4.m21200l(bArr, j11, (byte) (((charAt3 >>> 6) & 63) | 128));
                    C7505k4.m21200l(bArr, j12, (byte) ((charAt3 & '?') | 128));
                    j3 = j12 + 1;
                    j4 = 1;
                }
                i5++;
                c2 = 128;
                long j13 = j4;
                j5 = j3;
                j2 = j13;
            } else {
                long j14 = j5 + j2;
                C7505k4.m21200l(bArr, j5, (byte) charAt3);
                j4 = j2;
                j3 = j14;
            }
            i5++;
            c2 = 128;
            long j132 = j4;
            j5 = j3;
            j2 = j132;
        }
        return (int) j5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7529o4
    /* renamed from: d */
    final String mo21272d(byte[] bArr, int i2, int i3) throws zzfo {
        boolean m21287l;
        boolean m21287l2;
        boolean m21288m;
        boolean m21289n;
        boolean m21287l3;
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte m21189a = C7505k4.m21189a(bArr, i2);
            m21287l3 = C7535p4.m21287l(m21189a);
            if (!m21287l3) {
                break;
            }
            i2++;
            C7535p4.m21284i(m21189a, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte m21189a2 = C7505k4.m21189a(bArr, i2);
            m21287l = C7535p4.m21287l(m21189a2);
            if (m21287l) {
                int i8 = i6 + 1;
                C7535p4.m21284i(m21189a2, cArr, i6);
                while (i7 < i4) {
                    byte m21189a3 = C7505k4.m21189a(bArr, i7);
                    m21287l2 = C7535p4.m21287l(m21189a3);
                    if (!m21287l2) {
                        break;
                    }
                    i7++;
                    C7535p4.m21284i(m21189a3, cArr, i8);
                    i8++;
                }
                i2 = i7;
                i6 = i8;
            } else {
                m21288m = C7535p4.m21288m(m21189a2);
                if (!m21288m) {
                    m21289n = C7535p4.m21289n(m21189a2);
                    if (m21289n) {
                        if (i7 >= i4 - 1) {
                            throw zzfo.m22303h();
                        }
                        int i9 = i7 + 1;
                        C7535p4.m21282g(m21189a2, C7505k4.m21189a(bArr, i7), C7505k4.m21189a(bArr, i9), cArr, i6);
                        i2 = i9 + 1;
                        i6++;
                    } else {
                        if (i7 >= i4 - 2) {
                            throw zzfo.m22303h();
                        }
                        int i10 = i7 + 1;
                        byte m21189a4 = C7505k4.m21189a(bArr, i7);
                        int i11 = i10 + 1;
                        C7535p4.m21281f(m21189a2, m21189a4, C7505k4.m21189a(bArr, i10), C7505k4.m21189a(bArr, i11), cArr, i6);
                        i2 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    }
                } else {
                    if (i7 >= i4) {
                        throw zzfo.m22303h();
                    }
                    C7535p4.m21283h(m21189a2, C7505k4.m21189a(bArr, i7), cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                }
            }
        }
        return new String(cArr, 0, i6);
    }
}
