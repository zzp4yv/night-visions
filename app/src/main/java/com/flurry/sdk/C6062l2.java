package com.flurry.sdk;

import android.os.Handler;
import android.os.Looper;
import com.flurry.sdk.AbstractC6019g4;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.l2 */
/* loaded from: classes2.dex */
public class C6062l2 extends C5983c5 {

    /* renamed from: m */
    private static final ThreadLocal<C6062l2> f16106m = new ThreadLocal<>();

    /* renamed from: n */
    private Thread f16107n;

    public C6062l2(String str, AbstractC6019g4 abstractC6019g4) {
        super(str, abstractC6019g4, false);
    }

    @Override // com.flurry.sdk.AbstractC6019g4
    /* renamed from: l */
    protected void mo13079l(Runnable runnable) {
        if (Thread.currentThread() == this.f16107n) {
            runnable.run();
        }
    }

    @Override // com.flurry.sdk.C5983c5, com.flurry.sdk.AbstractC6019g4
    /* renamed from: m */
    public Future<Void> mo13007m(Runnable runnable) {
        return super.mo13007m(runnable);
    }

    @Override // com.flurry.sdk.C5983c5, com.flurry.sdk.AbstractC6019g4
    /* renamed from: n */
    protected void mo13008n(Runnable runnable) {
        synchronized (this) {
            if (this.f16107n != Thread.currentThread()) {
                super.mo13008n(runnable);
                return;
            }
            if (runnable instanceof AbstractC6019g4.b) {
                AbstractC6019g4 abstractC6019g4 = this.f15916h;
                if (abstractC6019g4 != null) {
                    abstractC6019g4.mo13008n(runnable);
                }
            } else {
                runnable.run();
            }
        }
    }

    @Override // com.flurry.sdk.C5983c5, com.flurry.sdk.AbstractC6019g4
    /* renamed from: p */
    protected boolean mo13009p(Runnable runnable) {
        ThreadLocal<C6062l2> threadLocal;
        C6062l2 c6062l2;
        Thread thread;
        synchronized (this) {
            threadLocal = f16106m;
            c6062l2 = threadLocal.get();
            threadLocal.set(this);
            thread = this.f16107n;
            this.f16107n = Thread.currentThread();
        }
        try {
            m13080o(runnable);
            synchronized (this) {
                this.f16107n = thread;
                threadLocal.set(c6062l2);
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                this.f16107n = thread;
                f16106m.set(c6062l2);
                throw th;
            }
        }
    }

    /* renamed from: r */
    protected void m13177r(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
