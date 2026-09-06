package com.flurry.sdk;

import java.lang.Thread;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.flurry.sdk.q7 */
/* loaded from: classes2.dex */
public final class C6112q7 {

    /* renamed from: a */
    private static C6112q7 f16293a;

    /* renamed from: c */
    final Map<Thread.UncaughtExceptionHandler, Void> f16295c = new WeakHashMap();

    /* renamed from: b */
    final Thread.UncaughtExceptionHandler f16294b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: com.flurry.sdk.q7$a */
    final class a implements Thread.UncaughtExceptionHandler {
        private a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Iterator<Thread.UncaughtExceptionHandler> it = C6112q7.this.m13276b().iterator();
            while (it.hasNext()) {
                try {
                    it.next().uncaughtException(thread, th);
                } catch (Throwable unused) {
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C6112q7.this.f16294b;
            if (uncaughtExceptionHandler != null) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (Throwable unused2) {
                }
            }
        }

        /* synthetic */ a(C6112q7 c6112q7, byte b2) {
            this();
        }
    }

    private C6112q7() {
        Thread.setDefaultUncaughtExceptionHandler(new a(this, (byte) 0));
    }

    /* renamed from: a */
    public static synchronized C6112q7 m13275a() {
        C6112q7 c6112q7;
        synchronized (C6112q7.class) {
            if (f16293a == null) {
                f16293a = new C6112q7();
            }
            c6112q7 = f16293a;
        }
        return c6112q7;
    }

    /* renamed from: b */
    final Set<Thread.UncaughtExceptionHandler> m13276b() {
        Set<Thread.UncaughtExceptionHandler> keySet;
        synchronized (this.f16295c) {
            keySet = this.f16295c.keySet();
        }
        return keySet;
    }
}
