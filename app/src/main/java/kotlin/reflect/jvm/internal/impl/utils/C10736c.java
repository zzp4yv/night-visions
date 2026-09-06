package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C9768m;

/* compiled from: exceptionUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.c */
/* loaded from: classes3.dex */
public final class C10736c {
    /* renamed from: a */
    public static final boolean m38523a(Throwable th) {
        C9768m.m32346f(th, "<this>");
        Class<?> cls = th.getClass();
        while (!C9768m.m32341a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m38524b(Throwable th) {
        C9768m.m32346f(th, "e");
        throw th;
    }
}
