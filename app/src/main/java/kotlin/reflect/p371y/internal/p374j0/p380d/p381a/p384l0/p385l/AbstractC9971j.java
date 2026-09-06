package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10609c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10627l0;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9928i0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9946e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9947f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9951a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9955e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9975a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9978d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10015y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9996f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10162l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10213c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;

/* compiled from: LazyJavaScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j */
/* loaded from: classes2.dex */
public abstract class AbstractC9971j extends AbstractC10219i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f38105b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(AbstractC9971j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(AbstractC9971j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(AbstractC9971j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c */
    private final C9957g f38106c;

    /* renamed from: d */
    private final AbstractC9971j f38107d;

    /* renamed from: e */
    private final InterfaceC10292i<Collection<InterfaceC10576m>> f38108e;

    /* renamed from: f */
    private final InterfaceC10292i<InterfaceC9963b> f38109f;

    /* renamed from: g */
    private final InterfaceC10290g<C10130f, Collection<InterfaceC10706y0>> f38110g;

    /* renamed from: h */
    private final InterfaceC10291h<C10130f, InterfaceC10696t0> f38111h;

    /* renamed from: i */
    private final InterfaceC10290g<C10130f, Collection<InterfaceC10706y0>> f38112i;

    /* renamed from: j */
    private final InterfaceC10292i f38113j;

    /* renamed from: k */
    private final InterfaceC10292i f38114k;

    /* renamed from: l */
    private final InterfaceC10292i f38115l;

    /* renamed from: m */
    private final InterfaceC10290g<C10130f, List<InterfaceC10696t0>> f38116m;

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$a */
    protected static final class a {

        /* renamed from: a */
        private final AbstractC10311e0 f38117a;

        /* renamed from: b */
        private final AbstractC10311e0 f38118b;

        /* renamed from: c */
        private final List<InterfaceC10566i1> f38119c;

        /* renamed from: d */
        private final List<InterfaceC10554e1> f38120d;

        /* renamed from: e */
        private final boolean f38121e;

        /* renamed from: f */
        private final List<String> f38122f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02, List<? extends InterfaceC10566i1> list, List<? extends InterfaceC10554e1> list2, boolean z, List<String> list3) {
            C9768m.m32346f(abstractC10311e0, "returnType");
            C9768m.m32346f(list, "valueParameters");
            C9768m.m32346f(list2, "typeParameters");
            C9768m.m32346f(list3, "errors");
            this.f38117a = abstractC10311e0;
            this.f38118b = abstractC10311e02;
            this.f38119c = list;
            this.f38120d = list2;
            this.f38121e = z;
            this.f38122f = list3;
        }

        /* renamed from: a */
        public final List<String> m33463a() {
            return this.f38122f;
        }

        /* renamed from: b */
        public final boolean m33464b() {
            return this.f38121e;
        }

        /* renamed from: c */
        public final AbstractC10311e0 m33465c() {
            return this.f38118b;
        }

        /* renamed from: d */
        public final AbstractC10311e0 m33466d() {
            return this.f38117a;
        }

        /* renamed from: e */
        public final List<InterfaceC10554e1> m33467e() {
            return this.f38120d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9768m.m32341a(this.f38117a, aVar.f38117a) && C9768m.m32341a(this.f38118b, aVar.f38118b) && C9768m.m32341a(this.f38119c, aVar.f38119c) && C9768m.m32341a(this.f38120d, aVar.f38120d) && this.f38121e == aVar.f38121e && C9768m.m32341a(this.f38122f, aVar.f38122f);
        }

        /* renamed from: f */
        public final List<InterfaceC10566i1> m33468f() {
            return this.f38119c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f38117a.hashCode() * 31;
            AbstractC10311e0 abstractC10311e0 = this.f38118b;
            int hashCode2 = (((((hashCode + (abstractC10311e0 == null ? 0 : abstractC10311e0.hashCode())) * 31) + this.f38119c.hashCode()) * 31) + this.f38120d.hashCode()) * 31;
            boolean z = this.f38121e;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return ((hashCode2 + i2) * 31) + this.f38122f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f38117a + ", receiverType=" + this.f38118b + ", valueParameters=" + this.f38119c + ", typeParameters=" + this.f38120d + ", hasStableParameterNames=" + this.f38121e + ", errors=" + this.f38122f + ')';
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$b */
    protected static final class b {

        /* renamed from: a */
        private final List<InterfaceC10566i1> f38123a;

        /* renamed from: b */
        private final boolean f38124b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends InterfaceC10566i1> list, boolean z) {
            C9768m.m32346f(list, "descriptors");
            this.f38123a = list;
            this.f38124b = z;
        }

        /* renamed from: a */
        public final List<InterfaceC10566i1> m33469a() {
            return this.f38123a;
        }

        /* renamed from: b */
        public final boolean m33470b() {
            return this.f38124b;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$c */
    static final class c extends Lambda implements Function0<Collection<? extends InterfaceC10576m>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10576m> invoke() {
            return AbstractC9971j.this.m33458m(C10214d.f39642m, InterfaceC10218h.f39667a.m36159a());
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$d */
    static final class d extends Lambda implements Function0<Set<? extends C10130f>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10130f> invoke() {
            return AbstractC9971j.this.mo33404l(C10214d.f39647r, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$e */
    static final class e extends Lambda implements Function1<C10130f, InterfaceC10696t0> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10696t0 invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            if (AbstractC9971j.this.m33455B() != null) {
                return (InterfaceC10696t0) AbstractC9971j.this.m33455B().f38111h.invoke(c10130f);
            }
            InterfaceC10004n mo33301c = AbstractC9971j.this.m33462y().invoke().mo33301c(c10130f);
            if (mo33301c == null || mo33301c.mo33613G()) {
                return null;
            }
            return AbstractC9971j.this.m33447J(mo33301c);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$f */
    static final class f extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            if (AbstractC9971j.this.m33455B() != null) {
                return (Collection) AbstractC9971j.this.m33455B().f38110g.invoke(c10130f);
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC10008r interfaceC10008r : AbstractC9971j.this.m33462y().invoke().mo33304f(c10130f)) {
                C9946e m33456I = AbstractC9971j.this.m33456I(interfaceC10008r);
                if (AbstractC9971j.this.mo33400G(m33456I)) {
                    AbstractC9971j.this.m33461w().m33282a().m33248h().mo33182e(interfaceC10008r, m33456I);
                    arrayList.add(m33456I);
                }
            }
            AbstractC9971j.this.mo33406o(arrayList, c10130f);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$g */
    static final class g extends Lambda implements Function0<InterfaceC9963b> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9963b invoke() {
            return AbstractC9971j.this.mo33407p();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$h */
    static final class h extends Lambda implements Function0<Set<? extends C10130f>> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10130f> invoke() {
            return AbstractC9971j.this.mo33405n(C10214d.f39649t, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$i */
    static final class i extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) AbstractC9971j.this.f38110g.invoke(c10130f));
            AbstractC9971j.this.m33448L(linkedHashSet);
            AbstractC9971j.this.mo33408r(linkedHashSet, c10130f);
            return C10749c0.m38569E0(AbstractC9971j.this.m33461w().m33282a().m33258r().m33745g(AbstractC9971j.this.m33461w(), linkedHashSet));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$j */
    static final class j extends Lambda implements Function1<C10130f, List<? extends InterfaceC10696t0>> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC10696t0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            ArrayList arrayList = new ArrayList();
            C10734a.m38508a(arrayList, AbstractC9971j.this.f38111h.invoke(c10130f));
            AbstractC9971j.this.mo33409s(c10130f, arrayList);
            return C10154d.m35832t(AbstractC9971j.this.mo33398C()) ? C10749c0.m38569E0(arrayList) : C10749c0.m38569E0(AbstractC9971j.this.m33461w().m33282a().m33258r().m33745g(AbstractC9971j.this.m33461w(), arrayList));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$k */
    static final class k extends Lambda implements Function0<Set<? extends C10130f>> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10130f> invoke() {
            return AbstractC9971j.this.mo33410t(C10214d.f39650u, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$l */
    static final class l extends Lambda implements Function0<InterfaceC10293j<? extends AbstractC10178g<?>>> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10004n f38135g;

        /* renamed from: h */
        final /* synthetic */ C10609c0 f38136h;

        /* compiled from: LazyJavaScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$l$a */
        static final class a extends Lambda implements Function0<AbstractC10178g<?>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC9971j f38137f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC10004n f38138g;

            /* renamed from: h */
            final /* synthetic */ C10609c0 f38139h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC9971j abstractC9971j, InterfaceC10004n interfaceC10004n, C10609c0 c10609c0) {
                super(0);
                this.f38137f = abstractC9971j;
                this.f38138g = interfaceC10004n;
                this.f38139h = c10609c0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10178g<?> invoke() {
                return this.f38137f.m33461w().m33282a().m33247g().mo33177a(this.f38138g, this.f38139h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC10004n interfaceC10004n, C10609c0 c10609c0) {
            super(0);
            this.f38135g = interfaceC10004n;
            this.f38136h = c10609c0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10293j<AbstractC10178g<?>> invoke() {
            return AbstractC9971j.this.m33461w().m33286e().mo36518f(new a(AbstractC9971j.this, this.f38135g, this.f38136h));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$m */
    static final class m extends Lambda implements Function1<InterfaceC10706y0, InterfaceC10540a> {

        /* renamed from: f */
        public static final m f38140f = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10540a invoke(InterfaceC10706y0 interfaceC10706y0) {
            C9768m.m32346f(interfaceC10706y0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10706y0;
        }
    }

    public /* synthetic */ AbstractC9971j(C9957g c9957g, AbstractC9971j abstractC9971j, int i2, C9756g c9756g) {
        this(c9957g, (i2 & 2) != 0 ? null : abstractC9971j);
    }

    /* renamed from: A */
    private final Set<C10130f> m33443A() {
        return (Set) C10296m.m36555a(this.f38113j, this, f38105b[0]);
    }

    /* renamed from: D */
    private final Set<C10130f> m33444D() {
        return (Set) C10296m.m36555a(this.f38114k, this, f38105b[1]);
    }

    /* renamed from: E */
    private final AbstractC10311e0 m33445E(InterfaceC10004n interfaceC10004n) {
        boolean z = false;
        AbstractC10311e0 m33525o = this.f38106c.m33288g().m33525o(interfaceC10004n.getType(), C9978d.m33530d(EnumC9940k.COMMON, false, null, 3, null));
        if ((AbstractC9881h.m32757r0(m33525o) || AbstractC9881h.m32760u0(m33525o)) && m33446F(interfaceC10004n) && interfaceC10004n.mo33614O()) {
            z = true;
        }
        if (!z) {
            return m33525o;
        }
        AbstractC10311e0 m36781n = C10339n1.m36781n(m33525o);
        C9768m.m32345e(m36781n, "makeNotNullable(propertyType)");
        return m36781n;
    }

    /* renamed from: F */
    private final boolean m33446F(InterfaceC10004n interfaceC10004n) {
        return interfaceC10004n.isFinal() && interfaceC10004n.mo33623Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final InterfaceC10696t0 m33447J(InterfaceC10004n interfaceC10004n) {
        C10609c0 m33453u = m33453u(interfaceC10004n);
        m33453u.m37790W0(null, null, null, null);
        m33453u.m37794c1(m33445E(interfaceC10004n), C10784u.m38888j(), mo33413z(), null, C10784u.m38888j());
        if (C10154d.m35810K(m33453u, m33453u.getType())) {
            m33453u.m37910M0(new l(interfaceC10004n, m33453u));
        }
        this.f38106c.m33282a().m33248h().mo33181d(interfaceC10004n, m33453u);
        return m33453u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m33448L(Set<InterfaceC10706y0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String m34039c = C10073v.m34039c((InterfaceC10706y0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(m34039c);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m34039c, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends InterfaceC10706y0> m35986a = C10162l.m35986a(list, m.f38140f);
                set.removeAll(list);
                set.addAll(m35986a);
            }
        }
    }

    /* renamed from: u */
    private final C10609c0 m33453u(InterfaceC10004n interfaceC10004n) {
        C9947f m33220g1 = C9947f.m33220g1(mo33398C(), C9955e.m33273a(this.f38106c, interfaceC10004n), EnumC10550d0.FINAL, C9928i0.m33146c(interfaceC10004n.getVisibility()), !interfaceC10004n.isFinal(), interfaceC10004n.getName(), this.f38106c.m33282a().m33260t().mo33569a(interfaceC10004n), m33446F(interfaceC10004n));
        C9768m.m32345e(m33220g1, "create(\n            owne…d.isFinalStatic\n        )");
        return m33220g1;
    }

    /* renamed from: x */
    private final Set<C10130f> m33454x() {
        return (Set) C10296m.m36555a(this.f38115l, this, f38105b[2]);
    }

    /* renamed from: B */
    protected final AbstractC9971j m33455B() {
        return this.f38107d;
    }

    /* renamed from: C */
    protected abstract InterfaceC10576m mo33398C();

    /* renamed from: G */
    protected boolean mo33400G(C9946e c9946e) {
        C9768m.m32346f(c9946e, "<this>");
        return true;
    }

    /* renamed from: H */
    protected abstract a mo33401H(InterfaceC10008r interfaceC10008r, List<? extends InterfaceC10554e1> list, AbstractC10311e0 abstractC10311e0, List<? extends InterfaceC10566i1> list2);

    /* renamed from: I */
    protected final C9946e m33456I(InterfaceC10008r interfaceC10008r) {
        C9768m.m32346f(interfaceC10008r, "method");
        C9946e m33212q1 = C9946e.m33212q1(mo33398C(), C9955e.m33273a(this.f38106c, interfaceC10008r), interfaceC10008r.getName(), this.f38106c.m33282a().m33260t().mo33569a(interfaceC10008r), this.f38109f.invoke().mo33300b(interfaceC10008r.getName()) != null && interfaceC10008r.mo33620f().isEmpty());
        C9768m.m32345e(m33212q1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        C9957g m33235f = C9951a.m33235f(this.f38106c, m33212q1, interfaceC10008r, 0, 4, null);
        List<InterfaceC10015y> typeParameters = interfaceC10008r.getTypeParameters();
        List<? extends InterfaceC10554e1> arrayList = new ArrayList<>(C10786v.m38911u(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC10554e1 mo33293a = m33235f.m33287f().mo33293a((InterfaceC10015y) it.next());
            C9768m.m32343c(mo33293a);
            arrayList.add(mo33293a);
        }
        b m33457K = m33457K(m33235f, m33212q1, interfaceC10008r.mo33620f());
        a mo33401H = mo33401H(interfaceC10008r, arrayList, m33459q(interfaceC10008r, m33235f), m33457K.m33469a());
        AbstractC10311e0 m33465c = mo33401H.m33465c();
        m33212q1.mo33214p1(m33465c != null ? C10153c.m35790h(m33212q1, m33465c, InterfaceC10587g.f40808c.m37735b()) : null, mo33413z(), C10784u.m38888j(), mo33401H.m33467e(), mo33401H.m33468f(), mo33401H.m33466d(), EnumC10550d0.f40738f.m37676a(false, interfaceC10008r.isAbstract(), !interfaceC10008r.isFinal()), C9928i0.m33146c(interfaceC10008r.getVisibility()), mo33401H.m33465c() != null ? C10775p0.m38794f(C10740s.m38547a(C9946e.f37942J, C10780s.m38830U(m33457K.m33469a()))) : C10777q0.m38797i());
        m33212q1.m33217t1(mo33401H.m33464b(), m33457K.m33470b());
        if (!mo33401H.m33463a().isEmpty()) {
            m33235f.m33282a().m33259s().mo33187b(m33212q1, mo33401H.m33463a());
        }
        return m33212q1;
    }

    /* renamed from: K */
    protected final b m33457K(C9957g c9957g, InterfaceC10705y interfaceC10705y, List<? extends InterfaceC9989b0> list) {
        Iterable<IndexedValue> m38578K0;
        Pair m38547a;
        C10130f name;
        C9957g c9957g2 = c9957g;
        C9768m.m32346f(c9957g2, "c");
        C9768m.m32346f(interfaceC10705y, "function");
        C9768m.m32346f(list, "jValueParameters");
        m38578K0 = C10749c0.m38578K0(list);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38578K0, 10));
        boolean z = false;
        boolean z2 = false;
        for (IndexedValue indexedValue : m38578K0) {
            int index = indexedValue.getIndex();
            InterfaceC9989b0 interfaceC9989b0 = (InterfaceC9989b0) indexedValue.m38648b();
            InterfaceC10587g m33273a = C9955e.m33273a(c9957g2, interfaceC9989b0);
            C9975a m33530d = C9978d.m33530d(EnumC9940k.COMMON, z, null, 3, null);
            if (interfaceC9989b0.mo33578h()) {
                InterfaceC10014x type = interfaceC9989b0.getType();
                InterfaceC9996f interfaceC9996f = type instanceof InterfaceC9996f ? (InterfaceC9996f) type : null;
                if (interfaceC9996f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC9989b0);
                }
                AbstractC10311e0 m33524k = c9957g.m33288g().m33524k(interfaceC9996f, m33530d, true);
                m38547a = C10740s.m38547a(m33524k, c9957g.m33285d().mo37021o().m32793k(m33524k));
            } else {
                m38547a = C10740s.m38547a(c9957g.m33288g().m33525o(interfaceC9989b0.getType(), m33530d), null);
            }
            AbstractC10311e0 abstractC10311e0 = (AbstractC10311e0) m38547a.m37646a();
            AbstractC10311e0 abstractC10311e02 = (AbstractC10311e0) m38547a.m37647b();
            if (C9768m.m32341a(interfaceC10705y.getName().m35455k(), "equals") && list.size() == 1 && C9768m.m32341a(c9957g.m33285d().mo37021o().m32774I(), abstractC10311e0)) {
                name = C10130f.m35454x("other");
            } else {
                name = interfaceC9989b0.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('p');
                    sb.append(index);
                    name = C10130f.m35454x(sb.toString());
                    C9768m.m32345e(name, "identifier(\"p$index\")");
                }
            }
            C10130f c10130f = name;
            C9768m.m32345e(c10130f, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C10627l0(interfaceC10705y, null, index, m33273a, c10130f, abstractC10311e0, false, false, false, abstractC10311e02, c9957g.m33282a().m33260t().mo33569a(interfaceC9989b0)));
            arrayList = arrayList2;
            z2 = z2;
            z = false;
            c9957g2 = c9957g;
        }
        return new b(C10749c0.m38569E0(arrayList), z2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return !mo33312b().contains(c10130f) ? C10784u.m38888j() : this.f38112i.invoke(c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        return m33443A();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return !mo33314d().contains(c10130f) ? C10784u.m38888j() : this.f38116m.invoke(c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        return m33444D();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        return m33454x();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        return this.f38108e.invoke();
    }

    /* renamed from: l */
    protected abstract Set<C10130f> mo33404l(C10214d c10214d, Function1<? super C10130f, Boolean> function1);

    /* renamed from: m */
    protected final List<InterfaceC10576m> m33458m(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        EnumC9908d enumC9908d = EnumC9908d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c10214d.m36137a(C10214d.f39630a.m36144c())) {
            for (C10130f c10130f : mo33404l(c10214d, function1)) {
                if (function1.invoke(c10130f).booleanValue()) {
                    C10734a.m38508a(linkedHashSet, mo33316f(c10130f, enumC9908d));
                }
            }
        }
        if (c10214d.m36137a(C10214d.f39630a.m36145d()) && !c10214d.m36138l().contains(AbstractC10213c.a.f39627a)) {
            for (C10130f c10130f2 : mo33405n(c10214d, function1)) {
                if (function1.invoke(c10130f2).booleanValue()) {
                    linkedHashSet.addAll(mo33311a(c10130f2, enumC9908d));
                }
            }
        }
        if (c10214d.m36137a(C10214d.f39630a.m36150i()) && !c10214d.m36138l().contains(AbstractC10213c.a.f39627a)) {
            for (C10130f c10130f3 : mo33410t(c10214d, function1)) {
                if (function1.invoke(c10130f3).booleanValue()) {
                    linkedHashSet.addAll(mo33313c(c10130f3, enumC9908d));
                }
            }
        }
        return C10749c0.m38569E0(linkedHashSet);
    }

    /* renamed from: n */
    protected abstract Set<C10130f> mo33405n(C10214d c10214d, Function1<? super C10130f, Boolean> function1);

    /* renamed from: o */
    protected void mo33406o(Collection<InterfaceC10706y0> collection, C10130f c10130f) {
        C9768m.m32346f(collection, "result");
        C9768m.m32346f(c10130f, "name");
    }

    /* renamed from: p */
    protected abstract InterfaceC9963b mo33407p();

    /* renamed from: q */
    protected final AbstractC10311e0 m33459q(InterfaceC10008r interfaceC10008r, C9957g c9957g) {
        C9768m.m32346f(interfaceC10008r, "method");
        C9768m.m32346f(c9957g, "c");
        return c9957g.m33288g().m33525o(interfaceC10008r.getReturnType(), C9978d.m33530d(EnumC9940k.COMMON, interfaceC10008r.mo33618P().mo33601r(), null, 2, null));
    }

    /* renamed from: r */
    protected abstract void mo33408r(Collection<InterfaceC10706y0> collection, C10130f c10130f);

    /* renamed from: s */
    protected abstract void mo33409s(C10130f c10130f, Collection<InterfaceC10696t0> collection);

    /* renamed from: t */
    protected abstract Set<C10130f> mo33410t(C10214d c10214d, Function1<? super C10130f, Boolean> function1);

    public String toString() {
        return "Lazy scope for " + mo33398C();
    }

    /* renamed from: v */
    protected final InterfaceC10292i<Collection<InterfaceC10576m>> m33460v() {
        return this.f38108e;
    }

    /* renamed from: w */
    protected final C9957g m33461w() {
        return this.f38106c;
    }

    /* renamed from: y */
    protected final InterfaceC10292i<InterfaceC9963b> m33462y() {
        return this.f38109f;
    }

    /* renamed from: z */
    protected abstract InterfaceC10702w0 mo33413z();

    public AbstractC9971j(C9957g c9957g, AbstractC9971j abstractC9971j) {
        C9768m.m32346f(c9957g, "c");
        this.f38106c = c9957g;
        this.f38107d = abstractC9971j;
        this.f38108e = c9957g.m33286e().mo36515c(new c(), C10784u.m38888j());
        this.f38109f = c9957g.m33286e().mo36516d(new g());
        this.f38110g = c9957g.m33286e().mo36520h(new f());
        this.f38111h = c9957g.m33286e().mo36521i(new e());
        this.f38112i = c9957g.m33286e().mo36520h(new i());
        this.f38113j = c9957g.m33286e().mo36516d(new h());
        this.f38114k = c9957g.m33286e().mo36516d(new k());
        this.f38115l = c9957g.m33286e().mo36516d(new d());
        this.f38116m = c9957g.m33286e().mo36520h(new j());
    }
}
