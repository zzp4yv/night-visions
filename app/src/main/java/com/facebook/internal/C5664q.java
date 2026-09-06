package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C5608a0;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: AttributionIdentifiers.kt */
/* renamed from: com.facebook.internal.q */
/* loaded from: classes2.dex */
public final class C5664q {

    /* renamed from: a */
    public static final a f14488a = new a(null);

    /* renamed from: b */
    private static final String f14489b = C5664q.class.getCanonicalName();

    /* renamed from: c */
    public static C5664q f14490c;

    /* renamed from: d */
    private String f14491d;

    /* renamed from: e */
    private long f14492e;

    /* renamed from: f */
    private String f14493f;

    /* renamed from: g */
    private String f14494g;

    /* renamed from: h */
    private boolean f14495h;

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        private final C5664q m11622a(C5664q c5664q) {
            c5664q.f14492e = System.currentTimeMillis();
            C5664q.f14490c = c5664q;
            return c5664q;
        }

        /* renamed from: b */
        private final C5664q m11623b(Context context) {
            C5664q m11624c = m11624c(context);
            if (m11624c != null) {
                return m11624c;
            }
            C5664q m11625d = m11625d(context);
            return m11625d == null ? new C5664q() : m11625d;
        }

        /* renamed from: c */
        private final C5664q m11624c(Context context) {
            Object m11547R;
            try {
                if (!m11627g(context)) {
                    return null;
                }
                C5663p0 c5663p0 = C5663p0.f14478a;
                boolean z = false;
                Method m11540J = C5663p0.m11540J("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (m11540J == null || (m11547R = C5663p0.m11547R(null, m11540J, context)) == null) {
                    return null;
                }
                Method m11539I = C5663p0.m11539I(m11547R.getClass(), "getId", new Class[0]);
                Method m11539I2 = C5663p0.m11539I(m11547R.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (m11539I != null && m11539I2 != null) {
                    C5664q c5664q = new C5664q();
                    c5664q.f14491d = (String) C5663p0.m11547R(m11547R, m11539I, new Object[0]);
                    Boolean bool = (Boolean) C5663p0.m11547R(m11547R, m11539I2, new Object[0]);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    c5664q.f14495h = z;
                    return c5664q;
                }
                return null;
            } catch (Exception e2) {
                C5663p0 c5663p02 = C5663p0.f14478a;
                C5663p0.m11573i0("android_id", e2);
                return null;
            }
        }

        /* renamed from: d */
        private final C5664q m11625d(Context context) {
            if (!m11627g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.m11632a());
                        C5664q c5664q = new C5664q();
                        c5664q.f14491d = bVar.m11630H();
                        c5664q.f14495h = bVar.m11631P();
                        return c5664q;
                    }
                } catch (Exception e2) {
                    C5663p0 c5663p0 = C5663p0.f14478a;
                    C5663p0.m11573i0("android_id", e2);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* renamed from: f */
        private final String m11626f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        /* renamed from: g */
        private final boolean m11627g(Context context) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            Method m11540J = C5663p0.m11540J("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (m11540J == null) {
                return false;
            }
            Object m11547R = C5663p0.m11547R(null, m11540J, context);
            return (m11547R instanceof Integer) && C9768m.m32341a(m11547R, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: all -> 0x00fc, Exception -> 0x00fe, TryCatch #4 {Exception -> 0x00fe, all -> 0x00fc, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x0055, B:15:0x0064, B:17:0x0085, B:19:0x008b, B:21:0x0090, B:23:0x0095, B:57:0x006e, B:59:0x007d, B:61:0x00f4, B:62:0x00fb), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[Catch: all -> 0x00fc, Exception -> 0x00fe, TryCatch #4 {Exception -> 0x00fe, all -> 0x00fc, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x0055, B:15:0x0064, B:17:0x0085, B:19:0x008b, B:21:0x0090, B:23:0x0095, B:57:0x006e, B:59:0x007d, B:61:0x00f4, B:62:0x00fb), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[Catch: all -> 0x00fc, Exception -> 0x00fe, TRY_LEAVE, TryCatch #4 {Exception -> 0x00fe, all -> 0x00fc, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x0055, B:15:0x0064, B:17:0x0085, B:19:0x008b, B:21:0x0090, B:23:0x0095, B:57:0x006e, B:59:0x007d, B:61:0x00f4, B:62:0x00fb), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.internal.C5664q m11628e(android.content.Context r14) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5664q.a.m11628e(android.content.Context):com.facebook.internal.q");
        }

        /* renamed from: h */
        public final boolean m11629h(Context context) {
            C9768m.m32346f(context, "context");
            C5664q m11628e = m11628e(context);
            return m11628e != null && m11628e.m11621k();
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.q$b */
    private static final class b implements IInterface {

        /* renamed from: f */
        public static final a f14496f = new a(null);

        /* renamed from: g */
        private final IBinder f14497g;

        /* compiled from: AttributionIdentifiers.kt */
        /* renamed from: com.facebook.internal.q$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }
        }

        public b(IBinder iBinder) {
            C9768m.m32346f(iBinder, "binder");
            this.f14497g = iBinder;
        }

        /* renamed from: H */
        public final String m11630H() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C9768m.m32345e(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C9768m.m32345e(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f14497g.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: P */
        public final boolean m11631P() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C9768m.m32345e(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C9768m.m32345e(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f14497g.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f14497g;
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.q$c */
    private static final class c implements ServiceConnection {

        /* renamed from: f */
        private final AtomicBoolean f14498f = new AtomicBoolean(false);

        /* renamed from: g */
        private final BlockingQueue<IBinder> f14499g = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder m11632a() throws InterruptedException {
            if (!(!this.f14498f.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder take = this.f14499g.take();
            C9768m.m32345e(take, "queue.take()");
            return take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f14499g.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: h */
    public final String m11618h() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11304w() && C5608a0.m11283b()) {
            return this.f14491d;
        }
        return null;
    }

    /* renamed from: i */
    public final String m11619i() {
        return this.f14494g;
    }

    /* renamed from: j */
    public final String m11620j() {
        return this.f14493f;
    }

    /* renamed from: k */
    public final boolean m11621k() {
        return this.f14495h;
    }
}
