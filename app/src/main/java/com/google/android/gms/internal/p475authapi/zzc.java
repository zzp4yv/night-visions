package com.google.android.gms.internal.p475authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzc implements IInterface {

    /* renamed from: f */
    private final IBinder f27489f;

    /* renamed from: g */
    private final String f27490g;

    protected zzc(IBinder iBinder, String str) {
        this.f27489f = iBinder;
        this.f27490g = str;
    }

    /* renamed from: H */
    protected final Parcel m20869H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27490g);
        return obtain;
    }

    /* renamed from: P */
    protected final void m20870P(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27489f.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27489f;
    }
}
