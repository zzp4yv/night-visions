package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbyn extends zzbpc {

    /* renamed from: f */
    private final Executor f23778f;

    /* renamed from: g */
    private final zzbyt f23779g;

    /* renamed from: h */
    private final zzbzb f23780h;

    /* renamed from: i */
    private final zzbzl f23781i;

    /* renamed from: j */
    private final zzbyx f23782j;

    /* renamed from: k */
    private final zzbzc f23783k;

    /* renamed from: l */
    private final zzdte<zzccb> f23784l;

    /* renamed from: m */
    private final zzdte<zzcbz> f23785m;

    /* renamed from: n */
    private final zzdte<zzccg> f23786n;

    /* renamed from: o */
    private final zzdte<zzcbw> f23787o;

    /* renamed from: p */
    private final zzdte<zzccd> f23788p;

    /* renamed from: q */
    private zzcab f23789q;

    /* renamed from: r */
    private boolean f23790r;

    /* renamed from: s */
    private final zzavf f23791s;

    /* renamed from: t */
    private final zzdh f23792t;

    /* renamed from: u */
    private final zzbai f23793u;

    /* renamed from: v */
    private final Context f23794v;

    public zzbyn(Executor executor, zzbyt zzbytVar, zzbzb zzbzbVar, zzbzl zzbzlVar, zzbyx zzbyxVar, zzbzc zzbzcVar, zzdte<zzccb> zzdteVar, zzdte<zzcbz> zzdteVar2, zzdte<zzccg> zzdteVar3, zzdte<zzcbw> zzdteVar4, zzdte<zzccd> zzdteVar5, zzavf zzavfVar, zzdh zzdhVar, zzbai zzbaiVar, Context context) {
        this.f23778f = executor;
        this.f23779g = zzbytVar;
        this.f23780h = zzbzbVar;
        this.f23781i = zzbzlVar;
        this.f23782j = zzbyxVar;
        this.f23783k = zzbzcVar;
        this.f23784l = zzdteVar;
        this.f23785m = zzdteVar2;
        this.f23786n = zzdteVar3;
        this.f23787o = zzdteVar4;
        this.f23788p = zzdteVar5;
        this.f23791s = zzavfVar;
        this.f23792t = zzdhVar;
        this.f23793u = zzbaiVar;
        this.f23794v = context;
    }

    /* renamed from: D */
    public static boolean m18478D(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m18479y(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbyx r0 = r10.f23782j
            boolean r0 = r0.mo18559d()
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzbyt r0 = r10.f23779g
            com.google.android.gms.internal.ads.zzbgz r0 = r0.m18514B()
            com.google.android.gms.internal.ads.zzbyt r1 = r10.f23779g
            com.google.android.gms.internal.ads.zzbgz r1 = r1.m18513A()
            if (r0 != 0) goto L1a
            if (r1 != 0) goto L1a
            return
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = 0
            if (r4 == 0) goto L2a
        L28:
            r8 = r3
            goto L32
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L28
        L30:
            r0 = r3
            r8 = r0
        L32:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L39
            return
        L39:
            com.google.android.gms.internal.ads.zzaqd r3 = com.google.android.gms.ads.internal.zzk.zzlv()
            android.content.Context r4 = r10.f23794v
            boolean r3 = r3.m16875g(r4)
            if (r3 == 0) goto L93
            com.google.android.gms.internal.ads.zzbai r3 = r10.f23793u
            int r4 = r3.f22751g
            int r3 = r3.f22752h
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r4)
            java.lang.String r4 = "."
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzaqd r3 = com.google.android.gms.ads.internal.zzk.zzlv()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.m16871c(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L75
            return
        L75:
            com.google.android.gms.internal.ads.zzbyt r3 = r10.f23779g
            r3.m18518F(r11)
            r0.mo14880H(r11)
            if (r2 == 0) goto L8c
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L8c
            com.google.android.gms.internal.ads.zzaqd r1 = com.google.android.gms.ads.internal.zzk.zzlv()
            r1.m16872d(r11, r0)
        L8c:
            com.google.android.gms.internal.ads.zzaqd r0 = com.google.android.gms.ads.internal.zzk.zzlv()
            r0.m16873e(r11)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyn.m18479y(java.lang.String):void");
    }

    /* renamed from: A */
    public final synchronized boolean m18480A(Bundle bundle) {
        if (this.f23790r) {
            return true;
        }
        boolean mo18471m = this.f23780h.mo18471m(bundle);
        this.f23790r = mo18471m;
        return mo18471m;
    }

    /* renamed from: B */
    public final synchronized void m18481B() {
        this.f23780h.mo18468j0();
    }

    /* renamed from: C */
    public final zzaee m18482C() {
        return new zzbym(this.f23779g);
    }

    /* renamed from: E */
    public final void m18483E(View view) {
        IObjectWrapper m18515C = this.f23779g.m18515C();
        boolean z = this.f23779g.m18514B() != null;
        if (!this.f23782j.mo18559d() || m18515C == null || !z || view == null) {
            return;
        }
        zzk.zzlv().m16872d(m18515C, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    /* renamed from: a */
    public final synchronized void mo18226a() {
        this.f23778f.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vf

            /* renamed from: f */
            private final zzbyn f20741f;

            {
                this.f20741f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20741f.m18495r();
            }
        });
        super.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    /* renamed from: c */
    public final void mo16095c() {
        this.f23778f.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tf

            /* renamed from: f */
            private final zzbyn f20569f;

            {
                this.f20569f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20569f.m18496s();
            }
        });
        if (this.f23779g.m18552w() != 7) {
            Executor executor = this.f23778f;
            zzbzb zzbzbVar = this.f23780h;
            zzbzbVar.getClass();
            executor.execute(RunnableC7193uf.m15928a(zzbzbVar));
        }
        super.mo16095c();
    }

    /* renamed from: g */
    public final synchronized void m18484g() {
        this.f23780h.mo18455W();
    }

    /* renamed from: h */
    public final synchronized void m18485h() {
        zzcab zzcabVar = this.f23789q;
        if (zzcabVar == null) {
            zzbad.m17349e("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzcabVar instanceof zzbzi;
            this.f23778f.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.wf

                /* renamed from: f */
                private final zzbyn f20849f;

                /* renamed from: g */
                private final boolean f20850g;

                {
                    this.f20849f = this;
                    this.f20850g = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20849f.m18497t(this.f20850g);
                }
            });
        }
    }

    /* renamed from: i */
    public final synchronized void m18486i(View view) {
        this.f23780h.mo18458c(view);
    }

    /* renamed from: j */
    public final synchronized void m18487j(View view, MotionEvent motionEvent, View view2) {
        this.f23780h.mo18464g(view, motionEvent, view2);
    }

    /* renamed from: k */
    public final synchronized void m18488k(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21735X4)).booleanValue()) {
            this.f23781i.m18599g(this.f23789q);
        }
        this.f23780h.mo18465h(view, view2, map, map2, z);
    }

    /* renamed from: l */
    public final synchronized void m18489l(zzaag zzaagVar) {
        this.f23780h.mo18454G0(zzaagVar);
    }

    /* renamed from: m */
    public final synchronized void m18490m(zzaak zzaakVar) {
        this.f23780h.mo18462e0(zzaakVar);
    }

    /* renamed from: n */
    public final synchronized void m18491n(zzagd zzagdVar) {
        this.f23780h.mo18460d0(zzagdVar);
    }

    /* renamed from: o */
    public final synchronized void m18492o(zzcab zzcabVar) {
        zzdc m19455f;
        this.f23789q = zzcabVar;
        this.f23781i.m18598f(zzcabVar);
        this.f23780h.mo18456a(zzcabVar.mo18589k0(), zzcabVar.mo18587V3(), zzcabVar.mo18586S4(), zzcabVar, zzcabVar);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21835n2)).booleanValue() && (m19455f = this.f23792t.m19455f()) != null) {
            m19455f.zzb(zzcabVar.mo18589k0());
        }
        if (zzcabVar.mo18584E3() != null) {
            zzcabVar.mo18584E3().m20602d(this.f23791s);
        }
    }

    /* renamed from: p */
    public final synchronized void m18493p() {
        if (this.f23790r) {
            return;
        }
        this.f23780h.mo18470l();
    }

    /* renamed from: q */
    public final boolean m18494q() {
        return this.f23782j.mo18557b();
    }

    /* renamed from: r */
    final /* synthetic */ void m18495r() {
        this.f23780h.destroy();
        this.f23779g.m18533a();
    }

    /* renamed from: s */
    final /* synthetic */ void m18496s() {
        try {
            int m18552w = this.f23779g.m18552w();
            if (m18552w == 1) {
                if (this.f23783k.m18562a() != null) {
                    m18479y("Google");
                    this.f23783k.m18562a().mo16516t2(this.f23784l.get());
                    return;
                }
                return;
            }
            if (m18552w == 2) {
                if (this.f23783k.m18563b() != null) {
                    m18479y("Google");
                    this.f23783k.m18563b().mo16514D3(this.f23785m.get());
                    return;
                }
                return;
            }
            if (m18552w == 3) {
                if (this.f23783k.m18569h(this.f23779g.m18537e()) != null) {
                    this.f23783k.m18569h(this.f23779g.m18537e()).mo16520M4(this.f23788p.get());
                }
            } else {
                if (m18552w == 6) {
                    if (this.f23783k.m18564c() != null) {
                        m18479y("Google");
                        this.f23783k.m18564c().mo16524u6(this.f23786n.get());
                        return;
                    }
                    return;
                }
                if (m18552w != 7) {
                    zzbad.m17351g("Wrong native template id!");
                } else if (this.f23783k.m18566e() != null) {
                    this.f23783k.m18566e().mo16597g6(this.f23787o.get());
                }
            }
        } catch (RemoteException e2) {
            zzbad.m17347c("RemoteException when notifyAdLoad is called", e2);
        }
    }

    /* renamed from: t */
    final /* synthetic */ void m18497t(boolean z) {
        this.f23780h.mo18469k(this.f23789q.mo18589k0(), this.f23789q.mo18590y4(), this.f23789q.mo18587V3(), z);
    }

    /* renamed from: u */
    public final synchronized void m18498u(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f23790r) {
            return;
        }
        if (z) {
            this.f23780h.mo18467j(view, map, map2);
            this.f23790r = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21703S2)).booleanValue() && map != null) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null && m18478D(view2)) {
                        this.f23780h.mo18467j(view, map, map2);
                        this.f23790r = true;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final synchronized void m18499v(zzcab zzcabVar) {
        this.f23780h.mo18461e(zzcabVar.mo18589k0(), zzcabVar.mo18590y4());
        if (zzcabVar.mo18583E0() != null) {
            zzcabVar.mo18583E0().setClickable(false);
            zzcabVar.mo18583E0().removeAllViews();
        }
        if (zzcabVar.mo18584E3() != null) {
            zzcabVar.mo18584E3().m20603e(this.f23791s);
        }
        this.f23789q = null;
    }

    /* renamed from: w */
    public final synchronized void m18500w(Bundle bundle) {
        this.f23780h.mo18463f(bundle);
    }

    /* renamed from: x */
    public final synchronized void m18501x(String str) {
        this.f23780h.mo18466i(str);
    }

    /* renamed from: z */
    public final synchronized void m18502z(Bundle bundle) {
        this.f23780h.mo18457b(bundle);
    }
}
