package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdaj extends zzfm implements zzdah {
    zzdaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: H0 */
    public final String mo19139H0() throws RemoteException {
        Parcel m19945P = m19945P(6, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: H1 */
    public final boolean mo19140H1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        Parcel m19945P = m19945P(2, m19944H);
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: a7 */
    public final void mo19141a7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(7, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: d3 */
    public final IObjectWrapper mo19142d3(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19944H.writeString(str2);
        m19944H.writeString(str3);
        m19944H.writeString(str4);
        m19944H.writeString(str5);
        Parcel m19945P = m19945P(9, m19944H);
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: p1 */
    public final void mo19143p1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, iObjectWrapper2);
        m19946k0(5, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: w6 */
    public final void mo19144w6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(4, m19944H);
    }
}
