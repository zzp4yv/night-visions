package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qy */
/* loaded from: classes2.dex */
final class C7064qy {

    /* renamed from: a */
    static zzdbq f20415a;

    /* renamed from: a */
    static boolean m15813a(zzdy zzdyVar) throws IllegalAccessException, InvocationTargetException {
        Method m19906p;
        zzdbq zzdbqVar;
        if (f20415a != null) {
            return true;
        }
        String str = (String) zzyt.m20848e().m16421c(zzacu.f21865s2);
        if (str == null || str.length() == 0) {
            str = (zzdyVar == null || (m19906p = zzdyVar.m19906p("zu6uZ8u7nNJHsIXbotuBCEBd9hieUh9UBKC94dMPsF422AtJb3FisPSqZI3W+06A", "tm6XtP5M5qvCs+TffoCZhF/AF3Fx7Ow8iqgApPbgXSw=")) == null) ? null : (String) m19906p.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            zzdbu m19195b = zzdbz.m19195b(zzcg.m18757b(str, true));
            zzdbl.m19177b(zzddc.f25506a);
            zzdcf.m19217l(new zzddg());
            zzdbqVar = (zzdbq) zzdcf.m19211f(zzdcf.m19208c(m19195b, null, zzdbq.class));
            f20415a = zzdbqVar;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zzdbqVar != null;
    }
}
