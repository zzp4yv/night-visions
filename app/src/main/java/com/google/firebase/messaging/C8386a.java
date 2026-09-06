package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0245i;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.BuildConfig;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes2.dex */
public final class C8386a {

    /* renamed from: a */
    private static final AtomicInteger f31955a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.a$a */
    public static class a {

        /* renamed from: a */
        public final C0245i.e f31956a;

        /* renamed from: b */
        public final String f31957b;

        /* renamed from: c */
        public final int f31958c = 0;

        a(C0245i.e eVar, String str, int i2) {
            this.f31956a = eVar;
            this.f31957b = str;
        }
    }

    /* renamed from: a */
    private static PendingIntent m26463a(Context context, C8403h0 c8403h0, String str, PackageManager packageManager) {
        Intent m26468f = m26468f(str, c8403h0, packageManager);
        if (m26468f == null) {
            return null;
        }
        m26468f.addFlags(67108864);
        m26468f.putExtras(c8403h0.m26573y());
        PendingIntent activity = PendingIntent.getActivity(context, m26469g(), m26468f, m26474l(1073741824));
        return m26479q(c8403h0) ? m26480r(context, c8403h0, activity) : activity;
    }

    /* renamed from: b */
    private static PendingIntent m26464b(Context context, C8403h0 c8403h0) {
        if (m26479q(c8403h0)) {
            return m26465c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c8403h0.m26572x()));
        }
        return null;
    }

    /* renamed from: c */
    private static PendingIntent m26465c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m26469g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m26474l(1073741824));
    }

    /* renamed from: d */
    static a m26466d(Context context, C8403h0 c8403h0) {
        Bundle m26472j = m26472j(context.getPackageManager(), context.getPackageName());
        return m26467e(context, context.getPackageName(), c8403h0, m26473k(context, c8403h0.m26564k(), m26472j), context.getResources(), context.getPackageManager(), m26472j);
    }

    /* renamed from: e */
    public static a m26467e(Context context, String str, C8403h0 c8403h0, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        C0245i.e eVar = new C0245i.e(context, str2);
        String m26567n = c8403h0.m26567n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(m26567n)) {
            eVar.m1597l(m26567n);
        }
        String m26567n2 = c8403h0.m26567n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(m26567n2)) {
            eVar.m1596k(m26567n2);
            eVar.m1583A(new C0245i.c().m1576h(m26567n2));
        }
        eVar.m1609y(m26475m(packageManager, resources, str, c8403h0.m26569p("gcm.n.icon"), bundle));
        Uri m26476n = m26476n(str, c8403h0, resources);
        if (m26476n != null) {
            eVar.m1610z(m26476n);
        }
        eVar.m1595j(m26463a(context, c8403h0, str, packageManager));
        PendingIntent m26464b = m26464b(context, c8403h0);
        if (m26464b != null) {
            eVar.m1599n(m26464b);
        }
        Integer m26470h = m26470h(context, c8403h0.m26569p("gcm.n.color"), bundle);
        if (m26470h != null) {
            eVar.m1594i(m26470h.intValue());
        }
        eVar.m1592g(!c8403h0.m26555a("gcm.n.sticky"));
        eVar.m1602r(c8403h0.m26555a("gcm.n.local_only"));
        String m26569p = c8403h0.m26569p("gcm.n.ticker");
        if (m26569p != null) {
            eVar.m1584B(m26569p);
        }
        Integer m26566m = c8403h0.m26566m();
        if (m26566m != null) {
            eVar.m1606v(m26566m.intValue());
        }
        Integer m26571r = c8403h0.m26571r();
        if (m26571r != null) {
            eVar.m1586D(m26571r.intValue());
        }
        Integer m26565l = c8403h0.m26565l();
        if (m26565l != null) {
            eVar.m1603s(m26565l.intValue());
        }
        Long m26563j = c8403h0.m26563j("gcm.n.event_time");
        if (m26563j != null) {
            eVar.m1608x(true);
            eVar.m1587E(m26563j.longValue());
        }
        long[] m26570q = c8403h0.m26570q();
        if (m26570q != null) {
            eVar.m1585C(m26570q);
        }
        int[] m26558e = c8403h0.m26558e();
        if (m26558e != null) {
            eVar.m1601q(m26558e[0], m26558e[1], m26558e[2]);
        }
        eVar.m1598m(m26471i(c8403h0));
        return new a(eVar, m26477o(c8403h0), 0);
    }

    /* renamed from: f */
    private static Intent m26468f(String str, C8403h0 c8403h0, PackageManager packageManager) {
        String m26569p = c8403h0.m26569p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m26569p)) {
            Intent intent = new Intent(m26569p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m26559f = c8403h0.m26559f();
        if (m26559f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m26559f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m26469g() {
        return f31955a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m26470h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(C0255a.m1675d(context, i2));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: i */
    private static int m26471i(C8403h0 c8403h0) {
        boolean m26555a = c8403h0.m26555a("gcm.n.default_sound");
        ?? r0 = m26555a;
        if (c8403h0.m26555a("gcm.n.default_vibrate_timings")) {
            r0 = (m26555a ? 1 : 0) | 2;
        }
        return c8403h0.m26555a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    /* renamed from: j */
    private static Bundle m26472j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m26473k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb.toString());
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (TextUtils.isEmpty(string2)) {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                } else {
                    if (notificationManager.getNotificationChannel(string2) != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: l */
    private static int m26474l(int i2) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    /* renamed from: m */
    private static int m26475m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m26478p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m26478p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i2 == 0 || !m26478p(resources, i2)) {
            try {
                i2 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        return (i2 == 0 || !m26478p(resources, i2)) ? R.drawable.sym_def_app_icon : i2;
    }

    /* renamed from: n */
    private static Uri m26476n(String str, C8403h0 c8403h0, Resources resources) {
        String m26568o = c8403h0.m26568o();
        if (TextUtils.isEmpty(m26568o)) {
            return null;
        }
        if (BuildConfig.APTOIDE_THEME.equals(m26568o) || resources.getIdentifier(m26568o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(m26568o).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(m26568o);
        return Uri.parse(sb.toString());
    }

    /* renamed from: o */
    private static String m26477o(C8403h0 c8403h0) {
        String m26569p = c8403h0.m26569p("gcm.n.tag");
        if (!TextUtils.isEmpty(m26569p)) {
            return m26569p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    @TargetApi(26)
    /* renamed from: p */
    private static boolean m26478p(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i2);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i2);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* renamed from: q */
    static boolean m26479q(C8403h0 c8403h0) {
        return c8403h0.m26555a("google.c.a.e");
    }

    /* renamed from: r */
    private static PendingIntent m26480r(Context context, C8403h0 c8403h0, PendingIntent pendingIntent) {
        return m26465c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(c8403h0.m26572x()).putExtra("pending_intent", pendingIntent));
    }
}
