package com.facebook.p157o0.p163o0;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C9768m;

/* compiled from: InAppPurchaseUtils.kt */
/* renamed from: com.facebook.o0.o0.m */
/* loaded from: classes2.dex */
public final class C5857m {

    /* renamed from: a */
    public static final C5857m f15334a = new C5857m();

    private C5857m() {
    }

    /* renamed from: a */
    public static final Class<?> m12574a(String str) {
        C9768m.m32346f(str, "className");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final Class<?> m12575b(Context context, String str) {
        C9768m.m32346f(context, "context");
        C9768m.m32346f(str, "className");
        try {
            return context.getClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final Method m12576c(Class<?> cls, String str, Class<?>... clsArr) {
        C9768m.m32346f(cls, "clazz");
        C9768m.m32346f(str, "methodName");
        C9768m.m32346f(clsArr, "args");
        try {
            return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static final Method m12577d(Class<?> cls, String str, Class<?>... clsArr) {
        C9768m.m32346f(cls, "clazz");
        C9768m.m32346f(str, "methodName");
        C9768m.m32346f(clsArr, "args");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static final Object m12578e(Class<?> cls, Method method, Object obj, Object... objArr) {
        C9768m.m32346f(cls, "clazz");
        C9768m.m32346f(method, "method");
        C9768m.m32346f(objArr, "args");
        if (obj != null) {
            obj = cls.cast(obj);
        }
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
