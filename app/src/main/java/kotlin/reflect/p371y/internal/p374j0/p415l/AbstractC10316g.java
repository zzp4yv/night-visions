package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.Collection;
import java.util.List;
import kotlin.C10517i;
import kotlin.C10742u;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10364h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;

/* compiled from: AbstractTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10316g extends AbstractC10334m {

    /* renamed from: b */
    private final InterfaceC10292i<b> f40107b;

    /* renamed from: c */
    private final boolean f40108c;

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$a */
    private final class a implements InterfaceC10312e1 {

        /* renamed from: a */
        private final AbstractC10363g f40109a;

        /* renamed from: b */
        private final Lazy f40110b;

        /* renamed from: c */
        final /* synthetic */ AbstractC10316g f40111c;

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$a$a, reason: collision with other inner class name */
        static final class C11524a extends Lambda implements Function0<List<? extends AbstractC10311e0>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10316g f40113g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11524a(AbstractC10316g abstractC10316g) {
                super(0);
                this.f40113g = abstractC10316g;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC10311e0> invoke() {
                return C10364h.m36933b(a.this.f40109a, this.f40113g.mo35998a());
            }
        }

        public a(AbstractC10316g abstractC10316g, AbstractC10363g abstractC10363g) {
            Lazy m37593a;
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            this.f40111c = abstractC10316g;
            this.f40109a = abstractC10363g;
            m37593a = C10517i.m37593a(LazyThreadSafetyMode.PUBLICATION, new C11524a(abstractC10316g));
            this.f40110b = m37593a;
        }

        /* renamed from: h */
        private final List<AbstractC10311e0> m36694h() {
            return (List) this.f40110b.getValue();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: b */
        public InterfaceC10312e1 mo35999b(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            return this.f40111c.mo35999b(abstractC10363g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: c */
        public InterfaceC10561h mo32891w() {
            return this.f40111c.mo32891w();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: e */
        public boolean mo32888e() {
            return this.f40111c.mo32888e();
        }

        public boolean equals(Object obj) {
            return this.f40111c.equals(obj);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        public List<InterfaceC10554e1> getParameters() {
            List<InterfaceC10554e1> parameters = this.f40111c.getParameters();
            C9768m.m32345e(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f40111c.hashCode();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public List<AbstractC10311e0> mo35998a() {
            return m36694h();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: o */
        public AbstractC9881h mo36004o() {
            AbstractC9881h mo36004o = this.f40111c.mo36004o();
            C9768m.m32345e(mo36004o, "this@AbstractTypeConstructor.builtIns");
            return mo36004o;
        }

        public String toString() {
            return this.f40111c.toString();
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$b */
    private static final class b {

        /* renamed from: a */
        private final Collection<AbstractC10311e0> f40114a;

        /* renamed from: b */
        private List<? extends AbstractC10311e0> f40115b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends AbstractC10311e0> collection) {
            C9768m.m32346f(collection, "allSupertypes");
            this.f40114a = collection;
            this.f40115b = C10782t.m38883e(C10394k.f40355a.m37065l());
        }

        /* renamed from: a */
        public final Collection<AbstractC10311e0> m36696a() {
            return this.f40114a;
        }

        /* renamed from: b */
        public final List<AbstractC10311e0> m36697b() {
            return this.f40115b;
        }

        /* renamed from: c */
        public final void m36698c(List<? extends AbstractC10311e0> list) {
            C9768m.m32346f(list, "<set-?>");
            this.f40115b = list;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$c */
    static final class c extends Lambda implements Function0<b> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(AbstractC10316g.this.mo32889l());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$d */
    static final class d extends Lambda implements Function1<Boolean, b> {

        /* renamed from: f */
        public static final d f40117f = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final b m36700b(boolean z) {
            return new b(C10782t.m38883e(C10394k.f40355a.m37065l()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return m36700b(bool.booleanValue());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.g$e */
    static final class e extends Lambda implements Function1<b, C10742u> {

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$a */
        static final class a extends Lambda implements Function1<InterfaceC10312e1, Iterable<? extends AbstractC10311e0>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10316g f40119f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC10316g abstractC10316g) {
                super(1);
                this.f40119f = abstractC10316g;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterable<AbstractC10311e0> invoke(InterfaceC10312e1 interfaceC10312e1) {
                C9768m.m32346f(interfaceC10312e1, "it");
                return this.f40119f.m36687k(interfaceC10312e1, true);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$b */
        static final class b extends Lambda implements Function1<AbstractC10311e0, C10742u> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10316g f40120f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC10316g abstractC10316g) {
                super(1);
                this.f40120f = abstractC10316g;
            }

            /* renamed from: b */
            public final void m36703b(AbstractC10311e0 abstractC10311e0) {
                C9768m.m32346f(abstractC10311e0, "it");
                this.f40120f.m36691t(abstractC10311e0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10742u invoke(AbstractC10311e0 abstractC10311e0) {
                m36703b(abstractC10311e0);
                return C10742u.f41439a;
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$c */
        static final class c extends Lambda implements Function1<InterfaceC10312e1, Iterable<? extends AbstractC10311e0>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10316g f40121f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC10316g abstractC10316g) {
                super(1);
                this.f40121f = abstractC10316g;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Iterable<AbstractC10311e0> invoke(InterfaceC10312e1 interfaceC10312e1) {
                C9768m.m32346f(interfaceC10312e1, "it");
                return this.f40121f.m36687k(interfaceC10312e1, false);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.g$e$d */
        static final class d extends Lambda implements Function1<AbstractC10311e0, C10742u> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10316g f40122f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AbstractC10316g abstractC10316g) {
                super(1);
                this.f40122f = abstractC10316g;
            }

            /* renamed from: b */
            public final void m36705b(AbstractC10311e0 abstractC10311e0) {
                C9768m.m32346f(abstractC10311e0, "it");
                this.f40122f.mo36692u(abstractC10311e0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10742u invoke(AbstractC10311e0 abstractC10311e0) {
                m36705b(abstractC10311e0);
                return C10742u.f41439a;
            }
        }

        e() {
            super(1);
        }

        /* renamed from: b */
        public final void m36701b(b bVar) {
            C9768m.m32346f(bVar, "supertypes");
            Collection<AbstractC10311e0> mo37674a = AbstractC10316g.this.mo32890q().mo37674a(AbstractC10316g.this, bVar.m36696a(), new c(AbstractC10316g.this), new d(AbstractC10316g.this));
            if (mo37674a.isEmpty()) {
                AbstractC10311e0 mo36580m = AbstractC10316g.this.mo36580m();
                mo37674a = mo36580m != null ? C10782t.m38883e(mo36580m) : null;
                if (mo37674a == null) {
                    mo37674a = C10784u.m38888j();
                }
            }
            if (AbstractC10316g.this.m36688p()) {
                InterfaceC10548c1 mo32890q = AbstractC10316g.this.mo32890q();
                AbstractC10316g abstractC10316g = AbstractC10316g.this;
                mo32890q.mo37674a(abstractC10316g, mo37674a, new a(abstractC10316g), new b(AbstractC10316g.this));
            }
            AbstractC10316g abstractC10316g2 = AbstractC10316g.this;
            List<AbstractC10311e0> list = mo37674a instanceof List ? (List) mo37674a : null;
            if (list == null) {
                list = C10749c0.m38569E0(mo37674a);
            }
            bVar.m36698c(abstractC10316g2.mo36690s(list));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10742u invoke(b bVar) {
            m36701b(bVar);
            return C10742u.f41439a;
        }
    }

    public AbstractC10316g(InterfaceC10297n interfaceC10297n) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        this.f40107b = interfaceC10297n.mo36519g(new c(), d.f40117f, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final Collection<AbstractC10311e0> m36687k(InterfaceC10312e1 interfaceC10312e1, boolean z) {
        List m38609o0;
        AbstractC10316g abstractC10316g = interfaceC10312e1 instanceof AbstractC10316g ? (AbstractC10316g) interfaceC10312e1 : null;
        if (abstractC10316g != null && (m38609o0 = C10749c0.m38609o0(abstractC10316g.f40107b.invoke().m36696a(), abstractC10316g.mo36581n(z))) != null) {
            return m38609o0;
        }
        Collection<AbstractC10311e0> mo35998a = interfaceC10312e1.mo35998a();
        C9768m.m32345e(mo35998a, "supertypes");
        return mo35998a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: b */
    public InterfaceC10312e1 mo35999b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return new a(this, abstractC10363g);
    }

    /* renamed from: l */
    protected abstract Collection<AbstractC10311e0> mo32889l();

    /* renamed from: m */
    protected AbstractC10311e0 mo36580m() {
        return null;
    }

    /* renamed from: n */
    protected Collection<AbstractC10311e0> mo36581n(boolean z) {
        return C10784u.m38888j();
    }

    /* renamed from: p */
    protected boolean m36688p() {
        return this.f40108c;
    }

    /* renamed from: q */
    protected abstract InterfaceC10548c1 mo32890q();

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public List<AbstractC10311e0> mo35998a() {
        return this.f40107b.invoke().m36697b();
    }

    /* renamed from: s */
    protected List<AbstractC10311e0> mo36690s(List<AbstractC10311e0> list) {
        C9768m.m32346f(list, "supertypes");
        return list;
    }

    /* renamed from: t */
    protected void m36691t(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "type");
    }

    /* renamed from: u */
    protected void mo36692u(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "type");
    }
}
