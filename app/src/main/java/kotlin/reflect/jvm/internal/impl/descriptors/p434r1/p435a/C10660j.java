package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;

/* compiled from: RuntimeErrorReporter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.j */
/* loaded from: classes2.dex */
public final class C10660j implements InterfaceC10275r {

    /* renamed from: b */
    public static final C10660j f41149b = new C10660j();

    private C10660j() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r
    /* renamed from: a */
    public void mo36470a(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC10543b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r
    /* renamed from: b */
    public void mo36471b(InterfaceC10552e interfaceC10552e, List<String> list) {
        C9768m.m32346f(interfaceC10552e, "descriptor");
        C9768m.m32346f(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC10552e.getName() + ", unresolved classes " + list);
    }
}
