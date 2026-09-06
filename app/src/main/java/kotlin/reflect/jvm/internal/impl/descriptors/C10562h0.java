package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;

/* compiled from: MultiFieldValueClassRepresentation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h0 */
/* loaded from: classes2.dex */
public final class C10562h0<Type extends InterfaceC10411k> extends AbstractC10560g1<Type> {

    /* renamed from: a */
    private final List<Pair<C10130f, Type>> f40756a;

    /* renamed from: b */
    private final Map<C10130f, Type> f40757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10562h0(List<? extends Pair<C10130f, ? extends Type>> list) {
        super(null);
        Map<C10130f, Type> m38805q;
        C9768m.m32346f(list, "underlyingPropertyNamesToTypes");
        this.f40756a = list;
        m38805q = C10777q0.m38805q(mo37691a());
        if (!(m38805q.size() == mo37691a().size())) {
            throw new IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f40757b = m38805q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1
    /* renamed from: a */
    public List<Pair<C10130f, Type>> mo37691a() {
        return this.f40756a;
    }
}
