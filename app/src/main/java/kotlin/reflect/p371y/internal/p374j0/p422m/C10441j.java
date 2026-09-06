package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9883j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.j */
/* loaded from: classes3.dex */
final class C10441j implements InterfaceC10437f {

    /* renamed from: a */
    public static final C10441j f40419a = new C10441j();

    /* renamed from: b */
    private static final String f40420b = "second parameter must be of type KProperty<*> or its supertype";

    private C10441j() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    /* renamed from: a */
    public String mo37194a(InterfaceC10705y interfaceC10705y) {
        return InterfaceC10437f.a.m37196a(this, interfaceC10705y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    /* renamed from: b */
    public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "functionDescriptor");
        InterfaceC10566i1 interfaceC10566i1 = interfaceC10705y.mo37028f().get(1);
        C9883j.b bVar = C9883j.f37486a;
        C9768m.m32345e(interfaceC10566i1, "secondParameter");
        AbstractC10311e0 m32824a = bVar.m32824a(C10202a.m36078l(interfaceC10566i1));
        if (m32824a == null) {
            return false;
        }
        AbstractC10311e0 type = interfaceC10566i1.getType();
        C9768m.m32345e(type, "secondParameter.type");
        return C10424a.m37149o(m32824a, C10424a.m37153s(type));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    public String getDescription() {
        return f40420b;
    }
}
