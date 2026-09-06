package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0;

/* compiled from: ReflectJavaMethod.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.u */
/* loaded from: classes2.dex */
public final class C10687u extends AbstractC10686t implements InterfaceC10008r {

    /* renamed from: a */
    private final Method f41209a;

    public C10687u(Method method) {
        C9768m.m32346f(method, "member");
        this.f41209a = method;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r
    /* renamed from: L */
    public boolean mo33619L() {
        return InterfaceC10008r.a.m33622a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10686t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Method mo38106U() {
        return this.f41209a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public AbstractC10692z getReturnType() {
        AbstractC10692z.a aVar = AbstractC10692z.f41215a;
        Type genericReturnType = mo38106U().getGenericReturnType();
        C9768m.m32345e(genericReturnType, "member.genericReturnType");
        return aVar.m38122a(genericReturnType);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r
    /* renamed from: f */
    public List<InterfaceC9989b0> mo33620f() {
        Type[] genericParameterTypes = mo38106U().getGenericParameterTypes();
        C9768m.m32345e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo38106U().getParameterAnnotations();
        C9768m.m32345e(parameterAnnotations, "member.parameterAnnotations");
        return m38113V(genericParameterTypes, parameterAnnotations, mo38106U().isVarArgs());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10016z
    public List<C10665a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo38106U().getTypeParameters();
        C9768m.m32345e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C10665a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r
    /* renamed from: s */
    public InterfaceC9988b mo33621s() {
        Object defaultValue = mo38106U().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC10672f.f41185a.m38080a(defaultValue, null);
        }
        return null;
    }
}
