package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMediaSession.java */
/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0019b extends IInterface {

    /* compiled from: IMediaSession.java */
    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC0019b {

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C11383a implements InterfaceC0019b {

            /* renamed from: f */
            private IBinder f65f;

            C11383a(IBinder iBinder) {
                this.f65f = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0019b
            /* renamed from: Z0 */
            public void mo81Z0(InterfaceC0018a interfaceC0018a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0018a != null ? interfaceC0018a.asBinder() : null);
                    this.f65f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f65f;
            }
        }

        /* renamed from: H */
        public static InterfaceC0019b m82H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0019b)) ? new C11383a(iBinder) : (InterfaceC0019b) queryLocalInterface;
        }
    }

    /* renamed from: Z0 */
    void mo81Z0(InterfaceC0018a interfaceC0018a) throws RemoteException;
}
