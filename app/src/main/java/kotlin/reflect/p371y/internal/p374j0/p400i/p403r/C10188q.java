package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10780s;
import kotlin.collections.C10782t;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10300a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10324i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.q */
/* loaded from: classes3.dex */
public final class C10188q extends AbstractC10178g<b> {

    /* renamed from: b */
    public static final a f39582b = new a(null);

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10178g<?> m36053a(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, "argumentType");
            if (C10317g0.m36706a(abstractC10311e0)) {
                return null;
            }
            AbstractC10311e0 abstractC10311e02 = abstractC10311e0;
            int i2 = 0;
            while (AbstractC9881h.m32738c0(abstractC10311e02)) {
                abstractC10311e02 = ((InterfaceC10318g1) C10780s.m38866s0(abstractC10311e02.mo35991M0())).getType();
                C9768m.m32345e(abstractC10311e02, "type.arguments.single().type");
                i2++;
            }
            InterfaceC10561h mo32891w = abstractC10311e02.mo35993O0().mo32891w();
            if (mo32891w instanceof InterfaceC10552e) {
                C10126b m36073g = C10202a.m36073g(mo32891w);
                return m36073g == null ? new C10188q(new b.a(abstractC10311e0)) : new C10188q(m36073g, i2);
            }
            if (!(mo32891w instanceof InterfaceC10554e1)) {
                return null;
            }
            C10126b m35408m = C10126b.m35408m(C9884k.a.f37562b.m35441l());
            C9768m.m32345e(m35408m, "topLevel(StandardNames.FqNames.any.toSafe())");
            return new C10188q(m35408m, 0);
        }
    }

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.q$b */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.q$b$a */
        public static final class a extends b {

            /* renamed from: a */
            private final AbstractC10311e0 f39583a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC10311e0 abstractC10311e0) {
                super(null);
                C9768m.m32346f(abstractC10311e0, "type");
                this.f39583a = abstractC10311e0;
            }

            /* renamed from: a */
            public final AbstractC10311e0 m36054a() {
                return this.f39583a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C9768m.m32341a(this.f39583a, ((a) obj).f39583a);
            }

            public int hashCode() {
                return this.f39583a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f39583a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.q$b$b, reason: collision with other inner class name */
        public static final class C11513b extends b {

            /* renamed from: a */
            private final C10177f f39584a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11513b(C10177f c10177f) {
                super(null);
                C9768m.m32346f(c10177f, "value");
                this.f39584a = c10177f;
            }

            /* renamed from: a */
            public final int m36055a() {
                return this.f39584a.m36021c();
            }

            /* renamed from: b */
            public final C10126b m36056b() {
                return this.f39584a.m36022d();
            }

            /* renamed from: c */
            public final C10177f m36057c() {
                return this.f39584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11513b) && C9768m.m32341a(this.f39584a, ((C11513b) obj).f39584a);
            }

            public int hashCode() {
                return this.f39584a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f39584a + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10188q(b bVar) {
        super(bVar);
        C9768m.m32346f(bVar, "value");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: a */
    public AbstractC10311e0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        C10300a1 m36577h = C10300a1.f40041g.m36577h();
        InterfaceC10552e m32770E = interfaceC10559g0.mo37021o().m32770E();
        C9768m.m32345e(m32770E, "module.builtIns.kClass");
        return C10314f0.m36667g(m36577h, m32770E, C10782t.m38883e(new C10324i1(m36052c(interfaceC10559g0))));
    }

    /* renamed from: c */
    public final AbstractC10311e0 m36052c(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        b mo36023b = mo36023b();
        if (mo36023b instanceof b.a) {
            return ((b.a) mo36023b()).m36054a();
        }
        if (!(mo36023b instanceof b.C11513b)) {
            throw new NoWhenBranchMatchedException();
        }
        C10177f m36057c = ((b.C11513b) mo36023b()).m36057c();
        C10126b m36019a = m36057c.m36019a();
        int m36020b = m36057c.m36020b();
        InterfaceC10552e m38149a = C10703x.m38149a(interfaceC10559g0, m36019a);
        if (m38149a == null) {
            EnumC10393j enumC10393j = EnumC10393j.f40321k;
            String c10126b = m36019a.toString();
            C9768m.m32345e(c10126b, "classId.toString()");
            return C10394k.m37053d(enumC10393j, c10126b, String.valueOf(m36020b));
        }
        AbstractC10335m0 mo36400s = m38149a.mo36400s();
        C9768m.m32345e(mo36400s, "descriptor.defaultType");
        AbstractC10311e0 m37157w = C10424a.m37157w(mo36400s);
        for (int i2 = 0; i2 < m36020b; i2++) {
            m37157w = interfaceC10559g0.mo37021o().m32794l(EnumC10351r1.INVARIANT, m37157w);
            C9768m.m32345e(m37157w, "module.builtIns.getArray…Variance.INVARIANT, type)");
        }
        return m37157w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10188q(C10177f c10177f) {
        this(new b.C11513b(c10177f));
        C9768m.m32346f(c10177f, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10188q(C10126b c10126b, int i2) {
        this(new C10177f(c10126b, i2));
        C9768m.m32346f(c10126b, "classId");
    }
}
