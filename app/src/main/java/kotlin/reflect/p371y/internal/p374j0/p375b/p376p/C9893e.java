package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10550d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10627l0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9880g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p422m.C10448q;

/* compiled from: FunctionInvokeDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.e */
/* loaded from: classes2.dex */
public final class C9893e extends C10617g0 {

    /* renamed from: J */
    public static final a f37662J = new a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: b */
        private final InterfaceC10566i1 m32909b(C9893e c9893e, int i2, InterfaceC10554e1 interfaceC10554e1) {
            String lowerCase;
            String m35455k = interfaceC10554e1.getName().m35455k();
            C9768m.m32345e(m35455k, "typeParameter.name.asString()");
            if (C9768m.m32341a(m35455k, "T")) {
                lowerCase = "instance";
            } else if (C9768m.m32341a(m35455k, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = m35455k.toLowerCase(Locale.ROOT);
                C9768m.m32345e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            InterfaceC10587g m37735b = InterfaceC10587g.f40808c.m37735b();
            C10130f m35454x = C10130f.m35454x(lowerCase);
            C9768m.m32345e(m35454x, "identifier(name)");
            AbstractC10335m0 mo36400s = interfaceC10554e1.mo36400s();
            C9768m.m32345e(mo36400s, "typeParameter.defaultType");
            InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
            C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
            return new C10627l0(c9893e, null, i2, m37735b, m35454x, mo36400s, false, false, false, null, interfaceC10708z0);
        }

        /* renamed from: a */
        public final C9893e m32910a(C9890b c9890b, boolean z) {
            Iterable<IndexedValue> m38578K0;
            C9768m.m32346f(c9890b, "functionClass");
            List<InterfaceC10554e1> mo32884w = c9890b.mo32884w();
            C9893e c9893e = new C9893e(c9890b, null, InterfaceC10543b.a.DECLARATION, z, null);
            InterfaceC10702w0 mo37677K0 = c9890b.mo37677K0();
            List<InterfaceC10702w0> m38888j = C10784u.m38888j();
            List<? extends InterfaceC10554e1> m38888j2 = C10784u.m38888j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mo32884w) {
                if (!(((InterfaceC10554e1) obj).mo37672n() == EnumC10351r1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            m38578K0 = C10749c0.m38578K0(arrayList);
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(m38578K0, 10));
            for (IndexedValue indexedValue : m38578K0) {
                arrayList2.add(C9893e.f37662J.m32909b(c9893e, indexedValue.m38649c(), (InterfaceC10554e1) indexedValue.m38650d()));
            }
            c9893e.mo37850S0(null, mo37677K0, m38888j, m38888j2, arrayList2, ((InterfaceC10554e1) C10780s.m38844g0(mo32884w)).mo36400s(), EnumC10550d0.ABSTRACT, C10695t.f41220e);
            c9893e.mo33207a1(true);
            return c9893e;
        }
    }

    private C9893e(InterfaceC10576m interfaceC10576m, C9893e c9893e, InterfaceC10543b.a aVar, boolean z) {
        super(interfaceC10576m, c9893e, InterfaceC10587g.f40808c.m37735b(), C10448q.f40464i, aVar, InterfaceC10708z0.f41247a);
        m37927g1(true);
        m37929i1(z);
        mo33206Z0(false);
    }

    public /* synthetic */ C9893e(InterfaceC10576m interfaceC10576m, C9893e c9893e, InterfaceC10543b.a aVar, boolean z, C9756g c9756g) {
        this(interfaceC10576m, c9893e, aVar, z);
    }

    /* renamed from: q1 */
    private final InterfaceC10705y m32905q1(List<C10130f> list) {
        C10130f c10130f;
        List<Pair> m38580L0;
        boolean z;
        int size = mo37028f().size() - list.size();
        boolean z2 = true;
        if (size == 0) {
            List<InterfaceC10566i1> mo37028f = mo37028f();
            C9768m.m32345e(mo37028f, "valueParameters");
            m38580L0 = C10749c0.m38580L0(list, mo37028f);
            if (!(m38580L0 instanceof Collection) || !m38580L0.isEmpty()) {
                for (Pair pair : m38580L0) {
                    if (!C9768m.m32341a((C10130f) pair.m37646a(), ((InterfaceC10566i1) pair.m37647b()).getName())) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return this;
            }
        }
        List<InterfaceC10566i1> mo37028f2 = mo37028f();
        C9768m.m32345e(mo37028f2, "valueParameters");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37028f2, 10));
        for (InterfaceC10566i1 interfaceC10566i1 : mo37028f2) {
            C10130f name = interfaceC10566i1.getName();
            C9768m.m32345e(name, "it.name");
            int mo37696g = interfaceC10566i1.mo37696g();
            int i2 = mo37696g - size;
            if (i2 >= 0 && (c10130f = list.get(i2)) != null) {
                name = c10130f;
            }
            arrayList.add(interfaceC10566i1.mo37693G0(this, name, mo37696g));
        }
        AbstractC10633p.c m37920T0 = m37920T0(C10333l1.f40139a);
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C10130f) it.next()) == null) {
                    break;
                }
            }
        }
        z2 = false;
        AbstractC10633p.c mo37001h = m37920T0.m37946H(z2).mo36995b(arrayList).mo37001h(mo37019a());
        C9768m.m32345e(mo37001h, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        InterfaceC10705y mo32907N0 = super.mo32907N0(mo37001h);
        C9768m.m32343c(mo32907N0);
        return mo32907N0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10617g0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: M0 */
    protected AbstractC10633p mo32906M0(InterfaceC10576m interfaceC10576m, InterfaceC10705y interfaceC10705y, InterfaceC10543b.a aVar, C10130f c10130f, InterfaceC10587g interfaceC10587g, InterfaceC10708z0 interfaceC10708z0) {
        C9768m.m32346f(interfaceC10576m, "newOwner");
        C9768m.m32346f(aVar, "kind");
        C9768m.m32346f(interfaceC10587g, "annotations");
        C9768m.m32346f(interfaceC10708z0, "source");
        return new C9893e(interfaceC10576m, (C9893e) interfaceC10705y, aVar, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p
    /* renamed from: N0 */
    protected InterfaceC10705y mo32907N0(AbstractC10633p.c cVar) {
        C9768m.m32346f(cVar, "configuration");
        C9893e c9893e = (C9893e) super.mo32907N0(cVar);
        if (c9893e == null) {
            return null;
        }
        List<InterfaceC10566i1> mo37028f = c9893e.mo37028f();
        C9768m.m32345e(mo37028f, "substituted.valueParameters");
        boolean z = false;
        if (!(mo37028f instanceof Collection) || !mo37028f.isEmpty()) {
            Iterator<T> it = mo37028f.iterator();
            while (it.hasNext()) {
                AbstractC10311e0 type = ((InterfaceC10566i1) it.next()).getType();
                C9768m.m32345e(type, "it.type");
                if (C9880g.m32708d(type) != null) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return c9893e;
        }
        List<InterfaceC10566i1> mo37028f2 = c9893e.mo37028f();
        C9768m.m32345e(mo37028f2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37028f2, 10));
        Iterator<T> it2 = mo37028f2.iterator();
        while (it2.hasNext()) {
            AbstractC10311e0 type2 = ((InterfaceC10566i1) it2.next()).getType();
            C9768m.m32345e(type2, "it.type");
            arrayList.add(C9880g.m32708d(type2));
        }
        return c9893e.m32905q1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    /* renamed from: P */
    public boolean mo32908P() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10633p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }
}
