package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9768m;

/* compiled from: ReflectJavaMember.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.c */
/* loaded from: classes2.dex */
final class C10668c {

    /* renamed from: a */
    public static final C10668c f41171a = new C10668c();

    /* renamed from: b */
    private static a f41172b;

    /* compiled from: ReflectJavaMember.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.c$a */
    public static final class a {

        /* renamed from: a */
        private final Method f41173a;

        /* renamed from: b */
        private final Method f41174b;

        public a(Method method, Method method2) {
            this.f41173a = method;
            this.f41174b = method2;
        }

        /* renamed from: a */
        public final Method m38064a() {
            return this.f41174b;
        }

        /* renamed from: b */
        public final Method m38065b() {
            return this.f41173a;
        }
    }

    private C10668c() {
    }

    /* renamed from: a */
    public final a m38062a(Member member) {
        C9768m.m32346f(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), C10670d.m38073e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    /* renamed from: b */
    public final List<String> m38063b(Member member) {
        Method m38064a;
        C9768m.m32346f(member, "member");
        a aVar = f41172b;
        if (aVar == null) {
            synchronized (this) {
                C10668c c10668c = f41171a;
                a aVar2 = f41172b;
                if (aVar2 == null) {
                    aVar = c10668c.m38062a(member);
                    f41172b = aVar;
                } else {
                    aVar = aVar2;
                }
            }
        }
        Method m38065b = aVar.m38065b();
        if (m38065b == null || (m38064a = aVar.m38064a()) == null) {
            return null;
        }
        Object invoke = m38065b.invoke(member, new Object[0]);
        C9768m.m32344d(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = m38064a.invoke(obj, new Object[0]);
            C9768m.m32344d(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}
