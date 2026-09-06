package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.C10742u;
import kotlin.jvm.internal.C9768m;

/* compiled from: InvalidModuleException.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0 */
/* loaded from: classes2.dex */
public final class C10541a0 {

    /* renamed from: a */
    private static final C10556f0<InterfaceC10544b0> f40727a = new C10556f0<>("InvalidModuleNotifier");

    /* renamed from: a */
    public static final void m37666a(InterfaceC10559g0 interfaceC10559g0) {
        C10742u c10742u;
        C9768m.m32346f(interfaceC10559g0, "<this>");
        InterfaceC10544b0 interfaceC10544b0 = (InterfaceC10544b0) interfaceC10559g0.mo37016I0(f40727a);
        if (interfaceC10544b0 != null) {
            interfaceC10544b0.m37668a(interfaceC10559g0);
            c10742u = C10742u.f41439a;
        } else {
            c10742u = null;
        }
        if (c10742u != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + interfaceC10559g0);
    }
}
