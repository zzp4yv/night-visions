package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzbji extends zzfn implements zzbjh {
    /* renamed from: h7 */
    public static zzbjh m17774h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzbjh ? (zzbjh) queryLocalInterface : new zzbjj(iBinder);
    }
}
