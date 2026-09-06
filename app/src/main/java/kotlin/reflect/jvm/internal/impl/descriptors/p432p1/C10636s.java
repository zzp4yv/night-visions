package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10560g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10555f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10223m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10289f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10314f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10331l;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10340o;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10355t;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: LazySubstitutingClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.s */
/* loaded from: classes2.dex */
public class C10636s extends AbstractC10637t {

    /* renamed from: g */
    private final AbstractC10637t f41095g;

    /* renamed from: h */
    private final C10333l1 f41096h;

    /* renamed from: i */
    private C10333l1 f41097i;

    /* renamed from: j */
    private List<InterfaceC10554e1> f41098j;

    /* renamed from: k */
    private List<InterfaceC10554e1> f41099k;

    /* renamed from: l */
    private InterfaceC10312e1 f41100l;

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.s$a */
    class a implements Function1<InterfaceC10554e1, Boolean> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC10554e1 interfaceC10554e1) {
            return Boolean.valueOf(!interfaceC10554e1.mo37673o0());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.s$b */
    class b implements Function1<AbstractC10335m0, AbstractC10335m0> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10335m0 invoke(AbstractC10335m0 abstractC10335m0) {
            return C10636s.this.m37971N0(abstractC10335m0);
        }
    }

    public C10636s(AbstractC10637t abstractC10637t, C10333l1 c10333l1) {
        this.f41095g = abstractC10637t;
        this.f41096h = c10333l1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m37969K(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10636s.m37969K(int):void");
    }

    /* renamed from: L0 */
    private C10333l1 m37970L0() {
        List<InterfaceC10554e1> m38585Q;
        if (this.f41097i == null) {
            if (this.f41096h.m36756k()) {
                this.f41097i = this.f41096h;
            } else {
                List<InterfaceC10554e1> parameters = this.f41095g.mo32877h().getParameters();
                this.f41098j = new ArrayList(parameters.size());
                this.f41097i = C10355t.m36825b(parameters, this.f41096h.m36755j(), this, this.f41098j);
                m38585Q = C10749c0.m38585Q(this.f41098j, new a());
                this.f41099k = m38585Q;
            }
        }
        return this.f41097i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public AbstractC10335m0 m37971N0(AbstractC10335m0 abstractC10335m0) {
        return (abstractC10335m0 == null || this.f41096h.m36756k()) ? abstractC10335m0 : (AbstractC10335m0) m37970L0().m36759p(abstractC10335m0, EnumC10351r1.INVARIANT);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: A */
    public boolean mo32857A() {
        return this.f41095g.mo32857A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: D */
    public boolean mo32858D() {
        return this.f41095g.mo32858D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: D0 */
    public InterfaceC10218h mo33340D0() {
        InterfaceC10218h mo32860H = mo32860H(C10202a.m36077k(C10154d.m35819g(this.f41095g)));
        if (mo32860H == null) {
            m37969K(12);
        }
        return mo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f41095g.mo32859E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: F0 */
    public List<InterfaceC10702w0> mo36281F0() {
        List<InterfaceC10702w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37969K(17);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
    /* renamed from: H */
    public InterfaceC10218h mo32860H(AbstractC10363g abstractC10363g) {
        if (abstractC10363g == null) {
            m37969K(13);
        }
        InterfaceC10218h mo32860H = this.f41095g.mo32860H(abstractC10363g);
        if (!this.f41096h.m36756k()) {
            return new C10223m(mo32860H, m37970L0());
        }
        if (mo32860H == null) {
            m37969K(14);
        }
        return mo32860H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J */
    public Collection<InterfaceC10552e> mo32861J() {
        Collection<InterfaceC10552e> mo32861J = this.f41095g.mo32861J();
        if (mo32861J == null) {
            m37969K(31);
        }
        return mo32861J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return this.f41095g.mo32862J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: K0 */
    public InterfaceC10702w0 mo37677K0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo35674a(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f41095g.mo32863M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10552e mo36396c(C10333l1 c10333l1) {
        if (c10333l1 == null) {
            m37969K(23);
        }
        return c10333l1.m36756k() ? this : new C10636s(this, C10333l1.m36748h(c10333l1.m36755j(), m37970L0().m36755j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: R */
    public InterfaceC10549d mo32864R() {
        return this.f41095g.mo32864R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: S */
    public InterfaceC10218h mo32866S() {
        InterfaceC10218h mo32866S = this.f41095g.mo32866S();
        if (mo32866S == null) {
            m37969K(15);
        }
        return mo32866S;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: U */
    public InterfaceC10552e mo32869U() {
        return this.f41095g.mo32869U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: a0 */
    public InterfaceC10218h mo37678a0(AbstractC10327j1 abstractC10327j1) {
        if (abstractC10327j1 == null) {
            m37969K(10);
        }
        InterfaceC10218h mo36986v = mo36986v(abstractC10327j1, C10202a.m36077k(C10154d.m35819g(this)));
        if (mo36986v == null) {
            m37969K(11);
        }
        return mo36986v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10579n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        InterfaceC10576m mo32876b = this.f41095g.mo32876b();
        if (mo32876b == null) {
            m37969K(22);
        }
        return mo32876b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        InterfaceC10587g annotations = this.f41095g.getAnnotations();
        if (annotations == null) {
            m37969K(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10565i0
    public C10130f getName() {
        C10130f name = this.f41095g.getName();
        if (name == null) {
            m37969K(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u visibility = this.f41095g.getVisibility();
        if (visibility == null) {
            m37969K(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public InterfaceC10312e1 mo32877h() {
        InterfaceC10312e1 mo32877h = this.f41095g.mo32877h();
        if (this.f41096h.m36756k()) {
            if (mo32877h == null) {
                m37969K(0);
            }
            return mo32877h;
        }
        if (this.f41100l == null) {
            C10333l1 m37970L0 = m37970L0();
            Collection<AbstractC10311e0> mo35998a = mo32877h.mo35998a();
            ArrayList arrayList = new ArrayList(mo35998a.size());
            Iterator<AbstractC10311e0> it = mo35998a.iterator();
            while (it.hasNext()) {
                arrayList.add(m37970L0.m36759p(it.next(), EnumC10351r1.INVARIANT));
            }
            this.f41100l = new C10331l(this, this.f41098j, arrayList, C10289f.f40008b);
        }
        InterfaceC10312e1 interfaceC10312e1 = this.f41100l;
        if (interfaceC10312e1 == null) {
            m37969K(1);
        }
        return interfaceC10312e1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: i */
    public EnumC10555f mo32878i() {
        EnumC10555f mo32878i = this.f41095g.mo32878i();
        if (mo32878i == null) {
            m37969K(25);
        }
        return mo32878i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    public boolean isInline() {
        return this.f41095g.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: j */
    public EnumC10550d0 mo32879j() {
        EnumC10550d0 mo32879j = this.f41095g.mo32879j();
        if (mo32879j == null) {
            m37969K(26);
        }
        return mo32879j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: k */
    public Collection<InterfaceC10549d> mo32880k() {
        Collection<InterfaceC10549d> mo32880k = this.f41095g.mo32880k();
        ArrayList arrayList = new ArrayList(mo32880k.size());
        for (InterfaceC10549d interfaceC10549d : mo32880k) {
            arrayList.add(((InterfaceC10549d) interfaceC10549d.mo36992u().mo37001h(interfaceC10549d.mo37019a()).mo36997d(interfaceC10549d.mo32879j()).mo37008o(interfaceC10549d.getVisibility()).mo37011r(interfaceC10549d.mo37030i()).mo37003j(false).mo36996c()).mo36396c(m37970L0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: l */
    public boolean mo32881l() {
        return this.f41095g.mo32881l();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: m */
    public boolean mo32882m() {
        return this.f41095g.mo32882m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: s */
    public AbstractC10335m0 mo36400s() {
        AbstractC10335m0 m36670j = C10314f0.m36670j(C10340o.f40157a.mo36792a(getAnnotations(), null, null), mo32877h(), C10339n1.m36774g(mo32877h().getParameters()), false, mo33340D0());
        if (m36670j == null) {
            m37969K(16);
        }
        return m36670j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        if (interfaceC10708z0 == null) {
            m37969K(29);
        }
        return interfaceC10708z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637t
    /* renamed from: v */
    public InterfaceC10218h mo36986v(AbstractC10327j1 abstractC10327j1, AbstractC10363g abstractC10363g) {
        if (abstractC10327j1 == null) {
            m37969K(5);
        }
        if (abstractC10363g == null) {
            m37969K(6);
        }
        InterfaceC10218h mo36986v = this.f41095g.mo36986v(abstractC10327j1, abstractC10363g);
        if (!this.f41096h.m36756k()) {
            return new C10223m(mo36986v, m37970L0());
        }
        if (mo36986v == null) {
            m37969K(7);
        }
        return mo36986v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: w */
    public List<InterfaceC10554e1> mo32884w() {
        m37970L0();
        List<InterfaceC10554e1> list = this.f41099k;
        if (list == null) {
            m37969K(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: y0 */
    public InterfaceC10218h mo33348y0() {
        InterfaceC10218h mo33348y0 = this.f41095g.mo33348y0();
        if (mo33348y0 == null) {
            m37969K(28);
        }
        return mo33348y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        return this.f41095g.mo32885z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e
    /* renamed from: z0 */
    public AbstractC10560g1<AbstractC10335m0> mo32886z0() {
        AbstractC10560g1<AbstractC10335m0> mo32886z0 = this.f41095g.mo32886z0();
        if (mo32886z0 == null) {
            return null;
        }
        return mo32886z0.m37692b(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10552e mo37019a() {
        InterfaceC10552e mo37019a = this.f41095g.mo37019a();
        if (mo37019a == null) {
            m37969K(21);
        }
        return mo37019a;
    }
}
