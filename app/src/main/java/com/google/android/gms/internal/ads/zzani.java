package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzani extends zzfm implements zzang {
    zzani(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: A */
    public final void mo16778A(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(22, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: C */
    public final boolean mo16779C() throws RemoteException {
        Parcel m19945P = m19945P(17, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: D */
    public final void mo16780D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, iObjectWrapper2);
        zzfo.m19949c(m19944H, iObjectWrapper3);
        m19946k0(21, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: I */
    public final IObjectWrapper mo16781I() throws RemoteException {
        Parcel m19945P = m19945P(14, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: K */
    public final IObjectWrapper mo16782K() throws RemoteException {
        Parcel m19945P = m19945P(13, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: M */
    public final boolean mo16783M() throws RemoteException {
        Parcel m19945P = m19945P(18, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: N */
    public final void mo16784N(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(20, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: X3 */
    public final float mo16785X3() throws RemoteException {
        Parcel m19945P = m19945P(23, m19944H());
        float readFloat = m19945P.readFloat();
        m19945P.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: f */
    public final zzaea mo16786f() throws RemoteException {
        Parcel m19945P = m19945P(12, m19944H());
        zzaea m16471h7 = zzaeb.m16471h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16471h7;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: g */
    public final String mo16787g() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final Bundle getExtras() throws RemoteException {
        Parcel m19945P = m19945P(16, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(m19945P, Bundle.CREATOR);
        m19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getStore() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaar getVideoController() throws RemoteException {
        Parcel m19945P = m19945P(11, m19944H());
        zzaar m16201h7 = zzaas.m16201h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: h */
    public final String mo16788h() throws RemoteException {
        Parcel m19945P = m19945P(6, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: i */
    public final String mo16789i() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: j */
    public final IObjectWrapper mo16790j() throws RemoteException {
        Parcel m19945P = m19945P(15, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: k */
    public final List mo16791k() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        ArrayList m19952f = zzfo.m19952f(m19945P);
        m19945P.recycle();
        return m19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: n */
    public final zzaei mo16792n() throws RemoteException {
        Parcel m19945P = m19945P(5, m19944H());
        zzaei m16473h7 = zzaej.m16473h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16473h7;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: o */
    public final String mo16793o() throws RemoteException {
        Parcel m19945P = m19945P(10, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void recordImpression() throws RemoteException {
        m19946k0(19, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: t */
    public final double mo16794t() throws RemoteException {
        Parcel m19945P = m19945P(8, m19944H());
        double readDouble = m19945P.readDouble();
        m19945P.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: w */
    public final String mo16795w() throws RemoteException {
        Parcel m19945P = m19945P(7, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }
}
