package com.facebook.p157o0.p163o0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.C5608a0;
import com.facebook.internal.C5633a0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;

/* compiled from: InAppPurchaseManager.kt */
/* renamed from: com.facebook.o0.o0.k */
/* loaded from: classes2.dex */
public final class C5855k {

    /* renamed from: a */
    public static final C5855k f15323a = new C5855k();

    /* renamed from: b */
    private static final AtomicBoolean f15324b = new AtomicBoolean(false);

    private C5855k() {
    }

    /* renamed from: a */
    public static final void m12564a() {
        f15324b.set(true);
        m12565b();
    }

    /* renamed from: b */
    public static final void m12565b() {
        if (f15324b.get()) {
            if (f15323a.m12566c()) {
                C5633a0 c5633a0 = C5633a0.f14313a;
                if (C5633a0.m11378g(C5633a0.b.IapLoggingLib2)) {
                    C5851g c5851g = C5851g.f15284a;
                    C5608a0 c5608a0 = C5608a0.f14199a;
                    C5851g.m12509d(C5608a0.m11284c());
                    return;
                }
            }
            C5850f c5850f = C5850f.f15275a;
            C5850f.m12500g();
        }
    }

    /* renamed from: c */
    private final boolean m12566c() {
        List m37582v0;
        try {
            C5608a0 c5608a0 = C5608a0.f14199a;
            Context m11284c = C5608a0.m11284c();
            ApplicationInfo applicationInfo = m11284c.getPackageManager().getApplicationInfo(m11284c.getPackageName(), 128);
            C9768m.m32345e(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            m37582v0 = C10514v.m37582v0(string, new String[]{"."}, false, 3, 2, null);
            return Integer.parseInt((String) m37582v0.get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        }
    }
}
