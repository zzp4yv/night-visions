package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1 */
/* loaded from: classes2.dex */
public final class C10557f1 {

    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$a */
    static final class a extends Lambda implements Function1<InterfaceC10576m, Boolean> {

        /* renamed from: f */
        public static final a f40753f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576m interfaceC10576m) {
            C9768m.m32346f(interfaceC10576m, "it");
            return Boolean.valueOf(interfaceC10576m instanceof InterfaceC10540a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$b */
    static final class b extends Lambda implements Function1<InterfaceC10576m, Boolean> {

        /* renamed from: f */
        public static final b f40754f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576m interfaceC10576m) {
            C9768m.m32346f(interfaceC10576m, "it");
            return Boolean.valueOf(!(interfaceC10576m instanceof InterfaceC10573l));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$c */
    static final class c extends Lambda implements Function1<InterfaceC10576m, Sequence<? extends InterfaceC10554e1>> {

        /* renamed from: f */
        public static final c f40755f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<InterfaceC10554e1> invoke(InterfaceC10576m interfaceC10576m) {
            Sequence<InterfaceC10554e1> m38575J;
            C9768m.m32346f(interfaceC10576m, "it");
            List<InterfaceC10554e1> typeParameters = ((InterfaceC10540a) interfaceC10576m).getTypeParameters();
            C9768m.m32345e(typeParameters, "it as CallableDescriptor).typeParameters");
            m38575J = C10749c0.m38575J(typeParameters);
            return m38575J;
        }
    }

    /* renamed from: a */
    public static final C10650r0 m37682a(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, "<this>");
        InterfaceC10561h mo32891w = abstractC10311e0.mo35993O0().mo32891w();
        return m37683b(abstractC10311e0, mo32891w instanceof InterfaceC10564i ? (InterfaceC10564i) mo32891w : null, 0);
    }

    /* renamed from: b */
    private static final C10650r0 m37683b(AbstractC10311e0 abstractC10311e0, InterfaceC10564i interfaceC10564i, int i2) {
        if (interfaceC10564i == null || C10394k.m37054m(interfaceC10564i)) {
            return null;
        }
        int size = interfaceC10564i.mo32884w().size() + i2;
        if (interfaceC10564i.mo32882m()) {
            List<InterfaceC10318g1> subList = abstractC10311e0.mo35991M0().subList(i2, size);
            InterfaceC10576m mo32876b = interfaceC10564i.mo32876b();
            return new C10650r0(interfaceC10564i, subList, m37683b(abstractC10311e0, mo32876b instanceof InterfaceC10564i ? (InterfaceC10564i) mo32876b : null, size));
        }
        if (size != abstractC10311e0.mo35991M0().size()) {
            C10154d.m35804E(interfaceC10564i);
        }
        return new C10650r0(interfaceC10564i, abstractC10311e0.mo35991M0().subList(i2, abstractC10311e0.mo35991M0().size()), null);
    }

    /* renamed from: c */
    private static final C10546c m37684c(InterfaceC10554e1 interfaceC10554e1, InterfaceC10576m interfaceC10576m, int i2) {
        return new C10546c(interfaceC10554e1, interfaceC10576m, i2);
    }

    /* renamed from: d */
    public static final List<InterfaceC10554e1> m37685d(InterfaceC10564i interfaceC10564i) {
        Sequence m37395y;
        Sequence m37382l;
        Sequence m37386p;
        List m37377A;
        List<InterfaceC10554e1> list;
        InterfaceC10576m interfaceC10576m;
        InterfaceC10312e1 mo32877h;
        C9768m.m32346f(interfaceC10564i, "<this>");
        List<InterfaceC10554e1> mo32884w = interfaceC10564i.mo32884w();
        C9768m.m32345e(mo32884w, "declaredTypeParameters");
        if (!interfaceC10564i.mo32882m() && !(interfaceC10564i.mo32876b() instanceof InterfaceC10540a)) {
            return mo32884w;
        }
        m37395y = C10489n.m37395y(C10202a.m36079m(interfaceC10564i), a.f40753f);
        m37382l = C10489n.m37382l(m37395y, b.f40754f);
        m37386p = C10489n.m37386p(m37382l, c.f40755f);
        m37377A = C10489n.m37377A(m37386p);
        Iterator<InterfaceC10576m> it = C10202a.m36079m(interfaceC10564i).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                interfaceC10576m = null;
                break;
            }
            interfaceC10576m = it.next();
            if (interfaceC10576m instanceof InterfaceC10552e) {
                break;
            }
        }
        InterfaceC10552e interfaceC10552e = (InterfaceC10552e) interfaceC10576m;
        if (interfaceC10552e != null && (mo32877h = interfaceC10552e.mo32877h()) != null) {
            list = mo32877h.getParameters();
        }
        if (list == null) {
            list = C10784u.m38888j();
        }
        if (m37377A.isEmpty() && list.isEmpty()) {
            List<InterfaceC10554e1> mo32884w2 = interfaceC10564i.mo32884w();
            C9768m.m32345e(mo32884w2, "declaredTypeParameters");
            return mo32884w2;
        }
        List<InterfaceC10554e1> m38609o0 = C10749c0.m38609o0(m37377A, list);
        ArrayList arrayList = new ArrayList(C10786v.m38911u(m38609o0, 10));
        for (InterfaceC10554e1 interfaceC10554e1 : m38609o0) {
            C9768m.m32345e(interfaceC10554e1, "it");
            arrayList.add(m37684c(interfaceC10554e1, interfaceC10564i, mo32884w.size()));
        }
        return C10749c0.m38609o0(mo32884w, arrayList);
    }
}
