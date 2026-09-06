package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: RenderingUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.h.n */
/* loaded from: classes3.dex */
public final class C10150n {
    /* renamed from: a */
    public static final String m35763a(C10128d c10128d) {
        C9768m.m32346f(c10128d, "<this>");
        List<C10130f> m35437h = c10128d.m35437h();
        C9768m.m32345e(m35437h, "pathSegments()");
        return m35765c(m35437h);
    }

    /* renamed from: b */
    public static final String m35764b(C10130f c10130f) {
        C9768m.m32346f(c10130f, "<this>");
        if (!m35766d(c10130f)) {
            String m35455k = c10130f.m35455k();
            C9768m.m32345e(m35455k, "asString()");
            return m35455k;
        }
        StringBuilder sb = new StringBuilder();
        String m35455k2 = c10130f.m35455k();
        C9768m.m32345e(m35455k2, "asString()");
        sb.append('`' + m35455k2);
        sb.append('`');
        return sb.toString();
    }

    /* renamed from: c */
    public static final String m35765c(List<C10130f> list) {
        C9768m.m32346f(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C10130f c10130f : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m35764b(c10130f));
        }
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    private static final boolean m35766d(C10130f c10130f) {
        boolean z;
        String m35455k = c10130f.m35455k();
        C9768m.m32345e(m35455k, "asString()");
        if (!C10145i.f39481a.contains(m35455k)) {
            int i2 = 0;
            while (true) {
                if (i2 >= m35455k.length()) {
                    z = false;
                    break;
                }
                char charAt = m35455k.charAt(i2);
                if ((Character.isLetterOrDigit(charAt) || charAt == '_') ? false : true) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
