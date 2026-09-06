package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10623j0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: AbstractTypeAliasDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d */
/* loaded from: classes2.dex */
public abstract class AbstractC10610d extends AbstractC10624k implements InterfaceC10551d1 {

    /* renamed from: j */
    private final AbstractC10697u f40947j;

    /* renamed from: k */
    private List<? extends InterfaceC10554e1> f40948k;

    /* renamed from: l */
    private final c f40949l;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d$a */
    static final class a extends Lambda implements Function1<AbstractC10363g, AbstractC10335m0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke(AbstractC10363g abstractC10363g) {
            InterfaceC10561h mo36928f = abstractC10363g.mo36928f(AbstractC10610d.this);
            if (mo36928f != null) {
                return mo36928f.mo36400s();
            }
            return null;
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d$b */
    static final class b extends Lambda implements Function1<AbstractC10348q1, Boolean> {
        b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            if (((r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1) && !kotlin.jvm.internal.C9768m.m32341a(((kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1) r5).mo32876b(), r0)) != false) goto L13;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.C9768m.m32345e(r5, r0)
                boolean r0 = kotlin.reflect.p371y.internal.p374j0.p415l.C10317g0.m36706a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L2d
                kotlin.reflect.jvm.internal.impl.descriptors.p1.d r0 = kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10610d.this
                kotlin.f0.y.e.j0.l.e1 r5 = r5.mo35993O0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r5 = r5.mo32891w()
                boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
                if (r3 == 0) goto L29
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1) r5
                kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.mo32876b()
                boolean r5 = kotlin.jvm.internal.C9768m.m32341a(r5, r0)
                if (r5 != 0) goto L29
                r5 = 1
                goto L2a
            L29:
                r5 = 0
            L2a:
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r1 = 0
            L2e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10610d.b.invoke(kotlin.f0.y.e.j0.l.q1):java.lang.Boolean");
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.d$c */
    public static final class c implements InterfaceC10312e1 {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: a */
        public Collection<AbstractC10311e0> mo35998a() {
            Collection<AbstractC10311e0> mo35998a = mo32891w().mo36397g0().mo35993O0().mo35998a();
            C9768m.m32345e(mo35998a, "declarationDescriptor.un…pe.constructor.supertypes");
            return mo35998a;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: b */
        public InterfaceC10312e1 mo35999b(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            return this;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public InterfaceC10551d1 mo32891w() {
            return AbstractC10610d.this;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        public List<InterfaceC10554e1> getParameters() {
            return AbstractC10610d.this.mo36390N0();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
        /* renamed from: o */
        public AbstractC9881h mo36004o() {
            return C10202a.m36072f(mo32891w());
        }

        public String toString() {
            return "[typealias " + mo32891w().getName().m35455k() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10610d(InterfaceC10576m interfaceC10576m, InterfaceC10587g interfaceC10587g, C10130f c10130f, InterfaceC10708z0 interfaceC10708z0, AbstractC10697u abstractC10697u) {
        super(interfaceC10576m, interfaceC10587g, c10130f, interfaceC10708z0);
        C9768m.m32346f(interfaceC10576m, "containingDeclaration");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC10708z0, "sourceElement");
        C9768m.m32346f(abstractC10697u, "visibilityImpl");
        this.f40947j = abstractC10697u;
        this.f40949l = new c();
    }

    /* renamed from: A0 */
    protected final AbstractC10335m0 m37819A0() {
        InterfaceC10218h interfaceC10218h;
        InterfaceC10552e mo36399r = mo36399r();
        if (mo36399r == null || (interfaceC10218h = mo36399r.mo33340D0()) == null) {
            interfaceC10218h = InterfaceC10218h.b.f39671b;
        }
        AbstractC10335m0 m36787t = C10339n1.m36787t(this, interfaceC10218h, new a());
        C9768m.m32345e(m36787t, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return m36787t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        C9768m.m32346f(interfaceC10595o, "visitor");
        return interfaceC10595o.mo35677e(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10624k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10551d1 mo37019a() {
        InterfaceC10602p mo37019a = super.mo37019a();
        C9768m.m32344d(mo37019a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (InterfaceC10551d1) mo37019a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    /* renamed from: M0 */
    public final Collection<InterfaceC10621i0> m37821M0() {
        InterfaceC10552e mo36399r = mo36399r();
        if (mo36399r == null) {
            return C10784u.m38888j();
        }
        Collection<InterfaceC10549d> mo32880k = mo36399r.mo32880k();
        C9768m.m32345e(mo32880k, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10549d interfaceC10549d : mo32880k) {
            C10623j0.a aVar = C10623j0.f40988J;
            InterfaceC10297n mo36398h0 = mo36398h0();
            C9768m.m32345e(interfaceC10549d, "it");
            InterfaceC10621i0 m37868b = aVar.m37868b(mo36398h0, this, interfaceC10549d);
            if (m37868b != null) {
                arrayList.add(m37868b);
            }
        }
        return arrayList;
    }

    /* renamed from: N0 */
    protected abstract List<InterfaceC10554e1> mo36390N0();

    /* renamed from: O0 */
    public final void m37822O0(List<? extends InterfaceC10554e1> list) {
        C9768m.m32346f(list, "declaredTypeParameters");
        this.f40948k = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        return this.f40947j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public InterfaceC10312e1 mo32877h() {
        return this.f40949l;
    }

    /* renamed from: h0 */
    protected abstract InterfaceC10297n mo36398h0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: m */
    public boolean mo32882m() {
        return C10339n1.m36770c(mo36397g0(), new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j
    public String toString() {
        return "typealias " + getName().m35455k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10564i
    /* renamed from: w */
    public List<InterfaceC10554e1> mo32884w() {
        List list = this.f40948k;
        if (list != null) {
            return list;
        }
        C9768m.m32363w("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }
}
