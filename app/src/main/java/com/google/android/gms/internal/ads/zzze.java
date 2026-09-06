package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzze extends zzfm implements zzzc {
    zzze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: F5 */
    public final void mo15083F5(zzxz zzxzVar, int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeInt(i2);
        m19946k0(5, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: c0 */
    public final String mo15084c0() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: j2 */
    public final void mo15085j2(zzxz zzxzVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzxzVar);
        m19946k0(1, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: p0 */
    public final boolean mo15086p0() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }
}
