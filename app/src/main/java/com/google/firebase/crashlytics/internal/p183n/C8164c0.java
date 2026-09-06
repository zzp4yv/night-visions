package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.InterfaceC8142d;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* renamed from: com.google.firebase.crashlytics.h.n.c0 */
/* loaded from: classes2.dex */
class C8164c0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private final a f30884f;

    /* renamed from: g */
    private final InterfaceC8279i f30885g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f30886h;

    /* renamed from: i */
    private final InterfaceC8142d f30887i;

    /* renamed from: j */
    private final AtomicBoolean f30888j = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.c0$a */
    interface a {
        /* renamed from: a */
        void mo25231a(InterfaceC8279i interfaceC8279i, Thread thread, Throwable th);
    }

    public C8164c0(a aVar, InterfaceC8279i interfaceC8279i, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC8142d interfaceC8142d) {
        this.f30884f = aVar;
        this.f30885g = interfaceC8279i;
        this.f30886h = uncaughtExceptionHandler;
        this.f30887i = interfaceC8142d;
    }

    /* renamed from: b */
    private boolean m25229b(Thread thread, Throwable th) {
        if (thread == null) {
            C8146h.m25176f().m25179d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            C8146h.m25176f().m25179d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f30887i.mo25154b()) {
            return true;
        }
        C8146h.m25176f().m25177b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* renamed from: a */
    boolean m25230a() {
        return this.f30888j.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.firebase.crashlytics.h.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.crashlytics.h.h] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.f30888j.set(true);
        try {
            try {
                if (m25229b(thread, th)) {
                    this.f30884f.mo25231a(this.f30885g, thread, th);
                } else {
                    C8146h.m25176f().m25177b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e2) {
                C8146h.m25176f().m25180e("An error occurred in the uncaught exception handler", e2);
            }
        } finally {
            C8146h.m25176f().m25177b(r0);
            this.f30886h.uncaughtException(thread, th);
            this.f30888j.set(false);
        }
    }
}
