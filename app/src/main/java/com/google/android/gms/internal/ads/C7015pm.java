package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* renamed from: com.google.android.gms.internal.ads.pm */
/* loaded from: classes2.dex */
final class C7015pm implements zzf {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f20313a;

    /* renamed from: b */
    private final /* synthetic */ zzcxu f20314b;

    /* renamed from: c */
    private final /* synthetic */ zzcxm f20315c;

    /* renamed from: d */
    private final /* synthetic */ zzcoz f20316d;

    /* renamed from: e */
    private final /* synthetic */ zzcor f20317e;

    C7015pm(zzcor zzcorVar, zzbbr zzbbrVar, zzcxu zzcxuVar, zzcxm zzcxmVar, zzcoz zzcozVar) {
        this.f20317e = zzcorVar;
        this.f20313a = zzbbrVar;
        this.f20314b = zzcxuVar;
        this.f20315c = zzcxmVar;
        this.f20316d = zzcozVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzg(View view) {
        zzcou zzcouVar;
        zzbbr zzbbrVar = this.f20313a;
        zzcouVar = this.f20317e.f24835d;
        zzbbrVar.m17385a(zzcouVar.mo18901a(this.f20314b, this.f20315c, view, this.f20316d));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzky() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzkz() {
    }
}
