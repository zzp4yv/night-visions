package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@zzard
/* loaded from: classes2.dex */
public final class zzvf extends zzva {

    /* renamed from: c */
    private MessageDigest f27208c;

    @Override // com.google.android.gms.internal.ads.zzva
    /* renamed from: a */
    public final byte[] mo20649a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i2 = 4;
        if (split.length == 1) {
            int m20653a = zzve.m20653a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(m20653a);
            bArr2 = allocate.array();
        } else {
            if (split.length < 5) {
                bArr = new byte[split.length << 1];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int m20653a2 = zzve.m20653a(split[i3]);
                    int i4 = (m20653a2 >> 16) ^ (65535 & m20653a2);
                    byte[] bArr3 = {(byte) i4, (byte) (i4 >> 8)};
                    int i5 = i3 << 1;
                    bArr[i5] = bArr3[0];
                    bArr[i5 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[split.length];
                for (int i6 = 0; i6 < split.length; i6++) {
                    int m20653a3 = zzve.m20653a(split[i6]);
                    bArr[i6] = (byte) ((m20653a3 >> 24) ^ (((m20653a3 & 255) ^ ((m20653a3 >> 8) & 255)) ^ ((m20653a3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f27208c = m20650b();
        synchronized (this.f27203b) {
            MessageDigest messageDigest = this.f27208c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f27208c.update(bArr2);
            byte[] digest = this.f27208c.digest();
            if (digest.length <= 4) {
                i2 = digest.length;
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(digest, 0, bArr4, 0, i2);
            return bArr4;
        }
    }
}
