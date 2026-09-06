package kotlin.reflect.p371y.internal.p374j0.p400i.p405t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9755f0;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10707z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10694s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.utils.C10735b;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10380x;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10364h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10372p;
import kotlin.sequences.C10487l;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: DescriptorUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.i.t.a */
/* loaded from: classes3.dex */
public final class C10202a {

    /* renamed from: a */
    private static final C10130f f39590a;

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$a */
    static final class a<N> implements C10735b.c {

        /* renamed from: a */
        public static final a<N> f39591a = new a<>();

        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10566i1> mo32992a(InterfaceC10566i1 interfaceC10566i1) {
            Collection<InterfaceC10566i1> mo37027e = interfaceC10566i1.mo37027e();
            ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37027e, 10));
            Iterator<T> it = mo37027e.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10566i1) it.next()).mo37019a());
            }
            return arrayList;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$b */
    /* synthetic */ class b extends C9760i implements Function1<InterfaceC10566i1, Boolean> {

        /* renamed from: h */
        public static final b f39592h = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(InterfaceC10566i1.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10566i1 interfaceC10566i1) {
            C9768m.m32346f(interfaceC10566i1, "p0");
            return Boolean.valueOf(interfaceC10566i1.mo37698u0());
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$c */
    static final class c<N> implements C10735b.c {

        /* renamed from: a */
        final /* synthetic */ boolean f39593a;

        c(boolean z) {
            this.f39593a = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10543b> mo32992a(InterfaceC10543b interfaceC10543b) {
            if (this.f39593a) {
                interfaceC10543b = interfaceC10543b != null ? interfaceC10543b.mo37019a() : null;
            }
            Collection<? extends InterfaceC10543b> mo37027e = interfaceC10543b != null ? interfaceC10543b.mo37027e() : null;
            return mo37027e == null ? C10784u.m38888j() : mo37027e;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$d */
    public static final class d extends C10735b.b<InterfaceC10543b, InterfaceC10543b> {

        /* renamed from: a */
        final /* synthetic */ C9755f0<InterfaceC10543b> f39594a;

        /* renamed from: b */
        final /* synthetic */ Function1<InterfaceC10543b, Boolean> f39595b;

        /* JADX WARN: Multi-variable type inference failed */
        d(C9755f0<InterfaceC10543b> c9755f0, Function1<? super InterfaceC10543b, Boolean> function1) {
            this.f39594a = c9755f0;
            this.f39595b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.b, kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo36088b(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "current");
            if (this.f39594a.f37179f == null && this.f39595b.invoke(interfaceC10543b).booleanValue()) {
                this.f39594a.f37179f = interfaceC10543b;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo32995c(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "current");
            return this.f39594a.f37179f == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10735b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC10543b mo32994a() {
            return this.f39594a.f37179f;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.t.a$e */
    static final class e extends Lambda implements Function1<InterfaceC10576m, InterfaceC10576m> {

        /* renamed from: f */
        public static final e f39596f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10576m invoke(InterfaceC10576m interfaceC10576m) {
            C9768m.m32346f(interfaceC10576m, "it");
            return interfaceC10576m.mo32876b();
        }
    }

    static {
        C10130f m35454x = C10130f.m35454x("value");
        C9768m.m32345e(m35454x, "identifier(\"value\")");
        f39590a = m35454x;
    }

    /* renamed from: a */
    public static final boolean m36067a(InterfaceC10566i1 interfaceC10566i1) {
        C9768m.m32346f(interfaceC10566i1, "<this>");
        Boolean m38519e = C10735b.m38519e(C10782t.m38883e(interfaceC10566i1), a.f39591a, b.f39592h);
        C9768m.m32345e(m38519e, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return m38519e.booleanValue();
    }

    /* renamed from: b */
    public static final InterfaceC10543b m36068b(InterfaceC10543b interfaceC10543b, boolean z, Function1<? super InterfaceC10543b, Boolean> function1) {
        C9768m.m32346f(interfaceC10543b, "<this>");
        C9768m.m32346f(function1, "predicate");
        return (InterfaceC10543b) C10735b.m38516b(C10782t.m38883e(interfaceC10543b), new c(z), new d(new C9755f0(), function1));
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10543b m36069c(InterfaceC10543b interfaceC10543b, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return m36068b(interfaceC10543b, z, function1);
    }

    /* renamed from: d */
    public static final C10127c m36070d(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        C10128d m36075i = m36075i(interfaceC10576m);
        if (!m36075i.m35435f()) {
            m36075i = null;
        }
        if (m36075i != null) {
            return m36075i.m35441l();
        }
        return null;
    }

    /* renamed from: e */
    public static final InterfaceC10552e m36071e(InterfaceC10583c interfaceC10583c) {
        C9768m.m32346f(interfaceC10583c, "<this>");
        InterfaceC10561h mo32891w = interfaceC10583c.getType().mo35993O0().mo32891w();
        if (mo32891w instanceof InterfaceC10552e) {
            return (InterfaceC10552e) mo32891w;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC9881h m36072f(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        return m36078l(interfaceC10576m).mo37021o();
    }

    /* renamed from: g */
    public static final C10126b m36073g(InterfaceC10561h interfaceC10561h) {
        InterfaceC10576m mo32876b;
        C10126b m36073g;
        if (interfaceC10561h == null || (mo32876b = interfaceC10561h.mo32876b()) == null) {
            return null;
        }
        if (mo32876b instanceof InterfaceC10571k0) {
            return new C10126b(((InterfaceC10571k0) mo32876b).mo37712d(), interfaceC10561h.getName());
        }
        if (!(mo32876b instanceof InterfaceC10564i) || (m36073g = m36073g((InterfaceC10561h) mo32876b)) == null) {
            return null;
        }
        return m36073g.m35411d(interfaceC10561h.getName());
    }

    /* renamed from: h */
    public static final C10127c m36074h(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        C10127c m35826n = C10154d.m35826n(interfaceC10576m);
        C9768m.m32345e(m35826n, "getFqNameSafe(this)");
        return m35826n;
    }

    /* renamed from: i */
    public static final C10128d m36075i(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        C10128d m35825m = C10154d.m35825m(interfaceC10576m);
        C9768m.m32345e(m35825m, "getFqName(this)");
        return m35825m;
    }

    /* renamed from: j */
    public static final C10707z<AbstractC10335m0> m36076j(InterfaceC10552e interfaceC10552e) {
        AbstractC10560g1<AbstractC10335m0> mo32886z0 = interfaceC10552e != null ? interfaceC10552e.mo32886z0() : null;
        if (mo32886z0 instanceof C10707z) {
            return (C10707z) mo32886z0;
        }
        return null;
    }

    /* renamed from: k */
    public static final AbstractC10363g m36077k(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C10372p c10372p = (C10372p) interfaceC10559g0.mo37016I0(C10364h.m36932a());
        AbstractC10380x abstractC10380x = c10372p != null ? (AbstractC10380x) c10372p.m36956a() : null;
        return abstractC10380x instanceof AbstractC10380x.a ? ((AbstractC10380x.a) abstractC10380x).m36978b() : AbstractC10363g.a.f40183a;
    }

    /* renamed from: l */
    public static final InterfaceC10559g0 m36078l(InterfaceC10576m interfaceC10576m) {
        C9768m.m32346f(interfaceC10576m, "<this>");
        InterfaceC10559g0 m35819g = C10154d.m35819g(interfaceC10576m);
        C9768m.m32345e(m35819g, "getContainingModule(this)");
        return m35819g;
    }

    /* renamed from: m */
    public static final Sequence<InterfaceC10576m> m36079m(InterfaceC10576m interfaceC10576m) {
        Sequence<InterfaceC10576m> m37381k;
        C9768m.m32346f(interfaceC10576m, "<this>");
        m37381k = C10489n.m37381k(m36080n(interfaceC10576m), 1);
        return m37381k;
    }

    /* renamed from: n */
    public static final Sequence<InterfaceC10576m> m36080n(InterfaceC10576m interfaceC10576m) {
        Sequence<InterfaceC10576m> m37373f;
        C9768m.m32346f(interfaceC10576m, "<this>");
        m37373f = C10487l.m37373f(interfaceC10576m, e.f39596f);
        return m37373f;
    }

    /* renamed from: o */
    public static final InterfaceC10543b m36081o(InterfaceC10543b interfaceC10543b) {
        C9768m.m32346f(interfaceC10543b, "<this>");
        if (!(interfaceC10543b instanceof InterfaceC10694s0)) {
            return interfaceC10543b;
        }
        InterfaceC10696t0 mo37763B0 = ((InterfaceC10694s0) interfaceC10543b).mo37763B0();
        C9768m.m32345e(mo37763B0, "correspondingProperty");
        return mo37763B0;
    }

    /* renamed from: p */
    public static final InterfaceC10552e m36082p(InterfaceC10552e interfaceC10552e) {
        C9768m.m32346f(interfaceC10552e, "<this>");
        for (AbstractC10311e0 abstractC10311e0 : interfaceC10552e.mo36400s().mo35993O0().mo35998a()) {
            if (!AbstractC9881h.m32736b0(abstractC10311e0)) {
                InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
                if (C10154d.m35835w(mo32891w)) {
                    C9768m.m32344d(mo32891w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC10552e) mo32891w;
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    public static final boolean m36083q(InterfaceC10559g0 interfaceC10559g0) {
        AbstractC10380x abstractC10380x;
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C10372p c10372p = (C10372p) interfaceC10559g0.mo37016I0(C10364h.m36932a());
        return (c10372p == null || (abstractC10380x = (AbstractC10380x) c10372p.m36956a()) == null || !abstractC10380x.m36977a()) ? false : true;
    }

    /* renamed from: r */
    public static final InterfaceC10552e m36084r(InterfaceC10559g0 interfaceC10559g0, C10127c c10127c, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C9768m.m32346f(c10127c, "topLevelClassFqName");
        C9768m.m32346f(interfaceC9906b, "location");
        c10127c.m35422d();
        C10127c m35423e = c10127c.m35423e();
        C9768m.m32345e(m35423e, "topLevelClassFqName.parent()");
        InterfaceC10218h mo37751q = interfaceC10559g0.mo37018N(m35423e).mo37751q();
        C10130f m35425g = c10127c.m35425g();
        C9768m.m32345e(m35425g, "topLevelClassFqName.shortName()");
        InterfaceC10561h mo33316f = mo37751q.mo33316f(m35425g, interfaceC9906b);
        if (mo33316f instanceof InterfaceC10552e) {
            return (InterfaceC10552e) mo33316f;
        }
        return null;
    }
}
