package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.C10762j;
import kotlin.jvm.C9719a;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9882i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10177f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.c */
/* loaded from: classes2.dex */
final class C10653c {

    /* renamed from: a */
    public static final C10653c f41141a = new C10653c();

    private C10653c() {
    }

    /* renamed from: a */
    private final C10177f m38015a(Class<?> cls) {
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            C9768m.m32345e(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C10126b m38069a = C10670d.m38069a(cls);
            C9896c c9896c = C9896c.f37667a;
            C10127c m35409b = m38069a.m35409b();
            C9768m.m32345e(m35409b, "javaClassId.asSingleFqName()");
            C10126b m32928m = c9896c.m32928m(m35409b);
            if (m32928m != null) {
                m38069a = m32928m;
            }
            return new C10177f(m38069a, i2);
        }
        if (C9768m.m32341a(cls, Void.TYPE)) {
            C10126b m35408m = C10126b.m35408m(C9884k.a.f37570f.m35441l());
            C9768m.m32345e(m35408m, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new C10177f(m35408m, i2);
        }
        EnumC9882i m36118x = EnumC10207e.m36114k(cls.getName()).m36118x();
        C9768m.m32345e(m36118x, "get(currentClass.name).primitiveType");
        if (i2 > 0) {
            C10126b m35408m2 = C10126b.m35408m(m36118x.m32813k());
            C9768m.m32345e(m35408m2, "topLevel(primitiveType.arrayTypeFqName)");
            return new C10177f(m35408m2, i2 - 1);
        }
        C10126b m35408m3 = C10126b.m35408m(m36118x.m32815u());
        C9768m.m32345e(m35408m3, "topLevel(primitiveType.typeFqName)");
        return new C10177f(m35408m3, i2);
    }

    /* renamed from: c */
    private final void m38016c(Class<?> cls, InterfaceC10068q.d dVar) {
        Constructor<?>[] constructorArr;
        int i2;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        C9768m.m32345e(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i3 = 0;
        while (i3 < length) {
            Constructor<?> constructor = declaredConstructors[i3];
            C10130f c10130f = C10132h.f39273i;
            C10663m c10663m = C10663m.f41155a;
            C9768m.m32345e(constructor, "constructor");
            InterfaceC10068q.e mo33850b = dVar.mo33850b(c10130f, c10663m.m38036a(constructor));
            if (mo33850b == null) {
                constructorArr = declaredConstructors;
                i2 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                C9768m.m32345e(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9768m.m32345e(annotation, "annotation");
                    m38019f(mo33850b, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C9768m.m32345e(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i4 = 0; i4 < length3; i4++) {
                        Annotation[] annotationArr = parameterAnnotations[i4];
                        C9768m.m32345e(annotationArr, "annotations");
                        int length4 = annotationArr.length;
                        int i5 = 0;
                        while (i5 < length4) {
                            Annotation annotation2 = annotationArr[i5];
                            Class<?> m32276b = C9719a.m32276b(C9719a.m32275a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i6 = length;
                            C10126b m38069a = C10670d.m38069a(m32276b);
                            int i7 = length2;
                            C9768m.m32345e(annotation2, "annotation");
                            InterfaceC10068q.a mo33851c = mo33850b.mo33851c(i4 + length2, m38069a, new C10652b(annotation2));
                            if (mo33851c != null) {
                                f41141a.m38021h(mo33851c, annotation2, m32276b);
                            }
                            i5++;
                            declaredConstructors = constructorArr2;
                            length = i6;
                            length2 = i7;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i2 = length;
                mo33850b.mo32695a();
            }
            i3++;
            declaredConstructors = constructorArr;
            length = i2;
        }
    }

    /* renamed from: d */
    private final void m38017d(Class<?> cls, InterfaceC10068q.d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        C9768m.m32345e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C10130f m35454x = C10130f.m35454x(field.getName());
            C9768m.m32345e(m35454x, "identifier(field.name)");
            C10663m c10663m = C10663m.f41155a;
            C9768m.m32345e(field, "field");
            InterfaceC10068q.c mo33849a = dVar.mo33849a(m35454x, c10663m.m38037b(field), null);
            if (mo33849a != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                C9768m.m32345e(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9768m.m32345e(annotation, "annotation");
                    m38019f(mo33849a, annotation);
                }
                mo33849a.mo32695a();
            }
        }
    }

    /* renamed from: e */
    private final void m38018e(Class<?> cls, InterfaceC10068q.d dVar) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9768m.m32345e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = declaredMethods[i2];
            C10130f m35454x = C10130f.m35454x(method.getName());
            C9768m.m32345e(m35454x, "identifier(method.name)");
            C10663m c10663m = C10663m.f41155a;
            C9768m.m32345e(method, "method");
            InterfaceC10068q.e mo33850b = dVar.mo33850b(m35454x, c10663m.m38038c(method));
            if (mo33850b == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                C9768m.m32345e(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9768m.m32345e(annotation, "annotation");
                    m38019f(mo33850b, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C9768m.m32345e(parameterAnnotations, "method.parameterAnnotations");
                int length2 = parameterAnnotations.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    Annotation[] annotationArr = parameterAnnotations[i3];
                    C9768m.m32345e(annotationArr, "annotations");
                    int length3 = annotationArr.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        Annotation annotation2 = annotationArr[i4];
                        Class<?> m32276b = C9719a.m32276b(C9719a.m32275a(annotation2));
                        C10126b m38069a = C10670d.m38069a(m32276b);
                        Method[] methodArr2 = declaredMethods;
                        C9768m.m32345e(annotation2, "annotation");
                        InterfaceC10068q.a mo33851c = mo33850b.mo33851c(i3, m38069a, new C10652b(annotation2));
                        if (mo33851c != null) {
                            f41141a.m38021h(mo33851c, annotation2, m32276b);
                        }
                        i4++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                mo33850b.mo32695a();
            }
            i2++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: f */
    private final void m38019f(InterfaceC10068q.c cVar, Annotation annotation) {
        Class<?> m32276b = C9719a.m32276b(C9719a.m32275a(annotation));
        InterfaceC10068q.a mo32696b = cVar.mo32696b(C10670d.m38069a(m32276b), new C10652b(annotation));
        if (mo32696b != null) {
            f41141a.m38021h(mo32696b, annotation, m32276b);
        }
    }

    /* renamed from: g */
    private final void m38020g(InterfaceC10068q.a aVar, C10130f c10130f, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (C9768m.m32341a(cls, Class.class)) {
            C9768m.m32344d(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.mo33896b(c10130f, m38015a((Class) obj));
            return;
        }
        set = C10659i.f41148a;
        if (set.contains(cls)) {
            aVar.mo33897c(c10130f, obj);
            return;
        }
        if (C10670d.m38075g(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C9768m.m32345e(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            C10126b m38069a = C10670d.m38069a(cls);
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C10130f m35454x = C10130f.m35454x(((Enum) obj).name());
            C9768m.m32345e(m35454x, "identifier((value as Enum<*>).name)");
            aVar.mo33898d(c10130f, m38069a, m35454x);
            return;
        }
        if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            C9768m.m32345e(interfaces, "clazz.interfaces");
            Class<?> cls2 = (Class) C10762j.m38661N(interfaces);
            C9768m.m32345e(cls2, "annotationClass");
            InterfaceC10068q.a mo33899e = aVar.mo33899e(c10130f, C10670d.m38069a(cls2));
            if (mo33899e == null) {
                return;
            }
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Annotation");
            m38021h(mo33899e, (Annotation) obj, cls2);
            return;
        }
        if (!cls.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
        InterfaceC10068q.b mo33900f = aVar.mo33900f(c10130f);
        if (mo33900f == null) {
            return;
        }
        Class<?> componentType = cls.getComponentType();
        int i2 = 0;
        if (componentType.isEnum()) {
            C9768m.m32345e(componentType, "componentType");
            C10126b m38069a2 = C10670d.m38069a(componentType);
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i2 < length) {
                Object obj2 = objArr[i2];
                C9768m.m32344d(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                C10130f m35454x2 = C10130f.m35454x(((Enum) obj2).name());
                C9768m.m32345e(m35454x2, "identifier((element as Enum<*>).name)");
                mo33900f.mo33907c(m38069a2, m35454x2);
                i2++;
            }
        } else if (C9768m.m32341a(componentType, Class.class)) {
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i2 < length2) {
                Object obj3 = objArr2[i2];
                C9768m.m32344d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                mo33900f.mo33909e(m38015a((Class) obj3));
                i2++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i2 < length3) {
                Object obj4 = objArr3[i2];
                C9768m.m32345e(componentType, "componentType");
                InterfaceC10068q.a mo33908d = mo33900f.mo33908d(C10670d.m38069a(componentType));
                if (mo33908d != null) {
                    C9768m.m32344d(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    m38021h(mo33908d, (Annotation) obj4, componentType);
                }
                i2++;
            }
        } else {
            C9768m.m32344d(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i2 < length4) {
                mo33900f.mo33906b(objArr4[i2]);
                i2++;
            }
        }
        mo33900f.mo33905a();
    }

    /* renamed from: h */
    private final void m38021h(InterfaceC10068q.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9768m.m32345e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C9768m.m32343c(invoke);
                C10130f m35454x = C10130f.m35454x(method.getName());
                C9768m.m32345e(m35454x, "identifier(method.name)");
                m38020g(aVar, m35454x, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo33903a();
    }

    /* renamed from: b */
    public final void m38022b(Class<?> cls, InterfaceC10068q.c cVar) {
        C9768m.m32346f(cls, "klass");
        C9768m.m32346f(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C9768m.m32345e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            C9768m.m32345e(annotation, "annotation");
            m38019f(cVar, annotation);
        }
        cVar.mo32695a();
    }

    /* renamed from: i */
    public final void m38023i(Class<?> cls, InterfaceC10068q.d dVar) {
        C9768m.m32346f(cls, "klass");
        C9768m.m32346f(dVar, "memberVisitor");
        m38018e(cls, dVar);
        m38016c(cls, dVar);
        m38017d(cls, dVar);
    }
}
