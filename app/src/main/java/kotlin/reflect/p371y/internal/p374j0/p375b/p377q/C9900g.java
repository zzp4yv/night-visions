package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9755f0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10693s;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10586f;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.C10600d;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643z;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10618h;
import kotlin.reflect.jvm.internal.impl.utils.C10735b;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9899f;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9908d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9967f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9968g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10072u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10073v;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10075x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10284a;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10320h0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.g */
/* loaded from: classes2.dex */
public final class C9900g implements InterfaceC10597a, InterfaceC10599c {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f37715a = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9900g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9900g.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9757g0.m32304h(new C9786y(C9757g0.m32298b(C9900g.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: b */
    private final InterfaceC10559g0 f37716b;

    /* renamed from: c */
    private final C9897d f37717c;

    /* renamed from: d */
    private final InterfaceC10292i f37718d;

    /* renamed from: e */
    private final AbstractC10311e0 f37719e;

    /* renamed from: f */
    private final InterfaceC10292i f37720f;

    /* renamed from: g */
    private final InterfaceC10284a<C10127c, InterfaceC10552e> f37721g;

    /* renamed from: h */
    private final InterfaceC10292i f37722h;

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$a */
    private enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37728a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.HIDDEN.ordinal()] = 1;
            iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            iArr[a.DROP.ordinal()] = 3;
            iArr[a.VISIBLE.ordinal()] = 4;
            f37728a = iArr;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$c */
    static final class c extends Lambda implements Function0<AbstractC10335m0> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10297n f37730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10297n interfaceC10297n) {
            super(0);
            this.f37730g = interfaceC10297n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke() {
            return C10703x.m38151c(C9900g.this.m32976s().m32959a(), C9898e.f37688a.m32950a(), new C10568j0(this.f37730g, C9900g.this.m32976s().m32959a())).mo36400s();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$d */
    public static final class d extends AbstractC10643z {
        d(InterfaceC10559g0 interfaceC10559g0, C10127c c10127c) {
            super(interfaceC10559g0, c10127c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public InterfaceC10218h.b mo32988q() {
            return InterfaceC10218h.b.f39671b;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$e */
    static final class e extends Lambda implements Function0<AbstractC10311e0> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke() {
            AbstractC10335m0 m32791i = C9900g.this.f37716b.mo37021o().m32791i();
            C9768m.m32345e(m32791i, "moduleDescriptor.builtIns.anyType");
            return m32791i;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$f */
    static final class f extends Lambda implements Function0<InterfaceC10552e> {

        /* renamed from: f */
        final /* synthetic */ C9967f f37732f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10552e f37733g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C9967f c9967f, InterfaceC10552e interfaceC10552e) {
            super(0);
            this.f37732f = c9967f;
            this.f37733g = interfaceC10552e;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10552e invoke() {
            C9967f c9967f = this.f37732f;
            InterfaceC9936g interfaceC9936g = InterfaceC9936g.f37920a;
            C9768m.m32345e(interfaceC9936g, "EMPTY");
            return c9967f.m33341O0(interfaceC9936g, this.f37733g);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$g */
    static final class g extends Lambda implements Function1<InterfaceC10218h, Collection<? extends InterfaceC10706y0>> {

        /* renamed from: f */
        final /* synthetic */ C10130f f37734f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C10130f c10130f) {
            super(1);
            this.f37734f = c10130f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10706y0> invoke(InterfaceC10218h interfaceC10218h) {
            C9768m.m32346f(interfaceC10218h, "it");
            return interfaceC10218h.mo33311a(this.f37734f, EnumC9908d.FROM_BUILTINS);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$h */
    static final class h<N> implements C10735b.c {
        h() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10552e> mo32992a(InterfaceC10552e interfaceC10552e) {
            Collection<AbstractC10311e0> mo35998a = interfaceC10552e.mo32877h().mo35998a();
            C9768m.m32345e(mo35998a, "it.typeConstructor.supertypes");
            C9900g c9900g = C9900g.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = mo35998a.iterator();
            while (it.hasNext()) {
                InterfaceC10561h mo32891w = ((AbstractC10311e0) it.next()).mo35993O0().mo32891w();
                InterfaceC10561h mo37019a = mo32891w != null ? mo32891w.mo37019a() : null;
                InterfaceC10552e interfaceC10552e2 = mo37019a instanceof InterfaceC10552e ? (InterfaceC10552e) mo37019a : null;
                C9967f m32973p = interfaceC10552e2 != null ? c9900g.m32973p(interfaceC10552e2) : null;
                if (m32973p != null) {
                    arrayList.add(m32973p);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$i */
    public static final class i extends C10735b.b<InterfaceC10552e, a> {

        /* renamed from: a */
        final /* synthetic */ String f37736a;

        /* renamed from: b */
        final /* synthetic */ C9755f0<a> f37737b;

        i(String str, C9755f0<a> c9755f0) {
            this.f37736a = str;
            this.f37737b = c9755f0;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.f0.y.e.j0.b.q.g$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.f0.y.e.j0.b.q.g$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.f0.y.e.j0.b.q.g$a] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo32995c(InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "javaClassDescriptor");
            String m34036a = C10072u.m34036a(C10075x.f38488a, interfaceC10552e, this.f37736a);
            C9902i c9902i = C9902i.f37742a;
            if (c9902i.m33006e().contains(m34036a)) {
                this.f37737b.f37179f = a.HIDDEN;
            } else if (c9902i.m33009h().contains(m34036a)) {
                this.f37737b.f37179f = a.VISIBLE;
            } else if (c9902i.m33004c().contains(m34036a)) {
                this.f37737b.f37179f = a.DROP;
            }
            return this.f37737b.f37179f == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo32994a() {
            a aVar = this.f37737b.f37179f;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$j */
    static final class j<N> implements C10735b.c {

        /* renamed from: a */
        public static final j<N> f37738a = new j<>();

        j() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10543b> mo32992a(InterfaceC10543b interfaceC10543b) {
            return interfaceC10543b.mo37019a().mo37027e();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$k */
    static final class k extends Lambda implements Function1<InterfaceC10543b, Boolean> {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10543b interfaceC10543b) {
            boolean z;
            if (interfaceC10543b.mo37030i() == InterfaceC10543b.a.DECLARATION) {
                C9897d c9897d = C9900g.this.f37717c;
                InterfaceC10576m mo32876b = interfaceC10543b.mo32876b();
                C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (c9897d.m32939c((InterfaceC10552e) mo32876b)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.g$l */
    static final class l extends Lambda implements Function0<InterfaceC10587g> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10587g invoke() {
            return InterfaceC10587g.f40808c.m37734a(C10782t.m38883e(C10586f.m37732b(C9900g.this.f37716b.mo37021o(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
        }
    }

    public C9900g(InterfaceC10559g0 interfaceC10559g0, InterfaceC10297n interfaceC10297n, Function0<C9899f.b> function0) {
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(function0, "settingsComputation");
        this.f37716b = interfaceC10559g0;
        this.f37717c = C9897d.f37687a;
        this.f37718d = interfaceC10297n.mo36516d(function0);
        this.f37719e = m32969k(interfaceC10297n);
        this.f37720f = interfaceC10297n.mo36516d(new c(interfaceC10297n));
        this.f37721g = interfaceC10297n.mo36514b();
        this.f37722h = interfaceC10297n.mo36516d(new l());
    }

    /* renamed from: j */
    private final InterfaceC10706y0 m32968j(C10254d c10254d, InterfaceC10706y0 interfaceC10706y0) {
        InterfaceC10705y.a<? extends InterfaceC10706y0> mo36992u = interfaceC10706y0.mo36992u();
        mo36992u.mo37009p(c10254d);
        mo36992u.mo37008o(C10695t.f41220e);
        mo36992u.mo37000g(c10254d.mo36400s());
        mo36992u.mo36998e(c10254d.mo37677K0());
        InterfaceC10706y0 mo36996c = mo36992u.mo36996c();
        C9768m.m32343c(mo36996c);
        return mo36996c;
    }

    /* renamed from: k */
    private final AbstractC10311e0 m32969k(InterfaceC10297n interfaceC10297n) {
        Set<InterfaceC10549d> m38917d;
        C10618h c10618h = new C10618h(new d(this.f37716b, new C10127c("java.io")), C10130f.m35454x("Serializable"), EnumC10550d0.ABSTRACT, EnumC10555f.INTERFACE, C10782t.m38883e(new C10320h0(interfaceC10297n, new e())), InterfaceC10708z0.f41247a, false, interfaceC10297n);
        InterfaceC10218h.b bVar = InterfaceC10218h.b.f39671b;
        m38917d = C10789w0.m38917d();
        c10618h.m37854L0(bVar, m38917d, null);
        AbstractC10335m0 mo36400s = c10618h.mo36400s();
        C9768m.m32345e(mo36400s, "mockSerializableClass.defaultType");
        return mo36400s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (m32977t(r3, r10) != false) goto L19;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0> m32970l(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e r10, kotlin.jvm.functions.Function1<? super kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0>> r11) {
        /*
            r9 = this;
            kotlin.f0.y.e.j0.d.a.l0.l.f r0 = r9.m32973p(r10)
            if (r0 != 0) goto Lb
            java.util.List r10 = kotlin.collections.C10780s.m38848j()
            return r10
        Lb:
            kotlin.f0.y.e.j0.b.q.d r1 = r9.f37717c
            kotlin.f0.y.e.j0.f.c r2 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36074h(r0)
            kotlin.f0.y.e.j0.b.q.b$a r3 = kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9895b.f37665h
            kotlin.f0.y.e.j0.b.h r3 = r3.m32915a()
            java.util.Collection r1 = r1.m32942g(r2, r3)
            java.lang.Object r2 = kotlin.collections.C10780s.m38845h0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e) r2
            if (r2 != 0) goto L28
            java.util.List r10 = kotlin.collections.C10780s.m38848j()
            return r10
        L28:
            kotlin.reflect.jvm.internal.impl.utils.f$b r3 = kotlin.reflect.jvm.internal.impl.utils.C10739f.f41432f
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10780s.m38869u(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e) r5
            kotlin.f0.y.e.j0.f.c r5 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36074h(r5)
            r4.add(r5)
            goto L39
        L4d:
            kotlin.reflect.jvm.internal.impl.utils.f r1 = r3.m38545b(r4)
            kotlin.f0.y.e.j0.b.q.d r3 = r9.f37717c
            boolean r10 = r3.m32939c(r10)
            kotlin.f0.y.e.j0.k.a<kotlin.f0.y.e.j0.f.c, kotlin.reflect.jvm.internal.impl.descriptors.e> r3 = r9.f37721g
            kotlin.f0.y.e.j0.f.c r4 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36074h(r0)
            kotlin.f0.y.e.j0.b.q.g$f r5 = new kotlin.f0.y.e.j0.b.q.g$f
            r5.<init>(r0, r2)
            java.lang.Object r0 = r3.mo36506b(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e) r0
            kotlin.f0.y.e.j0.i.w.h r0 = r0.mo33340D0()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            kotlin.jvm.internal.C9768m.m32345e(r0, r2)
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L80:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r11.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r4 = r3.mo37030i()
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r5 = kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b.a.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L99
        L97:
            r6 = 0
            goto Led
        L99:
            kotlin.reflect.jvm.internal.impl.descriptors.u r4 = r3.getVisibility()
            boolean r4 = r4.m38148d()
            if (r4 != 0) goto La4
            goto L97
        La4:
            boolean r4 = kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h.m32747j0(r3)
            if (r4 == 0) goto Lab
            goto L97
        Lab:
            java.util.Collection r4 = r3.mo37027e()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            kotlin.jvm.internal.C9768m.m32345e(r4, r5)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto Lc0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Lc0
        Lbe:
            r4 = 0
            goto Le4
        Lc0:
            java.util.Iterator r4 = r4.iterator()
        Lc4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbe
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y) r5
            kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.mo32876b()
            java.lang.String r8 = "it.containingDeclaration"
            kotlin.jvm.internal.C9768m.m32345e(r5, r8)
            kotlin.f0.y.e.j0.f.c r5 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36074h(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto Lc4
            r4 = 1
        Le4:
            if (r4 == 0) goto Le7
            goto L97
        Le7:
            boolean r3 = r9.m32977t(r3, r10)
            if (r3 != 0) goto L97
        Led:
            if (r6 == 0) goto L80
            r0.add(r2)
            goto L80
        Lf3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9900g.m32970l(kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.a0.c.l):java.util.Collection");
    }

    /* renamed from: m */
    private final AbstractC10335m0 m32971m() {
        return (AbstractC10335m0) C10296m.m36555a(this.f37720f, this, f37715a[1]);
    }

    /* renamed from: n */
    private static final boolean m32972n(InterfaceC10573l interfaceC10573l, C10333l1 c10333l1, InterfaceC10573l interfaceC10573l2) {
        return C10160j.m35880x(interfaceC10573l, interfaceC10573l2.mo36396c(c10333l1)) == C10160j.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final C9967f m32973p(InterfaceC10552e interfaceC10552e) {
        C10126b m32929n;
        C10127c m35409b;
        if (AbstractC9881h.m32734a0(interfaceC10552e) || !AbstractC9881h.m32726A0(interfaceC10552e)) {
            return null;
        }
        C10128d m36075i = C10202a.m36075i(interfaceC10552e);
        if (!m36075i.m35435f() || (m32929n = C9896c.f37667a.m32929n(m36075i)) == null || (m35409b = m32929n.m35409b()) == null) {
            return null;
        }
        InterfaceC10552e m38125c = C10693s.m38125c(m32976s().m32959a(), m35409b, EnumC9908d.FROM_BUILTINS);
        if (m38125c instanceof C9967f) {
            return (C9967f) m38125c;
        }
        return null;
    }

    /* renamed from: q */
    private final a m32974q(InterfaceC10705y interfaceC10705y) {
        InterfaceC10576m mo32876b = interfaceC10705y.mo32876b();
        C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object m38516b = C10735b.m38516b(C10782t.m38883e((InterfaceC10552e) mo32876b), new h(), new i(C10073v.m34039c(interfaceC10705y, false, false, 3, null), new C9755f0()));
        C9768m.m32345e(m38516b, "private fun FunctionDesc…ERED\n            })\n    }");
        return (a) m38516b;
    }

    /* renamed from: r */
    private final InterfaceC10587g m32975r() {
        return (InterfaceC10587g) C10296m.m36555a(this.f37722h, this, f37715a[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final C9899f.b m32976s() {
        return (C9899f.b) C10296m.m36555a(this.f37718d, this, f37715a[0]);
    }

    /* renamed from: t */
    private final boolean m32977t(InterfaceC10706y0 interfaceC10706y0, boolean z) {
        InterfaceC10576m mo32876b = interfaceC10706y0.mo32876b();
        C9768m.m32344d(mo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String m34039c = C10073v.m34039c(interfaceC10706y0, false, false, 3, null);
        if (z ^ C9902i.f37742a.m33007f().contains(C10072u.m34036a(C10075x.f38488a, (InterfaceC10552e) mo32876b, m34039c))) {
            return true;
        }
        Boolean m38519e = C10735b.m38519e(C10782t.m38883e(interfaceC10706y0), j.f37738a, new k());
        C9768m.m32345e(m38519e, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return m38519e.booleanValue();
    }

    /* renamed from: u */
    private final boolean m32978u(InterfaceC10573l interfaceC10573l, InterfaceC10552e interfaceC10552e) {
        if (interfaceC10573l.mo37028f().size() == 1) {
            List<InterfaceC10566i1> mo37028f = interfaceC10573l.mo37028f();
            C9768m.m32345e(mo37028f, "valueParameters");
            InterfaceC10561h mo32891w = ((InterfaceC10566i1) C10780s.m38866s0(mo37028f)).getType().mo35993O0().mo32891w();
            if (C9768m.m32341a(mo32891w != null ? C10202a.m36075i(mo32891w) : null, C10202a.m36075i(interfaceC10552e))) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
    /* renamed from: a */
    public Collection<InterfaceC10549d> mo32979a(InterfaceC10552e interfaceC10552e) {
        InterfaceC10552e m32936f;
        boolean z;
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        if (interfaceC10552e.mo32878i() != EnumC10555f.CLASS || !m32976s().m32960b()) {
            return C10784u.m38888j();
        }
        C9967f m32973p = m32973p(interfaceC10552e);
        if (m32973p != null && (m32936f = C9897d.m32936f(this.f37717c, C10202a.m36074h(m32973p), C9895b.f37665h.m32915a(), null, 4, null)) != null) {
            C10333l1 m36726c = C9903j.m33012a(m32936f, m32973p).m36726c();
            List<InterfaceC10549d> mo32880k = m32973p.mo32880k();
            ArrayList<InterfaceC10549d> arrayList = new ArrayList();
            Iterator<T> it = mo32880k.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC10549d interfaceC10549d = (InterfaceC10549d) next;
                if (interfaceC10549d.getVisibility().m38148d()) {
                    Collection<InterfaceC10549d> mo32880k2 = m32936f.mo32880k();
                    C9768m.m32345e(mo32880k2, "defaultKotlinVersion.constructors");
                    if (!(mo32880k2 instanceof Collection) || !mo32880k2.isEmpty()) {
                        for (InterfaceC10549d interfaceC10549d2 : mo32880k2) {
                            C9768m.m32345e(interfaceC10549d2, "it");
                            if (m32972n(interfaceC10549d2, m36726c, interfaceC10549d)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z && !m32978u(interfaceC10549d, interfaceC10552e) && !AbstractC9881h.m32747j0(interfaceC10549d) && !C9902i.f37742a.m33005d().contains(C10072u.m34036a(C10075x.f38488a, m32973p, C10073v.m34039c(interfaceC10549d, false, false, 3, null)))) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(arrayList, 10));
            for (InterfaceC10549d interfaceC10549d3 : arrayList) {
                InterfaceC10705y.a<? extends InterfaceC10705y> mo36992u = interfaceC10549d3.mo36992u();
                mo36992u.mo37009p(interfaceC10552e);
                mo36992u.mo37000g(interfaceC10552e.mo36400s());
                mo36992u.mo36999f();
                mo36992u.mo37005l(m36726c.m36755j());
                if (!C9902i.f37742a.m33008g().contains(C10072u.m34036a(C10075x.f38488a, m32973p, C10073v.m34039c(interfaceC10549d3, false, false, 3, null)))) {
                    mo36992u.mo37012s(m32975r());
                }
                InterfaceC10705y mo36996c = mo36992u.mo36996c();
                C9768m.m32344d(mo36996c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((InterfaceC10549d) mo36996c);
            }
            return arrayList2;
        }
        return C10784u.m38888j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r2 != 3) goto L42;
     */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0> mo32980b(kotlin.reflect.p371y.internal.p374j0.p397f.C10130f r7, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9900g.mo32980b(kotlin.f0.y.e.j0.f.f, kotlin.reflect.jvm.internal.impl.descriptors.e):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c
    /* renamed from: c */
    public boolean mo32981c(InterfaceC10552e interfaceC10552e, InterfaceC10706y0 interfaceC10706y0) {
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        C9768m.m32346f(interfaceC10706y0, "functionDescriptor");
        C9967f m32973p = m32973p(interfaceC10552e);
        if (m32973p == null || !interfaceC10706y0.getAnnotations().mo33270R0(C10600d.m37747a())) {
            return true;
        }
        if (!m32976s().m32960b()) {
            return false;
        }
        String m34039c = C10073v.m34039c(interfaceC10706y0, false, false, 3, null);
        C9968g mo33340D0 = m32973p.mo33340D0();
        C10130f name = interfaceC10706y0.getName();
        C9768m.m32345e(name, "functionDescriptor.name");
        Collection<InterfaceC10706y0> mo33311a = mo33340D0.mo33311a(name, EnumC9908d.FROM_BUILTINS);
        if (!(mo33311a instanceof Collection) || !mo33311a.isEmpty()) {
            Iterator<T> it = mo33311a.iterator();
            while (it.hasNext()) {
                if (C9768m.m32341a(C10073v.m34039c((InterfaceC10706y0) it.next(), false, false, 3, null), m34039c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
    /* renamed from: d */
    public Collection<AbstractC10311e0> mo32982d(InterfaceC10552e interfaceC10552e) {
        List m38891m;
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        C10128d m36075i = C10202a.m36075i(interfaceC10552e);
        C9902i c9902i = C9902i.f37742a;
        if (!c9902i.m33010i(m36075i)) {
            return c9902i.m33011j(m36075i) ? C10782t.m38883e(this.f37719e) : C10784u.m38888j();
        }
        AbstractC10335m0 m32971m = m32971m();
        C9768m.m32345e(m32971m, "cloneableType");
        m38891m = C10784u.m38891m(m32971m, this.f37719e);
        return m38891m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Set<C10130f> mo32983e(InterfaceC10552e interfaceC10552e) {
        Set<C10130f> m38917d;
        C9968g mo33340D0;
        Set<C10130f> mo33312b;
        Set<C10130f> m38917d2;
        C9768m.m32346f(interfaceC10552e, "classDescriptor");
        if (!m32976s().m32960b()) {
            m38917d2 = C10789w0.m38917d();
            return m38917d2;
        }
        C9967f m32973p = m32973p(interfaceC10552e);
        if (m32973p != null && (mo33340D0 = m32973p.mo33340D0()) != null && (mo33312b = mo33340D0.mo33312b()) != null) {
            return mo33312b;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }
}
