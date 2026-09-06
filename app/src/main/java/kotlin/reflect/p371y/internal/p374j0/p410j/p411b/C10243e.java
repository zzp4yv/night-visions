package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10549d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10584d;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10090b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10182k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10171a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10174c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10175d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10176e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10180i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10183l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10184m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10188q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10189r;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10192u;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10193v;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10194w;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10195x;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10196y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10197z;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;

/* compiled from: AnnotationDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.e */
/* loaded from: classes3.dex */
public final class C10243e {

    /* renamed from: a */
    private final InterfaceC10559g0 f39750a;

    /* renamed from: b */
    private final C10568j0 f39751b;

    /* compiled from: AnnotationDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39752a;

        static {
            int[] iArr = new int[C10090b.b.c.EnumC11508c.values().length];
            iArr[C10090b.b.c.EnumC11508c.BYTE.ordinal()] = 1;
            iArr[C10090b.b.c.EnumC11508c.CHAR.ordinal()] = 2;
            iArr[C10090b.b.c.EnumC11508c.SHORT.ordinal()] = 3;
            iArr[C10090b.b.c.EnumC11508c.INT.ordinal()] = 4;
            iArr[C10090b.b.c.EnumC11508c.LONG.ordinal()] = 5;
            iArr[C10090b.b.c.EnumC11508c.FLOAT.ordinal()] = 6;
            iArr[C10090b.b.c.EnumC11508c.DOUBLE.ordinal()] = 7;
            iArr[C10090b.b.c.EnumC11508c.BOOLEAN.ordinal()] = 8;
            iArr[C10090b.b.c.EnumC11508c.STRING.ordinal()] = 9;
            iArr[C10090b.b.c.EnumC11508c.CLASS.ordinal()] = 10;
            iArr[C10090b.b.c.EnumC11508c.ENUM.ordinal()] = 11;
            iArr[C10090b.b.c.EnumC11508c.ANNOTATION.ordinal()] = 12;
            iArr[C10090b.b.c.EnumC11508c.ARRAY.ordinal()] = 13;
            f39752a = iArr;
        }
    }

    public C10243e(InterfaceC10559g0 interfaceC10559g0, C10568j0 c10568j0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        this.f39750a = interfaceC10559g0;
        this.f39751b = c10568j0;
    }

    /* renamed from: b */
    private final boolean m36237b(AbstractC10178g<?> abstractC10178g, AbstractC10311e0 abstractC10311e0, C10090b.b.c cVar) {
        Iterable m38889k;
        C10090b.b.c.EnumC11508c m34342S = cVar.m34342S();
        int i2 = m34342S == null ? -1 : a.f39752a[m34342S.ordinal()];
        if (i2 == 10) {
            InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
            InterfaceC10552e interfaceC10552e = mo32891w instanceof InterfaceC10552e ? (InterfaceC10552e) mo32891w : null;
            if (interfaceC10552e != null && !AbstractC9881h.m32748k0(interfaceC10552e)) {
                return false;
            }
        } else {
            if (i2 != 13) {
                return C9768m.m32341a(abstractC10178g.mo36013a(this.f39750a), abstractC10311e0);
            }
            if (!((abstractC10178g instanceof C10173b) && ((C10173b) abstractC10178g).mo36023b().size() == cVar.m34334J().size())) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC10178g).toString());
            }
            AbstractC10311e0 m32793k = m36238c().m32793k(abstractC10311e0);
            C9768m.m32345e(m32793k, "builtIns.getArrayElementType(expectedType)");
            C10173b c10173b = (C10173b) abstractC10178g;
            m38889k = C10784u.m38889k(c10173b.mo36023b());
            if (!(m38889k instanceof Collection) || !((Collection) m38889k).isEmpty()) {
                Iterator it = m38889k.iterator();
                while (it.hasNext()) {
                    int mo32397b = ((IntIterator) it).mo32397b();
                    AbstractC10178g<?> abstractC10178g2 = c10173b.mo36023b().get(mo32397b);
                    C10090b.b.c m34332H = cVar.m34332H(mo32397b);
                    C9768m.m32345e(m34332H, "value.getArrayElement(i)");
                    if (!m36237b(abstractC10178g2, m32793k, m34332H)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    private final AbstractC9881h m36238c() {
        return this.f39750a.mo37021o();
    }

    /* renamed from: d */
    private final Pair<C10130f, AbstractC10178g<?>> m36239d(C10090b.b bVar, Map<C10130f, ? extends InterfaceC10566i1> map, InterfaceC10118c interfaceC10118c) {
        InterfaceC10566i1 interfaceC10566i1 = map.get(C10281x.m36495b(interfaceC10118c, bVar.m34297w()));
        if (interfaceC10566i1 == null) {
            return null;
        }
        C10130f m36495b = C10281x.m36495b(interfaceC10118c, bVar.m34297w());
        AbstractC10311e0 type = interfaceC10566i1.getType();
        C9768m.m32345e(type, "parameter.type");
        C10090b.b.c m34298x = bVar.m34298x();
        C9768m.m32345e(m34298x, "proto.value");
        return new Pair<>(m36495b, m36241g(type, m34298x, interfaceC10118c));
    }

    /* renamed from: e */
    private final InterfaceC10552e m36240e(C10126b c10126b) {
        return C10703x.m38151c(this.f39750a, c10126b, this.f39751b);
    }

    /* renamed from: g */
    private final AbstractC10178g<?> m36241g(AbstractC10311e0 abstractC10311e0, C10090b.b.c cVar, InterfaceC10118c interfaceC10118c) {
        AbstractC10178g<?> m36243f = m36243f(abstractC10311e0, cVar, interfaceC10118c);
        if (!m36237b(m36243f, abstractC10311e0, cVar)) {
            m36243f = null;
        }
        if (m36243f != null) {
            return m36243f;
        }
        return AbstractC10182k.f39565b.m36032a("Unexpected argument value: actual type " + cVar.m34342S() + " != expected type " + abstractC10311e0);
    }

    /* renamed from: a */
    public final InterfaceC10583c m36242a(C10090b c10090b, InterfaceC10118c interfaceC10118c) {
        Map m38797i;
        int m38793e;
        int m32419b;
        C9768m.m32346f(c10090b, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        InterfaceC10552e m36240e = m36240e(C10281x.m36494a(interfaceC10118c, c10090b.m34279A()));
        m38797i = C10777q0.m38797i();
        if (c10090b.m34284x() != 0 && !C10394k.m37054m(m36240e) && C10154d.m35832t(m36240e)) {
            Collection<InterfaceC10549d> mo32880k = m36240e.mo32880k();
            C9768m.m32345e(mo32880k, "annotationClass.constructors");
            InterfaceC10549d interfaceC10549d = (InterfaceC10549d) C10780s.m38868t0(mo32880k);
            if (interfaceC10549d != null) {
                List<InterfaceC10566i1> mo37028f = interfaceC10549d.mo37028f();
                C9768m.m32345e(mo37028f, "constructor.valueParameters");
                m38793e = C10775p0.m38793e(C10786v.m38911u(mo37028f, 10));
                m32419b = C9815l.m32419b(m38793e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
                for (Object obj : mo37028f) {
                    linkedHashMap.put(((InterfaceC10566i1) obj).getName(), obj);
                }
                List<C10090b.b> m34285y = c10090b.m34285y();
                C9768m.m32345e(m34285y, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C10090b.b bVar : m34285y) {
                    C9768m.m32345e(bVar, "it");
                    Pair<C10130f, AbstractC10178g<?>> m36239d = m36239d(bVar, linkedHashMap, interfaceC10118c);
                    if (m36239d != null) {
                        arrayList.add(m36239d);
                    }
                }
                m38797i = C10777q0.m38805q(arrayList);
            }
        }
        return new C10584d(m36240e.mo36400s(), m38797i, InterfaceC10708z0.f41247a);
    }

    /* renamed from: f */
    public final AbstractC10178g<?> m36243f(AbstractC10311e0 abstractC10311e0, C10090b.b.c cVar, InterfaceC10118c interfaceC10118c) {
        AbstractC10178g<?> c10176e;
        C9768m.m32346f(abstractC10311e0, "expectedType");
        C9768m.m32346f(cVar, "value");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        Boolean mo35368d = C10117b.f39203O.mo35368d(cVar.m34338O());
        C9768m.m32345e(mo35368d, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = mo35368d.booleanValue();
        C10090b.b.c.EnumC11508c m34342S = cVar.m34342S();
        switch (m34342S == null ? -1 : a.f39752a[m34342S.ordinal()]) {
            case 1:
                byte m34340Q = (byte) cVar.m34340Q();
                return booleanValue ? new C10194w(m34340Q) : new C10175d(m34340Q);
            case 2:
                c10176e = new C10176e((char) cVar.m34340Q());
                break;
            case 3:
                short m34340Q2 = (short) cVar.m34340Q();
                return booleanValue ? new C10197z(m34340Q2) : new C10192u(m34340Q2);
            case 4:
                int m34340Q3 = (int) cVar.m34340Q();
                if (booleanValue) {
                    c10176e = new C10195x(m34340Q3);
                    break;
                } else {
                    c10176e = new C10184m(m34340Q3);
                    break;
                }
            case 5:
                long m34340Q4 = cVar.m34340Q();
                return booleanValue ? new C10196y(m34340Q4) : new C10189r(m34340Q4);
            case 6:
                c10176e = new C10183l(cVar.m34339P());
                break;
            case 7:
                c10176e = new C10180i(cVar.m34336M());
                break;
            case 8:
                c10176e = new C10174c(cVar.m34340Q() != 0);
                break;
            case 9:
                c10176e = new C10193v(interfaceC10118c.getString(cVar.m34341R()));
                break;
            case 10:
                c10176e = new C10188q(C10281x.m36494a(interfaceC10118c, cVar.m34335K()), cVar.m34331G());
                break;
            case 11:
                c10176e = new C10181j(C10281x.m36494a(interfaceC10118c, cVar.m34335K()), C10281x.m36495b(interfaceC10118c, cVar.m34337N()));
                break;
            case 12:
                C10090b m34330F = cVar.m34330F();
                C9768m.m32345e(m34330F, "value.annotation");
                c10176e = new C10171a(m36242a(m34330F, interfaceC10118c));
                break;
            case 13:
                List<C10090b.b.c> m34334J = cVar.m34334J();
                C9768m.m32345e(m34334J, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C10786v.m38911u(m34334J, 10));
                for (C10090b.b.c cVar2 : m34334J) {
                    AbstractC10335m0 m32791i = m36238c().m32791i();
                    C9768m.m32345e(m32791i, "builtIns.anyType");
                    C9768m.m32345e(cVar2, "it");
                    arrayList.add(m36243f(m32791i, cVar2, interfaceC10118c));
                }
                return new C10271n(arrayList, abstractC10311e0);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.m34342S() + " (expected " + abstractC10311e0 + ')').toString());
        }
        return c10176e;
    }
}
