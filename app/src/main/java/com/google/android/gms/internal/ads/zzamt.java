package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzamt extends zzfn implements zzams {
    public zzamt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzamv zzamvVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzyd zzydVar = (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR);
                zzxz zzxzVar = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamvVar = queryLocalInterface instanceof zzamv ? (zzamv) queryLocalInterface : new zzamx(readStrongBinder);
                }
                mo16716y2(m14707P, zzydVar, zzxzVar, readString, zzamvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper mo16714x1 = mo16714x1();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16714x1);
                return true;
            case 3:
                IObjectWrapper m14707P2 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar2 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamvVar = queryLocalInterface2 instanceof zzamv ? (zzamv) queryLocalInterface2 : new zzamx(readStrongBinder2);
                }
                mo16703Y2(m14707P2, zzxzVar2, readString2, zzamvVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper m14707P3 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzyd zzydVar2 = (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR);
                zzxz zzxzVar3 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamvVar = queryLocalInterface3 instanceof zzamv ? (zzamv) queryLocalInterface3 : new zzamx(readStrongBinder3);
                }
                mo16712s4(m14707P3, zzydVar2, zzxzVar3, readString3, readString4, zzamvVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper m14707P4 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar4 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamvVar = queryLocalInterface4 instanceof zzamv ? (zzamv) queryLocalInterface4 : new zzamx(readStrongBinder4);
                }
                mo16706c6(m14707P4, zzxzVar4, readString5, readString6, zzamvVar);
                parcel2.writeNoException();
                return true;
            case 8:
                pause();
                parcel2.writeNoException();
                return true;
            case 9:
                resume();
                parcel2.writeNoException();
                return true;
            case 10:
                mo16709h4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readString(), zzatl.m16941h7(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo16710o6((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean isInitialized = isInitialized();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, isInitialized);
                return true;
            case 14:
                IObjectWrapper m14707P5 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar5 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamvVar = queryLocalInterface5 instanceof zzamv ? (zzamv) queryLocalInterface5 : new zzamx(readStrongBinder5);
                }
                mo16700M3(m14707P5, zzxzVar5, readString7, readString8, zzamvVar, (zzady) zzfo.m19948b(parcel, zzady.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                zzana mo16705b7 = mo16705b7();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16705b7);
                return true;
            case 16:
                zzand mo16707e6 = mo16707e6();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16707e6);
                return true;
            case 17:
                Bundle zzsh = zzsh();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, zzsh);
                return true;
            case 18:
                Bundle interstitialAdapterInfo = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, interstitialAdapterInfo);
                return true;
            case 19:
                Bundle mo16711r4 = mo16711r4();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, mo16711r4);
                return true;
            case 20:
                mo16702Q2((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                mo16713w0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean mo16715x3 = mo16715x3();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16715x3);
                return true;
            case 23:
                mo16699H4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzatl.m16941h7(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzafe mo16697F2 = mo16697F2();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16697F2);
                return true;
            case 25:
                setImmersiveMode(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 27:
                zzang mo16701P1 = mo16701P1();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16701P1);
                return true;
            case 28:
                IObjectWrapper m14707P6 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                zzxz zzxzVar6 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzamvVar = queryLocalInterface6 instanceof zzamv ? (zzamv) queryLocalInterface6 : new zzamx(readStrongBinder6);
                }
                mo16708f2(m14707P6, zzxzVar6, readString9, zzamvVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                mo16704a4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                mo16698G4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzair.m16590h7(parcel.readStrongBinder()), parcel.createTypedArrayList(zzaiw.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
