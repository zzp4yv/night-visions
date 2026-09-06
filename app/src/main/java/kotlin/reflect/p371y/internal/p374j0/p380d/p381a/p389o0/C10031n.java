package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10045x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9917d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9913b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9948g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9966e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9974m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10345p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10373q;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10415o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10418r;

/* compiled from: signatureEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.n */
/* loaded from: classes3.dex */
final class C10031n extends AbstractC10018a<InterfaceC10583c> {

    /* renamed from: a */
    private final InterfaceC10581a f38285a;

    /* renamed from: b */
    private final boolean f38286b;

    /* renamed from: c */
    private final C9957g f38287c;

    /* renamed from: d */
    private final EnumC9913b f38288d;

    /* renamed from: e */
    private final boolean f38289e;

    public /* synthetic */ C10031n(InterfaceC10581a interfaceC10581a, boolean z, C9957g c9957g, EnumC9913b enumC9913b, boolean z2, int i2, C9756g c9756g) {
        this(interfaceC10581a, z, c9957g, enumC9913b, (i2 & 16) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: A */
    public boolean mo33644A(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "<this>");
        return ((AbstractC10311e0) interfaceC10409i).mo36635R0() instanceof C10024g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C9917d mo33646h() {
        return this.f38287c.m33282a().m33241a();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC10311e0 mo33653p(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "<this>");
        return C10345p1.m36803a((AbstractC10311e0) interfaceC10409i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean mo33655r(InterfaceC10583c interfaceC10583c) {
        C9768m.m32346f(interfaceC10583c, "<this>");
        return ((interfaceC10583c instanceof InterfaceC9948g) && ((InterfaceC9948g) interfaceC10583c).mo33163g()) || ((interfaceC10583c instanceof C9966e) && !mo33652o() && (((C9966e) interfaceC10583c).m33333k() || mo33649l() == EnumC9913b.TYPE_PARAMETER_BOUNDS));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public InterfaceC10418r mo33658v() {
        return C10373q.f40209a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: i */
    public Iterable<InterfaceC10583c> mo33647i(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "<this>");
        return ((AbstractC10311e0) interfaceC10409i).getAnnotations();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: k */
    public Iterable<InterfaceC10583c> mo33648k() {
        InterfaceC10587g annotations;
        InterfaceC10581a interfaceC10581a = this.f38285a;
        return (interfaceC10581a == null || (annotations = interfaceC10581a.getAnnotations()) == null) ? C10784u.m38888j() : annotations;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: l */
    public EnumC9913b mo33649l() {
        return this.f38288d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: m */
    public C10045x mo33650m() {
        return this.f38287c.m33283b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: n */
    public boolean mo33651n() {
        InterfaceC10581a interfaceC10581a = this.f38285a;
        return (interfaceC10581a instanceof InterfaceC10566i1) && ((InterfaceC10566i1) interfaceC10581a).mo37697l0() != null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: o */
    public boolean mo33652o() {
        return this.f38287c.m33282a().m33257q().mo33267c();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: s */
    public C10128d mo33656s(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "<this>");
        InterfaceC10552e m36773f = C10339n1.m36773f((AbstractC10311e0) interfaceC10409i);
        if (m36773f != null) {
            return C10154d.m35825m(m36773f);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: u */
    public boolean mo33657u() {
        return this.f38289e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: w */
    public boolean mo33659w(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "<this>");
        return AbstractC9881h.m32742e0((AbstractC10311e0) interfaceC10409i);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: x */
    public boolean mo33660x() {
        return this.f38286b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: y */
    public boolean mo33661y(InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        C9768m.m32346f(interfaceC10409i, "<this>");
        C9768m.m32346f(interfaceC10409i2, "other");
        return this.f38287c.m33282a().m33251k().mo36919b((AbstractC10311e0) interfaceC10409i, (AbstractC10311e0) interfaceC10409i2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.AbstractC10018a
    /* renamed from: z */
    public boolean mo33662z(InterfaceC10415o interfaceC10415o) {
        C9768m.m32346f(interfaceC10415o, "<this>");
        return interfaceC10415o instanceof C9974m;
    }

    public C10031n(InterfaceC10581a interfaceC10581a, boolean z, C9957g c9957g, EnumC9913b enumC9913b, boolean z2) {
        C9768m.m32346f(c9957g, "containerContext");
        C9768m.m32346f(enumC9913b, "containerApplicabilityType");
        this.f38285a = interfaceC10581a;
        this.f38286b = z;
        this.f38287c = c9957g;
        this.f38288d = enumC9913b;
        this.f38289e = z2;
    }
}
