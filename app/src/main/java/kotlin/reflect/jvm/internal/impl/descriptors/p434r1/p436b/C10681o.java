package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10762j;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10001k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0;

/* compiled from: ReflectJavaConstructor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.o */
/* loaded from: classes2.dex */
public final class C10681o extends AbstractC10686t implements InterfaceC10001k {

    /* renamed from: a */
    private final Constructor<?> f41205a;

    public C10681o(Constructor<?> constructor) {
        C9768m.m32346f(constructor, "member");
        this.f41205a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10686t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Constructor<?> mo38106U() {
        return this.f41205a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10001k
    /* renamed from: f */
    public List<InterfaceC9989b0> mo33610f() {
        Type[] genericParameterTypes = mo38106U().getGenericParameterTypes();
        C9768m.m32345e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C10784u.m38888j();
        }
        Class<?> declaringClass = mo38106U().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C10762j.m38681i(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo38106U().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + mo38106U());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            C9768m.m32345e(parameterAnnotations, "annotations");
            parameterAnnotations = (Annotation[][]) C10762j.m38681i(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        C9768m.m32345e(genericParameterTypes, "realTypes");
        C9768m.m32345e(parameterAnnotations, "realAnnotations");
        return m38113V(genericParameterTypes, parameterAnnotations, mo38106U().isVarArgs());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10016z
    public List<C10665a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = mo38106U().getTypeParameters();
        C9768m.m32345e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C10665a0(typeVariable));
        }
        return arrayList;
    }
}
