package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.a */
/* loaded from: classes3.dex */
public final class C10298a extends AbstractC10349r {

    /* renamed from: g */
    private final AbstractC10335m0 f40037g;

    /* renamed from: h */
    private final AbstractC10335m0 f40038h;

    public C10298a(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        C9768m.m32346f(abstractC10335m02, "abbreviation");
        this.f40037g = abstractC10335m0;
        this.f40038h = abstractC10335m02;
    }

    /* renamed from: W */
    public final AbstractC10335m0 m36557W() {
        return mo33694X0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C10298a(mo33694X0().mo33547U0(c10300a1), this.f40038h);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: X0 */
    protected AbstractC10335m0 mo33694X0() {
        return this.f40037g;
    }

    /* renamed from: a1 */
    public final AbstractC10335m0 m36559a1() {
        return this.f40038h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10298a mo33545S0(boolean z) {
        return new C10298a(mo33694X0().mo33545S0(z), this.f40038h.mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C10298a mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10311e0 mo36717a = abstractC10363g.mo36717a(mo33694X0());
        C9768m.m32344d(mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC10311e0 mo36717a2 = abstractC10363g.mo36717a(this.f40038h);
        C9768m.m32344d(mo36717a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10298a((AbstractC10335m0) mo36717a, (AbstractC10335m0) mo36717a2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C10298a mo33695Z0(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        return new C10298a(abstractC10335m0, this.f40038h);
    }
}
