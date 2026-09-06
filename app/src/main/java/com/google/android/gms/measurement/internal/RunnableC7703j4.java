package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes2.dex */
final class RunnableC7703j4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzan f28717f;

    /* renamed from: g */
    private final /* synthetic */ zzm f28718g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28719h;

    RunnableC7703j4(zzgc zzgcVar, zzan zzanVar, zzm zzmVar) {
        this.f28719h = zzgcVar;
        this.f28717f = zzanVar;
        this.f28718g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        zzan m23248E3 = this.f28719h.m23248E3(this.f28717f, this.f28718g);
        zzkcVar = this.f28719h.f29304f;
        zzkcVar.m23453e0();
        zzkcVar2 = this.f28719h.f29304f;
        zzkcVar2.m23458p(m23248E3, this.f28718g);
    }
}
