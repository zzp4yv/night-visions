package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzag;

/* loaded from: classes2.dex */
final class l30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f19744f;

    /* renamed from: g */
    private final /* synthetic */ long f19745g;

    /* renamed from: h */
    private final /* synthetic */ zzr f19746h;

    l30(zzr zzrVar, String str, long j2) {
        this.f19746h = zzrVar;
        this.f19744f = str;
        this.f19745g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzag.C7399a c7399a;
        zzag.C7399a c7399a2;
        c7399a = this.f19746h.f26876f;
        c7399a.m16531a(this.f19744f, this.f19745g);
        c7399a2 = this.f19746h.f26876f;
        c7399a2.m16532b(this.f19746h.toString());
    }
}
