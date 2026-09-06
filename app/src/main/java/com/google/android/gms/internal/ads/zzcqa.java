package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcqa implements zzbrl, zzbrs {

    /* renamed from: f */
    private zzatw f24903f;

    /* renamed from: g */
    private zzaue f24904g;

    @Override // com.google.android.gms.internal.ads.zzbrs
    /* renamed from: R */
    public final synchronized void mo18300R(int i2) {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16947p6(i2);
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final synchronized void mo17882a(zzasr zzasrVar, String str, String str2) {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16948v0(new zzaup(zzasrVar.getType(), zzasrVar.getAmount()));
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
        zzaue zzaueVar = this.f24904g;
        if (zzaueVar != null) {
            try {
                zzaueVar.mo16952X2(new zzaup(zzasrVar.getType(), zzasrVar.getAmount()), str, str2);
            } catch (RemoteException e3) {
                zzbad.m17350f("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m18929b(zzatw zzatwVar) {
        this.f24903f = zzatwVar;
    }

    /* renamed from: c */
    public final synchronized void m18930c(zzaue zzaueVar) {
        this.f24904g = zzaueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdClosed() {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16946o1();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onAdOpened() {
        zzatw zzatwVar = this.f24903f;
        if (zzatwVar != null) {
            try {
                zzatwVar.mo16945S1();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final synchronized void onRewardedVideoStarted() {
    }
}
