package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.r */
/* loaded from: classes3.dex */
public abstract class AbstractC10349r extends AbstractC10335m0 {
    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return mo33694X0().mo35991M0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return mo33694X0().mo35992N0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: O0 */
    public InterfaceC10312e1 mo35993O0() {
        return mo33694X0().mo35993O0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return mo33694X0().mo33691P0();
    }

    /* renamed from: X0 */
    protected abstract AbstractC10335m0 mo33694X0();

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Y0 */
    public AbstractC10335m0 mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10311e0 mo36717a = abstractC10363g.mo36717a(mo33694X0());
        C9768m.m32344d(mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo33695Z0((AbstractC10335m0) mo36717a);
    }

    /* renamed from: Z0 */
    public abstract AbstractC10349r mo33695Z0(AbstractC10335m0 abstractC10335m0);

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return mo33694X0().mo33553q();
    }
}
