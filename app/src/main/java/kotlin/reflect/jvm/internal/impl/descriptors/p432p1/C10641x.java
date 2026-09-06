package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.collections.C10749c0;
import kotlin.collections.C10770n;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C10541a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10556f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10574l0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10603p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10605a0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p398g.C10136a;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.x */
/* loaded from: classes2.dex */
public final class C10641x extends AbstractC10622j implements InterfaceC10559g0 {

    /* renamed from: h */
    private final InterfaceC10297n f41108h;

    /* renamed from: i */
    private final AbstractC9881h f41109i;

    /* renamed from: j */
    private final C10130f f41110j;

    /* renamed from: k */
    private final Map<C10556f0<?>, Object> f41111k;

    /* renamed from: l */
    private final InterfaceC10605a0 f41112l;

    /* renamed from: m */
    private InterfaceC10639v f41113m;

    /* renamed from: n */
    private InterfaceC10574l0 f41114n;

    /* renamed from: o */
    private boolean f41115o;

    /* renamed from: p */
    private final InterfaceC10290g<C10127c, InterfaceC10603p0> f41116p;

    /* renamed from: q */
    private final Lazy f41117q;

    /* compiled from: ModuleDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.x$a */
    static final class a extends Lambda implements Function0<C10620i> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10620i invoke() {
            InterfaceC10639v interfaceC10639v = C10641x.this.f41113m;
            C10641x c10641x = C10641x.this;
            if (interfaceC10639v == null) {
                throw new AssertionError("Dependencies of module " + c10641x.m37988Q0() + " were not set before querying module content");
            }
            List<C10641x> mo37979a = interfaceC10639v.mo37979a();
            C10641x.this.m37991P0();
            mo37979a.contains(C10641x.this);
            Iterator<T> it = mo37979a.iterator();
            while (it.hasNext()) {
                ((C10641x) it.next()).m37990U0();
            }
            ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37979a, 10));
            Iterator<T> it2 = mo37979a.iterator();
            while (it2.hasNext()) {
                InterfaceC10574l0 interfaceC10574l0 = ((C10641x) it2.next()).f41114n;
                C9768m.m32343c(interfaceC10574l0);
                arrayList.add(interfaceC10574l0);
            }
            return new C10620i(arrayList, "CompositeProvider@ModuleDescriptor for " + C10641x.this.getName());
        }
    }

    /* compiled from: ModuleDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.x$b */
    static final class b extends Lambda implements Function1<C10127c, InterfaceC10603p0> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10603p0 invoke(C10127c c10127c) {
            C9768m.m32346f(c10127c, "fqName");
            InterfaceC10605a0 interfaceC10605a0 = C10641x.this.f41112l;
            C10641x c10641x = C10641x.this;
            return interfaceC10605a0.mo37758a(c10641x, c10127c, c10641x.f41108h);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10641x(C10130f c10130f, InterfaceC10297n interfaceC10297n, AbstractC9881h abstractC9881h, C10136a c10136a) {
        this(c10130f, interfaceC10297n, abstractC9881h, c10136a, null, null, 48, null);
        C9768m.m32346f(c10130f, "moduleName");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(abstractC9881h, "builtIns");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C10641x(kotlin.reflect.p371y.internal.p374j0.p397f.C10130f r10, kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n r11, kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h r12, kotlin.reflect.p371y.internal.p374j0.p398g.C10136a r13, java.util.Map r14, kotlin.reflect.p371y.internal.p374j0.p397f.C10130f r15, int r16, kotlin.jvm.internal.C9756g r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = kotlin.collections.C10771n0.m38778i()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10641x.<init>(kotlin.f0.y.e.j0.f.f, kotlin.f0.y.e.j0.k.n, kotlin.f0.y.e.j0.b.h, kotlin.f0.y.e.j0.g.a, java.util.Map, kotlin.f0.y.e.j0.f.f, int, kotlin.a0.d.g):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public final String m37988Q0() {
        String c10130f = getName().toString();
        C9768m.m32345e(c10130f, "name.toString()");
        return c10130f;
    }

    /* renamed from: S0 */
    private final C10620i m37989S0() {
        return (C10620i) this.f41117q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final boolean m37990U0() {
        return this.f41114n != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: I0 */
    public <T> T mo37016I0(C10556f0<T> c10556f0) {
        C9768m.m32346f(c10556f0, "capability");
        T t = (T) this.f41111k.get(c10556f0);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return (R) InterfaceC10559g0.a.m37689a(this, interfaceC10595o, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: N */
    public InterfaceC10603p0 mo37018N(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        m37991P0();
        return this.f41116p.invoke(c10127c);
    }

    /* renamed from: P0 */
    public void m37991P0() {
        if (m37994V0()) {
            return;
        }
        C10541a0.m37666a(this);
    }

    /* renamed from: R0 */
    public final InterfaceC10574l0 m37992R0() {
        m37991P0();
        return m37989S0();
    }

    /* renamed from: T0 */
    public final void m37993T0(InterfaceC10574l0 interfaceC10574l0) {
        C9768m.m32346f(interfaceC10574l0, "providerForModuleContent");
        m37990U0();
        this.f41114n = interfaceC10574l0;
    }

    /* renamed from: V0 */
    public boolean m37994V0() {
        return this.f41115o;
    }

    /* renamed from: W0 */
    public final void m37995W0(List<C10641x> list) {
        Set<C10641x> m38917d;
        C9768m.m32346f(list, "descriptors");
        m38917d = C10789w0.m38917d();
        m37996X0(list, m38917d);
    }

    /* renamed from: X0 */
    public final void m37996X0(List<C10641x> list, Set<C10641x> set) {
        Set m38917d;
        C9768m.m32346f(list, "descriptors");
        C9768m.m32346f(set, "friends");
        List m38888j = C10784u.m38888j();
        m38917d = C10789w0.m38917d();
        m37997Y0(new C10640w(list, set, m38888j, m38917d));
    }

    /* renamed from: Y0 */
    public final void m37997Y0(InterfaceC10639v interfaceC10639v) {
        C9768m.m32346f(interfaceC10639v, "dependencies");
        InterfaceC10639v interfaceC10639v2 = this.f41113m;
        this.f41113m = interfaceC10639v;
    }

    /* renamed from: Z0 */
    public final void m37998Z0(C10641x... c10641xArr) {
        List<C10641x> m38746Z;
        C9768m.m32346f(c10641xArr, "descriptors");
        m38746Z = C10770n.m38746Z(c10641xArr);
        m37995W0(m38746Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        return InterfaceC10559g0.a.m37690b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: e0 */
    public boolean mo37020e0(InterfaceC10559g0 interfaceC10559g0) {
        boolean m38577K;
        C9768m.m32346f(interfaceC10559g0, "targetModule");
        if (C9768m.m32341a(this, interfaceC10559g0)) {
            return true;
        }
        InterfaceC10639v interfaceC10639v = this.f41113m;
        C9768m.m32343c(interfaceC10639v);
        m38577K = C10749c0.m38577K(interfaceC10639v.mo37980b(), interfaceC10559g0);
        return m38577K || mo37023t0().contains(interfaceC10559g0) || interfaceC10559g0.mo37023t0().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: o */
    public AbstractC9881h mo37021o() {
        return this.f41109i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: p */
    public Collection<C10127c> mo37022p(C10127c c10127c, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10127c, "fqName");
        C9768m.m32346f(function1, "nameFilter");
        m37991P0();
        return m37992R0().mo33280p(c10127c, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0
    /* renamed from: t0 */
    public List<InterfaceC10559g0> mo37023t0() {
        InterfaceC10639v interfaceC10639v = this.f41113m;
        if (interfaceC10639v != null) {
            return interfaceC10639v.mo37981c();
        }
        throw new AssertionError("Dependencies of module " + m37988Q0() + " were not set");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10641x(C10130f c10130f, InterfaceC10297n interfaceC10297n, AbstractC9881h abstractC9881h, C10136a c10136a, Map<C10556f0<?>, ? extends Object> map, C10130f c10130f2) {
        super(InterfaceC10587g.f40808c.m37735b(), c10130f);
        Lazy m37594b;
        C9768m.m32346f(c10130f, "moduleName");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(abstractC9881h, "builtIns");
        C9768m.m32346f(map, "capabilities");
        this.f41108h = interfaceC10297n;
        this.f41109i = abstractC9881h;
        this.f41110j = c10130f2;
        if (c10130f.m35458y()) {
            this.f41111k = map;
            InterfaceC10605a0 interfaceC10605a0 = (InterfaceC10605a0) mo37016I0(InterfaceC10605a0.f40902a.m37759a());
            this.f41112l = interfaceC10605a0 == null ? InterfaceC10605a0.b.f40905b : interfaceC10605a0;
            this.f41115o = true;
            this.f41116p = interfaceC10297n.mo36520h(new b());
            m37594b = C10517i.m37594b(new a());
            this.f41117q = m37594b;
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + c10130f);
    }
}
