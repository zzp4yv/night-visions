package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10003m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.q */
/* loaded from: classes2.dex */
public final class C10683q extends AbstractC10672f implements InterfaceC10003m {

    /* renamed from: c */
    private final Enum<?> f41206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10683q(C10130f c10130f, Enum<?> r3) {
        super(c10130f, null);
        C9768m.m32346f(r3, "value");
        this.f41206c = r3;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10003m
    /* renamed from: b */
    public C10126b mo33611b() {
        Class<?> cls = this.f41206c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C9768m.m32345e(cls, "enumClass");
        return C10670d.m38069a(cls);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10003m
    /* renamed from: d */
    public C10130f mo33612d() {
        return C10130f.m35454x(this.f41206c.name());
    }
}
