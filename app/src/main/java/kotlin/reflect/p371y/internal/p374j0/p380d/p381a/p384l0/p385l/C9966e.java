package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.collections.C10777q0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9897d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9912a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9930a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9948g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9978d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9983a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10003m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10005o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9990c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9994e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9998h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10171a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10179h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10188q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10190s;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e */
/* loaded from: classes2.dex */
public final class C9966e implements InterfaceC10583c, InterfaceC9948g {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f38025a = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9966e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9966e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9966e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: b */
    private final C9957g f38026b;

    /* renamed from: c */
    private final InterfaceC9986a f38027c;

    /* renamed from: d */
    private final InterfaceC10293j f38028d;

    /* renamed from: e */
    private final InterfaceC10292i f38029e;

    /* renamed from: f */
    private final InterfaceC9983a f38030f;

    /* renamed from: g */
    private final InterfaceC10292i f38031g;

    /* renamed from: h */
    private final boolean f38032h;

    /* renamed from: i */
    private final boolean f38033i;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e$a */
    static final class a extends Lambda implements Function0<Map<C10130f, ? extends AbstractC10178g<?>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10130f, AbstractC10178g<?>> invoke() {
            Map<C10130f, AbstractC10178g<?>> m38805q;
            Collection<InterfaceC9988b> mo33570b = C9966e.this.f38027c.mo33570b();
            C9966e c9966e = C9966e.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC9988b interfaceC9988b : mo33570b) {
                C10130f name = interfaceC9988b.getName();
                if (name == null) {
                    name = C9912a0.f37788c;
                }
                AbstractC10178g m33326l = c9966e.m33326l(interfaceC9988b);
                Pair m38547a = m33326l != null ? C10740s.m38547a(name, m33326l) : null;
                if (m38547a != null) {
                    arrayList.add(m38547a);
                }
            }
            m38805q = C10777q0.m38805q(arrayList);
            return m38805q;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e$b */
    static final class b extends Lambda implements Function0<C10127c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10127c invoke() {
            C10126b mo33571e = C9966e.this.f38027c.mo33571e();
            if (mo33571e != null) {
                return mo33571e.m35409b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e$c */
    static final class c extends Lambda implements Function0<AbstractC10335m0> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke() {
            C10127c mo33162d = C9966e.this.mo33162d();
            if (mo33162d == null) {
                return C10394k.m37053d(EnumC10393j.f40285I0, C9966e.this.f38027c.toString());
            }
            InterfaceC10552e m32936f = C9897d.m32936f(C9897d.f37687a, mo33162d, C9966e.this.f38026b.m33285d().mo37021o(), null, 4, null);
            if (m32936f == null) {
                InterfaceC9997g mo33574z = C9966e.this.f38027c.mo33574z();
                m32936f = mo33574z != null ? C9966e.this.f38026b.m33282a().m33254n().mo33295a(mo33574z) : null;
                if (m32936f == null) {
                    m32936f = C9966e.this.m33325h(mo33162d);
                }
            }
            return m32936f.mo36400s();
        }
    }

    public C9966e(C9957g c9957g, InterfaceC9986a interfaceC9986a, boolean z) {
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC9986a, "javaAnnotation");
        this.f38026b = c9957g;
        this.f38027c = interfaceC9986a;
        this.f38028d = c9957g.m33286e().mo36518f(new b());
        this.f38029e = c9957g.m33286e().mo36516d(new c());
        this.f38030f = c9957g.m33282a().m33260t().mo33569a(interfaceC9986a);
        this.f38031g = c9957g.m33286e().mo36516d(new a());
        this.f38032h = interfaceC9986a.mo33572g();
        this.f38033i = interfaceC9986a.mo33573v() || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final InterfaceC10552e m33325h(C10127c c10127c) {
        InterfaceC10559g0 m33285d = this.f38026b.m33285d();
        C10126b m35408m = C10126b.m35408m(c10127c);
        C9768m.m32345e(m35408m, "topLevel(fqName)");
        return C10703x.m38151c(m33285d, m35408m, this.f38026b.m33282a().m33242b().m33971d().m36432q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final AbstractC10178g<?> m33326l(InterfaceC9988b interfaceC9988b) {
        if (interfaceC9988b instanceof InterfaceC10005o) {
            return C10179h.f39560a.m36026c(((InterfaceC10005o) interfaceC9988b).getValue());
        }
        if (interfaceC9988b instanceof InterfaceC10003m) {
            InterfaceC10003m interfaceC10003m = (InterfaceC10003m) interfaceC9988b;
            return m33329o(interfaceC10003m.mo33611b(), interfaceC10003m.mo33612d());
        }
        if (!(interfaceC9988b instanceof InterfaceC9994e)) {
            if (interfaceC9988b instanceof InterfaceC9990c) {
                return m33327m(((InterfaceC9990c) interfaceC9988b).mo33579a());
            }
            if (interfaceC9988b instanceof InterfaceC9998h) {
                return m33330p(((InterfaceC9998h) interfaceC9988b).mo33604c());
            }
            return null;
        }
        InterfaceC9994e interfaceC9994e = (InterfaceC9994e) interfaceC9988b;
        C10130f name = interfaceC9994e.getName();
        if (name == null) {
            name = C9912a0.f37788c;
        }
        C9768m.m32345e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
        return m33328n(name, interfaceC9994e.mo33585e());
    }

    /* renamed from: m */
    private final AbstractC10178g<?> m33327m(InterfaceC9986a interfaceC9986a) {
        return new C10171a(new C9966e(this.f38026b, interfaceC9986a, false, 4, null));
    }

    /* renamed from: n */
    private final AbstractC10178g<?> m33328n(C10130f c10130f, List<? extends InterfaceC9988b> list) {
        AbstractC10311e0 m32794l;
        AbstractC10335m0 type = getType();
        C9768m.m32345e(type, "type");
        if (C10317g0.m36706a(type)) {
            return null;
        }
        InterfaceC10552e m36071e = C10202a.m36071e(this);
        C9768m.m32343c(m36071e);
        InterfaceC10566i1 m33149b = C9930a.m33149b(c10130f, m36071e);
        if (m33149b == null || (m32794l = m33149b.getType()) == null) {
            m32794l = this.f38026b.m33282a().m33253m().mo37021o().m32794l(EnumC10351r1.INVARIANT, C10394k.m37053d(EnumC10393j.f40283H0, new String[0]));
        }
        C9768m.m32345e(m32794l, "DescriptorResolverUtils.…GUMENT)\n                )");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC10178g<?> m33326l = m33326l((InterfaceC9988b) it.next());
            if (m33326l == null) {
                m33326l = new C10190s();
            }
            arrayList.add(m33326l);
        }
        return C10179h.f39560a.m36025b(arrayList, m32794l);
    }

    /* renamed from: o */
    private final AbstractC10178g<?> m33329o(C10126b c10126b, C10130f c10130f) {
        if (c10126b == null || c10130f == null) {
            return null;
        }
        return new C10181j(c10126b, c10130f);
    }

    /* renamed from: p */
    private final AbstractC10178g<?> m33330p(InterfaceC10014x interfaceC10014x) {
        return C10188q.f39582b.m36053a(this.f38026b.m33288g().m33525o(interfaceC10014x, C9978d.m33530d(EnumC9940k.COMMON, false, null, 3, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: a */
    public Map<C10130f, AbstractC10178g<?>> mo33159a() {
        return (Map) C10296m.m36555a(this.f38031g, this, f38025a[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: d */
    public C10127c mo33162d() {
        return (C10127c) C10296m.m36556b(this.f38028d, this, f38025a[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9948g
    /* renamed from: g */
    public boolean mo33163g() {
        return this.f38032h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC9983a mo33164t() {
        return this.f38030f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 getType() {
        return (AbstractC10335m0) C10296m.m36555a(this.f38029e, this, f38025a[1]);
    }

    /* renamed from: k */
    public final boolean m33333k() {
        return this.f38033i;
    }

    public String toString() {
        return AbstractC10139c.m35499s(AbstractC10139c.f39377g, this, null, 2, null);
    }

    public /* synthetic */ C9966e(C9957g c9957g, InterfaceC9986a interfaceC9986a, boolean z, int i2, C9756g c9756g) {
        this(c9957g, interfaceC9986a, (i2 & 4) != 0 ? false : z);
    }
}
