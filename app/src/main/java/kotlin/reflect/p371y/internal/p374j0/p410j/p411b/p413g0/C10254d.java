package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10791x0;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9815l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10557f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10562h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10699v;
import kotlin.reflect.jvm.internal.impl.descriptors.C10704x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10707z;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10604a;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10614f;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10615f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10630n;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9904a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10095g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10108t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10111w;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10121f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10151a;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10222l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10226b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10236a0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10238b0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10242d0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10270m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10280w;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10281x;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10301b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import okhttp3.HttpUrl;

/* compiled from: DeserializedClassDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.d */
/* loaded from: classes3.dex */
public final class C10254d extends AbstractC10604a implements InterfaceC10576m {

    /* renamed from: A */
    private final InterfaceC10292i<Collection<InterfaceC10552e>> f39769A;

    /* renamed from: B */
    private final InterfaceC10293j<AbstractC10560g1<AbstractC10335m0>> f39770B;

    /* renamed from: C */
    private final AbstractC10283z.a f39771C;

    /* renamed from: D */
    private final InterfaceC10587g f39772D;

    /* renamed from: k */
    private final C10091c f39773k;

    /* renamed from: l */
    private final AbstractC10116a f39774l;

    /* renamed from: m */
    private final InterfaceC10708z0 f39775m;

    /* renamed from: n */
    private final C10126b f39776n;

    /* renamed from: o */
    private final EnumC10550d0 f39777o;

    /* renamed from: p */
    private final AbstractC10697u f39778p;

    /* renamed from: q */
    private final EnumC10555f f39779q;

    /* renamed from: r */
    private final C10270m f39780r;

    /* renamed from: s */
    private final AbstractC10219i f39781s;

    /* renamed from: t */
    private final b f39782t;

    /* renamed from: u */
    private final C10704x0<a> f39783u;

    /* renamed from: v */
    private final c f39784v;

    /* renamed from: w */
    private final InterfaceC10576m f39785w;

    /* renamed from: x */
    private final InterfaceC10293j<InterfaceC10549d> f39786x;

    /* renamed from: y */
    private final InterfaceC10292i<Collection<InterfaceC10549d>> f39787y;

    /* renamed from: z */
    private final InterfaceC10293j<InterfaceC10552e> f39788z;

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a */
    private final class a extends AbstractC10258h {

        /* renamed from: g */
        private final AbstractC10363g f39789g;

        /* renamed from: h */
        private final InterfaceC10292i<Collection<InterfaceC10576m>> f39790h;

        /* renamed from: i */
        private final InterfaceC10292i<Collection<AbstractC10311e0>> f39791i;

        /* renamed from: j */
        final /* synthetic */ C10254d f39792j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$a, reason: collision with other inner class name */
        static final class C11516a extends Lambda implements Function0<List<? extends C10130f>> {

            /* renamed from: f */
            final /* synthetic */ List<C10130f> f39793f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11516a(List<C10130f> list) {
                super(0);
                this.f39793f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C10130f> invoke() {
                return this.f39793f;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$b */
        static final class b extends Lambda implements Function0<Collection<? extends InterfaceC10576m>> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<InterfaceC10576m> invoke() {
                return a.this.m36324j(C10214d.f39642m, InterfaceC10218h.f39667a.m36159a(), EnumC9908d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$c */
        public static final class c extends AbstractC10158h {

            /* renamed from: a */
            final /* synthetic */ List<D> f39795a;

            c(List<D> list) {
                this.f39795a = list;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10159i
            /* renamed from: a */
            public void mo33154a(InterfaceC10543b interfaceC10543b) {
                C9768m.m32346f(interfaceC10543b, "fakeOverride");
                C10160j.m35856K(interfaceC10543b, null);
                this.f39795a.add(interfaceC10543b);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10158h
            /* renamed from: e */
            protected void mo33156e(InterfaceC10543b interfaceC10543b, InterfaceC10543b interfaceC10543b2) {
                C9768m.m32346f(interfaceC10543b, "fromSuper");
                C9768m.m32346f(interfaceC10543b2, "fromCurrent");
                if (interfaceC10543b2 instanceof AbstractC10633p) {
                    ((AbstractC10633p) interfaceC10543b2).m37921V0(C10699v.f41233a, interfaceC10543b);
                }
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$a$d */
        static final class d extends Lambda implements Function0<Collection<? extends AbstractC10311e0>> {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<AbstractC10311e0> invoke() {
                return a.this.f39789g.mo36929g(a.this.m36289B());
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d r8, kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.C9768m.m32346f(r9, r0)
                r7.f39792j = r8
                kotlin.f0.y.e.j0.j.b.m r2 = r8.m36282b1()
                kotlin.f0.y.e.j0.e.c r0 = r8.m36283c1()
                java.util.List r3 = r0.m34442I0()
                java.lang.String r0 = "classProto.functionList"
                kotlin.jvm.internal.C9768m.m32345e(r3, r0)
                kotlin.f0.y.e.j0.e.c r0 = r8.m36283c1()
                java.util.List r4 = r0.m34456W0()
                java.lang.String r0 = "classProto.propertyList"
                kotlin.jvm.internal.C9768m.m32345e(r4, r0)
                kotlin.f0.y.e.j0.e.c r0 = r8.m36283c1()
                java.util.List r5 = r0.m34465e1()
                java.lang.String r0 = "classProto.typeAliasList"
                kotlin.jvm.internal.C9768m.m32345e(r5, r0)
                kotlin.f0.y.e.j0.e.c r0 = r8.m36283c1()
                java.util.List r0 = r0.m34453T0()
                java.lang.String r1 = "classProto.nestedClassNameList"
                kotlin.jvm.internal.C9768m.m32345e(r0, r1)
                kotlin.f0.y.e.j0.j.b.m r8 = r8.m36282b1()
                kotlin.f0.y.e.j0.e.z.c r8 = r8.m36456g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.C10780s.m38869u(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L56:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L6e
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.f0.y.e.j0.f.f r6 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10281x.m36495b(r8, r6)
                r1.add(r6)
                goto L56
            L6e:
                kotlin.f0.y.e.j0.j.b.g0.d$a$a r6 = new kotlin.f0.y.e.j0.j.b.g0.d$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f39789g = r9
                kotlin.f0.y.e.j0.j.b.m r8 = r7.m36325p()
                kotlin.f0.y.e.j0.k.n r8 = r8.m36457h()
                kotlin.f0.y.e.j0.j.b.g0.d$a$b r9 = new kotlin.f0.y.e.j0.j.b.g0.d$a$b
                r9.<init>()
                kotlin.f0.y.e.j0.k.i r8 = r8.mo36516d(r9)
                r7.f39790h = r8
                kotlin.f0.y.e.j0.j.b.m r8 = r7.m36325p()
                kotlin.f0.y.e.j0.k.n r8 = r8.m36457h()
                kotlin.f0.y.e.j0.j.b.g0.d$a$d r9 = new kotlin.f0.y.e.j0.j.b.g0.d$a$d
                r9.<init>()
                kotlin.f0.y.e.j0.k.i r8 = r8.mo36516d(r9)
                r7.f39791i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d.a.<init>(kotlin.f0.y.e.j0.j.b.g0.d, kotlin.f0.y.e.j0.l.t1.g):void");
        }

        /* renamed from: A */
        private final <D extends InterfaceC10543b> void m36288A(C10130f c10130f, Collection<? extends D> collection, List<D> list) {
            m36325p().m36452c().m36428m().mo36948a().m35886v(c10130f, collection, new ArrayList(list), m36289B(), new c(list));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final C10254d m36289B() {
            return this.f39792j;
        }

        /* renamed from: C */
        public void m36292C(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            C9904a.m33013a(m36325p().m36452c().m36430o(), interfaceC9906b, m36289B(), c10130f);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: a */
        public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            m36292C(c10130f, interfaceC9906b);
            return super.mo33311a(c10130f, interfaceC9906b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: c */
        public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            m36292C(c10130f, interfaceC9906b);
            return super.mo33313c(c10130f, interfaceC9906b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
        /* renamed from: f */
        public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
            InterfaceC10552e m36309f;
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(interfaceC9906b, "location");
            m36292C(c10130f, interfaceC9906b);
            c cVar = m36289B().f39784v;
            return (cVar == null || (m36309f = cVar.m36309f(c10130f)) == null) ? super.mo33316f(c10130f, interfaceC9906b) : m36309f;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
        /* renamed from: g */
        public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
            C9768m.m32346f(c10214d, "kindFilter");
            C9768m.m32346f(function1, "nameFilter");
            return this.f39790h.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: i */
        protected void mo36293i(Collection<InterfaceC10576m> collection, Function1<? super C10130f, Boolean> function1) {
            C9768m.m32346f(collection, "result");
            C9768m.m32346f(function1, "nameFilter");
            c cVar = m36289B().f39784v;
            Collection<InterfaceC10552e> m36308d = cVar != null ? cVar.m36308d() : null;
            if (m36308d == null) {
                m36308d = C10784u.m38888j();
            }
            collection.addAll(m36308d);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: k */
        protected void mo36294k(C10130f c10130f, List<InterfaceC10706y0> list) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(list, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10311e0> it = this.f39791i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo33553q().mo33311a(c10130f, EnumC9908d.FOR_ALREADY_TRACKED));
            }
            list.addAll(m36325p().m36452c().m36418c().mo32980b(c10130f, this.f39792j));
            m36288A(c10130f, arrayList, list);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: l */
        protected void mo36295l(C10130f c10130f, List<InterfaceC10696t0> list) {
            C9768m.m32346f(c10130f, "name");
            C9768m.m32346f(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC10311e0> it = this.f39791i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo33553q().mo33313c(c10130f, EnumC9908d.FOR_ALREADY_TRACKED));
            }
            m36288A(c10130f, arrayList, list);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: m */
        protected C10126b mo36296m(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            C10126b m35411d = this.f39792j.f39776n.m35411d(c10130f);
            C9768m.m32345e(m35411d, "classId.createNestedClassId(name)");
            return m35411d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: s */
        protected Set<C10130f> mo36297s() {
            List<AbstractC10311e0> mo35998a = m36289B().f39782t.mo35998a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo35998a.iterator();
            while (it.hasNext()) {
                Set<C10130f> mo33315e = ((AbstractC10311e0) it.next()).mo33553q().mo33315e();
                if (mo33315e == null) {
                    return null;
                }
                C10794z.m38933z(linkedHashSet, mo33315e);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: t */
        protected Set<C10130f> mo36298t() {
            List<AbstractC10311e0> mo35998a = m36289B().f39782t.mo35998a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo35998a.iterator();
            while (it.hasNext()) {
                C10794z.m38933z(linkedHashSet, ((AbstractC10311e0) it.next()).mo33553q().mo33312b());
            }
            linkedHashSet.addAll(m36325p().m36452c().m36418c().mo32983e(this.f39792j));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: u */
        protected Set<C10130f> mo36299u() {
            List<AbstractC10311e0> mo35998a = m36289B().f39782t.mo35998a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo35998a.iterator();
            while (it.hasNext()) {
                C10794z.m38933z(linkedHashSet, ((AbstractC10311e0) it.next()).mo33553q().mo33314d());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10258h
        /* renamed from: x */
        protected boolean mo36300x(InterfaceC10706y0 interfaceC10706y0) {
            C9768m.m32346f(interfaceC10706y0, "function");
            return m36325p().m36452c().m36434s().mo32981c(this.f39792j, interfaceC10706y0);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$b */
    private final class b extends AbstractC10301b {

        /* renamed from: d */
        private final InterfaceC10292i<List<InterfaceC10554e1>> f39797d;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10554e1>> {

            /* renamed from: f */
            final /* synthetic */ C10254d f39799f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10254d c10254d) {
                super(0);
                this.f39799f = c10254d;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10554e1> invoke() {
                return C10557f1.m37685d(this.f39799f);
            }
        }

        public b() {
            super(C10254d.this.m36282b1().m36457h());
            this.f39797d = C10254d.this.m36282b1().m36457h().mo36516d(new a(C10254d.this));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        public List<InterfaceC10554e1> getParameters() {
            return this.f39797d.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: l */
        protected Collection<AbstractC10311e0> mo32889l() {
            String m35455k;
            C10127c m35409b;
            List<C10105q> m35393l = C10121f.m35393l(C10254d.this.m36283c1(), C10254d.this.m36282b1().m36459j());
            C10254d c10254d = C10254d.this;
            ArrayList arrayList = new ArrayList(C10786v.m38911u(m35393l, 10));
            Iterator<T> it = m35393l.iterator();
            while (it.hasNext()) {
                arrayList.add(c10254d.m36282b1().m36458i().m36231q((C10105q) it.next()));
            }
            List m38609o0 = C10749c0.m38609o0(arrayList, C10254d.this.m36282b1().m36452c().m36418c().mo32982d(C10254d.this));
            ArrayList<C10568j0.b> arrayList2 = new ArrayList();
            Iterator it2 = m38609o0.iterator();
            while (it2.hasNext()) {
                InterfaceC10561h mo32891w = ((AbstractC10311e0) it2.next()).mo35993O0().mo32891w();
                C10568j0.b bVar = mo32891w instanceof C10568j0.b ? (C10568j0.b) mo32891w : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC10275r m36424i = C10254d.this.m36282b1().m36452c().m36424i();
                C10254d c10254d2 = C10254d.this;
                ArrayList arrayList3 = new ArrayList(C10786v.m38911u(arrayList2, 10));
                for (C10568j0.b bVar2 : arrayList2) {
                    C10126b m36073g = C10202a.m36073g(bVar2);
                    if (m36073g == null || (m35409b = m36073g.m35409b()) == null || (m35455k = m35409b.m35420b()) == null) {
                        m35455k = bVar2.getName().m35455k();
                    }
                    arrayList3.add(m35455k);
                }
                m36424i.mo36471b(c10254d2, arrayList3);
            }
            return C10749c0.m38569E0(m38609o0);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: q */
        protected InterfaceC10548c1 mo32890q() {
            return InterfaceC10548c1.a.f40737a;
        }

        public String toString() {
            String c10130f = C10254d.this.getName().toString();
            C9768m.m32345e(c10130f, "name.toString()");
            return c10130f;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10301b
        /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C10254d mo32891w() {
            return C10254d.this;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c */
    private final class c {

        /* renamed from: a */
        private final Map<C10130f, C10095g> f39800a;

        /* renamed from: b */
        private final InterfaceC10291h<C10130f, InterfaceC10552e> f39801b;

        /* renamed from: c */
        private final InterfaceC10292i<Set<C10130f>> f39802c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c$a */
        static final class a extends Lambda implements Function1<C10130f, InterfaceC10552e> {

            /* renamed from: g */
            final /* synthetic */ C10254d f39805g;

            /* compiled from: DeserializedClassDescriptor.kt */
            /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c$a$a, reason: collision with other inner class name */
            static final class C11517a extends Lambda implements Function0<List<? extends InterfaceC10583c>> {

                /* renamed from: f */
                final /* synthetic */ C10254d f39806f;

                /* renamed from: g */
                final /* synthetic */ C10095g f39807g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11517a(C10254d c10254d, C10095g c10095g) {
                    super(0);
                    this.f39806f = c10254d;
                    this.f39807g = c10095g;
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends InterfaceC10583c> invoke() {
                    return C10749c0.m38569E0(this.f39806f.m36282b1().m36452c().m36419d().mo33874f(this.f39806f.m36286g1(), this.f39807g));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10254d c10254d) {
                super(1);
                this.f39805g = c10254d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10552e invoke(C10130f c10130f) {
                C9768m.m32346f(c10130f, "name");
                C10095g c10095g = (C10095g) c.this.f39800a.get(c10130f);
                if (c10095g == null) {
                    return null;
                }
                C10254d c10254d = this.f39805g;
                return C10630n.m37894M0(c10254d.m36282b1().m36457h(), c10254d, c10130f, c.this.f39802c, new C10251a(c10254d.m36282b1().m36457h(), new C11517a(c10254d, c10095g)), InterfaceC10708z0.f41247a);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$c$b */
        static final class b extends Lambda implements Function0<Set<? extends C10130f>> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10130f> invoke() {
                return c.this.m36307e();
            }
        }

        public c() {
            int m38793e;
            int m32419b;
            List<C10095g> m34437D0 = C10254d.this.m36283c1().m34437D0();
            C9768m.m32345e(m34437D0, "classProto.enumEntryList");
            m38793e = C10775p0.m38793e(C10786v.m38911u(m34437D0, 10));
            m32419b = C9815l.m32419b(m38793e, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
            for (Object obj : m34437D0) {
                linkedHashMap.put(C10281x.m36495b(C10254d.this.m36282b1().m36456g(), ((C10095g) obj).m34624F()), obj);
            }
            this.f39800a = linkedHashMap;
            this.f39801b = C10254d.this.m36282b1().m36457h().mo36521i(new a(C10254d.this));
            this.f39802c = C10254d.this.m36282b1().m36457h().mo36516d(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final Set<C10130f> m36307e() {
            Set<C10130f> m38925l;
            HashSet hashSet = new HashSet();
            Iterator<AbstractC10311e0> it = C10254d.this.mo32877h().mo35998a().iterator();
            while (it.hasNext()) {
                for (InterfaceC10576m interfaceC10576m : InterfaceC10221k.a.m36162a(it.next().mo33553q(), null, null, 3, null)) {
                    if ((interfaceC10576m instanceof InterfaceC10706y0) || (interfaceC10576m instanceof InterfaceC10696t0)) {
                        hashSet.add(interfaceC10576m.getName());
                    }
                }
            }
            List<C10097i> m34442I0 = C10254d.this.m36283c1().m34442I0();
            C9768m.m32345e(m34442I0, "classProto.functionList");
            C10254d c10254d = C10254d.this;
            Iterator<T> it2 = m34442I0.iterator();
            while (it2.hasNext()) {
                hashSet.add(C10281x.m36495b(c10254d.m36282b1().m36456g(), ((C10097i) it2.next()).m34723e0()));
            }
            List<C10102n> m34456W0 = C10254d.this.m36283c1().m34456W0();
            C9768m.m32345e(m34456W0, "classProto.propertyList");
            C10254d c10254d2 = C10254d.this;
            Iterator<T> it3 = m34456W0.iterator();
            while (it3.hasNext()) {
                hashSet.add(C10281x.m36495b(c10254d2.m36282b1().m36456g(), ((C10102n) it3.next()).m34887d0()));
            }
            m38925l = C10791x0.m38925l(hashSet, hashSet);
            return m38925l;
        }

        /* renamed from: d */
        public final Collection<InterfaceC10552e> m36308d() {
            Set<C10130f> keySet = this.f39800a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                InterfaceC10552e m36309f = m36309f((C10130f) it.next());
                if (m36309f != null) {
                    arrayList.add(m36309f);
                }
            }
            return arrayList;
        }

        /* renamed from: f */
        public final InterfaceC10552e m36309f(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            return this.f39801b.invoke(c10130f);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$d */
    static final class d extends Lambda implements Function0<List<? extends InterfaceC10583c>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            return C10749c0.m38569E0(C10254d.this.m36282b1().m36452c().m36419d().mo33872c(C10254d.this.m36286g1()));
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$e */
    static final class e extends Lambda implements Function0<InterfaceC10552e> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10552e invoke() {
            return C10254d.this.m36272T0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$f */
    static final class f extends Lambda implements Function0<Collection<? extends InterfaceC10549d>> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10549d> invoke() {
            return C10254d.this.m36273U0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$g */
    /* synthetic */ class g extends C9760i implements Function1<AbstractC10363g, a> {
        g(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final a invoke(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "p0");
            return new a((C10254d) this.receiver, abstractC10363g);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$h */
    static final class h extends Lambda implements Function0<InterfaceC10549d> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10549d invoke() {
            return C10254d.this.m36276X0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$i */
    static final class i extends Lambda implements Function0<Collection<? extends InterfaceC10552e>> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10552e> invoke() {
            return C10254d.this.m36278Z0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.d$j */
    static final class j extends Lambda implements Function0<AbstractC10560g1<AbstractC10335m0>> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10560g1<AbstractC10335m0> invoke() {
            return C10254d.this.m36279a1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10254d(C10270m c10270m, C10091c c10091c, InterfaceC10118c interfaceC10118c, AbstractC10116a abstractC10116a, InterfaceC10708z0 interfaceC10708z0) {
        super(c10270m.m36457h(), C10281x.m36494a(interfaceC10118c, c10091c.m34439F0()).m35415j());
        C9768m.m32346f(c10270m, "outerContext");
        C9768m.m32346f(c10091c, "classProto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        C9768m.m32346f(interfaceC10708z0, "sourceElement");
        this.f39773k = c10091c;
        this.f39774l = abstractC10116a;
        this.f39775m = interfaceC10708z0;
        this.f39776n = C10281x.m36494a(interfaceC10118c, c10091c.m34439F0());
        C10236a0 c10236a0 = C10236a0.f39714a;
        this.f39777o = c10236a0.m36205b(C10117b.f39208e.mo35368d(c10091c.m34438E0()));
        this.f39778p = C10238b0.m36208a(c10236a0, C10117b.f39207d.mo35368d(c10091c.m34438E0()));
        EnumC10555f m36204a = c10236a0.m36204a(C10117b.f39209f.mo35368d(c10091c.m34438E0()));
        this.f39779q = m36204a;
        List<C10107s> m34468h1 = c10091c.m34468h1();
        C9768m.m32345e(m34468h1, "classProto.typeParameterList");
        C10108t m34469i1 = c10091c.m34469i1();
        C9768m.m32345e(m34469i1, "classProto.typeTable");
        C10122g c10122g = new C10122g(m34469i1);
        C10123h.a aVar = C10123h.f39237a;
        C10111w m34471k1 = c10091c.m34471k1();
        C9768m.m32345e(m34471k1, "classProto.versionRequirementTable");
        C10270m m36451a = c10270m.m36451a(this, m34468h1, interfaceC10118c, c10122g, aVar.m35401a(m34471k1), abstractC10116a);
        this.f39780r = m36451a;
        EnumC10555f enumC10555f = EnumC10555f.ENUM_CLASS;
        this.f39781s = m36204a == enumC10555f ? new C10222l(m36451a.m36457h(), this) : InterfaceC10218h.b.f39671b;
        this.f39782t = new b();
        this.f39783u = C10704x0.f41236a.m38159a(this, m36451a.m36457h(), m36451a.m36452c().m36428m().mo36949c(), new g(this));
        this.f39784v = m36204a == enumC10555f ? new c() : null;
        InterfaceC10576m m36454e = c10270m.m36454e();
        this.f39785w = m36454e;
        this.f39786x = m36451a.m36457h().mo36518f(new h());
        this.f39787y = m36451a.m36457h().mo36516d(new f());
        this.f39788z = m36451a.m36457h().mo36518f(new e());
        this.f39769A = m36451a.m36457h().mo36516d(new i());
        this.f39770B = m36451a.m36457h().mo36518f(new j());
        InterfaceC10118c m36456g = m36451a.m36456g();
        C10122g m36459j = m36451a.m36459j();
        C10254d c10254d = m36454e instanceof C10254d ? (C10254d) m36454e : null;
        this.f39771C = new AbstractC10283z.a(c10091c, m36456g, m36459j, interfaceC10708z0, c10254d != null ? c10254d.f39771C : null);
        this.f39772D = !C10117b.f39206c.mo35368d(c10091c.m34438E0()).booleanValue() ? InterfaceC10587g.f40808c.m37735b() : new C10264n(m36451a.m36457h(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public final InterfaceC10552e m36272T0() {
        if (!this.f39773k.m34472l1()) {
            return null;
        }
        InterfaceC10561h mo33316f = m36280d1().mo33316f(C10281x.m36495b(this.f39780r.m36456g(), this.f39773k.m34478r0()), EnumC9908d.FROM_DESERIALIZATION);
        if (mo33316f instanceof InterfaceC10552e) {
            return (InterfaceC10552e) mo33316f;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final Collection<InterfaceC10549d> m36273U0() {
        List m38892n;
        List<InterfaceC10549d> m36277Y0 = m36277Y0();
        m38892n = C10784u.m38892n(mo32864R());
        return C10749c0.m38609o0(C10749c0.m38609o0(m36277Y0, m38892n), this.f39780r.m36452c().m36418c().mo32979a(this));
    }

    /* renamed from: V0 */
    private final C10707z<AbstractC10335m0> m36274V0() {
        C10130f name;
        AbstractC10335m0 abstractC10335m0;
        Object obj = null;
        if (!isInline() && !mo32881l()) {
            return null;
        }
        if (mo32881l() && !this.f39773k.m34475o1() && !this.f39773k.m34476p1() && !this.f39773k.m34477q1() && this.f39773k.m34446M0() > 0) {
            return null;
        }
        if (this.f39773k.m34475o1()) {
            name = C10281x.m36495b(this.f39780r.m36456g(), this.f39773k.m34443J0());
        } else {
            if (this.f39774l.m35360c(1, 5, 1)) {
                throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + this).toString());
            }
            InterfaceC10549d mo32864R = mo32864R();
            if (mo32864R == null) {
                throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
            }
            List<InterfaceC10566i1> mo37028f = mo32864R.mo37028f();
            C9768m.m32345e(mo37028f, "constructor.valueParameters");
            name = ((InterfaceC10566i1) C10780s.m38830U(mo37028f)).getName();
            C9768m.m32345e(name, "{\n                // Bef…irst().name\n            }");
        }
        C10105q m35387f = C10121f.m35387f(this.f39773k, this.f39780r.m36459j());
        if (m35387f == null || (abstractC10335m0 = C10242d0.m36223n(this.f39780r.m36458i(), m35387f, false, 2, null)) == null) {
            Iterator<T> it = m36280d1().mo33313c(name, EnumC9908d.FROM_DESERIALIZATION).iterator();
            Object obj2 = null;
            boolean z = false;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((InterfaceC10696t0) next).mo37032m0() == null) {
                        if (z) {
                            break;
                        }
                        obj2 = next;
                        z = true;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            InterfaceC10696t0 interfaceC10696t0 = (InterfaceC10696t0) obj;
            if (interfaceC10696t0 == null) {
                throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
            }
            AbstractC10311e0 type = interfaceC10696t0.getType();
            C9768m.m32344d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            abstractC10335m0 = (AbstractC10335m0) type;
        }
        return new C10707z<>(name, abstractC10335m0);
    }

    /* renamed from: W0 */
    private final C10562h0<AbstractC10335m0> m36275W0() {
        List<C10105q> m34452S0;
        List m38580L0;
        List<Integer> m34447N0 = this.f39773k.m34447N0();
        C9768m.m32345e(m34447N0, "classProto.multiFieldValueClassUnderlyingNameList");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m34447N0, 10));
        for (Integer num : m34447N0) {
            InterfaceC10118c m36456g = this.f39780r.m36456g();
            C9768m.m32345e(num, "it");
            arrayList.add(C10281x.m36495b(m36456g, num.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (!mo32881l()) {
            throw new IllegalArgumentException(("Not a value class: " + this).toString());
        }
        Pair m38547a = C10740s.m38547a(Integer.valueOf(this.f39773k.m34450Q0()), Integer.valueOf(this.f39773k.m34449P0()));
        if (C9768m.m32341a(m38547a, C10740s.m38547a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> m34451R0 = this.f39773k.m34451R0();
            C9768m.m32345e(m34451R0, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
            m34452S0 = new ArrayList<>(C10786v.m38911u(m34451R0, 10));
            for (Integer num2 : m34451R0) {
                C10122g m36459j = this.f39780r.m36459j();
                C9768m.m32345e(num2, "it");
                m34452S0.add(m36459j.m35399a(num2.intValue()));
            }
        } else {
            if (!C9768m.m32341a(m38547a, C10740s.m38547a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("Illegal multi-field value class representation: " + this).toString());
            }
            m34452S0 = this.f39773k.m34452S0();
        }
        C9768m.m32345e(m34452S0, "when (typeIdCount to typ…tation: $this\")\n        }");
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(m34452S0, 10));
        for (C10105q c10105q : m34452S0) {
            C10242d0 m36458i = this.f39780r.m36458i();
            C9768m.m32345e(c10105q, "it");
            arrayList2.add(C10242d0.m36223n(m36458i, c10105q, false, 2, null));
        }
        m38580L0 = C10749c0.m38580L0(arrayList, arrayList2);
        return new C10562h0<>(m38580L0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public final InterfaceC10549d m36276X0() {
        Object obj;
        if (this.f39779q.m37681k()) {
            C10614f m35793k = C10153c.m35793k(this, InterfaceC10708z0.f41247a);
            m35793k.m37928h1(mo36400s());
            return m35793k;
        }
        List<C10092d> m34483u0 = this.f39773k.m34483u0();
        C9768m.m32345e(m34483u0, "classProto.constructorList");
        Iterator<T> it = m34483u0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!C10117b.f39216m.mo35368d(((C10092d) obj).m34537J()).booleanValue()) {
                break;
            }
        }
        C10092d c10092d = (C10092d) obj;
        if (c10092d != null) {
            return this.f39780r.m36455f().m36486i(c10092d, true);
        }
        return null;
    }

    /* renamed from: Y0 */
    private final List<InterfaceC10549d> m36277Y0() {
        List<C10092d> m34483u0 = this.f39773k.m34483u0();
        C9768m.m32345e(m34483u0, "classProto.constructorList");
        ArrayList<C10092d> arrayList = new ArrayList();
        for (Object obj : m34483u0) {
            Boolean mo35368d = C10117b.f39216m.mo35368d(((C10092d) obj).m34537J());
            C9768m.m32345e(mo35368d, "IS_SECONDARY.get(it.flags)");
            if (mo35368d.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(arrayList, 10));
        for (C10092d c10092d : arrayList) {
            C10280w m36455f = this.f39780r.m36455f();
            C9768m.m32345e(c10092d, "it");
            arrayList2.add(m36455f.m36486i(c10092d, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public final Collection<InterfaceC10552e> m36278Z0() {
        if (this.f39777o != EnumC10550d0.SEALED) {
            return C10784u.m38888j();
        }
        List<Integer> m34457X0 = this.f39773k.m34457X0();
        C9768m.m32345e(m34457X0, "fqNames");
        if (!(!m34457X0.isEmpty())) {
            return C10151a.f39497a.m35768a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : m34457X0) {
            C10268k m36452c = this.f39780r.m36452c();
            InterfaceC10118c m36456g = this.f39780r.m36456g();
            C9768m.m32345e(num, "index");
            InterfaceC10552e m36417b = m36452c.m36417b(C10281x.m36494a(m36456g, num.intValue()));
            if (m36417b != null) {
                arrayList.add(m36417b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public final AbstractC10560g1<AbstractC10335m0> m36279a1() {
        C10707z<AbstractC10335m0> m36274V0 = m36274V0();
        C10562h0<AbstractC10335m0> m36275W0 = m36275W0();
        if (m36274V0 != null && m36275W0 != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + this);
        }
        if ((!mo32881l() && !isInline()) || m36274V0 != null || m36275W0 != null) {
            return m36274V0 != null ? m36274V0 : m36275W0;
        }
        throw new IllegalArgumentException("Value class has no value class representation: " + this);
    }

    /* renamed from: d1 */
    private final a m36280d1() {
        return this.f39783u.m38158c(this.f39780r.m36452c().m36428m().mo36949c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: A */
    public boolean mo32857A() {
        return C10117b.f39209f.mo35368d(this.f39773k.m34438E0()) == C10091c.c.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: D */
    public boolean mo32858D() {
        Boolean mo35368d = C10117b.f39215l.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_FUN_INTERFACE.get(classProto.flags)");
        return mo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10604a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: F0 */
    public List<InterfaceC10702w0> mo36281F0() {
        List<C10105q> m34488y0 = this.f39773k.m34488y0();
        C9768m.m32345e(m34488y0, "classProto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m34488y0, 10));
        for (C10105q c10105q : m34488y0) {
            C10242d0 m36458i = this.f39780r.m36458i();
            C9768m.m32345e(c10105q, "it");
            arrayList.add(new C10615f0(mo37677K0(), new C10226b(this, m36458i.m36231q(c10105q), null), InterfaceC10587g.f40808c.m37735b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
    /* renamed from: H */
    protected InterfaceC10218h mo32860H(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this.f39783u.m38158c(abstractC10363g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J */
    public Collection<InterfaceC10552e> mo32861J() {
        return this.f39769A.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        Boolean mo35368d = C10117b.f39211h.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_DATA.get(classProto.flags)");
        return mo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        Boolean mo35368d = C10117b.f39213j.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_EXPECT_CLASS.get(classProto.flags)");
        return mo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: R */
    public InterfaceC10549d mo32864R() {
        return this.f39786x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: U */
    public InterfaceC10552e mo32869U() {
        return this.f39788z.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10579n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        return this.f39785w;
    }

    /* renamed from: b1 */
    public final C10270m m36282b1() {
        return this.f39780r;
    }

    /* renamed from: c1 */
    public final C10091c m36283c1() {
        return this.f39773k;
    }

    /* renamed from: e1 */
    public final AbstractC10116a m36284e1() {
        return this.f39774l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public AbstractC10219i mo32866S() {
        return this.f39781s;
    }

    /* renamed from: g1 */
    public final AbstractC10283z.a m36286g1() {
        return this.f39771C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        return this.f39772D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        return this.f39778p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public InterfaceC10312e1 mo32877h() {
        return this.f39782t;
    }

    /* renamed from: h1 */
    public final boolean m36287h1(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return m36280d1().m36326q().contains(c10130f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: i */
    public EnumC10555f mo32878i() {
        return this.f39779q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    public boolean isInline() {
        Boolean mo35368d = C10117b.f39214k.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_VALUE_CLASS.get(classProto.flags)");
        return mo35368d.booleanValue() && this.f39774l.m35362e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        return this.f39777o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: k */
    public Collection<InterfaceC10549d> mo32880k() {
        return this.f39787y.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: l */
    public boolean mo32881l() {
        Boolean mo35368d = C10117b.f39214k.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_VALUE_CLASS.get(classProto.flags)");
        return mo35368d.booleanValue() && this.f39774l.m35360c(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: m */
    public boolean mo32882m() {
        Boolean mo35368d = C10117b.f39210g.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_INNER.get(classProto.flags)");
        return mo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        return this.f39775m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(mo32863M() ? "expect " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: w */
    public List<InterfaceC10554e1> mo32884w() {
        return this.f39780r.m36458i().m36229j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        Boolean mo35368d = C10117b.f39212i.mo35368d(this.f39773k.m34438E0());
        C9768m.m32345e(mo35368d, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return mo35368d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: z0 */
    public AbstractC10560g1<AbstractC10335m0> mo32886z0() {
        return this.f39770B.invoke();
    }
}
