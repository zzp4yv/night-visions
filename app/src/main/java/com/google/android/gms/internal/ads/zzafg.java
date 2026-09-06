package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafg extends zzfm implements zzafe {
    zzafg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: F3 */
    public final boolean mo16506F3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        Parcel m19945P = m19945P(10, m19944H);
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: N1 */
    public final zzaei mo16507N1(String str) throws RemoteException {
        zzaei zzaekVar;
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        Parcel m19945P = m19945P(2, m19944H);
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

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: U4 */
    public final IObjectWrapper mo16508U4() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: Y0 */
    public final String mo16509Y0(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        Parcel m19945P = m19945P(1, m19944H);
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void destroy() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        ArrayList<String> createStringArrayList = m19945P.createStringArrayList();
        m19945P.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String getCustomTemplateId() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        String readString = m19945P.readString();
        m19945P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaar getVideoController() throws RemoteException {
        Parcel m19945P = m19945P(7, m19944H());
        zzaar m16201h7 = zzaas.m16201h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void performClick(String str) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        m19946k0(5, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void recordImpression() throws RemoteException {
        m19946k0(6, m19944H());
    }
}
