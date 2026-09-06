package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzajb extends zzfn implements zzaja {
    public zzajb() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzajc zzajdVar;
        if (i2 == 3) {
            zzaar videoController = getVideoController();
            parcel2.writeNoException();
            zzfo.m19949c(parcel2, videoController);
            return true;
        }
        if (i2 == 4) {
            destroy();
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 5) {
            return false;
        }
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzajdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            zzajdVar = queryLocalInterface instanceof zzajc ? (zzajc) queryLocalInterface : new zzajd(readStrongBinder);
        }
        mo16594m6(m14707P, zzajdVar);
        parcel2.writeNoException();
        return true;
    }
}
