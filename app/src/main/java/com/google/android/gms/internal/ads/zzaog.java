package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C6192a;
import java.util.Date;
import java.util.HashSet;
import p241e.p254e.p255a.EnumC8748a;
import p241e.p254e.p255a.EnumC8749b;

@zzard
/* loaded from: classes2.dex */
public final class zzaog {
    /* renamed from: a */
    public static int m16808a(EnumC8748a enumC8748a) {
        int i2 = C7291x2.f20899b[enumC8748a.ordinal()];
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public static C6192a m16809b(zzxz zzxzVar, boolean z) {
        HashSet hashSet = zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null;
        Date date = new Date(zzxzVar.f27403g);
        int i2 = zzxzVar.f27405i;
        return new C6192a(date, i2 != 1 ? i2 != 2 ? EnumC8749b.UNKNOWN : EnumC8749b.FEMALE : EnumC8749b.MALE, hashSet, z, zzxzVar.f27412p);
    }
}
