package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10330k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: IntegerLiteralTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.n */
/* loaded from: classes3.dex */
public final class C10185n implements InterfaceC10312e1 {

    /* renamed from: a */
    public static final a f39567a = new a(null);

    /* renamed from: b */
    private final long f39568b;

    /* renamed from: c */
    private final InterfaceC10559g0 f39569c;

    /* renamed from: d */
    private final Set<AbstractC10311e0> f39570d;

    /* renamed from: e */
    private final AbstractC10335m0 f39571e;

    /* renamed from: f */
    private final Lazy f39572f;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.n$a */
    public static final class a {

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.n$a$a, reason: collision with other inner class name */
        private enum EnumC11512a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.n$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f39576a;

            static {
                int[] iArr = new int[EnumC11512a.values().length];
                iArr[EnumC11512a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[EnumC11512a.INTERSECTION_TYPE.ordinal()] = 2;
                f39576a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        private final AbstractC10335m0 m36044a(Collection<? extends AbstractC10335m0> collection, EnumC11512a enumC11512a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC10335m0 abstractC10335m0 = (AbstractC10335m0) it.next();
                next = C10185n.f39567a.m36047e((AbstractC10335m0) next, abstractC10335m0, enumC11512a);
            }
            return (AbstractC10335m0) next;
        }

        /* renamed from: c */
        private final AbstractC10335m0 m36045c(C10185n c10185n, C10185n c10185n2, EnumC11512a enumC11512a) {
            Set m38595a0;
            int i2 = b.f39576a[enumC11512a.ordinal()];
            if (i2 == 1) {
                m38595a0 = C10749c0.m38595a0(c10185n.m36043k(), c10185n2.m36043k());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m38595a0 = C10749c0.m38576J0(c10185n.m36043k(), c10185n2.m36043k());
            }
            return C10314f0.m36665e(C10300a1.f40041g.m36577h(), new C10185n(c10185n.f39568b, c10185n.f39569c, m38595a0, null), false);
        }

        /* renamed from: d */
        private final AbstractC10335m0 m36046d(C10185n c10185n, AbstractC10335m0 abstractC10335m0) {
            if (c10185n.m36043k().contains(abstractC10335m0)) {
                return abstractC10335m0;
            }
            return null;
        }

        /* renamed from: e */
        private final AbstractC10335m0 m36047e(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02, EnumC11512a enumC11512a) {
            if (abstractC10335m0 == null || abstractC10335m02 == null) {
                return null;
            }
            InterfaceC10312e1 mo35993O0 = abstractC10335m0.mo35993O0();
            InterfaceC10312e1 mo35993O02 = abstractC10335m02.mo35993O0();
            boolean z = mo35993O0 instanceof C10185n;
            if (z && (mo35993O02 instanceof C10185n)) {
                return m36045c((C10185n) mo35993O0, (C10185n) mo35993O02, enumC11512a);
            }
            if (z) {
                return m36046d((C10185n) mo35993O0, abstractC10335m02);
            }
            if (mo35993O02 instanceof C10185n) {
                return m36046d((C10185n) mo35993O02, abstractC10335m0);
            }
            return null;
        }

        /* renamed from: b */
        public final AbstractC10335m0 m36048b(Collection<? extends AbstractC10335m0> collection) {
            C9768m.m32346f(collection, "types");
            return m36044a(collection, EnumC11512a.INTERSECTION_TYPE);
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.n$b */
    static final class b extends Lambda implements Function0<List<AbstractC10335m0>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<AbstractC10335m0> invoke() {
            List<AbstractC10335m0> m38894p;
            AbstractC10335m0 mo36400s = C10185n.this.mo36004o().m32804x().mo36400s();
            C9768m.m32345e(mo36400s, "builtIns.comparable.defaultType");
            m38894p = C10784u.m38894p(C10330k1.m36739f(mo36400s, C10782t.m38883e(new C10324i1(EnumC10351r1.IN_VARIANCE, C10185n.this.f39571e)), null, 2, null));
            if (!C10185n.this.m36041m()) {
                m38894p.add(C10185n.this.mo36004o().m32777L());
            }
            return m38894p;
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.n$c */
    static final class c extends Lambda implements Function1<AbstractC10311e0, CharSequence> {

        /* renamed from: f */
        public static final c f39578f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, "it");
            return abstractC10311e0.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10185n(long j2, InterfaceC10559g0 interfaceC10559g0, Set<? extends AbstractC10311e0> set) {
        Lazy m37594b;
        this.f39571e = C10314f0.m36665e(C10300a1.f40041g.m36577h(), this, false);
        m37594b = C10517i.m37594b(new b());
        this.f39572f = m37594b;
        this.f39568b = j2;
        this.f39569c = interfaceC10559g0;
        this.f39570d = set;
    }

    public /* synthetic */ C10185n(long j2, InterfaceC10559g0 interfaceC10559g0, Set set, C9756g c9756g) {
        this(j2, interfaceC10559g0, set);
    }

    /* renamed from: l */
    private final List<AbstractC10311e0> m36040l() {
        return (List) this.f39572f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m36041m() {
        Collection<AbstractC10311e0> m36060a = C10191t.m36060a(this.f39569c);
        if ((m36060a instanceof Collection) && m36060a.isEmpty()) {
            return true;
        }
        Iterator<T> it = m36060a.iterator();
        while (it.hasNext()) {
            if (!(!this.f39570d.contains((AbstractC10311e0) it.next()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private final String m36042n() {
        String m38599e0;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        m38599e0 = C10749c0.m38599e0(this.f39570d, ",", null, null, 0, null, c.f39578f, 30, null);
        sb.append(m38599e0);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: a */
    public Collection<AbstractC10311e0> mo35998a() {
        return m36040l();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: b */
    public InterfaceC10312e1 mo35999b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: c */
    public InterfaceC10561h mo32891w() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    public List<InterfaceC10554e1> getParameters() {
        return C10784u.m38888j();
    }

    /* renamed from: k */
    public final Set<AbstractC10311e0> m36043k() {
        return this.f39570d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: o */
    public AbstractC9881h mo36004o() {
        return this.f39569c.mo37021o();
    }

    public String toString() {
        return "IntegerLiteralType" + m36042n();
    }
}
