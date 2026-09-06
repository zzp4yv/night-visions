package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaek extends zzfm implements zzaei {
    zzaek(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    /* renamed from: I0 */
    public final Uri mo16468I0() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        Uri uri = (Uri) zzfo.m19948b(m19945P, Uri.CREATOR);
        m19945P.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    /* renamed from: T3 */
    public final double mo16469T3() throws RemoteException {
        Parcel m19945P = m19945P(3, m19944H());
        double readDouble = m19945P.readDouble();
        m19945P.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getHeight() throws RemoteException {
        Parcel m19945P = m19945P(5, m19944H());
        int readInt = m19945P.readInt();
        m19945P.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getWidth() throws RemoteException {
        Parcel m19945P = m19945P(4, m19944H());
        int readInt = m19945P.readInt();
        m19945P.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    /* renamed from: t4 */
    public final IObjectWrapper mo16470t4() throws RemoteException {
        Parcel m19945P = m19945P(1, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }
}
