package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaeq extends zzfm implements zzaep {
    zzaeq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    /* renamed from: t3 */
    public final IBinder mo16475t3(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, iObjectWrapper2);
        zzfo.m19949c(m19944H, iObjectWrapper3);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(1, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        m19945P.recycle();
        return readStrongBinder;
    }
}
