package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.C5608a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10770n;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: CustomTabUtils.kt */
/* renamed from: com.facebook.internal.v */
/* loaded from: classes2.dex */
public final class C5700v {

    /* renamed from: a */
    public static final C5700v f14626a = new C5700v();

    /* renamed from: b */
    private static final String[] f14627b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private C5700v() {
    }

    /* renamed from: a */
    public static final String m11803a() {
        HashSet m38739S;
        C5608a0 c5608a0 = C5608a0.f14199a;
        Context m11284c = C5608a0.m11284c();
        List<ResolveInfo> queryIntentServices = m11284c.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        C9768m.m32345e(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
        m38739S = C10770n.m38739S(f14627b);
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && m38739S.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final String m11804b() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C9768m.m32354n("fbconnect://cct.", C5608a0.m11284c().getPackageName());
    }

    /* renamed from: c */
    public static final String m11805c(String str) {
        C9768m.m32346f(str, "developerDefinedRedirectURI");
        C5665q0 c5665q0 = C5665q0.f14500a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C5665q0.m11636d(C5608a0.m11284c(), str) ? str : C5665q0.m11636d(C5608a0.m11284c(), m11804b()) ? m11804b() : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
