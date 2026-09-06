package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.jvm.internal.C9768m;

/* compiled from: ReflectJavaClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.e */
/* loaded from: classes2.dex */
public final class C10655e {
    /* renamed from: a */
    public static final Class<?> m38024a(ClassLoader classLoader, String str) {
        C9768m.m32346f(classLoader, "<this>");
        C9768m.m32346f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
