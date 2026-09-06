package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10390g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10402b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10404d;

/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.i */
/* loaded from: classes3.dex */
public final class C10365i extends AbstractC10335m0 implements InterfaceC10404d {

    /* renamed from: g */
    private final EnumC10402b f40185g;

    /* renamed from: h */
    private final C10366j f40186h;

    /* renamed from: i */
    private final AbstractC10348q1 f40187i;

    /* renamed from: j */
    private final C10300a1 f40188j;

    /* renamed from: k */
    private final boolean f40189k;

    /* renamed from: l */
    private final boolean f40190l;

    public /* synthetic */ C10365i(EnumC10402b enumC10402b, C10366j c10366j, AbstractC10348q1 abstractC10348q1, C10300a1 c10300a1, boolean z, boolean z2, int i2, C9756g c9756g) {
        this(enumC10402b, c10366j, abstractC10348q1, (i2 & 8) != 0 ? C10300a1.f40041g.m36577h() : c10300a1, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return this.f40188j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40189k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C10365i(this.f40185g, mo35993O0(), this.f40187i, c10300a1, mo33691P0(), this.f40190l);
    }

    /* renamed from: X0 */
    public final EnumC10402b m36934X0() {
        return this.f40185g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C10366j mo35993O0() {
        return this.f40186h;
    }

    /* renamed from: Z0 */
    public final AbstractC10348q1 m36936Z0() {
        return this.f40187i;
    }

    /* renamed from: a1 */
    public final boolean m36937a1() {
        return this.f40190l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10365i mo33545S0(boolean z) {
        return new C10365i(this.f40185g, mo35993O0(), this.f40187i, mo35992N0(), z, false, 32, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C10365i mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        EnumC10402b enumC10402b = this.f40185g;
        C10366j mo35999b = mo35993O0().mo35999b(abstractC10363g);
        AbstractC10348q1 abstractC10348q1 = this.f40187i;
        return new C10365i(enumC10402b, mo35999b, abstractC10348q1 != null ? abstractC10363g.mo36717a(abstractC10348q1).mo36635R0() : null, mo35992N0(), mo33691P0(), false, 32, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return C10394k.m37051a(EnumC10390g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C10365i(EnumC10402b enumC10402b, C10366j c10366j, AbstractC10348q1 abstractC10348q1, C10300a1 c10300a1, boolean z, boolean z2) {
        C9768m.m32346f(enumC10402b, "captureStatus");
        C9768m.m32346f(c10366j, "constructor");
        C9768m.m32346f(c10300a1, "attributes");
        this.f40185g = enumC10402b;
        this.f40186h = c10366j;
        this.f40187i = abstractC10348q1;
        this.f40188j = c10300a1;
        this.f40189k = z;
        this.f40190l = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10365i(EnumC10402b enumC10402b, AbstractC10348q1 abstractC10348q1, InterfaceC10318g1 interfaceC10318g1, InterfaceC10554e1 interfaceC10554e1) {
        this(enumC10402b, new C10366j(interfaceC10318g1, null, null, interfaceC10554e1, 6, null), abstractC10348q1, null, false, false, 56, null);
        C9768m.m32346f(enumC10402b, "captureStatus");
        C9768m.m32346f(interfaceC10318g1, "projection");
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
    }
}
