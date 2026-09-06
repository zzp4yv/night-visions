package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzatu extends zzfn implements zzatt {
    public zzatu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: h7 */
    public static zzatt m16944h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzatt ? (zzatt) queryLocalInterface : new zzatv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaub zzaubVar = null;
        zzaue zzaueVar = null;
        zzatw zzatwVar = null;
        switch (i2) {
            case 1:
                zzxz zzxzVar = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzaubVar = queryLocalInterface instanceof zzaub ? (zzaub) queryLocalInterface : new zzaud(readStrongBinder);
                }
                mo16379W1(zzxzVar, zzaubVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzatwVar = queryLocalInterface2 instanceof zzatw ? (zzatw) queryLocalInterface2 : new zzaty(readStrongBinder2);
                }
                mo16377L5(zzatwVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isLoaded = isLoaded();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, isLoaded);
                return true;
            case 4:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 5:
                mo16381f5(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzaueVar = queryLocalInterface3 instanceof zzaue ? (zzaue) queryLocalInterface3 : new zzauf(readStrongBinder3);
                }
                mo16376K2(zzaueVar);
                parcel2.writeNoException();
                return true;
            case 7:
                mo16382m2((zzaum) zzfo.m19948b(parcel, zzaum.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo16375G5(zzaap.m16189h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, adMetadata);
                return true;
            case 10:
                mo16380e7(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzatq mo16378O6 = mo16378O6();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16378O6);
                return true;
            default:
                return false;
        }
    }
}
