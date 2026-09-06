package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10090b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10095g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10107s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10109u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p410j.C10234a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.d */
/* loaded from: classes3.dex */
public final class C10241d implements InterfaceC10239c<InterfaceC10583c, AbstractC10178g<?>> {

    /* renamed from: a */
    private final C10234a f39733a;

    /* renamed from: b */
    private final C10243e f39734b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39735a;

        static {
            int[] iArr = new int[EnumC10237b.values().length];
            iArr[EnumC10237b.PROPERTY.ordinal()] = 1;
            iArr[EnumC10237b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[EnumC10237b.PROPERTY_SETTER.ordinal()] = 3;
            f39735a = iArr;
        }
    }

    public C10241d(InterfaceC10559g0 interfaceC10559g0, C10568j0 c10568j0, C10234a c10234a) {
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(c10234a, "protocol");
        this.f39733a = c10234a;
        this.f39734b = new C10243e(interfaceC10559g0, c10568j0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: a */
    public List<InterfaceC10583c> mo33870a(C10107s c10107s, InterfaceC10118c interfaceC10118c) {
        C9768m.m32346f(c10107s, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        List list = (List) c10107s.m38401u(this.f39733a.m36197l());
        if (list == null) {
            list = C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10090b) it.next(), interfaceC10118c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: b */
    public List<InterfaceC10583c> mo33871b(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b, int i2, C10109u c10109u) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(interfaceC10723o, "callableProto");
        C9768m.m32346f(enumC10237b, "kind");
        C9768m.m32346f(c10109u, "proto");
        List list = (List) c10109u.m38401u(this.f39733a.m36192g());
        if (list == null) {
            list = C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10090b) it.next(), abstractC10283z.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: c */
    public List<InterfaceC10583c> mo33872c(AbstractC10283z.a aVar) {
        C9768m.m32346f(aVar, "container");
        List list = (List) aVar.m36502f().m38401u(this.f39733a.m36186a());
        if (list == null) {
            list = C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10090b) it.next(), aVar.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: d */
    public List<InterfaceC10583c> mo33873d(C10105q c10105q, InterfaceC10118c interfaceC10118c) {
        C9768m.m32346f(c10105q, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        List list = (List) c10105q.m38401u(this.f39733a.m36196k());
        if (list == null) {
            list = C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10090b) it.next(), interfaceC10118c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: f */
    public List<InterfaceC10583c> mo33874f(AbstractC10283z abstractC10283z, C10095g c10095g) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10095g, "proto");
        List list = (List) c10095g.m38401u(this.f39733a.m36189d());
        if (list == null) {
            list = C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10090b) it.next(), abstractC10283z.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: g */
    public List<InterfaceC10583c> mo33875g(AbstractC10283z abstractC10283z, C10102n c10102n) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: h */
    public List<InterfaceC10583c> mo33876h(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(interfaceC10723o, "proto");
        C9768m.m32346f(enumC10237b, "kind");
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: i */
    public List<InterfaceC10583c> mo33877i(AbstractC10283z abstractC10283z, C10102n c10102n) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10245f
    /* renamed from: j */
    public List<InterfaceC10583c> mo33878j(AbstractC10283z abstractC10283z, InterfaceC10723o interfaceC10723o, EnumC10237b enumC10237b) {
        List list;
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(interfaceC10723o, "proto");
        C9768m.m32346f(enumC10237b, "kind");
        if (interfaceC10723o instanceof C10092d) {
            list = (List) ((C10092d) interfaceC10723o).m38401u(this.f39733a.m36188c());
        } else if (interfaceC10723o instanceof C10097i) {
            list = (List) ((C10097i) interfaceC10723o).m38401u(this.f39733a.m36191f());
        } else {
            if (!(interfaceC10723o instanceof C10102n)) {
                throw new IllegalStateException(("Unknown message: " + interfaceC10723o).toString());
            }
            int i2 = a.f39735a[enumC10237b.ordinal()];
            if (i2 == 1) {
                list = (List) ((C10102n) interfaceC10723o).m38401u(this.f39733a.m36193h());
            } else if (i2 == 2) {
                list = (List) ((C10102n) interfaceC10723o).m38401u(this.f39733a.m36194i());
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                list = (List) ((C10102n) interfaceC10723o).m38401u(this.f39733a.m36195j());
            }
        }
        if (list == null) {
            list = C10784u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10090b) it.next(), abstractC10283z.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10239c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC10178g<?> mo33843k(AbstractC10283z abstractC10283z, C10102n c10102n, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(abstractC10311e0, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10239c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC10178g<?> mo33842e(AbstractC10283z abstractC10283z, C10102n c10102n, AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10283z, "container");
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(abstractC10311e0, "expectedType");
        C10090b.b.c cVar = (C10090b.b.c) C10120e.m35380a(c10102n, this.f39733a.m36187b());
        if (cVar == null) {
            return null;
        }
        return this.f39734b.m36243f(abstractC10311e0, cVar, abstractC10283z.m36498b());
    }
}
