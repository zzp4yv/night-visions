package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzad extends zza implements zzaf {
    zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    /* renamed from: C1 */
    public final boolean mo14495C1(com.google.android.gms.common.zzs zzsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        com.google.android.gms.internal.common.zzc.m20924d(m20911k0, zzsVar);
        com.google.android.gms.internal.common.zzc.m20926f(m20911k0, iObjectWrapper);
        Parcel m20909H = m20909H(5, m20911k0);
        boolean m20927g = com.google.android.gms.internal.common.zzc.m20927g(m20909H);
        m20909H.recycle();
        return m20927g;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    /* renamed from: c4 */
    public final zzq mo14496c4(zzo zzoVar) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        com.google.android.gms.internal.common.zzc.m20924d(m20911k0, zzoVar);
        Parcel m20909H = m20909H(8, m20911k0);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.m20921a(m20909H, zzq.CREATOR);
        m20909H.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    /* renamed from: l */
    public final boolean mo14497l() throws RemoteException {
        Parcel m20909H = m20909H(7, m20911k0());
        boolean m20927g = com.google.android.gms.internal.common.zzc.m20927g(m20909H);
        m20909H.recycle();
        return m20927g;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    /* renamed from: q3 */
    public final zzq mo14498q3(zzo zzoVar) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        com.google.android.gms.internal.common.zzc.m20924d(m20911k0, zzoVar);
        Parcel m20909H = m20909H(6, m20911k0);
        zzq zzqVar = (zzq) com.google.android.gms.internal.common.zzc.m20921a(m20909H, zzq.CREATOR);
        m20909H.recycle();
        return zzqVar;
    }
}
