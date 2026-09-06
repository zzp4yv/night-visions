package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;

/* compiled from: OverridingStrategy.kt */
/* renamed from: kotlin.f0.y.e.j0.i.i */
/* loaded from: classes3.dex */
public abstract class AbstractC10159i {
    /* renamed from: a */
    public abstract void mo33154a(InterfaceC10543b interfaceC10543b);

    /* renamed from: b */
    public abstract void mo35847b(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2);

    /* renamed from: c */
    public abstract void mo35848c(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2);

    /* renamed from: d */
    public void mo33155d(InterfaceC10543b interfaceC10543b, Collection<? extends InterfaceC10543b> collection) {
        C9768m.m32346f(interfaceC10543b, "member");
        C9768m.m32346f(collection, "overridden");
        interfaceC10543b.mo36993x0(collection);
    }
}
