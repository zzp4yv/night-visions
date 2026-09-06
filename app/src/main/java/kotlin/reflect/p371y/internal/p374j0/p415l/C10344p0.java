package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.l.p0 */
/* loaded from: classes3.dex */
public final class C10344p0 extends AbstractC10349r implements InterfaceC10342o1 {

    /* renamed from: g */
    private final AbstractC10335m0 f40162g;

    /* renamed from: h */
    private final AbstractC10311e0 f40163h;

    public C10344p0(AbstractC10335m0 abstractC10335m0, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        C9768m.m32346f(abstractC10311e0, "enhancement");
        this.f40162g = abstractC10335m0;
        this.f40163h = abstractC10311e0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10342o1
    /* renamed from: H */
    public AbstractC10311e0 mo36563H() {
        return this.f40163h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        AbstractC10348q1 m36806d = C10345p1.m36806d(mo36566v().mo33545S0(z), mo36563H().mo36635R0().mo33545S0(z));
        C9768m.m32344d(m36806d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC10335m0) m36806d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        AbstractC10348q1 m36806d = C10345p1.m36806d(mo36566v().mo33547U0(c10300a1), mo36563H());
        C9768m.m32344d(m36806d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC10335m0) m36806d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: X0 */
    protected AbstractC10335m0 mo33694X0() {
        return this.f40162g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10342o1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 mo36566v() {
        return mo33694X0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10344p0 mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10311e0 mo36717a = abstractC10363g.mo36717a(mo33694X0());
        C9768m.m32344d(mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10344p0((AbstractC10335m0) mo36717a, abstractC10363g.mo36717a(mo36563H()));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C10344p0 mo33695Z0(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        return new C10344p0(abstractC10335m0, mo36563H());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo36563H() + ")] " + mo36566v();
    }
}
