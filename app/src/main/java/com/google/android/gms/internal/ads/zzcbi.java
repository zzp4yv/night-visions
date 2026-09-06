package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbi {

    /* renamed from: a */
    private final Context f24006a;

    /* renamed from: b */
    private final zzcxv f24007b;

    /* renamed from: c */
    private final Executor f24008c;

    /* renamed from: d */
    private final zzcdn f24009d;

    public zzcbi(Context context, zzcxv zzcxvVar, Executor executor, zzcdn zzcdnVar) {
        this.f24006a = context;
        this.f24007b = zzcxvVar;
        this.f24008c = executor;
        this.f24009d = zzcdnVar;
    }

    /* renamed from: e */
    private final void m18638e(zzbgz zzbgzVar) {
        zzbgzVar.mo14907f("/video", zzagz.f22028l);
        zzbgzVar.mo14907f("/videoMeta", zzagz.f22029m);
        zzbgzVar.mo14907f("/precache", new zzbgc());
        zzbgzVar.mo14907f("/delayPageLoaded", zzagz.f22032p);
        zzbgzVar.mo14907f("/instrument", zzagz.f22030n);
        zzbgzVar.mo14907f("/log", zzagz.f22023g);
        zzbgzVar.mo14907f("/videoClicked", zzagz.f22024h);
        zzbgzVar.mo14926p().mo17680b(true);
        if (this.f24007b.f25292c != null) {
            zzbgzVar.mo14907f("/open", new zzahs(null, null));
        }
    }

    /* renamed from: a */
    final /* synthetic */ zzbbh m18639a(String str, String str2, Object obj) throws Exception {
        final zzbgz m18682b = this.f24009d.m18682b(zzyd.m20822Y(this.f24006a));
        final zzbbq m17382e = zzbbq.m17382e(m18682b);
        m18638e(m18682b);
        if (this.f24007b.f25292c != null) {
            m18682b.mo14874A(zzbin.m17737d());
        } else {
            m18682b.mo14874A(zzbin.m17736c());
        }
        m18682b.mo14926p().mo17687i(new zzbij(this, m18682b, m17382e) { // from class: com.google.android.gms.internal.ads.bh

            /* renamed from: a */
            private final zzcbi f18340a;

            /* renamed from: b */
            private final zzbgz f18341b;

            /* renamed from: c */
            private final zzbbq f18342c;

            {
                this.f18340a = this;
                this.f18341b = m18682b;
                this.f18342c = m17382e;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                this.f18340a.m18641c(this.f18341b, this.f18342c, z);
            }
        });
        m18682b.mo14879G(str, str2, null);
        return m17382e;
    }

    /* renamed from: b */
    final /* synthetic */ zzbbh m18640b(JSONObject jSONObject, final zzbgz zzbgzVar) throws Exception {
        final zzbbq m17382e = zzbbq.m17382e(zzbgzVar);
        if (this.f24007b.f25292c != null) {
            zzbgzVar.mo14874A(zzbin.m17737d());
        } else {
            zzbgzVar.mo14874A(zzbin.m17736c());
        }
        zzbgzVar.mo14926p().mo17687i(new zzbij(this, zzbgzVar, m17382e) { // from class: com.google.android.gms.internal.ads.ch

            /* renamed from: a */
            private final zzcbi f18451a;

            /* renamed from: b */
            private final zzbgz f18452b;

            /* renamed from: c */
            private final zzbbq f18453c;

            {
                this.f18451a = this;
                this.f18452b = zzbgzVar;
                this.f18453c = m17382e;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                this.f18451a.m18642d(this.f18452b, this.f18453c, z);
            }
        });
        zzbgzVar.mo14895Y("google.afma.nativeAds.renderVideo", jSONObject);
        return m17382e;
    }

    /* renamed from: c */
    final /* synthetic */ void m18641c(zzbgz zzbgzVar, zzbbq zzbbqVar, boolean z) {
        if (this.f24007b.f25291b != null && zzbgzVar.mo14911h() != null) {
            zzbgzVar.mo14911h().m17710m7(this.f24007b.f25291b);
        }
        zzbbqVar.m17383f();
    }

    /* renamed from: d */
    final /* synthetic */ void m18642d(zzbgz zzbgzVar, zzbbq zzbbqVar, boolean z) {
        if (this.f24007b.f25291b != null && zzbgzVar.mo14911h() != null) {
            zzbgzVar.mo14911h().m17710m7(this.f24007b.f25291b);
        }
        zzbbqVar.m17383f();
    }

    /* renamed from: f */
    public final zzbbh<zzbgz> m18643f(final JSONObject jSONObject) {
        return zzbar.m17366c(zzbar.m17366c(zzbar.m17378o(null), new zzbal(this) { // from class: com.google.android.gms.internal.ads.zg

            /* renamed from: a */
            private final zzcbi f21453a;

            {
                this.f21453a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f21453a.m18645h(obj);
            }
        }, this.f24008c), new zzbal(this, jSONObject) { // from class: com.google.android.gms.internal.ads.xg

            /* renamed from: a */
            private final zzcbi f20971a;

            /* renamed from: b */
            private final JSONObject f20972b;

            {
                this.f20971a = this;
                this.f20972b = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20971a.m18640b(this.f20972b, (zzbgz) obj);
            }
        }, this.f24008c);
    }

    /* renamed from: g */
    public final zzbbh<zzbgz> m18644g(final String str, final String str2) {
        return zzbar.m17366c(zzbar.m17378o(null), new zzbal(this, str, str2) { // from class: com.google.android.gms.internal.ads.yg

            /* renamed from: a */
            private final zzcbi f21300a;

            /* renamed from: b */
            private final String f21301b;

            /* renamed from: c */
            private final String f21302c;

            {
                this.f21300a = this;
                this.f21301b = str;
                this.f21302c = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f21300a.m18639a(this.f21301b, this.f21302c, obj);
            }
        }, this.f24008c);
    }

    /* renamed from: h */
    final /* synthetic */ zzbbh m18645h(Object obj) throws Exception {
        zzbgz m18682b = this.f24009d.m18682b(zzyd.m20822Y(this.f24006a));
        final zzbbq m17382e = zzbbq.m17382e(m18682b);
        m18638e(m18682b);
        m18682b.mo14926p().mo17688j(new zzbik(m17382e) { // from class: com.google.android.gms.internal.ads.ah

            /* renamed from: a */
            private final zzbbq f18162a;

            {
                this.f18162a = m17382e;
            }

            @Override // com.google.android.gms.internal.ads.zzbik
            /* renamed from: a */
            public final void mo14762a() {
                this.f18162a.m17383f();
            }
        });
        m18682b.loadUrl((String) zzyt.m20848e().m16421c(zzacu.f21655K2));
        return m17382e;
    }
}
