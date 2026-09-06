package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.an */
/* loaded from: classes2.dex */
final class C6461an implements zzban<zzbnf> {

    /* renamed from: a */
    private final /* synthetic */ zzboc f18173a;

    /* renamed from: b */
    private final /* synthetic */ zzcpt f18174b;

    C6461an(zzcpt zzcptVar, zzboc zzbocVar) {
        this.f18174b = zzcptVar;
        this.f18173a = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        zzbtb zzbtbVar;
        synchronized (this.f18174b) {
            zzcpt.m18916i7(this.f18174b, null);
            this.f18173a.mo15070c().onAdFailedToLoad(zzcgm.m18773b(th));
            zzbtbVar = this.f18174b.f24893l;
            zzbtbVar.m18324i0(60);
            zzcya.m19066a(th, "BannerAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzbnf zzbnfVar) {
        zzbnf zzbnfVar2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzbtb zzbtbVar;
        zzbnf zzbnfVar3;
        zzbnf zzbnfVar4 = zzbnfVar;
        synchronized (this.f18174b) {
            zzcpt.m18916i7(this.f18174b, null);
            zzbnfVar2 = this.f18174b.f24896o;
            if (zzbnfVar2 != null) {
                zzbnfVar3 = this.f18174b.f24896o;
                zzbnfVar3.mo18226a();
            }
            this.f18174b.f24896o = zzbnfVar4;
            viewGroup = this.f18174b.f24889h;
            viewGroup.removeAllViews();
            viewGroup2 = this.f18174b.f24889h;
            viewGroup2.addView(zzbnfVar4.mo16098i());
            zzbnfVar4.mo16095c();
            zzbtbVar = this.f18174b.f24893l;
            zzbtbVar.m18324i0(zzbnfVar4.mo16100k());
        }
    }
}
