package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: ContextClassReceiver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.b */
/* loaded from: classes3.dex */
public final class C10226b extends AbstractC10225a implements InterfaceC10230f {

    /* renamed from: c */
    private final InterfaceC10552e f39689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10226b(InterfaceC10552e interfaceC10552e, AbstractC10311e0 abstractC10311e0, InterfaceC10230f interfaceC10230f) {
        super(abstractC10311e0, interfaceC10230f);
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        C9768m.m32346f(abstractC10311e0, "receiverType");
        this.f39689c = interfaceC10552e;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f39689c + " }";
    }
}
