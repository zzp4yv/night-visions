package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.in */
/* loaded from: classes2.dex */
final class BinderC6757in extends zzzq {

    /* renamed from: f */
    private final /* synthetic */ zzzp f19393f;

    /* renamed from: g */
    private final /* synthetic */ zzcqj f19394g;

    BinderC6757in(zzcqj zzcqjVar, zzzp zzzpVar) {
        this.f19394g = zzcqjVar;
        this.f19393f = zzzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final void onAdMetadataChanged() throws RemoteException {
        boolean z;
        zzzp zzzpVar;
        z = this.f19394g.f24938n;
        if (!z || (zzzpVar = this.f19393f) == null) {
            return;
        }
        zzzpVar.onAdMetadataChanged();
    }
}
