package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbgp extends zzbft implements zzbfi {

    /* renamed from: i */
    private zzbfa f23013i;

    /* renamed from: j */
    private String f23014j;

    /* renamed from: k */
    private boolean f23015k;

    /* renamed from: l */
    private Exception f23016l;

    /* renamed from: m */
    private boolean f23017m;

    public zzbgp(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        zzbfa zzbfaVar = new zzbfa(zzbdfVar.getContext(), zzbdeVar);
        this.f23013i = zzbfaVar;
        zzbfaVar.m17612x(this);
    }

    /* renamed from: C */
    private static String m17660C(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: D */
    private final void m17661D(String str) {
        synchronized (this) {
            this.f23015k = true;
            notify();
            mo13849c();
        }
        String str2 = this.f23014j;
        if (str2 != null) {
            String mo17641z = mo17641z(str2);
            Exception exc = this.f23016l;
            if (exc != null) {
                m17633q(this.f23014j, mo17641z, "badUrl", m17660C(str, exc));
            } else {
                m17633q(this.f23014j, mo17641z, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    /* renamed from: B */
    public final zzbfa m17662B() {
        synchronized (this) {
            this.f23017m = true;
            notify();
        }
        this.f23013i.m17612x(null);
        zzbfa zzbfaVar = this.f23013i;
        this.f23013i = null;
        return zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: a */
    public final void mo17559a(final boolean z, final long j2) {
        final zzbdf zzbdfVar = this.f22972h.get();
        if (zzbdfVar != null) {
            zzbbm.f22757a.execute(new Runnable(zzbdfVar, z, j2) { // from class: com.google.android.gms.internal.ads.la

                /* renamed from: f */
                private final zzbdf f19757f;

                /* renamed from: g */
                private final boolean f19758g;

                /* renamed from: h */
                private final long f19759h;

                {
                    this.f19757f = zzbdfVar;
                    this.f19758g = z;
                    this.f19759h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19757f.mo14890R(this.f19758g, this.f19759h);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        m17661D(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbft, com.google.android.gms.common.api.Releasable
    /* renamed from: c */
    public final void mo13849c() {
        zzbfa zzbfaVar = this.f23013i;
        if (zzbfaVar != null) {
            zzbfaVar.m17612x(null);
            this.f23013i.m17609t();
        }
        super.mo13849c();
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: e */
    public final void mo17560e(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: f */
    public final void mo17561f(String str, Exception exc) {
        this.f23016l = exc;
        zzbad.m17348d("Precache error", exc);
        m17661D(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: g */
    public final void mo17562g(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: t */
    public final void mo17635t(int i2) {
        this.f23013i.m17589J().m17577j(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: u */
    public final void mo17636u(int i2) {
        this.f23013i.m17589J().m17578k(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: v */
    public final void mo17637v(int i2) {
        this.f23013i.m17589J().m17575h(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: w */
    public final void mo17638w(int i2) {
        this.f23013i.m17589J().m17576i(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        return true;
     */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo17639x(java.lang.String r34, java.lang.String[] r35) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgp.mo17639x(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    public final boolean mo17640y(String str) {
        return mo17639x(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: z */
    protected final String mo17641z(String str) {
        String valueOf = String.valueOf(super.mo17641z(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }
}
