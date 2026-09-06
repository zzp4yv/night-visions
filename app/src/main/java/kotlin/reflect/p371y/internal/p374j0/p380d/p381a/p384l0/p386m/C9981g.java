package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.C10517i;
import kotlin.C10740s;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.C10775p0;
import kotlin.collections.C10780s;
import kotlin.collections.C10786v;
import kotlin.collections.C10787v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9815l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10290g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10315f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10391h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: TypeParameterUpperBoundEraser.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g */
/* loaded from: classes2.dex */
public final class C9981g {

    /* renamed from: a */
    private final C10289f f38182a;

    /* renamed from: b */
    private final Lazy f38183b;

    /* renamed from: c */
    private final C9979e f38184c;

    /* renamed from: d */
    private final InterfaceC10290g<a, AbstractC10311e0> f38185d;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g$a */
    private static final class a {

        /* renamed from: a */
        private final InterfaceC10554e1 f38186a;

        /* renamed from: b */
        private final boolean f38187b;

        /* renamed from: c */
        private final C9975a f38188c;

        public a(InterfaceC10554e1 interfaceC10554e1, boolean z, C9975a c9975a) {
            C9768m.m32346f(interfaceC10554e1, "typeParameter");
            C9768m.m32346f(c9975a, "typeAttr");
            this.f38186a = interfaceC10554e1;
            this.f38187b = z;
            this.f38188c = c9975a;
        }

        /* renamed from: a */
        public final C9975a m33560a() {
            return this.f38188c;
        }

        /* renamed from: b */
        public final InterfaceC10554e1 m33561b() {
            return this.f38186a;
        }

        /* renamed from: c */
        public final boolean m33562c() {
            return this.f38187b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9768m.m32341a(aVar.f38186a, this.f38186a) && aVar.f38187b == this.f38187b && aVar.f38188c.m33502d() == this.f38188c.m33502d() && aVar.f38188c.m33503e() == this.f38188c.m33503e() && aVar.f38188c.m33505g() == this.f38188c.m33505g() && C9768m.m32341a(aVar.f38188c.m33501c(), this.f38188c.m33501c());
        }

        public int hashCode() {
            int hashCode = this.f38186a.hashCode();
            int i2 = hashCode + (hashCode * 31) + (this.f38187b ? 1 : 0);
            int hashCode2 = i2 + (i2 * 31) + this.f38188c.m33502d().hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f38188c.m33503e().hashCode();
            int i3 = hashCode3 + (hashCode3 * 31) + (this.f38188c.m33505g() ? 1 : 0);
            int i4 = i3 * 31;
            AbstractC10335m0 m33501c = this.f38188c.m33501c();
            return i3 + i4 + (m33501c != null ? m33501c.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f38186a + ", isRaw=" + this.f38187b + ", typeAttr=" + this.f38188c + ')';
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g$b */
    static final class b extends Lambda implements Function0<C10391h> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10391h invoke() {
            return C10394k.m37053d(EnumC10393j.f40352z0, C9981g.this.toString());
        }
    }

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.g$c */
    static final class c extends Lambda implements Function1<a, AbstractC10311e0> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(a aVar) {
            return C9981g.this.m33557d(aVar.m33561b(), aVar.m33562c(), aVar.m33560a());
        }
    }

    public C9981g(C9979e c9979e) {
        Lazy m37594b;
        C10289f c10289f = new C10289f("Type parameter upper bound erasion results");
        this.f38182a = c10289f;
        m37594b = C10517i.m37594b(new b());
        this.f38183b = m37594b;
        this.f38184c = c9979e == null ? new C9979e(this) : c9979e;
        InterfaceC10290g<a, AbstractC10311e0> mo36520h = c10289f.mo36520h(new c());
        C9768m.m32345e(mo36520h, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f38185d = mo36520h;
    }

    /* renamed from: b */
    private final AbstractC10311e0 m33556b(C9975a c9975a) {
        AbstractC10311e0 m37157w;
        AbstractC10335m0 m33501c = c9975a.m33501c();
        return (m33501c == null || (m37157w = C10424a.m37157w(m33501c)) == null) ? m33558e() : m37157w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final AbstractC10311e0 m33557d(InterfaceC10554e1 interfaceC10554e1, boolean z, C9975a c9975a) {
        int m38793e;
        int m32419b;
        InterfaceC10318g1 m33538j;
        Set<InterfaceC10554e1> m33504f = c9975a.m33504f();
        if (m33504f != null && m33504f.contains(interfaceC10554e1.mo37019a())) {
            return m33556b(c9975a);
        }
        AbstractC10335m0 mo36400s = interfaceC10554e1.mo36400s();
        C9768m.m32345e(mo36400s, "typeParameter.defaultType");
        Set<InterfaceC10554e1> m37140f = C10424a.m37140f(mo36400s, m33504f);
        m38793e = C10775p0.m38793e(C10786v.m38911u(m37140f, 10));
        m32419b = C9815l.m32419b(m38793e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
        for (InterfaceC10554e1 interfaceC10554e12 : m37140f) {
            if (m33504f == null || !m33504f.contains(interfaceC10554e12)) {
                C9979e c9979e = this.f38184c;
                C9975a m33507i = z ? c9975a : c9975a.m33507i(EnumC9976b.INFLEXIBLE);
                AbstractC10311e0 m33559c = m33559c(interfaceC10554e12, z, c9975a.m33508j(interfaceC10554e1));
                C9768m.m32345e(m33559c, "getErasedUpperBound(it, …Parameter(typeParameter))");
                m33538j = c9979e.m33538j(interfaceC10554e12, m33507i, m33559c);
            } else {
                m33538j = C9978d.m33528b(interfaceC10554e12, c9975a);
            }
            Pair m38547a = C10740s.m38547a(interfaceC10554e12.mo32877h(), m33538j);
            linkedHashMap.put(m38547a.m37648c(), m38547a.m37649d());
        }
        C10333l1 m36747g = C10333l1.m36747g(AbstractC10315f1.a.m36680e(AbstractC10315f1.f40104c, linkedHashMap, false, 2, null));
        C9768m.m32345e(m36747g, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<AbstractC10311e0> upperBounds = interfaceC10554e1.getUpperBounds();
        C9768m.m32345e(upperBounds, "typeParameter.upperBounds");
        AbstractC10311e0 abstractC10311e0 = (AbstractC10311e0) C10780s.m38830U(upperBounds);
        if (abstractC10311e0.mo35993O0().mo32891w() instanceof InterfaceC10552e) {
            C9768m.m32345e(abstractC10311e0, "firstUpperBound");
            return C10424a.m37156v(abstractC10311e0, m36747g, linkedHashMap, EnumC10351r1.OUT_VARIANCE, c9975a.m33504f());
        }
        Set<InterfaceC10554e1> m33504f2 = c9975a.m33504f();
        if (m33504f2 == null) {
            m33504f2 = C10787v0.m38916c(this);
        }
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        C9768m.m32344d(mo32891w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            InterfaceC10554e1 interfaceC10554e13 = (InterfaceC10554e1) mo32891w;
            if (m33504f2.contains(interfaceC10554e13)) {
                return m33556b(c9975a);
            }
            List<AbstractC10311e0> upperBounds2 = interfaceC10554e13.getUpperBounds();
            C9768m.m32345e(upperBounds2, "current.upperBounds");
            AbstractC10311e0 abstractC10311e02 = (AbstractC10311e0) C10780s.m38830U(upperBounds2);
            if (abstractC10311e02.mo35993O0().mo32891w() instanceof InterfaceC10552e) {
                C9768m.m32345e(abstractC10311e02, "nextUpperBound");
                return C10424a.m37156v(abstractC10311e02, m36747g, linkedHashMap, EnumC10351r1.OUT_VARIANCE, c9975a.m33504f());
            }
            mo32891w = abstractC10311e02.mo35993O0().mo32891w();
            C9768m.m32344d(mo32891w, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    /* renamed from: e */
    private final C10391h m33558e() {
        return (C10391h) this.f38183b.getValue();
    }

    /* renamed from: c */
    public final AbstractC10311e0 m33559c(InterfaceC10554e1 interfaceC10554e1, boolean z, C9975a c9975a) {
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        C9768m.m32346f(c9975a, "typeAttr");
        return this.f38185d.invoke(new a(interfaceC10554e1, z, c9975a));
    }

    public /* synthetic */ C9981g(C9979e c9979e, int i2, C9756g c9756g) {
        this((i2 & 1) != 0 ? null : c9979e);
    }
}
