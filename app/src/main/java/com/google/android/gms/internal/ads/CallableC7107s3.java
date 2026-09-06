package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.s3 */
/* loaded from: classes2.dex */
final class CallableC7107s3 implements Callable<zzase> {

    /* renamed from: f */
    private final /* synthetic */ Context f20497f;

    /* renamed from: g */
    private final /* synthetic */ zzasg f20498g;

    CallableC7107s3(zzasg zzasgVar, Context context) {
        this.f20498g = zzasgVar;
        this.f20497f = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzase call() throws Exception {
        WeakHashMap weakHashMap;
        zzase m16914g;
        WeakHashMap weakHashMap2;
        weakHashMap = this.f20498g.f22492a;
        C7144t3 c7144t3 = (C7144t3) weakHashMap.get(this.f20497f);
        if (c7144t3 != null) {
            if (!(c7144t3.f20551a + ((Long) zzyt.m20848e().m16421c(zzacu.f21708T1)).longValue() < zzk.zzln().mo14608a())) {
                m16914g = new zzasf(this.f20497f, c7144t3.f20552b).m16914g();
                weakHashMap2 = this.f20498g.f22492a;
                weakHashMap2.put(this.f20497f, new C7144t3(this.f20498g, m16914g));
                return m16914g;
            }
        }
        m16914g = new zzasf(this.f20497f).m16914g();
        weakHashMap2 = this.f20498g.f22492a;
        weakHashMap2.put(this.f20497f, new C7144t3(this.f20498g, m16914g));
        return m16914g;
    }
}
