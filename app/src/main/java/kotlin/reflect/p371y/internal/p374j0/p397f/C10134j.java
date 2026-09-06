package kotlin.reflect.p371y.internal.p374j0.p397f;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.collections.C10775p0;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;

/* compiled from: StandardClassIds.kt */
/* renamed from: kotlin.f0.y.e.j0.f.j */
/* loaded from: classes3.dex */
public final class C10134j {

    /* renamed from: a */
    private static final C10127c f39356a;

    /* renamed from: b */
    private static final C10127c f39357b;

    static {
        C10127c c10127c = new C10127c("java.lang");
        f39356a = c10127c;
        C10127c m35421c = c10127c.m35421c(C10130f.m35454x("annotation"));
        C9768m.m32345e(m35421c, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f39357b = m35421c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final C10126b m35483j(String str) {
        return new C10126b(C10133i.f39305a.m35463b(), C10130f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final C10126b m35484k(String str) {
        return new C10126b(C10133i.f39305a.m35466e(), C10130f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final C10126b m35485l(String str) {
        return new C10126b(C10133i.f39305a.m35464c(), C10130f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final C10126b m35486m(String str) {
        return new C10126b(C10133i.f39305a.m35465d(), C10130f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final <K, V> Map<V, K> m35487n(Map<K, ? extends V> map) {
        int m38793e;
        int m32419b;
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        m38793e = C10775p0.m38793e(C10786v.m38911u(entrySet, 10));
        m32419b = C9815l.m32419b(m38793e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair m38547a = C10740s.m38547a(entry.getValue(), entry.getKey());
            linkedHashMap.put(m38547a.m37648c(), m38547a.m37649d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final C10126b m35488o(C10130f c10130f) {
        C10133i c10133i = C10133i.f39305a;
        return new C10126b(c10133i.m35462a().m35413h(), C10130f.m35454x(c10130f.m35457u() + c10133i.m35462a().m35415j().m35457u()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final C10126b m35489p(String str) {
        return new C10126b(C10133i.f39305a.m35467f(), C10130f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final C10126b m35490q(String str) {
        return new C10126b(C10133i.f39305a.m35468g(), C10130f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final C10126b m35491r(C10126b c10126b) {
        return new C10126b(C10133i.f39305a.m35466e(), C10130f.m35454x('U' + c10126b.m35415j().m35457u()));
    }
}
