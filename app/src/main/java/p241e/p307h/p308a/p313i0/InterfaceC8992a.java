package p241e.p307h.p308a.p313i0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* compiled from: IFileDownloadIPCCallback.java */
/* renamed from: e.h.a.i0.a */
/* loaded from: classes2.dex */
public interface InterfaceC8992a extends IInterface {

    /* compiled from: IFileDownloadIPCCallback.java */
    /* renamed from: e.h.a.i0.a$a */
    public static abstract class a extends Binder implements InterfaceC8992a {

        /* compiled from: IFileDownloadIPCCallback.java */
        /* renamed from: e.h.a.i0.a$a$a, reason: collision with other inner class name */
        private static class C11475a implements InterfaceC8992a {

            /* renamed from: f */
            private IBinder f34796f;

            C11475a(IBinder iBinder) {
                this.f34796f = iBinder;
            }

            @Override // p241e.p307h.p308a.p313i0.InterfaceC8992a
            /* renamed from: D4 */
            public void mo28910D4(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        obtain.writeInt(1);
                        messageSnapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f34796f.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34796f;
            }
        }

        public a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }

        /* renamed from: H */
        public static InterfaceC8992a m28911H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC8992a)) ? new C11475a(iBinder) : (InterfaceC8992a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                mo28910D4(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return true;
        }
    }

    /* renamed from: D4 */
    void mo28910D4(MessageSnapshot messageSnapshot) throws RemoteException;
}
