package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcsg implements zzcuz<Bundle> {

    /* renamed from: a */
    private final double f25018a;

    /* renamed from: b */
    private final boolean f25019b;

    public zzcsg(double d2, boolean z) {
        this.f25018a = d2;
        this.f25019b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle m19059a = zzcxz.m19059a(bundle2, "device");
        bundle2.putBundle("device", m19059a);
        Bundle m19059a2 = zzcxz.m19059a(m19059a, "battery");
        m19059a.putBundle("battery", m19059a2);
        m19059a2.putBoolean("is_charging", this.f25019b);
        m19059a2.putDouble("battery_level", this.f25018a);
    }
}
