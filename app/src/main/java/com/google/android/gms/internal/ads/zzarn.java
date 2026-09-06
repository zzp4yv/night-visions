package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzarn extends zzfn implements zzarm {
    public zzarn() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            zzarp zzarpVar = null;
            zzarr zzarrVar = null;
            zzarr zzarrVar2 = null;
            if (i2 == 2) {
                zzarg zzargVar = (zzarg) zzfo.m19948b(parcel, zzarg.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    zzarpVar = queryLocalInterface instanceof zzarp ? (zzarp) queryLocalInterface : new zzarq(readStrongBinder);
                }
                mo16893W5(zzargVar, zzarpVar);
                parcel2.writeNoException();
            } else if (i2 == 4) {
                zzarx zzarxVar = (zzarx) zzfo.m19948b(parcel, zzarx.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzarrVar2 = queryLocalInterface2 instanceof zzarr ? (zzarr) queryLocalInterface2 : new zzart(readStrongBinder2);
                }
                mo16892I5(zzarxVar, zzarrVar2);
                parcel2.writeNoException();
            } else {
                if (i2 != 5) {
                    return false;
                }
                zzarx zzarxVar2 = (zzarx) zzfo.m19948b(parcel, zzarx.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzarrVar = queryLocalInterface3 instanceof zzarr ? (zzarr) queryLocalInterface3 : new zzart(readStrongBinder3);
                }
                mo16894X6(zzarxVar2, zzarrVar);
                parcel2.writeNoException();
            }
        } else {
            zzari mo16895r6 = mo16895r6((zzarg) zzfo.m19948b(parcel, zzarg.CREATOR));
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, mo16895r6);
        }
        return true;
    }
}
