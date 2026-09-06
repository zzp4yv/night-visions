package com.facebook.p157o0.p167s0;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.C5608a0;
import com.facebook.p157o0.C5908v;
import java.util.Set;
import kotlin.collections.C10782t;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9768m;

/* compiled from: OnDeviceProcessingManager.kt */
/* renamed from: com.facebook.o0.s0.c */
/* loaded from: classes2.dex */
public final class C5892c {

    /* renamed from: a */
    public static final C5892c f15458a = new C5892c();

    /* renamed from: b */
    private static final Set<String> f15459b;

    static {
        Set<String> m38922i;
        m38922i = C10789w0.m38922i("fb_mobile_purchase", "StartTrial", "Subscribe");
        f15459b = m38922i;
    }

    private C5892c() {
    }

    /* renamed from: a */
    private final boolean m12740a(C5908v c5908v) {
        return (c5908v.m12840h() ^ true) || (c5908v.m12840h() && f15459b.contains(c5908v.m12838f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m12741b() {
        /*
            com.facebook.a0 r0 = com.facebook.C5608a0.f14199a
            android.content.Context r0 = com.facebook.C5608a0.m11284c()
            boolean r0 = com.facebook.C5608a0.m11298q(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            com.facebook.internal.p0 r0 = com.facebook.internal.C5663p0.f14478a
            boolean r0 = com.facebook.internal.C5663p0.m11553X()
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L24
            com.facebook.o0.s0.e r0 = com.facebook.p157o0.p167s0.C5894e.f15462a
            boolean r0 = com.facebook.p157o0.p167s0.C5894e.m12752b()
            if (r0 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p167s0.C5892c.m12741b():boolean");
    }

    /* renamed from: e */
    public static final void m12744e(final String str, final C5908v c5908v) {
        C9768m.m32346f(str, "applicationId");
        C9768m.m32346f(c5908v, "event");
        if (f15458a.m12740a(c5908v)) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.s0.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5892c.m12745f(str, c5908v);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12745f(String str, C5908v c5908v) {
        C9768m.m32346f(str, "$applicationId");
        C9768m.m32346f(c5908v, "$event");
        C5894e c5894e = C5894e.f15462a;
        C5894e.m12753c(str, C10782t.m38883e(c5908v));
    }

    /* renamed from: g */
    public static final void m12746g(final String str, final String str2) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        final Context m11284c = C5608a0.m11284c();
        if (m11284c == null || str == null || str2 == null) {
            return;
        }
        C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.s0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5892c.m12747h(m11284c, str2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m12747h(Context context, String str, String str2) {
        C9768m.m32346f(context, "$context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        String m32354n = C9768m.m32354n(str2, "pingForOnDevice");
        if (sharedPreferences.getLong(m32354n, 0L) == 0) {
            C5894e c5894e = C5894e.f15462a;
            C5894e.m12755e(str2);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(m32354n, System.currentTimeMillis());
            edit.apply();
        }
    }
}
