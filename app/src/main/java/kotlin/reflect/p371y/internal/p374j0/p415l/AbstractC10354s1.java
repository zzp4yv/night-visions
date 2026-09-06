package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.s1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10354s1 extends AbstractC10311e0 {
    public AbstractC10354s1() {
        super(null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return mo36713S0().mo35991M0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return mo36713S0().mo35992N0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: O0 */
    public InterfaceC10312e1 mo35993O0() {
        return mo36713S0().mo35993O0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return mo36713S0().mo33691P0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: R0 */
    public final AbstractC10348q1 mo36635R0() {
        AbstractC10311e0 mo36713S0 = mo36713S0();
        while (mo36713S0 instanceof AbstractC10354s1) {
            mo36713S0 = ((AbstractC10354s1) mo36713S0).mo36713S0();
        }
        C9768m.m32344d(mo36713S0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC10348q1) mo36713S0;
    }

    /* renamed from: S0 */
    protected abstract AbstractC10311e0 mo36713S0();

    /* renamed from: T0 */
    public boolean mo36714T0() {
        return true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return mo36713S0().mo33553q();
    }

    public String toString() {
        return mo36714T0() ? mo36713S0().toString() : "<Not computed yet>";
    }
}
