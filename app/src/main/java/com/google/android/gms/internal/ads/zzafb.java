package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzafb extends zzfn implements zzafa {
    public zzafb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                IObjectWrapper mo16502r = mo16502r();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16502r);
                return true;
            case 3:
                String mo16497g = mo16497g();
                parcel2.writeNoException();
                parcel2.writeString(mo16497g);
                return true;
            case 4:
                List mo16501k = mo16501k();
                parcel2.writeNoException();
                parcel2.writeList(mo16501k);
                return true;
            case 5:
                String mo16499i = mo16499i();
                parcel2.writeNoException();
                parcel2.writeString(mo16499i);
                return true;
            case 6:
                zzaei mo16493D0 = mo16493D0();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16493D0);
                return true;
            case 7:
                String mo16498h = mo16498h();
                parcel2.writeNoException();
                parcel2.writeString(mo16498h);
                return true;
            case 8:
                String mo16503w = mo16503w();
                parcel2.writeNoException();
                parcel2.writeString(mo16503w);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 12:
                mo16504z((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean mo16494E = mo16494E((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16494E);
                return true;
            case 14:
                mo16495L((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzaea mo16496f = mo16496f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16496f);
                return true;
            case 16:
                IObjectWrapper mo16500j = mo16500j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16500j);
                return true;
            case 17:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
