package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes2.dex */
final class RunnableC7748o4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzv f28808f;

    /* renamed from: g */
    private final /* synthetic */ zzm f28809g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28810h;

    RunnableC7748o4(zzgc zzgcVar, zzv zzvVar, zzm zzmVar) {
        this.f28810h = zzgcVar;
        this.f28808f = zzvVar;
        this.f28809g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        zzkc zzkcVar3;
        zzkcVar = this.f28810h.f29304f;
        zzkcVar.m23453e0();
        if (this.f28808f.f29424h.m23494y() == null) {
            zzkcVar3 = this.f28810h.f29304f;
            zzkcVar3.m23440R(this.f28808f, this.f28809g);
        } else {
            zzkcVar2 = this.f28810h.f29304f;
            zzkcVar2.m23464y(this.f28808f, this.f28809g);
        }
    }
}
