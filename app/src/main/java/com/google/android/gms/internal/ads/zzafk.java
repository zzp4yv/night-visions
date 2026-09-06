package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzafk extends zzfm implements zzafi {
    zzafk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    /* renamed from: D3 */
    public final void mo16514D3(zzaew zzaewVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzaewVar);
        m19946k0(1, m19944H);
    }
}
