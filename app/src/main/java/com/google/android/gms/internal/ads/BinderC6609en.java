package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.en */
/* loaded from: classes2.dex */
final class BinderC6609en extends zzaap {

    /* renamed from: f */
    private final /* synthetic */ zzaao f18827f;

    /* renamed from: g */
    private final /* synthetic */ zzcqf f18828g;

    BinderC6609en(zzcqf zzcqfVar, zzaao zzaaoVar) {
        this.f18828g = zzcqfVar;
        this.f18827f = zzaaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void onAdMetadataChanged() throws RemoteException {
        boolean z;
        zzaao zzaaoVar;
        z = this.f18828g.f24928o;
        if (!z || (zzaaoVar = this.f18827f) == null) {
            return;
        }
        zzaaoVar.onAdMetadataChanged();
    }
}
