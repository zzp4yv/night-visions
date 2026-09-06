package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzvz extends zzfm implements zzvy {
    zzvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    /* renamed from: F4 */
    public final zzvs mo20681F4(zzvv zzvvVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzvvVar);
        Parcel m19945P = m19945P(1, m19944H);
        zzvs zzvsVar = (zzvs) zzfo.m19948b(m19945P, zzvs.CREATOR);
        m19945P.recycle();
        return zzvsVar;
    }
}
