package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.pz */
/* loaded from: classes2.dex */
final class C7028pz implements zzkc {

    /* renamed from: a */
    private final Uri f20334a;

    /* renamed from: b */
    private final zzjp f20335b;

    /* renamed from: c */
    private final zzid f20336c;

    /* renamed from: d */
    private final zzjr f20337d;

    /* renamed from: e */
    private final int f20338e;

    /* renamed from: f */
    private final zzij f20339f;

    /* renamed from: g */
    private volatile boolean f20340g;

    /* renamed from: h */
    private boolean f20341h;

    public C7028pz(Uri uri, zzjp zzjpVar, zzid zzidVar, zzjr zzjrVar, int i2, long j2) {
        this.f20334a = (Uri) zzkh.m20128c(uri);
        this.f20335b = (zzjp) zzkh.m20128c(zzjpVar);
        this.f20336c = (zzid) zzkh.m20128c(zzidVar);
        this.f20337d = (zzjr) zzkh.m20128c(zzjrVar);
        this.f20338e = i2;
        zzij zzijVar = new zzij();
        this.f20339f = zzijVar;
        zzijVar.f26298a = j2;
        this.f20341h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    /* renamed from: a */
    public final boolean mo15786a() {
        return this.f20340g;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    /* renamed from: b */
    public final void mo15787b() {
        this.f20340g = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    /* renamed from: c */
    public final void mo15788c() throws IOException, InterruptedException {
        if (this.f20341h) {
            this.f20336c.mo20077e();
            this.f20341h = false;
        }
        int i2 = 0;
        while (i2 == 0 && !this.f20340g) {
            zzib zzibVar = null;
            try {
                long j2 = this.f20339f.f26298a;
                long mo14852a = this.f20335b.mo14852a(new zzjq(this.f20334a, j2, -1L, null));
                if (mo14852a != -1) {
                    mo14852a += j2;
                }
                zzib zzibVar2 = new zzib(this.f20335b, j2, mo14852a);
                while (i2 == 0) {
                    try {
                        if (this.f20340g) {
                            break;
                        }
                        this.f20337d.m20109d(this.f20338e);
                        i2 = this.f20336c.mo20075c(zzibVar2, this.f20339f);
                    } catch (Throwable th) {
                        th = th;
                        zzibVar = zzibVar2;
                        if (i2 != 1 && zzibVar != null) {
                            this.f20339f.f26298a = zzibVar.getPosition();
                        }
                        this.f20335b.close();
                        throw th;
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else {
                    this.f20339f.f26298a = zzibVar2.getPosition();
                }
                this.f20335b.close();
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
