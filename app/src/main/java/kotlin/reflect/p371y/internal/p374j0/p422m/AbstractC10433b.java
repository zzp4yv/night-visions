package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10438g;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10433b {
    /* renamed from: a */
    public final AbstractC10438g m37186a(InterfaceC10705y interfaceC10705y) {
        C9768m.m32346f(interfaceC10705y, "functionDescriptor");
        for (C10439h c10439h : mo37187b()) {
            if (c10439h.m37199b(interfaceC10705y)) {
                return c10439h.m37198a(interfaceC10705y);
            }
        }
        return AbstractC10438g.a.f40407b;
    }

    /* renamed from: b */
    public abstract List<C10439h> mo37187b();
}
