package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10791x0;
import kotlin.collections.C10792y;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9815l;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10106r;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10157g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10270m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10281x;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;

/* compiled from: DeserializedMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10258h extends AbstractC10219i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f39819b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(AbstractC10258h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(AbstractC10258h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c */
    private final C10270m f39820c;

    /* renamed from: d */
    private final a f39821d;

    /* renamed from: e */
    private final InterfaceC10292i f39822e;

    /* renamed from: f */
    private final InterfaceC10293j f39823f;

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$a */
    private interface a {
        /* renamed from: a */
        Collection<InterfaceC10706y0> mo36328a(C10130f c10130f, InterfaceC9906b interfaceC9906b);

        /* renamed from: b */
        Set<C10130f> mo36329b();

        /* renamed from: c */
        Collection<InterfaceC10696t0> mo36330c(C10130f c10130f, InterfaceC9906b interfaceC9906b);

        /* renamed from: d */
        Set<C10130f> mo36331d();

        /* renamed from: e */
        Set<C10130f> mo36332e();

        /* renamed from: f */
        void mo36333f(Collection<InterfaceC10576m> collection, C10214d c10214d, Function1<? super C10130f, Boolean> function1, InterfaceC9906b interfaceC9906b);

        /* renamed from: g */
        InterfaceC10551d1 mo36334g(C10130f c10130f);
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b */
    private final class b implements a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f39824a = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: b */
        private final List<C10097i> f39825b;

        /* renamed from: c */
        private final List<C10102n> f39826c;

        /* renamed from: d */
        private final List<C10106r> f39827d;

        /* renamed from: e */
        private final InterfaceC10292i f39828e;

        /* renamed from: f */
        private final InterfaceC10292i f39829f;

        /* renamed from: g */
        private final InterfaceC10292i f39830g;

        /* renamed from: h */
        private final InterfaceC10292i f39831h;

        /* renamed from: i */
        private final InterfaceC10292i f39832i;

        /* renamed from: j */
        private final InterfaceC10292i f39833j;

        /* renamed from: k */
        private final InterfaceC10292i f39834k;

        /* renamed from: l */
        private final InterfaceC10292i f39835l;

        /* renamed from: m */
        private final InterfaceC10292i f39836m;

        /* renamed from: n */
        private final InterfaceC10292i f39837n;

        /* renamed from: o */
        final /* synthetic */ AbstractC10258h f39838o;

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10706y0>> {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10706y0> invoke() {
                return C10749c0.m38609o0(b.this.m36338D(), b.this.m36355t());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$b, reason: collision with other inner class name */
        static final class C11518b extends Lambda implements Function0<List<? extends InterfaceC10696t0>> {
            C11518b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10696t0> invoke() {
                return C10749c0.m38609o0(b.this.m36339E(), b.this.m36356u());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$c */
        static final class c extends Lambda implements Function0<List<? extends InterfaceC10551d1>> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10551d1> invoke() {
                return b.this.m36361z();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$d */
        static final class d extends Lambda implements Function0<List<? extends InterfaceC10706y0>> {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10706y0> invoke() {
                return b.this.m36357v();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$e */
        static final class e extends Lambda implements Function0<List<? extends InterfaceC10696t0>> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10696t0> invoke() {
                return b.this.m36360y();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$f */
        static final class f extends Lambda implements Function0<Set<? extends C10130f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10258h f39845g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(AbstractC10258h abstractC10258h) {
                super(0);
                this.f39845g = abstractC10258h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10130f> invoke() {
                Set<C10130f> m38925l;
                b bVar = b.this;
                List list = bVar.f39825b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC10258h abstractC10258h = bVar.f39838o;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(C10281x.m36495b(abstractC10258h.m36325p().m36456g(), ((C10097i) ((InterfaceC10723o) it.next())).m34723e0()));
                }
                m38925l = C10791x0.m38925l(linkedHashSet, this.f39845g.mo36298t());
                return m38925l;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$g */
        static final class g extends Lambda implements Function0<Map<C10130f, ? extends List<? extends InterfaceC10706y0>>> {
            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<C10130f, List<InterfaceC10706y0>> invoke() {
                List m36335A = b.this.m36335A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : m36335A) {
                    C10130f name = ((InterfaceC10706y0) obj).getName();
                    C9768m.m32345e(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$h */
        static final class h extends Lambda implements Function0<Map<C10130f, ? extends List<? extends InterfaceC10696t0>>> {
            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<C10130f, List<InterfaceC10696t0>> invoke() {
                List m36336B = b.this.m36336B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : m36336B) {
                    C10130f name = ((InterfaceC10696t0) obj).getName();
                    C9768m.m32345e(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$i */
        static final class i extends Lambda implements Function0<Map<C10130f, ? extends InterfaceC10551d1>> {
            i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<C10130f, InterfaceC10551d1> invoke() {
                int m38793e;
                int m32419b;
                List m36337C = b.this.m36337C();
                m38793e = C10775p0.m38793e(C10786v.m38911u(m36337C, 10));
                m32419b = C9815l.m32419b(m38793e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
                for (Object obj : m36337C) {
                    C10130f name = ((InterfaceC10551d1) obj).getName();
                    C9768m.m32345e(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$j */
        static final class j extends Lambda implements Function0<Set<? extends C10130f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10258h f39850g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(AbstractC10258h abstractC10258h) {
                super(0);
                this.f39850g = abstractC10258h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10130f> invoke() {
                Set<C10130f> m38925l;
                b bVar = b.this;
                List list = bVar.f39826c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC10258h abstractC10258h = bVar.f39838o;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(C10281x.m36495b(abstractC10258h.m36325p().m36456g(), ((C10102n) ((InterfaceC10723o) it.next())).m34887d0()));
                }
                m38925l = C10791x0.m38925l(linkedHashSet, this.f39850g.mo36299u());
                return m38925l;
            }
        }

        public b(AbstractC10258h abstractC10258h, List<C10097i> list, List<C10102n> list2, List<C10106r> list3) {
            C9768m.m32346f(list, "functionList");
            C9768m.m32346f(list2, "propertyList");
            C9768m.m32346f(list3, "typeAliasList");
            this.f39838o = abstractC10258h;
            this.f39825b = list;
            this.f39826c = list2;
            this.f39827d = abstractC10258h.m36325p().m36452c().m36422g().mo36443f() ? list3 : C10784u.m38888j();
            this.f39828e = abstractC10258h.m36325p().m36457h().mo36516d(new d());
            this.f39829f = abstractC10258h.m36325p().m36457h().mo36516d(new e());
            this.f39830g = abstractC10258h.m36325p().m36457h().mo36516d(new c());
            this.f39831h = abstractC10258h.m36325p().m36457h().mo36516d(new a());
            this.f39832i = abstractC10258h.m36325p().m36457h().mo36516d(new C11518b());
            this.f39833j = abstractC10258h.m36325p().m36457h().mo36516d(new i());
            this.f39834k = abstractC10258h.m36325p().m36457h().mo36516d(new g());
            this.f39835l = abstractC10258h.m36325p().m36457h().mo36516d(new h());
            this.f39836m = abstractC10258h.m36325p().m36457h().mo36516d(new f(abstractC10258h));
            this.f39837n = abstractC10258h.m36325p().m36457h().mo36516d(new j(abstractC10258h));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public final List<InterfaceC10706y0> m36335A() {
            return (List) C10296m.m36555a(this.f39831h, this, f39824a[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final List<InterfaceC10696t0> m36336B() {
            return (List) C10296m.m36555a(this.f39832i, this, f39824a[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final List<InterfaceC10551d1> m36337C() {
            return (List) C10296m.m36555a(this.f39830g, this, f39824a[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final List<InterfaceC10706y0> m36338D() {
            return (List) C10296m.m36555a(this.f39828e, this, f39824a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final List<InterfaceC10696t0> m36339E() {
            return (List) C10296m.m36555a(this.f39829f, this, f39824a[1]);
        }

        /* renamed from: F */
        private final Map<C10130f, Collection<InterfaceC10706y0>> m36340F() {
            return (Map) C10296m.m36555a(this.f39834k, this, f39824a[6]);
        }

        /* renamed from: G */
        private final Map<C10130f, Collection<InterfaceC10696t0>> m36341G() {
            return (Map) C10296m.m36555a(this.f39835l, this, f39824a[7]);
        }

        /* renamed from: H */
        private final Map<C10130f, InterfaceC10551d1> m36342H() {
            return (Map) C10296m.m36555a(this.f39833j, this, f39824a[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final List<InterfaceC10706y0> m36355t() {
            Set<C10130f> mo36298t = this.f39838o.mo36298t();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = mo36298t.iterator();
            while (it.hasNext()) {
                C10794z.m38933z(arrayList, m36358w((C10130f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final List<InterfaceC10696t0> m36356u() {
            Set<C10130f> mo36299u = this.f39838o.mo36299u();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = mo36299u.iterator();
            while (it.hasNext()) {
                C10794z.m38933z(arrayList, m36359x((C10130f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public final List<InterfaceC10706y0> m36357v() {
            List<C10097i> list = this.f39825b;
            AbstractC10258h abstractC10258h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10706y0 m36487j = abstractC10258h.m36325p().m36455f().m36487j((C10097i) ((InterfaceC10723o) it.next()));
                if (!abstractC10258h.mo36300x(m36487j)) {
                    m36487j = null;
                }
                if (m36487j != null) {
                    arrayList.add(m36487j);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        private final List<InterfaceC10706y0> m36358w(C10130f c10130f) {
            List<InterfaceC10706y0> m36338D = m36338D();
            AbstractC10258h abstractC10258h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m36338D) {
                if (C9768m.m32341a(((InterfaceC10576m) obj).getName(), c10130f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC10258h.mo36294k(c10130f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        private final List<InterfaceC10696t0> m36359x(C10130f c10130f) {
            List<InterfaceC10696t0> m36339E = m36339E();
            AbstractC10258h abstractC10258h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m36339E) {
                if (C9768m.m32341a(((InterfaceC10576m) obj).getName(), c10130f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC10258h.mo36295l(c10130f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final List<InterfaceC10696t0> m36360y() {
            List<C10102n> list = this.f39826c;
            AbstractC10258h abstractC10258h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10696t0 m36488l = abstractC10258h.m36325p().m36455f().m36488l((C10102n) ((InterfaceC10723o) it.next()));
                if (m36488l != null) {
                    arrayList.add(m36488l);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final List<InterfaceC10551d1> m36361z() {
            List<C10106r> list = this.f39827d;
            AbstractC10258h abstractC10258h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10551d1 m36489m = abstractC10258h.m36325p().m36455f().m36489m((C10106r) ((InterfaceC10723o) it.next()));
                if (m36489m != null) {
                    arrayList.add(m36489m);
                }
            }
            return arrayList;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: a */
        public Collection<InterfaceC10706y0> mo36328a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            Collection<InterfaceC10706y0> collection;
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            return (mo36329b().contains(c10130f) && (collection = m36340F().get(c10130f)) != null) ? collection : C10784u.m38888j();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: b */
        public Set<C10130f> mo36329b() {
            return (Set) C10296m.m36555a(this.f39836m, this, f39824a[8]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: c */
        public Collection<InterfaceC10696t0> mo36330c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            Collection<InterfaceC10696t0> collection;
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            return (mo36331d().contains(c10130f) && (collection = m36341G().get(c10130f)) != null) ? collection : C10784u.m38888j();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: d */
        public Set<C10130f> mo36331d() {
            return (Set) C10296m.m36555a(this.f39837n, this, f39824a[9]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: e */
        public Set<C10130f> mo36332e() {
            List<C10106r> list = this.f39827d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC10258h abstractC10258h = this.f39838o;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(C10281x.m36495b(abstractC10258h.m36325p().m36456g(), ((C10106r) ((InterfaceC10723o) it.next())).m35138X()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: f */
        public void mo36333f(Collection<InterfaceC10576m> collection, C10214d c10214d, Function1<? super C10130f, Boolean> function1, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(collection, "result");
            C9768m.m32346f(c10214d, "kindFilter");
            C9768m.m32346f(function1, "nameFilter");
            C9768m.m32346f(interfaceC9906b, "location");
            if (c10214d.m36137a(C10214d.f39630a.m36150i())) {
                for (Object obj : m36336B()) {
                    C10130f name = ((InterfaceC10696t0) obj).getName();
                    C9768m.m32345e(name, "it.name");
                    if (function1.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (c10214d.m36137a(C10214d.f39630a.m36145d())) {
                for (Object obj2 : m36335A()) {
                    C10130f name2 = ((InterfaceC10706y0) obj2).getName();
                    C9768m.m32345e(name2, "it.name");
                    if (function1.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: g */
        public InterfaceC10551d1 mo36334g(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            return m36342H().get(c10130f);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c */
    private final class c implements a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f39851a = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: b */
        private final Map<C10130f, byte[]> f39852b;

        /* renamed from: c */
        private final Map<C10130f, byte[]> f39853c;

        /* renamed from: d */
        private final Map<C10130f, byte[]> f39854d;

        /* renamed from: e */
        private final InterfaceC10290g<C10130f, Collection<InterfaceC10706y0>> f39855e;

        /* renamed from: f */
        private final InterfaceC10290g<C10130f, Collection<InterfaceC10696t0>> f39856f;

        /* renamed from: g */
        private final InterfaceC10291h<C10130f, InterfaceC10551d1> f39857g;

        /* renamed from: h */
        private final InterfaceC10292i f39858h;

        /* renamed from: i */
        private final InterfaceC10292i f39859i;

        /* renamed from: j */
        final /* synthetic */ AbstractC10258h f39860j;

        /* JADX INFO: Add missing generic type declarations: [M] */
        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$a */
        static final class a<M> extends Lambda implements Function0<M> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10725q<M> f39861f;

            /* renamed from: g */
            final /* synthetic */ ByteArrayInputStream f39862g;

            /* renamed from: h */
            final /* synthetic */ AbstractC10258h f39863h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC10725q<M> interfaceC10725q, ByteArrayInputStream byteArrayInputStream, AbstractC10258h abstractC10258h) {
                super(0);
                this.f39861f = interfaceC10725q;
                this.f39862g = byteArrayInputStream;
                this.f39863h = abstractC10258h;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TM; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10723o invoke() {
                return (InterfaceC10723o) this.f39861f.mo38261c(this.f39862g, this.f39863h.m36325p().m36452c().m36425j());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$b */
        static final class b extends Lambda implements Function0<Set<? extends C10130f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10258h f39865g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC10258h abstractC10258h) {
                super(0);
                this.f39865g = abstractC10258h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10130f> invoke() {
                Set<C10130f> m38925l;
                m38925l = C10791x0.m38925l(c.this.f39852b.keySet(), this.f39865g.mo36298t());
                return m38925l;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$c, reason: collision with other inner class name */
        static final class C11519c extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
            C11519c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
                C9768m.m32346f(c10130f, "it");
                return c.this.m36372m(c10130f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$d */
        static final class d extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10696t0>> {
            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<InterfaceC10696t0> invoke(C10130f c10130f) {
                C9768m.m32346f(c10130f, "it");
                return c.this.m36373n(c10130f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$e */
        static final class e extends Lambda implements Function1<C10130f, InterfaceC10551d1> {
            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10551d1 invoke(C10130f c10130f) {
                C9768m.m32346f(c10130f, "it");
                return c.this.m36374o(c10130f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$f */
        static final class f extends Lambda implements Function0<Set<? extends C10130f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10258h f39870g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(AbstractC10258h abstractC10258h) {
                super(0);
                this.f39870g = abstractC10258h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10130f> invoke() {
                Set<C10130f> m38925l;
                m38925l = C10791x0.m38925l(c.this.f39853c.keySet(), this.f39870g.mo36299u());
                return m38925l;
            }
        }

        public c(AbstractC10258h abstractC10258h, List<C10097i> list, List<C10102n> list2, List<C10106r> list3) {
            Map<C10130f, byte[]> m38797i;
            C9768m.m32346f(list, "functionList");
            C9768m.m32346f(list2, "propertyList");
            C9768m.m32346f(list3, "typeAliasList");
            this.f39860j = abstractC10258h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C10130f m36495b = C10281x.m36495b(abstractC10258h.m36325p().m36456g(), ((C10097i) ((InterfaceC10723o) obj)).m34723e0());
                Object obj2 = linkedHashMap.get(m36495b);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m36495b, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f39852b = m36375p(linkedHashMap);
            AbstractC10258h abstractC10258h2 = this.f39860j;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                C10130f m36495b2 = C10281x.m36495b(abstractC10258h2.m36325p().m36456g(), ((C10102n) ((InterfaceC10723o) obj3)).m34887d0());
                Object obj4 = linkedHashMap2.get(m36495b2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(m36495b2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f39853c = m36375p(linkedHashMap2);
            if (this.f39860j.m36325p().m36452c().m36422g().mo36443f()) {
                AbstractC10258h abstractC10258h3 = this.f39860j;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    C10130f m36495b3 = C10281x.m36495b(abstractC10258h3.m36325p().m36456g(), ((C10106r) ((InterfaceC10723o) obj5)).m35138X());
                    Object obj6 = linkedHashMap3.get(m36495b3);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(m36495b3, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                m38797i = m36375p(linkedHashMap3);
            } else {
                m38797i = C10777q0.m38797i();
            }
            this.f39854d = m38797i;
            this.f39855e = this.f39860j.m36325p().m36457h().mo36520h(new C11519c());
            this.f39856f = this.f39860j.m36325p().m36457h().mo36520h(new d());
            this.f39857g = this.f39860j.m36325p().m36457h().mo36521i(new e());
            this.f39858h = this.f39860j.m36325p().m36457h().mo36516d(new b(this.f39860j));
            this.f39859i = this.f39860j.m36325p().m36457h().mo36516d(new f(this.f39860j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
        
            if (r0 != null) goto L8;
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0> m36372m(kotlin.reflect.p371y.internal.p374j0.p397f.C10130f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.f0.y.e.j0.f.f, byte[]> r0 = r6.f39852b
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.i> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10097i.f38832i
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9768m.m32345e(r1, r2)
                kotlin.f0.y.e.j0.j.b.g0.h r2 = r6.f39860j
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                kotlin.f0.y.e.j0.j.b.g0.h r3 = r6.f39860j
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.f0.y.e.j0.j.b.g0.h$c$a r0 = new kotlin.f0.y.e.j0.j.b.g0.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.g0.h r0 = kotlin.sequences.C10484i.m37352g(r0)
                java.util.List r0 = kotlin.sequences.C10484i.m37347A(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.C10780s.m38848j()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L66
                java.lang.Object r3 = r0.next()
                kotlin.f0.y.e.j0.e.i r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10097i) r3
                kotlin.f0.y.e.j0.j.b.m r4 = r2.m36325p()
                kotlin.f0.y.e.j0.j.b.w r4 = r4.m36455f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9768m.m32345e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = r4.m36487j(r3)
                boolean r4 = r2.mo36300x(r3)
                if (r4 == 0) goto L5f
                goto L60
            L5f:
                r3 = 0
            L60:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L66:
                r2.mo36294k(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.C10734a.m38510c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.c.m36372m(kotlin.f0.y.e.j0.f.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
        
            if (r0 != null) goto L8;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0> m36373n(kotlin.reflect.p371y.internal.p374j0.p397f.C10130f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.f0.y.e.j0.f.f, byte[]> r0 = r6.f39853c
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.n> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10102n.f38914i
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9768m.m32345e(r1, r2)
                kotlin.f0.y.e.j0.j.b.g0.h r2 = r6.f39860j
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                kotlin.f0.y.e.j0.j.b.g0.h r3 = r6.f39860j
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.f0.y.e.j0.j.b.g0.h$c$a r0 = new kotlin.f0.y.e.j0.j.b.g0.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.g0.h r0 = kotlin.sequences.C10484i.m37352g(r0)
                java.util.List r0 = kotlin.sequences.C10484i.m37347A(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.C10780s.m38848j()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r0.next()
                kotlin.f0.y.e.j0.e.n r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10102n) r3
                kotlin.f0.y.e.j0.j.b.m r4 = r2.m36325p()
                kotlin.f0.y.e.j0.j.b.w r4 = r4.m36455f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9768m.m32345e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.t0 r3 = r4.m36488l(r3)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5e:
                r2.mo36295l(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.C10734a.m38510c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.c.m36373n(kotlin.f0.y.e.j0.f.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final InterfaceC10551d1 m36374o(C10130f c10130f) {
            C10106r m35130o0;
            byte[] bArr = this.f39854d.get(c10130f);
            if (bArr == null || (m35130o0 = C10106r.m35130o0(new ByteArrayInputStream(bArr), this.f39860j.m36325p().m36452c().m36425j())) == null) {
                return null;
            }
            return this.f39860j.m36325p().m36455f().m36489m(m35130o0);
        }

        /* renamed from: p */
        private final Map<C10130f, byte[]> m36375p(Map<C10130f, ? extends Collection<? extends AbstractC10709a>> map) {
            int m38793e;
            m38793e = C10775p0.m38793e(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(m38793e);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C10786v.m38911u(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractC10709a) it2.next()).m38256i(byteArrayOutputStream);
                    arrayList.add(C10742u.f41439a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: a */
        public Collection<InterfaceC10706y0> mo36328a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            return !mo36329b().contains(c10130f) ? C10784u.m38888j() : this.f39855e.invoke(c10130f);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: b */
        public Set<C10130f> mo36329b() {
            return (Set) C10296m.m36555a(this.f39858h, this, f39851a[0]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: c */
        public Collection<InterfaceC10696t0> mo36330c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            return !mo36331d().contains(c10130f) ? C10784u.m38888j() : this.f39856f.invoke(c10130f);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: d */
        public Set<C10130f> mo36331d() {
            return (Set) C10296m.m36555a(this.f39859i, this, f39851a[1]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: e */
        public Set<C10130f> mo36332e() {
            return this.f39854d.keySet();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: f */
        public void mo36333f(Collection<InterfaceC10576m> collection, C10214d c10214d, Function1<? super C10130f, Boolean> function1, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(collection, "result");
            C9768m.m32346f(c10214d, "kindFilter");
            C9768m.m32346f(function1, "nameFilter");
            C9768m.m32346f(interfaceC9906b, "location");
            if (c10214d.m36137a(C10214d.f39630a.m36150i())) {
                Set<C10130f> mo36331d = mo36331d();
                ArrayList arrayList = new ArrayList();
                for (C10130f c10130f : mo36331d) {
                    if (function1.invoke(c10130f).booleanValue()) {
                        arrayList.addAll(mo36330c(c10130f, interfaceC9906b));
                    }
                }
                C10157g c10157g = C10157g.f39518f;
                C9768m.m32345e(c10157g, "INSTANCE");
                C10792y.m38928y(arrayList, c10157g);
                collection.addAll(arrayList);
            }
            if (c10214d.m36137a(C10214d.f39630a.m36145d())) {
                Set<C10130f> mo36329b = mo36329b();
                ArrayList arrayList2 = new ArrayList();
                for (C10130f c10130f2 : mo36329b) {
                    if (function1.invoke(c10130f2).booleanValue()) {
                        arrayList2.addAll(mo36328a(c10130f2, interfaceC9906b));
                    }
                }
                C10157g c10157g2 = C10157g.f39518f;
                C9768m.m32345e(c10157g2, "INSTANCE");
                C10792y.m38928y(arrayList2, c10157g2);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h.a
        /* renamed from: g */
        public InterfaceC10551d1 mo36334g(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            return this.f39857g.invoke(c10130f);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$d */
    static final class d extends Lambda implements Function0<Set<? extends C10130f>> {

        /* renamed from: f */
        final /* synthetic */ Function0<Collection<C10130f>> f39871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends Collection<C10130f>> function0) {
            super(0);
            this.f39871f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10130f> invoke() {
            Set<C10130f> m38574I0;
            m38574I0 = C10749c0.m38574I0(this.f39871f.invoke());
            return m38574I0;
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$e */
    static final class e extends Lambda implements Function0<Set<? extends C10130f>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10130f> invoke() {
            Set m38925l;
            Set<C10130f> m38925l2;
            Set<C10130f> mo36297s = AbstractC10258h.this.mo36297s();
            if (mo36297s == null) {
                return null;
            }
            m38925l = C10791x0.m38925l(AbstractC10258h.this.m36326q(), AbstractC10258h.this.f39821d.mo36332e());
            m38925l2 = C10791x0.m38925l(m38925l, mo36297s);
            return m38925l2;
        }
    }

    protected AbstractC10258h(C10270m c10270m, List<C10097i> list, List<C10102n> list2, List<C10106r> list3, Function0<? extends Collection<C10130f>> function0) {
        C9768m.m32346f(c10270m, "c");
        C9768m.m32346f(list, "functionList");
        C9768m.m32346f(list2, "propertyList");
        C9768m.m32346f(list3, "typeAliasList");
        C9768m.m32346f(function0, "classNames");
        this.f39820c = c10270m;
        this.f39821d = m36320n(list, list2, list3);
        this.f39822e = c10270m.m36457h().mo36516d(new d(function0));
        this.f39823f = c10270m.m36457h().mo36518f(new e());
    }

    /* renamed from: n */
    private final a m36320n(List<C10097i> list, List<C10102n> list2, List<C10106r> list3) {
        return this.f39820c.m36452c().m36422g().mo36438a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    /* renamed from: o */
    private final InterfaceC10552e m36321o(C10130f c10130f) {
        return this.f39820c.m36452c().m36417b(mo36296m(c10130f));
    }

    /* renamed from: r */
    private final Set<C10130f> m36322r() {
        return (Set) C10296m.m36556b(this.f39823f, this, f39819b[1]);
    }

    /* renamed from: v */
    private final InterfaceC10551d1 m36323v(C10130f c10130f) {
        return this.f39821d.mo36334g(c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return this.f39821d.mo36328a(c10130f, interfaceC9906b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        return this.f39821d.mo36329b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return this.f39821d.mo36330c(c10130f, interfaceC9906b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        return this.f39821d.mo36331d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        return m36322r();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        if (mo36327w(c10130f)) {
            return m36321o(c10130f);
        }
        if (this.f39821d.mo36332e().contains(c10130f)) {
            return m36323v(c10130f);
        }
        return null;
    }

    /* renamed from: i */
    protected abstract void mo36293i(Collection<InterfaceC10576m> collection, Function1<? super C10130f, Boolean> function1);

    /* renamed from: j */
    protected final Collection<InterfaceC10576m> m36324j(C10214d c10214d, Function1<? super C10130f, Boolean> function1, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        C9768m.m32346f(interfaceC9906b, "location");
        ArrayList arrayList = new ArrayList(0);
        C10214d.a aVar = C10214d.f39630a;
        if (c10214d.m36137a(aVar.m36148g())) {
            mo36293i(arrayList, function1);
        }
        this.f39821d.mo36333f(arrayList, c10214d, function1, interfaceC9906b);
        if (c10214d.m36137a(aVar.m36144c())) {
            for (C10130f c10130f : m36326q()) {
                if (function1.invoke(c10130f).booleanValue()) {
                    C10734a.m38508a(arrayList, m36321o(c10130f));
                }
            }
        }
        if (c10214d.m36137a(C10214d.f39630a.m36149h())) {
            for (C10130f c10130f2 : this.f39821d.mo36332e()) {
                if (function1.invoke(c10130f2).booleanValue()) {
                    C10734a.m38508a(arrayList, this.f39821d.mo36334g(c10130f2));
                }
            }
        }
        return C10734a.m38510c(arrayList);
    }

    /* renamed from: k */
    protected void mo36294k(C10130f c10130f, List<InterfaceC10706y0> list) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(list, "functions");
    }

    /* renamed from: l */
    protected void mo36295l(C10130f c10130f, List<InterfaceC10696t0> list) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(list, "descriptors");
    }

    /* renamed from: m */
    protected abstract C10126b mo36296m(C10130f c10130f);

    /* renamed from: p */
    protected final C10270m m36325p() {
        return this.f39820c;
    }

    /* renamed from: q */
    public final Set<C10130f> m36326q() {
        return (Set) C10296m.m36555a(this.f39822e, this, f39819b[0]);
    }

    /* renamed from: s */
    protected abstract Set<C10130f> mo36297s();

    /* renamed from: t */
    protected abstract Set<C10130f> mo36298t();

    /* renamed from: u */
    protected abstract Set<C10130f> mo36299u();

    /* renamed from: w */
    protected boolean mo36327w(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return m36326q().contains(c10130f);
    }

    /* renamed from: x */
    protected boolean mo36300x(InterfaceC10706y0 interfaceC10706y0) {
        C9768m.m32346f(interfaceC10706y0, "function");
        return true;
    }
}
