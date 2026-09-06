package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {

    /* renamed from: g */
    private static Boolean f18044g = null;

    /* renamed from: h */
    private static String f18045h = null;

    /* renamed from: i */
    private static boolean f18046i = false;

    /* renamed from: j */
    private static int f18047j = -1;

    /* renamed from: k */
    private static Boolean f18048k;

    /* renamed from: p */
    private static zzq f18053p;

    /* renamed from: q */
    private static zzr f18054q;

    /* renamed from: r */
    private final Context f18055r;

    /* renamed from: l */
    private static final ThreadLocal f18049l = new ThreadLocal();

    /* renamed from: m */
    private static final ThreadLocal f18050m = new C6425c();

    /* renamed from: n */
    private static final VersionPolicy.IVersions f18051n = new C6426d();

    /* renamed from: a */
    @KeepForSdk
    public static final VersionPolicy f18038a = new C6427e();

    /* renamed from: b */
    @KeepForSdk
    public static final VersionPolicy f18039b = new C6428f();

    /* renamed from: c */
    @KeepForSdk
    public static final VersionPolicy f18040c = new C6429g();

    /* renamed from: d */
    @KeepForSdk
    public static final VersionPolicy f18041d = new C6430h();

    /* renamed from: e */
    @KeepForSdk
    public static final VersionPolicy f18042e = new C6431i();

    /* renamed from: f */
    @KeepForSdk
    public static final VersionPolicy f18043f = new C6432j();

    /* renamed from: o */
    public static final VersionPolicy f18052o = new C6433k();

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        public interface IVersions {
            /* renamed from: a */
            int mo14725a(Context context, String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo14726b(Context context, String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        public static class SelectionResult {

            /* renamed from: a */
            @KeepForSdk
            public int f18056a = 0;

            /* renamed from: b */
            @KeepForSdk
            public int f18057b = 0;

            /* renamed from: c */
            @KeepForSdk
            public int f18058c = 0;
        }

        @KeepForSdk
        /* renamed from: a */
        SelectionResult mo14724a(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.m14372k(context);
        this.f18055r = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m14712a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.m14355a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static int m14713c(Context context, String str) {
        return m14715f(context, str, false);
    }

    @KeepForSdk
    /* renamed from: e */
    public static DynamiteModule m14714e(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        Boolean bool;
        IObjectWrapper m14736y4;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        Boolean valueOf;
        IObjectWrapper m14737E0;
        ThreadLocal threadLocal = f18049l;
        C6434l c6434l = (C6434l) threadLocal.get();
        C6434l c6434l2 = new C6434l(null);
        threadLocal.set(c6434l2);
        ThreadLocal threadLocal2 = f18050m;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult mo14724a = versionPolicy.mo14724a(context, str, f18051n);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + mo14724a.f18056a + " and remote module " + str + ":" + mo14724a.f18057b);
            int i2 = mo14724a.f18058c;
            if (i2 != 0) {
                if (i2 == -1) {
                    if (mo14724a.f18056a != 0) {
                        i2 = -1;
                    }
                }
                if (i2 != 1 || mo14724a.f18057b != 0) {
                    if (i2 == -1) {
                        DynamiteModule m14717h = m14717h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = c6434l2.f18059a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(c6434l);
                        return m14717h;
                    }
                    if (i2 != 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                    }
                    try {
                        int i3 = mo14724a.f18057b;
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!m14720k(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = f18044g;
                            }
                            if (bool == null) {
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                synchronized (DynamiteModule.class) {
                                    zzrVar = f18054q;
                                }
                                if (zzrVar == null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                C6434l c6434l3 = (C6434l) threadLocal.get();
                                if (c6434l3 == null || c6434l3.f18059a == null) {
                                    throw new LoadingException("No result cursor", null);
                                }
                                Context applicationContext = context.getApplicationContext();
                                Cursor cursor2 = c6434l3.f18059a;
                                ObjectWrapper.m14708E0(null);
                                synchronized (DynamiteModule.class) {
                                    valueOf = Boolean.valueOf(f18047j >= 2);
                                }
                                if (valueOf.booleanValue()) {
                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    m14737E0 = zzrVar.m14738E3(ObjectWrapper.m14708E0(applicationContext), str, i3, ObjectWrapper.m14708E0(cursor2));
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    m14737E0 = zzrVar.m14737E0(ObjectWrapper.m14708E0(applicationContext), str, i3, ObjectWrapper.m14708E0(cursor2));
                                }
                                Context context2 = (Context) ObjectWrapper.m14709k0(m14737E0);
                                if (context2 == null) {
                                    throw new LoadingException("Failed to get module context", null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                zzq m14721l = m14721l(context);
                                if (m14721l == null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                int m14730E0 = m14721l.m14730E0();
                                if (m14730E0 >= 3) {
                                    C6434l c6434l4 = (C6434l) threadLocal.get();
                                    if (c6434l4 == null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    m14736y4 = m14721l.m14732S4(ObjectWrapper.m14708E0(context), str, i3, ObjectWrapper.m14708E0(c6434l4.f18059a));
                                } else if (m14730E0 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    m14736y4 = m14721l.m14734Y4(ObjectWrapper.m14708E0(context), str, i3);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    m14736y4 = m14721l.m14736y4(ObjectWrapper.m14708E0(context), str, i3);
                                }
                                Object m14709k0 = ObjectWrapper.m14709k0(m14736y4);
                                if (m14709k0 == null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) m14709k0);
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor3 = c6434l2.f18059a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(c6434l);
                            return dynamiteModule;
                        } catch (RemoteException e2) {
                            throw new LoadingException("Failed to load remote module.", e2, null);
                        } catch (LoadingException e3) {
                            throw e3;
                        } catch (Throwable th) {
                            CrashUtils.m14619a(context, th);
                            throw new LoadingException("Failed to load remote module.", th, null);
                        }
                    } catch (LoadingException e4) {
                        Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                        int i4 = mo14724a.f18056a;
                        if (i4 == 0 || versionPolicy.mo14724a(context, str, new C6435m(i4, 0)).f18058c != -1) {
                            throw new LoadingException("Remote load failed. No local fallback found.", e4, null);
                        }
                        DynamiteModule m14717h2 = m14717h(context, str);
                        if (longValue == 0) {
                            f18050m.remove();
                        } else {
                            f18050m.set(Long.valueOf(longValue));
                        }
                        Cursor cursor4 = c6434l2.f18059a;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        f18049l.set(c6434l);
                        return m14717h2;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + mo14724a.f18056a + " and remote version is " + mo14724a.f18057b + ".", null);
        } catch (Throwable th2) {
            if (longValue == 0) {
                f18050m.remove();
            } else {
                f18050m.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = c6434l2.f18059a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f18049l.set(c6434l);
            throw th2;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b1 -> B:24:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01b3 -> B:24:0x01b6). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public static int m14715f(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f18044g;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m14718i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!m14720k(context)) {
                                return 0;
                            }
                            if (!f18046i) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m14716g = m14716g(context, str, z, true);
                                        String str2 = f18045h;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m14727a = zzb.m14727a();
                                            if (m14727a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f18045h;
                                                    Preconditions.m14372k(str3);
                                                    m14727a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f18045h;
                                                    Preconditions.m14372k(str4);
                                                    m14727a = new C6424b(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m14718i(m14727a);
                                            declaredField.set(null, m14727a);
                                            f18044g = bool2;
                                            return m14716g;
                                        }
                                        return m14716g;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f18044g = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m14716g(context, str, z, false);
                    } catch (LoadingException e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                zzq m14721l = m14721l(context);
                try {
                    if (m14721l != null) {
                        try {
                            int m14730E0 = m14721l.m14730E0();
                            if (m14730E0 >= 3) {
                                C6434l c6434l = (C6434l) f18049l.get();
                                if (c6434l == null || (cursor = c6434l.f18059a) == null) {
                                    Cursor cursor2 = (Cursor) ObjectWrapper.m14709k0(m14721l.m14735p5(ObjectWrapper.m14708E0(context), str, z, ((Long) f18050m.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i3 = cursor2.getInt(0);
                                                r2 = (i3 <= 0 || !m14719j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i2 = cursor.getInt(0);
                                }
                            } else if (m14730E0 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = m14721l.m14733V3(ObjectWrapper.m14708E0(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = m14721l.m14731E3(ObjectWrapper.m14708E0(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    }
                    return i2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.m14619a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int m14716g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.f18050m     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            r12.<init>()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb5
            if (r10 == 0) goto La3
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            if (r11 == 0) goto La3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f18045h = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f18047j = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.f18046i = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = m14719j(r10)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
        L8e:
            if (r13 == 0) goto L9d
            if (r11 != 0) goto L93
            goto L9d
        L93:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
        L9b:
            r11 = move-exception
            goto Lb8
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r12
        La3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lc5
        Lb2:
            r10 = move-exception
            r11 = r10
            goto Lc7
        Lb5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Lbd
            throw r11     // Catch: java.lang.Throwable -> Lc5
        Lbd:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch: java.lang.Throwable -> Lc5
            throw r12     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r11 = move-exception
            r0 = r10
        Lc7:
            if (r0 == 0) goto Lcc
            r0.close()
        Lcc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m14716g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    private static DynamiteModule m14717h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: i */
    private static void m14718i(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzr(iBinder);
            }
            f18054q = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, zzpVar);
        }
    }

    /* renamed from: j */
    private static boolean m14719j(Cursor cursor) {
        C6434l c6434l = (C6434l) f18049l.get();
        if (c6434l == null || c6434l.f18059a != null) {
            return false;
        }
        c6434l.f18059a = cursor;
        return true;
    }

    /* renamed from: k */
    private static boolean m14720k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f18048k)) {
            return true;
        }
        boolean z = false;
        if (f18048k == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.m13823h().mo13813j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f18048k = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f18046i = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* renamed from: l */
    private static zzq m14721l(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f18053p;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    f18053p = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public Context m14722b() {
        return this.f18055r;
    }

    @KeepForSdk
    /* renamed from: d */
    public IBinder m14723d(String str) throws LoadingException {
        try {
            return (IBinder) this.f18055r.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
