package kotlin.reflect.p371y.internal.p374j0.p400i;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;

/* compiled from: ExternalOverridabilityCondition.java */
/* renamed from: kotlin.f0.y.e.j0.i.e */
/* loaded from: classes3.dex */
public interface InterfaceC10155e {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: kotlin.f0.y.e.j0.i.e$a */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: kotlin.f0.y.e.j0.i.e$b */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    a mo33227a();

    /* renamed from: b */
    b mo33228b(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2, InterfaceC10552e interfaceC10552e);
}
