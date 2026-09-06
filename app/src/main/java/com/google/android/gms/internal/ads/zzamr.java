package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzamr extends zzfm implements zzamp {
    zzamr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: N6 */
    public final boolean mo16692N6(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        Parcel m19945P = m19945P(2, m19944H);
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: P2 */
    public final zzaov mo16693P2(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        Parcel m19945P = m19945P(3, m19944H);
        zzaov m16821h7 = zzaow.m16821h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16821h7;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: l6 */
    public final zzams mo16695l6(String str) throws RemoteException {
        zzams zzamuVar;
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        Parcel m19945P = m19945P(1, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzamuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzamuVar = queryLocalInterface instanceof zzams ? (zzams) queryLocalInterface : new zzamu(readStrongBinder);
        }
        m19945P.recycle();
        return zzamuVar;
    }
}
