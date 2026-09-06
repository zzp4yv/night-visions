package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzajg extends zzfm implements zzaje {
    zzajg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    /* renamed from: g6 */
    public final void mo16597g6(zzaja zzajaVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzajaVar);
        m19946k0(1, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaje
    /* renamed from: h3 */
    public final void mo16598h3(int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeInt(i2);
        m19946k0(2, m19944H);
    }
}
