package com.flurry.sdk;

/* renamed from: com.flurry.sdk.m0 */
/* loaded from: classes2.dex */
public final class C6069m0 {

    /* renamed from: a */
    private static C6069m0 f16123a;

    private C6069m0() {
    }

    /* renamed from: a */
    public static synchronized C6069m0 m13179a() {
        C6069m0 c6069m0;
        synchronized (C6069m0.class) {
            if (f16123a == null) {
                f16123a = new C6069m0();
            }
            c6069m0 = f16123a;
        }
        return c6069m0;
    }
}
