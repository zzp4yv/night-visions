package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10742u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10604a;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10625k0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10301b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: FunctionClassDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.b */
/* loaded from: classes2.dex */
public final class C9890b extends AbstractC10604a {

    /* renamed from: k */
    public static final a f37637k = new a(null);

    /* renamed from: l */
    private static final C10126b f37638l = new C10126b(C9884k.f37517r, C10130f.m35454x("Function"));

    /* renamed from: m */
    private static final C10126b f37639m = new C10126b(C9884k.f37514o, C10130f.m35454x("KFunction"));

    /* renamed from: n */
    private final InterfaceC10297n f37640n;

    /* renamed from: o */
    private final InterfaceC10571k0 f37641o;

    /* renamed from: p */
    private final EnumC9891c f37642p;

    /* renamed from: q */
    private final int f37643q;

    /* renamed from: r */
    private final b f37644r;

    /* renamed from: s */
    private final C9892d f37645s;

    /* renamed from: t */
    private final List<InterfaceC10554e1> f37646t;

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.b$b */
    private final class b extends AbstractC10301b {

        /* compiled from: FunctionClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.p.b$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f37648a;

            static {
                int[] iArr = new int[EnumC9891c.values().length];
                iArr[EnumC9891c.f37650g.ordinal()] = 1;
                iArr[EnumC9891c.f37652i.ordinal()] = 2;
                iArr[EnumC9891c.f37651h.ordinal()] = 3;
                iArr[EnumC9891c.f37653j.ordinal()] = 4;
                f37648a = iArr;
            }
        }

        public b() {
            super(C9890b.this.f37640n);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        public List<InterfaceC10554e1> getParameters() {
            return C9890b.this.f37646t;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: l */
        protected Collection<AbstractC10311e0> mo32889l() {
            List<C10126b> m38883e;
            List m38565A0;
            int i2 = a.f37648a[C9890b.this.m32871V0().ordinal()];
            if (i2 == 1) {
                m38883e = C10782t.m38883e(C9890b.f37638l);
            } else if (i2 == 2) {
                m38883e = C10784u.m38891m(C9890b.f37639m, new C10126b(C9884k.f37517r, EnumC9891c.f37650g.m32896u(C9890b.this.m32865R0())));
            } else if (i2 == 3) {
                m38883e = C10782t.m38883e(C9890b.f37638l);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                m38883e = C10784u.m38891m(C9890b.f37639m, new C10126b(C9884k.f37509j, EnumC9891c.f37651h.m32896u(C9890b.this.m32865R0())));
            }
            InterfaceC10559g0 mo32876b = C9890b.this.f37641o.mo32876b();
            ArrayList arrayList = new ArrayList(C10786v.m38911u(m38883e, 10));
            for (C10126b c10126b : m38883e) {
                InterfaceC10552e m38149a = C10703x.m38149a(mo32876b, c10126b);
                if (m38149a == null) {
                    throw new IllegalStateException(("Built-in class " + c10126b + " not found").toString());
                }
                m38565A0 = C10749c0.m38565A0(getParameters(), m38149a.mo32877h().getParameters().size());
                ArrayList arrayList2 = new ArrayList(C10786v.m38911u(m38565A0, 10));
                Iterator it = m38565A0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C10324i1(((InterfaceC10554e1) it.next()).mo36400s()));
                }
                arrayList.add(C10314f0.m36667g(C10300a1.f40041g.m36577h(), m38149a, arrayList2));
            }
            return C10749c0.m38569E0(arrayList);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10316g
        /* renamed from: q */
        protected InterfaceC10548c1 mo32890q() {
            return InterfaceC10548c1.a.f40737a;
        }

        public String toString() {
            return mo32891w().toString();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10301b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C9890b mo32891w() {
            return C9890b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9890b(InterfaceC10297n interfaceC10297n, InterfaceC10571k0 interfaceC10571k0, EnumC9891c enumC9891c, int i2) {
        super(interfaceC10297n, enumC9891c.m32896u(i2));
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10571k0, "containingDeclaration");
        C9768m.m32346f(enumC9891c, "functionKind");
        this.f37640n = interfaceC10297n;
        this.f37641o = interfaceC10571k0;
        this.f37642p = enumC9891c;
        this.f37643q = i2;
        this.f37644r = new b();
        this.f37645s = new C9892d(interfaceC10297n, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i2);
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int mo32397b = ((IntIterator) it).mo32397b();
            EnumC10351r1 enumC10351r1 = EnumC10351r1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(mo32397b);
            m32851L0(arrayList, this, enumC10351r1, sb.toString());
            arrayList2.add(C10742u.f41439a);
        }
        m32851L0(arrayList, this, EnumC10351r1.OUT_VARIANCE, "R");
        this.f37646t = C10749c0.m38569E0(arrayList);
    }

    /* renamed from: L0 */
    private static final void m32851L0(ArrayList<InterfaceC10554e1> arrayList, C9890b c9890b, EnumC10351r1 enumC10351r1, String str) {
        arrayList.add(C10625k0.m37875S0(c9890b, InterfaceC10587g.f40808c.m37735b(), false, enumC10351r1, C10130f.m35454x(str), arrayList.size(), c9890b.f37640n));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: A */
    public boolean mo32857A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: D */
    public boolean mo32858D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: R */
    public /* bridge */ /* synthetic */ InterfaceC10549d mo32864R() {
        return (InterfaceC10549d) m32875Z0();
    }

    /* renamed from: R0 */
    public final int m32865R0() {
        return this.f37643q;
    }

    /* renamed from: S0 */
    public Void m32867S0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10549d> mo32880k() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: U */
    public /* bridge */ /* synthetic */ InterfaceC10552e mo32869U() {
        return (InterfaceC10552e) m32867S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10579n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10571k0 mo32876b() {
        return this.f37641o;
    }

    /* renamed from: V0 */
    public final EnumC9891c m32871V0() {
        return this.f37642p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10552e> mo32861J() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10218h.b mo32866S() {
        return InterfaceC10218h.b.f39671b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C9892d mo32860H(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this.f37645s;
    }

    /* renamed from: Z0 */
    public Void m32875Z0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        return InterfaceC10587g.f40808c.m37735b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u abstractC10697u = C10695t.f41220e;
        C9768m.m32345e(abstractC10697u, Store.PUBLIC_ACCESS);
        return abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public InterfaceC10312e1 mo32877h() {
        return this.f37644r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: i */
    public EnumC10555f mo32878i() {
        return EnumC10555f.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        return EnumC10550d0.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: l */
    public boolean mo32881l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: m */
    public boolean mo32882m() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
        return interfaceC10708z0;
    }

    public String toString() {
        String m35455k = getName().m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        return m35455k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: w */
    public List<InterfaceC10554e1> mo32884w() {
        return this.f37646t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: z0 */
    public AbstractC10560g1<AbstractC10335m0> mo32886z0() {
        return null;
    }
}
