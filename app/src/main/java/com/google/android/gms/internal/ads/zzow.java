package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class zzow implements zznn, zznu {

    /* renamed from: a */
    private static final zznq f26722a = new k20();

    /* renamed from: b */
    private static final int f26723b = zzsy.m20545i("qt  ");

    /* renamed from: g */
    private int f26728g;

    /* renamed from: h */
    private int f26729h;

    /* renamed from: i */
    private long f26730i;

    /* renamed from: j */
    private int f26731j;

    /* renamed from: k */
    private zzst f26732k;

    /* renamed from: l */
    private int f26733l;

    /* renamed from: m */
    private int f26734m;

    /* renamed from: n */
    private zznp f26735n;

    /* renamed from: o */
    private l20[] f26736o;

    /* renamed from: p */
    private long f26737p;

    /* renamed from: q */
    private boolean f26738q;

    /* renamed from: e */
    private final zzst f26726e = new zzst(16);

    /* renamed from: f */
    private final Stack<z10> f26727f = new Stack<>();

    /* renamed from: c */
    private final zzst f26724c = new zzst(zzsq.f26995a);

    /* renamed from: d */
    private final zzst f26725d = new zzst(4);

    /* renamed from: i */
    private final void m20357i(long j2) throws zzlm {
        zzpa m14846b;
        while (!this.f26727f.isEmpty() && this.f26727f.peek().f21351Q0 == j2) {
            z10 pop = this.f26727f.pop();
            if (pop.f21091P0 == y10.f21000B) {
                long j3 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzpo zzpoVar = null;
                zznr zznrVar = new zznr();
                a20 m16152d = pop.m16152d(y10.f20999A0);
                if (m16152d != null && (zzpoVar = b20.m14848d(m16152d, this.f26738q)) != null) {
                    zznrVar.m20335a(zzpoVar);
                }
                for (int i2 = 0; i2 < pop.f21353S0.size(); i2++) {
                    z10 z10Var = pop.f21353S0.get(i2);
                    if (z10Var.f21091P0 == y10.f21004D && (m14846b = b20.m14846b(z10Var, pop.m16152d(y10.f21002C), -9223372036854775807L, null, this.f26738q)) != null) {
                        n20 m14847c = b20.m14847c(m14846b, z10Var.m16153e(y10.f21006E).m16153e(y10.f21008F).m16153e(y10.f21010G), zznrVar);
                        if (m14847c.f19975a != 0) {
                            l20 l20Var = new l20(m14846b, m14847c, this.f26735n.mo16032y(i2, m14846b.f26746b));
                            zzlh m20206j = m14846b.f26750f.m20206j(m14847c.f19978d + 30);
                            if (m14846b.f26746b == 1) {
                                if (zznrVar.m20336c()) {
                                    m20206j = m20206j.m20207k(zznrVar.f26656c, zznrVar.f26657d);
                                }
                                if (zzpoVar != null) {
                                    m20206j = m20206j.m20205a(zzpoVar);
                                }
                            }
                            l20Var.f19741c.mo20337a(m20206j);
                            j3 = Math.max(j3, m14846b.f26749e);
                            arrayList.add(l20Var);
                        }
                    }
                }
                this.f26737p = j3;
                this.f26736o = (l20[]) arrayList.toArray(new l20[arrayList.size()]);
                this.f26735n.mo16024d();
                this.f26735n.mo16033z(this);
                this.f26727f.clear();
                this.f26728g = 2;
            } else if (!this.f26727f.isEmpty()) {
                this.f26727f.peek().f21353S0.add(pop);
            }
        }
        if (this.f26728g != 2) {
            m20358j();
        }
    }

    /* renamed from: j */
    private final void m20358j() {
        this.f26728g = 0;
        this.f26731j = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: a */
    public final long mo20313a(long j2) {
        long j3 = Long.MAX_VALUE;
        for (l20 l20Var : this.f26736o) {
            n20 n20Var = l20Var.f19740b;
            int m15592a = n20Var.m15592a(j2);
            if (m15592a == -1) {
                m15592a = n20Var.m15593b(j2);
            }
            long j4 = n20Var.f19976b[m15592a];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: b */
    public final boolean mo20314b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: c */
    public final void mo20329c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo20330d(com.google.android.gms.internal.ads.zzno r24, com.google.android.gms.internal.ads.zznt r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.mo20330d(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: e */
    public final void mo20331e(zznp zznpVar) {
        this.f26735n = zznpVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    /* renamed from: f */
    public final long mo20315f() {
        return this.f26737p;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: g */
    public final boolean mo20332g(zzno zznoVar) throws IOException, InterruptedException {
        return m20.m15524a(zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    /* renamed from: h */
    public final void mo20333h(long j2, long j3) {
        this.f26727f.clear();
        this.f26731j = 0;
        this.f26733l = 0;
        this.f26734m = 0;
        if (j2 == 0) {
            m20358j();
            return;
        }
        l20[] l20VarArr = this.f26736o;
        if (l20VarArr != null) {
            for (l20 l20Var : l20VarArr) {
                n20 n20Var = l20Var.f19740b;
                int m15592a = n20Var.m15592a(j3);
                if (m15592a == -1) {
                    m15592a = n20Var.m15593b(j3);
                }
                l20Var.f19742d = m15592a;
            }
        }
    }
}
