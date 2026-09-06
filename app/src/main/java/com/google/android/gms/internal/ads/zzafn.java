package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzafn extends zzfm implements zzafl {
    zzafn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    /* renamed from: t2 */
    public final void mo16516t2(zzafa zzafaVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzafaVar);
        m19946k0(1, m19944H);
    }
}
