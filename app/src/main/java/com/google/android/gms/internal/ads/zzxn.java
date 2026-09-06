package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxn extends zzdrr<zzxn> {

    /* renamed from: c */
    private Integer f27365c = null;

    /* renamed from: d */
    public String f27366d = null;

    /* renamed from: e */
    private Integer f27367e = null;

    /* renamed from: f */
    private zzwx f27368f = null;

    /* renamed from: g */
    private zzxo f27369g = null;

    /* renamed from: h */
    public long[] f27370h = zzdry.f25856b;

    /* renamed from: i */
    public zzxl f27371i = null;

    /* renamed from: j */
    private zzxm f27372j = null;

    /* renamed from: k */
    private zzwt.zzg f27373k = null;

    /* renamed from: l */
    public zzxj f27374l = null;

    /* renamed from: m */
    public zzwt.zzi f27375m = null;

    /* renamed from: n */
    public zzwt.zzv f27376n = null;

    public zzxn() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        String str = this.f27366d;
        if (str != null) {
            zzdrpVar.m19813k(10, str);
        }
        long[] jArr = this.f27370h;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.f27370h;
                if (i2 >= jArr2.length) {
                    break;
                }
                long j2 = jArr2[i2];
                zzdrpVar.m19816w(14, 0);
                zzdrpVar.m19814l(j2);
                i2++;
            }
        }
        zzxl zzxlVar = this.f27371i;
        if (zzxlVar != null) {
            zzdrpVar.m19809b(15, zzxlVar);
        }
        zzxj zzxjVar = this.f27374l;
        if (zzxjVar != null) {
            zzdrpVar.m19809b(18, zzxjVar);
        }
        zzwt.zzi zziVar = this.f27375m;
        if (zziVar != null) {
            zzdrpVar.m19812j(19, zziVar);
        }
        zzwt.zzv zzvVar = this.f27376n;
        if (zzvVar != null) {
            zzdrpVar.m19812j(20, zzvVar);
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        long[] jArr;
        int mo19820e = super.mo19820e();
        String str = this.f27366d;
        if (str != null) {
            mo19820e += zzdrp.m19801n(10, str);
        }
        long[] jArr2 = this.f27370h;
        if (jArr2 != null && jArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr = this.f27370h;
                if (i2 >= jArr.length) {
                    break;
                }
                i3 += zzdrp.m19800m(jArr[i2]);
                i2++;
            }
            mo19820e = mo19820e + i3 + (jArr.length * 1);
        }
        zzxl zzxlVar = this.f27371i;
        if (zzxlVar != null) {
            mo19820e += zzdrp.m19797g(15, zzxlVar);
        }
        zzxj zzxjVar = this.f27374l;
        if (zzxjVar != null) {
            mo19820e += zzdrp.m19797g(18, zzxjVar);
        }
        zzwt.zzi zziVar = this.f27375m;
        if (zziVar != null) {
            mo19820e += zzdni.m19621K(19, zziVar);
        }
        zzwt.zzv zzvVar = this.f27376n;
        return zzvVar != null ? mo19820e + zzdni.m19621K(20, zzvVar) : mo19820e;
    }
}
