package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes2.dex */
final class C7828x3 extends Thread {

    /* renamed from: f */
    private final Object f28989f;

    /* renamed from: g */
    private final BlockingQueue<C7810v3<?>> f28990g;

    /* renamed from: h */
    private final /* synthetic */ zzfu f28991h;

    public C7828x3(zzfu zzfuVar, String str, BlockingQueue<C7810v3<?>> blockingQueue) {
        this.f28991h = zzfuVar;
        Preconditions.m14372k(str);
        Preconditions.m14372k(blockingQueue);
        this.f28989f = new Object();
        this.f28990g = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m22871b(InterruptedException interruptedException) {
        this.f28991h.mo22836h().m23140K().m23148b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m22872a() {
        synchronized (this.f28989f) {
            this.f28989f.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C7828x3 c7828x3;
        C7828x3 c7828x32;
        Object obj3;
        Object obj4;
        Semaphore semaphore2;
        Object obj5;
        C7828x3 c7828x33;
        C7828x3 c7828x34;
        boolean z;
        Semaphore semaphore3;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore3 = this.f28991h.f29269k;
                semaphore3.acquire();
                z2 = true;
            } catch (InterruptedException e2) {
                m22871b(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C7810v3<?> poll = this.f28990g.poll();
                if (poll == null) {
                    synchronized (this.f28989f) {
                        if (this.f28990g.peek() == null) {
                            z = this.f28991h.f29270l;
                            if (!z) {
                                try {
                                    this.f28989f.wait(30000L);
                                } catch (InterruptedException e3) {
                                    m22871b(e3);
                                }
                            }
                        }
                    }
                    obj3 = this.f28991h.f29268j;
                    synchronized (obj3) {
                        if (this.f28990g.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(poll.f28949g ? threadPriority : 10);
                    poll.run();
                }
            }
            obj4 = this.f28991h.f29268j;
            synchronized (obj4) {
                semaphore2 = this.f28991h.f29269k;
                semaphore2.release();
                obj5 = this.f28991h.f29268j;
                obj5.notifyAll();
                c7828x33 = this.f28991h.f29262d;
                if (this == c7828x33) {
                    zzfu.m23193u(this.f28991h, null);
                } else {
                    c7828x34 = this.f28991h.f29263e;
                    if (this == c7828x34) {
                        zzfu.m23187A(this.f28991h, null);
                    } else {
                        this.f28991h.mo22836h().m23137H().m23147a("Current scheduler thread is neither worker nor network");
                    }
                }
            }
        } catch (Throwable th) {
            obj = this.f28991h.f29268j;
            synchronized (obj) {
                semaphore = this.f28991h.f29269k;
                semaphore.release();
                obj2 = this.f28991h.f29268j;
                obj2.notifyAll();
                c7828x3 = this.f28991h.f29262d;
                if (this != c7828x3) {
                    c7828x32 = this.f28991h.f29263e;
                    if (this == c7828x32) {
                        zzfu.m23187A(this.f28991h, null);
                    } else {
                        this.f28991h.mo22836h().m23137H().m23147a("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    zzfu.m23193u(this.f28991h, null);
                }
                throw th;
            }
        }
    }
}
