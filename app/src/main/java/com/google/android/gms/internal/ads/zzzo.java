package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzo extends zzfm implements zzzn {
    zzzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    /* renamed from: o5 */
    public final IBinder mo20856o5(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2, int i3) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzydVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzampVar);
        m19944H.writeInt(i2);
        m19944H.writeInt(i3);
        Parcel m19945P = m19945P(2, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        m19945P.recycle();
        return readStrongBinder;
    }
}
