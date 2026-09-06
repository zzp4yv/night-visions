package com.facebook.internal;

import com.facebook.C5608a0;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.C9768m;

/* compiled from: LockOnGetVariable.kt */
/* renamed from: com.facebook.internal.i0 */
/* loaded from: classes2.dex */
public final class C5649i0<T> {

    /* renamed from: a */
    private T f14426a;

    /* renamed from: b */
    private CountDownLatch f14427b;

    public C5649i0(final Callable<T> callable) {
        C9768m.m32346f(callable, "callable");
        this.f14427b = new CountDownLatch(1);
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5608a0.m11292k().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m11443a;
                m11443a = C5649i0.m11443a(C5649i0.this, callable);
                return m11443a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final Void m11443a(C5649i0 c5649i0, Callable callable) {
        C9768m.m32346f(c5649i0, "this$0");
        C9768m.m32346f(callable, "$callable");
        try {
            c5649i0.f14426a = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = c5649i0.f14427b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
