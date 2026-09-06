package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10005o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.s */
/* loaded from: classes2.dex */
public final class C10685s extends AbstractC10672f implements InterfaceC10005o {

    /* renamed from: c */
    private final Object f41208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10685s(C10130f c10130f, Object obj) {
        super(c10130f, null);
        C9768m.m32346f(obj, "value");
        this.f41208c = obj;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10005o
    public Object getValue() {
        return this.f41208c;
    }
}
