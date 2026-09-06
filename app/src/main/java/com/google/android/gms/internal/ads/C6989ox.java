package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ox */
/* loaded from: classes2.dex */
final class C6989ox extends AbstractC6878lx {
    C6989ox() {
    }

    /* renamed from: g */
    private static int m15711g(byte[] bArr, int i2, long j2, int i3) {
        int m15381h;
        int m15378e;
        int m15380g;
        if (i3 == 0) {
            m15381h = C6804jx.m15381h(i2);
            return m15381h;
        }
        if (i3 == 1) {
            m15378e = C6804jx.m15378e(i2, C6693gx.m15199a(bArr, j2));
            return m15378e;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        m15380g = C6804jx.m15380g(i2, C6693gx.m15199a(bArr, j2), C6693gx.m15199a(bArr, j2 + 1));
        return m15380g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0061, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int mo15519a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6989ox.mo15519a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: b */
    final int mo15520b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
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
            C6693gx.m15207i(bArr, j5, (byte) charAt);
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
                    C6693gx.m15207i(bArr, j5, (byte) ((charAt3 >>> 6) | 960));
                    C6693gx.m15207i(bArr, j7, (byte) ((charAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j5 > j6 - 3) {
                        if (j5 > j6 - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i4)))) {
                                throw new C6952nx(i5, length);
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
                                C6693gx.m15207i(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j9 = j8 + 1;
                                C6693gx.m15207i(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = j9 + 1;
                                C6693gx.m15207i(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j10 + 1;
                                C6693gx.m15207i(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new C6952nx(i5 - 1, length);
                    }
                    long j11 = j5 + j2;
                    C6693gx.m15207i(bArr, j5, (byte) ((charAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    C6693gx.m15207i(bArr, j11, (byte) (((charAt3 >>> 6) & 63) | 128));
                    C6693gx.m15207i(bArr, j12, (byte) ((charAt3 & '?') | 128));
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
                C6693gx.m15207i(bArr, j5, (byte) charAt3);
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

    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: c */
    final void mo15521c(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c2;
        long j2;
        int i2;
        char charAt;
        long m15188J = C6693gx.m15188J(byteBuffer);
        long position = byteBuffer.position() + m15188J;
        long limit = byteBuffer.limit() + m15188J;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i3 = 0;
        while (true) {
            c2 = 128;
            if (i3 >= length || (charAt = charSequence.charAt(i3)) >= 128) {
                break;
            }
            C6693gx.m15200b(position, (byte) charAt);
            i3++;
            position = 1 + position;
        }
        if (i3 == length) {
            byteBuffer.position((int) (position - m15188J));
            return;
        }
        while (i3 < length) {
            char charAt3 = charSequence.charAt(i3);
            if (charAt3 < c2 && position < limit) {
                C6693gx.m15200b(position, (byte) charAt3);
                position++;
                j2 = m15188J;
            } else if (charAt3 >= 2048 || position > limit - 2) {
                j2 = m15188J;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                    if (position > limit - 4) {
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i2)))) {
                            throw new C6952nx(i3, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(position);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i4 = i3 + 1;
                    if (i4 != length) {
                        char charAt4 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            long j3 = position + 1;
                            C6693gx.m15200b(position, (byte) ((codePoint >>> 18) | 240));
                            long j4 = j3 + 1;
                            C6693gx.m15200b(j3, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j5 = j4 + 1;
                            C6693gx.m15200b(j4, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j6 = j5 + 1;
                            C6693gx.m15200b(j5, (byte) ((codePoint & 63) | 128));
                            i3 = i4;
                            position = j6;
                        } else {
                            i3 = i4;
                        }
                    }
                    throw new C6952nx(i3 - 1, length);
                }
                long j7 = position + 1;
                C6693gx.m15200b(position, (byte) ((charAt3 >>> '\f') | 480));
                long j8 = j7 + 1;
                C6693gx.m15200b(j7, (byte) (((charAt3 >>> 6) & 63) | 128));
                C6693gx.m15200b(j8, (byte) ((charAt3 & '?') | 128));
                position = j8 + 1;
            } else {
                j2 = m15188J;
                long j9 = position + 1;
                C6693gx.m15200b(position, (byte) ((charAt3 >>> 6) | 960));
                C6693gx.m15200b(j9, (byte) ((charAt3 & '?') | 128));
                position = j9 + 1;
            }
            i3++;
            m15188J = j2;
            c2 = 128;
        }
        byteBuffer.position((int) (position - m15188J));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: f */
    final String mo15523f(byte[] bArr, int i2, int i3) throws zzdok {
        boolean m15491i;
        boolean m15491i2;
        boolean m15492j;
        boolean m15493k;
        boolean m15491i3;
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte m15199a = C6693gx.m15199a(bArr, i2);
            m15491i3 = C6841kx.m15491i(m15199a);
            if (!m15491i3) {
                break;
            }
            i2++;
            C6841kx.m15486d(m15199a, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte m15199a2 = C6693gx.m15199a(bArr, i2);
            m15491i = C6841kx.m15491i(m15199a2);
            if (m15491i) {
                int i8 = i6 + 1;
                C6841kx.m15486d(m15199a2, cArr, i6);
                while (i7 < i4) {
                    byte m15199a3 = C6693gx.m15199a(bArr, i7);
                    m15491i2 = C6841kx.m15491i(m15199a3);
                    if (!m15491i2) {
                        break;
                    }
                    i7++;
                    C6841kx.m15486d(m15199a3, cArr, i8);
                    i8++;
                }
                i2 = i7;
                i6 = i8;
            } else {
                m15492j = C6841kx.m15492j(m15199a2);
                if (!m15492j) {
                    m15493k = C6841kx.m15493k(m15199a2);
                    if (m15493k) {
                        if (i7 >= i4 - 1) {
                            throw zzdok.m19757h();
                        }
                        int i9 = i7 + 1;
                        C6841kx.m15484b(m15199a2, C6693gx.m15199a(bArr, i7), C6693gx.m15199a(bArr, i9), cArr, i6);
                        i2 = i9 + 1;
                        i6++;
                    } else {
                        if (i7 >= i4 - 2) {
                            throw zzdok.m19757h();
                        }
                        int i10 = i7 + 1;
                        byte m15199a4 = C6693gx.m15199a(bArr, i7);
                        int i11 = i10 + 1;
                        C6841kx.m15483a(m15199a2, m15199a4, C6693gx.m15199a(bArr, i10), C6693gx.m15199a(bArr, i11), cArr, i6);
                        i2 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    }
                } else {
                    if (i7 >= i4) {
                        throw zzdok.m19757h();
                    }
                    C6841kx.m15485c(m15199a2, C6693gx.m15199a(bArr, i7), cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                }
            }
        }
        return new String(cArr, 0, i6);
    }
}
