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
public final class zzagi extends zzfm implements zzagg {
    zzagi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: D6 */
    public final void mo16535D6() throws RemoteException {
        m19946k0(28, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: E */
    public final boolean mo16536E(Bundle bundle) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, bundle);
        Parcel m19945P = m19945P(16, m19944H);
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: G0 */
    public final void mo16537G0(zzaag zzaagVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzaagVar);
        m19946k0(26, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: L */
    public final void mo16538L(Bundle bundle) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, bundle);
        m19946k0(17, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: W */
    public final void mo16539W() throws RemoteException {
        m19946k0(22, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: d0 */
    public final void mo16540d0(zzagd zzagdVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzagdVar);
        m19946k0(21, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void destroy() throws RemoteException {
        m19946k0(13, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: e0 */
    public final void mo16541e0(zzaak zzaakVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzaakVar);
        m19946k0(25, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: f */
    public final zzaea mo16542f() throws RemoteException {
        zzaea zzaecVar;
        Parcel m19945P = m19945P(14, m19944H());
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

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: g */
    public final String mo16543g() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final Bundle getExtras() throws RemoteException {
        Parcel m19945P = m19945P(20, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(m19945P, Bundle.CREATOR);
        m19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel m19945P = m19945P(12, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getStore() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaar getVideoController() throws RemoteException {
        Parcel m19945P = m19945P(11, m19944H());
        zzaar m16201h7 = zzaas.m16201h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: h */
    public final String mo16544h() throws RemoteException {
        Parcel m19945P = m19945P(6, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: i */
    public final String mo16545i() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: j */
    public final IObjectWrapper mo16546j() throws RemoteException {
        Parcel m19945P = m19945P(19, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: j0 */
    public final void mo16547j0() throws RemoteException {
        m19946k0(27, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: k */
    public final List mo16548k() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        ArrayList m19952f = zzfo.m19952f(m19945P);
        m19945P.recycle();
        return m19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: n */
    public final zzaei mo16549n() throws RemoteException {
        zzaei zzaekVar;
        Parcel m19945P = m19945P(5, m19944H());
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

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: n2 */
    public final zzaee mo16550n2() throws RemoteException {
        zzaee zzaegVar;
        Parcel m19945P = m19945P(29, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzaegVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzaegVar = queryLocalInterface instanceof zzaee ? (zzaee) queryLocalInterface : new zzaeg(readStrongBinder);
        }
        m19945P.recycle();
        return zzaegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: o */
    public final String mo16551o() throws RemoteException {
        Parcel m19945P = m19945P(10, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: r */
    public final IObjectWrapper mo16552r() throws RemoteException {
        Parcel m19945P = m19945P(18, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: t */
    public final double mo16553t() throws RemoteException {
        Parcel m19945P = m19945P(8, m19944H());
        double readDouble = m19945P.readDouble();
        m19945P.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: u2 */
    public final boolean mo16554u2() throws RemoteException {
        Parcel m19945P = m19945P(24, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: u4 */
    public final List mo16555u4() throws RemoteException {
        Parcel m19945P = m19945P(23, m19944H());
        ArrayList m19952f = zzfo.m19952f(m19945P);
        m19945P.recycle();
        return m19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: w */
    public final String mo16556w() throws RemoteException {
        Parcel m19945P = m19945P(7, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: z */
    public final void mo16557z(Bundle bundle) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, bundle);
        m19946k0(15, m19944H);
    }
}
