package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;

/* compiled from: AnnotationsTypeAttribute.kt */
/* renamed from: kotlin.f0.y.e.j0.l.k */
/* loaded from: classes3.dex */
public final class C10328k {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f40134a = {C9757g0.m32304h(new C9786y(C9757g0.m32300d(C10328k.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b */
    private static final ReadOnlyProperty f40135b;

    static {
        ReadOnlyProperty m37220c = C10300a1.f40041g.m37220c(C9757g0.m32298b(C10325j.class));
        C9768m.m32344d(m37220c, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f40135b = m37220c;
    }

    /* renamed from: a */
    public static final InterfaceC10587g m36731a(C10300a1 c10300a1) {
        InterfaceC10587g m36724e;
        C9768m.m32346f(c10300a1, "<this>");
        C10325j m36732b = m36732b(c10300a1);
        return (m36732b == null || (m36724e = m36732b.m36724e()) == null) ? InterfaceC10587g.f40808c.m37735b() : m36724e;
    }

    /* renamed from: b */
    public static final C10325j m36732b(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "<this>");
        return (C10325j) f40135b.mo6183a(c10300a1, f40134a[0]);
    }
}
