package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rc */
/* loaded from: classes2.dex */
final class C7079rc implements zzaho<Object> {

    /* renamed from: a */
    final /* synthetic */ zzbmg f20445a;

    C7079rc(zzbmg zzbmgVar) {
        this.f20445a = zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        boolean m17887h;
        zzbmn zzbmnVar;
        Executor executor;
        m17887h = this.f20445a.m17887h(map);
        if (m17887h) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21909z4)).booleanValue()) {
                executor = this.f20445a.f23232c;
                executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sc

                    /* renamed from: f */
                    private final C7079rc f20517f;

                    {
                        this.f20517f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmn zzbmnVar2;
                        zzbmnVar2 = this.f20517f.f20445a.f23233d;
                        zzbmnVar2.m17897q();
                    }
                });
            } else {
                zzbmnVar = this.f20445a.f23233d;
                zzbmnVar.m17897q();
            }
        }
    }
}
