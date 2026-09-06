package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zza;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzen extends zza implements zzel {
    zzen(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: A2 */
    public final List<zzv> mo23079A2(String str, String str2, zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        m21488H.writeString(str);
        m21488H.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        Parcel m21489P = m21489P(16, m21488H);
        ArrayList createTypedArrayList = m21489P.createTypedArrayList(zzv.CREATOR);
        m21489P.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: K1 */
    public final List<zzkj> mo23081K1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel m21488H = m21488H();
        m21488H.writeString(str);
        m21488H.writeString(str2);
        m21488H.writeString(str3);
        com.google.android.gms.internal.measurement.zzb.m21494d(m21488H, z);
        Parcel m21489P = m21489P(15, m21488H);
        ArrayList createTypedArrayList = m21489P.createTypedArrayList(zzkj.CREATOR);
        m21489P.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: P4 */
    public final String mo23082P4(zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        Parcel m21489P = m21489P(11, m21488H);
        String readString = m21489P.readString();
        m21489P.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: R6 */
    public final void mo23083R6(zzv zzvVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzvVar);
        m21490k0(13, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: T1 */
    public final byte[] mo23084T1(zzan zzanVar, String str) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzanVar);
        m21488H.writeString(str);
        Parcel m21489P = m21489P(9, m21488H);
        byte[] createByteArray = m21489P.createByteArray();
        m21489P.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: U3 */
    public final void mo23085U3(zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        m21490k0(6, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: Z5 */
    public final void mo23086Z5(zzan zzanVar, zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzanVar);
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        m21490k0(1, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: b4 */
    public final void mo23087b4(zzkj zzkjVar, zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzkjVar);
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        m21490k0(2, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: f3 */
    public final List<zzkj> mo23088f3(String str, String str2, boolean z, zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        m21488H.writeString(str);
        m21488H.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.m21494d(m21488H, z);
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        Parcel m21489P = m21489P(14, m21488H);
        ArrayList createTypedArrayList = m21489P.createTypedArrayList(zzkj.CREATOR);
        m21489P.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: h2 */
    public final void mo23089h2(zzv zzvVar, zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzvVar);
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        m21490k0(12, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: j3 */
    public final void mo23090j3(long j2, String str, String str2, String str3) throws RemoteException {
        Parcel m21488H = m21488H();
        m21488H.writeLong(j2);
        m21488H.writeString(str);
        m21488H.writeString(str2);
        m21488H.writeString(str3);
        m21490k0(10, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: j6 */
    public final void mo23091j6(zzan zzanVar, String str, String str2) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzanVar);
        m21488H.writeString(str);
        m21488H.writeString(str2);
        m21490k0(5, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: r2 */
    public final void mo23092r2(zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        m21490k0(18, m21488H);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: r3 */
    public final List<zzv> mo23093r3(String str, String str2, String str3) throws RemoteException {
        Parcel m21488H = m21488H();
        m21488H.writeString(str);
        m21488H.writeString(str2);
        m21488H.writeString(str3);
        Parcel m21489P = m21489P(17, m21488H);
        ArrayList createTypedArrayList = m21489P.createTypedArrayList(zzv.CREATOR);
        m21489P.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: s6 */
    public final void mo23094s6(zzm zzmVar) throws RemoteException {
        Parcel m21488H = m21488H();
        com.google.android.gms.internal.measurement.zzb.m21493c(m21488H, zzmVar);
        m21490k0(4, m21488H);
    }
}
