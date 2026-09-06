package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10326j0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.g */
/* loaded from: classes3.dex */
public final class C10024g extends AbstractC10349r implements InterfaceC10326j0 {

    /* renamed from: g */
    private final AbstractC10335m0 f38225g;

    public C10024g(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        this.f38225g = abstractC10335m0;
    }

    /* renamed from: a1 */
    private final AbstractC10335m0 m33688a1(AbstractC10335m0 abstractC10335m0) {
        AbstractC10335m0 mo33545S0 = abstractC10335m0.mo33545S0(false);
        return !C10424a.m37151q(abstractC10335m0) ? mo33545S0 : new C10024g(mo33545S0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10337n
    /* renamed from: A0 */
    public boolean mo33689A0() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10337n
    /* renamed from: K */
    public AbstractC10311e0 mo33690K(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "replacement");
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (!C10424a.m37151q(mo36635R0) && !C10339n1.m36779l(mo36635R0)) {
            return mo36635R0;
        }
        if (mo36635R0 instanceof AbstractC10335m0) {
            return m33688a1((AbstractC10335m0) mo36635R0);
        }
        if (mo36635R0 instanceof AbstractC10425y) {
            AbstractC10425y abstractC10425y = (AbstractC10425y) mo36635R0;
            return C10345p1.m36806d(C10314f0.m36664d(m33688a1(abstractC10425y.m37161W0()), m33688a1(abstractC10425y.m37162X0())), C10345p1.m36803a(mo36635R0));
        }
        throw new IllegalStateException(("Incorrect type: " + mo36635R0).toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        return z ? mo33694X0().mo33545S0(true) : this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: X0 */
    protected AbstractC10335m0 mo33694X0() {
        return this.f38225g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10024g mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C10024g(mo33694X0().mo33547U0(c10300a1));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C10024g mo33695Z0(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        return new C10024g(abstractC10335m0);
    }
}
