package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9880g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10121f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10251a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10263m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10426y0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10343p;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350r0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10353s0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10431z0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;
import kotlin.sequences.C10487l;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;

/* compiled from: TypeDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.d0 */
/* loaded from: classes3.dex */
public final class C10242d0 {

    /* renamed from: a */
    private final C10270m f39736a;

    /* renamed from: b */
    private final C10242d0 f39737b;

    /* renamed from: c */
    private final String f39738c;

    /* renamed from: d */
    private final String f39739d;

    /* renamed from: e */
    private final Function1<Integer, InterfaceC10561h> f39740e;

    /* renamed from: f */
    private final Function1<Integer, InterfaceC10561h> f39741f;

    /* renamed from: g */
    private final Map<Integer, InterfaceC10554e1> f39742g;

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$a */
    static final class a extends Lambda implements Function1<Integer, InterfaceC10561h> {
        a() {
            super(1);
        }

        /* renamed from: b */
        public final InterfaceC10561h m36232b(int i2) {
            return C10242d0.this.m36215d(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC10561h invoke(Integer num) {
            return m36232b(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$b */
    static final class b extends Lambda implements Function0<List<? extends InterfaceC10583c>> {

        /* renamed from: g */
        final /* synthetic */ C10105q f39745g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10105q c10105q) {
            super(0);
            this.f39745g = c10105q;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10583c> invoke() {
            return C10242d0.this.f39736a.m36452c().m36419d().mo33873d(this.f39745g, C10242d0.this.f39736a.m36456g());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$c */
    static final class c extends Lambda implements Function1<Integer, InterfaceC10561h> {
        c() {
            super(1);
        }

        /* renamed from: b */
        public final InterfaceC10561h m36233b(int i2) {
            return C10242d0.this.m36217f(i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC10561h invoke(Integer num) {
            return m36233b(num.intValue());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$d */
    /* synthetic */ class d extends C9760i implements Function1<C10126b, C10126b> {

        /* renamed from: h */
        public static final d f39747h = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10126b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10126b invoke(C10126b c10126b) {
            C9768m.m32346f(c10126b, "p0");
            return c10126b.m35412g();
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$e */
    static final class e extends Lambda implements Function1<C10105q, C10105q> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10105q invoke(C10105q c10105q) {
            C9768m.m32346f(c10105q, "it");
            return C10121f.m35388g(c10105q, C10242d0.this.f39736a.m36459j());
        }
    }

    /* compiled from: TypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d0$f */
    static final class f extends Lambda implements Function1<C10105q, Integer> {

        /* renamed from: f */
        public static final f f39749f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C10105q c10105q) {
            C9768m.m32346f(c10105q, "it");
            return Integer.valueOf(c10105q.m35031U());
        }
    }

    public C10242d0(C10270m c10270m, C10242d0 c10242d0, List<C10107s> list, String str, String str2) {
        Map<Integer, InterfaceC10554e1> linkedHashMap;
        C9768m.m32346f(c10270m, "c");
        C9768m.m32346f(list, "typeParameterProtos");
        C9768m.m32346f(str, "debugName");
        C9768m.m32346f(str2, "containerPresentableName");
        this.f39736a = c10270m;
        this.f39737b = c10242d0;
        this.f39738c = str;
        this.f39739d = str2;
        this.f39740e = c10270m.m36457h().mo36521i(new a());
        this.f39741f = c10270m.m36457h().mo36521i(new c());
        if (list.isEmpty()) {
            linkedHashMap = C10777q0.m38797i();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i2 = 0;
            for (C10107s c10107s : list) {
                linkedHashMap.put(Integer.valueOf(c10107s.m35186M()), new C10263m(this.f39736a, c10107s, i2));
                i2++;
            }
        }
        this.f39742g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final InterfaceC10561h m36215d(int i2) {
        C10126b m36494a = C10281x.m36494a(this.f39736a.m36456g(), i2);
        return m36494a.m35416k() ? this.f39736a.m36452c().m36417b(m36494a) : C10703x.m38150b(this.f39736a.m36452c().m36431p(), m36494a);
    }

    /* renamed from: e */
    private final AbstractC10335m0 m36216e(int i2) {
        if (C10281x.m36494a(this.f39736a.m36456g(), i2).m35416k()) {
            return this.f39736a.m36452c().m36429n().mo36474a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final InterfaceC10561h m36217f(int i2) {
        C10126b m36494a = C10281x.m36494a(this.f39736a.m36456g(), i2);
        if (m36494a.m35416k()) {
            return null;
        }
        return C10703x.m38152d(this.f39736a.m36452c().m36431p(), m36494a);
    }

    /* renamed from: g */
    private final AbstractC10335m0 m36218g(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        List m38582N;
        AbstractC9881h m37142h = C10424a.m37142h(abstractC10311e0);
        InterfaceC10587g annotations = abstractC10311e0.getAnnotations();
        AbstractC10311e0 m32714j = C9880g.m32714j(abstractC10311e0);
        List<AbstractC10311e0> m32709e = C9880g.m32709e(abstractC10311e0);
        m38582N = C10749c0.m38582N(C9880g.m32716l(abstractC10311e0), 1);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38582N, 10));
        Iterator it = m38582N.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10318g1) it.next()).getType());
        }
        return C9880g.m32706b(m37142h, annotations, m32714j, m32709e, arrayList, null, abstractC10311e02, true).mo33545S0(abstractC10311e0.mo33691P0());
    }

    /* renamed from: h */
    private final AbstractC10335m0 m36219h(C10300a1 c10300a1, InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, boolean z) {
        int size;
        int size2 = interfaceC10312e1.getParameters().size() - list.size();
        AbstractC10335m0 abstractC10335m0 = null;
        if (size2 == 0) {
            abstractC10335m0 = m36220i(c10300a1, interfaceC10312e1, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            InterfaceC10312e1 mo32877h = interfaceC10312e1.mo36004o().m32785X(size).mo32877h();
            C9768m.m32345e(mo32877h, "functionTypeConstructor.…on(arity).typeConstructor");
            abstractC10335m0 = C10314f0.m36669i(c10300a1, mo32877h, list, z, null, 16, null);
        }
        return abstractC10335m0 == null ? C10394k.f40355a.m37059f(EnumC10393j.f40298S, list, interfaceC10312e1, new String[0]) : abstractC10335m0;
    }

    /* renamed from: i */
    private final AbstractC10335m0 m36220i(C10300a1 c10300a1, InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, boolean z) {
        AbstractC10335m0 m36669i = C10314f0.m36669i(c10300a1, interfaceC10312e1, list, z, null, 16, null);
        if (C9880g.m32720p(m36669i)) {
            return m36225p(m36669i);
        }
        return null;
    }

    /* renamed from: k */
    private final InterfaceC10554e1 m36221k(int i2) {
        InterfaceC10554e1 interfaceC10554e1 = this.f39742g.get(Integer.valueOf(i2));
        if (interfaceC10554e1 != null) {
            return interfaceC10554e1;
        }
        C10242d0 c10242d0 = this.f39737b;
        if (c10242d0 != null) {
            return c10242d0.m36221k(i2);
        }
        return null;
    }

    /* renamed from: m */
    private static final List<C10105q.b> m36222m(C10105q c10105q, C10242d0 c10242d0) {
        List<C10105q.b> m35032V = c10105q.m35032V();
        C9768m.m32345e(m35032V, "argumentList");
        C10105q m35388g = C10121f.m35388g(c10105q, c10242d0.f39736a.m36459j());
        List<C10105q.b> m36222m = m35388g != null ? m36222m(m35388g, c10242d0) : null;
        if (m36222m == null) {
            m36222m = C10784u.m38888j();
        }
        return C10749c0.m38609o0(m35032V, m36222m);
    }

    /* renamed from: n */
    public static /* synthetic */ AbstractC10335m0 m36223n(C10242d0 c10242d0, C10105q c10105q, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return c10242d0.m36230l(c10105q, z);
    }

    /* renamed from: o */
    private final C10300a1 m36224o(List<? extends InterfaceC10431z0> list, InterfaceC10587g interfaceC10587g, InterfaceC10312e1 interfaceC10312e1, InterfaceC10576m interfaceC10576m) {
        List<? extends AbstractC10426y0<?>> m38913w;
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10431z0) it.next()).mo36792a(interfaceC10587g, interfaceC10312e1, interfaceC10576m));
        }
        m38913w = C10786v.m38913w(arrayList);
        return C10300a1.f40041g.m36576g(m38913w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (kotlin.jvm.internal.C9768m.m32341a(r2, r3) == false) goto L30;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0 m36225p(kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0 r6) {
        /*
            r5 = this;
            java.util.List r0 = kotlin.reflect.p371y.internal.p374j0.p375b.C9880g.m32716l(r6)
            java.lang.Object r0 = kotlin.collections.C10780s.m38847i0(r0)
            kotlin.f0.y.e.j0.l.g1 r0 = (kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1) r0
            r1 = 0
            if (r0 == 0) goto L7d
            kotlin.f0.y.e.j0.l.e0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L7d
        L14:
            kotlin.f0.y.e.j0.l.e1 r2 = r0.mo35993O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r2 = r2.mo32891w()
            if (r2 == 0) goto L23
            kotlin.f0.y.e.j0.f.c r2 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36074h(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.mo35991M0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7a
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p375b.C9884k.f37512m
            boolean r3 = kotlin.jvm.internal.C9768m.m32341a(r2, r3)
            if (r3 != 0) goto L42
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10244e0.m36244a()
            boolean r2 = kotlin.jvm.internal.C9768m.m32341a(r2, r3)
            if (r2 != 0) goto L42
            goto L7a
        L42:
            java.util.List r0 = r0.mo35991M0()
            java.lang.Object r0 = kotlin.collections.C10780s.m38866s0(r0)
            kotlin.f0.y.e.j0.l.g1 r0 = (kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1) r0
            kotlin.f0.y.e.j0.l.e0 r0 = r0.getType()
            java.lang.String r2 = "continuationArgumentType.arguments.single().type"
            kotlin.jvm.internal.C9768m.m32345e(r0, r2)
            kotlin.f0.y.e.j0.j.b.m r2 = r5.f39736a
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r2.m36454e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
            if (r3 != 0) goto L60
            r2 = r1
        L60:
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a) r2
            if (r2 == 0) goto L68
            kotlin.f0.y.e.j0.f.c r1 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a.m36070d(r2)
        L68:
            kotlin.f0.y.e.j0.f.c r2 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10240c0.f39731a
            boolean r1 = kotlin.jvm.internal.C9768m.m32341a(r1, r2)
            if (r1 == 0) goto L75
            kotlin.f0.y.e.j0.l.m0 r6 = r5.m36218g(r6, r0)
            return r6
        L75:
            kotlin.f0.y.e.j0.l.m0 r6 = r5.m36218g(r6, r0)
            return r6
        L7a:
            kotlin.f0.y.e.j0.l.m0 r6 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0) r6
            return r6
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10242d0.m36225p(kotlin.f0.y.e.j0.l.e0):kotlin.f0.y.e.j0.l.m0");
    }

    /* renamed from: r */
    private final InterfaceC10318g1 m36226r(InterfaceC10554e1 interfaceC10554e1, C10105q.b bVar) {
        if (bVar.m35073x() == C10105q.b.c.STAR) {
            return interfaceC10554e1 == null ? new C10350r0(this.f39736a.m36452c().m36431p().mo37021o()) : new C10353s0(interfaceC10554e1);
        }
        C10236a0 c10236a0 = C10236a0.f39714a;
        C10105q.b.c m35073x = bVar.m35073x();
        C9768m.m32345e(m35073x, "typeArgumentProto.projection");
        EnumC10351r1 m36206c = c10236a0.m36206c(m35073x);
        C10105q m35394m = C10121f.m35394m(bVar, this.f39736a.m36459j());
        return m35394m == null ? new C10324i1(C10394k.m37053d(EnumC10393j.f40273C0, bVar.toString())) : new C10324i1(m36206c, m36231q(m35394m));
    }

    /* renamed from: s */
    private final InterfaceC10312e1 m36227s(C10105q c10105q) {
        InterfaceC10561h invoke;
        Object obj;
        if (c10105q.m35047m0()) {
            invoke = this.f39740e.invoke(Integer.valueOf(c10105q.m35033X()));
            if (invoke == null) {
                invoke = m36228t(this, c10105q, c10105q.m35033X());
            }
        } else if (c10105q.m35056v0()) {
            invoke = m36221k(c10105q.m35043i0());
            if (invoke == null) {
                return C10394k.f40355a.m37058e(EnumC10393j.f40296Q, String.valueOf(c10105q.m35043i0()), this.f39739d);
            }
        } else if (c10105q.m35057w0()) {
            String string = this.f39736a.m36456g().getString(c10105q.m35044j0());
            Iterator<T> it = m36229j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C9768m.m32341a(((InterfaceC10554e1) obj).getName().m35455k(), string)) {
                    break;
                }
            }
            invoke = (InterfaceC10554e1) obj;
            if (invoke == null) {
                return C10394k.f40355a.m37058e(EnumC10393j.f40297R, string, this.f39736a.m36454e().toString());
            }
        } else {
            if (!c10105q.m35055u0()) {
                return C10394k.f40355a.m37058e(EnumC10393j.f40300U, new String[0]);
            }
            invoke = this.f39741f.invoke(Integer.valueOf(c10105q.m35042h0()));
            if (invoke == null) {
                invoke = m36228t(this, c10105q, c10105q.m35042h0());
            }
        }
        InterfaceC10312e1 mo32877h = invoke.mo32877h();
        C9768m.m32345e(mo32877h, "classifier.typeConstructor");
        return mo32877h;
    }

    /* renamed from: t */
    private static final InterfaceC10552e m36228t(C10242d0 c10242d0, C10105q c10105q, int i2) {
        Sequence m37373f;
        Sequence m37391u;
        Sequence m37373f2;
        int m37380j;
        C10126b m36494a = C10281x.m36494a(c10242d0.f39736a.m36456g(), i2);
        m37373f = C10487l.m37373f(c10105q, c10242d0.new e());
        m37391u = C10489n.m37391u(m37373f, f.f39749f);
        List<Integer> m37378B = C10489n.m37378B(m37391u);
        m37373f2 = C10487l.m37373f(m36494a, d.f39747h);
        m37380j = C10489n.m37380j(m37373f2);
        while (m37378B.size() < m37380j) {
            m37378B.add(0);
        }
        return c10242d0.f39736a.m36452c().m36432q().m37703d(m36494a, m37378B);
    }

    /* renamed from: j */
    public final List<InterfaceC10554e1> m36229j() {
        return C10749c0.m38569E0(this.f39742g.values());
    }

    /* renamed from: l */
    public final AbstractC10335m0 m36230l(C10105q c10105q, boolean z) {
        AbstractC10335m0 m36669i;
        AbstractC10335m0 m36816j;
        List<? extends InterfaceC10583c> m38607m0;
        C9768m.m32346f(c10105q, "proto");
        AbstractC10335m0 m36216e = c10105q.m35047m0() ? m36216e(c10105q.m35033X()) : c10105q.m35055u0() ? m36216e(c10105q.m35042h0()) : null;
        if (m36216e != null) {
            return m36216e;
        }
        InterfaceC10312e1 m36227s = m36227s(c10105q);
        boolean z2 = true;
        if (C10394k.m37054m(m36227s.mo32891w())) {
            return C10394k.f40355a.m37057c(EnumC10393j.f40348x0, m36227s, m36227s.toString());
        }
        C10251a c10251a = new C10251a(this.f39736a.m36457h(), new b(c10105q));
        C10300a1 m36224o = m36224o(this.f39736a.m36452c().m36437v(), c10251a, m36227s, this.f39736a.m36454e());
        List<C10105q.b> m36222m = m36222m(c10105q, this);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m36222m, 10));
        int i2 = 0;
        for (Object obj : m36222m) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10784u.m38898t();
            }
            List<InterfaceC10554e1> parameters = m36227s.getParameters();
            C9768m.m32345e(parameters, "constructor.parameters");
            arrayList.add(m36226r((InterfaceC10554e1) C10780s.m38833X(parameters, i2), (C10105q.b) obj));
            i2 = i3;
        }
        List<? extends InterfaceC10318g1> m38569E0 = C10749c0.m38569E0(arrayList);
        InterfaceC10561h mo32891w = m36227s.mo32891w();
        if (z && (mo32891w instanceof InterfaceC10551d1)) {
            C10314f0 c10314f0 = C10314f0.f40090a;
            AbstractC10335m0 m36662b = C10314f0.m36662b((InterfaceC10551d1) mo32891w, m38569E0);
            List<InterfaceC10431z0> m36437v = this.f39736a.m36452c().m36437v();
            InterfaceC10587g.a aVar = InterfaceC10587g.f40808c;
            m38607m0 = C10749c0.m38607m0(c10251a, m36662b.getAnnotations());
            C10300a1 m36224o2 = m36224o(m36437v, aVar.m37734a(m38607m0), m36227s, this.f39736a.m36454e());
            if (!C10317g0.m36707b(m36662b) && !c10105q.m35039e0()) {
                z2 = false;
            }
            m36669i = m36662b.mo33545S0(z2).mo33547U0(m36224o2);
        } else {
            Boolean mo35368d = C10117b.f39204a.mo35368d(c10105q.m35035a0());
            C9768m.m32345e(mo35368d, "SUSPEND_TYPE.get(proto.flags)");
            if (mo35368d.booleanValue()) {
                m36669i = m36219h(m36224o, m36227s, m38569E0, c10105q.m35039e0());
            } else {
                m36669i = C10314f0.m36669i(m36224o, m36227s, m38569E0, c10105q.m35039e0(), null, 16, null);
                Boolean mo35368d2 = C10117b.f39205b.mo35368d(c10105q.m35035a0());
                C9768m.m32345e(mo35368d2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (mo35368d2.booleanValue()) {
                    C10343p m36797c = C10343p.a.m36797c(C10343p.f40159g, m36669i, false, 2, null);
                    if (m36797c == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + m36669i + '\'').toString());
                    }
                    m36669i = m36797c;
                }
            }
        }
        C10105q m35382a = C10121f.m35382a(c10105q, this.f39736a.m36459j());
        if (m35382a != null && (m36816j = C10347q0.m36816j(m36669i, m36230l(m35382a, false))) != null) {
            m36669i = m36816j;
        }
        return c10105q.m35047m0() ? this.f39736a.m36452c().m36435t().mo37748a(C10281x.m36494a(this.f39736a.m36456g(), c10105q.m35033X()), m36669i) : m36669i;
    }

    /* renamed from: q */
    public final AbstractC10311e0 m36231q(C10105q c10105q) {
        C9768m.m32346f(c10105q, "proto");
        if (!c10105q.m35049o0()) {
            return m36230l(c10105q, true);
        }
        String string = this.f39736a.m36456g().getString(c10105q.m35036b0());
        AbstractC10335m0 m36223n = m36223n(this, c10105q, false, 2, null);
        C10105q m35384c = C10121f.m35384c(c10105q, this.f39736a.m36459j());
        C9768m.m32343c(m35384c);
        return this.f39736a.m36452c().m36427l().mo33979a(c10105q, string, m36223n, m36223n(this, m35384c, false, 2, null));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39738c);
        if (this.f39737b == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ". Child of " + this.f39737b.f39738c;
        }
        sb.append(str);
        return sb.toString();
    }
}
