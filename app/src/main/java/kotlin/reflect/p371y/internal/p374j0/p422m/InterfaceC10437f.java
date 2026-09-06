package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.f */
/* loaded from: classes3.dex */
public interface InterfaceC10437f {

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.f$a */
    public static final class a {
        /* renamed from: a */
        public static String m37196a(InterfaceC10437f interfaceC10437f, InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            if (interfaceC10437f.mo37195b(interfaceC10705y)) {
                return null;
            }
            return interfaceC10437f.getDescription();
        }
    }

    /* renamed from: a */
    String mo37194a(InterfaceC10705y interfaceC10705y);

    /* renamed from: b */
    boolean mo37195b(InterfaceC10705y interfaceC10705y);

    String getDescription();
}
