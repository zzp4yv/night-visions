package kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10390g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10404d;
import okhttp3.HttpUrl;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.q.a.a */
/* loaded from: classes3.dex */
public final class C10167a extends AbstractC10335m0 implements InterfaceC10404d {

    /* renamed from: g */
    private final InterfaceC10318g1 f39548g;

    /* renamed from: h */
    private final InterfaceC10168b f39549h;

    /* renamed from: i */
    private final boolean f39550i;

    /* renamed from: j */
    private final C10300a1 f39551j;

    public /* synthetic */ C10167a(InterfaceC10318g1 interfaceC10318g1, InterfaceC10168b interfaceC10168b, boolean z, C10300a1 c10300a1, int i2, C9756g c9756g) {
        this(interfaceC10318g1, (i2 & 2) != 0 ? new C10169c(interfaceC10318g1) : interfaceC10168b, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? C10300a1.f40041g.m36577h() : c10300a1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return this.f39551j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f39550i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return new C10167a(this.f39548g, mo35993O0(), mo33691P0(), c10300a1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10168b mo35993O0() {
        return this.f39549h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C10167a mo33545S0(boolean z) {
        return z == mo33691P0() ? this : new C10167a(this.f39548g, mo35993O0(), z, mo35992N0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10167a mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        InterfaceC10318g1 mo36709b = this.f39548g.mo36709b(abstractC10363g);
        C9768m.m32345e(mo36709b, "typeProjection.refine(kotlinTypeRefiner)");
        return new C10167a(mo36709b, mo35993O0(), mo33691P0(), mo35992N0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return C10394k.m37051a(EnumC10390g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f39548g);
        sb.append(')');
        sb.append(mo33691P0() ? "?" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }

    public C10167a(InterfaceC10318g1 interfaceC10318g1, InterfaceC10168b interfaceC10168b, boolean z, C10300a1 c10300a1) {
        C9768m.m32346f(interfaceC10318g1, "typeProjection");
        C9768m.m32346f(interfaceC10168b, "constructor");
        C9768m.m32346f(c10300a1, "attributes");
        this.f39548g = interfaceC10318g1;
        this.f39549h = interfaceC10168b;
        this.f39550i = z;
        this.f39551j = c10300a1;
    }
}
