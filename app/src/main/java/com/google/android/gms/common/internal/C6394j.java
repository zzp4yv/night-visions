package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes2.dex */
final class C6394j implements IGmsServiceBroker {

    /* renamed from: f */
    private final IBinder f17820f;

    C6394j(IBinder iBinder) {
        this.f17820f = iBinder;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    /* renamed from: U1 */
    public final void mo14352U1(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                zzm.m14506a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17820f.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17820f;
    }
}
