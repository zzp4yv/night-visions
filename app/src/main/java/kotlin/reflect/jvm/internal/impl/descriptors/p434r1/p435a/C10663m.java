package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.m */
/* loaded from: classes2.dex */
final class C10663m {

    /* renamed from: a */
    public static final C10663m f41155a = new C10663m();

    private C10663m() {
    }

    /* renamed from: a */
    public final String m38036a(Constructor<?> constructor) {
        C9768m.m32346f(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        C9768m.m32345e(parameterTypes, "constructor.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            C9768m.m32345e(cls, "parameterType");
            sb.append(C10670d.m38070b(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: b */
    public final String m38037b(Field field) {
        C9768m.m32346f(field, "field");
        Class<?> type = field.getType();
        C9768m.m32345e(type, "field.type");
        return C10670d.m38070b(type);
    }

    /* renamed from: c */
    public final String m38038c(Method method) {
        C9768m.m32346f(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9768m.m32345e(parameterTypes, "method.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            C9768m.m32345e(cls, "parameterType");
            sb.append(C10670d.m38070b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        C9768m.m32345e(returnType, "method.returnType");
        sb.append(C10670d.m38070b(returnType));
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "sb.toString()");
        return sb2;
    }
}
