package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* loaded from: classes2.dex */
final class CallableC7640c4 implements Callable<List<C7733m7>> {

    /* renamed from: f */
    private final /* synthetic */ zzm f28583f;

    /* renamed from: g */
    private final /* synthetic */ String f28584g;

    /* renamed from: h */
    private final /* synthetic */ String f28585h;

    /* renamed from: i */
    private final /* synthetic */ zzgc f28586i;

    CallableC7640c4(zzgc zzgcVar, zzm zzmVar, String str, String str2) {
        this.f28586i = zzgcVar;
        this.f28583f = zzmVar;
        this.f28584g = str;
        this.f28585h = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C7733m7> call() throws Exception {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        zzkcVar = this.f28586i.f29304f;
        zzkcVar.m23453e0();
        zzkcVar2 = this.f28586i.f29304f;
        return zzkcVar2.m23445W().m22734K(this.f28583f.f29401f, this.f28584g, this.f28585h);
    }
}
