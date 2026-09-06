package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.InterfaceC0645d;

/* compiled from: IMultiInstanceInvalidationService.java */
/* renamed from: androidx.room.e */
/* loaded from: classes.dex */
public interface InterfaceC0646e extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* renamed from: androidx.room.e$a */
    public static abstract class a extends Binder implements InterfaceC0646e {

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.e$a$a, reason: collision with other inner class name */
        private static class C11392a implements InterfaceC0646e {

            /* renamed from: f */
            private IBinder f4252f;

            C11392a(IBinder iBinder) {
                this.f4252f = iBinder;
            }

            @Override // androidx.room.InterfaceC0646e
            /* renamed from: S6 */
            public void mo4583S6(InterfaceC0645d interfaceC0645d, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0645d != null ? interfaceC0645d.asBinder() : null);
                    obtain.writeInt(i2);
                    this.f4252f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4252f;
            }

            @Override // androidx.room.InterfaceC0646e
            /* renamed from: k2 */
            public int mo4584k2(InterfaceC0645d interfaceC0645d, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0645d != null ? interfaceC0645d.asBinder() : null);
                    obtain.writeString(str);
                    this.f4252f.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0646e
            /* renamed from: z6 */
            public void mo4585z6(int i2, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    this.f4252f.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: H */
        public static InterfaceC0646e m4589H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0646e)) ? new C11392a(iBinder) : (InterfaceC0646e) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int mo4584k2 = mo4584k2(InterfaceC0645d.a.m4588H(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo4584k2);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo4583S6(InterfaceC0645d.a.m4588H(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo4585z6(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: S6 */
    void mo4583S6(InterfaceC0645d interfaceC0645d, int i2) throws RemoteException;

    /* renamed from: k2 */
    int mo4584k2(InterfaceC0645d interfaceC0645d, String str) throws RemoteException;

    /* renamed from: z6 */
    void mo4585z6(int i2, String[] strArr) throws RemoteException;
}
