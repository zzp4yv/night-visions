package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10625k0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10365i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10371o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10370n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10405e;

/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.p */
/* loaded from: classes3.dex */
public final class C10343p extends AbstractC10349r implements InterfaceC10337n, InterfaceC10405e {

    /* renamed from: g */
    public static final a f40159g = new a(null);

    /* renamed from: h */
    private final AbstractC10335m0 f40160h;

    /* renamed from: i */
    private final boolean f40161i;

    /* compiled from: SpecialTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.p$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        private final boolean m36796a(AbstractC10348q1 abstractC10348q1) {
            return (abstractC10348q1.mo35993O0() instanceof InterfaceC10370n) || (abstractC10348q1.mo35993O0().mo32891w() instanceof InterfaceC10554e1) || (abstractC10348q1 instanceof C10365i) || (abstractC10348q1 instanceof C10383u0);
        }

        /* renamed from: c */
        public static /* synthetic */ C10343p m36797c(a aVar, AbstractC10348q1 abstractC10348q1, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return aVar.m36799b(abstractC10348q1, z);
        }

        /* renamed from: d */
        private final boolean m36798d(AbstractC10348q1 abstractC10348q1, boolean z) {
            boolean z2 = false;
            if (!m36796a(abstractC10348q1)) {
                return false;
            }
            if (abstractC10348q1 instanceof C10383u0) {
                return C10339n1.m36779l(abstractC10348q1);
            }
            InterfaceC10561h mo32891w = abstractC10348q1.mo35993O0().mo32891w();
            C10625k0 c10625k0 = mo32891w instanceof C10625k0 ? (C10625k0) mo32891w : null;
            if (c10625k0 != null && !c10625k0.m37880U0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return (z && (abstractC10348q1.mo35993O0().mo32891w() instanceof InterfaceC10554e1)) ? C10339n1.m36779l(abstractC10348q1) : !C10371o.f40207a.m36955a(abstractC10348q1);
        }

        /* renamed from: b */
        public final C10343p m36799b(AbstractC10348q1 abstractC10348q1, boolean z) {
            C9768m.m32346f(abstractC10348q1, "type");
            C9756g c9756g = null;
            if (abstractC10348q1 instanceof C10343p) {
                return (C10343p) abstractC10348q1;
            }
            if (!m36798d(abstractC10348q1, z)) {
                return null;
            }
            if (abstractC10348q1 instanceof AbstractC10425y) {
                AbstractC10425y abstractC10425y = (AbstractC10425y) abstractC10348q1;
                C9768m.m32341a(abstractC10425y.m37161W0().mo35993O0(), abstractC10425y.m37162X0().mo35993O0());
            }
            return new C10343p(C10302b0.m36584c(abstractC10348q1).mo33545S0(false), z, c9756g);
        }
    }

    private C10343p(AbstractC10335m0 abstractC10335m0, boolean z) {
        this.f40160h = abstractC10335m0;
        this.f40161i = z;
    }

    public /* synthetic */ C10343p(AbstractC10335m0 abstractC10335m0, boolean z, C9756g c9756g) {
        this(abstractC10335m0, z);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10337n
    /* renamed from: A0 */
    public boolean mo33689A0() {
        return (mo33694X0().mo35993O0() instanceof InterfaceC10370n) || (mo33694X0().mo35993O0().mo32891w() instanceof InterfaceC10554e1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10337n
    /* renamed from: K */
    public AbstractC10311e0 mo33690K(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "replacement");
        return C10347q0.m36811e(abstractC10311e0.mo36635R0(), this.f40161i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        return z ? mo33694X0().mo33545S0(z) : this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C10343p(mo33694X0().mo33547U0(c10300a1), this.f40161i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: X0 */
    protected AbstractC10335m0 mo33694X0() {
        return this.f40160h;
    }

    /* renamed from: a1 */
    public final AbstractC10335m0 m36794a1() {
        return this.f40160h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349r
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10343p mo33695Z0(AbstractC10335m0 abstractC10335m0) {
        C9768m.m32346f(abstractC10335m0, "delegate");
        return new C10343p(abstractC10335m0, this.f40161i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    public String toString() {
        return mo33694X0() + " & Any";
    }
}
