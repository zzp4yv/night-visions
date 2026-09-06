package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.l.a0 */
/* loaded from: classes3.dex */
public final class C10299a0 extends AbstractC10425y implements InterfaceC10342o1 {

    /* renamed from: i */
    private final AbstractC10425y f40039i;

    /* renamed from: j */
    private final AbstractC10311e0 f40040j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10299a0(AbstractC10425y abstractC10425y, AbstractC10311e0 abstractC10311e0) {
        super(abstractC10425y.m37161W0(), abstractC10425y.m37162X0());
        C9768m.m32346f(abstractC10425y, "origin");
        C9768m.m32346f(abstractC10311e0, "enhancement");
        this.f40039i = abstractC10425y;
        this.f40040j = abstractC10311e0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10342o1
    /* renamed from: H */
    public AbstractC10311e0 mo36563H() {
        return this.f40040j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: S0 */
    public AbstractC10348q1 mo33545S0(boolean z) {
        return C10345p1.m36806d(mo36566v().mo33545S0(z), mo36563H().mo36635R0().mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: U0 */
    public AbstractC10348q1 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return C10345p1.m36806d(mo36566v().mo33547U0(c10300a1), mo36563H());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: V0 */
    public AbstractC10335m0 mo33548V0() {
        return mo36566v().mo33548V0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10139c abstractC10139c, InterfaceC10142f interfaceC10142f) {
        C9768m.m32346f(abstractC10139c, "renderer");
        C9768m.m32346f(interfaceC10142f, "options");
        return interfaceC10142f.mo35639f() ? abstractC10139c.mo35505w(mo36563H()) : mo36566v().mo33549Y0(abstractC10139c, interfaceC10142f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10342o1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC10425y mo36566v() {
        return this.f40039i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C10299a0 mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10311e0 mo36717a = abstractC10363g.mo36717a(mo36566v());
        C9768m.m32344d(mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C10299a0((AbstractC10425y) mo36717a, abstractC10363g.mo36717a(mo36563H()));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    public String toString() {
        return "[@EnhancedForWarnings(" + mo36563H() + ")] " + mo36566v();
    }
}
