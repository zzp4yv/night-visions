package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class zziv implements zzid, zzio {

    /* renamed from: f */
    private long f26308f;

    /* renamed from: g */
    private int f26309g;

    /* renamed from: h */
    private long f26310h;

    /* renamed from: i */
    private int f26311i;

    /* renamed from: j */
    private zzkm f26312j;

    /* renamed from: k */
    private int f26313k;

    /* renamed from: l */
    private int f26314l;

    /* renamed from: m */
    private int f26315m;

    /* renamed from: n */
    private zzif f26316n;

    /* renamed from: o */
    private C7361yz[] f26317o;

    /* renamed from: c */
    private final zzkm f26305c = new zzkm(16);

    /* renamed from: d */
    private final Stack<zzir> f26306d = new Stack<>();

    /* renamed from: a */
    private final zzkm f26303a = new zzkm(zzkj.f26421a);

    /* renamed from: b */
    private final zzkm f26304b = new zzkm(4);

    /* renamed from: e */
    private int f26307e = 0;

    @Override // com.google.android.gms.internal.ads.zzio
    /* renamed from: a */
    public final long mo20059a(long j2) {
        int i2;
        long j3 = Long.MAX_VALUE;
        int i3 = 0;
        while (true) {
            C7361yz[] c7361yzArr = this.f26317o;
            if (i3 >= c7361yzArr.length) {
                return j3;
            }
            C7398zz c7398zz = c7361yzArr[i3].f21343b;
            int m20155a = zzkq.m20155a(c7398zz.f21487d, j2, true, false);
            while (true) {
                i2 = -1;
                if (m20155a < 0) {
                    m20155a = -1;
                    break;
                }
                if (c7398zz.f21487d[m20155a] <= j2 && (c7398zz.f21488e[m20155a] & 1) != 0) {
                    break;
                }
                m20155a--;
            }
            if (m20155a == -1) {
                int m20162h = zzkq.m20162h(c7398zz.f21487d, j2, true, false);
                while (true) {
                    long[] jArr = c7398zz.f21487d;
                    if (m20162h < jArr.length) {
                        if (jArr[m20162h] >= j2 && (c7398zz.f21488e[m20162h] & 1) != 0) {
                            i2 = m20162h;
                            break;
                        }
                        m20162h++;
                    } else {
                        break;
                    }
                }
                m20155a = i2;
            }
            C7361yz[] c7361yzArr2 = this.f26317o;
            c7361yzArr2[i3].f21345d = m20155a;
            long j4 = c7398zz.f21485b[c7361yzArr2[i3].f21345d];
            if (j4 < j3) {
                j3 = j4;
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzio
    /* renamed from: b */
    public final boolean mo20060b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: c */
    public final int mo20075c(zzie zzieVar, zzij zzijVar) throws IOException, InterruptedException {
        C7361yz[] c7361yzArr;
        int i2;
        long j2;
        zzir zzirVar;
        boolean z;
        zziv zzivVar;
        ArrayList arrayList;
        int i3;
        zzix m15999a;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzkm zzkmVar;
        zzkm zzkmVar2;
        int i13;
        zzkm zzkmVar3;
        int i14;
        int i15;
        int i16;
        boolean z2;
        zziv zzivVar2 = this;
        zzie zzieVar2 = zzieVar;
        zzij zzijVar2 = zzijVar;
        while (true) {
            int i17 = zzivVar2.f26307e;
            if (i17 == 0) {
                zziv zzivVar3 = zzivVar2;
                if (zzieVar.mo20062b(zzivVar3.f26305c.f26424a, 0, 8, true)) {
                    zzivVar3.f26305c.m20145g(0);
                    zzivVar3.f26310h = zzivVar3.f26305c.m20149k();
                    zzivVar3.f26309g = zzivVar3.f26305c.m20141c();
                    if (zzivVar3.f26310h == 1) {
                        zzieVar.readFully(zzivVar3.f26305c.f26424a, 8, 8);
                        zzivVar3.f26310h = zzivVar3.f26305c.m20142d();
                        zzivVar3.f26308f += 16;
                        zzivVar3.f26311i = 16;
                    } else {
                        zzivVar3.f26308f += 8;
                        zzivVar3.f26311i = 8;
                    }
                    int i18 = zzivVar3.f26309g;
                    if (i18 == C7250vz.f20805p || i18 == C7250vz.f20807r || i18 == C7250vz.f20808s || i18 == C7250vz.f20809t || i18 == C7250vz.f20810u) {
                        if (zzivVar3.f26310h == 1) {
                            zzivVar3.f26306d.add(new zzir(zzivVar3.f26309g, (zzivVar3.f26308f + zzivVar3.f26310h) - zzivVar3.f26311i));
                        } else {
                            zzivVar3.f26306d.add(new zzir(zzivVar3.f26309g, (zzivVar3.f26308f + zzivVar3.f26310h) - zzivVar3.f26311i));
                        }
                        zzivVar3.f26307e = 0;
                    } else {
                        if (i18 == C7250vz.f20764A || i18 == C7250vz.f20806q || i18 == C7250vz.f20765B || i18 == C7250vz.f20780Q || i18 == C7250vz.f20781R || i18 == C7250vz.f20766C || i18 == C7250vz.f20791b || i18 == C7250vz.f20811v || i18 == C7250vz.f20795f || i18 == C7250vz.f20793d || i18 == C7250vz.f20783T || i18 == C7250vz.f20784U || i18 == C7250vz.f20785V || i18 == C7250vz.f20786W || i18 == C7250vz.f20787X || i18 == C7250vz.f20788Y || i18 == C7250vz.f20789Z || i18 == C7250vz.f20815z) {
                            zzkh.m20129d(zzivVar3.f26310h < 2147483647L);
                            zzkm zzkmVar4 = new zzkm((int) zzivVar3.f26310h);
                            zzivVar3.f26312j = zzkmVar4;
                            System.arraycopy(zzivVar3.f26305c.f26424a, 0, zzkmVar4.f26424a, 0, 8);
                            zzivVar3.f26307e = 1;
                        } else {
                            zzivVar3.f26312j = null;
                            zzivVar3.f26307e = 1;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return -1;
                }
                zzijVar2 = zzijVar;
                zzivVar2 = zzivVar3;
                zzieVar2 = zzieVar;
            } else {
                if (i17 != 1) {
                    long j3 = Long.MAX_VALUE;
                    int i19 = 0;
                    int i20 = -1;
                    while (true) {
                        c7361yzArr = zzivVar2.f26317o;
                        if (i19 >= c7361yzArr.length) {
                            break;
                        }
                        C7361yz c7361yz = c7361yzArr[i19];
                        int i21 = c7361yz.f21345d;
                        C7398zz c7398zz = c7361yz.f21343b;
                        if (i21 != c7398zz.f21484a) {
                            long j4 = c7398zz.f21485b[i21];
                            if (j4 < j3) {
                                i20 = i19;
                                j3 = j4;
                            }
                        }
                        i19++;
                    }
                    if (i20 == -1) {
                        return -1;
                    }
                    C7361yz c7361yz2 = c7361yzArr[i20];
                    int i22 = c7361yz2.f21345d;
                    long j5 = c7361yz2.f21343b.f21485b[i22];
                    long position = (j5 - zzieVar.getPosition()) + zzivVar2.f26314l;
                    if (position < 0) {
                        i2 = 1;
                        j2 = j5;
                    } else {
                        if (position < 262144) {
                            zzieVar2.mo20061a((int) position);
                            zzivVar2.f26313k = c7361yz2.f21343b.f21486c[i22];
                            int i23 = c7361yz2.f21342a.f26324g;
                            if (i23 == -1) {
                                while (true) {
                                    int i24 = zzivVar2.f26314l;
                                    int i25 = zzivVar2.f26313k;
                                    if (i24 >= i25) {
                                        break;
                                    }
                                    int mo20064a = c7361yz2.f21344c.mo20064a(zzieVar2, i25 - i24);
                                    zzivVar2.f26314l += mo20064a;
                                    zzivVar2.f26315m -= mo20064a;
                                }
                            } else {
                                byte[] bArr = zzivVar2.f26304b.f26424a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i26 = 4 - i23;
                                while (zzivVar2.f26314l < zzivVar2.f26313k) {
                                    int i27 = zzivVar2.f26315m;
                                    if (i27 == 0) {
                                        zzieVar2.readFully(zzivVar2.f26304b.f26424a, i26, i23);
                                        zzivVar2.f26304b.m20145g(0);
                                        zzivVar2.f26315m = zzivVar2.f26304b.m20151m();
                                        zzivVar2.f26303a.m20145g(0);
                                        c7361yz2.f21344c.mo20066c(zzivVar2.f26303a, 4);
                                        zzivVar2.f26314l += 4;
                                        zzivVar2.f26313k += i26;
                                    } else {
                                        int mo20064a2 = c7361yz2.f21344c.mo20064a(zzieVar2, i27);
                                        zzivVar2.f26314l += mo20064a2;
                                        zzivVar2.f26315m -= mo20064a2;
                                    }
                                }
                            }
                            zzip zzipVar = c7361yz2.f21344c;
                            C7398zz c7398zz2 = c7361yz2.f21343b;
                            zzipVar.mo15814d(c7398zz2.f21487d[i22], c7398zz2.f21488e[i22], zzivVar2.f26313k, 0, null);
                            c7361yz2.f21345d++;
                            zzivVar2.f26314l = 0;
                            zzivVar2.f26315m = 0;
                            return 0;
                        }
                        j2 = j5;
                        i2 = 1;
                    }
                    zzijVar2.f26298a = j2;
                    return i2;
                }
                zzivVar2.f26307e = 0;
                long j6 = zzivVar2.f26308f;
                long j7 = zzivVar2.f26310h;
                int i28 = zzivVar2.f26311i;
                long j8 = j6 + (j7 - i28);
                zzivVar2.f26308f = j8;
                long j9 = j7 - i28;
                zzkm zzkmVar5 = zzivVar2.f26312j;
                boolean z3 = zzkmVar5 == null && (j7 >= 262144 || j7 > 2147483647L);
                if (z3) {
                    zzijVar2.f26298a = j8;
                } else if (zzkmVar5 != null) {
                    zzieVar2.readFully(zzkmVar5.f26424a, i28, (int) j9);
                    if (!zzivVar2.f26306d.isEmpty()) {
                        zzivVar2.f26306d.peek().f26300c0.add(new zzis(zzivVar2.f26309g, zzivVar2.f26312j));
                    }
                } else {
                    zzieVar2.mo20061a((int) j9);
                }
                while (!zzivVar2.f26306d.isEmpty() && zzivVar2.f26306d.peek().f26299b0 == zzivVar2.f26308f) {
                    zzir pop = zzivVar2.f26306d.pop();
                    if (pop.f20816a0 == C7250vz.f20805p) {
                        ArrayList arrayList2 = new ArrayList();
                        int i29 = 0;
                        while (i29 < pop.f26301d0.size()) {
                            zzir zzirVar2 = pop.f26301d0.get(i29);
                            if (zzirVar2.f20816a0 == C7250vz.f20807r && (m15999a = C7287wz.m15999a(zzirVar2, pop.m20093c(C7250vz.f20806q))) != null && ((i4 = m15999a.f26319b) == 1936684398 || i4 == 1986618469)) {
                                zzir m20094d = zzirVar2.m20094d(C7250vz.f20808s).m20094d(C7250vz.f20809t).m20094d(C7250vz.f20810u);
                                zzkm zzkmVar6 = m20094d.m20093c(C7250vz.f20787X).f26302b0;
                                int i30 = C7250vz.f20788Y;
                                zzis m20093c = m20094d.m20093c(i30);
                                if (m20093c == null) {
                                    m20093c = m20094d.m20093c(C7250vz.f20789Z);
                                }
                                zzkm zzkmVar7 = m20093c.f26302b0;
                                zzkm zzkmVar8 = m20094d.m20093c(C7250vz.f20786W).f26302b0;
                                zzkm zzkmVar9 = m20094d.m20093c(C7250vz.f20783T).f26302b0;
                                zzis m20093c2 = m20094d.m20093c(C7250vz.f20784U);
                                zzkm zzkmVar10 = m20093c2 != null ? m20093c2.f26302b0 : null;
                                zzis m20093c3 = m20094d.m20093c(C7250vz.f20785V);
                                zzkm zzkmVar11 = m20093c3 != null ? m20093c3.f26302b0 : null;
                                zzkmVar6.m20145g(12);
                                int m20151m = zzkmVar6.m20151m();
                                int m20151m2 = zzkmVar6.m20151m();
                                int[] iArr = new int[m20151m2];
                                z = z3;
                                long[] jArr = new long[m20151m2];
                                zzirVar = pop;
                                long[] jArr2 = new long[m20151m2];
                                ArrayList arrayList3 = arrayList2;
                                int[] iArr2 = new int[m20151m2];
                                int i31 = i29;
                                zzkmVar7.m20145g(12);
                                int m20151m3 = zzkmVar7.m20151m();
                                zzkmVar8.m20145g(12);
                                int m20151m4 = zzkmVar8.m20151m() - 1;
                                int i32 = m20151m3;
                                if (!(zzkmVar8.m20141c() == 1)) {
                                    throw new IllegalStateException("stsc first chunk must be 1");
                                }
                                int m20151m5 = zzkmVar8.m20151m();
                                zzkmVar8.m20146h(4);
                                if (m20151m4 > 0) {
                                    i7 = zzkmVar8.m20151m() - 1;
                                    i5 = m20151m5;
                                    i6 = 12;
                                } else {
                                    i5 = m20151m5;
                                    i6 = 12;
                                    i7 = -1;
                                }
                                zzkmVar9.m20145g(i6);
                                int m20151m6 = zzkmVar9.m20151m() - 1;
                                int m20151m7 = zzkmVar9.m20151m();
                                int m20151m8 = zzkmVar9.m20151m();
                                if (zzkmVar11 != null) {
                                    zzkmVar11.m20145g(i6);
                                    i8 = zzkmVar11.m20151m() - 1;
                                    i9 = zzkmVar11.m20151m();
                                    i10 = zzkmVar11.m20141c();
                                } else {
                                    i8 = 0;
                                    i9 = 0;
                                    i10 = 0;
                                }
                                if (zzkmVar10 != null) {
                                    zzkmVar10.m20145g(i6);
                                    int m20151m9 = zzkmVar10.m20151m();
                                    i11 = zzkmVar10.m20151m() - 1;
                                    i12 = m20151m9;
                                } else {
                                    i11 = -1;
                                    i12 = 0;
                                }
                                int i33 = i12;
                                long m20149k = m20093c.f20816a0 == i30 ? zzkmVar7.m20149k() : zzkmVar7.m20152n();
                                int i34 = 0;
                                long j10 = 0;
                                int i35 = i7;
                                int i36 = i11;
                                int i37 = 0;
                                int i38 = i9;
                                zzkm zzkmVar12 = zzkmVar8;
                                int i39 = m20151m8;
                                int i40 = m20151m6;
                                int i41 = m20151m4;
                                int i42 = i10;
                                int i43 = i8;
                                int i44 = m20151m7;
                                int i45 = i5;
                                while (i37 < m20151m2) {
                                    jArr2[i37] = m20149k;
                                    iArr[i37] = m20151m == 0 ? zzkmVar6.m20151m() : m20151m;
                                    zzkm zzkmVar13 = zzkmVar6;
                                    int i46 = i34;
                                    jArr[i37] = j10 + i42;
                                    iArr2[i37] = zzkmVar10 == null ? 1 : 0;
                                    if (i37 == i36) {
                                        iArr2[i37] = 1;
                                        i33--;
                                        if (i33 > 0) {
                                            i36 = zzkmVar10.m20151m() - 1;
                                        }
                                    }
                                    j10 += i39;
                                    i44--;
                                    if (i44 == 0 && i40 > 0) {
                                        i40--;
                                        i44 = zzkmVar9.m20151m();
                                        i39 = zzkmVar9.m20151m();
                                    }
                                    if (zzkmVar11 != null && i38 - 1 == 0 && i43 > 0) {
                                        i43--;
                                        i38 = zzkmVar11.m20151m();
                                        i42 = zzkmVar11.m20141c();
                                    }
                                    i5--;
                                    if (i5 == 0) {
                                        i34 = i46 + 1;
                                        i13 = i32;
                                        i14 = i33;
                                        if (i34 < i13) {
                                            zzkmVar = zzkmVar11;
                                            m20149k = m20093c.f20816a0 == C7250vz.f20788Y ? zzkmVar7.m20149k() : zzkmVar7.m20152n();
                                        } else {
                                            zzkmVar = zzkmVar11;
                                        }
                                        i15 = i35;
                                        if (i34 == i15) {
                                            i45 = zzkmVar12.m20151m();
                                            zzkmVar2 = zzkmVar10;
                                            zzkmVar3 = zzkmVar12;
                                            zzkmVar3.m20146h(4);
                                            i41--;
                                            if (i41 > 0) {
                                                i15 = zzkmVar3.m20151m() - 1;
                                            }
                                        } else {
                                            zzkmVar2 = zzkmVar10;
                                            zzkmVar3 = zzkmVar12;
                                        }
                                        i16 = m20151m2;
                                        if (i34 < i13) {
                                            i5 = i45;
                                        }
                                    } else {
                                        zzkmVar = zzkmVar11;
                                        zzkmVar2 = zzkmVar10;
                                        i13 = i32;
                                        zzkmVar3 = zzkmVar12;
                                        i14 = i33;
                                        i15 = i35;
                                        i16 = m20151m2;
                                        m20149k += iArr[i37];
                                        i34 = i46;
                                    }
                                    i37++;
                                    i35 = i15;
                                    zzkmVar10 = zzkmVar2;
                                    i33 = i14;
                                    m20151m2 = i16;
                                    zzkmVar12 = zzkmVar3;
                                    i32 = i13;
                                    zzkmVar6 = zzkmVar13;
                                    zzkmVar11 = zzkmVar;
                                }
                                zzkq.m20157c(jArr, 1000000L, m15999a.f26320c);
                                zzkh.m20126a(i33 == 0);
                                zzkh.m20126a(i44 == 0);
                                zzkh.m20126a(i5 == 0);
                                zzkh.m20126a(i40 == 0);
                                zzkh.m20126a(i43 == 0);
                                C7398zz c7398zz3 = new C7398zz(jArr2, iArr, jArr, iArr2);
                                if (c7398zz3.f21484a != 0) {
                                    zzivVar = this;
                                    i3 = i31;
                                    C7361yz c7361yz3 = new C7361yz(m15999a, c7398zz3, zzivVar.f26316n.mo20080f(i3));
                                    c7361yz3.f21344c.mo20065b(m15999a.f26322e);
                                    arrayList = arrayList3;
                                    arrayList.add(c7361yz3);
                                } else {
                                    zzivVar = this;
                                    arrayList = arrayList3;
                                    i3 = i31;
                                }
                            } else {
                                zzirVar = pop;
                                z = z3;
                                zzivVar = zzivVar2;
                                arrayList = arrayList2;
                                i3 = i29;
                            }
                            i29 = i3 + 1;
                            arrayList2 = arrayList;
                            zzivVar2 = zzivVar;
                            z3 = z;
                            pop = zzirVar;
                        }
                        zziv zzivVar4 = zzivVar2;
                        zzivVar4.f26317o = (C7361yz[]) arrayList2.toArray(new C7361yz[0]);
                        zzivVar4.f26316n.mo20078d();
                        zzivVar4.f26316n.mo20081g(zzivVar4);
                        zzivVar4.f26307e = 2;
                        zzivVar2 = zzivVar4;
                    } else {
                        boolean z4 = z3;
                        zziv zzivVar5 = zzivVar2;
                        if (!zzivVar5.f26306d.isEmpty()) {
                            zzivVar5.f26306d.peek().f26301d0.add(pop);
                        }
                        zzivVar2 = zzivVar5;
                        z3 = z4;
                    }
                }
                zziv zzivVar6 = zzivVar2;
                if (z3) {
                    return 1;
                }
                zzieVar2 = zzieVar;
                zzijVar2 = zzijVar;
                zzivVar2 = zzivVar6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: d */
    public final void mo20076d(zzif zzifVar) {
        this.f26316n = zzifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    /* renamed from: e */
    public final void mo20077e() {
        this.f26308f = 0L;
        this.f26314l = 0;
        this.f26315m = 0;
    }
}
