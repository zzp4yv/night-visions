package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: ErrorType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.h */
/* loaded from: classes3.dex */
public final class C10391h extends AbstractC10335m0 {

    /* renamed from: g */
    private final InterfaceC10312e1 f40258g;

    /* renamed from: h */
    private final InterfaceC10218h f40259h;

    /* renamed from: i */
    private final EnumC10393j f40260i;

    /* renamed from: j */
    private final List<InterfaceC10318g1> f40261j;

    /* renamed from: k */
    private final boolean f40262k;

    /* renamed from: l */
    private final String[] f40263l;

    /* renamed from: m */
    private final String f40264m;

    public /* synthetic */ C10391h(InterfaceC10312e1 interfaceC10312e1, InterfaceC10218h interfaceC10218h, EnumC10393j enumC10393j, List list, boolean z, String[] strArr, int i2, C9756g c9756g) {
        this(interfaceC10312e1, interfaceC10218h, enumC10393j, (i2 & 8) != 0 ? C10784u.m38888j() : list, (i2 & 16) != 0 ? false : z, strArr);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: M0 */
    public List<InterfaceC10318g1> mo35991M0() {
        return this.f40261j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: N0 */
    public C10300a1 mo35992N0() {
        return C10300a1.f40041g.m36577h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: O0 */
    public InterfaceC10312e1 mo35993O0() {
        return this.f40258g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: P0 */
    public boolean mo33691P0() {
        return this.f40262k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: V0 */
    public AbstractC10335m0 mo33545S0(boolean z) {
        InterfaceC10312e1 mo35993O0 = mo35993O0();
        InterfaceC10218h mo33553q = mo33553q();
        EnumC10393j enumC10393j = this.f40260i;
        List<InterfaceC10318g1> mo35991M0 = mo35991M0();
        String[] strArr = this.f40263l;
        return new C10391h(mo35993O0, mo33553q, enumC10393j, mo35991M0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: W0 */
    public AbstractC10335m0 mo33547U0(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "newAttributes");
        return this;
    }

    /* renamed from: X0 */
    public final String m37043X0() {
        return this.f40264m;
    }

    /* renamed from: Y0 */
    public final EnumC10393j m37044Y0() {
        return this.f40260i;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C10391h mo36558Y0(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0
    /* renamed from: q */
    public InterfaceC10218h mo33553q() {
        return this.f40259h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10391h(InterfaceC10312e1 interfaceC10312e1, InterfaceC10218h interfaceC10218h, EnumC10393j enumC10393j, List<? extends InterfaceC10318g1> list, boolean z, String... strArr) {
        C9768m.m32346f(interfaceC10312e1, "constructor");
        C9768m.m32346f(interfaceC10218h, "memberScope");
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(list, "arguments");
        C9768m.m32346f(strArr, "formatParams");
        this.f40258g = interfaceC10312e1;
        this.f40259h = interfaceC10218h;
        this.f40260i = enumC10393j;
        this.f40261j = list;
        this.f40262k = z;
        this.f40263l = strArr;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String m37049k = enumC10393j.m37049k();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(m37049k, Arrays.copyOf(copyOf, copyOf.length));
        C9768m.m32345e(format, "format(format, *args)");
        this.f40264m = format;
    }
}
