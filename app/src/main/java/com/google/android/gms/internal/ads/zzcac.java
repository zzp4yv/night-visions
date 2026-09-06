package com.google.android.gms.internal.ads;

import p024c.p041e.C0867a;

/* loaded from: classes2.dex */
public final class zzcac implements zzbrw {

    /* renamed from: f */
    private final zzbyt f23930f;

    /* renamed from: g */
    private final zzbyx f23931g;

    public zzcac(zzbyt zzbytVar, zzbyx zzbyxVar) {
        this.f23930f = zzbytVar;
        this.f23931g = zzbyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void onAdImpression() {
        if (this.f23930f.m18515C() == null) {
            return;
        }
        zzbgz m18514B = this.f23930f.m18514B();
        zzbgz m18513A = this.f23930f.m18513A();
        if (m18514B == null) {
            m18514B = m18513A != null ? m18513A : null;
        }
        if (!this.f23931g.mo18559d() || m18514B == null) {
            return;
        }
        m18514B.mo14940y("onSdkImpression", new C0867a());
    }
}
