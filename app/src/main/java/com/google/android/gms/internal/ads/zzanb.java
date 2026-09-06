package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzanb extends zzfn implements zzana {
    public zzanb() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                String mo16754g = mo16754g();
                parcel2.writeNoException();
                parcel2.writeString(mo16754g);
                return true;
            case 3:
                List mo16758k = mo16758k();
                parcel2.writeNoException();
                parcel2.writeList(mo16758k);
                return true;
            case 4:
                String mo16756i = mo16756i();
                parcel2.writeNoException();
                parcel2.writeString(mo16756i);
                return true;
            case 5:
                zzaei mo16759n = mo16759n();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16759n);
                return true;
            case 6:
                String mo16755h = mo16755h();
                parcel2.writeNoException();
                parcel2.writeString(mo16755h);
                return true;
            case 7:
                double mo16761t = mo16761t();
                parcel2.writeNoException();
                parcel2.writeDouble(mo16761t);
                return true;
            case 8:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 9:
                String mo16760o = mo16760o();
                parcel2.writeNoException();
                parcel2.writeString(mo16760o);
                return true;
            case 10:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 11:
                mo16752N(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                mo16747C0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean mo16746C = mo16746C();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16746C);
                return true;
            case 14:
                boolean mo16751M = mo16751M();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16751M);
                return true;
            case 15:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 16:
                mo16745A(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 18:
                IObjectWrapper mo16750K = mo16750K();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16750K);
                return true;
            case 19:
                zzaea mo16753f = mo16753f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16753f);
                return true;
            case 20:
                IObjectWrapper mo16749I = mo16749I();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16749I);
                return true;
            case 21:
                IObjectWrapper mo16757j = mo16757j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16757j);
                return true;
            case 22:
                mo16748D(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
