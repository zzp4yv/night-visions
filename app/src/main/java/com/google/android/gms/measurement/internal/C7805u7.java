package com.google.android.gms.measurement.internal;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes2.dex */
final class C7805u7 {

    /* renamed from: a */
    private String f28940a;

    /* renamed from: b */
    private Set<Integer> f28941b = new HashSet();

    /* renamed from: c */
    private Map<Integer, C7778r7> f28942c = new C0867a();

    /* renamed from: d */
    private final /* synthetic */ C7769q7 f28943d;

    C7805u7(C7769q7 c7769q7, String str) {
        this.f28943d = c7769q7;
        this.f28940a = str;
    }

    /* renamed from: a */
    private final C7778r7 m22860a(int i2) {
        if (this.f28942c.containsKey(Integer.valueOf(i2))) {
            return this.f28942c.get(Integer.valueOf(i2));
        }
        C7778r7 c7778r7 = new C7778r7(this.f28943d, this.f28940a, null);
        this.f28942c.put(Integer.valueOf(i2), c7778r7);
        return c7778r7;
    }

    /* renamed from: c */
    private final boolean m22861c(int i2, int i3) {
        BitSet bitSet;
        if (this.f28942c.get(Integer.valueOf(i2)) == null) {
            return false;
        }
        bitSet = this.f28942c.get(Integer.valueOf(i2)).f28887c;
        return bitSet.get(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x076e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025a A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<com.google.android.gms.internal.measurement.zzbr.zza> m22862b(java.util.List<com.google.android.gms.internal.measurement.zzbr.zzc> r62, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzk> r63, java.lang.Long r64) {
        /*
            Method dump skipped, instructions count: 2121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7805u7.m22862b(java.util.List, java.util.List, java.lang.Long):java.util.List");
    }
}
