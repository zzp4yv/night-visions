package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s1 */
/* loaded from: classes2.dex */
final class C7105s1 implements zzbbv<zzajw> {

    /* renamed from: a */
    private final /* synthetic */ zzala f20490a;

    /* renamed from: b */
    private final /* synthetic */ zzakh f20491b;

    C7105s1(zzakh zzakhVar, zzala zzalaVar) {
        this.f20491b = zzakhVar;
        this.f20490a = zzalaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbv
    /* renamed from: a */
    public final /* synthetic */ void mo14740a(zzajw zzajwVar) {
        Object obj;
        zzala zzalaVar;
        zzala zzalaVar2;
        zzala zzalaVar3;
        obj = this.f20491b.f22080a;
        synchronized (obj) {
            this.f20491b.f22087h = 0;
            zzalaVar = this.f20491b.f22086g;
            if (zzalaVar != null) {
                zzala zzalaVar4 = this.f20490a;
                zzalaVar2 = this.f20491b.f22086g;
                if (zzalaVar4 != zzalaVar2) {
                    zzawz.m17082m("New JS engine is loaded, marking previous one as destroyable.");
                    zzalaVar3 = this.f20491b.f22086g;
                    zzalaVar3.m16651i();
                }
            }
            this.f20491b.f22086g = this.f20490a;
        }
    }
}
