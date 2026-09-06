package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes2.dex */
final class C7547r4 extends AbstractC7529o4 {
    C7547r4() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7529o4
    /* renamed from: a */
    final int mo21269a(int i2, byte[] bArr, int i3, int i4) {
        int m21259m;
        int m21259m2;
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i5 >= i4) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i3 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i5 >= i4 - 2) {
                        m21259m2 = C7523n4.m21259m(bArr, i5, i4);
                        return m21259m2;
                    }
                    int i6 = i5 + 1;
                    byte b3 = bArr[i5];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int i7 = i6 + 1;
                        if (bArr[i6] <= -65) {
                            i5 = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i5 >= i4 - 1) {
                    m21259m = C7523n4.m21259m(bArr, i5, i4);
                    return m21259m;
                }
                int i8 = i5 + 1;
                byte b4 = bArr[i5];
                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                    i3 = i8 + 1;
                    if (bArr[i8] > -65) {
                    }
                }
                return -1;
            }
            i3 = i5;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC7529o4
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int mo21270b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7547r4.mo21270b(java.lang.CharSequence, byte[], int, int):int");
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
            byte b2 = bArr[i2];
            m21287l3 = C7535p4.m21287l(b2);
            if (!m21287l3) {
                break;
            }
            i2++;
            C7535p4.m21284i(b2, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b3 = bArr[i2];
            m21287l = C7535p4.m21287l(b3);
            if (m21287l) {
                int i8 = i6 + 1;
                C7535p4.m21284i(b3, cArr, i6);
                while (i7 < i4) {
                    byte b4 = bArr[i7];
                    m21287l2 = C7535p4.m21287l(b4);
                    if (!m21287l2) {
                        break;
                    }
                    i7++;
                    C7535p4.m21284i(b4, cArr, i8);
                    i8++;
                }
                i2 = i7;
                i6 = i8;
            } else {
                m21288m = C7535p4.m21288m(b3);
                if (!m21288m) {
                    m21289n = C7535p4.m21289n(b3);
                    if (m21289n) {
                        if (i7 >= i4 - 1) {
                            throw zzfo.m22303h();
                        }
                        int i9 = i7 + 1;
                        C7535p4.m21282g(b3, bArr[i7], bArr[i9], cArr, i6);
                        i2 = i9 + 1;
                        i6++;
                    } else {
                        if (i7 >= i4 - 2) {
                            throw zzfo.m22303h();
                        }
                        int i10 = i7 + 1;
                        byte b5 = bArr[i7];
                        int i11 = i10 + 1;
                        C7535p4.m21281f(b3, b5, bArr[i10], bArr[i11], cArr, i6);
                        i2 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    }
                } else {
                    if (i7 >= i4) {
                        throw zzfo.m22303h();
                    }
                    C7535p4.m21283h(b3, bArr[i7], cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                }
            }
        }
        return new String(cArr, 0, i6);
    }
}
