package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: BuiltinSpecialProperties.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.g */
/* loaded from: classes2.dex */
public final class C9923g {

    /* renamed from: a */
    public static final C9923g f37857a = new C9923g();

    /* renamed from: b */
    private static final Map<C10127c, C10130f> f37858b;

    /* renamed from: c */
    private static final Map<C10130f, List<C10130f>> f37859c;

    /* renamed from: d */
    private static final Set<C10127c> f37860d;

    /* renamed from: e */
    private static final Set<C10130f> f37861e;

    static {
        C10127c m33114d;
        C10127c m33114d2;
        C10127c m33113c;
        C10127c m33113c2;
        C10127c m33114d3;
        C10127c m33113c3;
        C10127c m33113c4;
        C10127c m33113c5;
        Map<C10127c, C10130f> m38800l;
        int m38793e;
        Set<C10130f> m38574I0;
        List m38579L;
        C10128d c10128d = C9884k.a.f37596s;
        m33114d = C9925h.m33114d(c10128d, "name");
        m33114d2 = C9925h.m33114d(c10128d, "ordinal");
        m33113c = C9925h.m33113c(C9884k.a.f37554U, "size");
        C10127c c10127c = C9884k.a.f37558Y;
        m33113c2 = C9925h.m33113c(c10127c, "size");
        m33114d3 = C9925h.m33114d(C9884k.a.f37572g, "length");
        m33113c3 = C9925h.m33113c(c10127c, "keys");
        m33113c4 = C9925h.m33113c(c10127c, "values");
        m33113c5 = C9925h.m33113c(c10127c, "entries");
        m38800l = C10777q0.m38800l(C10740s.m38547a(m33114d, C10130f.m35454x("name")), C10740s.m38547a(m33114d2, C10130f.m35454x("ordinal")), C10740s.m38547a(m33113c, C10130f.m35454x("size")), C10740s.m38547a(m33113c2, C10130f.m35454x("size")), C10740s.m38547a(m33114d3, C10130f.m35454x("length")), C10740s.m38547a(m33113c3, C10130f.m35454x("keySet")), C10740s.m38547a(m33113c4, C10130f.m35454x("values")), C10740s.m38547a(m33113c5, C10130f.m35454x("entrySet")));
        f37858b = m38800l;
        Set<Map.Entry<C10127c, C10130f>> entrySet = m38800l.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(C10786v.m38911u(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((C10127c) entry.getKey()).m35425g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            C10130f c10130f = (C10130f) pair.m37649d();
            Object obj = linkedHashMap.get(c10130f);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c10130f, obj);
            }
            ((List) obj).add((C10130f) pair.m37648c());
        }
        m38793e = C10775p0.m38793e(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m38793e);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            m38579L = C10749c0.m38579L((Iterable) entry2.getValue());
            linkedHashMap2.put(key, m38579L);
        }
        f37859c = linkedHashMap2;
        Set<C10127c> keySet = f37858b.keySet();
        f37860d = keySet;
        ArrayList arrayList2 = new ArrayList(C10786v.m38911u(keySet, 10));
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C10127c) it2.next()).m35425g());
        }
        m38574I0 = C10749c0.m38574I0(arrayList2);
        f37861e = m38574I0;
    }

    private C9923g() {
    }

    /* renamed from: a */
    public final Map<C10127c, C10130f> m33096a() {
        return f37858b;
    }

    /* renamed from: b */
    public final List<C10130f> m33097b(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name1");
        List<C10130f> list = f37859c.get(c10130f);
        return list == null ? C10784u.m38888j() : list;
    }

    /* renamed from: c */
    public final Set<C10127c> m33098c() {
        return f37860d;
    }

    /* renamed from: d */
    public final Set<C10130f> m33099d() {
        return f37861e;
    }
}
