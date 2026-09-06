package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10742u;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10789w0;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10735b;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9930a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9949h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10007q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: LazyJavaStaticClassScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k */
/* loaded from: classes2.dex */
public final class C9972k extends AbstractC9973l {

    /* renamed from: n */
    private final InterfaceC9997g f38141n;

    /* renamed from: o */
    private final C9967f f38142o;

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$a */
    static final class a extends Lambda implements Function1<InterfaceC10007q, Boolean> {

        /* renamed from: f */
        public static final a f38143f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10007q interfaceC10007q) {
            C9768m.m32346f(interfaceC10007q, "it");
            return Boolean.valueOf(interfaceC10007q.mo33623Q());
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$b */
    static final class b extends Lambda implements Function1<InterfaceC10218h, Collection<? extends InterfaceC10696t0>> {

        /* renamed from: f */
        final /* synthetic */ C10130f f38144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10130f c10130f) {
            super(1);
            this.f38144f = c10130f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<? extends InterfaceC10696t0> invoke(InterfaceC10218h interfaceC10218h) {
            C9768m.m32346f(interfaceC10218h, "it");
            return interfaceC10218h.mo33313c(this.f38144f, EnumC9908d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$c */
    static final class c extends Lambda implements Function1<InterfaceC10218h, Collection<? extends C10130f>> {

        /* renamed from: f */
        public static final c f38145f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<C10130f> invoke(InterfaceC10218h interfaceC10218h) {
            C9768m.m32346f(interfaceC10218h, "it");
            return interfaceC10218h.mo33314d();
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$d */
    static final class d<N> implements C10735b.c {

        /* renamed from: a */
        public static final d<N> f38146a = new d<>();

        /* compiled from: LazyJavaStaticClassScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$d$a */
        static final class a extends Lambda implements Function1<AbstractC10311e0, InterfaceC10552e> {

            /* renamed from: f */
            public static final a f38147f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10552e invoke(AbstractC10311e0 abstractC10311e0) {
                InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
                if (mo32891w instanceof InterfaceC10552e) {
                    return (InterfaceC10552e) mo32891w;
                }
                return null;
            }
        }

        d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10552e> mo32992a(InterfaceC10552e interfaceC10552e) {
            Sequence m38575J;
            Sequence m37392v;
            Iterable<InterfaceC10552e> m37379i;
            Collection<AbstractC10311e0> mo35998a = interfaceC10552e.mo32877h().mo35998a();
            C9768m.m32345e(mo35998a, "it.typeConstructor.supertypes");
            m38575J = C10749c0.m38575J(mo35998a);
            m37392v = C10489n.m37392v(m38575J, a.f38147f);
            m37379i = C10489n.m37379i(m37392v);
            return m37379i;
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$e */
    public static final class e extends C10735b.b<InterfaceC10552e, C10742u> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10552e f38148a;

        /* renamed from: b */
        final /* synthetic */ Set<R> f38149b;

        /* renamed from: c */
        final /* synthetic */ Function1<InterfaceC10218h, Collection<R>> f38150c;

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC10552e interfaceC10552e, Set<R> set, Function1<? super InterfaceC10218h, ? extends Collection<? extends R>> function1) {
            this.f38148a = interfaceC10552e;
            this.f38149b = set;
            this.f38150c = function1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo32994a() {
            m33494e();
            return C10742u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo32995c(InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "current");
            if (interfaceC10552e == this.f38148a) {
                return true;
            }
            InterfaceC10218h mo32866S = interfaceC10552e.mo32866S();
            C9768m.m32345e(mo32866S, "current.staticScope");
            if (!(mo32866S instanceof AbstractC9973l)) {
                return true;
            }
            this.f38149b.addAll((Collection) this.f38150c.invoke(mo32866S));
            return false;
        }

        /* renamed from: e */
        public void m33494e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9972k(C9957g c9957g, InterfaceC9997g interfaceC9997g, C9967f c9967f) {
        super(c9957g);
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC9997g, "jClass");
        C9768m.m32346f(c9967f, "ownerDescriptor");
        this.f38141n = interfaceC9997g;
        this.f38142o = c9967f;
    }

    /* renamed from: N */
    private final <R> Set<R> m33483N(InterfaceC10552e interfaceC10552e, Set<R> set, Function1<? super InterfaceC10218h, ? extends Collection<? extends R>> function1) {
        C10735b.m38516b(C10782t.m38883e(interfaceC10552e), d.f38146a, new e(interfaceC10552e, set, function1));
        return set;
    }

    /* renamed from: P */
    private final InterfaceC10696t0 m33484P(InterfaceC10696t0 interfaceC10696t0) {
        List m38579L;
        if (interfaceC10696t0.mo37030i().m37667g()) {
            return interfaceC10696t0;
        }
        Collection<? extends InterfaceC10696t0> mo37027e = interfaceC10696t0.mo37027e();
        C9768m.m32345e(mo37027e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37027e, 10));
        for (InterfaceC10696t0 interfaceC10696t02 : mo37027e) {
            C9768m.m32345e(interfaceC10696t02, "it");
            arrayList.add(m33484P(interfaceC10696t02));
        }
        m38579L = C10749c0.m38579L(arrayList);
        return (InterfaceC10696t0) C10780s.m38866s0(m38579L);
    }

    /* renamed from: Q */
    private final Set<InterfaceC10706y0> m33485Q(C10130f c10130f, InterfaceC10552e interfaceC10552e) {
        Set<InterfaceC10706y0> m38574I0;
        Set<InterfaceC10706y0> m38917d;
        C9972k m33226b = C9949h.m33226b(interfaceC10552e);
        if (m33226b == null) {
            m38917d = C10789w0.m38917d();
            return m38917d;
        }
        m38574I0 = C10749c0.m38574I0(m33226b.mo33311a(c10130f, EnumC9908d.WHEN_GET_SUPER_MEMBERS));
        return m38574I0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C9962a mo33407p() {
        return new C9962a(this.f38141n, a.f38143f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public C9967f mo33398C() {
        return this.f38142o;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: l */
    protected Set<C10130f> mo33404l(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        Set<C10130f> m38917d;
        C9768m.m32346f(c10214d, "kindFilter");
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: n */
    protected Set<C10130f> mo33405n(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        List m38891m;
        C9768m.m32346f(c10214d, "kindFilter");
        Set<C10130f> m38572H0 = C10749c0.m38572H0(m33462y().invoke().mo33299a());
        C9972k m33226b = C9949h.m33226b(mo33398C());
        Set<C10130f> mo33312b = m33226b != null ? m33226b.mo33312b() : null;
        if (mo33312b == null) {
            mo33312b = C10789w0.m38917d();
        }
        m38572H0.addAll(mo33312b);
        if (this.f38141n.mo33588B()) {
            m38891m = C10784u.m38891m(C9884k.f37504e, C9884k.f37503d);
            m38572H0.addAll(m38891m);
        }
        m38572H0.addAll(m33461w().m33282a().m33263w().mo36093a(mo33398C()));
        return m38572H0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: o */
    protected void mo33406o(Collection<InterfaceC10706y0> collection, C10130f c10130f) {
        C9768m.m32346f(collection, "result");
        C9768m.m32346f(c10130f, "name");
        m33461w().m33282a().m33263w().mo36097e(mo33398C(), c10130f, collection);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: r */
    protected void mo33408r(Collection<InterfaceC10706y0> collection, C10130f c10130f) {
        C9768m.m32346f(collection, "result");
        C9768m.m32346f(c10130f, "name");
        Collection<? extends InterfaceC10706y0> m33152e = C9930a.m33152e(c10130f, m33485Q(c10130f, mo33398C()), collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
        C9768m.m32345e(m33152e, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(m33152e);
        if (this.f38141n.mo33588B()) {
            if (C9768m.m32341a(c10130f, C9884k.f37504e)) {
                InterfaceC10706y0 m35788f = C10153c.m35788f(mo33398C());
                C9768m.m32345e(m35788f, "createEnumValueOfMethod(ownerDescriptor)");
                collection.add(m35788f);
            } else if (C9768m.m32341a(c10130f, C9884k.f37503d)) {
                InterfaceC10706y0 m35789g = C10153c.m35789g(mo33398C());
                C9768m.m32345e(m35789g, "createEnumValuesMethod(ownerDescriptor)");
                collection.add(m35789g);
            }
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9973l, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: s */
    protected void mo33409s(C10130f c10130f, Collection<InterfaceC10696t0> collection) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(collection, "result");
        Set m33483N = m33483N(mo33398C(), new LinkedHashSet(), new b(c10130f));
        if (!collection.isEmpty()) {
            Collection<? extends InterfaceC10696t0> m33152e = C9930a.m33152e(c10130f, m33483N, collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
            C9768m.m32345e(m33152e, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(m33152e);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m33483N) {
            InterfaceC10696t0 m33484P = m33484P((InterfaceC10696t0) obj);
            Object obj2 = linkedHashMap.get(m33484P);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m33484P, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Collection m33152e2 = C9930a.m33152e(c10130f, (Collection) ((Map.Entry) it.next()).getValue(), collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
            C9768m.m32345e(m33152e2, "resolveOverridesForStati…ingUtil\n                )");
            C10794z.m38933z(arrayList, m33152e2);
        }
        collection.addAll(arrayList);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: t */
    protected Set<C10130f> mo33410t(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        Set<C10130f> m38572H0 = C10749c0.m38572H0(m33462y().invoke().mo33303e());
        m33483N(mo33398C(), m38572H0, c.f38145f);
        return m38572H0;
    }
}
