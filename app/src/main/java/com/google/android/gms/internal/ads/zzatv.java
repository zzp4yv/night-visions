package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzatv extends zzfm implements zzatt {
    zzatv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: G5 */
    public final void mo16375G5(zzaao zzaaoVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzaaoVar);
        m19946k0(8, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: L5 */
    public final void mo16377L5(zzatw zzatwVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzatwVar);
        m19946k0(2, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: O6 */
    public final zzatq mo16378O6() throws RemoteException {
        zzatq zzatsVar;
        Parcel m19945P = m19945P(11, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzatsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzatsVar = queryLocalInterface instanceof zzatq ? (zzatq) queryLocalInterface : new zzats(readStrongBinder);
        }
        m19945P.recycle();
        return zzatsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: W1 */
    public final void mo16379W1(zzxz zzxzVar, zzaub zzaubVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzxzVar);
        zzfo.m19949c(m19944H, zzaubVar);
        m19946k0(1, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: e7 */
    public final void mo16380e7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19947a(m19944H, z);
        m19946k0(10, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: f5 */
    public final void mo16381f5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(5, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(m19945P, Bundle.CREATOR);
        m19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: m2 */
    public final void mo16382m2(zzaum zzaumVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzaumVar);
        m19946k0(7, m19944H);
    }
}
