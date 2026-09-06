package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* loaded from: classes2.dex */
final class CallableC7685h4 implements Callable<List<zzv>> {

    /* renamed from: f */
    private final /* synthetic */ String f28682f;

    /* renamed from: g */
    private final /* synthetic */ String f28683g;

    /* renamed from: h */
    private final /* synthetic */ String f28684h;

    /* renamed from: i */
    private final /* synthetic */ zzgc f28685i;

    CallableC7685h4(zzgc zzgcVar, String str, String str2, String str3) {
        this.f28685i = zzgcVar;
        this.f28682f = str;
        this.f28683g = str2;
        this.f28684h = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzv> call() throws Exception {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        zzkcVar = this.f28685i.f29304f;
        zzkcVar.m23453e0();
        zzkcVar2 = this.f28685i.f29304f;
        return zzkcVar2.m23445W().m22747k0(this.f28682f, this.f28683g, this.f28684h);
    }
}
