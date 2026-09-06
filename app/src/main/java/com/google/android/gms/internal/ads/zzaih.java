package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaih extends zzfm implements zzaig {
    zzaih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    /* renamed from: b3 */
    public final void mo16585b3(zzaia zzaiaVar, zzaie zzaieVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzaiaVar);
        zzfo.m19949c(m19944H, zzaieVar);
        m19943E0(2, m19944H);
    }
}
