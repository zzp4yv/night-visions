package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.mx */
/* loaded from: classes2.dex */
final class C6915mx extends AbstractC6878lx {
    C6915mx() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: a */
    final int mo15519a(int i2, byte[] bArr, int i3, int i4) {
        int m15385l;
        int m15385l2;
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
                        m15385l2 = C6804jx.m15385l(bArr, i5, i4);
                        return m15385l2;
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
                    m15385l = C6804jx.m15385l(bArr, i5, i4);
                    return m15385l;
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
    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int mo15520b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6915mx.mo15520b(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6878lx
    /* renamed from: c */
    final void mo15521c(CharSequence charSequence, ByteBuffer byteBuffer) {
        AbstractC6878lx.m15518d(charSequence, byteBuffer);
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
            byte b2 = bArr[i2];
            m15491i3 = C6841kx.m15491i(b2);
            if (!m15491i3) {
                break;
            }
            i2++;
            C6841kx.m15486d(b2, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b3 = bArr[i2];
            m15491i = C6841kx.m15491i(b3);
            if (m15491i) {
                int i8 = i6 + 1;
                C6841kx.m15486d(b3, cArr, i6);
                while (i7 < i4) {
                    byte b4 = bArr[i7];
                    m15491i2 = C6841kx.m15491i(b4);
                    if (!m15491i2) {
                        break;
                    }
                    i7++;
                    C6841kx.m15486d(b4, cArr, i8);
                    i8++;
                }
                i2 = i7;
                i6 = i8;
            } else {
                m15492j = C6841kx.m15492j(b3);
                if (!m15492j) {
                    m15493k = C6841kx.m15493k(b3);
                    if (m15493k) {
                        if (i7 >= i4 - 1) {
                            throw zzdok.m19757h();
                        }
                        int i9 = i7 + 1;
                        C6841kx.m15484b(b3, bArr[i7], bArr[i9], cArr, i6);
                        i2 = i9 + 1;
                        i6++;
                    } else {
                        if (i7 >= i4 - 2) {
                            throw zzdok.m19757h();
                        }
                        int i10 = i7 + 1;
                        byte b5 = bArr[i7];
                        int i11 = i10 + 1;
                        C6841kx.m15483a(b3, b5, bArr[i10], bArr[i11], cArr, i6);
                        i2 = i11 + 1;
                        i6 = i6 + 1 + 1;
                    }
                } else {
                    if (i7 >= i4) {
                        throw zzdok.m19757h();
                    }
                    C6841kx.m15485c(b3, bArr[i7], cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                }
            }
        }
        return new String(cArr, 0, i6);
    }
}
