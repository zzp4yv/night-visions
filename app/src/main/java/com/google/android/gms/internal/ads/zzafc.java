package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafc extends zzfm implements zzafa {
    zzafc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: D0 */
    public final zzaei mo16493D0() throws RemoteException {
        zzaei zzaekVar;
        Parcel m19945P = m19945P(6, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzaekVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzaekVar = queryLocalInterface instanceof zzaei ? (zzaei) queryLocalInterface : new zzaek(readStrongBinder);
        }
        m19945P.recycle();
        return zzaekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: E */
    public final boolean mo16494E(Bundle bundle) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, bundle);
        Parcel m19945P = m19945P(13, m19944H);
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: L */
    public final void mo16495L(Bundle bundle) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, bundle);
        m19946k0(14, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void destroy() throws RemoteException {
        m19946k0(10, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: f */
    public final zzaea mo16496f() throws RemoteException {
        zzaea zzaecVar;
        Parcel m19945P = m19945P(15, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzaecVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzaecVar = queryLocalInterface instanceof zzaea ? (zzaea) queryLocalInterface : new zzaec(readStrongBinder);
        }
        m19945P.recycle();
        return zzaecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: g */
    public final String mo16497g() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final Bundle getExtras() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(m19945P, Bundle.CREATOR);
        m19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel m19945P = m19945P(17, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaar getVideoController() throws RemoteException {
        Parcel m19945P = m19945P(11, m19944H());
        zzaar m16201h7 = zzaas.m16201h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: h */
    public final String mo16498h() throws RemoteException {
        Parcel m19945P = m19945P(7, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: i */
    public final String mo16499i() throws RemoteException {
        Parcel m19945P = m19945P(5, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: k */
    public final List mo16501k() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        ArrayList m19952f = zzfo.m19952f(m19945P);
        m19945P.recycle();
        return m19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: r */
    public final IObjectWrapper mo16502r() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: w */
    public final String mo16503w() throws RemoteException {
        Parcel m19945P = m19945P(8, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: z */
    public final void mo16504z(Bundle bundle) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, bundle);
        m19946k0(12, m19944H);
    }
}
