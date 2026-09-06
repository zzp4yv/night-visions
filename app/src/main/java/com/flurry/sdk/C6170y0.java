package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.y0 */
/* loaded from: classes2.dex */
public final class C6170y0 extends C5979c1<C6052k1> {

    /* renamed from: e */
    private static C6170y0 f16525e;

    protected C6170y0() {
        super("HttpRequestManager", TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C5961a1()));
    }

    /* renamed from: f */
    public static synchronized C6170y0 m13378f() {
        C6170y0 c6170y0;
        synchronized (C6170y0.class) {
            if (f16525e == null) {
                f16525e = new C6170y0();
            }
            c6170y0 = f16525e;
        }
        return c6170y0;
    }
}
