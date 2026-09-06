package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f27606f;

    /* renamed from: g */
    private final String f27607g;

    protected zza(IBinder iBinder, String str) {
        this.f27606f = iBinder;
        this.f27607g = str;
    }

    /* renamed from: H */
    protected final Parcel m20909H(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f27606f.transact(i2, parcel, obtain, 0);
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

    /* renamed from: P */
    protected final void m20910P(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f27606f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27606f;
    }

    /* renamed from: k0 */
    protected final Parcel m20911k0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27607g);
        return obtain;
    }
}
