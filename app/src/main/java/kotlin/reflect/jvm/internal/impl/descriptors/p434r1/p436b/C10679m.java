package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9998h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.m */
/* loaded from: classes2.dex */
public final class C10679m extends AbstractC10672f implements InterfaceC9998h {

    /* renamed from: c */
    private final Class<?> f41202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10679m(C10130f c10130f, Class<?> cls) {
        super(c10130f, null);
        C9768m.m32346f(cls, "klass");
        this.f41202c = cls;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9998h
    /* renamed from: c */
    public InterfaceC10014x mo33604c() {
        return AbstractC10692z.f41215a.m38122a(this.f41202c);
    }
}
