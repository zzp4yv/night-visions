package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.y */
/* loaded from: classes3.dex */
public final class C10196y extends AbstractC10172a0<Long> {
    public C10196y(long j2) {
        super(Long.valueOf(j2));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: a */
    public AbstractC10311e0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        InterfaceC10552e m38149a = C10703x.m38149a(interfaceC10559g0, C9884k.a.f37527B0);
        AbstractC10335m0 mo36400s = m38149a != null ? m38149a.mo36400s() : null;
        return mo36400s == null ? C10394k.m37053d(EnumC10393j.f40269A0, "ULong") : mo36400s;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    public String toString() {
        return mo36023b().longValue() + ".toULong()";
    }
}
