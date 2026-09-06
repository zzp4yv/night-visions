package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes2.dex */
public final class zzzh extends zzfm implements zzzf {
    zzzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: D5 */
    public final void mo16328D5(String str, zzafr zzafrVar, zzafo zzafoVar) throws RemoteException {
        Parcel m19944H = m19944H();
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzafrVar);
        zzfo.m19949c(m19944H, zzafoVar);
        m19946k0(5, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: G3 */
    public final void mo16329G3(zzafi zzafiVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzafiVar);
        m19946k0(3, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: J1 */
    public final zzzc mo16330J1() throws RemoteException {
        zzzc zzzeVar;
        Parcel m19945P = m19945P(1, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzzeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzzeVar = queryLocalInterface instanceof zzzc ? (zzzc) queryLocalInterface : new zzze(readStrongBinder);
        }
        m19945P.recycle();
        return zzzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: X1 */
    public final void mo16333X1(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, publisherAdViewOptions);
        m19946k0(9, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: Z3 */
    public final void mo16334Z3(zzafx zzafxVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzafxVar);
        m19946k0(10, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: e2 */
    public final void mo16335e2(zzyz zzyzVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzyzVar);
        m19946k0(2, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: i1 */
    public final void mo16336i1(zzafu zzafuVar, zzyd zzydVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzafuVar);
        zzfo.m19950d(m19944H, zzydVar);
        m19946k0(8, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: k6 */
    public final void mo16337k6(zzady zzadyVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzadyVar);
        m19946k0(6, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: q5 */
    public final void mo16338q5(zzzy zzzyVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzzyVar);
        m19946k0(7, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: y1 */
    public final void mo16339y1(zzafl zzaflVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, zzaflVar);
        m19946k0(4, m19944H);
    }
}
