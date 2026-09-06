package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzab extends zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    /* renamed from: H */
    protected final boolean mo14348H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.m20921a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.m20922b(parcel);
            mo14349O3(readInt, readStrongBinder, bundle);
        } else if (i2 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.zzc.m20921a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.m20922b(parcel);
            mo14351v2(readInt2, bundle2);
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.m20921a(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.m20922b(parcel);
            mo14350f4(readInt3, readStrongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
