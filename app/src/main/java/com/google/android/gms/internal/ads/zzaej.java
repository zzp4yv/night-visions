package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaej extends zzfn implements zzaei {
    public zzaej() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: h7 */
    public static zzaei m16473h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzaei ? (zzaei) queryLocalInterface : new zzaek(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper mo16470t4 = mo16470t4();
            parcel2.writeNoException();
            zzfo.m19949c(parcel2, mo16470t4);
        } else if (i2 == 2) {
            Uri mo16468I0 = mo16468I0();
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, mo16468I0);
        } else if (i2 == 3) {
            double mo16469T3 = mo16469T3();
            parcel2.writeNoException();
            parcel2.writeDouble(mo16469T3);
        } else if (i2 == 4) {
            int width = getWidth();
            parcel2.writeNoException();
            parcel2.writeInt(width);
        } else {
            if (i2 != 5) {
                return false;
            }
            int height = getHeight();
            parcel2.writeNoException();
            parcel2.writeInt(height);
        }
        return true;
    }
}
