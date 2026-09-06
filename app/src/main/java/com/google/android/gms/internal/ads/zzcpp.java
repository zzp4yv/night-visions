package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcpp extends zzzd {

    /* renamed from: f */
    private final Context f24878f;

    /* renamed from: g */
    private final zzbjm f24879g;

    /* renamed from: h */
    private final zzcxx f24880h;

    /* renamed from: i */
    private final zzbzc f24881i;

    /* renamed from: j */
    private final zzcpw f24882j;

    /* renamed from: k */
    private final zzbro f24883k;

    /* renamed from: l */
    private zzbpk f24884l;

    /* renamed from: m */
    private String f24885m;

    /* renamed from: n */
    private String f24886n;

    public zzcpp(Context context, zzbjm zzbjmVar, zzcxx zzcxxVar, zzbzc zzbzcVar, zzyz zzyzVar) {
        final zzcpw zzcpwVar = new zzcpw();
        this.f24882j = zzcpwVar;
        this.f24878f = context;
        this.f24879g = zzbjmVar;
        this.f24880h = zzcxxVar;
        this.f24881i = zzbzcVar;
        zzcpwVar.m18924c(zzyzVar);
        final zzaje m18566e = zzbzcVar.m18566e();
        this.f24883k = new zzbro(zzcpwVar, m18566e) { // from class: com.google.android.gms.internal.ads.ym

            /* renamed from: f */
            private final zzcpw f21312f;

            /* renamed from: g */
            private final zzaje f21313g;

            {
                this.f21312f = zzcpwVar;
                this.f21313g = m18566e;
            }

            @Override // com.google.android.gms.internal.ads.zzbro
            public final void onAdFailedToLoad(int i2) {
                zzcpw zzcpwVar2 = this.f21312f;
                zzaje zzajeVar = this.f21313g;
                zzcpwVar2.onAdFailedToLoad(i2);
                if (zzajeVar != null) {
                    try {
                        zzajeVar.mo16598h3(i2);
                    } catch (RemoteException e2) {
                        zzbad.m17350f("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: F5 */
    public final synchronized void mo15083F5(zzxz zzxzVar, int i2) {
        if (this.f24880h.m19042c() == null) {
            zzbad.m17351g("Ad unit ID should not be null for AdLoader.");
            this.f24879g.mo17780e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xm

                /* renamed from: f */
                private final zzcpp f20978f;

                {
                    this.f20978f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20978f.m18915i7();
                }
            });
            return;
        }
        zzcya.m19067b(this.f24878f, zzxzVar.f27407k);
        this.f24885m = null;
        this.f24886n = null;
        zzcxv m19043d = this.f24880h.m19057w(zzxzVar).m19053q(i2).m19043d();
        zzbxo mo16041b = this.f24879g.mo17787l().mo16042c(new zzbqy.zza().m18288e(this.f24878f).m18286b(m19043d).m18287c()).mo16040a(new zzbtv.zza().m18357g(this.f24882j, this.f24879g.mo17780e()).m18354d(this.f24883k, this.f24879g.mo17780e()).m18356f(this.f24882j, this.f24879g.mo17780e()).m18358h(this.f24882j, this.f24879g.mo17780e()).m18353c(this.f24882j, this.f24879g.mo17780e()).m18359i(m19043d.f25303n, this.f24879g.mo17780e()).m18360k()).mo16043d(new zzbxk(this.f24881i, this.f24882j.m18923b())).mo16041b();
        mo16041b.mo16094f().m19070c(1);
        zzbpk mo16091c = mo16041b.mo16091c();
        this.f24884l = mo16091c;
        mo16091c.m18239c(new C7385zm(this, mo16041b));
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: c0 */
    public final synchronized String mo15084c0() {
        return this.f24886n;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final synchronized String getMediationAdapterClassName() {
        return this.f24885m;
    }

    /* renamed from: i7 */
    final /* synthetic */ void m18915i7() {
        this.f24883k.onAdFailedToLoad(1);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: j2 */
    public final void mo15085j2(zzxz zzxzVar) {
        mo15083F5(zzxzVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: p0 */
    public final synchronized boolean mo15086p0() throws RemoteException {
        boolean z;
        zzbpk zzbpkVar = this.f24884l;
        if (zzbpkVar != null) {
            z = zzbpkVar.m18237a();
        }
        return z;
    }
}
