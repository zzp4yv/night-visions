package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.b */
/* loaded from: classes3.dex */
public class C10173b extends AbstractC10178g<List<? extends AbstractC10178g<?>>> {

    /* renamed from: b */
    private final Function1<InterfaceC10559g0, AbstractC10311e0> f39556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10173b(List<? extends AbstractC10178g<?>> list, Function1<? super InterfaceC10559g0, ? extends AbstractC10311e0> function1) {
        super(list);
        C9768m.m32346f(list, "value");
        C9768m.m32346f(function1, "computeType");
        this.f39556b = function1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: a */
    public AbstractC10311e0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        AbstractC10311e0 invoke = this.f39556b.invoke(interfaceC10559g0);
        if (!AbstractC9881h.m32738c0(invoke) && !AbstractC9881h.m32754p0(invoke)) {
            AbstractC9881h.m32728C0(invoke);
        }
        return invoke;
    }
}
