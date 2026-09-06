package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10694s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10700v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10701w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;

/* compiled from: ErrorPropertyDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.e */
/* loaded from: classes3.dex */
public final class C10388e implements InterfaceC10696t0 {

    /* renamed from: f */
    private final /* synthetic */ C10609c0 f40243f;

    public C10388e() {
        C10394k c10394k = C10394k.f40355a;
        C10609c0 m37779P0 = C10609c0.m37779P0(c10394k.m37061h(), InterfaceC10587g.f40808c.m37735b(), EnumC10550d0.OPEN, C10695t.f41220e, true, C10130f.m35451D(EnumC10385b.ERROR_PROPERTY.m36988k()), InterfaceC10543b.a.DECLARATION, InterfaceC10708z0.f41247a, false, false, false, false, false, false);
        m37779P0.m37794c1(c10394k.m37064k(), C10784u.m38888j(), null, null, C10784u.m38888j());
        this.f40243f = m37779P0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f40243f.mo32859E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: G */
    public boolean mo33204G() {
        return this.f40243f.mo33204G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return (R) this.f40243f.mo37017L(interfaceC10595o, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f40243f.mo32863M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10572k1
    /* renamed from: O */
    public boolean mo37025O() {
        return this.f40243f.mo37025O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    /* renamed from: X */
    public AbstractC10178g<?> mo37026X() {
        return this.f40243f.mo37026X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10696t0 mo37019a() {
        return this.f40243f.mo37019a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10579n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        return this.f40243f.mo32876b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: c, reason: avoid collision after fix types in other method */
    public InterfaceC10696t0 mo36396c(C10333l1 c10333l1) {
        C9768m.m32346f(c10333l1, "substitutor");
        return this.f40243f.mo36396c(c10333l1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    public Collection<? extends InterfaceC10696t0> mo37027e() {
        return this.f40243f.mo37027e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f */
    public List<InterfaceC10566i1> mo37028f() {
        return this.f40243f.mo37028f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f0 */
    public InterfaceC10702w0 mo37029f0() {
        return this.f40243f.mo37029f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        InterfaceC10587g annotations = this.f40243f.getAnnotations();
        C9768m.m32345e(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    public InterfaceC10698u0 getGetter() {
        return this.f40243f.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10565i0
    public C10130f getName() {
        return this.f40243f.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public AbstractC10311e0 getReturnType() {
        return this.f40243f.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    public InterfaceC10700v0 getSetter() {
        return this.f40243f.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10563h1
    public AbstractC10311e0 getType() {
        return this.f40243f.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public List<InterfaceC10554e1> getTypeParameters() {
        return this.f40243f.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        return this.f40243f.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: i */
    public InterfaceC10543b.a mo37030i() {
        return this.f40243f.mo37030i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10540a.a<V> aVar) {
        return (V) this.f40243f.mo33224i0(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    public boolean isConst() {
        return this.f40243f.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        return this.f40243f.mo32879j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    /* renamed from: j0 */
    public boolean mo37031j0() {
        return this.f40243f.mo37031j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: k0 */
    public InterfaceC10543b mo36990k0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, InterfaceC10543b.a aVar, boolean z) {
        return this.f40243f.mo36990k0(interfaceC10576m, enumC10550d0, abstractC10697u, aVar, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: m0 */
    public InterfaceC10702w0 mo37032m0() {
        return this.f40243f.mo37032m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: n0 */
    public InterfaceC10701w mo37033n0() {
        return this.f40243f.mo37033n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: q0 */
    public InterfaceC10701w mo37034q0() {
        return this.f40243f.mo37034q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: r0 */
    public List<InterfaceC10702w0> mo37035r0() {
        return this.f40243f.mo37035r0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10569j1
    /* renamed from: s0 */
    public boolean mo37036s0() {
        return this.f40243f.mo37036s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        return this.f40243f.mo32883t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0
    /* renamed from: x */
    public List<InterfaceC10694s0> mo37037x() {
        return this.f40243f.mo37037x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10543b> collection) {
        C9768m.m32346f(collection, "overriddenDescriptors");
        this.f40243f.mo36993x0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        return this.f40243f.mo32885z();
    }
}
