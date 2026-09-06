package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10611d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10613e0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10632o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10090b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10106r;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10109u;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10099k;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10112x;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10121f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10153c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10251a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10253c;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10260j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10261k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10262l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10264n;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: MemberDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.w */
/* loaded from: classes3.dex */
public final class C10280w {

    /* renamed from: a */
    private final C10270m f39961a;

    /* renamed from: b */
    private final C10243e f39962b;

    /* compiled from: MemberDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.w$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10583c>> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10723o f39964g;

        /* renamed from: h */
        final /* synthetic */ EnumC10237b f39965h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
            super(0);
            this.f39964g = interfaceC10723o;
            this.f39965h = enumC10237b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            List<? extends InterfaceC10583c> list;
            C10280w c10280w = C10280w.this;
            AbstractC10283z m36477c = c10280w.m36477c(c10280w.f39961a.m36454e());
            if (m36477c != null) {
                list = C10749c0.m38569E0(C10280w.this.f39961a.m36452c().m36419d().mo33878j(m36477c, this.f39964g, this.f39965h));
            } else {
                list = null;
            }
            return list == null ? C10784u.m38888j() : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.w$b */
    static final class b extends Lambda implements Function0<List<? extends InterfaceC10583c>> {

        /* renamed from: g */
        final /* synthetic */ boolean f39967g;

        /* renamed from: h */
        final /* synthetic */ C10102n f39968h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, C10102n c10102n) {
            super(0);
            this.f39967g = z;
            this.f39968h = c10102n;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            List<? extends InterfaceC10583c> list;
            C10280w c10280w = C10280w.this;
            AbstractC10283z m36477c = c10280w.m36477c(c10280w.f39961a.m36454e());
            if (m36477c != null) {
                boolean z = this.f39967g;
                C10280w c10280w2 = C10280w.this;
                C10102n c10102n = this.f39968h;
                list = z ? C10749c0.m38569E0(c10280w2.f39961a.m36452c().m36419d().mo33877i(m36477c, c10102n)) : C10749c0.m38569E0(c10280w2.f39961a.m36452c().m36419d().mo33875g(m36477c, c10102n));
            } else {
                list = null;
            }
            return list == null ? C10784u.m38888j() : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.w$c */
    static final class c extends Lambda implements Function0<List<? extends InterfaceC10583c>> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10723o f39970g;

        /* renamed from: h */
        final /* synthetic */ EnumC10237b f39971h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
            super(0);
            this.f39970g = interfaceC10723o;
            this.f39971h = enumC10237b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            List<InterfaceC10583c> list;
            C10280w c10280w = C10280w.this;
            AbstractC10283z m36477c = c10280w.m36477c(c10280w.f39961a.m36454e());
            if (m36477c != null) {
                list = C10280w.this.f39961a.m36452c().m36419d().mo33876h(m36477c, this.f39970g, this.f39971h);
            } else {
                list = null;
            }
            return list == null ? C10784u.m38888j() : list;
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.w$d */
    static final class d extends Lambda implements Function0<InterfaceC10293j<? extends AbstractC10178g<?>>> {

        /* renamed from: g */
        final /* synthetic */ C10102n f39973g;

        /* renamed from: h */
        final /* synthetic */ C10260j f39974h;

        /* compiled from: MemberDeserializer.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.w$d$a */
        static final class a extends Lambda implements Function0<AbstractC10178g<?>> {

            /* renamed from: f */
            final /* synthetic */ C10280w f39975f;

            /* renamed from: g */
            final /* synthetic */ C10102n f39976g;

            /* renamed from: h */
            final /* synthetic */ C10260j f39977h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10280w c10280w, C10102n c10102n, C10260j c10260j) {
                super(0);
                this.f39975f = c10280w;
                this.f39976g = c10102n;
                this.f39977h = c10260j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10178g<?> invoke() {
                C10280w c10280w = this.f39975f;
                AbstractC10283z m36477c = c10280w.m36477c(c10280w.f39961a.m36454e());
                C9768m.m32343c(m36477c);
                InterfaceC10239c<InterfaceC10583c, AbstractC10178g<?>> m36419d = this.f39975f.f39961a.m36452c().m36419d();
                C10102n c10102n = this.f39976g;
                AbstractC10311e0 returnType = this.f39977h.getReturnType();
                C9768m.m32345e(returnType, "property.returnType");
                return m36419d.mo33842e(m36477c, c10102n, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C10102n c10102n, C10260j c10260j) {
            super(0);
            this.f39973g = c10102n;
            this.f39974h = c10260j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10293j<AbstractC10178g<?>> invoke() {
            return C10280w.this.f39961a.m36457h().mo36518f(new a(C10280w.this, this.f39973g, this.f39974h));
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.w$e */
    static final class e extends Lambda implements Function0<InterfaceC10293j<? extends AbstractC10178g<?>>> {

        /* renamed from: g */
        final /* synthetic */ C10102n f39979g;

        /* renamed from: h */
        final /* synthetic */ C10260j f39980h;

        /* compiled from: MemberDeserializer.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.w$e$a */
        static final class a extends Lambda implements Function0<AbstractC10178g<?>> {

            /* renamed from: f */
            final /* synthetic */ C10280w f39981f;

            /* renamed from: g */
            final /* synthetic */ C10102n f39982g;

            /* renamed from: h */
            final /* synthetic */ C10260j f39983h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10280w c10280w, C10102n c10102n, C10260j c10260j) {
                super(0);
                this.f39981f = c10280w;
                this.f39982g = c10102n;
                this.f39983h = c10260j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10178g<?> invoke() {
                C10280w c10280w = this.f39981f;
                AbstractC10283z m36477c = c10280w.m36477c(c10280w.f39961a.m36454e());
                C9768m.m32343c(m36477c);
                InterfaceC10239c<InterfaceC10583c, AbstractC10178g<?>> m36419d = this.f39981f.f39961a.m36452c().m36419d();
                C10102n c10102n = this.f39982g;
                AbstractC10311e0 returnType = this.f39983h.getReturnType();
                C9768m.m32345e(returnType, "property.returnType");
                return m36419d.mo33843k(m36477c, c10102n, returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C10102n c10102n, C10260j c10260j) {
            super(0);
            this.f39979g = c10102n;
            this.f39980h = c10260j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10293j<AbstractC10178g<?>> invoke() {
            return C10280w.this.f39961a.m36457h().mo36518f(new a(C10280w.this, this.f39979g, this.f39980h));
        }
    }

    /* compiled from: MemberDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.w$f */
    static final class f extends Lambda implements Function0<List<? extends InterfaceC10583c>> {

        /* renamed from: g */
        final /* synthetic */ AbstractC10283z f39985g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC10723o f39986h;

        /* renamed from: i */
        final /* synthetic */ EnumC10237b f39987i;

        /* renamed from: j */
        final /* synthetic */ int f39988j;

        /* renamed from: k */
        final /* synthetic */ C10109u f39989k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b, int i2, C10109u c10109u) {
            super(0);
            this.f39985g = abstractC10283z;
            this.f39986h = interfaceC10723o;
            this.f39987i = enumC10237b;
            this.f39988j = i2;
            this.f39989k = c10109u;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            return C10749c0.m38569E0(C10280w.this.f39961a.m36452c().m36419d().mo33871b(this.f39985g, this.f39986h, this.f39987i, this.f39988j, this.f39989k));
        }
    }

    public C10280w(C10270m c10270m) {
        C9768m.m32346f(c10270m, "c");
        this.f39961a = c10270m;
        this.f39962b = new C10243e(c10270m.m36452c().m36431p(), c10270m.m36452c().m36432q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final AbstractC10283z m36477c(InterfaceC10576m interfaceC10576m) {
        if (interfaceC10576m instanceof InterfaceC10571k0) {
            return new AbstractC10283z.b(((InterfaceC10571k0) interfaceC10576m).mo37712d(), this.f39961a.m36456g(), this.f39961a.m36459j(), this.f39961a.m36453d());
        }
        if (interfaceC10576m instanceof C10254d) {
            return ((C10254d) interfaceC10576m).m36286g1();
        }
        return null;
    }

    /* renamed from: d */
    private final InterfaceC10587g m36478d(InterfaceC10723o interfaceC10723o, int i2, EnumC10237b enumC10237b) {
        return !C10117b.f39206c.mo35368d(i2).booleanValue() ? InterfaceC10587g.f40808c.m37735b() : new C10264n(this.f39961a.m36457h(), new a(interfaceC10723o, enumC10237b));
    }

    /* renamed from: e */
    private final InterfaceC10702w0 m36479e() {
        InterfaceC10576m m36454e = this.f39961a.m36454e();
        InterfaceC10552e interfaceC10552e = m36454e instanceof InterfaceC10552e ? (InterfaceC10552e) m36454e : null;
        if (interfaceC10552e != null) {
            return interfaceC10552e.mo37677K0();
        }
        return null;
    }

    /* renamed from: f */
    private final InterfaceC10587g m36480f(C10102n c10102n, boolean z) {
        return !C10117b.f39206c.mo35368d(c10102n.m34885b0()).booleanValue() ? InterfaceC10587g.f40808c.m37735b() : new C10264n(this.f39961a.m36457h(), new b(z, c10102n));
    }

    /* renamed from: g */
    private final InterfaceC10587g m36481g(InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
        return new C10251a(this.f39961a.m36457h(), new c(interfaceC10723o, enumC10237b));
    }

    /* renamed from: h */
    private final void m36482h(C10261k c10261k, InterfaceC10702w0 interfaceC10702w0, InterfaceC10702w0 interfaceC10702w02, List<? extends InterfaceC10702w0> list, List<? extends InterfaceC10554e1> list2, List<? extends InterfaceC10566i1> list3, AbstractC10311e0 abstractC10311e0, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, Map<? extends InterfaceC10540a.a<?>, ?> map) {
        c10261k.mo33214p1(interfaceC10702w0, interfaceC10702w02, list, list2, list3, abstractC10311e0, enumC10550d0, abstractC10697u, map);
    }

    /* renamed from: k */
    private final int m36483k(int i2) {
        return (i2 & 63) + ((i2 >> 8) << 6);
    }

    /* renamed from: n */
    private final InterfaceC10702w0 m36484n(C10105q c10105q, C10270m c10270m, InterfaceC10540a interfaceC10540a) {
        return C10153c.m35784b(interfaceC10540a, c10270m.m36458i().m36231q(c10105q), InterfaceC10587g.f40808c.m37735b());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1> m36485o(java.util.List<kotlin.reflect.p371y.internal.p374j0.p392e.C10109u> r26, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o r27, kotlin.reflect.p371y.internal.p374j0.p410j.p411b.EnumC10237b r28) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10280w.m36485o(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.f0.y.e.j0.j.b.b):java.util.List");
    }

    /* renamed from: i */
    public final InterfaceC10549d m36486i(C10092d c10092d, boolean z) {
        C9768m.m32346f(c10092d, "proto");
        InterfaceC10576m m36454e = this.f39961a.m36454e();
        C9768m.m32344d(m36454e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC10552e interfaceC10552e = (InterfaceC10552e) m36454e;
        int m34537J = c10092d.m34537J();
        EnumC10237b enumC10237b = EnumC10237b.FUNCTION;
        C10253c c10253c = new C10253c(interfaceC10552e, null, m36478d(c10092d, m34537J, enumC10237b), z, InterfaceC10543b.a.DECLARATION, c10092d, this.f39961a.m36456g(), this.f39961a.m36459j(), this.f39961a.m36460k(), this.f39961a.m36453d(), null, 1024, null);
        C10280w m36455f = C10270m.m36450b(this.f39961a, c10253c, C10784u.m38888j(), null, null, null, null, 60, null).m36455f();
        List<C10109u> m34540M = c10092d.m34540M();
        C9768m.m32345e(m34540M, "proto.valueParameterList");
        c10253c.m37844r1(m36455f.m36485o(m34540M, c10092d, enumC10237b), C10238b0.m36208a(C10236a0.f39714a, C10117b.f39207d.mo35368d(c10092d.m34537J())));
        c10253c.m37928h1(interfaceC10552e.mo36400s());
        c10253c.m37923X0(interfaceC10552e.mo32863M());
        c10253c.mo33206Z0(!C10117b.f39217n.mo35368d(c10092d.m34537J()).booleanValue());
        return c10253c;
    }

    /* renamed from: j */
    public final InterfaceC10706y0 m36487j(C10097i c10097i) {
        Map<? extends InterfaceC10540a.a<?>, ?> m38797i;
        AbstractC10311e0 m36231q;
        C9768m.m32346f(c10097i, "proto");
        int m34722d0 = c10097i.m34738t0() ? c10097i.m34722d0() : m36483k(c10097i.m34724f0());
        EnumC10237b enumC10237b = EnumC10237b.FUNCTION;
        InterfaceC10587g m36478d = m36478d(c10097i, m34722d0, enumC10237b);
        InterfaceC10587g m36481g = C10121f.m35385d(c10097i) ? m36481g(c10097i, enumC10237b) : InterfaceC10587g.f40808c.m37735b();
        C10261k c10261k = new C10261k(this.f39961a.m36454e(), null, m36478d, C10281x.m36495b(this.f39961a.m36456g(), c10097i.m34723e0()), C10238b0.m36209b(C10236a0.f39714a, C10117b.f39218o.mo35368d(m34722d0)), c10097i, this.f39961a.m36456g(), this.f39961a.m36459j(), C9768m.m32341a(C10202a.m36074h(this.f39961a.m36454e()).m35421c(C10281x.m36495b(this.f39961a.m36456g(), c10097i.m34723e0())), C10240c0.f39731a) ? C10123h.f39237a.m35402b() : this.f39961a.m36460k(), this.f39961a.m36453d(), null, 1024, null);
        C10270m c10270m = this.f39961a;
        List<C10107s> m34731m0 = c10097i.m34731m0();
        C9768m.m32345e(m34731m0, "proto.typeParameterList");
        C10270m m36450b = C10270m.m36450b(c10270m, c10261k, m34731m0, null, null, null, null, 60, null);
        C10105q m35389h = C10121f.m35389h(c10097i, this.f39961a.m36459j());
        InterfaceC10702w0 m35790h = (m35389h == null || (m36231q = m36450b.m36458i().m36231q(m35389h)) == null) ? null : C10153c.m35790h(c10261k, m36231q, m36481g);
        InterfaceC10702w0 m36479e = m36479e();
        List<C10105q> m34719Z = c10097i.m34719Z();
        C9768m.m32345e(m34719Z, "proto.contextReceiverTypeList");
        List<? extends InterfaceC10702w0> arrayList = new ArrayList<>();
        for (C10105q c10105q : m34719Z) {
            C9768m.m32345e(c10105q, "it");
            InterfaceC10702w0 m36484n = m36484n(c10105q, m36450b, c10261k);
            if (m36484n != null) {
                arrayList.add(m36484n);
            }
        }
        List<InterfaceC10554e1> m36229j = m36450b.m36458i().m36229j();
        C10280w m36455f = m36450b.m36455f();
        List<C10109u> m34735q0 = c10097i.m34735q0();
        C9768m.m32345e(m34735q0, "proto.valueParameterList");
        List<InterfaceC10566i1> m36485o = m36455f.m36485o(m34735q0, c10097i, EnumC10237b.FUNCTION);
        AbstractC10311e0 m36231q2 = m36450b.m36458i().m36231q(C10121f.m35391j(c10097i, this.f39961a.m36459j()));
        C10236a0 c10236a0 = C10236a0.f39714a;
        EnumC10550d0 m36205b = c10236a0.m36205b(C10117b.f39208e.mo35368d(m34722d0));
        AbstractC10697u m36208a = C10238b0.m36208a(c10236a0, C10117b.f39207d.mo35368d(m34722d0));
        m38797i = C10777q0.m38797i();
        m36482h(c10261k, m35790h, m36479e, arrayList, m36229j, m36485o, m36231q2, m36205b, m36208a, m38797i);
        Boolean mo35368d = C10117b.f39219p.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d, "IS_OPERATOR.get(flags)");
        c10261k.m37927g1(mo35368d.booleanValue());
        Boolean mo35368d2 = C10117b.f39220q.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d2, "IS_INFIX.get(flags)");
        c10261k.m37925d1(mo35368d2.booleanValue());
        Boolean mo35368d3 = C10117b.f39223t.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d3, "IS_EXTERNAL_FUNCTION.get(flags)");
        c10261k.m37924Y0(mo35368d3.booleanValue());
        Boolean mo35368d4 = C10117b.f39221r.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d4, "IS_INLINE.get(flags)");
        c10261k.m37926f1(mo35368d4.booleanValue());
        Boolean mo35368d5 = C10117b.f39222s.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d5, "IS_TAILREC.get(flags)");
        c10261k.m37930j1(mo35368d5.booleanValue());
        Boolean mo35368d6 = C10117b.f39224u.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d6, "IS_SUSPEND.get(flags)");
        c10261k.m37929i1(mo35368d6.booleanValue());
        Boolean mo35368d7 = C10117b.f39225v.mo35368d(m34722d0);
        C9768m.m32345e(mo35368d7, "IS_EXPECT_FUNCTION.get(flags)");
        c10261k.m37923X0(mo35368d7.booleanValue());
        c10261k.mo33206Z0(!C10117b.f39226w.mo35368d(m34722d0).booleanValue());
        Pair<InterfaceC10540a.a<?>, Object> mo36414a = this.f39961a.m36452c().m36423h().mo36414a(c10097i, c10261k, this.f39961a.m36459j(), m36450b.m36458i());
        if (mo36414a != null) {
            c10261k.m37921V0(mo36414a.m37648c(), mo36414a.m37649d());
        }
        return c10261k;
    }

    /* renamed from: l */
    public final InterfaceC10696t0 m36488l(C10102n c10102n) {
        C10102n c10102n2;
        InterfaceC10587g m37735b;
        C10260j c10260j;
        InterfaceC10702w0 interfaceC10702w0;
        C10117b.d<EnumC10112x> dVar;
        C10270m c10270m;
        C10117b.d<EnumC10099k> dVar2;
        C10611d0 c10611d0;
        C10611d0 c10611d02;
        C10260j c10260j2;
        C10102n c10102n3;
        int i2;
        boolean z;
        C10613e0 c10613e0;
        C10611d0 m35786d;
        AbstractC10311e0 m36231q;
        C9768m.m32346f(c10102n, "proto");
        int m34885b0 = c10102n.m34899p0() ? c10102n.m34885b0() : m36483k(c10102n.m34888e0());
        InterfaceC10576m m36454e = this.f39961a.m36454e();
        InterfaceC10587g m36478d = m36478d(c10102n, m34885b0, EnumC10237b.PROPERTY);
        C10236a0 c10236a0 = C10236a0.f39714a;
        EnumC10550d0 m36205b = c10236a0.m36205b(C10117b.f39208e.mo35368d(m34885b0));
        AbstractC10697u m36208a = C10238b0.m36208a(c10236a0, C10117b.f39207d.mo35368d(m34885b0));
        Boolean mo35368d = C10117b.f39227x.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d, "IS_VAR.get(flags)");
        boolean booleanValue = mo35368d.booleanValue();
        C10130f m36495b = C10281x.m36495b(this.f39961a.m36456g(), c10102n.m34887d0());
        InterfaceC10543b.a m36209b = C10238b0.m36209b(c10236a0, C10117b.f39218o.mo35368d(m34885b0));
        Boolean mo35368d2 = C10117b.f39190B.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d2, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = mo35368d2.booleanValue();
        Boolean mo35368d3 = C10117b.f39189A.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d3, "IS_CONST.get(flags)");
        boolean booleanValue3 = mo35368d3.booleanValue();
        Boolean mo35368d4 = C10117b.f39192D.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d4, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = mo35368d4.booleanValue();
        Boolean mo35368d5 = C10117b.f39193E.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d5, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = mo35368d5.booleanValue();
        Boolean mo35368d6 = C10117b.f39194F.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d6, "IS_EXPECT_PROPERTY.get(flags)");
        C10260j c10260j3 = new C10260j(m36454e, null, m36478d, m36205b, m36208a, booleanValue, m36495b, m36209b, booleanValue2, booleanValue3, booleanValue4, booleanValue5, mo35368d6.booleanValue(), c10102n, this.f39961a.m36456g(), this.f39961a.m36459j(), this.f39961a.m36460k(), this.f39961a.m36453d());
        C10270m c10270m2 = this.f39961a;
        List<C10107s> m34897n0 = c10102n.m34897n0();
        C9768m.m32345e(m34897n0, "proto.typeParameterList");
        C10270m m36450b = C10270m.m36450b(c10270m2, c10260j3, m34897n0, null, null, null, null, 60, null);
        Boolean mo35368d7 = C10117b.f39228y.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d7, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = mo35368d7.booleanValue();
        if (booleanValue6 && C10121f.m35386e(c10102n)) {
            c10102n2 = c10102n;
            m37735b = m36481g(c10102n2, EnumC10237b.PROPERTY_GETTER);
        } else {
            c10102n2 = c10102n;
            m37735b = InterfaceC10587g.f40808c.m37735b();
        }
        AbstractC10311e0 m36231q2 = m36450b.m36458i().m36231q(C10121f.m35392k(c10102n2, this.f39961a.m36459j()));
        List<InterfaceC10554e1> m36229j = m36450b.m36458i().m36229j();
        InterfaceC10702w0 m36479e = m36479e();
        C10105q m35390i = C10121f.m35390i(c10102n2, this.f39961a.m36459j());
        if (m35390i == null || (m36231q = m36450b.m36458i().m36231q(m35390i)) == null) {
            c10260j = c10260j3;
            interfaceC10702w0 = null;
        } else {
            c10260j = c10260j3;
            interfaceC10702w0 = C10153c.m35790h(c10260j, m36231q, m37735b);
        }
        List<C10105q> m34883Y = c10102n.m34883Y();
        C9768m.m32345e(m34883Y, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m34883Y, 10));
        for (C10105q c10105q : m34883Y) {
            C9768m.m32345e(c10105q, "it");
            arrayList.add(m36484n(c10105q, m36450b, c10260j));
        }
        c10260j.m37794c1(m36231q2, m36229j, m36479e, interfaceC10702w0, arrayList);
        Boolean mo35368d8 = C10117b.f39206c.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d8, "HAS_ANNOTATIONS.get(flags)");
        boolean booleanValue7 = mo35368d8.booleanValue();
        C10117b.d<EnumC10112x> dVar3 = C10117b.f39207d;
        EnumC10112x mo35368d9 = dVar3.mo35368d(m34885b0);
        C10117b.d<EnumC10099k> dVar4 = C10117b.f39208e;
        int m35366b = C10117b.m35366b(booleanValue7, mo35368d9, dVar4.mo35368d(m34885b0), false, false, false);
        if (booleanValue6) {
            int m34886c0 = c10102n.m34900q0() ? c10102n.m34886c0() : m35366b;
            Boolean mo35368d10 = C10117b.f39198J.mo35368d(m34886c0);
            C9768m.m32345e(mo35368d10, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue8 = mo35368d10.booleanValue();
            Boolean mo35368d11 = C10117b.f39199K.mo35368d(m34886c0);
            C9768m.m32345e(mo35368d11, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = mo35368d11.booleanValue();
            Boolean mo35368d12 = C10117b.f39200L.mo35368d(m34886c0);
            C9768m.m32345e(mo35368d12, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue10 = mo35368d12.booleanValue();
            InterfaceC10587g m36478d2 = m36478d(c10102n2, m34886c0, EnumC10237b.PROPERTY_GETTER);
            if (booleanValue8) {
                C10236a0 c10236a02 = C10236a0.f39714a;
                c10270m = m36450b;
                dVar2 = dVar4;
                dVar = dVar3;
                m35786d = new C10611d0(c10260j, m36478d2, c10236a02.m36205b(dVar4.mo35368d(m34886c0)), C10238b0.m36208a(c10236a02, dVar3.mo35368d(m34886c0)), !booleanValue8, booleanValue9, booleanValue10, c10260j.mo37030i(), null, InterfaceC10708z0.f41247a);
            } else {
                dVar = dVar3;
                c10270m = m36450b;
                dVar2 = dVar4;
                m35786d = C10153c.m35786d(c10260j, m36478d2);
                C9768m.m32345e(m35786d, "{\n                Descri…nnotations)\n            }");
            }
            m35786d.m37828R0(c10260j.getReturnType());
            c10611d0 = m35786d;
        } else {
            dVar = dVar3;
            c10270m = m36450b;
            dVar2 = dVar4;
            c10611d0 = null;
        }
        Boolean mo35368d13 = C10117b.f39229z.mo35368d(m34885b0);
        C9768m.m32345e(mo35368d13, "HAS_SETTER.get(flags)");
        if (mo35368d13.booleanValue()) {
            if (c10102n.m34907x0()) {
                m35366b = c10102n.m34893j0();
            }
            int i3 = m35366b;
            Boolean mo35368d14 = C10117b.f39198J.mo35368d(i3);
            C9768m.m32345e(mo35368d14, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue11 = mo35368d14.booleanValue();
            Boolean mo35368d15 = C10117b.f39199K.mo35368d(i3);
            C9768m.m32345e(mo35368d15, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = mo35368d15.booleanValue();
            Boolean mo35368d16 = C10117b.f39200L.mo35368d(i3);
            C9768m.m32345e(mo35368d16, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue13 = mo35368d16.booleanValue();
            EnumC10237b enumC10237b = EnumC10237b.PROPERTY_SETTER;
            InterfaceC10587g m36478d3 = m36478d(c10102n2, i3, enumC10237b);
            if (booleanValue11) {
                C10236a0 c10236a03 = C10236a0.f39714a;
                c10611d02 = c10611d0;
                C10613e0 c10613e02 = new C10613e0(c10260j, m36478d3, c10236a03.m36205b(dVar2.mo35368d(i3)), C10238b0.m36208a(c10236a03, dVar.mo35368d(i3)), !booleanValue11, booleanValue12, booleanValue13, c10260j.mo37030i(), null, InterfaceC10708z0.f41247a);
                z = true;
                c10260j2 = c10260j;
                c10102n3 = c10102n2;
                i2 = m34885b0;
                c10613e02.m37837S0((InterfaceC10566i1) C10780s.m38866s0(C10270m.m36450b(c10270m, c10613e02, C10784u.m38888j(), null, null, null, null, 60, null).m36455f().m36485o(C10782t.m38883e(c10102n.m34894k0()), c10102n3, enumC10237b)));
                c10613e0 = c10613e02;
            } else {
                c10611d02 = c10611d0;
                c10260j2 = c10260j;
                c10102n3 = c10102n2;
                i2 = m34885b0;
                z = true;
                c10613e0 = C10153c.m35787e(c10260j2, m36478d3, InterfaceC10587g.f40808c.m37735b());
                C9768m.m32345e(c10613e0, "{\n                Descri…          )\n            }");
            }
        } else {
            c10611d02 = c10611d0;
            c10260j2 = c10260j;
            c10102n3 = c10102n2;
            i2 = m34885b0;
            z = true;
            c10613e0 = null;
        }
        Boolean mo35368d17 = C10117b.f39191C.mo35368d(i2);
        C9768m.m32345e(mo35368d17, "HAS_CONSTANT.get(flags)");
        if (mo35368d17.booleanValue()) {
            c10260j2.m37910M0(new d(c10102n3, c10260j2));
        }
        InterfaceC10576m m36454e2 = this.f39961a.m36454e();
        InterfaceC10552e interfaceC10552e = m36454e2 instanceof InterfaceC10552e ? (InterfaceC10552e) m36454e2 : null;
        if ((interfaceC10552e != null ? interfaceC10552e.mo32878i() : null) == EnumC10555f.ANNOTATION_CLASS) {
            c10260j2.m37910M0(new e(c10102n3, c10260j2));
        }
        c10260j2.m37790W0(c10611d02, c10613e0, new C10632o(m36480f(c10102n3, false), c10260j2), new C10632o(m36480f(c10102n3, z), c10260j2));
        return c10260j2;
    }

    /* renamed from: m */
    public final InterfaceC10551d1 m36489m(C10106r c10106r) {
        C9768m.m32346f(c10106r, "proto");
        InterfaceC10587g.a aVar = InterfaceC10587g.f40808c;
        List<C10090b> m35133Q = c10106r.m35133Q();
        C9768m.m32345e(m35133Q, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m35133Q, 10));
        for (C10090b c10090b : m35133Q) {
            C10243e c10243e = this.f39962b;
            C9768m.m32345e(c10090b, "it");
            arrayList.add(c10243e.m36242a(c10090b, this.f39961a.m36456g()));
        }
        C10262l c10262l = new C10262l(this.f39961a.m36457h(), this.f39961a.m36454e(), aVar.m37734a(arrayList), C10281x.m36495b(this.f39961a.m36456g(), c10106r.m35138X()), C10238b0.m36208a(C10236a0.f39714a, C10117b.f39207d.mo35368d(c10106r.m35137V())), c10106r, this.f39961a.m36456g(), this.f39961a.m36459j(), this.f39961a.m36460k(), this.f39961a.m36453d());
        C10270m c10270m = this.f39961a;
        List<C10107s> m35141a0 = c10106r.m35141a0();
        C9768m.m32345e(m35141a0, "proto.typeParameterList");
        C10270m m36450b = C10270m.m36450b(c10270m, c10262l, m35141a0, null, null, null, null, 60, null);
        c10262l.m36393R0(m36450b.m36458i().m36229j(), m36450b.m36458i().m36230l(C10121f.m35396o(c10106r, this.f39961a.m36459j()), false), m36450b.m36458i().m36230l(C10121f.m35383b(c10106r, this.f39961a.m36459j()), false));
        return c10262l;
    }
}
