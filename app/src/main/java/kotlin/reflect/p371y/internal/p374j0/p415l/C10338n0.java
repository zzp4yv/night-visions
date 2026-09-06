package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10395l;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.n0 */
/* loaded from: classes3.dex */
final class C10338n0 extends AbstractC10335m0 {

    /* renamed from: g */
    private final InterfaceC10312e1 f40147g;

    /* renamed from: h */
    private final List<InterfaceC10318g1> f40148h;

    /* renamed from: i */
    private final boolean f40149i;

    /* renamed from: j */
    private final InterfaceC10218h f40150j;

    /* renamed from: k */
    private final Function1<AbstractC10363g, AbstractC10335m0> f40151k;

    /* JADX WARN: Multi-variable type inference failed */
    public C10338n0(InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, boolean z, InterfaceC10218h interfaceC10218h, Function1<? super AbstractC10363g, ? extends AbstractC10335m0> function1) {
        C9768m.m32346f(interfaceC10312e1, "constructor");
        C9768m.m32346f(list, "arguments");
        C9768m.m32346f(interfaceC10218h, "memberScope");
        C9768m.m32346f(function1, "refinedTypeFactory");
        this.f40147g = interfaceC10312e1;
        this.f40148h = list;
        this.f40149i = z;
        this.f40150j = interfaceC10218h;
        this.f40151k = function1;
        if (!(mo33553q() instanceof C10389f) || (mo33553q() instanceof C10395l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo33553q() + '\n' + mo35993O0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return this.f40148h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return C10300a1.f40041g.m36577h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: O0 */
    public InterfaceC10312e1 mo35993O0() {
        return this.f40147g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40149i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        return z == mo33691P0() ? this : z ? new C10329k0(this) : new C10323i0(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return c10300a1.isEmpty() ? this : new C10341o0(this, c10300a1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10335m0 invoke = this.f40151k.invoke(abstractC10363g);
        return invoke == null ? this : invoke;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return this.f40150j;
    }
}
