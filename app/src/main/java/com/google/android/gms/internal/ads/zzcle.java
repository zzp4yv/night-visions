package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcle implements zzcjv<zzbvx> {

    /* renamed from: a */
    private final Context f24668a;

    /* renamed from: b */
    private final zzcdn f24669b;

    /* renamed from: c */
    private final zzbws f24670c;

    /* renamed from: d */
    private final zzcxv f24671d;

    /* renamed from: e */
    private final Executor f24672e;

    /* renamed from: f */
    private final zzbai f24673f;

    public zzcle(Context context, zzbai zzbaiVar, zzcxv zzcxvVar, Executor executor, zzbws zzbwsVar, zzcdn zzcdnVar) {
        this.f24668a = context;
        this.f24671d = zzcxvVar;
        this.f24670c = zzbwsVar;
        this.f24672e = executor;
        this.f24673f = zzbaiVar;
        this.f24669b = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<zzbvx> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        final zzced zzcedVar = new zzced();
        zzbbh<zzbvx> m17366c = zzbar.m17366c(zzbar.m17378o(null), new zzbal(this, zzcxmVar, zzcedVar, zzcxuVar) { // from class: com.google.android.gms.internal.ads.uk

            /* renamed from: a */
            private final zzcle f20636a;

            /* renamed from: b */
            private final zzcxm f20637b;

            /* renamed from: c */
            private final zzced f20638c;

            /* renamed from: d */
            private final zzcxu f20639d;

            {
                this.f20636a = this;
                this.f20637b = zzcxmVar;
                this.f20638c = zzcedVar;
                this.f20639d = zzcxuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20636a.m18871c(this.f20637b, this.f20638c, this.f20639d, obj);
            }
        }, this.f24672e);
        m17366c.mo14748k(RunnableC7235vk.m15954a(zzcedVar), this.f24672e);
        return m17366c;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        return (zzcxqVar == null || zzcxqVar.f25278a == null) ? false : true;
    }

    /* renamed from: c */
    final /* synthetic */ zzbbh m18871c(final zzcxm zzcxmVar, zzced zzcedVar, zzcxu zzcxuVar, Object obj) throws Exception {
        final zzbgz m18682b = this.f24669b.m18682b(this.f24671d.f25294e);
        m18682b.mo14938x(zzcxmVar.f25240M);
        zzcedVar.m18696a(this.f24668a, m18682b.getView());
        final zzbbr zzbbrVar = new zzbbr();
        final zzbvy mo15300a = this.f24670c.mo15300a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbvz(new zzbwz(this, m18682b, zzcxmVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.wk

            /* renamed from: a */
            private final zzcle f20854a;

            /* renamed from: b */
            private final zzbgz f20855b;

            /* renamed from: c */
            private final zzcxm f20856c;

            /* renamed from: d */
            private final zzbbr f20857d;

            {
                this.f20854a = this;
                this.f20855b = m18682b;
                this.f20856c = zzcxmVar;
                this.f20857d = zzbbrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            /* renamed from: a */
            public final void mo14951a(boolean z, Context context) {
                this.f20854a.m18872d(this.f20855b, this.f20856c, this.f20857d, z, context);
            }
        }, m18682b));
        zzbbrVar.m17385a(mo15300a);
        zzbrt mo14757d = mo15300a.mo14757d();
        zzbrw zzbrwVar = new zzbrw(m18682b) { // from class: com.google.android.gms.internal.ads.xk

            /* renamed from: f */
            private final zzbgz f20976f;

            {
                this.f20976f = m18682b;
            }

            @Override // com.google.android.gms.internal.ads.zzbrw
            public final void onAdImpression() {
                zzbgz zzbgzVar = this.f20976f;
                if (zzbgzVar.mo14926p() != null) {
                    zzbgzVar.mo14926p().mo17683e();
                }
            }
        };
        Executor executor = zzbbm.f22758b;
        mo14757d.m18332V(zzbrwVar, executor);
        mo15300a.mo15336g().m18691i(m18682b, true);
        mo15300a.mo15336g();
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        zzbbh<?> m18683a = zzcdp.m18683a(m18682b, zzcxqVar.f25279b, zzcxqVar.f25278a);
        if (zzcxmVar.f25232E) {
            m18683a.mo14748k(new Runnable(m18682b) { // from class: com.google.android.gms.internal.ads.yk

                /* renamed from: f */
                private final zzbgz f21307f;

                {
                    this.f21307f = m18682b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f21307f.mo14920l0();
                }
            }, this.f24672e);
        }
        m18683a.mo14748k(new Runnable(m18682b) { // from class: com.google.android.gms.internal.ads.zk

            /* renamed from: f */
            private final zzbgz f21466f;

            {
                this.f21466f = m18682b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f21466f.mo14887O();
            }
        }, this.f24672e);
        return zzbar.m17367d(m18683a, new zzbam(mo15300a) { // from class: com.google.android.gms.internal.ads.al

            /* renamed from: a */
            private final zzbvy f18171a;

            {
                this.f18171a = mo15300a;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj2) {
                return this.f18171a.mo15337h();
            }
        }, executor);
    }

    /* renamed from: d */
    final /* synthetic */ void m18872d(zzbgz zzbgzVar, zzcxm zzcxmVar, zzbbr zzbbrVar, boolean z, Context context) {
        try {
            zzbgzVar.mo14916j0(true);
            zzk.zzlg();
            com.google.android.gms.ads.internal.zzh zzhVar = new com.google.android.gms.ads.internal.zzh(false, zzaxi.m17128H(this.f24668a), false, 0.0f, -1, z, zzcxmVar.f25233F, false);
            zzk.zzlf();
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, ((zzbvy) zzbbrVar.get()).mo15339j(), null, zzbgzVar, zzcxmVar.f25235H, this.f24673f, zzcxmVar.f25267y, zzhVar), true);
        } catch (Exception unused) {
        }
    }
}
