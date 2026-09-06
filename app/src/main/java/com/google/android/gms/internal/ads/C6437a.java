package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

/* renamed from: com.google.android.gms.internal.ads.a */
/* loaded from: classes2.dex */
final class C6437a extends zzyv {

    /* renamed from: c */
    private final /* synthetic */ zzabb f18063c;

    C6437a(zzabb zzabbVar) {
        this.f18063c = zzabbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyv, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i2) {
        VideoController videoController;
        videoController = this.f18063c.f21532d;
        videoController.zza(this.f18063c.m16269D());
        super.onAdFailedToLoad(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyv, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.f18063c.f21532d;
        videoController.zza(this.f18063c.m16269D());
        super.onAdLoaded();
    }
}
