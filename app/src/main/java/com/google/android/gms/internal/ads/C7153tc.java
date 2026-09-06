package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tc */
/* loaded from: classes2.dex */
final class C7153tc implements zzaho<Object> {

    /* renamed from: a */
    final /* synthetic */ zzbmg f20565a;

    C7153tc(zzbmg zzbmgVar) {
        this.f20565a = zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        boolean m17887h;
        zzbmn zzbmnVar;
        Executor executor;
        m17887h = this.f20565a.m17887h(map);
        if (m17887h) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21909z4)).booleanValue()) {
                executor = this.f20565a.f23232c;
                executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uc

                    /* renamed from: f */
                    private final C7153tc f20628f;

                    {
                        this.f20628f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmn zzbmnVar2;
                        zzbmnVar2 = this.f20628f.f20565a.f23233d;
                        zzbmnVar2.m17898y();
                    }
                });
            } else {
                zzbmnVar = this.f20565a.f23233d;
                zzbmnVar.m17898y();
            }
        }
    }
}
