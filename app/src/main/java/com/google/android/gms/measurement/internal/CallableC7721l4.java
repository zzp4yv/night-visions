package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes2.dex */
final class CallableC7721l4 implements Callable<byte[]> {

    /* renamed from: f */
    private final /* synthetic */ zzan f28748f;

    /* renamed from: g */
    private final /* synthetic */ String f28749g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28750h;

    CallableC7721l4(zzgc zzgcVar, zzan zzanVar, String str) {
        this.f28750h = zzgcVar;
        this.f28748f = zzanVar;
        this.f28749g = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        zzkcVar = this.f28750h.f29304f;
        zzkcVar.m23453e0();
        zzkcVar2 = this.f28750h.f29304f;
        return zzkcVar2.m23447Y().m22851w(this.f28748f, this.f28749g);
    }
}
