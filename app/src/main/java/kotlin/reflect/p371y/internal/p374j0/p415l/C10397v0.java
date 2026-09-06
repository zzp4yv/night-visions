package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10423x0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: TypeAliasExpander.kt */
/* renamed from: kotlin.f0.y.e.j0.l.v0 */
/* loaded from: classes3.dex */
public final class C10397v0 {

    /* renamed from: a */
    public static final a f40363a = new a(null);

    /* renamed from: b */
    private static final C10397v0 f40364b = new C10397v0(InterfaceC10423x0.a.f40383a, false);

    /* renamed from: c */
    private final InterfaceC10423x0 f40365c;

    /* renamed from: d */
    private final boolean f40366d;

    /* compiled from: TypeAliasExpander.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.v0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m37083b(int i2, InterfaceC10551d1 interfaceC10551d1) {
            if (i2 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + interfaceC10551d1.getName());
        }
    }

    public C10397v0(InterfaceC10423x0 interfaceC10423x0, boolean z) {
        C9768m.m32346f(interfaceC10423x0, "reportStrategy");
        this.f40365c = interfaceC10423x0;
        this.f40366d = z;
    }

    /* renamed from: a */
    private final void m37069a(InterfaceC10587g interfaceC10587g, InterfaceC10587g interfaceC10587g2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10583c> it = interfaceC10587g.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo33162d());
        }
        for (InterfaceC10583c interfaceC10583c : interfaceC10587g2) {
            if (hashSet.contains(interfaceC10583c.mo33162d())) {
                this.f40365c.mo37131a(interfaceC10583c);
            }
        }
    }

    /* renamed from: b */
    private final void m37070b(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        C10333l1 m36746f = C10333l1.m36746f(abstractC10311e02);
        C9768m.m32345e(m36746f, "create(substitutedType)");
        int i2 = 0;
        for (Object obj : abstractC10311e02.mo35991M0()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10784u.m38898t();
            }
            InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) obj;
            if (!interfaceC10318g1.mo36710c()) {
                AbstractC10311e0 type = interfaceC10318g1.getType();
                C9768m.m32345e(type, "substitutedArgument.type");
                if (!C10424a.m37138d(type)) {
                    InterfaceC10318g1 interfaceC10318g12 = abstractC10311e0.mo35991M0().get(i2);
                    InterfaceC10554e1 interfaceC10554e1 = abstractC10311e0.mo35993O0().getParameters().get(i2);
                    if (this.f40366d) {
                        InterfaceC10423x0 interfaceC10423x0 = this.f40365c;
                        AbstractC10311e0 type2 = interfaceC10318g12.getType();
                        C9768m.m32345e(type2, "unsubstitutedArgument.type");
                        AbstractC10311e0 type3 = interfaceC10318g1.getType();
                        C9768m.m32345e(type3, "substitutedArgument.type");
                        C9768m.m32345e(interfaceC10554e1, "typeParameter");
                        interfaceC10423x0.mo37133c(m36746f, type2, type3, interfaceC10554e1);
                    }
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: c */
    private final C10396v m37071c(C10396v c10396v, C10300a1 c10300a1) {
        return c10396v.mo33547U0(m37076h(c10396v, c10300a1));
    }

    /* renamed from: d */
    private final AbstractC10335m0 m37072d(AbstractC10335m0 abstractC10335m0, C10300a1 c10300a1) {
        return C10317g0.m36706a(abstractC10335m0) ? abstractC10335m0 : C10330k1.m36739f(abstractC10335m0, null, m37076h(abstractC10335m0, c10300a1), 1, null);
    }

    /* renamed from: e */
    private final AbstractC10335m0 m37073e(AbstractC10335m0 abstractC10335m0, AbstractC10311e0 abstractC10311e0) {
        AbstractC10335m0 m36785r = C10339n1.m36785r(abstractC10335m0, abstractC10311e0.mo33691P0());
        C9768m.m32345e(m36785r, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return m36785r;
    }

    /* renamed from: f */
    private final AbstractC10335m0 m37074f(AbstractC10335m0 abstractC10335m0, AbstractC10311e0 abstractC10311e0) {
        return m37072d(m37073e(abstractC10335m0, abstractC10311e0), abstractC10311e0.mo35992N0());
    }

    /* renamed from: g */
    private final AbstractC10335m0 m37075g(C10400w0 c10400w0, C10300a1 c10300a1, boolean z) {
        InterfaceC10312e1 mo32877h = c10400w0.m37087b().mo32877h();
        C9768m.m32345e(mo32877h, "descriptor.typeConstructor");
        return C10314f0.m36670j(c10300a1, mo32877h, c10400w0.m37086a(), z, InterfaceC10218h.b.f39671b);
    }

    /* renamed from: h */
    private final C10300a1 m37076h(AbstractC10311e0 abstractC10311e0, C10300a1 c10300a1) {
        return C10317g0.m36706a(abstractC10311e0) ? abstractC10311e0.mo35992N0() : c10300a1.m36569n(abstractC10311e0.mo35992N0());
    }

    /* renamed from: j */
    private final InterfaceC10318g1 m37077j(InterfaceC10318g1 interfaceC10318g1, C10400w0 c10400w0, int i2) {
        AbstractC10348q1 mo36635R0 = interfaceC10318g1.getType().mo36635R0();
        if (C10399w.m37085a(mo36635R0)) {
            return interfaceC10318g1;
        }
        AbstractC10335m0 m36734a = C10330k1.m36734a(mo36635R0);
        if (C10317g0.m36706a(m36734a) || !C10424a.m37158x(m36734a)) {
            return interfaceC10318g1;
        }
        InterfaceC10312e1 mo35993O0 = m36734a.mo35993O0();
        InterfaceC10561h mo32891w = mo35993O0.mo32891w();
        mo35993O0.getParameters().size();
        m36734a.mo35991M0().size();
        if (mo32891w instanceof InterfaceC10554e1) {
            return interfaceC10318g1;
        }
        if (!(mo32891w instanceof InterfaceC10551d1)) {
            AbstractC10335m0 m37080m = m37080m(m36734a, c10400w0, i2);
            m37070b(m36734a, m37080m);
            return new C10324i1(interfaceC10318g1.mo36708a(), m37080m);
        }
        InterfaceC10551d1 interfaceC10551d1 = (InterfaceC10551d1) mo32891w;
        int i3 = 0;
        if (c10400w0.m37089d(interfaceC10551d1)) {
            this.f40365c.mo37134d(interfaceC10551d1);
            EnumC10351r1 enumC10351r1 = EnumC10351r1.INVARIANT;
            EnumC10393j enumC10393j = EnumC10393j.f40343v;
            String c10130f = interfaceC10551d1.getName().toString();
            C9768m.m32345e(c10130f, "typeDescriptor.name.toString()");
            return new C10324i1(enumC10351r1, C10394k.m37053d(enumC10393j, c10130f));
        }
        List<InterfaceC10318g1> mo35991M0 = m36734a.mo35991M0();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35991M0, 10));
        for (Object obj : mo35991M0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C10784u.m38898t();
            }
            arrayList.add(m37079l((InterfaceC10318g1) obj, c10400w0, mo35993O0.getParameters().get(i3), i2 + 1));
            i3 = i4;
        }
        AbstractC10335m0 m37078k = m37078k(C10400w0.f40368a.m37090a(c10400w0, interfaceC10551d1, arrayList), m36734a.mo35992N0(), m36734a.mo33691P0(), i2 + 1, false);
        AbstractC10335m0 m37080m2 = m37080m(m36734a, c10400w0, i2);
        if (!C10399w.m37085a(m37078k)) {
            m37078k = C10347q0.m36816j(m37078k, m37080m2);
        }
        return new C10324i1(interfaceC10318g1.mo36708a(), m37078k);
    }

    /* renamed from: k */
    private final AbstractC10335m0 m37078k(C10400w0 c10400w0, C10300a1 c10300a1, boolean z, int i2, boolean z2) {
        InterfaceC10318g1 m37079l = m37079l(new C10324i1(EnumC10351r1.INVARIANT, c10400w0.m37087b().mo36397g0()), c10400w0, null, i2);
        AbstractC10311e0 type = m37079l.getType();
        C9768m.m32345e(type, "expandedProjection.type");
        AbstractC10335m0 m36734a = C10330k1.m36734a(type);
        if (C10317g0.m36706a(m36734a)) {
            return m36734a;
        }
        m37079l.mo36708a();
        m37069a(m36734a.getAnnotations(), C10328k.m36731a(c10300a1));
        AbstractC10335m0 m36785r = C10339n1.m36785r(m37072d(m36734a, c10300a1), z);
        C9768m.m32345e(m36785r, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        return z2 ? C10347q0.m36816j(m36785r, m37075g(c10400w0, c10300a1, z)) : m36785r;
    }

    /* renamed from: l */
    private final InterfaceC10318g1 m37079l(InterfaceC10318g1 interfaceC10318g1, C10400w0 c10400w0, InterfaceC10554e1 interfaceC10554e1, int i2) {
        EnumC10351r1 enumC10351r1;
        EnumC10351r1 enumC10351r12;
        EnumC10351r1 enumC10351r13;
        f40363a.m37083b(i2, c10400w0.m37087b());
        if (interfaceC10318g1.mo36710c()) {
            C9768m.m32343c(interfaceC10554e1);
            InterfaceC10318g1 m36786s = C10339n1.m36786s(interfaceC10554e1);
            C9768m.m32345e(m36786s, "makeStarProjection(typeParameterDescriptor!!)");
            return m36786s;
        }
        AbstractC10311e0 type = interfaceC10318g1.getType();
        C9768m.m32345e(type, "underlyingProjection.type");
        InterfaceC10318g1 m37088c = c10400w0.m37088c(type.mo35993O0());
        if (m37088c == null) {
            return m37077j(interfaceC10318g1, c10400w0, i2);
        }
        if (m37088c.mo36710c()) {
            C9768m.m32343c(interfaceC10554e1);
            InterfaceC10318g1 m36786s2 = C10339n1.m36786s(interfaceC10554e1);
            C9768m.m32345e(m36786s2, "makeStarProjection(typeParameterDescriptor!!)");
            return m36786s2;
        }
        AbstractC10348q1 mo36635R0 = m37088c.getType().mo36635R0();
        EnumC10351r1 mo36708a = m37088c.mo36708a();
        C9768m.m32345e(mo36708a, "argument.projectionKind");
        EnumC10351r1 mo36708a2 = interfaceC10318g1.mo36708a();
        C9768m.m32345e(mo36708a2, "underlyingProjection.projectionKind");
        if (mo36708a2 != mo36708a && mo36708a2 != (enumC10351r13 = EnumC10351r1.INVARIANT)) {
            if (mo36708a == enumC10351r13) {
                mo36708a = mo36708a2;
            } else {
                this.f40365c.mo37132b(c10400w0.m37087b(), interfaceC10554e1, mo36635R0);
            }
        }
        if (interfaceC10554e1 == null || (enumC10351r1 = interfaceC10554e1.mo37672n()) == null) {
            enumC10351r1 = EnumC10351r1.INVARIANT;
        }
        C9768m.m32345e(enumC10351r1, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (enumC10351r1 != mo36708a && enumC10351r1 != (enumC10351r12 = EnumC10351r1.INVARIANT)) {
            if (mo36708a == enumC10351r12) {
                mo36708a = enumC10351r12;
            } else {
                this.f40365c.mo37132b(c10400w0.m37087b(), interfaceC10554e1, mo36635R0);
            }
        }
        m37069a(type.getAnnotations(), mo36635R0.getAnnotations());
        return new C10324i1(mo36708a, mo36635R0 instanceof C10396v ? m37071c((C10396v) mo36635R0, type.mo35992N0()) : m37074f(C10330k1.m36734a(mo36635R0), type));
    }

    /* renamed from: m */
    private final AbstractC10335m0 m37080m(AbstractC10335m0 abstractC10335m0, C10400w0 c10400w0, int i2) {
        InterfaceC10312e1 mo35993O0 = abstractC10335m0.mo35993O0();
        List<InterfaceC10318g1> mo35991M0 = abstractC10335m0.mo35991M0();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35991M0, 10));
        int i3 = 0;
        for (Object obj : mo35991M0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C10784u.m38898t();
            }
            InterfaceC10318g1 interfaceC10318g1 = (InterfaceC10318g1) obj;
            InterfaceC10318g1 m37079l = m37079l(interfaceC10318g1, c10400w0, mo35993O0.getParameters().get(i3), i2 + 1);
            if (!m37079l.mo36710c()) {
                m37079l = new C10324i1(m37079l.mo36708a(), C10339n1.m36784q(m37079l.getType(), interfaceC10318g1.getType().mo33691P0()));
            }
            arrayList.add(m37079l);
            i3 = i4;
        }
        return C10330k1.m36739f(abstractC10335m0, arrayList, null, 2, null);
    }

    /* renamed from: i */
    public final AbstractC10335m0 m37081i(C10400w0 c10400w0, C10300a1 c10300a1) {
        C9768m.m32346f(c10400w0, "typeAliasExpansion");
        C9768m.m32346f(c10300a1, "attributes");
        return m37078k(c10400w0, c10300a1, false, 0, true);
    }
}
