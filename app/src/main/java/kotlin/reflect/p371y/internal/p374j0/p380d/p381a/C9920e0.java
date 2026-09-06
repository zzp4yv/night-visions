package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10452a;
import kotlin.text.C10513u;
import kotlin.text.C10514v;

/* compiled from: propertiesConventionUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.e0 */
/* loaded from: classes2.dex */
public final class C9920e0 {
    /* renamed from: a */
    public static final List<C10130f> m33079a(C10130f c10130f) {
        List<C10130f> m38892n;
        C9768m.m32346f(c10130f, "name");
        String m35455k = c10130f.m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        if (!C10047z.m33830c(m35455k)) {
            return C10047z.m33831d(m35455k) ? m33084f(c10130f) : C9923g.f37857a.m33097b(c10130f);
        }
        m38892n = C10784u.m38892n(m33080b(c10130f));
        return m38892n;
    }

    /* renamed from: b */
    public static final C10130f m33080b(C10130f c10130f) {
        C9768m.m32346f(c10130f, "methodName");
        C10130f m33083e = m33083e(c10130f, "get", false, null, 12, null);
        return m33083e == null ? m33083e(c10130f, "is", false, null, 8, null) : m33083e;
    }

    /* renamed from: c */
    public static final C10130f m33081c(C10130f c10130f, boolean z) {
        C9768m.m32346f(c10130f, "methodName");
        return m33083e(c10130f, "set", false, z ? "is" : null, 4, null);
    }

    /* renamed from: d */
    private static final C10130f m33082d(C10130f c10130f, String str, boolean z, String str2) {
        String m37573m0;
        String m37573m02;
        if (c10130f.m35458y()) {
            return null;
        }
        String m35457u = c10130f.m35457u();
        C9768m.m32345e(m35457u, "methodName.identifier");
        boolean z2 = false;
        if (!C10513u.m37511E(m35457u, str, false, 2, null) || m35457u.length() == str.length()) {
            return null;
        }
        char charAt = m35457u.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            m37573m02 = C10514v.m37573m0(m35457u, str);
            sb.append(m37573m02);
            return C10130f.m35454x(sb.toString());
        }
        if (!z) {
            return c10130f;
        }
        m37573m0 = C10514v.m37573m0(m35457u, str);
        String m37226c = C10452a.m37226c(m37573m0, true);
        if (C10130f.m35450A(m37226c)) {
            return C10130f.m35454x(m37226c);
        }
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ C10130f m33083e(C10130f c10130f, String str, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return m33082d(c10130f, str, z, str2);
    }

    /* renamed from: f */
    public static final List<C10130f> m33084f(C10130f c10130f) {
        List<C10130f> m38893o;
        C9768m.m32346f(c10130f, "methodName");
        m38893o = C10784u.m38893o(m33081c(c10130f, false), m33081c(c10130f, true));
        return m38893o;
    }
}
