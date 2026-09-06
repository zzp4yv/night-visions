package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzj;

/* renamed from: com.google.android.gms.internal.ads.th */
/* loaded from: classes2.dex */
final class C7158th implements zzj {

    /* renamed from: f */
    private final /* synthetic */ zzcdn f20571f;

    C7158th(zzcdn zzcdnVar) {
        this.f20571f = zzcdnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzlc() {
        zzbtb zzbtbVar;
        zzbtbVar = this.f20571f.f24126h;
        zzbtbVar.onPause();
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzld() {
        zzbtb zzbtbVar;
        zzbtbVar = this.f20571f.f24126h;
        zzbtbVar.onResume();
    }
}
