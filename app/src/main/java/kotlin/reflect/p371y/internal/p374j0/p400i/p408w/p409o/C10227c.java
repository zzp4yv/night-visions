package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: ContextReceiver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.c */
/* loaded from: classes3.dex */
public final class C10227c extends AbstractC10225a implements InterfaceC10230f {

    /* renamed from: c */
    private final InterfaceC10540a f39690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10227c(InterfaceC10540a interfaceC10540a, AbstractC10311e0 abstractC10311e0, InterfaceC10230f interfaceC10230f) {
        super(abstractC10311e0, interfaceC10230f);
        C9768m.m32346f(interfaceC10540a, "declarationDescriptor");
        C9768m.m32346f(abstractC10311e0, "receiverType");
        this.f39690c = interfaceC10540a;
    }

    /* renamed from: c */
    public InterfaceC10540a m36180c() {
        return this.f39690c;
    }

    public String toString() {
        return "Cxt { " + m36180c() + " }";
    }
}
