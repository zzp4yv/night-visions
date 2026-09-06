package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzq extends zza implements IInterface {
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: E0 */
    public final int m14730E0() throws RemoteException {
        Parcel m20909H = m20909H(6, m20911k0());
        int readInt = m20909H.readInt();
        m20909H.recycle();
        return readInt;
    }

    /* renamed from: E3 */
    public final int m14731E3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        zzc.m20926f(m20911k0, iObjectWrapper);
        m20911k0.writeString(str);
        zzc.m20923c(m20911k0, z);
        Parcel m20909H = m20909H(3, m20911k0);
        int readInt = m20909H.readInt();
        m20909H.recycle();
        return readInt;
    }

    /* renamed from: S4 */
    public final IObjectWrapper m14732S4(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        zzc.m20926f(m20911k0, iObjectWrapper);
        m20911k0.writeString(str);
        m20911k0.writeInt(i2);
        zzc.m20926f(m20911k0, iObjectWrapper2);
        Parcel m20909H = m20909H(8, m20911k0);
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m20909H.readStrongBinder());
        m20909H.recycle();
        return m14707P;
    }

    /* renamed from: V3 */
    public final int m14733V3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        zzc.m20926f(m20911k0, iObjectWrapper);
        m20911k0.writeString(str);
        zzc.m20923c(m20911k0, z);
        Parcel m20909H = m20909H(5, m20911k0);
        int readInt = m20909H.readInt();
        m20909H.recycle();
        return readInt;
    }

    /* renamed from: Y4 */
    public final IObjectWrapper m14734Y4(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        zzc.m20926f(m20911k0, iObjectWrapper);
        m20911k0.writeString(str);
        m20911k0.writeInt(i2);
        Parcel m20909H = m20909H(4, m20911k0);
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m20909H.readStrongBinder());
        m20909H.recycle();
        return m14707P;
    }

    /* renamed from: p5 */
    public final IObjectWrapper m14735p5(IObjectWrapper iObjectWrapper, String str, boolean z, long j2) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        zzc.m20926f(m20911k0, iObjectWrapper);
        m20911k0.writeString(str);
        zzc.m20923c(m20911k0, z);
        m20911k0.writeLong(j2);
        Parcel m20909H = m20909H(7, m20911k0);
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m20909H.readStrongBinder());
        m20909H.recycle();
        return m14707P;
    }

    /* renamed from: y4 */
    public final IObjectWrapper m14736y4(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel m20911k0 = m20911k0();
        zzc.m20926f(m20911k0, iObjectWrapper);
        m20911k0.writeString(str);
        m20911k0.writeInt(i2);
        Parcel m20909H = m20909H(2, m20911k0);
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m20909H.readStrongBinder());
        m20909H.recycle();
        return m14707P;
    }
}
