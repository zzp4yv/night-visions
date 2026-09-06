package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cp */
/* loaded from: classes2.dex */
final class C6537cp implements zzcva<zzcvf> {

    /* renamed from: a */
    private final zzbbl f18462a;

    /* renamed from: b */
    private final Context f18463b;

    public C6537cp(zzbbl zzbblVar, Context context) {
        this.f18462a = zzbblVar;
        this.f18463b = context;
    }

    /* renamed from: a */
    private static ResolveInfo m14979a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* renamed from: c */
    private static String m14980c(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo m14979a = m14979a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (m14979a == null || (activityInfo = m14979a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo m14671e = Wrappers.m14674a(context).m14671e(activityInfo.packageName, 0);
            if (m14671e != null) {
                int i2 = m14671e.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: e */
    private static String m14981e(Context context) {
        try {
            PackageInfo m14671e = Wrappers.m14674a(context).m14671e("com.android.vending", 128);
            if (m14671e != null) {
                int i2 = m14671e.versionCode;
                String str = m14671e.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcvf> mo14982b() {
        return this.f18462a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.dp

            /* renamed from: f */
            private final C6537cp f18698f;

            {
                this.f18698f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18698f.m14983d();
            }
        });
    }

    /* renamed from: d */
    final /* synthetic */ zzcvf m14983d() throws Exception {
        boolean z;
        PackageManager packageManager = this.f18463b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = m14979a(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = m14979a(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean startsWith = Build.DEVICE.startsWith("generic");
        boolean m14621a = DeviceProperties.m14621a(this.f18463b);
        boolean m14622b = DeviceProperties.m14622b(this.f18463b);
        String language = locale.getLanguage();
        String m14980c = m14980c(this.f18463b, packageManager);
        String m14981e = m14981e(this.f18463b);
        String str = Build.FINGERPRINT;
        Context context = this.f18463b;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                        z = resolveActivity.activityInfo.packageName.equals(zzdtv.m19885a(context));
                        break;
                    }
                }
            }
        }
        z = false;
        return new zzcvf(z2, z3, country, startsWith, m14621a, m14622b, language, m14980c, m14981e, str, z, Build.MODEL);
    }
}
