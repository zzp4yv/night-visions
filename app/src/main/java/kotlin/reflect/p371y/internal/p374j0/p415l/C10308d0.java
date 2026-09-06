package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.comparisons.C10806b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10224n;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10408h;

/* compiled from: IntersectionTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.d0 */
/* loaded from: classes3.dex */
public final class C10308d0 implements InterfaceC10312e1, InterfaceC10408h {

    /* renamed from: a */
    private AbstractC10311e0 f40048a;

    /* renamed from: b */
    private final LinkedHashSet<AbstractC10311e0> f40049b;

    /* renamed from: c */
    private final int f40050c;

    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$a */
    static final class a extends Lambda implements Function1<AbstractC10363g, AbstractC10335m0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10335m0 invoke(AbstractC10363g abstractC10363g) {
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
            return C10308d0.this.mo35999b(abstractC10363g).m36602h();
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$b */
    public static final class b<T> implements Comparator {

        /* renamed from: f */
        final /* synthetic */ Function1 f40052f;

        public b(Function1 function1) {
            this.f40052f = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m39017a;
            AbstractC10311e0 abstractC10311e0 = (AbstractC10311e0) t;
            Function1 function1 = this.f40052f;
            C9768m.m32345e(abstractC10311e0, "it");
            String obj = function1.invoke(abstractC10311e0).toString();
            AbstractC10311e0 abstractC10311e02 = (AbstractC10311e0) t2;
            Function1 function12 = this.f40052f;
            C9768m.m32345e(abstractC10311e02, "it");
            m39017a = C10806b.m39017a(obj, function12.invoke(abstractC10311e02).toString());
            return m39017a;
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$c */
    static final class c extends Lambda implements Function1<AbstractC10311e0, String> {

        /* renamed from: f */
        public static final c f40053f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(AbstractC10311e0 abstractC10311e0) {
            C9768m.m32346f(abstractC10311e0, "it");
            return abstractC10311e0.toString();
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d0$d */
    static final class d extends Lambda implements Function1<AbstractC10311e0, CharSequence> {

        /* renamed from: f */
        final /* synthetic */ Function1<AbstractC10311e0, Object> f40054f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super AbstractC10311e0, ? extends Object> function1) {
            super(1);
            this.f40054f = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC10311e0 abstractC10311e0) {
            Function1<AbstractC10311e0, Object> function1 = this.f40054f;
            C9768m.m32345e(abstractC10311e0, "it");
            return function1.invoke(abstractC10311e0).toString();
        }
    }

    public C10308d0(Collection<? extends AbstractC10311e0> collection) {
        C9768m.m32346f(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<AbstractC10311e0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f40049b = linkedHashSet;
        this.f40050c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static /* synthetic */ String m36600k(C10308d0 c10308d0, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = c.f40053f;
        }
        return c10308d0.m36604j(function1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: a */
    public Collection<AbstractC10311e0> mo35998a() {
        return this.f40049b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: c */
    public InterfaceC10561h mo32891w() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10308d0) {
            return C9768m.m32341a(this.f40049b, ((C10308d0) obj).f40049b);
        }
        return false;
    }

    /* renamed from: g */
    public final InterfaceC10218h m36601g() {
        return C10224n.f39681b.m36175a("member scope for intersection type", this.f40049b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    public List<InterfaceC10554e1> getParameters() {
        return C10784u.m38888j();
    }

    /* renamed from: h */
    public final AbstractC10335m0 m36602h() {
        return C10314f0.m36671k(C10300a1.f40041g.m36577h(), this, C10784u.m38888j(), false, m36601g(), new a());
    }

    public int hashCode() {
        return this.f40050c;
    }

    /* renamed from: i */
    public final AbstractC10311e0 m36603i() {
        return this.f40048a;
    }

    /* renamed from: j */
    public final String m36604j(Function1<? super AbstractC10311e0, ? extends Object> function1) {
        List m38618x0;
        String m38599e0;
        C9768m.m32346f(function1, "getProperTypeRelatedToStringify");
        m38618x0 = C10749c0.m38618x0(this.f40049b, new b(function1));
        m38599e0 = C10749c0.m38599e0(m38618x0, " & ", "{", "}", 0, null, new d(function1), 24, null);
        return m38599e0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C10308d0 mo35999b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        Collection<AbstractC10311e0> mo35998a = mo35998a();
        ArrayList arrayList = new ArrayList(C10786v.m38911u(mo35998a, 10));
        Iterator<T> it = mo35998a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((AbstractC10311e0) it.next()).mo36558Y0(abstractC10363g));
            z = true;
        }
        C10308d0 c10308d0 = null;
        if (z) {
            AbstractC10311e0 m36603i = m36603i();
            c10308d0 = new C10308d0(arrayList).m36606m(m36603i != null ? m36603i.mo36558Y0(abstractC10363g) : null);
        }
        return c10308d0 == null ? this : c10308d0;
    }

    /* renamed from: m */
    public final C10308d0 m36606m(AbstractC10311e0 abstractC10311e0) {
        return new C10308d0(this.f40049b, abstractC10311e0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: o */
    public AbstractC9881h mo36004o() {
        AbstractC9881h mo36004o = this.f40049b.iterator().next().mo35993O0().mo36004o();
        C9768m.m32345e(mo36004o, "intersectedTypes.iterato…xt().constructor.builtIns");
        return mo36004o;
    }

    public String toString() {
        return m36600k(this, null, 1, null);
    }

    private C10308d0(Collection<? extends AbstractC10311e0> collection, AbstractC10311e0 abstractC10311e0) {
        this(collection);
        this.f40048a = abstractC10311e0;
    }
}
