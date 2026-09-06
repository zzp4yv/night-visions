package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10737d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.EnumC9993d0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10067p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10066o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10053a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;

/* compiled from: LazyJavaPackageScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i */
/* loaded from: classes2.dex */
public final class C9970i extends AbstractC9973l {

    /* renamed from: n */
    private final InterfaceC10011u f38092n;

    /* renamed from: o */
    private final C9969h f38093o;

    /* renamed from: p */
    private final InterfaceC10293j<Set<String>> f38094p;

    /* renamed from: q */
    private final InterfaceC10291h<a, InterfaceC10552e> f38095q;

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$a */
    private static final class a {

        /* renamed from: a */
        private final C10130f f38096a;

        /* renamed from: b */
        private final InterfaceC9997g f38097b;

        public a(C10130f c10130f, InterfaceC9997g interfaceC9997g) {
            C9768m.m32346f(c10130f, "name");
            this.f38096a = c10130f;
            this.f38097b = interfaceC9997g;
        }

        /* renamed from: a */
        public final InterfaceC9997g m33438a() {
            return this.f38097b;
        }

        /* renamed from: b */
        public final C10130f m33439b() {
            return this.f38096a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C9768m.m32341a(this.f38096a, ((a) obj).f38096a);
        }

        public int hashCode() {
            return this.f38096a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b */
    private static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b$a */
        public static final class a extends b {

            /* renamed from: a */
            private final InterfaceC10552e f38098a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC10552e interfaceC10552e) {
                super(null);
                C9768m.m32346f(interfaceC10552e, "descriptor");
                this.f38098a = interfaceC10552e;
            }

            /* renamed from: a */
            public final InterfaceC10552e m33440a() {
                return this.f38098a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b$b, reason: collision with other inner class name */
        public static final class C11497b extends b {

            /* renamed from: a */
            public static final C11497b f38099a = new C11497b();

            private C11497b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$b$c */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f38100a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$c */
    static final class c extends Lambda implements Function1<a, InterfaceC10552e> {

        /* renamed from: g */
        final /* synthetic */ C9957g f38102g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C9957g c9957g) {
            super(1);
            this.f38102g = c9957g;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10552e invoke(a aVar) {
            byte[] bArr;
            C9768m.m32346f(aVar, "request");
            C10126b c10126b = new C10126b(C9970i.this.mo33398C().mo37712d(), aVar.m33439b());
            InterfaceC10066o.a mo34018a = aVar.m33438a() != null ? this.f38102g.m33282a().m33250j().mo34018a(aVar.m33438a()) : this.f38102g.m33282a().m33250j().mo34019c(c10126b);
            InterfaceC10068q m34020a = mo34018a != null ? mo34018a.m34020a() : null;
            C10126b mo34028e = m34020a != null ? m34020a.mo34028e() : null;
            if (mo34028e != null && (mo34028e.m35417l() || mo34028e.m35416k())) {
                return null;
            }
            b m33434R = C9970i.this.m33434R(m34020a);
            if (m33434R instanceof b.a) {
                return ((b.a) m33434R).m33440a();
            }
            if (m33434R instanceof b.c) {
                return null;
            }
            if (!(m33434R instanceof b.C11497b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC9997g m33438a = aVar.m33438a();
            if (m33438a == null) {
                InterfaceC10017o m33244d = this.f38102g.m33282a().m33244d();
                if (mo34018a != null) {
                    if (!(mo34018a instanceof InterfaceC10066o.a.C11503a)) {
                        mo34018a = null;
                    }
                    InterfaceC10066o.a.C11503a c11503a = (InterfaceC10066o.a.C11503a) mo34018a;
                    if (c11503a != null) {
                        bArr = c11503a.m34021b();
                        m33438a = m33244d.mo33629a(new InterfaceC10017o.b(c10126b, bArr, null, 4, null));
                    }
                }
                bArr = null;
                m33438a = m33244d.mo33629a(new InterfaceC10017o.b(c10126b, bArr, null, 4, null));
            }
            InterfaceC9997g interfaceC9997g = m33438a;
            if ((interfaceC9997g != null ? interfaceC9997g.mo33591I() : null) != EnumC9993d0.BINARY) {
                C10127c mo33596d = interfaceC9997g != null ? interfaceC9997g.mo33596d() : null;
                if (mo33596d == null || mo33596d.m35422d() || !C9768m.m32341a(mo33596d.m35423e(), C9970i.this.mo33398C().mo37712d())) {
                    return null;
                }
                C9967f c9967f = new C9967f(this.f38102g, C9970i.this.mo33398C(), interfaceC9997g, null, 8, null);
                this.f38102g.m33282a().m33245e().mo33782a(c9967f);
                return c9967f;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + interfaceC9997g + "\nClassId: " + c10126b + "\nfindKotlinClass(JavaClass) = " + C10067p.m34023a(this.f38102g.m33282a().m33250j(), interfaceC9997g) + "\nfindKotlinClass(ClassId) = " + C10067p.m34024b(this.f38102g.m33282a().m33250j(), c10126b) + '\n');
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.i$d */
    static final class d extends Lambda implements Function0<Set<? extends String>> {

        /* renamed from: f */
        final /* synthetic */ C9957g f38103f;

        /* renamed from: g */
        final /* synthetic */ C9970i f38104g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C9957g c9957g, C9970i c9970i) {
            super(0);
            this.f38103f = c9957g;
            this.f38104g = c9970i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<String> invoke() {
            return this.f38103f.m33282a().m33244d().mo33630b(this.f38104g.mo33398C().mo37712d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9970i(C9957g c9957g, InterfaceC10011u interfaceC10011u, C9969h c9969h) {
        super(c9957g);
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(interfaceC10011u, "jPackage");
        C9768m.m32346f(c9969h, "ownerDescriptor");
        this.f38092n = interfaceC10011u;
        this.f38093o = c9969h;
        this.f38094p = c9957g.m33286e().mo36518f(new d(c9957g, this));
        this.f38095q = c9957g.m33286e().mo36521i(new c(c9957g));
    }

    /* renamed from: N */
    private final InterfaceC10552e m33433N(C10130f c10130f, InterfaceC9997g interfaceC9997g) {
        if (!C10132h.f39265a.m35461a(c10130f)) {
            return null;
        }
        Set<String> invoke = this.f38094p.invoke();
        if (interfaceC9997g != null || invoke == null || invoke.contains(c10130f.m35455k())) {
            return this.f38095q.invoke(new a(c10130f, interfaceC9997g));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final b m33434R(InterfaceC10068q interfaceC10068q) {
        if (interfaceC10068q == null) {
            return b.C11497b.f38099a;
        }
        if (interfaceC10068q.mo34025a().m33913c() != C10053a.a.CLASS) {
            return b.c.f38100a;
        }
        InterfaceC10552e m33973k = m33461w().m33282a().m33242b().m33973k(interfaceC10068q);
        return m33973k != null ? new b.a(m33973k) : b.C11497b.f38099a;
    }

    /* renamed from: O */
    public final InterfaceC10552e m33435O(InterfaceC9997g interfaceC9997g) {
        C9768m.m32346f(interfaceC9997g, "javaClass");
        return m33433N(interfaceC9997g.getName(), interfaceC9997g);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC10552e mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return m33433N(c10130f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C9969h mo33398C() {
        return this.f38093o;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return C10784u.m38888j();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[SYNTHETIC] */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m> mo33317g(kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.p371y.internal.p374j0.p397f.C10130f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C9768m.m32346f(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C9768m.m32346f(r6, r0)
            kotlin.f0.y.e.j0.i.w.d$a r0 = kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d.f39630a
            int r1 = r0.m36144c()
            int r0 = r0.m36146e()
            r0 = r0 | r1
            boolean r5 = r5.m36137a(r0)
            if (r5 != 0) goto L20
            java.util.List r5 = kotlin.collections.C10780s.m38848j()
            goto L65
        L20:
            kotlin.f0.y.e.j0.k.i r5 = r4.m33460v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
            if (r3 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e) r2
            kotlin.f0.y.e.j0.f.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.C9768m.m32345e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L33
            r0.add(r1)
            goto L33
        L64:
            r5 = r0
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9970i.mo33317g(kotlin.f0.y.e.j0.i.w.d, kotlin.a0.c.l):java.util.Collection");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: l */
    protected Set<C10130f> mo33404l(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        Set<C10130f> m38917d;
        C9768m.m32346f(c10214d, "kindFilter");
        if (!c10214d.m36137a(C10214d.f39630a.m36146e())) {
            m38917d = C10789w0.m38917d();
            return m38917d;
        }
        Set<String> invoke = this.f38094p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(C10130f.m35454x((String) it.next()));
            }
            return hashSet;
        }
        InterfaceC10011u interfaceC10011u = this.f38092n;
        if (function1 == null) {
            function1 = C10737d.m38525a();
        }
        Collection<InterfaceC9997g> mo33626q = interfaceC10011u.mo33626q(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC9997g interfaceC9997g : mo33626q) {
            C10130f name = interfaceC9997g.mo33591I() == EnumC9993d0.SOURCE ? null : interfaceC9997g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: n */
    protected Set<C10130f> mo33405n(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        Set<C10130f> m38917d;
        C9768m.m32346f(c10214d, "kindFilter");
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: p */
    protected InterfaceC9963b mo33407p() {
        return InterfaceC9963b.a.f38018a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: r */
    protected void mo33408r(Collection<InterfaceC10706y0> collection, C10130f c10130f) {
        C9768m.m32346f(collection, "result");
        C9768m.m32346f(c10130f, "name");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC9971j
    /* renamed from: t */
    protected Set<C10130f> mo33410t(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        Set<C10130f> m38917d;
        C9768m.m32346f(c10214d, "kindFilter");
        m38917d = C10789w0.m38917d();
        return m38917d;
    }
}
