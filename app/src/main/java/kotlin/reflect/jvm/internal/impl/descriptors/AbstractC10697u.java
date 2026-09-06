package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10230f;

/* compiled from: DescriptorVisibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.u */
/* loaded from: classes2.dex */
public abstract class AbstractC10697u {
    protected AbstractC10697u() {
    }

    /* renamed from: a */
    public final Integer m38147a(AbstractC10697u abstractC10697u) {
        C9768m.m32346f(abstractC10697u, "visibility");
        return mo38007b().mo37720a(abstractC10697u.mo38007b());
    }

    /* renamed from: b */
    public abstract AbstractC10578m1 mo38007b();

    /* renamed from: c */
    public abstract String mo38008c();

    /* renamed from: d */
    public final boolean m38148d() {
        return mo38007b().m37721c();
    }

    /* renamed from: e */
    public abstract boolean mo33796e(InterfaceC10230f interfaceC10230f, InterfaceC10644q interfaceC10644q, InterfaceC10576m interfaceC10576m, boolean z);

    /* renamed from: f */
    public abstract AbstractC10697u mo38009f();

    public final String toString() {
        return mo38007b().toString();
    }
}
