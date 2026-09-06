package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ly */
/* loaded from: classes2.dex */
final class ThreadFactoryC6879ly implements ThreadFactory {

    /* renamed from: f */
    private final ThreadFactory f19850f = Executors.defaultThreadFactory();

    /* renamed from: g */
    private final AtomicInteger f19851g = new AtomicInteger(1);

    ThreadFactoryC6879ly() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f19850f.newThread(runnable);
        int andIncrement = this.f19851g.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
