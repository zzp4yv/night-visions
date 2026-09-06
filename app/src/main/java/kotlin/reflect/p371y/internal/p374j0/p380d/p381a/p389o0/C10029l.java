package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C10693s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9896c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9913b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9951a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9966e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9967f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10339n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10332l0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10424a;

/* compiled from: signatureEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.l */
/* loaded from: classes3.dex */
public final class C10029l {

    /* renamed from: a */
    private final C10021d f38272a;

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$a */
    static final class a extends Lambda implements Function1<AbstractC10348q1, Boolean> {

        /* renamed from: f */
        public static final a f38273f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10348q1 abstractC10348q1) {
            InterfaceC10561h mo32891w = abstractC10348q1.mo35993O0().mo32891w();
            if (mo32891w == null) {
                return Boolean.FALSE;
            }
            C10130f name = mo32891w.getName();
            C9896c c9896c = C9896c.f37667a;
            return Boolean.valueOf(C9768m.m32341a(name, c9896c.m32924h().m35425g()) && C9768m.m32341a(C10202a.m36070d(mo32891w), c9896c.m32924h()));
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$b */
    static final class b extends Lambda implements Function1<InterfaceC10543b, AbstractC10311e0> {

        /* renamed from: f */
        public static final b f38274f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            InterfaceC10702w0 mo37032m0 = interfaceC10543b.mo37032m0();
            C9768m.m32343c(mo37032m0);
            AbstractC10311e0 type = mo37032m0.getType();
            C9768m.m32345e(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$c */
    static final class c extends Lambda implements Function1<InterfaceC10543b, AbstractC10311e0> {

        /* renamed from: f */
        public static final c f38275f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            AbstractC10311e0 returnType = interfaceC10543b.getReturnType();
            C9768m.m32343c(returnType);
            return returnType;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$d */
    static final class d extends Lambda implements Function1<InterfaceC10543b, AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10566i1 f38276f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC10566i1 interfaceC10566i1) {
            super(1);
            this.f38276f = interfaceC10566i1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10543b interfaceC10543b) {
            C9768m.m32346f(interfaceC10543b, "it");
            AbstractC10311e0 type = interfaceC10543b.mo37028f().get(this.f38276f.mo37696g()).getType();
            C9768m.m32345e(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$e */
    static final class e extends Lambda implements Function1<AbstractC10348q1, Boolean> {

        /* renamed from: f */
        public static final e f38277f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10348q1 abstractC10348q1) {
            C9768m.m32346f(abstractC10348q1, "it");
            return Boolean.valueOf(abstractC10348q1 instanceof InterfaceC10332l0);
        }
    }

    public C10029l(C10021d c10021d) {
        C9768m.m32346f(c10021d, "typeEnhancement");
        this.f38272a = c10021d;
    }

    /* renamed from: a */
    private final boolean m33737a(AbstractC10311e0 abstractC10311e0) {
        return C10339n1.m36770c(abstractC10311e0, a.f38273f);
    }

    /* renamed from: b */
    private final AbstractC10311e0 m33738b(InterfaceC10543b interfaceC10543b, InterfaceC10581a interfaceC10581a, boolean z, C9957g c9957g, EnumC9913b enumC9913b, C10034q c10034q, boolean z2, Function1<? super InterfaceC10543b, ? extends AbstractC10311e0> function1) {
        C10031n c10031n = new C10031n(interfaceC10581a, z, c9957g, enumC9913b, false, 16, null);
        AbstractC10311e0 invoke = function1.invoke(interfaceC10543b);
        Collection<? extends InterfaceC10543b> mo37027e = interfaceC10543b.mo37027e();
        C9768m.m32345e(mo37027e, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo37027e, 10));
        for (InterfaceC10543b interfaceC10543b2 : mo37027e) {
            C9768m.m32345e(interfaceC10543b2, "it");
            arrayList.add(function1.invoke(interfaceC10543b2));
        }
        return m33739c(c10031n, invoke, arrayList, c10034q, z2);
    }

    /* renamed from: c */
    private final AbstractC10311e0 m33739c(C10031n c10031n, AbstractC10311e0 abstractC10311e0, List<? extends AbstractC10311e0> list, C10034q c10034q, boolean z) {
        return this.f38272a.m33675a(abstractC10311e0, c10031n.m33645b(abstractC10311e0, list, c10034q, z), c10031n.mo33657u());
    }

    /* renamed from: d */
    static /* synthetic */ AbstractC10311e0 m33740d(C10029l c10029l, InterfaceC10543b interfaceC10543b, InterfaceC10581a interfaceC10581a, boolean z, C9957g c9957g, EnumC9913b enumC9913b, C10034q c10034q, boolean z2, Function1 function1, int i2, Object obj) {
        return c10029l.m33738b(interfaceC10543b, interfaceC10581a, z, c9957g, enumC9913b, c10034q, (i2 & 32) != 0 ? false : z2, function1);
    }

    /* renamed from: e */
    static /* synthetic */ AbstractC10311e0 m33741e(C10029l c10029l, C10031n c10031n, AbstractC10311e0 abstractC10311e0, List list, C10034q c10034q, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            c10034q = null;
        }
        return c10029l.m33739c(c10031n, abstractC10311e0, list, c10034q, (i2 & 8) != 0 ? false : z);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fb  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10543b> D m33742f(D r21, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9957g r22) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10029l.m33742f(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.f0.y.e.j0.d.a.l0.g):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    /* renamed from: j */
    private final AbstractC10311e0 m33743j(InterfaceC10543b interfaceC10543b, InterfaceC10566i1 interfaceC10566i1, C9957g c9957g, C10034q c10034q, boolean z, Function1<? super InterfaceC10543b, ? extends AbstractC10311e0> function1) {
        C9957g m33237h;
        return m33738b(interfaceC10543b, interfaceC10566i1, false, (interfaceC10566i1 == null || (m33237h = C9951a.m33237h(c9957g, interfaceC10566i1.getAnnotations())) == null) ? c9957g : m33237h, EnumC9913b.VALUE_PARAMETER, c10034q, z, function1);
    }

    /* renamed from: k */
    private final <D extends InterfaceC10543b> InterfaceC10587g m33744k(D d2, C9957g c9957g) {
        List<? extends InterfaceC10583c> m38607m0;
        InterfaceC10561h m38123a = C10693s.m38123a(d2);
        if (m38123a == null) {
            return d2.getAnnotations();
        }
        C9967f c9967f = m38123a instanceof C9967f ? (C9967f) m38123a : null;
        List<InterfaceC9986a> m33344R0 = c9967f != null ? c9967f.m33344R0() : null;
        if (m33344R0 == null || m33344R0.isEmpty()) {
            return d2.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m33344R0, 10));
        Iterator<T> it = m33344R0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9966e(c9957g, (InterfaceC9986a) it.next(), true));
        }
        InterfaceC10587g.a aVar = InterfaceC10587g.f40808c;
        m38607m0 = C10749c0.m38607m0(d2.getAnnotations(), arrayList);
        return aVar.m37734a(m38607m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final <D extends InterfaceC10543b> Collection<D> m33745g(C9957g c9957g, Collection<? extends D> collection) {
        C9768m.m32346f(c9957g, "c");
        C9768m.m32346f(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m33742f((InterfaceC10543b) it.next(), c9957g));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final AbstractC10311e0 m33746h(AbstractC10311e0 abstractC10311e0, C9957g c9957g) {
        C9768m.m32346f(abstractC10311e0, "type");
        C9768m.m32346f(c9957g, "context");
        AbstractC10311e0 m33741e = m33741e(this, new C10031n(null, false, c9957g, EnumC9913b.TYPE_USE, true), abstractC10311e0, C10784u.m38888j(), null, false, 12, null);
        return m33741e == null ? abstractC10311e0 : m33741e;
    }

    /* renamed from: i */
    public final List<AbstractC10311e0> m33747i(InterfaceC10554e1 interfaceC10554e1, List<? extends AbstractC10311e0> list, C9957g c9957g) {
        AbstractC10311e0 m33741e;
        C9768m.m32346f(interfaceC10554e1, "typeParameter");
        C9768m.m32346f(list, "bounds");
        C9768m.m32346f(c9957g, "context");
        ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
        for (AbstractC10311e0 abstractC10311e0 : list) {
            if (!C10424a.m37136b(abstractC10311e0, e.f38277f) && (m33741e = m33741e(this, new C10031n(interfaceC10554e1, false, c9957g, EnumC9913b.TYPE_PARAMETER_BOUNDS, false, 16, null), abstractC10311e0, C10784u.m38888j(), null, false, 12, null)) != null) {
                abstractC10311e0 = m33741e;
            }
            arrayList.add(abstractC10311e0);
        }
        return arrayList;
    }
}
