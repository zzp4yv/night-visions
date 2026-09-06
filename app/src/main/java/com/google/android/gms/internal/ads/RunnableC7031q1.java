package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.q1 */
/* loaded from: classes2.dex */
final class RunnableC7031q1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzala f20363f;

    /* renamed from: g */
    private final /* synthetic */ zzajw f20364g;

    /* renamed from: h */
    private final /* synthetic */ zzakh f20365h;

    RunnableC7031q1(zzakh zzakhVar, zzala zzalaVar, zzajw zzajwVar) {
        this.f20365h = zzakhVar;
        this.f20363f = zzalaVar;
        this.f20364g = zzajwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.f20365h.f22080a;
        synchronized (obj) {
            if (this.f20363f.m17388a() != -1 && this.f20363f.m17388a() != 1) {
                this.f20363f.m17389b();
                Executor executor = zzbbm.f22757a;
                zzajw zzajwVar = this.f20364g;
                zzajwVar.getClass();
                executor.execute(RunnableC7068r1.m15815a(zzajwVar));
                zzawz.m17082m("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
