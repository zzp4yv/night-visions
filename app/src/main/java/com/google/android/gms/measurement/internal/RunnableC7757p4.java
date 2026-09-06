package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p4 */
/* loaded from: classes2.dex */
final class RunnableC7757p4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28822f;

    /* renamed from: g */
    private final /* synthetic */ String f28823g;

    /* renamed from: h */
    private final /* synthetic */ String f28824h;

    /* renamed from: i */
    private final /* synthetic */ long f28825i;

    /* renamed from: j */
    private final /* synthetic */ zzgc f28826j;

    RunnableC7757p4(zzgc zzgcVar, String str, String str2, String str3, long j2) {
        this.f28826j = zzgcVar;
        this.f28822f = str;
        this.f28823g = str2;
        this.f28824h = str3;
        this.f28825i = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc zzkcVar;
        zzkc zzkcVar2;
        String str = this.f28822f;
        if (str == null) {
            zzkcVar2 = this.f28826j.f29304f;
            zzkcVar2.m23455g0().m23225Q().m23337K(this.f28823g, null);
        } else {
            zzig zzigVar = new zzig(this.f28824h, str, this.f28825i);
            zzkcVar = this.f28826j.f29304f;
            zzkcVar.m23455g0().m23225Q().m23337K(this.f28823g, zzigVar);
        }
    }
}
