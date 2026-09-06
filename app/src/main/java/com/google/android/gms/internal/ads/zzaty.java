package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaty extends zzfm implements zzatw {
    zzaty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: S1 */
    public final void mo16945S1() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: o1 */
    public final void mo16946o1() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: p6 */
    public final void mo16947p6(int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeInt(i2);
        m19946k0(4, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: v0 */
    public final void mo16948v0(zzatq zzatqVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzatqVar);
        m19946k0(3, m19944H);
    }
}
