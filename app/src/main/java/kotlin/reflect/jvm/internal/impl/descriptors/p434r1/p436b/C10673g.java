package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9990c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.g */
/* loaded from: classes2.dex */
public final class C10673g extends AbstractC10672f implements InterfaceC9990c {

    /* renamed from: c */
    private final Annotation f41187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10673g(C10130f c10130f, Annotation annotation) {
        super(c10130f, null);
        C9768m.m32346f(annotation, "annotation");
        this.f41187c = annotation;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9990c
    /* renamed from: a */
    public InterfaceC9986a mo33579a() {
        return new C10671e(this.f41187c);
    }
}
