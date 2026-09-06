package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzn extends Thread {

    /* renamed from: f */
    private final BlockingQueue<zzr<?>> f26617f;

    /* renamed from: g */
    private final zzm f26618g;

    /* renamed from: h */
    private final zzb f26619h;

    /* renamed from: i */
    private final zzab f26620i;

    /* renamed from: j */
    private volatile boolean f26621j = false;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzmVar, zzb zzbVar, zzab zzabVar) {
        this.f26617f = blockingQueue;
        this.f26618g = zzmVar;
        this.f26619h = zzbVar;
        this.f26620i = zzabVar;
    }

    /* renamed from: a */
    private final void m20301a() throws InterruptedException {
        zzr<?> take = this.f26617f.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.m20413A(3);
        try {
            take.m20418I("network-queue-take");
            take.m20431u();
            TrafficStats.setThreadStatsTag(take.m20420K());
            zzp mo16589a = this.f26618g.mo16589a(take);
            take.m20418I("network-http-complete");
            if (mo16589a.f26743e && take.m20427T()) {
                take.m20419J("not-modified");
                take.m20428U();
                return;
            }
            zzy<?> mo17084y = take.mo17084y(mo16589a);
            take.m20418I("network-parse-complete");
            if (take.m20423P() && mo17084y.f27424b != null) {
                this.f26619h.mo16744v(take.m20421M(), mo17084y.f27424b);
                take.m20418I("network-cache-written");
            }
            take.m20426S();
            this.f26620i.mo16227c(take, mo17084y);
            take.m20415E(mo17084y);
        } catch (Exception e2) {
            zzag.m16530e(e2, "Unhandled exception %s", e2.toString());
            zzaf zzafVar = new zzaf(e2);
            zzafVar.m16492a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f26620i.mo16225a(take, zzafVar);
            take.m20428U();
        } catch (zzaf e3) {
            e3.m16492a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f26620i.mo16225a(take, e3);
            take.m20428U();
        } finally {
            take.m20413A(4);
        }
    }

    /* renamed from: b */
    public final void m20302b() {
        this.f26621j = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m20301a();
            } catch (InterruptedException unused) {
                if (this.f26621j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.m16527b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
