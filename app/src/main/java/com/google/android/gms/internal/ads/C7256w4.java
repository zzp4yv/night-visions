package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.w4 */
/* loaded from: classes2.dex */
final class C7256w4 extends zzawv {

    /* renamed from: a */
    private final /* synthetic */ zzawm f20831a;

    C7256w4(zzawm zzawmVar) {
        this.f20831a = zzawmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        Context context;
        zzbai zzbaiVar;
        Object obj;
        zzacy zzacyVar;
        context = this.f20831a.f22598f;
        zzbaiVar = this.f20831a.f22599g;
        zzacx zzacxVar = new zzacx(context, zzbaiVar.f22750f);
        obj = this.f20831a.f22593a;
        synchronized (obj) {
            try {
                zzk.zzlp();
                zzacyVar = this.f20831a.f22600h;
                zzada.m16439a(zzacyVar, zzacxVar);
            } catch (IllegalArgumentException e2) {
                zzbad.m17348d("Cannot config CSI reporter.", e2);
            }
        }
    }
}
