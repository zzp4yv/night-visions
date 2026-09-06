package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel.java */
/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
public interface InterfaceC0001a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: android.support.v4.app.a$a */
    public static abstract class a extends Binder implements InterfaceC0001a {

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: android.support.v4.app.a$a$a, reason: collision with other inner class name */
        private static class C11382a implements InterfaceC0001a {

            /* renamed from: f */
            public static InterfaceC0001a f0f;

            /* renamed from: g */
            private IBinder f1g;

            C11382a(IBinder iBinder) {
                this.f1g = iBinder;
            }

            @Override // android.support.v4.app.InterfaceC0001a
            /* renamed from: F6 */
            public void mo2F6(String str, int i2, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f1g.transact(1, obtain, null, 1) || a.m4P() == null) {
                        return;
                    }
                    a.m4P().mo2F6(str, i2, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1g;
            }
        }

        /* renamed from: H */
        public static InterfaceC0001a m3H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0001a)) ? new C11382a(iBinder) : (InterfaceC0001a) queryLocalInterface;
        }

        /* renamed from: P */
        public static InterfaceC0001a m4P() {
            return C11382a.f0f;
        }
    }

    /* renamed from: F6 */
    void mo2F6(String str, int i2, String str2, Notification notification) throws RemoteException;
}
