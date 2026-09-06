package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9506a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ContextUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.t0 */
/* loaded from: classes2.dex */
public final class C9313t0 {

    /* compiled from: ContextUtils.java */
    /* renamed from: io.sentry.android.core.t0$a */
    static class a {

        /* renamed from: a */
        private final boolean f36102a;

        /* renamed from: b */
        private final String f36103b;

        public a(boolean z, String str) {
            this.f36102a = z;
            this.f36103b = str;
        }

        /* renamed from: a */
        public Map<String, String> m30426a() {
            HashMap hashMap = new HashMap();
            hashMap.put("isSideLoaded", String.valueOf(this.f36102a));
            String str = this.f36103b;
            if (str != null) {
                hashMap.put("installerStore", str);
            }
            return hashMap;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    static ApplicationInfo m30409a(Context context, long j2, C9311s0 c9311s0) throws PackageManager.NameNotFoundException {
        return c9311s0.m30406d() >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(j2)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
    }

    /* renamed from: b */
    static String m30410b(Context context, InterfaceC9637w1 interfaceC9637w1) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 != 0) {
                return context.getString(i2);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    static String[] m30411c(C9311s0 c9311s0) {
        return c9311s0.m30406d() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    static String m30412d(Context context, C9311s0 c9311s0) {
        if (c9311s0.m30406d() >= 17) {
            return Settings.Global.getString(context.getContentResolver(), "device_name");
        }
        return null;
    }

    /* renamed from: e */
    static DisplayMetrics m30413e(Context context, InterfaceC9637w1 interfaceC9637w1) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    /* renamed from: f */
    static String m30414f(InterfaceC9637w1 interfaceC9637w1) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    /* renamed from: g */
    static String m30415g(InterfaceC9637w1 interfaceC9637w1) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Exception while attempting to read kernel information", e2);
            return property;
        }
    }

    /* renamed from: h */
    static ActivityManager.MemoryInfo m30416h(Context context, InterfaceC9637w1 interfaceC9637w1) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            interfaceC9637w1.mo30214c(EnumC9554s4.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    static PackageInfo m30417i(Context context, int i2, InterfaceC9637w1 interfaceC9637w1, C9311s0 c9311s0) {
        try {
            return c9311s0.m30406d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i2)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i2);
        } catch (Throwable th) {
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    /* renamed from: j */
    static PackageInfo m30418j(Context context, InterfaceC9637w1 interfaceC9637w1, C9311s0 c9311s0) {
        return m30417i(context, 0, interfaceC9637w1, c9311s0);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: k */
    static String m30419k(PackageInfo packageInfo, C9311s0 c9311s0) {
        return c9311s0.m30406d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : m30420l(packageInfo);
    }

    /* renamed from: l */
    private static String m30420l(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    /* renamed from: m */
    static boolean m30421m(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager) || (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) == null) {
                return false;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    static Intent m30422n(Context context, C9647x4 c9647x4, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return m30423o(context, new C9311s0(c9647x4.getLogger()), broadcastReceiver, intentFilter);
    }

    @SuppressLint({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    /* renamed from: o */
    static Intent m30423o(Context context, C9311s0 c9311s0, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return c9311s0.m30406d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: p */
    static a m30424p(Context context, InterfaceC9637w1 interfaceC9637w1, C9311s0 c9311s0) {
        String str;
        try {
            PackageInfo m30418j = m30418j(context, interfaceC9637w1, c9311s0);
            PackageManager packageManager = context.getPackageManager();
            if (m30418j != null && packageManager != null) {
                str = m30418j.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: q */
    static void m30425q(PackageInfo packageInfo, C9311s0 c9311s0, C9506a c9506a) {
        c9506a.m31197l(packageInfo.packageName);
        c9506a.m31200o(packageInfo.versionName);
        c9506a.m31196k(m30419k(packageInfo, c9311s0));
        if (c9311s0.m30406d() >= 16) {
            HashMap hashMap = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str = strArr[i2];
                    hashMap.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i2] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c9506a.m31202q(hashMap);
        }
    }
}
