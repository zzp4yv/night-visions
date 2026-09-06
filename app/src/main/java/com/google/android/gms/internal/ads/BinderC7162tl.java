package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tl */
/* loaded from: classes2.dex */
final class BinderC7162tl extends zzaot {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f20575f;

    private BinderC7162tl(zzcnd zzcndVar, zzcjy zzcjyVar) {
        this.f20575f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    /* renamed from: K0 */
    public final void mo15903K0() throws RemoteException {
        this.f20575f.f24423c.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    /* renamed from: p */
    public final void mo15904p(String str) throws RemoteException {
        this.f20575f.f24423c.onAdFailedToLoad(0);
    }
}
