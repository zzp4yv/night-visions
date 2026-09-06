package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaeb extends zzfn implements zzaea {
    public zzaeb() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: h7 */
    public static zzaea m16471h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzaea ? (zzaea) queryLocalInterface : new zzaec(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            String mo16464m1 = mo16464m1();
            parcel2.writeNoException();
            parcel2.writeString(mo16464m1);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        List<zzaei> mo16459M0 = mo16459M0();
        parcel2.writeNoException();
        parcel2.writeList(mo16459M0);
        return true;
    }
}
