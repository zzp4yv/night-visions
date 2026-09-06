package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* loaded from: classes2.dex */
final class CallableC7739n4 implements Callable<List<C7733m7>> {

    /* renamed from: f */
    private final /* synthetic */ zzm f28792f;

    /* renamed from: g */
    private final /* synthetic */ zzgc f28793g;

    CallableC7739n4(zzgc zzgcVar, zzm zzmVar) {
        this.f28793g = zzgcVar;
        this.f28792f = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C7733m7> call() throws Exception {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        zzkcVar = this.f28793g.f29304f;
        zzkcVar.m23453e0();
        zzkcVar2 = this.f28793g.f29304f;
        return zzkcVar2.m23445W().m22732I(this.f28792f.f29401f);
    }
}
