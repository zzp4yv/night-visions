package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;

/* renamed from: com.google.android.gms.internal.ads.oy */
/* loaded from: classes2.dex */
final class RunnableC6990oy implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f20224f;

    /* renamed from: g */
    private final /* synthetic */ boolean f20225g;

    /* renamed from: h */
    private final /* synthetic */ zzdy f20226h;

    RunnableC6990oy(zzdy zzdyVar, int i2, boolean z) {
        this.f20226h = zzdyVar;
        this.f20224f = i2;
        this.f20225g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m19893h;
        zzbp.zza m19905l = this.f20226h.m19905l(this.f20224f, this.f20225g);
        this.f20226h.f26017k = m19905l;
        m19893h = zzdy.m19893h(this.f20224f, m19905l);
        if (m19893h) {
            this.f20226h.m19903e(this.f20224f + 1, this.f20225g);
        }
    }
}
