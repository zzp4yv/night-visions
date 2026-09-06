package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaad extends zzfm implements zzaab {
    zzaad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: B2 */
    public final void mo16171B2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(6, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: C4 */
    public final float mo16172C4() throws RemoteException {
        Parcel m19945P = m19945P(7, m19944H());
        float readFloat = m19945P.readFloat();
        m19945P.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: H3 */
    public final String mo16173H3() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: J3 */
    public final boolean mo16174J3() throws RemoteException {
        Parcel m19945P = m19945P(8, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: N2 */
    public final void mo16175N2(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        m19946k0(10, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: O0 */
    public final void mo16176O0(zzamp zzampVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzampVar);
        m19946k0(11, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: a */
    public final void mo16179a() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: c2 */
    public final void mo16180c2(boolean z) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19947a(m19944H, z);
        m19946k0(4, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: t6 */
    public final void mo16182t6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19944H.writeString(str);
        m19946k0(5, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: v5 */
    public final void mo16183v5(float f2) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeFloat(f2);
        m19946k0(2, m19944H);
    }
}
