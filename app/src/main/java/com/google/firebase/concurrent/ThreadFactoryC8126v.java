package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory.java */
/* renamed from: com.google.firebase.concurrent.v */
/* loaded from: classes2.dex */
class ThreadFactoryC8126v implements ThreadFactory {

    /* renamed from: f */
    private static final ThreadFactory f30807f = Executors.defaultThreadFactory();

    /* renamed from: g */
    private final AtomicLong f30808g = new AtomicLong();

    /* renamed from: h */
    private final String f30809h;

    /* renamed from: i */
    private final int f30810i;

    /* renamed from: j */
    private final StrictMode.ThreadPolicy f30811j;

    ThreadFactoryC8126v(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f30809h = str;
        this.f30810i = i2;
        this.f30811j = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25101b(Runnable runnable) {
        Process.setThreadPriority(this.f30810i);
        StrictMode.ThreadPolicy threadPolicy = this.f30811j;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f30807f.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC8126v.this.m25101b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f30809h, Long.valueOf(this.f30808g.getAndIncrement())));
        return newThread;
    }
}
