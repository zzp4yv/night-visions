package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.m */
/* loaded from: classes3.dex */
final class C10444m implements InterfaceC10437f {

    /* renamed from: a */
    public static final C10444m f40425a = new C10444m();

    /* renamed from: b */
    private static final String f40426b = "should not have varargs or parameters with default values";

    private C10444m() {
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
        List<InterfaceC10566i1> mo37028f = interfaceC10705y.mo37028f();
        C9768m.m32345e(mo37028f, "functionDescriptor.valueParameters");
        if (!(mo37028f instanceof Collection) || !mo37028f.isEmpty()) {
            for (InterfaceC10566i1 interfaceC10566i1 : mo37028f) {
                C9768m.m32345e(interfaceC10566i1, "it");
                if (!(!C10202a.m36067a(interfaceC10566i1) && interfaceC10566i1.mo37697l0() == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    public String getDescription() {
        return f40426b;
    }
}
