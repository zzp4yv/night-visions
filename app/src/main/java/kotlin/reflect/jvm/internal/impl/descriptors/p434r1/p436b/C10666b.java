package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C9768m;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b */
/* loaded from: classes2.dex */
final class C10666b {

    /* renamed from: a */
    public static final C10666b f41161a = new C10666b();

    /* renamed from: b */
    private static a f41162b;

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b$a */
    public static final class a {

        /* renamed from: a */
        private final Method f41163a;

        /* renamed from: b */
        private final Method f41164b;

        /* renamed from: c */
        private final Method f41165c;

        /* renamed from: d */
        private final Method f41166d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f41163a = method;
            this.f41164b = method2;
            this.f41165c = method3;
            this.f41166d = method4;
        }

        /* renamed from: a */
        public final Method m38055a() {
            return this.f41164b;
        }

        /* renamed from: b */
        public final Method m38056b() {
            return this.f41166d;
        }

        /* renamed from: c */
        public final Method m38057c() {
            return this.f41165c;
        }

        /* renamed from: d */
        public final Method m38058d() {
            return this.f41163a;
        }
    }

    private C10666b() {
    }

    /* renamed from: a */
    private final a m38049a() {
        try {
            return new a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    /* renamed from: b */
    private final a m38050b() {
        a aVar = f41162b;
        if (aVar != null) {
            return aVar;
        }
        a m38049a = m38049a();
        f41162b = m38049a;
        return m38049a;
    }

    /* renamed from: c */
    public final Class<?>[] m38051c(Class<?> cls) {
        C9768m.m32346f(cls, "clazz");
        Method m38055a = m38050b().m38055a();
        if (m38055a == null) {
            return null;
        }
        Object invoke = m38055a.invoke(cls, new Object[0]);
        C9768m.m32344d(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] m38052d(Class<?> cls) {
        C9768m.m32346f(cls, "clazz");
        Method m38056b = m38050b().m38056b();
        if (m38056b == null) {
            return null;
        }
        return (Object[]) m38056b.invoke(cls, new Object[0]);
    }

    /* renamed from: e */
    public final Boolean m38053e(Class<?> cls) {
        C9768m.m32346f(cls, "clazz");
        Method m38057c = m38050b().m38057c();
        if (m38057c == null) {
            return null;
        }
        Object invoke = m38057c.invoke(cls, new Object[0]);
        C9768m.m32344d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean m38054f(Class<?> cls) {
        C9768m.m32346f(cls, "clazz");
        Method m38058d = m38050b().m38058d();
        if (m38058d == null) {
            return null;
        }
        Object invoke = m38058d.invoke(cls, new Object[0]);
        C9768m.m32344d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
