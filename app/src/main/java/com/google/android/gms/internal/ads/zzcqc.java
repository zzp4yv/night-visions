package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqc implements zzbrl, zzbro, zzbsr {

    /* renamed from: f */
    private zzatb f24906f;

    /* renamed from: g */
    private zzasu f24907g;

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final synchronized void mo17882a(zzasr zzasrVar, String str, String str2) {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.mo16935l1(zzasrVar);
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onRewarded.", e2);
            }
        }
        zzasu zzasuVar = this.f24907g;
        if (zzasuVar != null) {
            try {
                zzasuVar.mo16928y3(zzasrVar, str, str2);
            } catch (RemoteException e3) {
                zzbad.m17350f("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m18932b(zzasu zzasuVar) {
        this.f24907g = zzasuVar;
    }

    /* renamed from: c */
    public final synchronized void m18933c(zzatb zzatbVar) {
        this.f24906f = zzatbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdClosed() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdClosed();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdClosed.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdFailedToLoad(i2);
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdFailedToLoad.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdLeftApplication() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdLeftApplication.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdLoaded();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdLoaded.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdOpened() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoAdOpened();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdOpened.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoCompleted() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoCompleted();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoStarted() {
        zzatb zzatbVar = this.f24906f;
        if (zzatbVar != null) {
            try {
                zzatbVar.onRewardedVideoStarted();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onRewardedVideoStarted.", e2);
            }
        }
    }
}
