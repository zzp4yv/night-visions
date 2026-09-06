package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.InterfaceC6201e;
import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends InterfaceC6201e, SERVER_PARAMETERS extends MediationServerParameters> extends InterfaceC6193b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // com.google.ads.mediation.InterfaceC6193b
    /* synthetic */ void destroy();

    @Override // com.google.ads.mediation.InterfaceC6193b
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @Override // com.google.ads.mediation.InterfaceC6193b
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestInterstitialAd(InterfaceC6200d interfaceC6200d, Activity activity, SERVER_PARAMETERS server_parameters, C6192a c6192a, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
