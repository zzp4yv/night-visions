package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10142f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: flexibleTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.z */
/* loaded from: classes3.dex */
public final class C10430z extends AbstractC10425y implements InterfaceC10337n {

    /* renamed from: i */
    public static final a f40395i = new a(null);

    /* renamed from: j */
    public static boolean f40396j;

    /* renamed from: k */
    private boolean f40397k;

    /* compiled from: flexibleTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10430z(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
        super(abstractC10335m0, abstractC10335m02);
        C9768m.m32346f(abstractC10335m0, "lowerBound");
        C9768m.m32346f(abstractC10335m02, "upperBound");
    }

    /* renamed from: a1 */
    private final void m37181a1() {
        if (!f40396j || this.f40397k) {
            return;
        }
        this.f40397k = true;
        C10302b0.m36583b(m37161W0());
        C10302b0.m36583b(m37162X0());
        C9768m.m32341a(m37161W0(), m37162X0());
        InterfaceC10361e.f40181a.mo36920d(m37161W0(), m37162X0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10337n
    /* renamed from: A0 */
    public boolean mo33689A0() {
        return (m37161W0().mo35993O0().mo32891w() instanceof InterfaceC10554e1) && C9768m.m32341a(m37161W0().mo35993O0(), m37162X0().mo35993O0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10337n
    /* renamed from: K */
    public AbstractC10311e0 mo33690K(AbstractC10311e0 abstractC10311e0) {
        AbstractC10348q1 m36664d;
        C9768m.m32346f(abstractC10311e0, "replacement");
        AbstractC10348q1 mo36635R0 = abstractC10311e0.mo36635R0();
        if (mo36635R0 instanceof AbstractC10425y) {
            m36664d = mo36635R0;
        } else {
            if (!(mo36635R0 instanceof AbstractC10335m0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10335m0 abstractC10335m0 = (AbstractC10335m0) mo36635R0;
            m36664d = C10314f0.m36664d(abstractC10335m0, abstractC10335m0.mo33545S0(true));
        }
        return C10345p1.m36804b(m36664d, mo36635R0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: S0 */
    public AbstractC10348q1 mo33545S0(boolean z) {
        return C10314f0.m36664d(m37161W0().mo33545S0(z), m37162X0().mo33545S0(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: U0 */
    public AbstractC10348q1 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return C10314f0.m36664d(m37161W0().mo33547U0(c10300a1), m37162X0().mo33547U0(c10300a1));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: V0 */
    public AbstractC10335m0 mo33548V0() {
        m37181a1();
        return m37161W0();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    /* renamed from: Y0 */
    public String mo33549Y0(AbstractC10139c abstractC10139c, InterfaceC10142f interfaceC10142f) {
        C9768m.m32346f(abstractC10139c, "renderer");
        C9768m.m32346f(interfaceC10142f, "options");
        if (!interfaceC10142f.mo35655n()) {
            return abstractC10139c.mo35502t(abstractC10139c.mo35505w(m37161W0()), abstractC10139c.mo35505w(m37162X0()), C10424a.m37142h(this));
        }
        return '(' + abstractC10139c.mo35505w(m37161W0()) + ".." + abstractC10139c.mo35505w(m37162X0()) + ')';
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC10425y mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        AbstractC10311e0 mo36717a = abstractC10363g.mo36717a(m37161W0());
        C9768m.m32344d(mo36717a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC10311e0 mo36717a2 = abstractC10363g.mo36717a(m37162X0());
        C9768m.m32344d(mo36717a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C10430z((AbstractC10335m0) mo36717a, (AbstractC10335m0) mo36717a2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10425y
    public String toString() {
        return '(' + m37161W0() + ".." + m37162X0() + ')';
    }
}
