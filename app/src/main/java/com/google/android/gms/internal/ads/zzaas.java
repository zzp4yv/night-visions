package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaas extends zzfn implements zzaar {
    public zzaas() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: h7 */
    public static zzaar m16201h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzaar ? (zzaar) queryLocalInterface : new zzaat(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaau zzaawVar;
        switch (i2) {
            case 1:
                mo16198k5();
                parcel2.writeNoException();
                return true;
            case 2:
                pause();
                parcel2.writeNoException();
                return true;
            case 3:
                mo16200o2(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean mo16191G1 = mo16191G1();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16191G1);
                return true;
            case 5:
                int mo16190F = mo16190F();
                parcel2.writeNoException();
                parcel2.writeInt(mo16190F);
                return true;
            case 6:
                float mo16192Q6 = mo16192Q6();
                parcel2.writeNoException();
                parcel2.writeFloat(mo16192Q6);
                return true;
            case 7:
                float mo16194S5 = mo16194S5();
                parcel2.writeNoException();
                parcel2.writeFloat(mo16194S5);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaawVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzaawVar = queryLocalInterface instanceof zzaau ? (zzaau) queryLocalInterface : new zzaaw(readStrongBinder);
                }
                mo16193R1(zzaawVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float mo16195T = mo16195T();
                parcel2.writeNoException();
                parcel2.writeFloat(mo16195T);
                return true;
            case 10:
                boolean mo16199l5 = mo16199l5();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16199l5);
                return true;
            case 11:
                zzaau mo16196a5 = mo16196a5();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16196a5);
                return true;
            case 12:
                boolean mo16197d1 = mo16197d1();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16197d1);
                return true;
            default:
                return false;
        }
    }
}
