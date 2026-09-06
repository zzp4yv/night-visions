package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzf extends zza implements zzd {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzd
    /* renamed from: J */
    public final Bundle mo22129J(Bundle bundle) throws RemoteException {
        Parcel m21488H = m21488H();
        zzb.m21493c(m21488H, bundle);
        Parcel m21489P = m21489P(1, m21488H);
        Bundle bundle2 = (Bundle) zzb.m21491a(m21489P, Bundle.CREATOR);
        m21489P.recycle();
        return bundle2;
    }
}
