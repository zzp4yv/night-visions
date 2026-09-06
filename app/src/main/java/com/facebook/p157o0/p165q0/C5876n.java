package com.facebook.p157o0.p165q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.notification.PullingContentService;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.facebook.EnumC5626g0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.p156v0.C5702b;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.C5792g0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: SessionLogger.kt */
/* renamed from: com.facebook.o0.q0.n */
/* loaded from: classes2.dex */
public final class C5876n {

    /* renamed from: a */
    public static final C5876n f15400a = new C5876n();

    /* renamed from: b */
    private static final String f15401b = C5876n.class.getCanonicalName();

    /* renamed from: c */
    private static final long[] f15402c = {LocalNotificationSyncManager.FIVE_MINUTES, 900000, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS, 3600000, 21600000, 43200000, PullingContentService.UPDATES_INTERVAL, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private C5876n() {
    }

    /* renamed from: a */
    private final String m12665a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String m32354n = C9768m.m32354n("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(m32354n, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            C5874l c5874l = C5874l.f15386a;
            String m12648c = C5874l.m12648c(context, null);
            if (m12648c == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                C9768m.m32345e(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                m12648c = C5874l.m12647b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(m32354n, m12648c).apply();
            return m12648c;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final int m12666b(long j2) {
        int i2 = 0;
        while (true) {
            long[] jArr = f15402c;
            if (i2 >= jArr.length || jArr[i2] >= j2) {
                break;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: c */
    public static final void m12667c(String str, C5877o c5877o, String str2, Context context) {
        String c5877o2;
        C9768m.m32346f(str, "activityName");
        C9768m.m32346f(context, "context");
        String str3 = "Unclassified";
        if (c5877o != null && (c5877o2 = c5877o.toString()) != null) {
            str3 = c5877o2;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", str3);
        bundle.putString("fb_mobile_pckg_fp", f15400a.m12665a(context));
        C5702b c5702b = C5702b.f14633a;
        bundle.putString("fb_mobile_app_cert_hash", C5702b.m11806a(context));
        C5792g0.a aVar = C5792g0.f14949a;
        C5792g0 m12249a = aVar.m12249a(str, str2, null);
        m12249a.m12242d("fb_mobile_activate_app", bundle);
        if (aVar.m12251c() != C5780a0.b.EXPLICIT_ONLY) {
            m12249a.m12239a();
        }
    }

    /* renamed from: d */
    private final void m12668d() {
        C5651j0.a aVar = C5651j0.f14429a;
        EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
        String str = f15401b;
        C9768m.m32343c(str);
        aVar.m11454b(enumC5626g0, str, "Clock skew detected");
    }

    /* renamed from: e */
    public static final void m12669e(String str, C5875m c5875m, String str2) {
        long longValue;
        String c5877o;
        C9768m.m32346f(str, "activityName");
        if (c5875m == null) {
            return;
        }
        Long m12651b = c5875m.m12651b();
        if (m12651b == null) {
            Long m12654e = c5875m.m12654e();
            longValue = 0 - (m12654e == null ? 0L : m12654e.longValue());
        } else {
            longValue = m12651b.longValue();
        }
        if (longValue < 0) {
            f15400a.m12668d();
            longValue = 0;
        }
        long m12655f = c5875m.m12655f();
        if (m12655f < 0) {
            f15400a.m12668d();
            m12655f = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", c5875m.m12652c());
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m12666b(longValue))}, 1));
        C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("fb_mobile_time_between_sessions", format);
        C5877o m12656g = c5875m.m12656g();
        String str3 = "Unclassified";
        if (m12656g != null && (c5877o = m12656g.toString()) != null) {
            str3 = c5877o;
        }
        bundle.putString("fb_mobile_launch_source", str3);
        Long m12654e2 = c5875m.m12654e();
        bundle.putLong("_logTime", (m12654e2 != null ? m12654e2.longValue() : 0L) / 1000);
        C5792g0 m12249a = C5792g0.f14949a.m12249a(str, str2, null);
        double d2 = m12655f;
        double d3 = 1000L;
        Double.isNaN(d2);
        Double.isNaN(d3);
        m12249a.m12241c("fb_mobile_deactivate_app", d2 / d3, bundle);
    }
}
