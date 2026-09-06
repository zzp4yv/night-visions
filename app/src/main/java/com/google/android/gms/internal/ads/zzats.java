package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzats extends zzfm implements zzatq {
    zzats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final int getAmount() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        int readInt = m19945P.readInt();
        m19945P.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final String getType() throws RemoteException {
        Parcel m19945P = m19945P(1, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }
}
