package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9768m;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.s */
/* loaded from: classes3.dex */
public abstract class AbstractC10352s extends AbstractC10349r {

    /* renamed from: g */
    private final AbstractC10335m0 f40174g;

    public AbstractC10352s(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        this.f40174g = abstractC10335m0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        return z == mo33691P0() ? this : mo33694X0().mo33545S0(z).mo33547U0(mo35992N0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return c10300a1 != mo35992N0() ? new C10341o0(this, c10300a1) : this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: X0 */
    protected AbstractC10335m0 mo33694X0() {
        return this.f40174g;
    }
}
