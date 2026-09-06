package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wz */
/* loaded from: classes2.dex */
final class C7287wz {
    /* renamed from: a */
    public static zzix m15999a(zzir zzirVar, zzis zzisVar) {
        boolean z;
        boolean z2;
        long m20149k;
        int i2;
        int i3;
        int i4;
        int i5;
        zzir m20094d = zzirVar.m20094d(C7250vz.f20808s);
        zzkm zzkmVar = m20094d.m20093c(C7250vz.f20765B).f26302b0;
        zzkmVar.m20145g(16);
        int m20141c = zzkmVar.m20141c();
        if (m20141c != 1936684398 && m20141c != 1986618469 && m20141c != 1952807028 && m20141c != 1953325924) {
            return null;
        }
        zzkm zzkmVar2 = zzirVar.m20093c(C7250vz.f20815z).f26302b0;
        zzkmVar2.m20145g(8);
        int m15972a = C7250vz.m15972a(zzkmVar2.m20141c());
        zzkmVar2.m20146h(m15972a == 0 ? 8 : 16);
        int m20141c2 = zzkmVar2.m20141c();
        zzkmVar2.m20146h(4);
        int m20139a = zzkmVar2.m20139a();
        int i6 = m15972a == 0 ? 4 : 8;
        int i7 = 0;
        while (true) {
            z = true;
            if (i7 >= i6) {
                z2 = true;
                break;
            }
            if (zzkmVar2.f26424a[m20139a + i7] != -1) {
                z2 = false;
                break;
            }
            i7++;
        }
        if (z2) {
            zzkmVar2.m20146h(i6);
            m20149k = -1;
        } else {
            m20149k = m15972a == 0 ? zzkmVar2.m20149k() : zzkmVar2.m20152n();
        }
        Pair create = Pair.create(Integer.valueOf(m20141c2), Long.valueOf(m20149k));
        int intValue = ((Integer) create.first).intValue();
        long longValue = ((Long) create.second).longValue();
        zzkm zzkmVar3 = zzisVar.f26302b0;
        zzkmVar3.m20145g(8);
        zzkmVar3.m20146h(C7250vz.m15972a(zzkmVar3.m20141c()) == 0 ? 8 : 16);
        long m20156b = longValue == -1 ? -1L : zzkq.m20156b(longValue, 1000000L, zzkmVar3.m20149k());
        zzir m20094d2 = m20094d.m20094d(C7250vz.f20809t).m20094d(C7250vz.f20810u);
        zzkm zzkmVar4 = m20094d.m20093c(C7250vz.f20764A).f26302b0;
        zzkmVar4.m20145g(8);
        zzkmVar4.m20146h(C7250vz.m15972a(zzkmVar4.m20141c()) != 0 ? 16 : 8);
        long m20149k2 = zzkmVar4.m20149k();
        zzkm zzkmVar5 = m20094d2.m20093c(C7250vz.f20766C).f26302b0;
        zzkmVar5.m20145g(12);
        int m20141c3 = zzkmVar5.m20141c();
        C7324xz c7324xz = new C7324xz(m20141c3);
        int i8 = 0;
        while (i8 < m20141c3) {
            int m20139a2 = zzkmVar5.m20139a();
            int m20141c4 = zzkmVar5.m20141c();
            zzkh.m20127b(m20141c4 > 0, "childAtomSize should be positive");
            int m20141c5 = zzkmVar5.m20141c();
            if (m20141c5 == C7250vz.f20791b || m20141c5 == C7250vz.f20792c || m20141c5 == C7250vz.f20772I) {
                i2 = m20141c3;
                i3 = intValue;
                i4 = m20141c;
                i5 = m20141c4;
                zzkmVar5.m20145g(m20139a2 + 8);
                zzkmVar5.m20146h(24);
                int m20144f = zzkmVar5.m20144f();
                int m20144f2 = zzkmVar5.m20144f();
                zzkmVar5.m20146h(50);
                int m20139a3 = zzkmVar5.m20139a();
                float f2 = 1.0f;
                List list = null;
                while (m20139a3 - m20139a2 < i5) {
                    zzkmVar5.m20145g(m20139a3);
                    int m20139a4 = zzkmVar5.m20139a();
                    int m20141c6 = zzkmVar5.m20141c();
                    if (m20141c6 == 0 && zzkmVar5.m20139a() - m20139a2 == i5) {
                        break;
                    }
                    zzkh.m20127b(m20141c6 > 0, "childAtomSize should be positive");
                    int m20141c7 = zzkmVar5.m20141c();
                    if (m20141c7 == C7250vz.f20811v) {
                        zzkmVar5.m20145g(m20139a4 + 8 + 4);
                        int m20143e = (zzkmVar5.m20143e() & 3) + 1;
                        if (m20143e == 3) {
                            throw new IllegalStateException();
                        }
                        ArrayList arrayList = new ArrayList();
                        int m20143e2 = zzkmVar5.m20143e() & 31;
                        for (int i9 = 0; i9 < m20143e2; i9++) {
                            arrayList.add(zzkj.m20132a(zzkmVar5));
                        }
                        int m20143e3 = zzkmVar5.m20143e();
                        for (int i10 = 0; i10 < m20143e3; i10++) {
                            arrayList.add(zzkj.m20132a(zzkmVar5));
                        }
                        Pair create2 = Pair.create(arrayList, Integer.valueOf(m20143e));
                        list = (List) create2.first;
                        c7324xz.f20990c = ((Integer) create2.second).intValue();
                    } else if (m20141c7 == C7250vz.f20768E) {
                        c7324xz.f20988a[i8] = m16000b(zzkmVar5, m20139a4, m20141c6);
                    } else if (m20141c7 == C7250vz.f20778O) {
                        zzkmVar5.m20145g(m20139a4 + 8);
                        f2 = zzkmVar5.m20151m() / zzkmVar5.m20151m();
                    }
                    m20139a3 += m20141c6;
                }
                z = true;
                c7324xz.f20989b = zzhj.m20022d("video/avc", -1, m20156b, m20144f, m20144f2, f2, list);
            } else {
                if (m20141c5 == C7250vz.f20795f || m20141c5 == C7250vz.f20773J || m20141c5 == C7250vz.f20796g) {
                    i2 = m20141c3;
                    i5 = m20141c4;
                    zzkmVar5.m20145g(m20139a2 + 8);
                    zzkmVar5.m20146h(16);
                    int m20144f3 = zzkmVar5.m20144f();
                    int m20144f4 = zzkmVar5.m20144f();
                    zzkmVar5.m20146h(4);
                    int m20150l = zzkmVar5.m20150l();
                    int m20139a5 = zzkmVar5.m20139a();
                    int i11 = m20144f3;
                    int i12 = m20150l;
                    byte[] bArr = null;
                    while (true) {
                        if (m20139a5 - m20139a2 < i5) {
                            zzkmVar5.m20145g(m20139a5);
                            int m20139a6 = zzkmVar5.m20139a();
                            int m20141c8 = zzkmVar5.m20141c();
                            i4 = m20141c;
                            zzkh.m20127b(m20141c8 > 0, "childAtomSize should be positive");
                            int m20141c9 = zzkmVar5.m20141c();
                            i3 = intValue;
                            if (m20141c5 != C7250vz.f20795f && m20141c5 != C7250vz.f20773J) {
                                if (m20141c5 != C7250vz.f20796g || m20141c9 != C7250vz.f20797h) {
                                    if (m20141c5 == C7250vz.f20798i && m20141c9 == C7250vz.f20799j) {
                                        zzkmVar5.m20145g(m20139a6 + 8);
                                        c7324xz.f20989b = zzkg.m20125c(zzkmVar5);
                                        break;
                                    }
                                } else {
                                    zzkmVar5.m20145g(m20139a6 + 8);
                                    c7324xz.f20989b = zzkg.m20124b(zzkmVar5);
                                    break;
                                }
                            } else if (m20141c9 == C7250vz.f20793d) {
                                bArr = m16001c(zzkmVar5, m20139a6);
                                Pair<Integer, Integer> m20131b = zzki.m20131b(bArr);
                                i12 = ((Integer) m20131b.first).intValue();
                                i11 = ((Integer) m20131b.second).intValue();
                            } else if (m20141c9 == C7250vz.f20768E) {
                                c7324xz.f20988a[i8] = m16000b(zzkmVar5, m20139a6, m20141c8);
                            }
                            m20139a5 += m20141c8;
                            m20141c = i4;
                            intValue = i3;
                        } else {
                            i3 = intValue;
                            i4 = m20141c;
                            c7324xz.f20989b = zzhj.m20025g(m20141c5 == C7250vz.f20796g ? "audio/ac3" : m20141c5 == C7250vz.f20798i ? "audio/eac3" : "audio/mp4a-latm", m20144f4, m20156b, i11, i12, bArr == null ? null : Collections.singletonList(bArr));
                        }
                    }
                } else if (m20141c5 == C7250vz.f20779P) {
                    c7324xz.f20989b = zzhj.m20026h();
                    i2 = m20141c3;
                    i3 = intValue;
                    i4 = m20141c;
                    i5 = m20141c4;
                } else if (m20141c5 == C7250vz.f20782S) {
                    zzkmVar5.m20145g(m20139a2 + 8);
                    zzkmVar5.m20146h(24);
                    int m20144f5 = zzkmVar5.m20144f();
                    int m20144f6 = zzkmVar5.m20144f();
                    zzkmVar5.m20146h(50);
                    ArrayList arrayList2 = new ArrayList(z ? 1 : 0);
                    int m20139a7 = zzkmVar5.m20139a();
                    while (m20139a7 - m20139a2 < m20141c4) {
                        zzkmVar5.m20145g(m20139a7);
                        int m20139a8 = zzkmVar5.m20139a();
                        int m20141c10 = zzkmVar5.m20141c();
                        if (m20141c10 <= 0) {
                            z = false;
                        }
                        zzkh.m20127b(z, "childAtomSize should be positive");
                        int i13 = m20141c3;
                        if (zzkmVar5.m20141c() == C7250vz.f20793d) {
                            arrayList2.add(m16001c(zzkmVar5, m20139a8));
                        }
                        m20139a7 += m20141c10;
                        m20141c3 = i13;
                        z = true;
                    }
                    i2 = m20141c3;
                    i5 = m20141c4;
                    c7324xz.f20989b = zzhj.m20023e("video/mp4v-es", -1, m20156b, m20144f5, m20144f6, arrayList2);
                    i3 = intValue;
                    i4 = m20141c;
                } else {
                    i2 = m20141c3;
                    i5 = m20141c4;
                    i3 = intValue;
                    i4 = m20141c;
                }
                z = true;
            }
            zzkmVar5.m20145g(m20139a2 + i5);
            i8++;
            m20141c3 = i2;
            m20141c = i4;
            intValue = i3;
        }
        return new zzix(intValue, m20141c, m20149k2, m20156b, c7324xz.f20989b, c7324xz.f20988a, c7324xz.f20990c);
    }

    /* renamed from: b */
    private static zziy m16000b(zzkm zzkmVar, int i2, int i3) {
        int i4 = i2 + 8;
        zziy zziyVar = null;
        while (i4 - i2 < i3) {
            zzkmVar.m20145g(i4);
            int m20141c = zzkmVar.m20141c();
            int m20141c2 = zzkmVar.m20141c();
            if (m20141c2 == C7250vz.f20774K) {
                zzkmVar.m20141c();
            } else if (m20141c2 == C7250vz.f20769F) {
                zzkmVar.m20146h(4);
                zzkmVar.m20141c();
                zzkmVar.m20141c();
            } else if (m20141c2 == C7250vz.f20770G) {
                int i5 = i4 + 8;
                while (true) {
                    if (i5 - i4 >= m20141c) {
                        zziyVar = null;
                        break;
                    }
                    zzkmVar.m20145g(i5);
                    int m20141c3 = zzkmVar.m20141c();
                    if (zzkmVar.m20141c() == C7250vz.f20771H) {
                        zzkmVar.m20146h(4);
                        int m20141c4 = zzkmVar.m20141c();
                        boolean z = (m20141c4 >> 8) == 1;
                        byte[] bArr = new byte[16];
                        zzkmVar.m20148j(bArr, 0, 16);
                        zziyVar = new zziy(z, m20141c4 & 255, bArr);
                    } else {
                        i5 += m20141c3;
                    }
                }
            }
            i4 += m20141c;
        }
        return zziyVar;
    }

    /* renamed from: c */
    private static byte[] m16001c(zzkm zzkmVar, int i2) {
        zzkmVar.m20145g(i2 + 8 + 4);
        zzkmVar.m20146h(1);
        int m20143e = zzkmVar.m20143e();
        while (m20143e > 127) {
            m20143e = zzkmVar.m20143e();
        }
        zzkmVar.m20146h(2);
        int m20143e2 = zzkmVar.m20143e();
        if ((m20143e2 & 128) != 0) {
            zzkmVar.m20146h(2);
        }
        if ((m20143e2 & 64) != 0) {
            zzkmVar.m20146h(zzkmVar.m20144f());
        }
        if ((m20143e2 & 32) != 0) {
            zzkmVar.m20146h(2);
        }
        zzkmVar.m20146h(1);
        int m20143e3 = zzkmVar.m20143e();
        while (m20143e3 > 127) {
            m20143e3 = zzkmVar.m20143e();
        }
        zzkmVar.m20146h(13);
        zzkmVar.m20146h(1);
        int m20143e4 = zzkmVar.m20143e();
        int i3 = m20143e4 & 127;
        while (m20143e4 > 127) {
            m20143e4 = zzkmVar.m20143e();
            i3 = (i3 << 8) | (m20143e4 & 127);
        }
        byte[] bArr = new byte[i3];
        zzkmVar.m20148j(bArr, 0, i3);
        return bArr;
    }
}
