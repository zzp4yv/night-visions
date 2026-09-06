package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaow extends zzfn implements zzaov {
    public zzaow() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: h7 */
    public static zzaov m16821h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzaov ? (zzaov) queryLocalInterface : new zzaox(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaoy zzapaVar;
        zzaoj zzaojVar = null;
        zzaop zzaorVar = null;
        zzaos zzaouVar = null;
        zzaom zzaooVar = null;
        if (i2 == 1) {
            IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzfo.m19948b(parcel, creator);
            Bundle bundle2 = (Bundle) zzfo.m19948b(parcel, creator);
            zzyd zzydVar = (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzapaVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzapaVar = queryLocalInterface instanceof zzaoy ? (zzaoy) queryLocalInterface : new zzapa(readStrongBinder);
            }
            mo16818u3(m14707P, readString, bundle, bundle2, zzydVar, zzapaVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzapj mo16812a6 = mo16812a6();
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, mo16812a6);
        } else if (i2 == 3) {
            zzapj mo16815i5 = mo16815i5();
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, mo16815i5);
        } else if (i2 == 5) {
            zzaar videoController = getVideoController();
            parcel2.writeNoException();
            zzfo.m19949c(parcel2, videoController);
        } else if (i2 == 10) {
            mo16817o3(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzxz zzxzVar = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper m14707P2 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzaojVar = queryLocalInterface2 instanceof zzaoj ? (zzaoj) queryLocalInterface2 : new zzaol(readStrongBinder2);
                    }
                    mo16810K4(readString2, readString3, zzxzVar, m14707P2, zzaojVar, zzamw.m16726h7(parcel.readStrongBinder()), (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzxz zzxzVar2 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper m14707P3 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzaooVar = queryLocalInterface3 instanceof zzaom ? (zzaom) queryLocalInterface3 : new zzaoo(readStrongBinder3);
                    }
                    mo16820y6(readString4, readString5, zzxzVar2, m14707P3, zzaooVar, zzamw.m16726h7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean mo16819x2 = mo16819x2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfo.m19947a(parcel2, mo16819x2);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzxz zzxzVar3 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper m14707P4 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzaouVar = queryLocalInterface4 instanceof zzaos ? (zzaos) queryLocalInterface4 : new zzaou(readStrongBinder4);
                    }
                    mo16814h5(readString6, readString7, zzxzVar3, m14707P4, zzaouVar, zzamw.m16726h7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean mo16811L2 = mo16811L2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfo.m19947a(parcel2, mo16811L2);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzxz zzxzVar4 = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                    IObjectWrapper m14707P5 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzaorVar = queryLocalInterface5 instanceof zzaop ? (zzaop) queryLocalInterface5 : new zzaor(readStrongBinder5);
                    }
                    mo16813g4(readString8, readString9, zzxzVar4, m14707P5, zzaorVar, zzamw.m16726h7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            mo16816j5(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
