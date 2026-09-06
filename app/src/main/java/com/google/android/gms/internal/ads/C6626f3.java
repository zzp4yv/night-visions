package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.google.android.gms.internal.ads.f3 */
/* loaded from: classes2.dex */
final class C6626f3 implements com.google.android.gms.ads.internal.overlay.zzo {

    /* renamed from: f */
    private final /* synthetic */ zzapl f18850f;

    C6626f3(zzapl zzaplVar) {
        this.f18850f = zzaplVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        zzbad.m17349e("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        zzbad.m17349e("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbad.m17349e("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.f18850f.f22221b;
        mediationInterstitialListener.onAdClosed(this.f18850f);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbad.m17349e("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.f18850f.f22221b;
        mediationInterstitialListener.onAdOpened(this.f18850f);
    }
}
