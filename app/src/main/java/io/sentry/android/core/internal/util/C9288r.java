package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.C9311s0;
import io.sentry.util.C9613q;
import java.io.File;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: RootChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.r */
/* loaded from: classes2.dex */
public final class C9288r {

    /* renamed from: a */
    private static final Charset f36008a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final Context f36009b;

    /* renamed from: c */
    private final C9311s0 f36010c;

    /* renamed from: d */
    private final InterfaceC9637w1 f36011d;

    /* renamed from: e */
    private final String[] f36012e;

    /* renamed from: f */
    private final String[] f36013f;

    /* renamed from: g */
    private final Runtime f36014g;

    public C9288r(Context context, C9311s0 c9311s0, InterfaceC9637w1 interfaceC9637w1) {
        this(context, c9311s0, interfaceC9637w1, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    /* renamed from: a */
    private boolean m30299a() {
        for (String str : this.f36012e) {
            try {
            } catch (RuntimeException e2) {
                this.f36011d.mo30212a(EnumC9554s4.ERROR, e2, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m30300b(InterfaceC9637w1 interfaceC9637w1) {
        C9311s0 c9311s0 = new C9311s0(interfaceC9637w1);
        PackageManager packageManager = this.f36009b.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f36013f) {
                try {
                    if (c9311s0.m30406d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return false;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m30301c() {
        /*
            r7 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "/system/xbin/which"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "su"
            r3 = 1
            r0[r3] = r1
            r1 = 0
            java.lang.Runtime r4 = r7.f36014g     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.lang.Process r1 = r4.exec(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.nio.charset.Charset r6 = io.sentry.android.core.internal.util.C9288r.f36008a     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.lang.String r4 = r0.readLine()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r0.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            r1.destroy()
            return r3
        L33:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L37
        L37:
            throw r3     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
        L38:
            r0 = move-exception
            io.sentry.w1 r3 = r7.f36011d     // Catch: java.lang.Throwable -> L57
            io.sentry.s4 r4 = io.sentry.EnumC9554s4.DEBUG     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.mo30213b(r4, r5, r0)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L56
        L44:
            r1.destroy()
            goto L56
        L48:
            io.sentry.w1 r0 = r7.f36011d     // Catch: java.lang.Throwable -> L57
            io.sentry.s4 r3 = io.sentry.EnumC9554s4.DEBUG     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "SU isn't found on this Device."
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
            r0.mo30214c(r3, r4, r5)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L56
            goto L44
        L56:
            return r2
        L57:
            r0 = move-exception
            if (r1 == 0) goto L5d
            r1.destroy()
        L5d:
            goto L5f
        L5e:
            throw r0
        L5f:
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.C9288r.m30301c():boolean");
    }

    /* renamed from: d */
    private boolean m30302d() {
        String m30403a = this.f36010c.m30403a();
        return m30403a != null && m30403a.contains("test-keys");
    }

    /* renamed from: e */
    public boolean m30303e() {
        return m30302d() || m30299a() || m30301c() || m30300b(this.f36011d);
    }

    C9288r(Context context, C9311s0 c9311s0, InterfaceC9637w1 interfaceC9637w1, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f36009b = (Context) C9613q.m31802c(context, "The application context is required.");
        this.f36010c = (C9311s0) C9613q.m31802c(c9311s0, "The BuildInfoProvider is required.");
        this.f36011d = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "The Logger is required.");
        this.f36012e = (String[]) C9613q.m31802c(strArr, "The root Files are required.");
        this.f36013f = (String[]) C9613q.m31802c(strArr2, "The root packages are required.");
        this.f36014g = (Runtime) C9613q.m31802c(runtime, "The Runtime is required.");
    }
}
