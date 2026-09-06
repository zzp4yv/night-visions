package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    /* renamed from: c */
    public final boolean mo20863c() throws RemoteException {
        Parcel m20860P = m20860P(6, m20859H());
        boolean m20862b = zzc.m20862b(m20860P);
        m20860P.recycle();
        return m20862b;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    /* renamed from: g0 */
    public final boolean mo20864g0(boolean z) throws RemoteException {
        Parcel m20859H = m20859H();
        zzc.m20861a(m20859H, true);
        Parcel m20860P = m20860P(2, m20859H);
        boolean m20862b = zzc.m20862b(m20860P);
        m20860P.recycle();
        return m20862b;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final String getId() throws RemoteException {
        Parcel m20860P = m20860P(1, m20859H());
        String readString = m20860P.readString();
        m20860P.recycle();
        return readString;
    }
}
