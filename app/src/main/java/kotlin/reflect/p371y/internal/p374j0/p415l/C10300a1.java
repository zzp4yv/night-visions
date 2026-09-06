package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C10749c0;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10434c;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10436e;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10450s;

/* compiled from: TypeAttributes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.a1 */
/* loaded from: classes3.dex */
public final class C10300a1 extends AbstractC10436e<AbstractC10426y0<?>, AbstractC10426y0<?>> implements Iterable<AbstractC10426y0<?>>, KMappedMarker {

    /* renamed from: g */
    public static final a f40041g = new a(null);

    /* renamed from: h */
    private static final C10300a1 f40042h = new C10300a1((List<? extends AbstractC10426y0<?>>) C10784u.m38888j());

    /* compiled from: TypeAttributes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.a1$a */
    public static final class a extends AbstractC10450s<AbstractC10426y0<?>, AbstractC10426y0<?>> {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10450s
        /* renamed from: b */
        public <T extends AbstractC10426y0<?>> int mo36575b(ConcurrentHashMap<KClass<? extends AbstractC10426y0<?>>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends AbstractC10426y0<?>>, Integer> function1) {
            int intValue;
            C9768m.m32346f(concurrentHashMap, "<this>");
            C9768m.m32346f(kClass, "kClass");
            C9768m.m32346f(function1, "compute");
            Integer num = concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(kClass);
                if (num2 == null) {
                    Integer invoke = function1.invoke(kClass);
                    concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(invoke.intValue()));
                    num2 = invoke;
                }
                C9768m.m32345e(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                intValue = num2.intValue();
            }
            return intValue;
        }

        /* renamed from: g */
        public final C10300a1 m36576g(List<? extends AbstractC10426y0<?>> list) {
            C9768m.m32346f(list, "attributes");
            return list.isEmpty() ? m36577h() : new C10300a1(list, null);
        }

        /* renamed from: h */
        public final C10300a1 m36577h() {
            return C10300a1.f40042h;
        }
    }

    private C10300a1(List<? extends AbstractC10426y0<?>> list) {
        for (AbstractC10426y0<?> abstractC10426y0 : list) {
            m37193h(abstractC10426y0.mo36721b(), abstractC10426y0);
        }
    }

    public /* synthetic */ C10300a1(List list, C9756g c9756g) {
        this((List<? extends AbstractC10426y0<?>>) list);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10432a
    /* renamed from: f */
    protected AbstractC10450s<AbstractC10426y0<?>, AbstractC10426y0<?>> mo36568f() {
        return f40041g;
    }

    /* renamed from: n */
    public final C10300a1 m36569n(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "other");
        if (isEmpty() && c10300a1.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f40041g.m37222e().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            AbstractC10426y0<?> abstractC10426y0 = mo37184c().get(intValue);
            AbstractC10426y0<?> abstractC10426y02 = c10300a1.mo37184c().get(intValue);
            C10734a.m38508a(arrayList, abstractC10426y0 == null ? abstractC10426y02 != null ? abstractC10426y02.mo36720a(abstractC10426y0) : null : abstractC10426y0.mo36720a(abstractC10426y02));
        }
        return f40041g.m36576g(arrayList);
    }

    /* renamed from: o */
    public final boolean m36570o(AbstractC10426y0<?> abstractC10426y0) {
        C9768m.m32346f(abstractC10426y0, "attribute");
        return mo37184c().get(f40041g.m37221d(abstractC10426y0.mo36721b())) != null;
    }

    /* renamed from: q */
    public final C10300a1 m36571q(C10300a1 c10300a1) {
        C9768m.m32346f(c10300a1, "other");
        if (isEmpty() && c10300a1.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f40041g.m37222e().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            AbstractC10426y0<?> abstractC10426y0 = mo37184c().get(intValue);
            AbstractC10426y0<?> abstractC10426y02 = c10300a1.mo37184c().get(intValue);
            C10734a.m38508a(arrayList, abstractC10426y0 == null ? abstractC10426y02 != null ? abstractC10426y02.mo36722c(abstractC10426y0) : null : abstractC10426y0.mo36722c(abstractC10426y02));
        }
        return f40041g.m36576g(arrayList);
    }

    /* renamed from: r */
    public final C10300a1 m36572r(AbstractC10426y0<?> abstractC10426y0) {
        C9768m.m32346f(abstractC10426y0, "attribute");
        if (m36570o(abstractC10426y0)) {
            return this;
        }
        if (isEmpty()) {
            return new C10300a1(abstractC10426y0);
        }
        return f40041g.m36576g(C10749c0.m38610p0(C10749c0.m38569E0(this), abstractC10426y0));
    }

    /* renamed from: s */
    public final C10300a1 m36573s(AbstractC10426y0<?> abstractC10426y0) {
        C9768m.m32346f(abstractC10426y0, "attribute");
        if (isEmpty()) {
            return this;
        }
        AbstractC10434c<AbstractC10426y0<?>> mo37184c = mo37184c();
        ArrayList arrayList = new ArrayList();
        for (AbstractC10426y0<?> abstractC10426y02 : mo37184c) {
            if (!C9768m.m32341a(abstractC10426y02, abstractC10426y0)) {
                arrayList.add(abstractC10426y02);
            }
        }
        return arrayList.size() == mo37184c().mo37188c() ? this : f40041g.m36576g(arrayList);
    }

    private C10300a1(AbstractC10426y0<?> abstractC10426y0) {
        this((List<? extends AbstractC10426y0<?>>) C10782t.m38883e(abstractC10426y0));
    }
}
