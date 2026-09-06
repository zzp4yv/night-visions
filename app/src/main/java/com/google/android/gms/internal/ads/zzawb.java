package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzawb extends zzfn implements zzawa {
    public zzawb() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzavy zzavzVar;
        if (i2 != 1) {
            return false;
        }
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
        zzawc zzawcVar = (zzawc) zzfo.m19948b(parcel, zzawc.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzavzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
            zzavzVar = queryLocalInterface instanceof zzavy ? (zzavy) queryLocalInterface : new zzavz(readStrongBinder);
        }
        mo17024m5(m14707P, zzawcVar, zzavzVar);
        parcel2.writeNoException();
        return true;
    }
}
