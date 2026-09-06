package com.facebook.p172q0.p173a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IReceiverService.java */
/* renamed from: com.facebook.q0.a.a */
/* loaded from: classes2.dex */
public interface InterfaceC5916a extends IInterface {

    /* compiled from: IReceiverService.java */
    /* renamed from: com.facebook.q0.a.a$a */
    public static abstract class a extends Binder implements InterfaceC5916a {

        /* compiled from: IReceiverService.java */
        /* renamed from: com.facebook.q0.a.a$a$a, reason: collision with other inner class name */
        private static class C11416a implements InterfaceC5916a {

            /* renamed from: f */
            public static InterfaceC5916a f15560f;

            /* renamed from: g */
            private IBinder f15561g;

            C11416a(IBinder iBinder) {
                this.f15561g = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15561g;
            }

            @Override // com.facebook.p172q0.p173a.InterfaceC5916a
            /* renamed from: u1 */
            public int mo12883u1(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f15561g.transact(1, obtain, obtain2, 0) && a.m12885P() != null) {
                        return a.m12885P().mo12883u1(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: H */
        public static InterfaceC5916a m12884H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5916a)) ? new C11416a(iBinder) : (InterfaceC5916a) queryLocalInterface;
        }

        /* renamed from: P */
        public static InterfaceC5916a m12885P() {
            return C11416a.f15560f;
        }
    }

    /* renamed from: u1 */
    int mo12883u1(Bundle bundle) throws RemoteException;
}
