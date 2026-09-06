package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.InterfaceC6201e;
import com.google.ads.mediation.MediationServerParameters;
import p241e.p254e.p255a.C8750c;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends InterfaceC6201e, SERVER_PARAMETERS extends MediationServerParameters> extends InterfaceC6193b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // com.google.ads.mediation.InterfaceC6193b
    /* synthetic */ void destroy();

    @Override // com.google.ads.mediation.InterfaceC6193b
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    View getBannerView();

    @Override // com.google.ads.mediation.InterfaceC6193b
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(InterfaceC6194c interfaceC6194c, Activity activity, SERVER_PARAMETERS server_parameters, C8750c c8750c, C6192a c6192a, ADDITIONAL_PARAMETERS additional_parameters);
}
