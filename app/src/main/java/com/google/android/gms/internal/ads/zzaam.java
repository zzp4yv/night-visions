package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaam extends zzfm implements zzaak {
    zzaam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    /* renamed from: Z1 */
    public final String mo16186Z1() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    public final String getDescription() throws RemoteException {
        Parcel m19945P = m19945P(1, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }
}
