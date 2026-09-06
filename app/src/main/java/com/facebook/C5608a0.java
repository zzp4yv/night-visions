package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.internal.C5633a0;
import com.facebook.internal.C5649i0;
import com.facebook.internal.C5659n0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5664q;
import com.facebook.internal.C5665q0;
import com.facebook.internal.p148t0.C5681j;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.C5784c0;
import com.facebook.p157o0.p165q0.C5870h;
import com.facebook.p157o0.p167s0.C5892c;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10742u;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10513u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookSdk.kt */
/* renamed from: com.facebook.a0 */
/* loaded from: classes.dex */
public final class C5608a0 {

    /* renamed from: a */
    public static final C5608a0 f14199a = new C5608a0();

    /* renamed from: b */
    private static final String f14200b = C5608a0.class.getCanonicalName();

    /* renamed from: c */
    private static final HashSet<EnumC5626g0> f14201c;

    /* renamed from: d */
    private static Executor f14202d;

    /* renamed from: e */
    private static volatile String f14203e;

    /* renamed from: f */
    private static volatile String f14204f;

    /* renamed from: g */
    private static volatile String f14205g;

    /* renamed from: h */
    private static volatile Boolean f14206h;

    /* renamed from: i */
    private static AtomicLong f14207i;

    /* renamed from: j */
    private static volatile boolean f14208j;

    /* renamed from: k */
    private static boolean f14209k;

    /* renamed from: l */
    private static C5649i0<File> f14210l;

    /* renamed from: m */
    private static Context f14211m;

    /* renamed from: n */
    private static int f14212n;

    /* renamed from: o */
    private static final ReentrantLock f14213o;

    /* renamed from: p */
    private static String f14214p;

    /* renamed from: q */
    public static boolean f14215q;

    /* renamed from: r */
    public static boolean f14216r;

    /* renamed from: s */
    public static boolean f14217s;

    /* renamed from: t */
    private static final AtomicBoolean f14218t;

    /* renamed from: u */
    private static volatile String f14219u;

    /* renamed from: v */
    private static volatile String f14220v;

    /* renamed from: w */
    private static a f14221w;

    /* renamed from: x */
    private static boolean f14222x;

    /* compiled from: FacebookSdk.kt */
    /* renamed from: com.facebook.a0$a */
    public interface a {
        /* renamed from: a */
        GraphRequest mo11308a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5598b interfaceC5598b);
    }

    /* compiled from: FacebookSdk.kt */
    /* renamed from: com.facebook.a0$b */
    public interface b {
        /* renamed from: a */
        void m11309a();
    }

    static {
        HashSet<EnumC5626g0> m38918e;
        m38918e = C10789w0.m38918e(EnumC5626g0.DEVELOPER_ERRORS);
        f14201c = m38918e;
        f14207i = new AtomicLong(65536L);
        f14212n = 64206;
        f14213o = new ReentrantLock();
        C5659n0 c5659n0 = C5659n0.f14464a;
        f14214p = C5659n0.m11510a();
        f14218t = new AtomicBoolean(false);
        f14219u = "instagram.com";
        f14220v = "facebook.com";
        f14221w = new a() { // from class: com.facebook.n
            @Override // com.facebook.C5608a0.a
            /* renamed from: a */
            public final GraphRequest mo11308a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5598b interfaceC5598b) {
                GraphRequest m11301t;
                m11301t = C5608a0.m11301t(accessToken, str, jSONObject, interfaceC5598b);
                return m11301t;
            }
        };
    }

    private C5608a0() {
    }

    /* renamed from: I */
    public static final void m11269I(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            C9768m.m32345e(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f14203e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    C9768m.m32345e(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (C10513u.m37511E(lowerCase, "fb", false, 2, null)) {
                        String substring = str.substring(2);
                        C9768m.m32345e(substring, "(this as java.lang.String).substring(startIndex)");
                        f14203e = substring;
                    } else {
                        f14203e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f14204f == null) {
                f14204f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f14205g == null) {
                f14205g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f14212n == 64206) {
                f14212n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f14206h == null) {
                f14206h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: J */
    private final void m11270J(Context context, String str) {
        try {
            C5664q m11628e = C5664q.f14488a.m11628e(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String m32354n = C9768m.m32354n(str, "ping");
            long j2 = sharedPreferences.getLong(m32354n, 0L);
            try {
                C5870h c5870h = C5870h.f15371a;
                JSONObject m12631a = C5870h.m12631a(C5870h.a.MOBILE_INSTALL_EVENT, m11628e, C5780a0.f14908a.m12169c(context), m11298q(context), context);
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                C9768m.m32345e(format, "java.lang.String.format(format, *args)");
                GraphRequest mo11308a = f14221w.mo11308a(null, format, m12631a, null);
                if (j2 == 0 && mo11308a.m11179j().m11338b() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(m32354n, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e2) {
                throw new FacebookException("An error occurred while publishing install.", e2);
            }
        } catch (Exception e3) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            C5663p0.m11573i0("Facebook-publish", e3);
        }
    }

    /* renamed from: K */
    public static final void m11271K(Context context, final String str) {
        C9768m.m32346f(context, "context");
        C9768m.m32346f(str, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        m11292k().execute(new Runnable() { // from class: com.facebook.k
            @Override // java.lang.Runnable
            public final void run() {
                C5608a0.m11272L(applicationContext, str);
            }
        });
        C5633a0 c5633a0 = C5633a0.f14313a;
        if (C5633a0.m11378g(C5633a0.b.OnDeviceEventProcessing)) {
            C5892c c5892c = C5892c.f15458a;
            if (C5892c.m12741b()) {
                C5892c.m12746g(str, "com.facebook.sdk.attributionTracking");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m11272L(Context context, String str) {
        C9768m.m32346f(context, "$applicationContext");
        C9768m.m32346f(str, "$applicationId");
        f14199a.m11270J(context, str);
    }

    /* renamed from: M */
    public static final synchronized void m11273M(Context context) {
        synchronized (C5608a0.class) {
            C9768m.m32346f(context, "applicationContext");
            m11274N(context, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x0018, B:14:0x0036, B:16:0x003e, B:21:0x004a, B:23:0x004e, B:26:0x0057, B:28:0x0060, B:29:0x0063, B:31:0x0067, B:33:0x006b, B:35:0x0073, B:37:0x0079, B:38:0x0081, B:39:0x0086, B:40:0x0087, B:42:0x0097, B:45:0x00db, B:46:0x00e0, B:47:0x00e1, B:48:0x00e6, B:49:0x00e7, B:50:0x00ee, B:52:0x00ef, B:53:0x00f6, B:55:0x00f7, B:56:0x00fc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x0018, B:14:0x0036, B:16:0x003e, B:21:0x004a, B:23:0x004e, B:26:0x0057, B:28:0x0060, B:29:0x0063, B:31:0x0067, B:33:0x006b, B:35:0x0073, B:37:0x0079, B:38:0x0081, B:39:0x0086, B:40:0x0087, B:42:0x0097, B:45:0x00db, B:46:0x00e0, B:47:0x00e1, B:48:0x00e6, B:49:0x00e7, B:50:0x00ee, B:52:0x00ef, B:53:0x00f6, B:55:0x00f7, B:56:0x00fc), top: B:3:0x0003 }] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void m11274N(android.content.Context r5, final com.facebook.C5608a0.b r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C5608a0.m11274N(android.content.Context, com.facebook.a0$b):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final File m11275O() {
        Context context = f14211m;
        if (context != null) {
            return context.getCacheDir();
        }
        C9768m.m32363w("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m11276P(boolean z) {
        if (z) {
            C5681j c5681j = C5681j.f14589a;
            C5681j.m11738d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m11277Q(boolean z) {
        if (z) {
            C5784c0 c5784c0 = C5784c0.f14926a;
            C5784c0.m12216a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m11278R(boolean z) {
        if (z) {
            f14215q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m11279S(boolean z) {
        if (z) {
            f14216r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m11280T(boolean z) {
        if (z) {
            f14217s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final Void m11281U(b bVar) {
        C5922v.f15573a.m12923e().m12915j();
        C5630i0.f14305a.m11370a().m11368d();
        if (AccessToken.f14054f.m11107g()) {
            Profile.C5606b c5606b = Profile.f14188f;
            if (c5606b.m11257b() == null) {
                c5606b.m11256a();
            }
        }
        if (bVar != null) {
            bVar.m11309a();
        }
        C5780a0.a aVar = C5780a0.f14908a;
        aVar.m12172f(m11284c(), f14203e);
        C5777n0 c5777n0 = C5777n0.f14891a;
        C5777n0.m12148k();
        Context applicationContext = m11284c().getApplicationContext();
        C9768m.m32345e(applicationContext, "getApplicationContext().applicationContext");
        aVar.m12173g(applicationContext).m12164b();
        return null;
    }

    /* renamed from: a */
    public static final void m11282a() {
        f14222x = true;
    }

    /* renamed from: b */
    public static final boolean m11283b() {
        C5777n0 c5777n0 = C5777n0.f14891a;
        return C5777n0.m12138a();
    }

    /* renamed from: c */
    public static final Context m11284c() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        Context context = f14211m;
        if (context != null) {
            return context;
        }
        C9768m.m32363w("applicationContext");
        throw null;
    }

    /* renamed from: d */
    public static final String m11285d() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        String str = f14203e;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* renamed from: e */
    public static final String m11286e() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        return f14204f;
    }

    /* renamed from: f */
    public static final boolean m11287f() {
        C5777n0 c5777n0 = C5777n0.f14891a;
        return C5777n0.m12139b();
    }

    /* renamed from: g */
    public static final boolean m11288g() {
        C5777n0 c5777n0 = C5777n0.f14891a;
        return C5777n0.m12140c();
    }

    /* renamed from: h */
    public static final int m11289h() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        return f14212n;
    }

    /* renamed from: i */
    public static final String m11290i() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        String str = f14205g;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* renamed from: j */
    public static final boolean m11291j() {
        C5777n0 c5777n0 = C5777n0.f14891a;
        return C5777n0.m12141d();
    }

    /* renamed from: k */
    public static final Executor m11292k() {
        ReentrantLock reentrantLock = f14213o;
        reentrantLock.lock();
        try {
            if (f14202d == null) {
                f14202d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C10742u c10742u = C10742u.f41439a;
            reentrantLock.unlock();
            Executor executor = f14202d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: l */
    public static final String m11293l() {
        return f14220v;
    }

    /* renamed from: m */
    public static final String m11294m() {
        return "fb.gg";
    }

    /* renamed from: n */
    public static final String m11295n() {
        C5663p0 c5663p0 = C5663p0.f14478a;
        String str = f14200b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f14214p}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        C5663p0.m11575j0(str, format);
        return f14214p;
    }

    /* renamed from: o */
    public static final String m11296o() {
        AccessToken m11105e = AccessToken.f14054f.m11105e();
        String m11089h = m11105e != null ? m11105e.m11089h() : null;
        C5663p0 c5663p0 = C5663p0.f14478a;
        return C5663p0.m11528C(m11089h);
    }

    /* renamed from: p */
    public static final String m11297p() {
        return f14219u;
    }

    /* renamed from: q */
    public static final boolean m11298q(Context context) {
        C9768m.m32346f(context, "context");
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: r */
    public static final long m11299r() {
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5665q0.m11644l();
        return f14207i.get();
    }

    /* renamed from: s */
    public static final String m11300s() {
        return "16.2.0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final GraphRequest m11301t(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5598b interfaceC5598b) {
        return GraphRequest.f14159a.m11222A(accessToken, str, jSONObject, interfaceC5598b);
    }

    /* renamed from: u */
    public static final boolean m11302u() {
        return f14208j;
    }

    /* renamed from: v */
    public static final synchronized boolean m11303v() {
        boolean z;
        synchronized (C5608a0.class) {
            z = f14222x;
        }
        return z;
    }

    /* renamed from: w */
    public static final boolean m11304w() {
        return f14218t.get();
    }

    /* renamed from: x */
    public static final boolean m11305x() {
        return f14209k;
    }

    /* renamed from: y */
    public static final boolean m11306y(EnumC5626g0 enumC5626g0) {
        boolean z;
        C9768m.m32346f(enumC5626g0, "behavior");
        HashSet<EnumC5626g0> hashSet = f14201c;
        synchronized (hashSet) {
            if (m11302u()) {
                z = hashSet.contains(enumC5626g0);
            }
        }
        return z;
    }
}
