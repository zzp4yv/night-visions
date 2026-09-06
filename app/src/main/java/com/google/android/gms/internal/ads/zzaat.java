package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaat extends zzfm implements zzaar {
    zzaat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: F */
    public final int mo16190F() throws RemoteException {
        Parcel m19945P = m19945P(5, m19944H());
        int readInt = m19945P.readInt();
        m19945P.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: G1 */
    public final boolean mo16191G1() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: R1 */
    public final void mo16193R1(zzaau zzaauVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzaauVar);
        m19946k0(8, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: T */
    public final float mo16195T() throws RemoteException {
        Parcel m19945P = m19945P(9, m19944H());
        float readFloat = m19945P.readFloat();
        m19945P.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: a5 */
    public final zzaau mo16196a5() throws RemoteException {
        zzaau zzaawVar;
        Parcel m19945P = m19945P(11, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzaawVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzaawVar = queryLocalInterface instanceof zzaau ? (zzaau) queryLocalInterface : new zzaaw(readStrongBinder);
        }
        m19945P.recycle();
        return zzaawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: d1 */
    public final boolean mo16197d1() throws RemoteException {
        Parcel m19945P = m19945P(12, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: k5 */
    public final void mo16198k5() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: l5 */
    public final boolean mo16199l5() throws RemoteException {
        Parcel m19945P = m19945P(10, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: o2 */
    public final void mo16200o2(boolean z) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19947a(m19944H, z);
        m19946k0(3, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void pause() throws RemoteException {
        m19946k0(2, m19944H());
    }
}
