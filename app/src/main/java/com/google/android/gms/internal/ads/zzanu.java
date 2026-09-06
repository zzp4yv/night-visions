package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.InterfaceC6194c;
import com.google.ads.mediation.InterfaceC6200d;
import com.google.ads.mediation.InterfaceC6201e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import p241e.p254e.p255a.EnumC8748a;

@zzard
/* loaded from: classes2.dex */
public final class zzanu<NETWORK_EXTRAS extends InterfaceC6201e, SERVER_PARAMETERS extends MediationServerParameters> implements InterfaceC6194c, InterfaceC6200d {

    /* renamed from: a */
    private final zzamv f22212a;

    public zzanu(zzamv zzamvVar) {
        this.f22212a = zzamvVar;
    }

    @Override // com.google.ads.mediation.InterfaceC6194c
    /* renamed from: a */
    public final void mo13392a(MediationBannerAdapter<?, ?> mediationBannerAdapter, EnumC8748a enumC8748a) {
        String valueOf = String.valueOf(enumC8748a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzbad.m17349e(sb.toString());
        zzyt.m20844a();
        if (!zzazt.m17318w()) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", null);
            zzazt.f22735a.post(new RunnableC7180u2(this, enumC8748a));
        } else {
            try {
                this.f22212a.onAdFailedToLoad(zzaog.m16808a(enumC8748a));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.ads.mediation.InterfaceC6200d
    /* renamed from: b */
    public final void mo13394b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, EnumC8748a enumC8748a) {
        String valueOf = String.valueOf(enumC8748a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzbad.m17349e(sb.toString());
        zzyt.m20844a();
        if (!zzazt.m17318w()) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", null);
            zzazt.f22735a.post(new RunnableC7254w2(this, enumC8748a));
        } else {
            try {
                this.f22212a.onAdFailedToLoad(zzaog.m16808a(enumC8748a));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }
}
