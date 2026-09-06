package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcqj extends zzasx {

    /* renamed from: f */
    private zzbbh<zzcdb> f24930f;

    /* renamed from: g */
    private zzcdb f24931g;

    /* renamed from: h */
    private final zzbjm f24932h;

    /* renamed from: i */
    private final Context f24933i;

    /* renamed from: m */
    private zzbss f24937m;

    /* renamed from: j */
    private final zzcqc f24934j = new zzcqc();

    /* renamed from: k */
    private final zzcpx f24935k = new zzcpx();

    /* renamed from: l */
    private final zzcpy f24936l = new zzcpy();

    /* renamed from: n */
    private boolean f24938n = false;

    /* renamed from: o */
    private final zzcxx f24939o = new zzcxx();

    /* renamed from: p */
    private boolean f24940p = false;

    public zzcqj(zzbjm zzbjmVar, Context context) {
        this.f24932h = zzbjmVar;
        this.f24933i = context;
    }

    /* renamed from: i7 */
    static /* synthetic */ zzbbh m18942i7(zzcqj zzcqjVar, zzbbh zzbbhVar) {
        zzcqjVar.f24930f = null;
        return null;
    }

    /* renamed from: l7 */
    private final synchronized boolean m18945l7() {
        boolean z;
        zzcdb zzcdbVar = this.f24931g;
        if (zzcdbVar != null) {
            z = zzcdbVar.m18674g() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: M6 */
    public final synchronized void mo16384M6(IObjectWrapper iObjectWrapper) {
        Preconditions.m14367f("pause must be called on the main UI thread.");
        if (this.f24931g != null) {
            this.f24931g.m18675h().m18304f0(iObjectWrapper == null ? null : (Context) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T4 */
    public final void mo16385T4(zzasu zzasuVar) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f24934j.m18932b(zzasuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T5 */
    public final synchronized void mo16386T5(IObjectWrapper iObjectWrapper) {
        Preconditions.m14367f("resume must be called on the main UI thread.");
        if (this.f24931g != null) {
            this.f24931g.m18675h().m18305g0(iObjectWrapper == null ? null : (Context) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: d2 */
    public final synchronized void mo16387d2(IObjectWrapper iObjectWrapper) {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        Context context = null;
        this.f24935k.m18925a(null);
        this.f24938n = false;
        if (this.f24931g != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
            }
            this.f24931g.m18675h().m18306i0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void destroy() throws RemoteException {
        mo16387d2(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: g5 */
    public final void mo16388g5(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() {
        zzbss zzbssVar;
        Preconditions.m14367f("getAdMetadata can only be called from the UI thread.");
        return (!this.f24938n || (zzbssVar = this.f24937m) == null) ? new Bundle() : zzbssVar.m18317Y();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        zzcdb zzcdbVar = this.f24931g;
        if (zzcdbVar == null) {
            return null;
        }
        return zzcdbVar.m18227b();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: h0 */
    public final void mo16389h0(zzatb zzatbVar) throws RemoteException {
        Preconditions.m14367f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f24934j.m18933c(zzatbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: i4 */
    public final synchronized void mo16390i4(zzath zzathVar) throws RemoteException {
        Preconditions.m14367f("loadAd must be called on the main UI thread.");
        this.f24938n = false;
        String str = zzathVar.f22508g;
        if (str == null) {
            zzbad.m17351g("Ad unit ID should not be null for rewarded video ad.");
            this.f24932h.mo17780e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gn

                /* renamed from: f */
                private final zzcqj f18986f;

                {
                    this.f18986f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18986f.m18948o7();
                }
            });
            return;
        }
        if (zzacw.m16427a(str)) {
            return;
        }
        if (this.f24930f != null) {
            return;
        }
        if (m18945l7()) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21843o4)).booleanValue()) {
                return;
            }
        }
        zzcya.m19067b(this.f24933i, zzathVar.f22507f.f27407k);
        this.f24931g = null;
        zzcdf mo15370b = this.f24932h.mo17788m().mo15369a(new zzbqy.zza().m18288e(this.f24933i).m18286b(this.f24939o.m19054t(zzathVar.f22508g).m19051n(zzyd.m20823e0()).m19057w(zzathVar.f22507f).m19043d()).m18290i(null).m18287c()).mo15371c(new zzbtv.zza().m18353c(this.f24934j, this.f24932h.mo17780e()).m18357g(new C6794jn(this, this.f24934j), this.f24932h.mo17780e()).m18354d(this.f24934j, this.f24932h.mo17780e()).m18352b(this.f24935k, this.f24932h.mo17780e()).m18351a(this.f24936l, this.f24932h.mo17780e()).m18360k()).mo15370b();
        this.f24937m = mo15370b.mo15436d();
        zzbbh<zzcdb> mo15435c = mo15370b.mo15435c();
        this.f24930f = mo15435c;
        zzbar.m17369f(mo15435c, new C6720hn(this, mo15370b), this.f24932h.mo17780e());
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        Preconditions.m14367f("isLoaded must be called on the main UI thread.");
        return m18945l7();
    }

    /* renamed from: m7 */
    final void m18946m7() {
        this.f24938n = true;
    }

    /* renamed from: n7 */
    final void m18947n7() {
        this.f24935k.onAdMetadataChanged();
    }

    /* renamed from: o7 */
    final /* synthetic */ void m18948o7() {
        this.f24934j.onAdFailedToLoad(1);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void pause() throws RemoteException {
        mo16384M6(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void resume() throws RemoteException {
        mo16386T5(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: s0 */
    public final synchronized void mo16391s0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.m14367f("showAd must be called on the main UI thread.");
        if (this.f24931g == null) {
            return;
        }
        if (iObjectWrapper != null) {
            Object m14709k0 = ObjectWrapper.m14709k0(iObjectWrapper);
            if (m14709k0 instanceof Activity) {
                activity = (Activity) m14709k0;
                this.f24931g.m18676i(this.f24940p, activity);
            }
        }
        activity = null;
        this.f24931g.m18676i(this.f24940p, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21771d1)).booleanValue()) {
            Preconditions.m14367f("#008 Must be called on the main UI thread.: setCustomData");
            this.f24939o.m19056v(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.m14367f("setImmersiveMode must be called on the main UI thread.");
        this.f24940p = z;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.m14367f("setUserId must be called on the main UI thread.");
        this.f24939o.m19055u(str);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void show() throws RemoteException {
        mo16391s0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: z0 */
    public final void mo16392z0(zzzp zzzpVar) {
        Preconditions.m14367f("setAdMetadataListener can only be called from the UI thread.");
        this.f24935k.m18925a(new BinderC6757in(this, zzzpVar));
    }
}
