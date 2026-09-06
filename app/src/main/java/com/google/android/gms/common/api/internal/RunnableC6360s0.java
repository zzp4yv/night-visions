package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* loaded from: classes2.dex */
final class RunnableC6360s0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C6358r0 f17458f;

    RunnableC6360s0(C6358r0 c6358r0) {
        this.f17458f = c6358r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f17458f.f17455r;
        lock.lock();
        try {
            this.f17458f.m14092y();
        } finally {
            lock2 = this.f17458f.f17455r;
            lock2.unlock();
        }
    }
}
