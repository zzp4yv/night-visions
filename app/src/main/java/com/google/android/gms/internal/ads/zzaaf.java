package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaaf extends zzfm implements zzaae {
    zzaaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    /* renamed from: C6 */
    public final IBinder mo16184C6(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(1, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        m19945P.recycle();
        return readStrongBinder;
    }
}
