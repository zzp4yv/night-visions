package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzavz extends zzfm implements zzavy {
    zzavz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    /* renamed from: T6 */
    public final void mo17022T6(String str, String str2) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        m19944H.writeString(str2);
        m19946k0(1, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void onError(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        m19946k0(2, m19944H);
    }
}
