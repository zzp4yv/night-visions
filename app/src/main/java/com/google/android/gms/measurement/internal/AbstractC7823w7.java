package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes2.dex */
abstract class AbstractC7823w7 {

    /* renamed from: a */
    String f28979a;

    /* renamed from: b */
    int f28980b;

    /* renamed from: c */
    Boolean f28981c;

    /* renamed from: d */
    Boolean f28982d;

    /* renamed from: e */
    Long f28983e;

    /* renamed from: f */
    Long f28984f;

    AbstractC7823w7(String str, int i2) {
        this.f28979a = str;
        this.f28980b = i2;
    }

    /* renamed from: b */
    static Boolean m22864b(double d2, zzbj.zzd zzdVar) {
        try {
            return m22870h(new BigDecimal(d2), zzdVar, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Boolean m22865c(long j2, zzbj.zzd zzdVar) {
        try {
            return m22870h(new BigDecimal(j2), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static Boolean m22866d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: e */
    static Boolean m22867e(String str, zzbj.zzd zzdVar) {
        if (!zzkg.m23476S(str)) {
            return null;
        }
        try {
            return m22870h(new BigDecimal(str), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Boolean m22868f(String str, zzbj.zzf.zzb zzbVar, boolean z, String str2, List<String> list, String str3, zzet zzetVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzbj.zzf.zzb.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzbVar != zzbj.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C7787s7.f28902a[zzbVar.ordinal()]) {
            case 1:
                try {
                    break;
                } catch (PatternSyntaxException unused) {
                    if (zzetVar != null) {
                        zzetVar.m23140K().m23148b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: g */
    static Boolean m22869g(String str, zzbj.zzf zzfVar, zzet zzetVar) {
        List<String> list;
        Preconditions.m14372k(zzfVar);
        if (str == null || !zzfVar.m21582B() || zzfVar.m21583C() == zzbj.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzbj.zzf.zzb m21583C = zzfVar.m21583C();
        zzbj.zzf.zzb zzbVar = zzbj.zzf.zzb.IN_LIST;
        if (m21583C == zzbVar) {
            if (zzfVar.m21589I() == 0) {
                return null;
            }
        } else if (!zzfVar.m21584D()) {
            return null;
        }
        zzbj.zzf.zzb m21583C2 = zzfVar.m21583C();
        boolean m21587G = zzfVar.m21587G();
        String m21585E = (m21587G || m21583C2 == zzbj.zzf.zzb.REGEXP || m21583C2 == zzbVar) ? zzfVar.m21585E() : zzfVar.m21585E().toUpperCase(Locale.ENGLISH);
        if (zzfVar.m21589I() == 0) {
            list = null;
        } else {
            List<String> m21588H = zzfVar.m21588H();
            if (!m21587G) {
                ArrayList arrayList = new ArrayList(m21588H.size());
                Iterator<String> it = m21588H.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                m21588H = Collections.unmodifiableList(arrayList);
            }
            list = m21588H;
        }
        return m22868f(str, m21583C2, m21587G, m21585E, list, m21583C2 == zzbj.zzf.zzb.REGEXP ? m21585E : null, zzetVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0081, code lost:
    
        if (r3 != null) goto L37;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean m22870h(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.zzbj.zzd r10, double r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AbstractC7823w7.m22870h(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzbj$zzd, double):java.lang.Boolean");
    }

    /* renamed from: a */
    abstract int mo22852a();
}
