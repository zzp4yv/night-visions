package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.g */
/* loaded from: classes2.dex */
final class C6203g extends AdMetadataListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f16576a;

    C6203g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f16576a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        InterstitialAd interstitialAd;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        InterstitialAd interstitialAd2;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener2;
        interstitialAd = this.f16576a.zzmh;
        if (interstitialAd != null) {
            mediationRewardedVideoAdListener = this.f16576a.zzmi;
            if (mediationRewardedVideoAdListener != null) {
                interstitialAd2 = this.f16576a.zzmh;
                Bundle adMetadata = interstitialAd2.getAdMetadata();
                mediationRewardedVideoAdListener2 = this.f16576a.zzmi;
                mediationRewardedVideoAdListener2.zzb(adMetadata);
            }
        }
    }
}
