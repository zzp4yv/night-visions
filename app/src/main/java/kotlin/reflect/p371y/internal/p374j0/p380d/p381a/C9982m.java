package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10133i;

/* compiled from: FakePureImplementationsProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.m */
/* loaded from: classes2.dex */
public final class C9982m {

    /* renamed from: a */
    public static final C9982m f38191a;

    /* renamed from: b */
    private static final Map<C10126b, C10126b> f38192b;

    /* renamed from: c */
    private static final Map<C10127c, C10127c> f38193c;

    static {
        Map<C10127c, C10127c> m38805q;
        C9982m c9982m = new C9982m();
        f38191a = c9982m;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f38192b = linkedHashMap;
        C10133i c10133i = C10133i.f39305a;
        c9982m.m33566c(c10133i.m35471j(), c9982m.m33565a("java.util.ArrayList", "java.util.LinkedList"));
        c9982m.m33566c(c10133i.m35473l(), c9982m.m33565a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c9982m.m33566c(c10133i.m35472k(), c9982m.m33565a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C10126b m35408m = C10126b.m35408m(new C10127c("java.util.function.Function"));
        C9768m.m32345e(m35408m, "topLevel(FqName(\"java.util.function.Function\"))");
        c9982m.m33566c(m35408m, c9982m.m33565a("java.util.function.UnaryOperator"));
        C10126b m35408m2 = C10126b.m35408m(new C10127c("java.util.function.BiFunction"));
        C9768m.m32345e(m35408m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        c9982m.m33566c(m35408m2, c9982m.m33565a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C10740s.m38547a(((C10126b) entry.getKey()).m35409b(), ((C10126b) entry.getValue()).m35409b()));
        }
        m38805q = C10777q0.m38805q(arrayList);
        f38193c = m38805q;
    }

    private C9982m() {
    }

    /* renamed from: a */
    private final List<C10126b> m33565a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C10126b.m35408m(new C10127c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private final void m33566c(C10126b c10126b, List<C10126b> list) {
        Map<C10126b, C10126b> map = f38192b;
        for (Object obj : list) {
            map.put(obj, c10126b);
        }
    }

    /* renamed from: b */
    public final C10127c m33567b(C10127c c10127c) {
        C9768m.m32346f(c10127c, "classFqName");
        return f38193c.get(c10127c);
    }
}
