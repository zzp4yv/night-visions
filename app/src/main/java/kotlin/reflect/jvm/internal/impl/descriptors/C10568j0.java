package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.C10787v0;
import kotlin.collections.C10789w0;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9815l;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10616g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10625k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10628m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10331l;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: NotFoundClasses.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0 */
/* loaded from: classes2.dex */
public final class C10568j0 {

    /* renamed from: a */
    private final InterfaceC10297n f40759a;

    /* renamed from: b */
    private final InterfaceC10559g0 f40760b;

    /* renamed from: c */
    private final InterfaceC10290g<C10127c, InterfaceC10571k0> f40761c;

    /* renamed from: d */
    private final InterfaceC10290g<a, InterfaceC10552e> f40762d;

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$a */
    private static final class a {

        /* renamed from: a */
        private final C10126b f40763a;

        /* renamed from: b */
        private final List<Integer> f40764b;

        public a(C10126b c10126b, List<Integer> list) {
            C9768m.m32346f(c10126b, "classId");
            C9768m.m32346f(list, "typeParametersCount");
            this.f40763a = c10126b;
            this.f40764b = list;
        }

        /* renamed from: a */
        public final C10126b m37704a() {
            return this.f40763a;
        }

        /* renamed from: b */
        public final List<Integer> m37705b() {
            return this.f40764b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9768m.m32341a(this.f40763a, aVar.f40763a) && C9768m.m32341a(this.f40764b, aVar.f40764b);
        }

        public int hashCode() {
            return (this.f40763a.hashCode() * 31) + this.f40764b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f40763a + ", typeParametersCount=" + this.f40764b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$b */
    public static final class b extends AbstractC10616g {

        /* renamed from: n */
        private final boolean f40765n;

        /* renamed from: o */
        private final List<InterfaceC10554e1> f40766o;

        /* renamed from: p */
        private final C10331l f40767p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC10297n interfaceC10297n, InterfaceC10576m interfaceC10576m, C10130f c10130f, boolean z, int i2) {
            super(interfaceC10297n, interfaceC10576m, c10130f, InterfaceC10708z0.f41247a, false);
            IntRange m32428k;
            Set m38916c;
            C9768m.m32346f(interfaceC10297n, "storageManager");
            C9768m.m32346f(interfaceC10576m, "container");
            C9768m.m32346f(c10130f, "name");
            this.f40765n = z;
            m32428k = C9815l.m32428k(0, i2);
            ArrayList arrayList = new ArrayList(C10786v.m38911u(m32428k, 10));
            Iterator<Integer> it = m32428k.iterator();
            while (it.hasNext()) {
                int mo32397b = ((IntIterator) it).mo32397b();
                InterfaceC10587g m37735b = InterfaceC10587g.f40808c.m37735b();
                EnumC10351r1 enumC10351r1 = EnumC10351r1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(mo32397b);
                arrayList.add(C10625k0.m37875S0(this, m37735b, false, enumC10351r1, C10130f.m35454x(sb.toString()), mo32397b, interfaceC10297n));
            }
            this.f40766o = arrayList;
            List<InterfaceC10554e1> m37685d = C10557f1.m37685d(this);
            m38916c = C10787v0.m38916c(C10202a.m36078l(this).mo37021o().m32791i());
            this.f40767p = new C10331l(this, m37685d, m38916c, interfaceC10297n);
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
        /* renamed from: J */
        public Collection<InterfaceC10552e> mo32861J() {
            return C10784u.m38888j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: J0 */
        public boolean mo32862J0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public InterfaceC10218h.b mo32866S() {
            return InterfaceC10218h.b.f39671b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
        /* renamed from: M */
        public boolean mo32863M() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public C10331l mo32877h() {
            return this.f40767p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public InterfaceC10218h.b mo32860H(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            return InterfaceC10218h.b.f39671b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: R */
        public InterfaceC10549d mo32864R() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: U */
        public InterfaceC10552e mo32869U() {
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: i */
        public EnumC10555f mo32878i() {
            return EnumC10555f.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        public boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
        /* renamed from: j */
        public EnumC10550d0 mo32879j() {
            return EnumC10550d0.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: k */
        public Collection<InterfaceC10549d> mo32880k() {
            Set m38917d;
            m38917d = C10789w0.m38917d();
            return m38917d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
        /* renamed from: l */
        public boolean mo32881l() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
        /* renamed from: m */
        public boolean mo32882m() {
            return this.f40765n;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
        /* renamed from: w */
        public List<InterfaceC10554e1> mo32884w() {
            return this.f40766o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10616g, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
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

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$c */
    static final class c extends Lambda implements Function1<a, InterfaceC10552e> {
        c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r1 != null) goto L10;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e invoke(kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.C9768m.m32346f(r9, r0)
                kotlin.f0.y.e.j0.f.b r0 = r9.m37704a()
                java.util.List r9 = r9.m37705b()
                boolean r1 = r0.m35416k()
                if (r1 != 0) goto L67
                kotlin.f0.y.e.j0.f.b r1 = r0.m35412g()
                if (r1 == 0) goto L27
                kotlin.reflect.jvm.internal.impl.descriptors.j0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.this
                r3 = 1
                java.util.List r3 = kotlin.collections.C10780s.m38825M(r9, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.e r1 = r2.m37703d(r1, r3)
                if (r1 == 0) goto L27
                goto L3c
            L27:
                kotlin.reflect.jvm.internal.impl.descriptors.j0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.this
                kotlin.f0.y.e.j0.k.g r1 = kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.m37701b(r1)
                kotlin.f0.y.e.j0.f.c r2 = r0.m35413h()
                java.lang.String r3 = "classId.packageFqName"
                kotlin.jvm.internal.C9768m.m32345e(r2, r3)
                java.lang.Object r1 = r1.invoke(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.g r1 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10558g) r1
            L3c:
                r4 = r1
                boolean r6 = r0.m35417l()
                kotlin.reflect.jvm.internal.impl.descriptors.j0$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.j0$b
                kotlin.reflect.jvm.internal.impl.descriptors.j0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.this
                kotlin.f0.y.e.j0.k.n r3 = kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.m37702c(r2)
                kotlin.f0.y.e.j0.f.f r5 = r0.m35415j()
                java.lang.String r0 = "classId.shortClassName"
                kotlin.jvm.internal.C9768m.m32345e(r5, r0)
                java.lang.Object r9 = kotlin.collections.C10780s.m38832W(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L60
                int r9 = r9.intValue()
                r7 = r9
                goto L62
            L60:
                r9 = 0
                r7 = 0
            L62:
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L67:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C10568j0.c.invoke(kotlin.reflect.jvm.internal.impl.descriptors.j0$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$d */
    static final class d extends Lambda implements Function1<C10127c, InterfaceC10571k0> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10571k0 invoke(C10127c c10127c) {
            C9768m.m32346f(c10127c, "fqName");
            return new C10628m(C10568j0.this.f40760b, c10127c);
        }
    }

    public C10568j0(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "module");
        this.f40759a = interfaceC10297n;
        this.f40760b = interfaceC10559g0;
        this.f40761c = interfaceC10297n.mo36520h(new d());
        this.f40762d = interfaceC10297n.mo36520h(new c());
    }

    /* renamed from: d */
    public final InterfaceC10552e m37703d(C10126b c10126b, List<Integer> list) {
        C9768m.m32346f(c10126b, "classId");
        C9768m.m32346f(list, "typeParametersCount");
        return this.f40762d.invoke(new a(c10126b, list));
    }
}
