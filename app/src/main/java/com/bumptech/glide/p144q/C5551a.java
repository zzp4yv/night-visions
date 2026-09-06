package com.bumptech.glide.p144q;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.InterfaceC5390f;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ApplicationVersionSignature.java */
/* renamed from: com.bumptech.glide.q.a */
/* loaded from: classes.dex */
public final class C5551a {

    /* renamed from: a */
    private static final ConcurrentMap<String, InterfaceC5390f> f14019a = new ConcurrentHashMap();

    /* renamed from: a */
    private static PackageInfo m11009a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e2);
            return null;
        }
    }

    /* renamed from: b */
    private static String m11010b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static InterfaceC5390f m11011c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC5390f> concurrentMap = f14019a;
        InterfaceC5390f interfaceC5390f = concurrentMap.get(packageName);
        if (interfaceC5390f != null) {
            return interfaceC5390f;
        }
        InterfaceC5390f m11012d = m11012d(context);
        InterfaceC5390f putIfAbsent = concurrentMap.putIfAbsent(packageName, m11012d);
        return putIfAbsent == null ? m11012d : putIfAbsent;
    }

    /* renamed from: d */
    private static InterfaceC5390f m11012d(Context context) {
        return new C5553c(m11010b(m11009a(context)));
    }
}
