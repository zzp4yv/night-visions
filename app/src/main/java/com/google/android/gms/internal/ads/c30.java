package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* loaded from: classes2.dex */
final class c30 implements zzsh {

    /* renamed from: a */
    private final Uri f18392a;

    /* renamed from: b */
    private final zzrv f18393b;

    /* renamed from: c */
    private final d30 f18394c;

    /* renamed from: d */
    private final zzsm f18395d;

    /* renamed from: f */
    private volatile boolean f18397f;

    /* renamed from: h */
    private long f18399h;

    /* renamed from: j */
    private final /* synthetic */ x20 f18401j;

    /* renamed from: e */
    private final zznt f18396e = new zznt();

    /* renamed from: g */
    private boolean f18398g = true;

    /* renamed from: i */
    private long f18400i = -1;

    public c30(x20 x20Var, Uri uri, zzrv zzrvVar, d30 d30Var, zzsm zzsmVar) {
        this.f18401j = x20Var;
        this.f18392a = (Uri) zzsk.m20480d(uri);
        this.f18393b = (zzrv) zzsk.m20480d(zzrvVar);
        this.f18394c = (d30) zzsk.m20480d(d30Var);
        this.f18395d = zzsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    /* renamed from: a */
    public final boolean mo14959a() {
        return this.f18397f;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    /* renamed from: b */
    public final void mo14960b() {
        this.f18397f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    /* renamed from: c */
    public final void mo14961c() throws IOException, InterruptedException {
        long j2;
        String str;
        zznm zznmVar;
        long j3;
        Handler handler;
        Runnable runnable;
        int i2 = 0;
        while (i2 == 0 && !this.f18397f) {
            zznm zznmVar2 = null;
            try {
                j2 = this.f18396e.f26658a;
                zzrv zzrvVar = this.f18393b;
                Uri uri = this.f18392a;
                str = this.f18401j.f20920m;
                long mo15549a = zzrvVar.mo15549a(new zzry(uri, j2, -1L, str));
                this.f18400i = mo15549a;
                if (mo15549a != -1) {
                    this.f18400i = mo15549a + j2;
                }
                zznmVar = new zznm(this.f18393b, j2, this.f18400i);
            } catch (Throwable th) {
                th = th;
            }
            try {
                zznn m15026b = this.f18394c.m15026b(zznmVar, this.f18393b.mo15548I0());
                if (this.f18398g) {
                    m15026b.mo20333h(j2, this.f18399h);
                    this.f18398g = false;
                }
                while (i2 == 0 && !this.f18397f) {
                    this.f18395d.m20488a();
                    i2 = m15026b.mo20330d(zznmVar, this.f18396e);
                    long position = zznmVar.getPosition();
                    j3 = this.f18401j.f20921n;
                    if (position > j3 + j2) {
                        j2 = zznmVar.getPosition();
                        this.f18395d.m20490c();
                        handler = this.f18401j.f20927t;
                        runnable = this.f18401j.f20926s;
                        handler.post(runnable);
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    this.f18396e.f26658a = zznmVar.getPosition();
                }
                zzsy.m20541e(this.f18393b);
            } catch (Throwable th2) {
                th = th2;
                zznmVar2 = zznmVar;
                if (i2 != 1 && zznmVar2 != null) {
                    this.f18396e.f26658a = zznmVar2.getPosition();
                }
                zzsy.m20541e(this.f18393b);
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m14962e(long j2, long j3) {
        this.f18396e.f26658a = j2;
        this.f18399h = j3;
        this.f18398g = true;
    }
}
