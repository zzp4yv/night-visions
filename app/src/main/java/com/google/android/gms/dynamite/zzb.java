package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzb {

    /* renamed from: a */
    private static volatile ClassLoader f18061a;

    /* renamed from: b */
    private static volatile Thread f18062b;

    /* renamed from: a */
    public static synchronized ClassLoader m14727a() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (f18061a == null) {
                f18061a = m14728b();
            }
            classLoader = f18061a;
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m14728b() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (f18062b == null) {
                f18062b = m14729c();
                if (f18062b == null) {
                    return null;
                }
            }
            synchronized (f18062b) {
                try {
                    classLoader = f18062b.getContextClassLoader();
                } catch (SecurityException e2) {
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e2.getMessage());
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m14729c() {
        SecurityException e2;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i3];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i3++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i2 >= activeCount) {
                            thread2 = null;
                            break;
                        }
                        thread2 = threadArr[i2];
                        if ("GmsDynamite".equals(thread2.getName())) {
                            break;
                        }
                        i2++;
                    }
                } catch (SecurityException e3) {
                    e2 = e3;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new C6423a(threadGroup, "GmsDynamite");
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e4) {
                            e2 = e4;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e2.getMessage());
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e5) {
                        e2 = e5;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
