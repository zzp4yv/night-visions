package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.v */
/* loaded from: classes3.dex */
public final class C10193v extends AbstractC10178g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10193v(String str) {
        super(str);
        C9768m.m32346f(str, "value");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        AbstractC10335m0 m32784W = interfaceC10559g0.mo37021o().m32784W();
        C9768m.m32345e(m32784W, "module.builtIns.stringType");
        return m32784W;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    public String toString() {
        return '\"' + mo36023b() + '\"';
    }
}
