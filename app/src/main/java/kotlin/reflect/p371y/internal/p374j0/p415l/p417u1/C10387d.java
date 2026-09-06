package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10556f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9878e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ErrorModuleDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.d */
/* loaded from: classes3.dex */
public final class C10387d implements InterfaceC10559g0 {

    /* renamed from: f */
    public static final C10387d f40237f = new C10387d();

    /* renamed from: g */
    private static final C10130f f40238g;

    /* renamed from: h */
    private static final List<InterfaceC10559g0> f40239h;

    /* renamed from: i */
    private static final List<InterfaceC10559g0> f40240i;

    /* renamed from: j */
    private static final Set<InterfaceC10559g0> f40241j;

    /* renamed from: k */
    private static final AbstractC9881h f40242k;

    static {
        Set<InterfaceC10559g0> m38917d;
        C10130f m35451D = C10130f.m35451D(EnumC10385b.ERROR_MODULE.m36988k());
        C9768m.m32345e(m35451D, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f40238g = m35451D;
        f40239h = C10784u.m38888j();
        f40240i = C10784u.m38888j();
        m38917d = C10789w0.m38917d();
        f40241j = m38917d;
        f40242k = C9878e.f37452h.m32704a();
    }

    private C10387d() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: I0 */
    public <T> T mo37016I0(C10556f0<T> c10556f0) {
        C9768m.m32346f(c10556f0, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        C9768m.m32346f(interfaceC10595o, "visitor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: N */
    public InterfaceC10603p0 mo37018N(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10576m mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: e0 */
    public boolean mo37020e0(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "targetModule");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        return InterfaceC10587g.f40808c.m37735b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10565i0
    public C10130f getName() {
        return m37024v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: o */
    public AbstractC9881h mo37021o() {
        return f40242k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: p */
    public Collection<C10127c> mo37022p(C10127c c10127c, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(function1, "nameFilter");
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: t0 */
    public List<InterfaceC10559g0> mo37023t0() {
        return f40240i;
    }

    /* renamed from: v */
    public C10130f m37024v() {
        return f40238g;
    }
}
