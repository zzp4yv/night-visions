package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpf extends Exception {

    /* renamed from: f */
    private final String f26804f;

    /* renamed from: g */
    private final boolean f26805g;

    /* renamed from: h */
    private final String f26806h;

    /* renamed from: i */
    private final String f26807i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzpf(com.google.android.gms.internal.ads.zzlh r3, java.lang.Throwable r4, boolean r5, int r6) {
        /*
            r2 = this;
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r0 = r5.length()
            int r0 = r0 + 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r2.<init>(r5, r4)
            java.lang.String r3 = r3.f26470k
            r2.f26804f = r3
            r3 = 0
            r2.f26805g = r3
            r3 = 0
            r2.f26806h = r3
            if (r6 >= 0) goto L35
            java.lang.String r3 = "neg_"
            goto L37
        L35:
            java.lang.String r3 = ""
        L37:
            int r4 = java.lang.Math.abs(r6)
            int r5 = r3.length()
            int r5 = r5 + 64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "com.google.android.exoplayer.MediaCodecTrackRenderer_"
            r6.append(r5)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r2.f26807i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.<init>(com.google.android.gms.internal.ads.zzlh, java.lang.Throwable, boolean, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzpf(com.google.android.gms.internal.ads.zzlh r3, java.lang.Throwable r4, boolean r5, java.lang.String r6) {
        /*
            r2 = this;
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r0 = r0.length()
            int r0 = r0 + 23
            int r1 = r5.length()
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r2.<init>(r5, r4)
            java.lang.String r3 = r3.f26470k
            r2.f26804f = r3
            r3 = 0
            r2.f26805g = r3
            r2.f26806h = r6
            int r3 = com.google.android.gms.internal.ads.zzsy.f27024a
            r5 = 0
            r6 = 21
            if (r3 < r6) goto L49
            boolean r3 = r4 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L49
            android.media.MediaCodec$CodecException r4 = (android.media.MediaCodec.CodecException) r4
            java.lang.String r5 = r4.getDiagnosticInfo()
        L49:
            r2.f26807i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.<init>(com.google.android.gms.internal.ads.zzlh, java.lang.Throwable, boolean, java.lang.String):void");
    }
}
