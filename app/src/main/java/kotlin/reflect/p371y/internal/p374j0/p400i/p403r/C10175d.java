package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.d */
/* loaded from: classes3.dex */
public final class C10175d extends AbstractC10186o<Byte> {
    public C10175d(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        AbstractC10335m0 m32800t = interfaceC10559g0.mo37021o().m32800t();
        C9768m.m32345e(m32800t, "module.builtIns.byteType");
        return m32800t;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    public String toString() {
        return mo36023b().intValue() + ".toByte()";
    }
}
