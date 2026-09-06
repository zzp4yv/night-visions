package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzagh extends zzfn implements zzagg {
    public zzagh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzagd zzagfVar;
        switch (i2) {
            case 2:
                String mo16543g = mo16543g();
                parcel2.writeNoException();
                parcel2.writeString(mo16543g);
                return true;
            case 3:
                List mo16548k = mo16548k();
                parcel2.writeNoException();
                parcel2.writeList(mo16548k);
                return true;
            case 4:
                String mo16545i = mo16545i();
                parcel2.writeNoException();
                parcel2.writeString(mo16545i);
                return true;
            case 5:
                zzaei mo16549n = mo16549n();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16549n);
                return true;
            case 6:
                String mo16544h = mo16544h();
                parcel2.writeNoException();
                parcel2.writeString(mo16544h);
                return true;
            case 7:
                String mo16556w = mo16556w();
                parcel2.writeNoException();
                parcel2.writeString(mo16556w);
                return true;
            case 8:
                double mo16553t = mo16553t();
                parcel2.writeNoException();
                parcel2.writeDouble(mo16553t);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String mo16551o = mo16551o();
                parcel2.writeNoException();
                parcel2.writeString(mo16551o);
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 12:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                zzaea mo16542f = mo16542f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16542f);
                return true;
            case 15:
                mo16557z((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean mo16536E = mo16536E((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16536E);
                return true;
            case 17:
                mo16538L((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper mo16552r = mo16552r();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16552r);
                return true;
            case 19:
                IObjectWrapper mo16546j = mo16546j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16546j);
                return true;
            case 20:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzagfVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzagfVar = queryLocalInterface instanceof zzagd ? (zzagd) queryLocalInterface : new zzagf(readStrongBinder);
                }
                mo16540d0(zzagfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                mo16539W();
                parcel2.writeNoException();
                return true;
            case 23:
                List mo16555u4 = mo16555u4();
                parcel2.writeNoException();
                parcel2.writeList(mo16555u4);
                return true;
            case 24:
                boolean mo16554u2 = mo16554u2();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16554u2);
                return true;
            case 25:
                mo16541e0(zzaal.m16187h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                mo16537G0(zzaah.m16185h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                mo16547j0();
                parcel2.writeNoException();
                return true;
            case 28:
                mo16535D6();
                parcel2.writeNoException();
                return true;
            case 29:
                zzaee mo16550n2 = mo16550n2();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16550n2);
                return true;
            default:
                return false;
        }
    }
}
