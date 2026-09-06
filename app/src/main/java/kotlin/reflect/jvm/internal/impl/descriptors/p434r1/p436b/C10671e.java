package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.C9719a;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10672f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.e */
/* loaded from: classes2.dex */
public final class C10671e extends AbstractC10682p implements InterfaceC9986a {

    /* renamed from: a */
    private final Annotation f41184a;

    public C10671e(Annotation annotation) {
        C9768m.m32346f(annotation, "annotation");
        this.f41184a = annotation;
    }

    /* renamed from: R */
    public final Annotation m38078R() {
        return this.f41184a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C10678l mo33574z() {
        return new C10678l(C9719a.m32276b(C9719a.m32275a(this.f41184a)));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a
    /* renamed from: b */
    public Collection<InterfaceC9988b> mo33570b() {
        Method[] declaredMethods = C9719a.m32276b(C9719a.m32275a(this.f41184a)).getDeclaredMethods();
        C9768m.m32345e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC10672f.a aVar = AbstractC10672f.f41185a;
            Object invoke = method.invoke(this.f41184a, new Object[0]);
            C9768m.m32345e(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.m38080a(invoke, C10130f.m35454x(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a
    /* renamed from: e */
    public C10126b mo33571e() {
        return C10670d.m38069a(C9719a.m32276b(C9719a.m32275a(this.f41184a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10671e) && this.f41184a == ((C10671e) obj).f41184a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a
    /* renamed from: g */
    public boolean mo33572g() {
        return InterfaceC9986a.a.m33576b(this);
    }

    public int hashCode() {
        return System.identityHashCode(this.f41184a);
    }

    public String toString() {
        return C10671e.class.getName() + ": " + this.f41184a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a
    /* renamed from: v */
    public boolean mo33573v() {
        return InterfaceC9986a.a.m33575a(this);
    }
}
