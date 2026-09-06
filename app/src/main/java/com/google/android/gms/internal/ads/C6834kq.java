package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [O] */
/* renamed from: com.google.android.gms.internal.ads.kq */
/* loaded from: classes2.dex */
final class C6834kq<O> implements zzban<O> {

    /* renamed from: a */
    private final /* synthetic */ zzcze f19721a;

    /* renamed from: b */
    private final /* synthetic */ zzczl f19722b;

    C6834kq(zzczl zzczlVar, zzcze zzczeVar) {
        this.f19722b = zzczlVar;
        this.f19721a = zzczeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        zzczr zzczrVar;
        zzczrVar = this.f19722b.f25379f.f25368d;
        zzczrVar.mo15512F(this.f19721a, th);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final void mo14743b(O o) {
        zzczr zzczrVar;
        zzczrVar = this.f19722b.f25379f.f25368d;
        zzczrVar.mo15511B(this.f19721a);
    }
}
