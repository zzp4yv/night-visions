package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import cm.aptoide.p092pt.root.execution.Command;
import com.google.android.gms.internal.ads.zzpo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class b20 {

    /* renamed from: a */
    private static final int f18230a = zzsy.m20545i("vide");

    /* renamed from: b */
    private static final int f18231b = zzsy.m20545i("soun");

    /* renamed from: c */
    private static final int f18232c = zzsy.m20545i(Command.CommandHandler.TEXT);

    /* renamed from: d */
    private static final int f18233d = zzsy.m20545i("sbtl");

    /* renamed from: e */
    private static final int f18234e = zzsy.m20545i("subt");

    /* renamed from: f */
    private static final int f18235f = zzsy.m20545i("clcp");

    /* renamed from: g */
    private static final int f18236g = zzsy.m20545i("cenc");

    /* renamed from: h */
    private static final int f18237h = zzsy.m20545i("meta");

    /* renamed from: a */
    private static int m14845a(zzst zzstVar, int i2, int i3, e20 e20Var, int i4) {
        int m20501b = zzstVar.m20501b();
        while (true) {
            if (m20501b - i2 >= i3) {
                return 0;
            }
            zzstVar.m20510k(m20501b);
            int m20503d = zzstVar.m20503d();
            zzsk.m20478b(m20503d > 0, "childAtomSize should be positive");
            if (zzstVar.m20503d() == y10.f21034V) {
                int i5 = m20501b + 8;
                Pair pair = null;
                Integer num = null;
                zzpb zzpbVar = null;
                boolean z = false;
                while (i5 - m20501b < m20503d) {
                    zzstVar.m20510k(i5);
                    int m20503d2 = zzstVar.m20503d();
                    int m20503d3 = zzstVar.m20503d();
                    if (m20503d3 == y10.f21042b0) {
                        num = Integer.valueOf(zzstVar.m20503d());
                    } else if (m20503d3 == y10.f21035W) {
                        zzstVar.m20511l(4);
                        z = zzstVar.m20503d() == f18236g;
                    } else if (m20503d3 == y10.f21036X) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= m20503d2) {
                                zzpbVar = null;
                                break;
                            }
                            zzstVar.m20510k(i6);
                            int m20503d4 = zzstVar.m20503d();
                            if (zzstVar.m20503d() == y10.f21037Y) {
                                zzstVar.m20511l(6);
                                boolean z2 = zzstVar.m20506g() == 1;
                                int m20506g = zzstVar.m20506g();
                                byte[] bArr = new byte[16];
                                zzstVar.m20513n(bArr, 0, 16);
                                zzpbVar = new zzpb(z2, m20506g, bArr);
                            } else {
                                i6 += m20503d4;
                            }
                        }
                    }
                    i5 += m20503d2;
                }
                if (z) {
                    zzsk.m20478b(num != null, "frma atom is mandatory");
                    zzsk.m20478b(zzpbVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzpbVar);
                }
                if (pair != null) {
                    e20Var.f18720a[i4] = (zzpb) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            m20501b += m20503d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x00a3, code lost:
    
        if (r14 == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047f A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzpa m14846b(com.google.android.gms.internal.ads.z10 r50, com.google.android.gms.internal.ads.a20 r51, long r52, com.google.android.gms.internal.ads.zzne r54, boolean r55) throws com.google.android.gms.internal.ads.zzlm {
        /*
            Method dump skipped, instructions count: 1823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b20.m14846b(com.google.android.gms.internal.ads.z10, com.google.android.gms.internal.ads.a20, long, com.google.android.gms.internal.ads.zzne, boolean):com.google.android.gms.internal.ads.zzpa");
    }

    /* renamed from: c */
    public static n20 m14847c(zzpa zzpaVar, z10 z10Var, zznr zznrVar) throws zzlm {
        d20 g20Var;
        boolean z;
        int i2;
        int i3;
        zzpa zzpaVar2;
        int i4;
        long[] jArr;
        int[] iArr;
        int i5;
        long[] jArr2;
        int[] iArr2;
        long j2;
        long j3;
        long[] jArr3;
        long[] jArr4;
        boolean z2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i6;
        int i7;
        int i8;
        int i9;
        a20 m16152d = z10Var.m16152d(y10.f21072q0);
        if (m16152d != null) {
            g20Var = new f20(m16152d);
        } else {
            a20 m16152d2 = z10Var.m16152d(y10.f21074r0);
            if (m16152d2 == null) {
                throw new zzlm("Track has no sample table size information");
            }
            g20Var = new g20(m16152d2);
        }
        int mo15023b = g20Var.mo15023b();
        if (mo15023b == 0) {
            return new n20(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        a20 m16152d3 = z10Var.m16152d(y10.f21076s0);
        if (m16152d3 == null) {
            m16152d3 = z10Var.m16152d(y10.f21078t0);
            z = true;
        } else {
            z = false;
        }
        zzst zzstVar = m16152d3.f18072Q0;
        zzst zzstVar2 = z10Var.m16152d(y10.f21070p0).f18072Q0;
        zzst zzstVar3 = z10Var.m16152d(y10.f21064m0).f18072Q0;
        a20 m16152d4 = z10Var.m16152d(y10.f21066n0);
        zzst zzstVar4 = null;
        zzst zzstVar5 = m16152d4 != null ? m16152d4.f18072Q0 : null;
        a20 m16152d5 = z10Var.m16152d(y10.f21068o0);
        zzst zzstVar6 = m16152d5 != null ? m16152d5.f18072Q0 : null;
        c20 c20Var = new c20(zzstVar2, zzstVar, z);
        zzstVar3.m20510k(12);
        int m20518s = zzstVar3.m20518s() - 1;
        int m20518s2 = zzstVar3.m20518s();
        int m20518s3 = zzstVar3.m20518s();
        if (zzstVar6 != null) {
            zzstVar6.m20510k(12);
            i2 = zzstVar6.m20518s();
        } else {
            i2 = 0;
        }
        int i10 = -1;
        if (zzstVar5 != null) {
            zzstVar5.m20510k(12);
            i3 = zzstVar5.m20518s();
            if (i3 > 0) {
                i10 = zzstVar5.m20518s() - 1;
                zzstVar4 = zzstVar5;
            }
        } else {
            zzstVar4 = zzstVar5;
            i3 = 0;
        }
        long j4 = 0;
        if (g20Var.mo15022a() && "audio/raw".equals(zzpaVar.f26750f.f26470k) && m20518s == 0 && i2 == 0 && i3 == 0) {
            zzpaVar2 = zzpaVar;
            i4 = mo15023b;
            d20 d20Var = g20Var;
            int i11 = c20Var.f18381a;
            long[] jArr5 = new long[i11];
            int[] iArr6 = new int[i11];
            while (c20Var.m14956a()) {
                int i12 = c20Var.f18382b;
                jArr5[i12] = c20Var.f18384d;
                iArr6[i12] = c20Var.f18383c;
            }
            int mo15024c = d20Var.mo15024c();
            long j5 = m20518s3;
            int i13 = 8192 / mo15024c;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += zzsy.m20546j(iArr6[i15], i13);
            }
            long[] jArr6 = new long[i14];
            int[] iArr7 = new int[i14];
            long[] jArr7 = new long[i14];
            int[] iArr8 = new int[i14];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i16 < i11) {
                int i20 = iArr6[i16];
                long j6 = jArr5[i16];
                int i21 = i11;
                int i22 = i20;
                while (i22 > 0) {
                    int min = Math.min(i13, i22);
                    jArr6[i18] = j6;
                    iArr7[i18] = mo15024c * min;
                    i19 = Math.max(i19, iArr7[i18]);
                    jArr7[i18] = i17 * j5;
                    iArr8[i18] = 1;
                    j6 += iArr7[i18];
                    i17 += min;
                    i22 -= min;
                    i18++;
                    jArr5 = jArr5;
                    iArr6 = iArr6;
                }
                i16++;
                i11 = i21;
            }
            zzou zzouVar = new zzou(jArr6, iArr7, i19, jArr7, iArr8);
            jArr = zzouVar.f26717a;
            iArr = zzouVar.f26718b;
            i5 = zzouVar.f26719c;
            jArr2 = zzouVar.f26720d;
            iArr2 = zzouVar.f26721e;
            j2 = 0;
        } else {
            long[] jArr8 = new long[mo15023b];
            iArr = new int[mo15023b];
            jArr2 = new long[mo15023b];
            int i23 = i3;
            iArr2 = new int[mo15023b];
            int i24 = i10;
            long j7 = 0;
            j2 = 0;
            int i25 = 0;
            i5 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = i2;
            int i30 = m20518s3;
            int i31 = m20518s2;
            int i32 = m20518s;
            int i33 = i23;
            while (i25 < mo15023b) {
                while (i27 == 0) {
                    zzsk.m20481e(c20Var.m14956a());
                    j7 = c20Var.f18384d;
                    i27 = c20Var.f18383c;
                    i30 = i30;
                    i31 = i31;
                }
                int i34 = i31;
                int i35 = i30;
                if (zzstVar6 != null) {
                    while (i26 == 0 && i29 > 0) {
                        i26 = zzstVar6.m20518s();
                        i28 = zzstVar6.m20503d();
                        i29--;
                    }
                    i26--;
                }
                int i36 = i28;
                jArr8[i25] = j7;
                iArr[i25] = g20Var.mo15024c();
                if (iArr[i25] > i5) {
                    i5 = iArr[i25];
                }
                int i37 = mo15023b;
                d20 d20Var2 = g20Var;
                jArr2[i25] = j2 + i36;
                iArr2[i25] = zzstVar4 == null ? 1 : 0;
                if (i25 == i24) {
                    iArr2[i25] = 1;
                    i33--;
                    if (i33 > 0) {
                        i24 = zzstVar4.m20518s() - 1;
                    }
                }
                long[] jArr9 = jArr8;
                j2 += i35;
                int i38 = i34 - 1;
                if (i38 != 0 || i32 <= 0) {
                    i8 = i35;
                    i9 = i38;
                } else {
                    i9 = zzstVar3.m20518s();
                    i8 = zzstVar3.m20518s();
                    i32--;
                }
                int i39 = i9;
                j7 += iArr[i25];
                i27--;
                i25++;
                mo15023b = i37;
                jArr8 = jArr9;
                i24 = i24;
                i28 = i36;
                i31 = i39;
                i30 = i8;
                g20Var = d20Var2;
            }
            i4 = mo15023b;
            long[] jArr10 = jArr8;
            int i40 = i31;
            zzsk.m20477a(i26 == 0);
            while (i29 > 0) {
                zzsk.m20477a(zzstVar6.m20518s() == 0);
                zzstVar6.m20503d();
                i29--;
            }
            if (i33 == 0 && i40 == 0) {
                i7 = i27;
                if (i7 == 0 && i32 == 0) {
                    zzpaVar2 = zzpaVar;
                    jArr = jArr10;
                }
            } else {
                i7 = i27;
            }
            zzpaVar2 = zzpaVar;
            int i41 = zzpaVar2.f26745a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i41);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i33);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i40);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i32);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr10;
        }
        if (zzpaVar2.f26753i == null || zznrVar.m20336c()) {
            int[] iArr9 = iArr;
            zzsy.m20542f(jArr2, 1000000L, zzpaVar2.f26747c);
            return new n20(jArr, iArr9, i5, jArr2, iArr2);
        }
        long[] jArr11 = zzpaVar2.f26753i;
        if (jArr11.length == 1 && zzpaVar2.f26746b == 1 && jArr2.length >= 2) {
            long j8 = zzpaVar2.f26754j[0];
            long m20539c = zzsy.m20539c(jArr11[0], zzpaVar2.f26747c, zzpaVar2.f26748d) + j8;
            if (jArr2[0] <= j8 && j8 < jArr2[1] && jArr2[jArr2.length - 1] < m20539c && m20539c <= j2) {
                long j9 = j2 - m20539c;
                long m20539c2 = zzsy.m20539c(j8 - jArr2[0], zzpaVar2.f26750f.f26483x, zzpaVar2.f26747c);
                long m20539c3 = zzsy.m20539c(j9, zzpaVar2.f26750f.f26483x, zzpaVar2.f26747c);
                if ((m20539c2 != 0 || m20539c3 != 0) && m20539c2 <= 2147483647L && m20539c3 <= 2147483647L) {
                    zznrVar.f26656c = (int) m20539c2;
                    zznrVar.f26657d = (int) m20539c3;
                    zzsy.m20542f(jArr2, 1000000L, zzpaVar2.f26747c);
                    return new n20(jArr, iArr, i5, jArr2, iArr2);
                }
            }
        }
        long[] jArr12 = zzpaVar2.f26753i;
        if (jArr12.length == 1) {
            char c2 = 0;
            if (jArr12[0] == 0) {
                int i42 = 0;
                while (i42 < jArr2.length) {
                    jArr2[i42] = zzsy.m20539c(jArr2[i42] - zzpaVar2.f26754j[c2], 1000000L, zzpaVar2.f26747c);
                    i42++;
                    c2 = 0;
                }
                return new n20(jArr, iArr, i5, jArr2, iArr2);
            }
        }
        boolean z3 = zzpaVar2.f26746b == 1;
        boolean z4 = false;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        while (true) {
            long[] jArr13 = zzpaVar2.f26753i;
            j3 = -1;
            if (i45 >= jArr13.length) {
                break;
            }
            int i46 = i5;
            int[] iArr10 = iArr;
            long j10 = zzpaVar2.f26754j[i45];
            if (j10 != -1) {
                i6 = i46;
                long m20539c4 = zzsy.m20539c(jArr13[i45], zzpaVar2.f26747c, zzpaVar2.f26748d);
                int m20547k = zzsy.m20547k(jArr2, j10, true, true);
                int m20547k2 = zzsy.m20547k(jArr2, j10 + m20539c4, z3, false);
                i43 += m20547k2 - m20547k;
                z4 |= i44 != m20547k;
                i44 = m20547k2;
            } else {
                i6 = i46;
            }
            i45++;
            iArr = iArr10;
            i5 = i6;
        }
        int i47 = i5;
        int[] iArr11 = iArr;
        boolean z5 = z4 | (i43 != i4);
        long[] jArr14 = z5 ? new long[i43] : jArr;
        int[] iArr12 = z5 ? new int[i43] : iArr11;
        int i48 = z5 ? 0 : i47;
        int[] iArr13 = z5 ? new int[i43] : iArr2;
        long[] jArr15 = new long[i43];
        int i49 = i48;
        int i50 = 0;
        int i51 = 0;
        while (true) {
            long[] jArr16 = zzpaVar2.f26753i;
            if (i50 >= jArr16.length) {
                break;
            }
            int[] iArr14 = iArr12;
            int[] iArr15 = iArr13;
            long j11 = zzpaVar2.f26754j[i50];
            long j12 = jArr16[i50];
            if (j11 != j3) {
                jArr3 = jArr14;
                long[] jArr17 = jArr;
                long m20539c5 = zzsy.m20539c(j12, zzpaVar2.f26747c, zzpaVar2.f26748d) + j11;
                int m20547k3 = zzsy.m20547k(jArr2, j11, true, true);
                int m20547k4 = zzsy.m20547k(jArr2, m20539c5, z3, false);
                if (z5) {
                    int i52 = m20547k4 - m20547k3;
                    System.arraycopy(jArr17, m20547k3, jArr3, i51, i52);
                    iArr4 = iArr11;
                    z2 = z3;
                    iArr3 = iArr14;
                    System.arraycopy(iArr4, m20547k3, iArr3, i51, i52);
                    jArr4 = jArr17;
                    iArr5 = iArr15;
                    System.arraycopy(iArr2, m20547k3, iArr5, i51, i52);
                } else {
                    iArr4 = iArr11;
                    jArr4 = jArr17;
                    iArr5 = iArr15;
                    z2 = z3;
                    iArr3 = iArr14;
                }
                int i53 = i49;
                while (m20547k3 < m20547k4) {
                    int[] iArr16 = iArr5;
                    int[] iArr17 = iArr4;
                    long j13 = j11;
                    jArr15[i51] = zzsy.m20539c(j4, 1000000L, zzpaVar2.f26748d) + zzsy.m20539c(jArr2[m20547k3] - j11, 1000000L, zzpaVar2.f26747c);
                    if (z5 && iArr3[i51] > i53) {
                        i53 = iArr17[m20547k3];
                    }
                    i51++;
                    m20547k3++;
                    iArr4 = iArr17;
                    j11 = j13;
                    iArr5 = iArr16;
                }
                iArr15 = iArr5;
                iArr11 = iArr4;
                i49 = i53;
            } else {
                jArr3 = jArr14;
                jArr4 = jArr;
                z2 = z3;
                iArr3 = iArr14;
            }
            j4 += j12;
            i50++;
            iArr12 = iArr3;
            jArr14 = jArr3;
            z3 = z2;
            iArr13 = iArr15;
            jArr = jArr4;
            j3 = -1;
        }
        long[] jArr18 = jArr14;
        int[] iArr18 = iArr12;
        int[] iArr19 = iArr13;
        boolean z6 = false;
        for (int i54 = 0; i54 < iArr19.length && !z6; i54++) {
            z6 |= (iArr19[i54] & 1) != 0;
        }
        if (z6) {
            return new n20(jArr18, iArr18, i49, jArr15, iArr19);
        }
        throw new zzlm("The edited sample sequence does not contain a sync sample.");
    }

    /* renamed from: d */
    public static zzpo m14848d(a20 a20Var, boolean z) {
        if (z) {
            return null;
        }
        zzst zzstVar = a20Var.f18072Q0;
        zzstVar.m20510k(8);
        while (zzstVar.m20520u() >= 8) {
            int m20501b = zzstVar.m20501b();
            int m20503d = zzstVar.m20503d();
            if (zzstVar.m20503d() == y10.f21001B0) {
                zzstVar.m20510k(m20501b);
                int i2 = m20501b + m20503d;
                zzstVar.m20511l(12);
                while (true) {
                    if (zzstVar.m20501b() >= i2) {
                        break;
                    }
                    int m20501b2 = zzstVar.m20501b();
                    int m20503d2 = zzstVar.m20503d();
                    if (zzstVar.m20503d() == y10.f21003C0) {
                        zzstVar.m20510k(m20501b2);
                        int i3 = m20501b2 + m20503d2;
                        zzstVar.m20511l(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzstVar.m20501b() < i3) {
                            zzpo.zza m15362d = j20.m15362d(zzstVar);
                            if (m15362d != null) {
                                arrayList.add(m15362d);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzpo(arrayList);
                        }
                    } else {
                        zzstVar.m20511l(m20503d2 - 8);
                    }
                }
                return null;
            }
            zzstVar.m20511l(m20503d - 8);
        }
        return null;
    }

    /* renamed from: e */
    private static Pair<String, byte[]> m14849e(zzst zzstVar, int i2) {
        zzstVar.m20510k(i2 + 8 + 4);
        zzstVar.m20511l(1);
        m14850f(zzstVar);
        zzstVar.m20511l(2);
        int m20506g = zzstVar.m20506g();
        if ((m20506g & 128) != 0) {
            zzstVar.m20511l(2);
        }
        if ((m20506g & 64) != 0) {
            zzstVar.m20511l(zzstVar.m20507h());
        }
        if ((m20506g & 32) != 0) {
            zzstVar.m20511l(2);
        }
        zzstVar.m20511l(1);
        m14850f(zzstVar);
        int m20506g2 = zzstVar.m20506g();
        String str = null;
        if (m20506g2 == 32) {
            str = "video/mp4v-es";
        } else if (m20506g2 == 33) {
            str = "video/avc";
        } else if (m20506g2 != 35) {
            if (m20506g2 != 64) {
                if (m20506g2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (m20506g2 == 165) {
                    str = "audio/ac3";
                } else if (m20506g2 != 166) {
                    switch (m20506g2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (m20506g2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzstVar.m20511l(12);
        zzstVar.m20511l(1);
        int m14850f = m14850f(zzstVar);
        byte[] bArr = new byte[m14850f];
        zzstVar.m20513n(bArr, 0, m14850f);
        return Pair.create(str, bArr);
    }

    /* renamed from: f */
    private static int m14850f(zzst zzstVar) {
        int m20506g = zzstVar.m20506g();
        int i2 = m20506g & 127;
        while ((m20506g & 128) == 128) {
            m20506g = zzstVar.m20506g();
            i2 = (i2 << 7) | (m20506g & 127);
        }
        return i2;
    }
}
