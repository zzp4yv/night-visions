package com.flurry.sdk;

/* renamed from: com.flurry.sdk.l0 */
/* loaded from: classes2.dex */
public final class C6060l0 {

    /* renamed from: a */
    private static C6060l0 f16103a;

    private C6060l0() {
    }

    /* renamed from: a */
    public static synchronized C6060l0 m13174a() {
        C6060l0 c6060l0;
        synchronized (C6060l0.class) {
            if (f16103a == null) {
                f16103a = new C6060l0();
            }
            c6060l0 = f16103a;
        }
        return c6060l0;
    }
}
