package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.l.p1 */
/* loaded from: classes3.dex */
public final class C10345p1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final AbstractC10311e0 m36803a(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        if (abstractC10311e0 instanceof InterfaceC10342o1) {
            return ((InterfaceC10342o1) abstractC10311e0).mo36563H();
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC10348q1 m36804b(AbstractC10348q1 abstractC10348q1, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10348q1, "<this>");
        C9768m.m32346f(abstractC10311e0, "origin");
        return m36806d(abstractC10348q1, m36803a(abstractC10311e0));
    }

    /* renamed from: c */
    public static final AbstractC10348q1 m36805c(AbstractC10348q1 abstractC10348q1, AbstractC10311e0 abstractC10311e0, Function1<? super AbstractC10311e0, ? extends AbstractC10311e0> function1) {
        C9768m.m32346f(abstractC10348q1, "<this>");
        C9768m.m32346f(abstractC10311e0, "origin");
        C9768m.m32346f(function1, "transform");
        AbstractC10311e0 m36803a = m36803a(abstractC10311e0);
        return m36806d(abstractC10348q1, m36803a != null ? function1.invoke(m36803a) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final AbstractC10348q1 m36806d(AbstractC10348q1 abstractC10348q1, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10348q1, "<this>");
        if (abstractC10348q1 instanceof InterfaceC10342o1) {
            return m36806d(((InterfaceC10342o1) abstractC10348q1).mo36566v(), abstractC10311e0);
        }
        if (abstractC10311e0 == null || C9768m.m32341a(abstractC10311e0, abstractC10348q1)) {
            return abstractC10348q1;
        }
        if (abstractC10348q1 instanceof AbstractC10335m0) {
            return new C10344p0((AbstractC10335m0) abstractC10348q1, abstractC10311e0);
        }
        if (abstractC10348q1 instanceof AbstractC10425y) {
            return new C10299a0((AbstractC10425y) abstractC10348q1, abstractC10311e0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
