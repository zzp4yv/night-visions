package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.C6192a;
import com.google.ads.mediation.InterfaceC6194c;
import com.google.ads.mediation.InterfaceC6200d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbad;
import p241e.p254e.p255a.C8750c;
import p241e.p254e.p255a.EnumC8748a;

@KeepName
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, C6199c>, MediationInterstitialAdapter<CustomEventExtras, C6199c> {

    /* renamed from: a */
    private View f16564a;

    /* renamed from: b */
    @VisibleForTesting
    private CustomEventBanner f16565b;

    /* renamed from: c */
    @VisibleForTesting
    private CustomEventInterstitial f16566c;

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C6195a implements InterfaceC6197a {

        /* renamed from: a */
        private final CustomEventAdapter f16567a;

        /* renamed from: b */
        private final InterfaceC6194c f16568b;

        public C6195a(CustomEventAdapter customEventAdapter, InterfaceC6194c interfaceC6194c) {
            this.f16567a = customEventAdapter;
            this.f16568b = interfaceC6194c;
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C6196b implements InterfaceC6198b {

        /* renamed from: a */
        private final CustomEventAdapter f16569a;

        /* renamed from: b */
        private final InterfaceC6200d f16570b;

        public C6196b(CustomEventAdapter customEventAdapter, InterfaceC6200d interfaceC6200d) {
            this.f16569a = customEventAdapter;
            this.f16570b = interfaceC6200d;
        }
    }

    /* renamed from: a */
    private static <T> T m13393a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzbad.m17353i(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.InterfaceC6193b
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f16565b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f16566c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.InterfaceC6193b
    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f16564a;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.InterfaceC6193b
    public final Class<C6199c> getServerParametersType() {
        return C6199c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(InterfaceC6194c interfaceC6194c, Activity activity, C6199c c6199c, C8750c c8750c, C6192a c6192a, CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m13393a(c6199c.f16573b);
        this.f16565b = customEventBanner;
        if (customEventBanner == null) {
            interfaceC6194c.mo13392a(this, EnumC8748a.INTERNAL_ERROR);
        } else {
            this.f16565b.requestBannerAd(new C6195a(this, interfaceC6194c), activity, c6199c.f16572a, c6199c.f16574c, c8750c, c6192a, customEventExtras == null ? null : customEventExtras.getExtra(c6199c.f16572a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(InterfaceC6200d interfaceC6200d, Activity activity, C6199c c6199c, C6192a c6192a, CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m13393a(c6199c.f16573b);
        this.f16566c = customEventInterstitial;
        if (customEventInterstitial == null) {
            interfaceC6200d.mo13394b(this, EnumC8748a.INTERNAL_ERROR);
        } else {
            this.f16566c.requestInterstitialAd(new C6196b(this, interfaceC6200d), activity, c6199c.f16572a, c6199c.f16574c, c6192a, customEventExtras == null ? null : customEventExtras.getExtra(c6199c.f16572a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f16566c.showInterstitial();
    }
}
