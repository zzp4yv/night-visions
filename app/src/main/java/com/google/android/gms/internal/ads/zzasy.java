package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzasy extends zzfm implements zzasw {
    zzasy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: M6 */
    public final void mo16384M6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(9, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T5 */
    public final void mo16386T5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(10, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: d2 */
    public final void mo16387d2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(11, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel m19945P = m19945P(15, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(m19945P, Bundle.CREATOR);
        m19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel m19945P = m19945P(12, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: h0 */
    public final void mo16389h0(zzatb zzatbVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzatbVar);
        m19946k0(3, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: i4 */
    public final void mo16390i4(zzath zzathVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzathVar);
        m19946k0(1, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        Parcel m19945P = m19945P(5, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setCustomData(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        m19946k0(19, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19947a(m19944H, z);
        m19946k0(34, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setUserId(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        m19946k0(13, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void show() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: z0 */
    public final void mo16392z0(zzzp zzzpVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzzpVar);
        m19946k0(14, m19944H);
    }
}
