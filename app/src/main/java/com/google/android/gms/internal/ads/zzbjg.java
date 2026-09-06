package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzbjg extends zzfn implements zzbjf {
    public zzbjg() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                mo16682e1((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle mo16687s2 = mo16687s2((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, mo16687s2);
                return true;
            case 3:
                mo16685m0(parcel.readString(), parcel.readString(), (Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo16676N5(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map mo16681d4 = mo16681d4(parcel.readString(), parcel.readString(), zzfo.m19951e(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(mo16681d4);
                return true;
            case 6:
                int mo16673I3 = mo16673I3(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo16673I3);
                return true;
            case 7:
                mo16679Q4((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List mo16675L4 = mo16675L4(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(mo16675L4);
                return true;
            case 10:
                String mo16683g2 = mo16683g2();
                parcel2.writeNoException();
                parcel2.writeString(mo16683g2);
                return true;
            case 11:
                String mo16686o4 = mo16686o4();
                parcel2.writeNoException();
                parcel2.writeString(mo16686o4);
                return true;
            case 12:
                long mo16672E2 = mo16672E2();
                parcel2.writeNoException();
                parcel2.writeLong(mo16672E2);
                return true;
            case 13:
                mo16678O5(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                mo16680V6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo16688z4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String mo16674J2 = mo16674J2();
                parcel2.writeNoException();
                parcel2.writeString(mo16674J2);
                return true;
            case 17:
                String mo16677O4 = mo16677O4();
                parcel2.writeNoException();
                parcel2.writeString(mo16677O4);
                return true;
            case 18:
                String mo16684l4 = mo16684l4();
                parcel2.writeNoException();
                parcel2.writeString(mo16684l4);
                return true;
            default:
                return false;
        }
    }
}
