package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzu extends zza implements zzs {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzs
    /* renamed from: a */
    public final int mo22561a() throws RemoteException {
        Parcel m21489P = m21489P(2, m21488H());
        int readInt = m21489P.readInt();
        m21489P.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.zzs
    /* renamed from: q4 */
    public final void mo22562q4(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        Parcel m21488H = m21488H();
        m21488H.writeString(str);
        m21488H.writeString(str2);
        zzb.m21493c(m21488H, bundle);
        m21488H.writeLong(j2);
        m21490k0(1, m21488H);
    }
}
