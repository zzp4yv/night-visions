package p019b.p022b.p023a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: ICustomTabsService.java */
/* renamed from: b.b.a.b */
/* loaded from: classes.dex */
public interface InterfaceC0822b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* renamed from: b.b.a.b$a */
    public static abstract class a extends Binder implements InterfaceC0822b {

        /* compiled from: ICustomTabsService.java */
        /* renamed from: b.b.a.b$a$a, reason: collision with other inner class name */
        private static class C11396a implements InterfaceC0822b {

            /* renamed from: f */
            private IBinder f5011f;

            C11396a(IBinder iBinder) {
                this.f5011f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5011f;
            }

            @Override // p019b.p022b.p023a.InterfaceC0822b
            /* renamed from: p3 */
            public boolean mo5255p3(long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j2);
                    this.f5011f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p019b.p022b.p023a.InterfaceC0822b
            /* renamed from: q1 */
            public boolean mo5256q1(InterfaceC0821a interfaceC0821a, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(interfaceC0821a != null ? interfaceC0821a.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f5011f.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p019b.p022b.p023a.InterfaceC0822b
            /* renamed from: x4 */
            public boolean mo5257x4(InterfaceC0821a interfaceC0821a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(interfaceC0821a != null ? interfaceC0821a.asBinder() : null);
                    this.f5011f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: H */
        public static InterfaceC0822b m5258H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0822b)) ? new C11396a(iBinder) : (InterfaceC0822b) queryLocalInterface;
        }
    }

    /* renamed from: p3 */
    boolean mo5255p3(long j2) throws RemoteException;

    /* renamed from: q1 */
    boolean mo5256q1(InterfaceC0821a interfaceC0821a, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: x4 */
    boolean mo5257x4(InterfaceC0821a interfaceC0821a) throws RemoteException;
}
