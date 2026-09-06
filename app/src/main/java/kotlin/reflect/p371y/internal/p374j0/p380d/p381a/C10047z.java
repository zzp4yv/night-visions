package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10452a;
import kotlin.text.C10513u;

/* compiled from: JvmAbi.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.z */
/* loaded from: classes2.dex */
public final class C10047z {

    /* renamed from: a */
    public static final C10047z f38329a = new C10047z();

    /* renamed from: b */
    public static final C10127c f38330b;

    /* renamed from: c */
    public static final C10126b f38331c;

    /* renamed from: d */
    private static final C10126b f38332d;

    /* renamed from: e */
    private static final C10126b f38333e;

    static {
        C10127c c10127c = new C10127c("kotlin.jvm.JvmField");
        f38330b = c10127c;
        C10126b m35408m = C10126b.m35408m(c10127c);
        C9768m.m32345e(m35408m, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f38331c = m35408m;
        C10126b m35408m2 = C10126b.m35408m(new C10127c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        C9768m.m32345e(m35408m2, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f38332d = m35408m2;
        C10126b m35406e = C10126b.m35406e("kotlin/jvm/internal/RepeatableContainer");
        C9768m.m32345e(m35406e, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f38333e = m35406e;
    }

    private C10047z() {
    }

    /* renamed from: b */
    public static final String m33829b(String str) {
        C9768m.m32346f(str, "propertyName");
        if (m33833f(str)) {
            return str;
        }
        return "get" + C10452a.m37224a(str);
    }

    /* renamed from: c */
    public static final boolean m33830c(String str) {
        C9768m.m32346f(str, "name");
        return C10513u.m37511E(str, "get", false, 2, null) || C10513u.m37511E(str, "is", false, 2, null);
    }

    /* renamed from: d */
    public static final boolean m33831d(String str) {
        C9768m.m32346f(str, "name");
        return C10513u.m37511E(str, "set", false, 2, null);
    }

    /* renamed from: e */
    public static final String m33832e(String str) {
        String m37224a;
        C9768m.m32346f(str, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (m33833f(str)) {
            m37224a = str.substring(2);
            C9768m.m32345e(m37224a, "this as java.lang.String).substring(startIndex)");
        } else {
            m37224a = C10452a.m37224a(str);
        }
        sb.append(m37224a);
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m33833f(String str) {
        C9768m.m32346f(str, "name");
        if (!C10513u.m37511E(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return C9768m.m32348h(97, charAt) > 0 || C9768m.m32348h(charAt, 122) > 0;
    }

    /* renamed from: a */
    public final C10126b m33834a() {
        return f38333e;
    }
}
