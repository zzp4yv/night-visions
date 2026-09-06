package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.collections.C10782t;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;

/* compiled from: InlineClassRepresentation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z */
/* loaded from: classes2.dex */
public final class C10707z<Type extends InterfaceC10411k> extends AbstractC10560g1<Type> {

    /* renamed from: a */
    private final C10130f f41245a;

    /* renamed from: b */
    private final Type f41246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10707z(C10130f c10130f, Type type) {
        super(null);
        C9768m.m32346f(c10130f, "underlyingPropertyName");
        C9768m.m32346f(type, "underlyingType");
        this.f41245a = c10130f;
        this.f41246b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1
    /* renamed from: a */
    public List<Pair<C10130f, Type>> mo37691a() {
        return C10782t.m38883e(C10740s.m38547a(this.f41245a, this.f41246b));
    }

    /* renamed from: c */
    public final C10130f m38162c() {
        return this.f41245a;
    }

    /* renamed from: d */
    public final Type m38163d() {
        return this.f41246b;
    }
}
