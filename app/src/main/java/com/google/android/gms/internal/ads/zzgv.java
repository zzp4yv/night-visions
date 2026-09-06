package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgv extends Exception {

    /* renamed from: f */
    private final String f26165f;

    /* renamed from: g */
    private final String f26166g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzgv(com.google.android.gms.internal.ads.zzhj r3, java.lang.Throwable r4, int r5) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 + 36
            r0.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3, r4)
            r3 = 0
            r2.f26165f = r3
            if (r5 >= 0) goto L2e
            java.lang.String r3 = "neg_"
            goto L30
        L2e:
            java.lang.String r3 = ""
        L30:
            int r4 = java.lang.Math.abs(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r0 = r3.length()
            int r0 = r0 + 64
            r5.<init>(r0)
            java.lang.String r0 = "com.google.android.gms.ads.exoplayer1.MediaCodecTrackRenderer_"
            r5.append(r0)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r2.f26166g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgv.<init>(com.google.android.gms.internal.ads.zzhj, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzgv(com.google.android.gms.internal.ads.zzhj r4, java.lang.Throwable r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            int r1 = r1 + 23
            int r2 = r4.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            java.lang.String r1 = "Decoder init failed: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4, r5)
            r3.f26165f = r6
            int r4 = com.google.android.gms.internal.ads.zzkq.f26428a
            r6 = 0
            r0 = 21
            if (r4 < r0) goto L42
            boolean r4 = r5 instanceof android.media.MediaCodec.CodecException
            if (r4 == 0) goto L42
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            java.lang.String r6 = r5.getDiagnosticInfo()
        L42:
            r3.f26166g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgv.<init>(com.google.android.gms.internal.ads.zzhj, java.lang.Throwable, java.lang.String):void");
    }
}
