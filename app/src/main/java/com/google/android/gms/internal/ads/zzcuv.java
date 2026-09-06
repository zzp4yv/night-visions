package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcuv implements zzcuz<Bundle> {

    /* renamed from: a */
    private final boolean f25114a;

    /* renamed from: b */
    private final boolean f25115b;

    /* renamed from: c */
    private final String f25116c;

    /* renamed from: d */
    private final boolean f25117d;

    /* renamed from: e */
    private final int f25118e;

    /* renamed from: f */
    private final int f25119f;

    public zzcuv(boolean z, boolean z2, String str, boolean z3, int i2, int i3) {
        this.f25114a = z;
        this.f25115b = z2;
        this.f25116c = str;
        this.f25117d = z3;
        this.f25118e = i2;
        this.f25119f = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f25116c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) zzyt.m20848e().m16421c(zzacu.f21607C2));
        bundle2.putInt("target_api", this.f25118e);
        bundle2.putInt("dv", this.f25119f);
        Bundle m19059a = zzcxz.m19059a(bundle2, "sdk_env");
        m19059a.putBoolean("mf", ((Boolean) zzyt.m20848e().m16421c(zzacu.f21619E2)).booleanValue());
        m19059a.putBoolean("instant_app", this.f25114a);
        m19059a.putBoolean("lite", this.f25115b);
        m19059a.putBoolean("is_privileged_process", this.f25117d);
        bundle2.putBundle("sdk_env", m19059a);
        Bundle m19059a2 = zzcxz.m19059a(m19059a, "build_meta");
        m19059a2.putString("cl", "248613007");
        m19059a2.putString("rapid_rc", "dev");
        m19059a2.putString("rapid_rollup", "HEAD");
        m19059a.putBundle("build_meta", m19059a2);
    }
}
