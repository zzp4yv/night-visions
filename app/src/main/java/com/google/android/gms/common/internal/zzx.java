package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzx extends zza implements zzz {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: c */
    public final int mo14276c() throws RemoteException {
        Parcel m20909H = m20909H(2, m20911k0());
        int readInt = m20909H.readInt();
        m20909H.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: d */
    public final IObjectWrapper mo14277d() throws RemoteException {
        Parcel m20909H = m20909H(1, m20911k0());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m20909H.readStrongBinder());
        m20909H.recycle();
        return m14707P;
    }
}
