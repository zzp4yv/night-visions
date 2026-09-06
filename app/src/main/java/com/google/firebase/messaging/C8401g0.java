package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.C8372j;
import java.util.List;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.g0 */
/* loaded from: classes2.dex */
class C8401g0 {

    /* renamed from: a */
    private final Context f31992a;

    /* renamed from: b */
    private String f31993b;

    /* renamed from: c */
    private String f31994c;

    /* renamed from: d */
    private int f31995d;

    /* renamed from: e */
    private int f31996e = 0;

    C8401g0(Context context) {
        this.f31992a = context;
    }

    /* renamed from: c */
    static String m26540c(C8372j c8372j) {
        String m26425d = c8372j.m26406l().m26425d();
        if (m26425d != null) {
            return m26425d;
        }
        String m26424c = c8372j.m26406l().m26424c();
        if (!m26424c.startsWith("1:")) {
            return m26424c;
        }
        String[] split = m26424c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m26541f(String str) {
        try {
            return this.f31992a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m26542h() {
        PackageInfo m26541f = m26541f(this.f31992a.getPackageName());
        if (m26541f != null) {
            this.f31993b = Integer.toString(m26541f.versionCode);
            this.f31994c = m26541f.versionName;
        }
    }

    /* renamed from: a */
    synchronized String m26543a() {
        if (this.f31993b == null) {
            m26542h();
        }
        return this.f31993b;
    }

    /* renamed from: b */
    synchronized String m26544b() {
        if (this.f31994c == null) {
            m26542h();
        }
        return this.f31994c;
    }

    /* renamed from: d */
    synchronized int m26545d() {
        PackageInfo m26541f;
        if (this.f31995d == 0 && (m26541f = m26541f("com.google.android.gms")) != null) {
            this.f31995d = m26541f.versionCode;
        }
        return this.f31995d;
    }

    /* renamed from: e */
    synchronized int m26546e() {
        int i2 = this.f31996e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f31992a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (!PlatformVersion.m14647k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f31996e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f31996e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.m14647k()) {
            this.f31996e = 2;
            i3 = 2;
        } else {
            this.f31996e = 1;
        }
        return i3;
    }

    /* renamed from: g */
    boolean m26547g() {
        return m26546e() != 0;
    }
}
