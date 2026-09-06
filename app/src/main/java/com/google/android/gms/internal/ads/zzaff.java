package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaff extends zzfn implements zzafe {
    public zzaff() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: h7 */
    public static zzafe m16511h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzafe ? (zzafe) queryLocalInterface : new zzafg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                String mo16509Y0 = mo16509Y0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(mo16509Y0);
                return true;
            case 2:
                zzaei mo16507N1 = mo16507N1(parcel.readString());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16507N1);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                String customTemplateId = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(customTemplateId);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper mo16508U4 = mo16508U4();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16508U4);
                return true;
            case 10:
                boolean mo16506F3 = mo16506F3(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, mo16506F3);
                return true;
            case 11:
                IObjectWrapper mo16510r = mo16510r();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, mo16510r);
                return true;
            default:
                return false;
        }
    }
}
