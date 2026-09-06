package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.C5608a0;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9768m;

/* compiled from: Validate.kt */
/* renamed from: com.facebook.internal.q0 */
/* loaded from: classes2.dex */
public final class C5665q0 {

    /* renamed from: a */
    public static final C5665q0 f14500a = new C5665q0();

    /* renamed from: b */
    private static final String f14501b = C5665q0.class.getName();

    private C5665q0() {
    }

    /* renamed from: a */
    public static final <T> void m11633a(Collection<? extends T> collection, String str) {
        C9768m.m32346f(collection, "container");
        C9768m.m32346f(str, "name");
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* renamed from: b */
    public static final String m11634b() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        String m11285d = C5608a0.m11285d();
        if (m11285d != null) {
            return m11285d;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    /* renamed from: c */
    public static final String m11635c() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        String m11290i = C5608a0.m11290i();
        if (m11290i != null) {
            return m11290i;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    /* renamed from: d */
    public static final boolean m11636d(Context context, String str) {
        List<ResolveInfo> list;
        C9768m.m32346f(context, "context");
        C9768m.m32346f(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!C9768m.m32341a(activityInfo.name, "com.facebook.CustomTabActivity") || !C9768m.m32341a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11637e(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9768m.m32346f(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L18
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L31
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L27
            java.lang.String r4 = com.facebook.internal.C5665q0.f14501b
            android.util.Log.w(r4, r5)
            goto L31
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5665q0.m11637e(android.content.Context, boolean):void");
    }

    /* renamed from: f */
    public static final void m11638f(Context context, boolean z) {
        C9768m.m32346f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!z)) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
            }
            Log.w(f14501b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* renamed from: g */
    public static final void m11639g(String str, String str2) {
        C9768m.m32346f(str, "arg");
        C9768m.m32346f(str2, "name");
        if (str.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
    }

    /* renamed from: h */
    public static final <T> void m11640h(Collection<? extends T> collection, String str) {
        C9768m.m32346f(collection, "container");
        C9768m.m32346f(str, "name");
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
    }

    /* renamed from: i */
    public static final <T> void m11641i(Collection<? extends T> collection, String str) {
        C9768m.m32346f(collection, "container");
        C9768m.m32346f(str, "name");
        m11633a(collection, str);
        m11640h(collection, str);
    }

    /* renamed from: j */
    public static final void m11642j(Object obj, String str) {
        C9768m.m32346f(str, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if ((r3.length() > 0) != false) goto L11;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m11643k(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C9768m.m32346f(r4, r0)
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L15
            int r2 = r3.length()
            if (r2 <= 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L19
            return r3
        L19:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Argument '"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = "' cannot be null or empty"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5665q0.m11643k(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: l */
    public static final void m11644l() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (!C5608a0.m11304w()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
