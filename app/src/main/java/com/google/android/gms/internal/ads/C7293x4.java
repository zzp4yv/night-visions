package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.x4 */
/* loaded from: classes2.dex */
final class C7293x4 {

    /* renamed from: a */
    private final Object f20937a;

    /* renamed from: b */
    private volatile int f20938b;

    /* renamed from: c */
    private volatile long f20939c;

    private C7293x4() {
        this.f20937a = new Object();
        this.f20938b = C7330y4.f21099a;
        this.f20939c = 0L;
    }

    /* renamed from: a */
    public final void m16034a() {
        int i2;
        long mo14608a = zzk.zzln().mo14608a();
        synchronized (this.f20937a) {
            int i3 = this.f20938b;
            i2 = C7330y4.f21100b;
            if (i3 == i2) {
                if (this.f20939c + ((Long) zzyt.m20848e().m16421c(zzacu.f21663L4)).longValue() <= mo14608a) {
                    this.f20938b = C7330y4.f21099a;
                }
            }
        }
        long mo14608a2 = zzk.zzln().mo14608a();
        synchronized (this.f20937a) {
            if (this.f20938b != 2) {
                return;
            }
            this.f20938b = 3;
            if (this.f20938b == i2) {
                this.f20939c = mo14608a2;
            }
        }
    }

    /* synthetic */ C7293x4(C7256w4 c7256w4) {
        this();
    }
}
