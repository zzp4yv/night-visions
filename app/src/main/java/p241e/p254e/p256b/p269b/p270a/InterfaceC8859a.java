package p241e.p254e.p256b.p269b.p270a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IGetInstallReferrerService.java */
/* renamed from: e.e.b.b.a.a */
/* loaded from: classes2.dex */
public interface InterfaceC8859a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: e.e.b.b.a.a$a */
    public static abstract class a extends Binder implements InterfaceC8859a {

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: e.e.b.b.a.a$a$a, reason: collision with other inner class name */
        private static class C11474a implements InterfaceC8859a {

            /* renamed from: f */
            private IBinder f33673f;

            C11474a(IBinder iBinder) {
                this.f33673f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33673f;
            }

            @Override // p241e.p254e.p256b.p269b.p270a.InterfaceC8859a
            /* renamed from: e3 */
            public Bundle mo28236e3(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f33673f.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: H */
        public static InterfaceC8859a m28237H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC8859a)) ? new C11474a(iBinder) : (InterfaceC8859a) queryLocalInterface;
        }
    }

    /* renamed from: e3 */
    Bundle mo28236e3(Bundle bundle) throws RemoteException;
}
