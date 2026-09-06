package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: DeserializedArrayValue.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.n */
/* loaded from: classes3.dex */
public final class C10271n extends C10173b {

    /* renamed from: c */
    private final AbstractC10311e0 f39942c;

    /* compiled from: DeserializedArrayValue.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.n$a */
    static final class a extends Lambda implements Function1<InterfaceC10559g0, AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10311e0 f39943f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10311e0 abstractC10311e0) {
            super(1);
            this.f39943f = abstractC10311e0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "it");
            return this.f39943f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10271n(List<? extends AbstractC10178g<?>> list, AbstractC10311e0 abstractC10311e0) {
        super(list, new a(abstractC10311e0));
        C9768m.m32346f(list, "value");
        C9768m.m32346f(abstractC10311e0, "type");
        this.f39942c = abstractC10311e0;
    }

    /* renamed from: c */
    public final AbstractC10311e0 m36461c() {
        return this.f39942c;
    }
}
