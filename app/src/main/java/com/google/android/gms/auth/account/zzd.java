package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements zzc {
    /* renamed from: P */
    public static zzc m13604P(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zze(iBinder);
    }
}
