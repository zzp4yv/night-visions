package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10431z0;

/* compiled from: TypeAttributes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.b1 */
/* loaded from: classes3.dex */
public final class C10303b1 {
    /* renamed from: a */
    public static final C10300a1 m36586a(C10300a1 c10300a1, InterfaceC10587g interfaceC10587g) {
        C10300a1 m36573s;
        C9768m.m32346f(c10300a1, "<this>");
        C9768m.m32346f(interfaceC10587g, "newAnnotations");
        if (C10328k.m36731a(c10300a1) == interfaceC10587g) {
            return c10300a1;
        }
        C10325j m36732b = C10328k.m36732b(c10300a1);
        if (m36732b != null && (m36573s = c10300a1.m36573s(m36732b)) != null) {
            c10300a1 = m36573s;
        }
        return (interfaceC10587g.iterator().hasNext() || !interfaceC10587g.isEmpty()) ? c10300a1.m36572r(new C10325j(interfaceC10587g)) : c10300a1;
    }

    /* renamed from: b */
    public static final C10300a1 m36587b(InterfaceC10587g interfaceC10587g) {
        C9768m.m32346f(interfaceC10587g, "<this>");
        return InterfaceC10431z0.a.m37183a(C10340o.f40157a, interfaceC10587g, null, null, 6, null);
    }
}
