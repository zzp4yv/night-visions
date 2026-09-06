package kotlin.reflect.p371y.internal.p374j0.p400i;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;

/* compiled from: OverridingStrategy.kt */
/* renamed from: kotlin.f0.y.e.j0.i.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10158h extends AbstractC10159i {
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
    /* renamed from: b */
    public void mo35847b(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2) {
        C9768m.m32346f(interfaceC10543b, "first");
        C9768m.m32346f(interfaceC10543b2, "second");
        mo33156e(interfaceC10543b, interfaceC10543b2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
    /* renamed from: c */
    public void mo35848c(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2) {
        C9768m.m32346f(interfaceC10543b, "fromSuper");
        C9768m.m32346f(interfaceC10543b2, "fromCurrent");
        mo33156e(interfaceC10543b, interfaceC10543b2);
    }

    /* renamed from: e */
    protected abstract void mo33156e(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2);
}
