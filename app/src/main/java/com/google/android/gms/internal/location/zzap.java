package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzap extends zza implements zzao {
    zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzao
    /* renamed from: A3 */
    public final void mo20955A3(zzo zzoVar) throws RemoteException {
        Parcel m20948H = m20948H();
        zzc.m20966b(m20948H, zzoVar);
        m20949P(75, m20948H);
    }

    @Override // com.google.android.gms.internal.location.zzao
    /* renamed from: B0 */
    public final void mo20956B0(boolean z) throws RemoteException {
        Parcel m20948H = m20948H();
        zzc.m20967c(m20948H, z);
        m20949P(12, m20948H);
    }

    @Override // com.google.android.gms.internal.location.zzao
    /* renamed from: B5 */
    public final void mo20957B5(zzbf zzbfVar) throws RemoteException {
        Parcel m20948H = m20948H();
        zzc.m20966b(m20948H, zzbfVar);
        m20949P(59, m20948H);
    }
}
