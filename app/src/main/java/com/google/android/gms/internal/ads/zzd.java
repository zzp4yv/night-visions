package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzd extends Thread {

    /* renamed from: f */
    private static final boolean f25402f = zzag.f21996b;

    /* renamed from: g */
    private final BlockingQueue<zzr<?>> f25403g;

    /* renamed from: h */
    private final BlockingQueue<zzr<?>> f25404h;

    /* renamed from: i */
    private final zzb f25405i;

    /* renamed from: j */
    private final zzab f25406j;

    /* renamed from: k */
    private volatile boolean f25407k = false;

    /* renamed from: l */
    private final C7212uy f25408l = new C7212uy(this);

    public zzd(BlockingQueue<zzr<?>> blockingQueue, BlockingQueue<zzr<?>> blockingQueue2, zzb zzbVar, zzab zzabVar) {
        this.f25403g = blockingQueue;
        this.f25404h = blockingQueue2;
        this.f25405i = zzbVar;
        this.f25406j = zzabVar;
    }

    /* renamed from: a */
    private final void m19118a() throws InterruptedException {
        boolean m15945d;
        boolean m15945d2;
        boolean m15945d3;
        zzr<?> take = this.f25403g.take();
        take.m20418I("cache-queue-take");
        take.m20413A(1);
        try {
            take.m20431u();
            zzc mo16743u = this.f25405i.mo16743u(take.m20421M());
            if (mo16743u == null) {
                take.m20418I("cache-miss");
                m15945d3 = this.f25408l.m15945d(take);
                if (!m15945d3) {
                    this.f25404h.put(take);
                }
                return;
            }
            if (mo16743u.m18612a()) {
                take.m20418I("cache-hit-expired");
                take.m20432v(mo16743u);
                m15945d2 = this.f25408l.m15945d(take);
                if (!m15945d2) {
                    this.f25404h.put(take);
                }
                return;
            }
            take.m20418I("cache-hit");
            zzy<?> mo17084y = take.mo17084y(new zzp(mo16743u.f23917a, mo16743u.f23923g));
            take.m20418I("cache-hit-parsed");
            if (mo16743u.f23922f < System.currentTimeMillis()) {
                take.m20418I("cache-hit-refresh-needed");
                take.m20432v(mo16743u);
                mo17084y.f27426d = true;
                m15945d = this.f25408l.m15945d(take);
                if (m15945d) {
                    this.f25406j.mo16227c(take, mo17084y);
                } else {
                    this.f25406j.mo16226b(take, mo17084y, new RunnableC6916my(this, take));
                }
            } else {
                this.f25406j.mo16227c(take, mo17084y);
            }
        } finally {
            take.m20413A(2);
        }
    }

    /* renamed from: b */
    public final void m19121b() {
        this.f25407k = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f25402f) {
            zzag.m16528c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f25405i.mo16742a();
        while (true) {
            try {
                m19118a();
            } catch (InterruptedException unused) {
                if (this.f25407k) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.m16527b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
