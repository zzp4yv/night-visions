package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;
import kotlin.reflect.p371y.internal.p374j0.C9873a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10050b.a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10071t;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10090b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10095g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10109u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10083d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10081b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10121f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.EnumC10237b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f;
import kotlin.text.C10513u;
import kotlin.text.C10514v;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10050b<A, S extends a<? extends A>> implements InterfaceC10245f<A> {

    /* renamed from: a */
    private final InterfaceC10066o f38371a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$a */
    public static abstract class a<A> {
        /* renamed from: a */
        public abstract Map<C10071t, List<A>> mo33845a();
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$b */
    private enum b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38376a;

        static {
            int[] iArr = new int[EnumC10237b.values().length];
            iArr[EnumC10237b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[EnumC10237b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[EnumC10237b.PROPERTY.ordinal()] = 3;
            f38376a = iArr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.b$d */
    public static final class d implements InterfaceC10068q.c {

        /* renamed from: a */
        final /* synthetic */ AbstractC10050b<A, S> f38377a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f38378b;

        d(AbstractC10050b<A, S> abstractC10050b, ArrayList<A> arrayList) {
            this.f38377a = abstractC10050b;
            this.f38378b = arrayList;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.c
        /* renamed from: a */
        public void mo32695a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.c
        /* renamed from: b */
        public InterfaceC10068q.a mo32696b(C10126b c10126b, InterfaceC10708z0 interfaceC10708z0) {
            C9768m.m32346f(c10126b, "classId");
            C9768m.m32346f(interfaceC10708z0, "source");
            return this.f38377a.m33886y(c10126b, interfaceC10708z0, this.f38378b);
        }
    }

    public AbstractC10050b(InterfaceC10066o interfaceC10066o) {
        C9768m.m32346f(interfaceC10066o, "kotlinClassFinder");
        this.f38371a = interfaceC10066o;
    }

    /* renamed from: B */
    private final InterfaceC10068q m33862B(AbstractC10283z.a aVar) {
        InterfaceC10708z0 m36499c = aVar.m36499c();
        C10070s c10070s = m36499c instanceof C10070s ? (C10070s) m36499c : null;
        if (c10070s != null) {
            return c10070s.m34029d();
        }
        return null;
    }

    /* renamed from: l */
    private final int m33863l(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o) {
        if (interfaceC10723o instanceof C10097i) {
            if (C10121f.m35385d((C10097i) interfaceC10723o)) {
                return 1;
            }
        } else if (interfaceC10723o instanceof C10102n) {
            if (C10121f.m35386e((C10102n) interfaceC10723o)) {
                return 1;
            }
        } else {
            if (!(interfaceC10723o instanceof C10092d)) {
                throw new UnsupportedOperationException("Unsupported message: " + interfaceC10723o.getClass());
            }
            C9768m.m32344d(abstractC10283z, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            AbstractC10283z.a aVar = (AbstractC10283z.a) abstractC10283z;
            if (aVar.m36503g() == C10091c.c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.m36505i()) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: m */
    private final List<A> m33864m(AbstractC10283z abstractC10283z, C10071t c10071t, boolean z, boolean z2, Boolean bool, boolean z3) {
        InterfaceC10068q m33879o = m33879o(abstractC10283z, m33883v(abstractC10283z, z, z2, bool, z3));
        if (m33879o == null) {
            return C10784u.m38888j();
        }
        List<A> list = mo33844p(m33879o).mo33845a().get(c10071t);
        return list == null ? C10784u.m38888j() : list;
    }

    /* renamed from: n */
    static /* synthetic */ List m33865n(AbstractC10050b abstractC10050b, AbstractC10283z abstractC10283z, C10071t c10071t, boolean z, boolean z2, Boolean bool, boolean z3, int i2, Object obj) {
        if (obj == null) {
            return abstractC10050b.m33864m(abstractC10283z, c10071t, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: s */
    public static /* synthetic */ C10071t m33866s(AbstractC10050b abstractC10050b, InterfaceC10723o interfaceC10723o, InterfaceC10118c interfaceC10118c, C10122g c10122g, EnumC10237b enumC10237b, boolean z, int i2, Object obj) {
        if (obj == null) {
            return abstractC10050b.m33881r(interfaceC10723o, interfaceC10118c, c10122g, enumC10237b, (i2 & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: u */
    public static /* synthetic */ C10071t m33867u(AbstractC10050b abstractC10050b, C10102n c10102n, InterfaceC10118c interfaceC10118c, C10122g c10122g, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            return abstractC10050b.m33882t(c10102n, interfaceC10118c, c10122g, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: z */
    private final List<A> m33868z(AbstractC10283z abstractC10283z, C10102n c10102n, b bVar) {
        boolean m37538J;
        Boolean mo35368d = C10117b.f39189A.mo35368d(c10102n.m34885b0());
        C9768m.m32345e(mo35368d, "IS_CONST.get(proto.flags)");
        boolean booleanValue = mo35368d.booleanValue();
        boolean m34257f = C10088i.m34257f(c10102n);
        if (bVar == b.PROPERTY) {
            C10071t m33867u = m33867u(this, c10102n, abstractC10283z.m36498b(), abstractC10283z.m36500d(), false, true, false, 40, null);
            return m33867u == null ? C10784u.m38888j() : m33865n(this, abstractC10283z, m33867u, true, false, Boolean.valueOf(booleanValue), m34257f, 8, null);
        }
        C10071t m33867u2 = m33867u(this, c10102n, abstractC10283z.m36498b(), abstractC10283z.m36500d(), true, false, false, 48, null);
        if (m33867u2 == null) {
            return C10784u.m38888j();
        }
        m37538J = C10514v.m37538J(m33867u2.m34030a(), "$delegate", false, 2, null);
        return m37538J != (bVar == b.DELEGATE_FIELD) ? C10784u.m38888j() : m33864m(abstractC10283z, m33867u2, true, true, Boolean.valueOf(booleanValue), m34257f);
    }

    /* renamed from: A */
    protected abstract A mo33869A(C10090b c10090b, InterfaceC10118c interfaceC10118c);

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: a */
    public List<A> mo33870a(C10107s c10107s, InterfaceC10118c interfaceC10118c) {
        C9768m.m32346f(c10107s, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        Object m38401u = c10107s.m38401u(C10079a.f38498h);
        C9768m.m32345e(m38401u, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C10090b> iterable = (Iterable) m38401u;
        ArrayList arrayList = new ArrayList(C10786v.m38911u(iterable, 10));
        for (C10090b c10090b : iterable) {
            C9768m.m32345e(c10090b, "it");
            arrayList.add(mo33869A(c10090b, interfaceC10118c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: b */
    public List<A> mo33871b(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b, int i2, C10109u c10109u) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(interfaceC10723o, "callableProto");
        C9768m.m32346f(enumC10237b, "kind");
        C9768m.m32346f(c10109u, "proto");
        C10071t m33866s = m33866s(this, interfaceC10723o, abstractC10283z.m36498b(), abstractC10283z.m36500d(), enumC10237b, false, 16, null);
        if (m33866s == null) {
            return C10784u.m38888j();
        }
        return m33865n(this, abstractC10283z, C10071t.f38485a.m34035e(m33866s, i2 + m33863l(abstractC10283z, interfaceC10723o)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: c */
    public List<A> mo33872c(AbstractC10283z.a aVar) {
        C9768m.m32346f(aVar, "container");
        InterfaceC10068q m33862B = m33862B(aVar);
        if (m33862B != null) {
            ArrayList arrayList = new ArrayList(1);
            m33862B.mo34026b(new d(this, arrayList), m33880q(m33862B));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo36497a()).toString());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: d */
    public List<A> mo33873d(C10105q c10105q, InterfaceC10118c interfaceC10118c) {
        C9768m.m32346f(c10105q, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        Object m38401u = c10105q.m38401u(C10079a.f38496f);
        C9768m.m32345e(m38401u, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C10090b> iterable = (Iterable) m38401u;
        ArrayList arrayList = new ArrayList(C10786v.m38911u(iterable, 10));
        for (C10090b c10090b : iterable) {
            C9768m.m32345e(c10090b, "it");
            arrayList.add(mo33869A(c10090b, interfaceC10118c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: f */
    public List<A> mo33874f(AbstractC10283z abstractC10283z, C10095g c10095g) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10095g, "proto");
        C10071t.a aVar = C10071t.f38485a;
        String string = abstractC10283z.m36498b().getString(c10095g.m34624F());
        String m35410c = ((AbstractC10283z.a) abstractC10283z).m36501e().m35410c();
        C9768m.m32345e(m35410c, "container as ProtoContai…Class).classId.asString()");
        return m33865n(this, abstractC10283z, aVar.m34031a(string, C10081b.m34245b(m35410c)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: g */
    public List<A> mo33875g(AbstractC10283z abstractC10283z, C10102n c10102n) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        return m33868z(abstractC10283z, c10102n, b.BACKING_FIELD);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: h */
    public List<A> mo33876h(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(interfaceC10723o, "proto");
        C9768m.m32346f(enumC10237b, "kind");
        C10071t m33866s = m33866s(this, interfaceC10723o, abstractC10283z.m36498b(), abstractC10283z.m36500d(), enumC10237b, false, 16, null);
        return m33866s != null ? m33865n(this, abstractC10283z, C10071t.f38485a.m34035e(m33866s, 0), false, false, null, false, 60, null) : C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: i */
    public List<A> mo33877i(AbstractC10283z abstractC10283z, C10102n c10102n) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        return m33868z(abstractC10283z, c10102n, b.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: j */
    public List<A> mo33878j(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(interfaceC10723o, "proto");
        C9768m.m32346f(enumC10237b, "kind");
        if (enumC10237b == EnumC10237b.PROPERTY) {
            return m33868z(abstractC10283z, (C10102n) interfaceC10723o, b.PROPERTY);
        }
        C10071t m33866s = m33866s(this, interfaceC10723o, abstractC10283z.m36498b(), abstractC10283z.m36500d(), enumC10237b, false, 16, null);
        return m33866s == null ? C10784u.m38888j() : m33865n(this, abstractC10283z, m33866s, false, false, null, false, 60, null);
    }

    /* renamed from: o */
    protected final InterfaceC10068q m33879o(AbstractC10283z abstractC10283z, InterfaceC10068q interfaceC10068q) {
        C9768m.m32346f(abstractC10283z, "container");
        if (interfaceC10068q != null) {
            return interfaceC10068q;
        }
        if (abstractC10283z instanceof AbstractC10283z.a) {
            return m33862B((AbstractC10283z.a) abstractC10283z);
        }
        return null;
    }

    /* renamed from: p */
    protected abstract S mo33844p(InterfaceC10068q interfaceC10068q);

    /* renamed from: q */
    protected byte[] m33880q(InterfaceC10068q interfaceC10068q) {
        C9768m.m32346f(interfaceC10068q, "kotlinClass");
        return null;
    }

    /* renamed from: r */
    protected final C10071t m33881r(InterfaceC10723o interfaceC10723o, InterfaceC10118c interfaceC10118c, C10122g c10122g, EnumC10237b enumC10237b, boolean z) {
        C9768m.m32346f(interfaceC10723o, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        C9768m.m32346f(enumC10237b, "kind");
        if (interfaceC10723o instanceof C10092d) {
            C10071t.a aVar = C10071t.f38485a;
            AbstractC10083d.b m34266b = C10088i.f38607a.m34266b((C10092d) interfaceC10723o, interfaceC10118c, c10122g);
            if (m34266b == null) {
                return null;
            }
            return aVar.m34032b(m34266b);
        }
        if (interfaceC10723o instanceof C10097i) {
            C10071t.a aVar2 = C10071t.f38485a;
            AbstractC10083d.b m34268e = C10088i.f38607a.m34268e((C10097i) interfaceC10723o, interfaceC10118c, c10122g);
            if (m34268e == null) {
                return null;
            }
            return aVar2.m34032b(m34268e);
        }
        if (!(interfaceC10723o instanceof C10102n)) {
            return null;
        }
        AbstractC10716h.f<C10102n, C10079a.d> fVar = C10079a.f38494d;
        C9768m.m32345e(fVar, "propertySignature");
        C10079a.d dVar = (C10079a.d) C10120e.m35380a((AbstractC10716h.d) interfaceC10723o, fVar);
        if (dVar == null) {
            return null;
        }
        int i2 = c.f38376a[enumC10237b.ordinal()];
        if (i2 == 1) {
            if (!dVar.m34145G()) {
                return null;
            }
            C10071t.a aVar3 = C10071t.f38485a;
            C10079a.c m34140B = dVar.m34140B();
            C9768m.m32345e(m34140B, "signature.getter");
            return aVar3.m34033c(interfaceC10118c, m34140B);
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return m33882t((C10102n) interfaceC10723o, interfaceC10118c, c10122g, true, true, z);
        }
        if (!dVar.m34146H()) {
            return null;
        }
        C10071t.a aVar4 = C10071t.f38485a;
        C10079a.c m34141C = dVar.m34141C();
        C9768m.m32345e(m34141C, "signature.setter");
        return aVar4.m34033c(interfaceC10118c, m34141C);
    }

    /* renamed from: t */
    protected final C10071t m33882t(C10102n c10102n, InterfaceC10118c interfaceC10118c, C10122g c10122g, boolean z, boolean z2, boolean z3) {
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        AbstractC10716h.f<C10102n, C10079a.d> fVar = C10079a.f38494d;
        C9768m.m32345e(fVar, "propertySignature");
        C10079a.d dVar = (C10079a.d) C10120e.m35380a(c10102n, fVar);
        if (dVar == null) {
            return null;
        }
        if (z) {
            AbstractC10083d.a m34267c = C10088i.f38607a.m34267c(c10102n, interfaceC10118c, c10122g, z3);
            if (m34267c == null) {
                return null;
            }
            return C10071t.f38485a.m34032b(m34267c);
        }
        if (!z2 || !dVar.m34147I()) {
            return null;
        }
        C10071t.a aVar = C10071t.f38485a;
        C10079a.c m34142D = dVar.m34142D();
        C9768m.m32345e(m34142D, "signature.syntheticMethod");
        return aVar.m34033c(interfaceC10118c, m34142D);
    }

    /* renamed from: v */
    protected final InterfaceC10068q m33883v(AbstractC10283z abstractC10283z, boolean z, boolean z2, Boolean bool, boolean z3) {
        AbstractC10283z.a m36504h;
        String m37524z;
        C9768m.m32346f(abstractC10283z, "container");
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC10283z + ')').toString());
            }
            if (abstractC10283z instanceof AbstractC10283z.a) {
                AbstractC10283z.a aVar = (AbstractC10283z.a) abstractC10283z;
                if (aVar.m36503g() == C10091c.c.INTERFACE) {
                    InterfaceC10066o interfaceC10066o = this.f38371a;
                    C10126b m35411d = aVar.m36501e().m35411d(C10130f.m35454x("DefaultImpls"));
                    C9768m.m32345e(m35411d, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                    return C10067p.m34024b(interfaceC10066o, m35411d);
                }
            }
            if (bool.booleanValue() && (abstractC10283z instanceof AbstractC10283z.b)) {
                InterfaceC10708z0 m36499c = abstractC10283z.m36499c();
                C10062k c10062k = m36499c instanceof C10062k ? (C10062k) m36499c : null;
                C10206d m33984f = c10062k != null ? c10062k.m33984f() : null;
                if (m33984f != null) {
                    InterfaceC10066o interfaceC10066o2 = this.f38371a;
                    String m36111f = m33984f.m36111f();
                    C9768m.m32345e(m36111f, "facadeClassName.internalName");
                    m37524z = C10513u.m37524z(m36111f, '/', '.', false, 4, null);
                    C10126b m35408m = C10126b.m35408m(new C10127c(m37524z));
                    C9768m.m32345e(m35408m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                    return C10067p.m34024b(interfaceC10066o2, m35408m);
                }
            }
        }
        if (z2 && (abstractC10283z instanceof AbstractC10283z.a)) {
            AbstractC10283z.a aVar2 = (AbstractC10283z.a) abstractC10283z;
            if (aVar2.m36503g() == C10091c.c.COMPANION_OBJECT && (m36504h = aVar2.m36504h()) != null && (m36504h.m36503g() == C10091c.c.CLASS || m36504h.m36503g() == C10091c.c.ENUM_CLASS || (z3 && (m36504h.m36503g() == C10091c.c.INTERFACE || m36504h.m36503g() == C10091c.c.ANNOTATION_CLASS)))) {
                return m33862B(m36504h);
            }
        }
        if (!(abstractC10283z instanceof AbstractC10283z.b) || !(abstractC10283z.m36499c() instanceof C10062k)) {
            return null;
        }
        InterfaceC10708z0 m36499c2 = abstractC10283z.m36499c();
        C9768m.m32344d(m36499c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C10062k c10062k2 = (C10062k) m36499c2;
        InterfaceC10068q m33985g = c10062k2.m33985g();
        return m33985g == null ? C10067p.m34024b(this.f38371a, c10062k2.m33982d()) : m33985g;
    }

    /* renamed from: w */
    protected final boolean m33884w(C10126b c10126b) {
        InterfaceC10068q m34024b;
        C9768m.m32346f(c10126b, "classId");
        return c10126b.m35412g() != null && C9768m.m32341a(c10126b.m35415j().m35455k(), "Container") && (m34024b = C10067p.m34024b(this.f38371a, c10126b)) != null && C9873a.f37442a.m32694c(m34024b);
    }

    /* renamed from: x */
    protected abstract InterfaceC10068q.a mo33885x(C10126b c10126b, InterfaceC10708z0 interfaceC10708z0, List<A> list);

    /* renamed from: y */
    protected final InterfaceC10068q.a m33886y(C10126b c10126b, InterfaceC10708z0 interfaceC10708z0, List<A> list) {
        C9768m.m32346f(c10126b, "annotationClassId");
        C9768m.m32346f(interfaceC10708z0, "source");
        C9768m.m32346f(list, "result");
        if (C9873a.f37442a.m32693b().contains(c10126b)) {
            return null;
        }
        return mo33885x(c10126b, interfaceC10708z0, list);
    }
}
