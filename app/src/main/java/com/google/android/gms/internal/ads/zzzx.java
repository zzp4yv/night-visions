package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzx extends zzfm implements zzzv {
    zzzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zza(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzydVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzampVar);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(1, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzzmVar = queryLocalInterface instanceof zzzk ? (zzzk) queryLocalInterface : new zzzm(readStrongBinder);
        }
        m19945P.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zzb(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzydVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzampVar);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(2, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzzmVar = queryLocalInterface instanceof zzzk ? (zzzk) queryLocalInterface : new zzzm(readStrongBinder);
        }
        m19945P.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaem zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, iObjectWrapper2);
        Parcel m19945P = m19945P(5, m19944H);
        zzaem m16474h7 = zzaen.m16474h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16474h7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaqg zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        Parcel m19945P = m19945P(8, m19944H);
        zzaqg zzac = zzaqh.zzac(m19945P.readStrongBinder());
        m19945P.recycle();
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzf zza(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzf zzzhVar;
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzampVar);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(3, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzzhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzzf) {
                zzzhVar = (zzzf) queryLocalInterface;
            } else {
                zzzhVar = new zzzh(readStrongBinder);
            }
        }
        m19945P.recycle();
        return zzzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzatt zzb(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzampVar);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(12, m19944H);
        zzatt m16944h7 = zzatu.m16944h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16944h7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzasw zza(IObjectWrapper iObjectWrapper, zzamp zzampVar, int i2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, zzampVar);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(6, m19944H);
        zzasw m16929h7 = zzasx.m16929h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16929h7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaab zza(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzaab zzaadVar;
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(9, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzaadVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzaab) {
                zzaadVar = (zzaab) queryLocalInterface;
            } else {
                zzaadVar = new zzaad(readStrongBinder);
            }
        }
        m19945P.recycle();
        return zzaadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zza(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzydVar);
        m19944H.writeString(str);
        m19944H.writeInt(i2);
        Parcel m19945P = m19945P(10, m19944H);
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzzk) {
                zzzmVar = (zzzk) queryLocalInterface;
            } else {
                zzzmVar = new zzzm(readStrongBinder);
            }
        }
        m19945P.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaer zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, iObjectWrapper2);
        zzfo.m19949c(m19944H, iObjectWrapper3);
        Parcel m19945P = m19945P(11, m19944H);
        zzaer m16476h7 = zzaes.m16476h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16476h7;
    }
}
