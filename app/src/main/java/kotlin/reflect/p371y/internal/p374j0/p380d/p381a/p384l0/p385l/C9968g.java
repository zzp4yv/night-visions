package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10791x0;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9815l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10698u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10616g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10611d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10613e0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10614f;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10627l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10630n;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.jvm.internal.impl.utils.C10739f;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9904a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10039r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10040s;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10047z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9912a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9919e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9921f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9924g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9926h0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9927i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9928i0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9930a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9940k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9939j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9943b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9945d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9946e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9947f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9949h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9951a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9955e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9975a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C9978d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10001k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10007q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10013w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10014x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10015y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9996f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10029l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e;

/* compiled from: LazyJavaClassMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g */
/* loaded from: classes2.dex */
public final class C9968g extends AbstractC9971j {

    /* renamed from: n */
    private final InterfaceC10552e f38061n;

    /* renamed from: o */
    private final InterfaceC9997g f38062o;

    /* renamed from: p */
    private final boolean f38063p;

    /* renamed from: q */
    private final InterfaceC10292i<List<InterfaceC10549d>> f38064q;

    /* renamed from: r */
    private final InterfaceC10292i<Set<C10130f>> f38065r;

    /* renamed from: s */
    private final InterfaceC10292i<Map<C10130f, InterfaceC10004n>> f38066s;

    /* renamed from: t */
    private final InterfaceC10291h<C10130f, AbstractC10616g> f38067t;

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$a */
    static final class a extends Lambda implements Function1<InterfaceC10007q, Boolean> {

        /* renamed from: f */
        public static final a f38068f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10007q interfaceC10007q) {
            C9768m.m32346f(interfaceC10007q, "it");
            return Boolean.valueOf(!interfaceC10007q.mo33623Q());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$b */
    /* synthetic */ class b extends C9760i implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C9968g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "p0");
            return ((C9968g) this.receiver).m33359I0(c10130f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$c */
    /* synthetic */ class c extends C9760i implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C9968g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "p0");
            return ((C9968g) this.receiver).m33360J0(c10130f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$d */
    static final class d extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "it");
            return C9968g.this.m33359I0(c10130f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$e */
    static final class e extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "it");
            return C9968g.this.m33360J0(c10130f);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$f */
    static final class f extends Lambda implements Function0<List<? extends InterfaceC10549d>> {

        /* renamed from: g */
        final /* synthetic */ C9957g f38072g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C9957g c9957g) {
            super(0);
            this.f38072g = c9957g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10549d> invoke() {
            ?? m38892n;
            Collection<InterfaceC10001k> mo33599k = C9968g.this.f38062o.mo33599k();
            ArrayList arrayList = new ArrayList(mo33599k.size());
            Iterator<InterfaceC10001k> it = mo33599k.iterator();
            while (it.hasNext()) {
                arrayList.add(C9968g.this.m33357G0(it.next()));
            }
            if (C9968g.this.f38062o.mo33602t()) {
                InterfaceC10549d m33378e0 = C9968g.this.m33378e0();
                boolean z = false;
                String m34039c = C10073v.m34039c(m33378e0, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (C9768m.m32341a(C10073v.m34039c((InterfaceC10549d) it2.next(), false, false, 2, null), m34039c)) {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    arrayList.add(m33378e0);
                    this.f38072g.m33282a().m33248h().mo33179b(C9968g.this.f38062o, m33378e0);
                }
            }
            this.f38072g.m33282a().m33263w().mo36095c(C9968g.this.mo33398C(), arrayList);
            C10029l m33258r = this.f38072g.m33282a().m33258r();
            C9957g c9957g = this.f38072g;
            C9968g c9968g = C9968g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                m38892n = C10784u.m38892n(c9968g.m33377d0());
                arrayList2 = m38892n;
            }
            return C10749c0.m38569E0(m33258r.m33745g(c9957g, arrayList2));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$g */
    static final class g extends Lambda implements Function0<Map<C10130f, ? extends InterfaceC10004n>> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10130f, InterfaceC10004n> invoke() {
            int m38793e;
            int m32419b;
            Collection<InterfaceC10004n> mo33589D = C9968g.this.f38062o.mo33589D();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo33589D) {
                if (((InterfaceC10004n) obj).mo33613G()) {
                    arrayList.add(obj);
                }
            }
            m38793e = C10775p0.m38793e(C10786v.m38911u(arrayList, 10));
            m32419b = C9815l.m32419b(m38793e, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((InterfaceC10004n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$h */
    static final class h extends Lambda implements Function1<C10130f, Collection<? extends InterfaceC10706y0>> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10706y0 f38074f;

        /* renamed from: g */
        final /* synthetic */ C9968g f38075g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC10706y0 interfaceC10706y0, C9968g c9968g) {
            super(1);
            this.f38074f = interfaceC10706y0;
            this.f38075g = c9968g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "accessorName");
            return C9768m.m32341a(this.f38074f.getName(), c10130f) ? C10782t.m38883e(this.f38074f) : C10749c0.m38609o0(this.f38075g.m33359I0(c10130f), this.f38075g.m33360J0(c10130f));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$i */
    static final class i extends Lambda implements Function0<Set<? extends C10130f>> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10130f> invoke() {
            Set<C10130f> m38574I0;
            m38574I0 = C10749c0.m38574I0(C9968g.this.f38062o.mo33592K());
            return m38574I0;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$j */
    static final class j extends Lambda implements Function1<C10130f, AbstractC10616g> {

        /* renamed from: g */
        final /* synthetic */ C9957g f38078g;

        /* compiled from: LazyJavaClassMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.g$j$a */
        static final class a extends Lambda implements Function0<Set<? extends C10130f>> {

            /* renamed from: f */
            final /* synthetic */ C9968g f38079f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9968g c9968g) {
                super(0);
                this.f38079f = c9968g;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10130f> invoke() {
                Set<C10130f> m38925l;
                m38925l = C10791x0.m38925l(this.f38079f.mo33312b(), this.f38079f.mo33314d());
                return m38925l;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C9957g c9957g) {
            super(1);
            this.f38078g = c9957g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10616g invoke(C10130f c10130f) {
            C9768m.m32346f(c10130f, "name");
            if (!((Set) C9968g.this.f38065r.invoke()).contains(c10130f)) {
                InterfaceC10004n interfaceC10004n = (InterfaceC10004n) ((Map) C9968g.this.f38066s.invoke()).get(c10130f);
                if (interfaceC10004n == null) {
                    return null;
                }
                return C10630n.m37894M0(this.f38078g.m33286e(), C9968g.this.mo33398C(), c10130f, this.f38078g.m33286e().mo36516d(new a(C9968g.this)), C9955e.m33273a(this.f38078g, interfaceC10004n), this.f38078g.m33282a().m33260t().mo33569a(interfaceC10004n));
            }
            InterfaceC10017o m33244d = this.f38078g.m33282a().m33244d();
            C10126b m36073g = C10202a.m36073g(C9968g.this.mo33398C());
            C9768m.m32343c(m36073g);
            C10126b m35411d = m36073g.m35411d(c10130f);
            C9768m.m32345e(m35411d, "ownerDescriptor.classId!…createNestedClassId(name)");
            InterfaceC9997g mo33629a = m33244d.mo33629a(new InterfaceC10017o.b(m35411d, null, C9968g.this.f38062o, 2, null));
            if (mo33629a == null) {
                return null;
            }
            C9957g c9957g = this.f38078g;
            C9967f c9967f = new C9967f(c9957g, C9968g.this.mo33398C(), mo33629a, null, 8, null);
            c9957g.m33282a().m33245e().mo33782a(c9967f);
            return c9967f;
        }
    }

    public /* synthetic */ C9968g(C9957g c9957g, InterfaceC10552e interfaceC10552e, InterfaceC9997g interfaceC9997g, boolean z, C9968g c9968g, int i2, C9756g c9756g) {
        this(c9957g, interfaceC10552e, interfaceC9997g, z, (i2 & 16) != 0 ? null : c9968g);
    }

    /* renamed from: A0 */
    private final boolean m33352A0(InterfaceC10706y0 interfaceC10706y0, InterfaceC10705y interfaceC10705y) {
        String m34039c = C10073v.m34039c(interfaceC10706y0, false, false, 2, null);
        InterfaceC10705y mo37019a = interfaceC10705y.mo37019a();
        C9768m.m32345e(mo37019a, "builtinWithErasedParameters.original");
        return C9768m.m32341a(m34039c, C10073v.m34039c(mo37019a, false, false, 2, null)) && !m33388o0(interfaceC10706y0, interfaceC10705y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10047z.m33831d(r4) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:1: B:31:0x003f->B:45:?, LOOP_END, SYNTHETIC] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m33353B0(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0 r7) {
        /*
            r6 = this;
            kotlin.f0.y.e.j0.f.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            java.util.List r0 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9920e0.m33079a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
        L19:
            r0 = 0
            goto L78
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            kotlin.f0.y.e.j0.f.f r1 = (kotlin.reflect.p371y.internal.p374j0.p397f.C10130f) r1
            java.util.Set r1 = r6.m33397z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3b
        L39:
            r1 = 0
            goto L75
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0) r4
            kotlin.f0.y.e.j0.d.a.l0.l.g$h r5 = new kotlin.f0.y.e.j0.d.a.l0.l.g$h
            r5.<init>(r7, r6)
            boolean r5 = r6.m33387n0(r4, r5)
            if (r5 == 0) goto L71
            boolean r4 = r4.mo37031j0()
            if (r4 != 0) goto L6f
            kotlin.f0.y.e.j0.f.f r4 = r7.getName()
            java.lang.String r4 = r4.m35455k()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.C9768m.m32345e(r4, r5)
            boolean r4 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10047z.m33831d(r4)
            if (r4 != 0) goto L71
        L6f:
            r4 = 1
            goto L72
        L71:
            r4 = 0
        L72:
            if (r4 == 0) goto L3f
            r1 = 1
        L75:
            if (r1 == 0) goto L1f
            r0 = 1
        L78:
            if (r0 == 0) goto L7b
            return r3
        L7b:
            boolean r0 = r6.m33389p0(r7)
            if (r0 != 0) goto L8e
            boolean r0 = r6.m33361K0(r7)
            if (r0 != 0) goto L8e
            boolean r7 = r6.m33391r0(r7)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r2 = 0
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9968g.m33353B0(kotlin.reflect.jvm.internal.impl.descriptors.y0):boolean");
    }

    /* renamed from: C0 */
    private final InterfaceC10706y0 m33354C0(InterfaceC10706y0 interfaceC10706y0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1, Collection<? extends InterfaceC10706y0> collection) {
        InterfaceC10706y0 m33380g0;
        InterfaceC10705y m33087k = C9921f.m33087k(interfaceC10706y0);
        if (m33087k == null || (m33380g0 = m33380g0(m33087k, function1)) == null) {
            return null;
        }
        if (!m33353B0(m33380g0)) {
            m33380g0 = null;
        }
        if (m33380g0 != null) {
            return m33379f0(m33380g0, m33087k, collection);
        }
        return null;
    }

    /* renamed from: D0 */
    private final InterfaceC10706y0 m33355D0(InterfaceC10706y0 interfaceC10706y0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1, C10130f c10130f, Collection<? extends InterfaceC10706y0> collection) {
        InterfaceC10706y0 interfaceC10706y02 = (InterfaceC10706y0) C9924g0.m33103d(interfaceC10706y0);
        if (interfaceC10706y02 == null) {
            return null;
        }
        String m33101b = C9924g0.m33101b(interfaceC10706y02);
        C9768m.m32343c(m33101b);
        C10130f m35454x = C10130f.m35454x(m33101b);
        C9768m.m32345e(m35454x, "identifier(nameInJava)");
        Iterator<? extends InterfaceC10706y0> it = function1.invoke(m35454x).iterator();
        while (it.hasNext()) {
            InterfaceC10706y0 m33385l0 = m33385l0(it.next(), c10130f);
            if (m33390q0(interfaceC10706y02, m33385l0)) {
                return m33379f0(m33385l0, interfaceC10706y02, collection);
            }
        }
        return null;
    }

    /* renamed from: E0 */
    private final InterfaceC10706y0 m33356E0(InterfaceC10706y0 interfaceC10706y0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        if (!interfaceC10706y0.isSuspend()) {
            return null;
        }
        C10130f name = interfaceC10706y0.getName();
        C9768m.m32345e(name, "descriptor.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            InterfaceC10706y0 m33386m0 = m33386m0((InterfaceC10706y0) it.next());
            if (m33386m0 == null || !m33388o0(m33386m0, interfaceC10706y0)) {
                m33386m0 = null;
            }
            if (m33386m0 != null) {
                return m33386m0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public final C9943b m33357G0(InterfaceC10001k interfaceC10001k) {
        InterfaceC10552e mo33398C = mo33398C();
        C9943b m33202u1 = C9943b.m33202u1(mo33398C, C9955e.m33273a(m33461w(), interfaceC10001k), false, m33461w().m33282a().m33260t().mo33569a(interfaceC10001k));
        C9768m.m32345e(m33202u1, "createJavaConstructor(\n …ce(constructor)\n        )");
        C9957g m33234e = C9951a.m33234e(m33461w(), m33202u1, interfaceC10001k, mo33398C.mo32884w().size());
        AbstractC9971j.b m33457K = m33457K(m33234e, m33202u1, interfaceC10001k.mo33610f());
        List<InterfaceC10554e1> mo32884w = mo33398C.mo32884w();
        C9768m.m32345e(mo32884w, "classDescriptor.declaredTypeParameters");
        List<InterfaceC10015y> typeParameters = interfaceC10001k.getTypeParameters();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC10554e1 mo33293a = m33234e.m33287f().mo33293a((InterfaceC10015y) it.next());
            C9768m.m32343c(mo33293a);
            arrayList.add(mo33293a);
        }
        m33202u1.m37845s1(m33457K.m33469a(), C9928i0.m33146c(interfaceC10001k.getVisibility()), C10749c0.m38609o0(mo32884w, arrayList));
        m33202u1.mo33206Z0(false);
        m33202u1.mo33207a1(m33457K.m33470b());
        m33202u1.m37928h1(mo33398C.mo36400s());
        m33234e.m33282a().m33248h().mo33179b(interfaceC10001k, m33202u1);
        return m33202u1;
    }

    /* renamed from: H0 */
    private final C9946e m33358H0(InterfaceC10013w interfaceC10013w) {
        C9946e m33212q1 = C9946e.m33212q1(mo33398C(), C9955e.m33273a(m33461w(), interfaceC10013w), interfaceC10013w.getName(), m33461w().m33282a().m33260t().mo33569a(interfaceC10013w), true);
        C9768m.m32345e(m33212q1, "createJavaMethod(\n      …omponent), true\n        )");
        m33212q1.mo33214p1(null, mo33413z(), C10784u.m38888j(), C10784u.m38888j(), C10784u.m38888j(), m33461w().m33288g().m33525o(interfaceC10013w.getType(), C9978d.m33530d(EnumC9940k.COMMON, false, null, 2, null)), EnumC10550d0.f40738f.m37676a(false, false, true), C10695t.f41220e, null);
        m33212q1.m33217t1(false, false);
        m33461w().m33282a().m33248h().mo33182e(interfaceC10013w, m33212q1);
        return m33212q1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public final Collection<InterfaceC10706y0> m33359I0(C10130f c10130f) {
        Collection<InterfaceC10008r> mo33304f = m33462y().invoke().mo33304f(c10130f);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo33304f, 10));
        Iterator<T> it = mo33304f.iterator();
        while (it.hasNext()) {
            arrayList.add(m33456I((InterfaceC10008r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public final Collection<InterfaceC10706y0> m33360J0(C10130f c10130f) {
        Set<InterfaceC10706y0> m33396x0 = m33396x0(c10130f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m33396x0) {
            InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) obj;
            if (!(C9924g0.m33100a(interfaceC10706y0) || C9921f.m33087k(interfaceC10706y0) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: K0 */
    private final boolean m33361K0(InterfaceC10706y0 interfaceC10706y0) {
        C9921f c9921f = C9921f.f37848n;
        C10130f name = interfaceC10706y0.getName();
        C9768m.m32345e(name, "name");
        if (!c9921f.m33089l(name)) {
            return false;
        }
        C10130f name2 = interfaceC10706y0.getName();
        C9768m.m32345e(name2, "name");
        Set<InterfaceC10706y0> m33396x0 = m33396x0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m33396x0.iterator();
        while (it.hasNext()) {
            InterfaceC10705y m33087k = C9921f.m33087k((InterfaceC10706y0) it.next());
            if (m33087k != null) {
                arrayList.add(m33087k);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (m33352A0(interfaceC10706y0, (InterfaceC10705y) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    private final void m33370U(List<InterfaceC10566i1> list, InterfaceC10573l interfaceC10573l, int i2, InterfaceC10008r interfaceC10008r, AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        InterfaceC10587g m37735b = InterfaceC10587g.f40808c.m37735b();
        C10130f name = interfaceC10008r.getName();
        AbstractC10311e0 m36781n = C10339n1.m36781n(abstractC10311e0);
        C9768m.m32345e(m36781n, "makeNotNullable(returnType)");
        list.add(new C10627l0(interfaceC10573l, null, i2, m37735b, name, m36781n, interfaceC10008r.mo33619L(), false, false, abstractC10311e02 != null ? C10339n1.m36781n(abstractC10311e02) : null, m33461w().m33282a().m33260t().mo33569a(interfaceC10008r)));
    }

    /* renamed from: V */
    private final void m33371V(Collection<InterfaceC10706y0> collection, C10130f c10130f, Collection<? extends InterfaceC10706y0> collection2, boolean z) {
        Collection<? extends InterfaceC10706y0> m33151d = C9930a.m33151d(c10130f, collection2, collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
        C9768m.m32345e(m33151d, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(m33151d);
            return;
        }
        List m38609o0 = C10749c0.m38609o0(collection, m33151d);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m33151d, 10));
        for (InterfaceC10706y0 interfaceC10706y0 : m33151d) {
            InterfaceC10706y0 interfaceC10706y02 = (InterfaceC10706y0) C9924g0.m33104e(interfaceC10706y0);
            if (interfaceC10706y02 == null) {
                C9768m.m32345e(interfaceC10706y0, "resolvedOverride");
            } else {
                C9768m.m32345e(interfaceC10706y0, "resolvedOverride");
                interfaceC10706y0 = m33379f0(interfaceC10706y0, interfaceC10706y02, m38609o0);
            }
            arrayList.add(interfaceC10706y0);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: W */
    private final void m33372W(C10130f c10130f, Collection<? extends InterfaceC10706y0> collection, Collection<? extends InterfaceC10706y0> collection2, Collection<InterfaceC10706y0> collection3, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        for (InterfaceC10706y0 interfaceC10706y0 : collection2) {
            C10734a.m38508a(collection3, m33355D0(interfaceC10706y0, function1, c10130f, collection));
            C10734a.m38508a(collection3, m33354C0(interfaceC10706y0, function1, collection));
            C10734a.m38508a(collection3, m33356E0(interfaceC10706y0, function1));
        }
    }

    /* renamed from: X */
    private final void m33373X(Set<? extends InterfaceC10696t0> set, Collection<InterfaceC10696t0> collection, Set<InterfaceC10696t0> set2, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        for (InterfaceC10696t0 interfaceC10696t0 : set) {
            C9947f m33381h0 = m33381h0(interfaceC10696t0, function1);
            if (m33381h0 != null) {
                collection.add(m33381h0);
                if (set2 != null) {
                    set2.add(interfaceC10696t0);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Y */
    private final void m33374Y(C10130f c10130f, Collection<InterfaceC10696t0> collection) {
        InterfaceC10008r interfaceC10008r = (InterfaceC10008r) C10780s.m38868t0(m33462y().invoke().mo33304f(c10130f));
        if (interfaceC10008r == null) {
            return;
        }
        collection.add(m33383j0(this, interfaceC10008r, null, EnumC10550d0.FINAL, 2, null));
    }

    /* renamed from: b0 */
    private final Collection<AbstractC10311e0> m33375b0() {
        if (!this.f38063p) {
            return m33461w().m33282a().m33251k().mo36949c().mo36929g(mo33398C());
        }
        Collection<AbstractC10311e0> mo35998a = mo33398C().mo32877h().mo35998a();
        C9768m.m32345e(mo35998a, "ownerDescriptor.typeConstructor.supertypes");
        return mo35998a;
    }

    /* renamed from: c0 */
    private final List<InterfaceC10566i1> m33376c0(C10614f c10614f) {
        Pair pair;
        Collection<InterfaceC10008r> mo33593M = this.f38062o.mo33593M();
        ArrayList arrayList = new ArrayList(mo33593M.size());
        C9975a m33530d = C9978d.m33530d(EnumC9940k.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : mo33593M) {
            if (C9768m.m32341a(((InterfaceC10008r) obj).getName(), C9912a0.f37788c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.m37646a();
        List<InterfaceC10008r> list2 = (List) pair2.m37647b();
        list.size();
        InterfaceC10008r interfaceC10008r = (InterfaceC10008r) C10780s.m38832W(list);
        if (interfaceC10008r != null) {
            InterfaceC10014x returnType = interfaceC10008r.getReturnType();
            if (returnType instanceof InterfaceC9996f) {
                InterfaceC9996f interfaceC9996f = (InterfaceC9996f) returnType;
                pair = new Pair(m33461w().m33288g().m33524k(interfaceC9996f, m33530d, true), m33461w().m33288g().m33525o(interfaceC9996f.mo33587n(), m33530d));
            } else {
                pair = new Pair(m33461w().m33288g().m33525o(returnType, m33530d), null);
            }
            m33370U(arrayList, c10614f, 0, interfaceC10008r, (AbstractC10311e0) pair.m37646a(), (AbstractC10311e0) pair.m37647b());
        }
        int i2 = 0;
        int i3 = interfaceC10008r == null ? 0 : 1;
        for (InterfaceC10008r interfaceC10008r2 : list2) {
            m33370U(arrayList, c10614f, i2 + i3, interfaceC10008r2, m33461w().m33288g().m33525o(interfaceC10008r2.getReturnType(), m33530d), null);
            i2++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final InterfaceC10549d m33377d0() {
        boolean mo33601r = this.f38062o.mo33601r();
        if ((this.f38062o.mo33590H() || !this.f38062o.mo33603u()) && !mo33601r) {
            return null;
        }
        InterfaceC10552e mo33398C = mo33398C();
        C9943b m33202u1 = C9943b.m33202u1(mo33398C, InterfaceC10587g.f40808c.m37735b(), true, m33461w().m33282a().m33260t().mo33569a(this.f38062o));
        C9768m.m32345e(m33202u1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<InterfaceC10566i1> m33376c0 = mo33601r ? m33376c0(m33202u1) : Collections.emptyList();
        m33202u1.mo33207a1(false);
        m33202u1.m37844r1(m33376c0, m33395v0(mo33398C));
        m33202u1.mo33206Z0(true);
        m33202u1.m37928h1(mo33398C.mo36400s());
        m33461w().m33282a().m33248h().mo33179b(this.f38062o, m33202u1);
        return m33202u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final InterfaceC10549d m33378e0() {
        InterfaceC10552e mo33398C = mo33398C();
        C9943b m33202u1 = C9943b.m33202u1(mo33398C, InterfaceC10587g.f40808c.m37735b(), true, m33461w().m33282a().m33260t().mo33569a(this.f38062o));
        C9768m.m32345e(m33202u1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<InterfaceC10566i1> m33384k0 = m33384k0(m33202u1);
        m33202u1.mo33207a1(false);
        m33202u1.m37844r1(m33384k0, m33395v0(mo33398C));
        m33202u1.mo33206Z0(false);
        m33202u1.m37928h1(mo33398C.mo36400s());
        return m33202u1;
    }

    /* renamed from: f0 */
    private final InterfaceC10706y0 m33379f0(InterfaceC10706y0 interfaceC10706y0, InterfaceC10540a interfaceC10540a, Collection<? extends InterfaceC10706y0> collection) {
        boolean z = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (InterfaceC10706y0 interfaceC10706y02 : collection) {
                if (!C9768m.m32341a(interfaceC10706y0, interfaceC10706y02) && interfaceC10706y02.mo37774d0() == null && m33388o0(interfaceC10706y02, interfaceC10540a)) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return interfaceC10706y0;
        }
        InterfaceC10706y0 mo36996c = interfaceC10706y0.mo36992u().mo37010q().mo36996c();
        C9768m.m32343c(mo36996c);
        return mo36996c;
    }

    /* renamed from: g0 */
    private final InterfaceC10706y0 m33380g0(InterfaceC10705y interfaceC10705y, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        Object obj;
        C10130f name = interfaceC10705y.getName();
        C9768m.m32345e(name, "overridden.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m33352A0((InterfaceC10706y0) obj, interfaceC10705y)) {
                break;
            }
        }
        InterfaceC10706y0 interfaceC10706y0 = (InterfaceC10706y0) obj;
        if (interfaceC10706y0 == null) {
            return null;
        }
        InterfaceC10705y.a<? extends InterfaceC10706y0> mo36992u = interfaceC10706y0.mo36992u();
        List<InterfaceC10566i1> mo37028f = interfaceC10705y.mo37028f();
        C9768m.m32345e(mo37028f, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37028f, 10));
        Iterator<T> it2 = mo37028f.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC10566i1) it2.next()).getType());
        }
        List<InterfaceC10566i1> mo37028f2 = interfaceC10706y0.mo37028f();
        C9768m.m32345e(mo37028f2, "override.valueParameters");
        mo36992u.mo36995b(C9949h.m33225a(arrayList, mo37028f2, interfaceC10705y));
        mo36992u.mo37014u();
        mo36992u.mo36999f();
        mo36992u.mo37007n(C9946e.f37943K, Boolean.TRUE);
        return mo36992u.mo36996c();
    }

    /* renamed from: h0 */
    private final C9947f m33381h0(InterfaceC10696t0 interfaceC10696t0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        InterfaceC10706y0 interfaceC10706y0;
        C10613e0 c10613e0 = null;
        if (!m33387n0(interfaceC10696t0, function1)) {
            return null;
        }
        InterfaceC10706y0 m33393t0 = m33393t0(interfaceC10696t0, function1);
        C9768m.m32343c(m33393t0);
        if (interfaceC10696t0.mo37031j0()) {
            interfaceC10706y0 = m33394u0(interfaceC10696t0, function1);
            C9768m.m32343c(interfaceC10706y0);
        } else {
            interfaceC10706y0 = null;
        }
        if (interfaceC10706y0 != null) {
            interfaceC10706y0.mo32879j();
            m33393t0.mo32879j();
        }
        C9945d c9945d = new C9945d(mo33398C(), m33393t0, interfaceC10706y0, interfaceC10696t0);
        AbstractC10311e0 returnType = m33393t0.getReturnType();
        C9768m.m32343c(returnType);
        c9945d.m37794c1(returnType, C10784u.m38888j(), mo33413z(), null, C10784u.m38888j());
        C10611d0 m35792j = C10153c.m35792j(c9945d, m33393t0.getAnnotations(), false, false, false, m33393t0.mo32883t());
        m35792j.m37770O0(m33393t0);
        m35792j.m37828R0(c9945d.getType());
        C9768m.m32345e(m35792j, "createGetter(\n          …escriptor.type)\n        }");
        if (interfaceC10706y0 != null) {
            List<InterfaceC10566i1> mo37028f = interfaceC10706y0.mo37028f();
            C9768m.m32345e(mo37028f, "setterMethod.valueParameters");
            InterfaceC10566i1 interfaceC10566i1 = (InterfaceC10566i1) C10780s.m38832W(mo37028f);
            if (interfaceC10566i1 == null) {
                throw new AssertionError("No parameter found for " + interfaceC10706y0);
            }
            c10613e0 = C10153c.m35794l(c9945d, interfaceC10706y0.getAnnotations(), interfaceC10566i1.getAnnotations(), false, false, false, interfaceC10706y0.getVisibility(), interfaceC10706y0.mo32883t());
            c10613e0.m37770O0(interfaceC10706y0);
        }
        c9945d.m37789V0(m35792j, c10613e0);
        return c9945d;
    }

    /* renamed from: i0 */
    private final C9947f m33382i0(InterfaceC10008r interfaceC10008r, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0) {
        C9947f m33220g1 = C9947f.m33220g1(mo33398C(), C9955e.m33273a(m33461w(), interfaceC10008r), enumC10550d0, C9928i0.m33146c(interfaceC10008r.getVisibility()), false, interfaceC10008r.getName(), m33461w().m33282a().m33260t().mo33569a(interfaceC10008r), false);
        C9768m.m32345e(m33220g1, "create(\n            owne…inal = */ false\n        )");
        C10611d0 m35786d = C10153c.m35786d(m33220g1, InterfaceC10587g.f40808c.m37735b());
        C9768m.m32345e(m35786d, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        m33220g1.m37789V0(m35786d, null);
        AbstractC10311e0 m33459q = abstractC10311e0 == null ? m33459q(interfaceC10008r, C9951a.m33235f(m33461w(), m33220g1, interfaceC10008r, 0, 4, null)) : abstractC10311e0;
        m33220g1.m37794c1(m33459q, C10784u.m38888j(), mo33413z(), null, C10784u.m38888j());
        m35786d.m37828R0(m33459q);
        return m33220g1;
    }

    /* renamed from: j0 */
    static /* synthetic */ C9947f m33383j0(C9968g c9968g, InterfaceC10008r interfaceC10008r, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            abstractC10311e0 = null;
        }
        return c9968g.m33382i0(interfaceC10008r, abstractC10311e0, enumC10550d0);
    }

    /* renamed from: k0 */
    private final List<InterfaceC10566i1> m33384k0(C10614f c10614f) {
        Collection<InterfaceC10013w> mo33598j = this.f38062o.mo33598j();
        ArrayList arrayList = new ArrayList(mo33598j.size());
        AbstractC10311e0 abstractC10311e0 = null;
        C9975a m33530d = C9978d.m33530d(EnumC9940k.COMMON, false, null, 2, null);
        int i2 = 0;
        for (InterfaceC10013w interfaceC10013w : mo33598j) {
            int i3 = i2 + 1;
            AbstractC10311e0 m33525o = m33461w().m33288g().m33525o(interfaceC10013w.getType(), m33530d);
            arrayList.add(new C10627l0(c10614f, null, i2, InterfaceC10587g.f40808c.m37735b(), interfaceC10013w.getName(), m33525o, false, false, false, interfaceC10013w.mo33627h() ? m33461w().m33282a().m33253m().mo37021o().m32793k(m33525o) : abstractC10311e0, m33461w().m33282a().m33260t().mo33569a(interfaceC10013w)));
            i2 = i3;
            abstractC10311e0 = null;
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private final InterfaceC10706y0 m33385l0(InterfaceC10706y0 interfaceC10706y0, C10130f c10130f) {
        InterfaceC10705y.a<? extends InterfaceC10706y0> mo36992u = interfaceC10706y0.mo36992u();
        mo36992u.mo37013t(c10130f);
        mo36992u.mo37014u();
        mo36992u.mo36999f();
        InterfaceC10706y0 mo36996c = mo36992u.mo36996c();
        C9768m.m32343c(mo36996c);
        return mo36996c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0 m33386m0(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo37028f()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            java.lang.Object r0 = kotlin.collections.C10780s.m38847i0(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1) r0
            r2 = 0
            if (r0 == 0) goto L7e
            kotlin.f0.y.e.j0.l.e0 r3 = r0.getType()
            kotlin.f0.y.e.j0.l.e1 r3 = r3.mo35993O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.mo32891w()
            if (r3 == 0) goto L35
            kotlin.f0.y.e.j0.f.d r3 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36075i(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.m35435f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.f0.y.e.j0.f.c r3 = r3.m35441l()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.f0.y.e.j0.f.c r4 = kotlin.reflect.p371y.internal.p374j0.p375b.C9884k.f37512m
            boolean r3 = kotlin.jvm.internal.C9768m.m32341a(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7e
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r6.mo36992u()
            java.util.List r6 = r6.mo37028f()
            kotlin.jvm.internal.C9768m.m32345e(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.C10780s.m38826N(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r2.mo36995b(r6)
            kotlin.f0.y.e.j0.l.e0 r0 = r0.getType()
            java.util.List r0 = r0.mo35991M0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.f0.y.e.j0.l.g1 r0 = (kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1) r0
            kotlin.f0.y.e.j0.l.e0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r6.mo37000g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r6.mo36996c()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.p1.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0) r0
            if (r0 != 0) goto L7a
            goto L7d
        L7a:
            r0.m37929i1(r1)
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9968g.m33386m0(kotlin.reflect.jvm.internal.impl.descriptors.y0):kotlin.reflect.jvm.internal.impl.descriptors.y0");
    }

    /* renamed from: n0 */
    private final boolean m33387n0(InterfaceC10696t0 interfaceC10696t0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        if (C9964c.m33307a(interfaceC10696t0)) {
            return false;
        }
        InterfaceC10706y0 m33393t0 = m33393t0(interfaceC10696t0, function1);
        InterfaceC10706y0 m33394u0 = m33394u0(interfaceC10696t0, function1);
        if (m33393t0 == null) {
            return false;
        }
        if (interfaceC10696t0.mo37031j0()) {
            return m33394u0 != null && m33394u0.mo32879j() == m33393t0.mo32879j();
        }
        return true;
    }

    /* renamed from: o0 */
    private final boolean m33388o0(InterfaceC10540a interfaceC10540a, InterfaceC10540a interfaceC10540a2) {
        C10160j.i.a m35898c = C10160j.f39520b.m35885F(interfaceC10540a2, interfaceC10540a, true).m35898c();
        C9768m.m32345e(m35898c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return m35898c == C10160j.i.a.OVERRIDABLE && !C10040s.f38306a.m33802a(interfaceC10540a2, interfaceC10540a);
    }

    /* renamed from: p0 */
    private final boolean m33389p0(InterfaceC10706y0 interfaceC10706y0) {
        C9926h0.a aVar = C9926h0.f37865a;
        C10130f name = interfaceC10706y0.getName();
        C9768m.m32345e(name, "name");
        C10130f m33125b = aVar.m33125b(name);
        if (m33125b == null) {
            return false;
        }
        Set<InterfaceC10706y0> m33396x0 = m33396x0(m33125b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m33396x0) {
            if (C9924g0.m33100a((InterfaceC10706y0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        InterfaceC10706y0 m33385l0 = m33385l0(interfaceC10706y0, m33125b);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m33390q0((InterfaceC10706y0) it.next(), m33385l0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    private final boolean m33390q0(InterfaceC10706y0 interfaceC10706y0, InterfaceC10705y interfaceC10705y) {
        if (C9919e.f37846n.m33077k(interfaceC10706y0)) {
            interfaceC10705y = interfaceC10705y.mo37019a();
        }
        C9768m.m32345e(interfaceC10705y, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m33388o0(interfaceC10705y, interfaceC10706y0);
    }

    /* renamed from: r0 */
    private final boolean m33391r0(InterfaceC10706y0 interfaceC10706y0) {
        InterfaceC10706y0 m33386m0 = m33386m0(interfaceC10706y0);
        if (m33386m0 == null) {
            return false;
        }
        C10130f name = interfaceC10706y0.getName();
        C9768m.m32345e(name, "name");
        Set<InterfaceC10706y0> m33396x0 = m33396x0(name);
        if ((m33396x0 instanceof Collection) && m33396x0.isEmpty()) {
            return false;
        }
        for (InterfaceC10706y0 interfaceC10706y02 : m33396x0) {
            if (interfaceC10706y02.isSuspend() && m33388o0(m33386m0, interfaceC10706y02)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    private final InterfaceC10706y0 m33392s0(InterfaceC10696t0 interfaceC10696t0, String str, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        InterfaceC10706y0 interfaceC10706y0;
        C10130f m35454x = C10130f.m35454x(str);
        C9768m.m32345e(m35454x, "identifier(getterName)");
        Iterator<T> it = function1.invoke(m35454x).iterator();
        do {
            interfaceC10706y0 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC10706y0 interfaceC10706y02 = (InterfaceC10706y0) it.next();
            if (interfaceC10706y02.mo37028f().size() == 0) {
                InterfaceC10361e interfaceC10361e = InterfaceC10361e.f40181a;
                AbstractC10311e0 returnType = interfaceC10706y02.getReturnType();
                if (returnType == null ? false : interfaceC10361e.mo36920d(returnType, interfaceC10696t0.getType())) {
                    interfaceC10706y0 = interfaceC10706y02;
                }
            }
        } while (interfaceC10706y0 == null);
        return interfaceC10706y0;
    }

    /* renamed from: t0 */
    private final InterfaceC10706y0 m33393t0(InterfaceC10696t0 interfaceC10696t0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        InterfaceC10698u0 getter = interfaceC10696t0.getGetter();
        InterfaceC10698u0 interfaceC10698u0 = getter != null ? (InterfaceC10698u0) C9924g0.m33103d(getter) : null;
        String m33141a = interfaceC10698u0 != null ? C9927i.f37892a.m33141a(interfaceC10698u0) : null;
        if (m33141a != null && !C9924g0.m33105f(mo33398C(), interfaceC10698u0)) {
            return m33392s0(interfaceC10696t0, m33141a, function1);
        }
        String m35455k = interfaceC10696t0.getName().m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        return m33392s0(interfaceC10696t0, C10047z.m33829b(m35455k), function1);
    }

    /* renamed from: u0 */
    private final InterfaceC10706y0 m33394u0(InterfaceC10696t0 interfaceC10696t0, Function1<? super C10130f, ? extends Collection<? extends InterfaceC10706y0>> function1) {
        InterfaceC10706y0 interfaceC10706y0;
        AbstractC10311e0 returnType;
        String m35455k = interfaceC10696t0.getName().m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        C10130f m35454x = C10130f.m35454x(C10047z.m33832e(m35455k));
        C9768m.m32345e(m35454x, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = function1.invoke(m35454x).iterator();
        do {
            interfaceC10706y0 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC10706y0 interfaceC10706y02 = (InterfaceC10706y0) it.next();
            if (interfaceC10706y02.mo37028f().size() == 1 && (returnType = interfaceC10706y02.getReturnType()) != null && AbstractC9881h.m32727B0(returnType)) {
                InterfaceC10361e interfaceC10361e = InterfaceC10361e.f40181a;
                List<InterfaceC10566i1> mo37028f = interfaceC10706y02.mo37028f();
                C9768m.m32345e(mo37028f, "descriptor.valueParameters");
                if (interfaceC10361e.mo36919b(((InterfaceC10566i1) C10780s.m38866s0(mo37028f)).getType(), interfaceC10696t0.getType())) {
                    interfaceC10706y0 = interfaceC10706y02;
                }
            }
        } while (interfaceC10706y0 == null);
        return interfaceC10706y0;
    }

    /* renamed from: v0 */
    private final AbstractC10697u m33395v0(InterfaceC10552e interfaceC10552e) {
        AbstractC10697u visibility = interfaceC10552e.getVisibility();
        C9768m.m32345e(visibility, "classDescriptor.visibility");
        if (!C9768m.m32341a(visibility, C10039r.f38303b)) {
            return visibility;
        }
        AbstractC10697u abstractC10697u = C10039r.f38304c;
        C9768m.m32345e(abstractC10697u, "PROTECTED_AND_PACKAGE");
        return abstractC10697u;
    }

    /* renamed from: x0 */
    private final Set<InterfaceC10706y0> m33396x0(C10130f c10130f) {
        Collection<AbstractC10311e0> m33375b0 = m33375b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = m33375b0.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(linkedHashSet, ((AbstractC10311e0) it.next()).mo33553q().mo33311a(c10130f, EnumC9908d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* renamed from: z0 */
    private final Set<InterfaceC10696t0> m33397z0(C10130f c10130f) {
        Set<InterfaceC10696t0> m38574I0;
        Collection<AbstractC10311e0> m33375b0 = m33375b0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m33375b0.iterator();
        while (it.hasNext()) {
            Collection<? extends InterfaceC10696t0> mo33313c = ((AbstractC10311e0) it.next()).mo33553q().mo33313c(c10130f, EnumC9908d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(mo33313c, 10));
            Iterator<T> it2 = mo33313c.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC10696t0) it2.next());
            }
            C10794z.m38933z(arrayList, arrayList2);
        }
        m38574I0 = C10749c0.m38574I0(arrayList);
        return m38574I0;
    }

    /* renamed from: F0 */
    public void m33399F0(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        C9904a.m33013a(m33461w().m33282a().m33252l(), interfaceC9906b, mo33398C(), c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: G */
    protected boolean mo33400G(C9946e c9946e) {
        C9768m.m32346f(c9946e, "<this>");
        if (this.f38062o.mo33601r()) {
            return false;
        }
        return m33353B0(c9946e);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: H */
    protected AbstractC9971j.a mo33401H(InterfaceC10008r interfaceC10008r, List<? extends InterfaceC10554e1> list, AbstractC10311e0 abstractC10311e0, List<? extends InterfaceC10566i1> list2) {
        C9768m.m32346f(interfaceC10008r, "method");
        C9768m.m32346f(list, "methodTypeParameters");
        C9768m.m32346f(abstractC10311e0, "returnType");
        C9768m.m32346f(list2, "valueParameters");
        InterfaceC9939j.b mo33186a = m33461w().m33282a().m33259s().mo33186a(interfaceC10008r, mo33398C(), abstractC10311e0, null, list2, list);
        C9768m.m32345e(mo33186a, "c.components.signaturePr…dTypeParameters\n        )");
        AbstractC10311e0 m33192d = mo33186a.m33192d();
        C9768m.m32345e(m33192d, "propagated.returnType");
        AbstractC10311e0 m33191c = mo33186a.m33191c();
        List<InterfaceC10566i1> m33194f = mo33186a.m33194f();
        C9768m.m32345e(m33194f, "propagated.valueParameters");
        List<InterfaceC10554e1> m33193e = mo33186a.m33193e();
        C9768m.m32345e(m33193e, "propagated.typeParameters");
        boolean m33195g = mo33186a.m33195g();
        List<String> m33190b = mo33186a.m33190b();
        C9768m.m32345e(m33190b, "propagated.errors");
        return new AbstractC9971j.a(m33192d, m33191c, m33194f, m33193e, m33195g, m33190b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<C10130f> mo33405n(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        Collection<AbstractC10311e0> mo35998a = mo33398C().mo32877h().mo35998a();
        C9768m.m32345e(mo35998a, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<C10130f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = mo35998a.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(linkedHashSet, ((AbstractC10311e0) it.next()).mo33553q().mo33312b());
        }
        linkedHashSet.addAll(m33462y().invoke().mo33299a());
        linkedHashSet.addAll(m33462y().invoke().mo33302d());
        linkedHashSet.addAll(mo33404l(c10214d, function1));
        linkedHashSet.addAll(m33461w().m33282a().m33263w().mo36096d(mo33398C()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m33399F0(c10130f, interfaceC9906b);
        return super.mo33311a(c10130f, interfaceC9906b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C9962a mo33407p() {
        return new C9962a(this.f38062o, a.f38068f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m33399F0(c10130f, interfaceC9906b);
        return super.mo33313c(c10130f, interfaceC9906b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        InterfaceC10291h<C10130f, AbstractC10616g> interfaceC10291h;
        AbstractC10616g invoke;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m33399F0(c10130f, interfaceC9906b);
        C9968g c9968g = (C9968g) m33455B();
        return (c9968g == null || (interfaceC10291h = c9968g.f38067t) == null || (invoke = interfaceC10291h.invoke(c10130f)) == null) ? this.f38067t.invoke(c10130f) : invoke;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: l */
    protected Set<C10130f> mo33404l(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        Set<C10130f> m38925l;
        C9768m.m32346f(c10214d, "kindFilter");
        m38925l = C10791x0.m38925l(this.f38065r.invoke(), this.f38066s.invoke().keySet());
        return m38925l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: o */
    protected void mo33406o(Collection<InterfaceC10706y0> collection, C10130f c10130f) {
        C9768m.m32346f(collection, "result");
        C9768m.m32346f(c10130f, "name");
        if (this.f38062o.mo33602t() && m33462y().invoke().mo33300b(c10130f) != null) {
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC10706y0) it.next()).mo37028f().isEmpty()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                InterfaceC10013w mo33300b = m33462y().invoke().mo33300b(c10130f);
                C9768m.m32343c(mo33300b);
                collection.add(m33358H0(mo33300b));
            }
        }
        m33461w().m33282a().m33263w().mo36094b(mo33398C(), c10130f, collection);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: r */
    protected void mo33408r(Collection<InterfaceC10706y0> collection, C10130f c10130f) {
        boolean z;
        C9768m.m32346f(collection, "result");
        C9768m.m32346f(c10130f, "name");
        Set<InterfaceC10706y0> m33396x0 = m33396x0(c10130f);
        if (!C9926h0.f37865a.m33134k(c10130f) && !C9921f.f37848n.m33089l(c10130f)) {
            if (!(m33396x0 instanceof Collection) || !m33396x0.isEmpty()) {
                Iterator<T> it = m33396x0.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC10705y) it.next()).isSuspend()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m33396x0) {
                    if (m33353B0((InterfaceC10706y0) obj)) {
                        arrayList.add(obj);
                    }
                }
                m33371V(collection, c10130f, arrayList, false);
                return;
            }
        }
        C10739f m38544a = C10739f.f41432f.m38544a();
        Collection<? extends InterfaceC10706y0> m33151d = C9930a.m33151d(c10130f, m33396x0, C10784u.m38888j(), mo33398C(), InterfaceC10275r.f39954a, m33461w().m33282a().m33251k().mo36948a());
        C9768m.m32345e(m33151d, "resolveOverridesForNonSt….overridingUtil\n        )");
        m33372W(c10130f, collection, m33151d, collection, new b(this));
        m33372W(c10130f, collection, m33151d, m38544a, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : m33396x0) {
            if (m33353B0((InterfaceC10706y0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m33371V(collection, c10130f, C10749c0.m38609o0(arrayList2, m38544a), true);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: s */
    protected void mo33409s(C10130f c10130f, Collection<InterfaceC10696t0> collection) {
        Set<? extends InterfaceC10696t0> m38923j;
        Set m38925l;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(collection, "result");
        if (this.f38062o.mo33601r()) {
            m33374Y(c10130f, collection);
        }
        Set<InterfaceC10696t0> m33397z0 = m33397z0(c10130f);
        if (m33397z0.isEmpty()) {
            return;
        }
        C10739f.b bVar = C10739f.f41432f;
        C10739f m38544a = bVar.m38544a();
        C10739f m38544a2 = bVar.m38544a();
        m33373X(m33397z0, collection, m38544a, new d());
        m38923j = C10791x0.m38923j(m33397z0, m38544a);
        m33373X(m38923j, m38544a2, null, new e());
        m38925l = C10791x0.m38925l(m33397z0, m38544a2);
        Collection<? extends InterfaceC10696t0> m33151d = C9930a.m33151d(c10130f, m38925l, collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
        C9768m.m32345e(m33151d, "resolveOverridesForNonSt…rridingUtil\n            )");
        collection.addAll(m33151d);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: t */
    protected Set<C10130f> mo33410t(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        if (this.f38062o.mo33601r()) {
            return mo33312b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m33462y().invoke().mo33303e());
        Collection<AbstractC10311e0> mo35998a = mo33398C().mo32877h().mo35998a();
        C9768m.m32345e(mo35998a, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = mo35998a.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(linkedHashSet, ((AbstractC10311e0) it.next()).mo33553q().mo33314d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    public String toString() {
        return "Lazy Java member scope for " + this.f38062o.mo33596d();
    }

    /* renamed from: w0 */
    public final InterfaceC10292i<List<InterfaceC10549d>> m33411w0() {
        return this.f38064q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10552e mo33398C() {
        return this.f38061n;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: z */
    protected InterfaceC10702w0 mo33413z() {
        return C10154d.m35824l(mo33398C());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9968g(C9957g c9957g, InterfaceC10552e interfaceC10552e, InterfaceC9997g interfaceC9997g, boolean z, C9968g c9968g) {
        super(c9957g, c9968g);
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC10552e, "ownerDescriptor");
        C9768m.m32346f(interfaceC9997g, "jClass");
        this.f38061n = interfaceC10552e;
        this.f38062o = interfaceC9997g;
        this.f38063p = z;
        this.f38064q = c9957g.m33286e().mo36516d(new f(c9957g));
        this.f38065r = c9957g.m33286e().mo36516d(new i());
        this.f38066s = c9957g.m33286e().mo36516d(new g());
        this.f38067t = c9957g.m33286e().mo36521i(new j(c9957g));
    }
}
