package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t1 */
/* loaded from: classes2.dex */
final class C7142t1 implements zzbbt {

    /* renamed from: a */
    private final /* synthetic */ zzala f20548a;

    /* renamed from: b */
    private final /* synthetic */ zzakh f20549b;

    C7142t1(zzakh zzakhVar, zzala zzalaVar) {
        this.f20549b = zzakhVar;
        this.f20548a = zzalaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbt
    public final void run() {
        Object obj;
        obj = this.f20549b.f22080a;
        synchronized (obj) {
            this.f20549b.f22087h = 1;
            zzawz.m17082m("Failed loading new engine. Marking new engine destroyable.");
            this.f20548a.m16651i();
        }
    }
}
