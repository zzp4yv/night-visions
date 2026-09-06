package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcqd extends zzzl {

    /* renamed from: f */
    private final zzbjm f24908f;

    /* renamed from: g */
    private final Context f24909g;

    /* renamed from: h */
    private final Executor f24910h;

    /* renamed from: i */
    private final zzcpw f24911i = new zzcpw();

    /* renamed from: j */
    private final zzcpy f24912j = new zzcpy();

    /* renamed from: k */
    private final zzcqc f24913k = new zzcqc();

    /* renamed from: l */
    private final zzcxx f24914l;

    /* renamed from: m */
    private zzado f24915m;

    /* renamed from: n */
    private zzbvx f24916n;

    /* renamed from: o */
    private zzbbh<zzbvx> f24917o;

    /* renamed from: p */
    private boolean f24918p;

    public zzcqd(zzbjm zzbjmVar, Context context, zzyd zzydVar, String str) {
        zzcxx zzcxxVar = new zzcxx();
        this.f24914l = zzcxxVar;
        this.f24918p = false;
        this.f24908f = zzbjmVar;
        zzcxxVar.m19051n(zzydVar).m19054t(str);
        this.f24910h = zzbjmVar.mo17780e();
        this.f24909g = context;
    }

    /* renamed from: i7 */
    static /* synthetic */ zzbbh m18934i7(zzcqd zzcqdVar, zzbbh zzbbhVar) {
        zzcqdVar.f24917o = null;
        return null;
    }

    /* renamed from: k7 */
    private final synchronized boolean m18936k7() {
        boolean z;
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar != null) {
            z = zzbvxVar.m18400g() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: B */
    public final synchronized boolean mo16341B() {
        Preconditions.m14367f("isLoaded must be called on the main UI thread.");
        return m18936k7();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C2 */
    public final void mo16342C2(zzyd zzydVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C3 */
    public final void mo16343C3(zzaqt zzaqtVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C5 */
    public final zzyd mo16344C5() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: H6 */
    public final synchronized void mo16345H6(zzado zzadoVar) {
        Preconditions.m14367f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f24915m = zzadoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: I4 */
    public final zzzs mo16346I4() {
        return this.f24912j.m18926a();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: J4 */
    public final synchronized boolean mo16347J4(zzxz zzxzVar) {
        Preconditions.m14367f("loadAd must be called on the main UI thread.");
        if (this.f24917o == null && !m18936k7()) {
            zzcya.m19067b(this.f24909g, zzxzVar.f27407k);
            this.f24916n = null;
            zzcxv m19043d = this.f24914l.m19057w(zzxzVar).m19043d();
            zzbtv.zza zzaVar = new zzbtv.zza();
            zzcqc zzcqcVar = this.f24913k;
            if (zzcqcVar != null) {
                zzaVar.m18353c(zzcqcVar, this.f24908f.mo17780e()).m18357g(this.f24913k, this.f24908f.mo17780e()).m18354d(this.f24913k, this.f24908f.mo17780e());
            }
            zzbws mo15162a = this.f24908f.mo17786k().mo15164c(new zzbqy.zza().m18288e(this.f24909g).m18286b(m19043d).m18287c()).mo15165d(zzaVar.m18353c(this.f24911i, this.f24908f.mo17780e()).m18357g(this.f24911i, this.f24908f.mo17780e()).m18354d(this.f24911i, this.f24908f.mo17780e()).m18358h(this.f24911i, this.f24908f.mo17780e()).m18351a(this.f24912j, this.f24908f.mo17780e()).m18360k()).mo15163b(new zzcow(this.f24915m)).mo15162a();
            zzbbh<zzbvx> mo15302c = mo15162a.mo15302c();
            this.f24917o = mo15302c;
            zzbar.m17369f(mo15302c, new C6535cn(this, mo15162a), this.f24910h);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: L0 */
    public final void mo16348L0(zzyz zzyzVar) {
        Preconditions.m14367f("setAdListener must be called on the main UI thread.");
        this.f24911i.m18924c(zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: P5 */
    public final void mo16349P5(zzzs zzzsVar) {
        Preconditions.m14367f("setAppEventListener must be called on the main UI thread.");
        this.f24912j.m18927b(zzzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: S0 */
    public final IObjectWrapper mo16350S0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: U5 */
    public final void mo16351U5(zzaqn zzaqnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: W6 */
    public final synchronized void mo16352W6(zzacd zzacdVar) {
        this.f24914l.m19049k(zzacdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: X5 */
    public final void mo16353X5(zzaax zzaaxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: c0 */
    public final synchronized String mo16354c0() {
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar == null) {
            return null;
        }
        return zzbvxVar.m18229f();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void destroy() {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar != null) {
            zzbvxVar.m18402i().m18306i0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: f6 */
    public final synchronized String mo16355f6() {
        return this.f24914l.m19042c();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() {
        Preconditions.m14367f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String getMediationAdapterClassName() {
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar == null) {
            return null;
        }
        return zzbvxVar.m18227b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzaar getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: h0 */
    public final void mo16356h0(zzatb zzatbVar) {
        this.f24913k.m18933c(zzatbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: k4 */
    public final void mo16357k4() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: m4 */
    public final void mo16358m4(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: p0 */
    public final synchronized boolean mo16359p0() {
        boolean z;
        zzbbh<zzbvx> zzbbhVar = this.f24917o;
        if (zzbbhVar != null) {
            z = zzbbhVar.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void pause() {
        Preconditions.m14367f("pause must be called on the main UI thread.");
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar != null) {
            zzbvxVar.m18402i().m18304f0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void resume() {
        Preconditions.m14367f("resume must be called on the main UI thread.");
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar != null) {
            zzbvxVar.m18402i().m18305g0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.m14367f("setImmersiveMode must be called on the main UI thread.");
        this.f24918p = z;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void showInterstitial() {
        Preconditions.m14367f("showInterstitial must be called on the main UI thread.");
        zzbvx zzbvxVar = this.f24916n;
        if (zzbvxVar == null) {
            return;
        }
        if (zzbvxVar.m18403j()) {
            this.f24916n.m18401h(this.f24918p);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: t1 */
    public final synchronized void mo16360t1(boolean z) {
        Preconditions.m14367f("setManualImpressionsEnabled must be called from the main thread.");
        this.f24914l.m19048j(z);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: v4 */
    public final synchronized void mo16361v4(zzzy zzzyVar) {
        Preconditions.m14367f("setCorrelationIdProvider must be called on the main UI thread");
        this.f24914l.m19052o(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: w4 */
    public final void mo16362w4(zzyw zzywVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x5 */
    public final zzyz mo16363x5() {
        return this.f24911i.m18923b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x6 */
    public final void mo16364x6() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: z0 */
    public final void mo16365z0(zzzp zzzpVar) {
        Preconditions.m14367f("setAdMetadataListener must be called on the main UI thread.");
    }
}
