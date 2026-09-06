package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public final class zzdjh implements zzdby {

    /* renamed from: a */
    private final SecretKey f25587a;

    /* renamed from: b */
    private final int f25588b;

    /* renamed from: c */
    private byte[] f25589c;

    /* renamed from: d */
    private byte[] f25590d;

    /* renamed from: b */
    private static Cipher m19546b() throws GeneralSecurityException {
        return zzdkx.f25631c.m19569b("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    /* renamed from: a */
    public final byte[] mo19193a(byte[] bArr) throws GeneralSecurityException {
        byte[] m19554d;
        Cipher m19546b = m19546b();
        m19546b.init(1, this.f25587a);
        double length = bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            m19554d = zzdjs.m19552b(bArr, (max - 1) << 4, this.f25589c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            m19554d = zzdjs.m19554d(copyOf, this.f25590d);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = m19546b.doFinal(zzdjs.m19552b(bArr2, 0, bArr, i2 << 4, 16));
        }
        byte[] m19554d2 = zzdjs.m19554d(m19554d, bArr2);
        byte[] bArr3 = new byte[this.f25588b];
        System.arraycopy(m19546b.doFinal(m19554d2), 0, bArr3, 0, this.f25588b);
        return bArr3;
    }
}
