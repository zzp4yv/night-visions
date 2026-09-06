package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tk */
/* loaded from: classes2.dex */
final class C7161tk implements zzban<zzbnf> {

    /* renamed from: a */
    private final /* synthetic */ zzckv f20574a;

    C7161tk(zzckv zzckvVar) {
        this.f20574a = zzckvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        zzbrm zzbrmVar;
        zzbrmVar = this.f20574a.f24458d;
        zzbrmVar.onAdFailedToLoad(zzcgm.m18773b(th));
        zzcya.m19066a(th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzbnf zzbnfVar) {
        zzbnfVar.mo16095c();
    }
}
