package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class w10 {

    /* renamed from: a */
    private final zzst f20822a = new zzst(8);

    /* renamed from: b */
    private int f20823b;

    /* renamed from: b */
    private final long m15975b(zzno zznoVar) throws IOException, InterruptedException {
        int i2 = 0;
        zznoVar.mo20325d(this.f20822a.f27013a, 0, 1);
        int i3 = this.f20822a.f27013a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (i4 ^ (-1));
        zznoVar.mo20325d(this.f20822a.f27013a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f20822a.f27013a[i2] & 255) + (i6 << 8);
        }
        this.f20823b += i5 + 1;
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        return false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15976a(com.google.android.gms.internal.ads.zzno r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r18.mo20327f()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L16
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L15
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = (int) r4
            com.google.android.gms.internal.ads.zzst r4 = r0.f20822a
            byte[] r4 = r4.f27013a
            r8 = 0
            r9 = 4
            r1.mo20325d(r4, r8, r9)
            com.google.android.gms.internal.ads.zzst r4 = r0.f20822a
            long r10 = r4.m20516q()
            r0.f20823b = r9
        L28:
            r12 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 == 0) goto L52
            int r9 = r0.f20823b
            int r9 = r9 + r4
            r0.f20823b = r9
            if (r9 != r5) goto L38
            return r8
        L38:
            com.google.android.gms.internal.ads.zzst r9 = r0.f20822a
            byte[] r9 = r9.f27013a
            r1.mo20325d(r9, r8, r4)
            r4 = 8
            long r9 = r10 << r4
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.google.android.gms.internal.ads.zzst r4 = r0.f20822a
            byte[] r4 = r4.f27013a
            r4 = r4[r8]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r11 = (long) r4
            long r9 = r9 | r11
            r10 = r9
            goto L28
        L52:
            long r9 = r17.m15975b(r18)
            int r5 = r0.f20823b
            long r11 = (long) r5
            r13 = -9223372036854775808
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto La5
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L6a
            long r5 = r11 + r9
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L6a
            goto La5
        L6a:
            int r2 = r0.f20823b
            long r5 = (long) r2
            long r15 = r11 + r9
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L9f
            long r2 = r17.m15975b(r18)
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 != 0) goto L7c
            return r8
        L7c:
            long r2 = r17.m15975b(r18)
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L9e
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r7 <= 0) goto L8e
            goto L9e
        L8e:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L6a
            int r5 = (int) r2
            r1.mo20328g(r5)
            int r5 = r0.f20823b
            long r5 = (long) r5
            long r5 = r5 + r2
            int r2 = (int) r5
            r0.f20823b = r2
            goto L6a
        L9e:
            return r8
        L9f:
            long r1 = (long) r2
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto La5
            return r4
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w10.m15976a(com.google.android.gms.internal.ads.zzno):boolean");
    }
}
