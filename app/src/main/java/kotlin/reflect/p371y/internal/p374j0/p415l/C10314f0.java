package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10638u;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10185n;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10423x0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10390g;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.l.f0 */
/* loaded from: classes3.dex */
public final class C10314f0 {

    /* renamed from: a */
    public static final C10314f0 f40090a = new C10314f0();

    /* renamed from: b */
    private static final Function1<AbstractC10363g, AbstractC10335m0> f40091b = a.f40092f;

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$a */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f */
        public static final a f40092f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "<anonymous parameter 0>");
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$b */
    private static final class b {

        /* renamed from: a */
        private final AbstractC10335m0 f40093a;

        /* renamed from: b */
        private final InterfaceC10312e1 f40094b;

        public b(AbstractC10335m0 abstractC10335m0, InterfaceC10312e1 interfaceC10312e1) {
            this.f40093a = abstractC10335m0;
            this.f40094b = interfaceC10312e1;
        }

        /* renamed from: a */
        public final AbstractC10335m0 m36673a() {
            return this.f40093a;
        }

        /* renamed from: b */
        public final InterfaceC10312e1 m36674b() {
            return this.f40094b;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$c */
    static final class c extends Lambda implements Function1<AbstractC10363g, AbstractC10335m0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10312e1 f40095f;

        /* renamed from: g */
        final /* synthetic */ List<InterfaceC10318g1> f40096g;

        /* renamed from: h */
        final /* synthetic */ C10300a1 f40097h;

        /* renamed from: i */
        final /* synthetic */ boolean f40098i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, C10300a1 c10300a1, boolean z) {
            super(1);
            this.f40095f = interfaceC10312e1;
            this.f40096g = list;
            this.f40097h = c10300a1;
            this.f40098i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "refiner");
            b m36666f = C10314f0.f40090a.m36666f(this.f40095f, abstractC10363g, this.f40096g);
            if (m36666f == null) {
                return null;
            }
            AbstractC10335m0 m36673a = m36666f.m36673a();
            if (m36673a != null) {
                return m36673a;
            }
            C10300a1 c10300a1 = this.f40097h;
            InterfaceC10312e1 m36674b = m36666f.m36674b();
            C9768m.m32343c(m36674b);
            return C10314f0.m36668h(c10300a1, m36674b, this.f40096g, this.f40098i, abstractC10363g);
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f0$d */
    static final class d extends Lambda implements Function1<AbstractC10363g, AbstractC10335m0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10312e1 f40099f;

        /* renamed from: g */
        final /* synthetic */ List<InterfaceC10318g1> f40100g;

        /* renamed from: h */
        final /* synthetic */ C10300a1 f40101h;

        /* renamed from: i */
        final /* synthetic */ boolean f40102i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC10218h f40103j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, C10300a1 c10300a1, boolean z, InterfaceC10218h interfaceC10218h) {
            super(1);
            this.f40099f = interfaceC10312e1;
            this.f40100g = list;
            this.f40101h = c10300a1;
            this.f40102i = z;
            this.f40103j = interfaceC10218h;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            b m36666f = C10314f0.f40090a.m36666f(this.f40099f, abstractC10363g, this.f40100g);
            if (m36666f == null) {
                return null;
            }
            AbstractC10335m0 m36673a = m36666f.m36673a();
            if (m36673a != null) {
                return m36673a;
            }
            C10300a1 c10300a1 = this.f40101h;
            InterfaceC10312e1 m36674b = m36666f.m36674b();
            C9768m.m32343c(m36674b);
            return C10314f0.m36670j(c10300a1, m36674b, this.f40100g, this.f40102i, this.f40103j);
        }
    }

    private C10314f0() {
    }

    /* renamed from: b */
    public static final AbstractC10335m0 m36662b(InterfaceC10551d1 interfaceC10551d1, List<? extends InterfaceC10318g1> list) {
        C9768m.m32346f(interfaceC10551d1, "<this>");
        C9768m.m32346f(list, "arguments");
        return new C10397v0(InterfaceC10423x0.a.f40383a, false).m37081i(C10400w0.f40368a.m37090a(null, interfaceC10551d1, list), C10300a1.f40041g.m36577h());
    }

    /* renamed from: c */
    private final InterfaceC10218h m36663c(InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, AbstractC10363g abstractC10363g) {
        InterfaceC10561h mo32891w = interfaceC10312e1.mo32891w();
        if (mo32891w instanceof InterfaceC10554e1) {
            return ((InterfaceC10554e1) mo32891w).mo36400s().mo33553q();
        }
        if (mo32891w instanceof InterfaceC10552e) {
            if (abstractC10363g == null) {
                abstractC10363g = C10202a.m36077k(C10202a.m36078l(mo32891w));
            }
            return list.isEmpty() ? C10638u.m37978b((InterfaceC10552e) mo32891w, abstractC10363g) : C10638u.m37977a((InterfaceC10552e) mo32891w, AbstractC10315f1.f40104c.m36682b(interfaceC10312e1, list), abstractC10363g);
        }
        if (mo32891w instanceof InterfaceC10551d1) {
            EnumC10390g enumC10390g = EnumC10390g.SCOPE_FOR_ABBREVIATION_TYPE;
            String c10130f = ((InterfaceC10551d1) mo32891w).getName().toString();
            C9768m.m32345e(c10130f, "descriptor.name.toString()");
            return C10394k.m37051a(enumC10390g, true, c10130f);
        }
        if (interfaceC10312e1 instanceof C10308d0) {
            return ((C10308d0) interfaceC10312e1).m36601g();
        }
        throw new IllegalStateException("Unsupported classifier: " + mo32891w + " for constructor: " + interfaceC10312e1);
    }

    /* renamed from: d */
    public static final AbstractC10348q1 m36664d(AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
        C9768m.m32346f(abstractC10335m0, "lowerBound");
        C9768m.m32346f(abstractC10335m02, "upperBound");
        return C9768m.m32341a(abstractC10335m0, abstractC10335m02) ? abstractC10335m0 : new C10430z(abstractC10335m0, abstractC10335m02);
    }

    /* renamed from: e */
    public static final AbstractC10335m0 m36665e(C10300a1 c10300a1, C10185n c10185n, boolean z) {
        C9768m.m32346f(c10300a1, "attributes");
        C9768m.m32346f(c10185n, "constructor");
        return m36670j(c10300a1, c10185n, C10784u.m38888j(), z, C10394k.m37051a(EnumC10390g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final b m36666f(InterfaceC10312e1 interfaceC10312e1, AbstractC10363g abstractC10363g, List<? extends InterfaceC10318g1> list) {
        InterfaceC10561h mo36928f;
        InterfaceC10561h mo32891w = interfaceC10312e1.mo32891w();
        if (mo32891w == null || (mo36928f = abstractC10363g.mo36928f(mo32891w)) == null) {
            return null;
        }
        if (mo36928f instanceof InterfaceC10551d1) {
            return new b(m36662b((InterfaceC10551d1) mo36928f, list), null);
        }
        InterfaceC10312e1 mo35999b = mo36928f.mo32877h().mo35999b(abstractC10363g);
        C9768m.m32345e(mo35999b, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new b(null, mo35999b);
    }

    /* renamed from: g */
    public static final AbstractC10335m0 m36667g(C10300a1 c10300a1, InterfaceC10552e interfaceC10552e, List<? extends InterfaceC10318g1> list) {
        C9768m.m32346f(c10300a1, "attributes");
        C9768m.m32346f(interfaceC10552e, "descriptor");
        C9768m.m32346f(list, "arguments");
        InterfaceC10312e1 mo32877h = interfaceC10552e.mo32877h();
        C9768m.m32345e(mo32877h, "descriptor.typeConstructor");
        return m36669i(c10300a1, mo32877h, list, false, null, 16, null);
    }

    /* renamed from: h */
    public static final AbstractC10335m0 m36668h(C10300a1 c10300a1, InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, boolean z, AbstractC10363g abstractC10363g) {
        C9768m.m32346f(c10300a1, "attributes");
        C9768m.m32346f(interfaceC10312e1, "constructor");
        C9768m.m32346f(list, "arguments");
        if (!c10300a1.isEmpty() || !list.isEmpty() || z || interfaceC10312e1.mo32891w() == null) {
            return m36671k(c10300a1, interfaceC10312e1, list, z, f40090a.m36663c(interfaceC10312e1, list, abstractC10363g), new c(interfaceC10312e1, list, c10300a1, z));
        }
        InterfaceC10561h mo32891w = interfaceC10312e1.mo32891w();
        C9768m.m32343c(mo32891w);
        AbstractC10335m0 mo36400s = mo32891w.mo36400s();
        C9768m.m32345e(mo36400s, "constructor.declarationDescriptor!!.defaultType");
        return mo36400s;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC10335m0 m36669i(C10300a1 c10300a1, InterfaceC10312e1 interfaceC10312e1, List list, boolean z, AbstractC10363g abstractC10363g, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            abstractC10363g = null;
        }
        return m36668h(c10300a1, interfaceC10312e1, list, z, abstractC10363g);
    }

    /* renamed from: j */
    public static final AbstractC10335m0 m36670j(C10300a1 c10300a1, InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, boolean z, InterfaceC10218h interfaceC10218h) {
        C9768m.m32346f(c10300a1, "attributes");
        C9768m.m32346f(interfaceC10312e1, "constructor");
        C9768m.m32346f(list, "arguments");
        C9768m.m32346f(interfaceC10218h, "memberScope");
        C10338n0 c10338n0 = new C10338n0(interfaceC10312e1, list, z, interfaceC10218h, new d(interfaceC10312e1, list, c10300a1, z, interfaceC10218h));
        return c10300a1.isEmpty() ? c10338n0 : new C10341o0(c10338n0, c10300a1);
    }

    /* renamed from: k */
    public static final AbstractC10335m0 m36671k(C10300a1 c10300a1, InterfaceC10312e1 interfaceC10312e1, List<? extends InterfaceC10318g1> list, boolean z, InterfaceC10218h interfaceC10218h, Function1<? super AbstractC10363g, ? extends AbstractC10335m0> function1) {
        C9768m.m32346f(c10300a1, "attributes");
        C9768m.m32346f(interfaceC10312e1, "constructor");
        C9768m.m32346f(list, "arguments");
        C9768m.m32346f(interfaceC10218h, "memberScope");
        C9768m.m32346f(function1, "refinedTypeFactory");
        C10338n0 c10338n0 = new C10338n0(interfaceC10312e1, list, z, interfaceC10218h, function1);
        return c10300a1.isEmpty() ? c10338n0 : new C10341o0(c10338n0, c10300a1);
    }
}
