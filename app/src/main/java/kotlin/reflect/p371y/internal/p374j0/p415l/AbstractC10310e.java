package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10370n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10390g;

/* compiled from: StubTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10310e extends AbstractC10335m0 {

    /* renamed from: g */
    public static final a f40073g = new a(null);

    /* renamed from: h */
    private final InterfaceC10370n f40074h;

    /* renamed from: i */
    private final boolean f40075i;

    /* renamed from: j */
    private final InterfaceC10218h f40076j;

    /* compiled from: StubTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public AbstractC10310e(InterfaceC10370n interfaceC10370n, boolean z) {
        C9768m.m32346f(interfaceC10370n, "originalTypeVariable");
        this.f40074h = interfaceC10370n;
        this.f40075i = z;
        this.f40076j = C10394k.m37052b(EnumC10390g.STUB_TYPE_SCOPE, interfaceC10370n.toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return C10300a1.f40041g.m36577h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40075i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        return z == mo33691P0() ? this : mo36632Y0(z);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return this;
    }

    /* renamed from: X0 */
    public final InterfaceC10370n m36631X0() {
        return this.f40074h;
    }

    /* renamed from: Y0 */
    public abstract AbstractC10310e mo36632Y0(boolean z);

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbstractC10310e mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return this.f40076j;
    }
}
