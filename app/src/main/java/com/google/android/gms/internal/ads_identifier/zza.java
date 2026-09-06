package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f27483f;

    /* renamed from: g */
    private final String f27484g;

    protected zza(IBinder iBinder, String str) {
        this.f27483f = iBinder;
        this.f27484g = str;
    }

    /* renamed from: H */
    protected final Parcel m20859H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27484g);
        return obtain;
    }

    /* renamed from: P */
    protected final Parcel m20860P(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f27483f.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27483f;
    }
}
