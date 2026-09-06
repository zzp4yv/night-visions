package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: P */
    public static zzz m14518P(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzx(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    /* renamed from: H */
    protected final boolean mo14348H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper mo14277d = mo14277d();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.m20926f(parcel2, mo14277d);
        } else {
            if (i2 != 2) {
                return false;
            }
            int mo14276c = mo14276c();
            parcel2.writeNoException();
            parcel2.writeInt(mo14276c);
        }
        return true;
    }
}
