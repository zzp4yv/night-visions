package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzane extends zzfn implements zzand {
    public zzane() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                String mo16772g = mo16772g();
                parcel2.writeNoException();
                parcel2.writeString(mo16772g);
                return true;
            case 3:
                List mo16776k = mo16776k();
                parcel2.writeNoException();
                parcel2.writeList(mo16776k);
                return true;
            case 4:
                String mo16774i = mo16774i();
                parcel2.writeNoException();
                parcel2.writeString(mo16774i);
                return true;
            case 5:
                zzaei mo16766D0 = mo16766D0();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16766D0);
                return true;
            case 6:
                String mo16773h = mo16773h();
                parcel2.writeNoException();
                parcel2.writeString(mo16773h);
                return true;
            case 7:
                String mo16777w = mo16777w();
                parcel2.writeNoException();
                parcel2.writeString(mo16777w);
                return true;
            case 8:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                mo16770N(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                mo16764C0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean mo16763C = mo16763C();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16763C);
                return true;
            case 12:
                boolean mo16769M = mo16769M();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16769M);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 14:
                mo16762A(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper mo16768K = mo16768K();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16768K);
                return true;
            case 16:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                zzaea mo16771f = mo16771f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16771f);
                return true;
            case 20:
                IObjectWrapper mo16767I = mo16767I();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16767I);
                return true;
            case 21:
                IObjectWrapper mo16775j = mo16775j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16775j);
                return true;
            case 22:
                mo16765D(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
