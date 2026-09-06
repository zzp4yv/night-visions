package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.C10742u;
import kotlin.Pair;
import kotlin.collections.C10770n;
import kotlin.collections.C10775p0;
import kotlin.collections.C10786v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10075x;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10207e;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.m */
/* loaded from: classes3.dex */
final class C10030m {

    /* renamed from: a */
    private final Map<String, C10028k> f38278a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.m$a */
    public final class a {

        /* renamed from: a */
        private final String f38279a;

        /* renamed from: b */
        final /* synthetic */ C10030m f38280b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.o0.m$a$a, reason: collision with other inner class name */
        public final class C11498a {

            /* renamed from: a */
            private final String f38281a;

            /* renamed from: b */
            private final List<Pair<String, C10034q>> f38282b;

            /* renamed from: c */
            private Pair<String, C10034q> f38283c;

            /* renamed from: d */
            final /* synthetic */ a f38284d;

            public C11498a(a aVar, String str) {
                C9768m.m32346f(str, "functionName");
                this.f38284d = aVar;
                this.f38281a = str;
                this.f38282b = new ArrayList();
                this.f38283c = C10740s.m38547a("V", null);
            }

            /* renamed from: a */
            public final Pair<String, C10028k> m33757a() {
                C10075x c10075x = C10075x.f38488a;
                String m33756b = this.f38284d.m33756b();
                String str = this.f38281a;
                List<Pair<String, C10034q>> list = this.f38282b;
                ArrayList arrayList = new ArrayList(C10786v.m38911u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).m37648c());
                }
                String m34055k = c10075x.m34055k(m33756b, c10075x.m34054j(str, arrayList, this.f38283c.m37648c()));
                C10034q m37649d = this.f38283c.m37649d();
                List<Pair<String, C10034q>> list2 = this.f38282b;
                ArrayList arrayList2 = new ArrayList(C10786v.m38911u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C10034q) ((Pair) it2.next()).m37649d());
                }
                return C10740s.m38547a(m34055k, new C10028k(m37649d, arrayList2));
            }

            /* renamed from: b */
            public final void m33758b(String str, C10022e... c10022eArr) {
                Iterable<IndexedValue> m38759m0;
                int m38793e;
                int m32419b;
                C10034q c10034q;
                C9768m.m32346f(str, "type");
                C9768m.m32346f(c10022eArr, "qualifiers");
                List<Pair<String, C10034q>> list = this.f38282b;
                if (c10022eArr.length == 0) {
                    c10034q = null;
                } else {
                    m38759m0 = C10770n.m38759m0(c10022eArr);
                    m38793e = C10775p0.m38793e(C10786v.m38911u(m38759m0, 10));
                    m32419b = C9815l.m32419b(m38793e, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
                    for (IndexedValue indexedValue : m38759m0) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.m38649c()), (C10022e) indexedValue.m38650d());
                    }
                    c10034q = new C10034q(linkedHashMap);
                }
                list.add(C10740s.m38547a(str, c10034q));
            }

            /* renamed from: c */
            public final void m33759c(String str, C10022e... c10022eArr) {
                Iterable<IndexedValue> m38759m0;
                int m38793e;
                int m32419b;
                C9768m.m32346f(str, "type");
                C9768m.m32346f(c10022eArr, "qualifiers");
                m38759m0 = C10770n.m38759m0(c10022eArr);
                m38793e = C10775p0.m38793e(C10786v.m38911u(m38759m0, 10));
                m32419b = C9815l.m32419b(m38793e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
                for (IndexedValue indexedValue : m38759m0) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.m38649c()), (C10022e) indexedValue.m38650d());
                }
                this.f38283c = C10740s.m38547a(str, new C10034q(linkedHashMap));
            }

            /* renamed from: d */
            public final void m33760d(EnumC10207e enumC10207e) {
                C9768m.m32346f(enumC10207e, "type");
                String m36116u = enumC10207e.m36116u();
                C9768m.m32345e(m36116u, "type.desc");
                this.f38283c = C10740s.m38547a(m36116u, null);
            }
        }

        public a(C10030m c10030m, String str) {
            C9768m.m32346f(str, "className");
            this.f38280b = c10030m;
            this.f38279a = str;
        }

        /* renamed from: a */
        public final void m33755a(String str, Function1<? super C11498a, C10742u> function1) {
            C9768m.m32346f(str, "name");
            C9768m.m32346f(function1, "block");
            Map map = this.f38280b.f38278a;
            C11498a c11498a = new C11498a(this, str);
            function1.invoke(c11498a);
            Pair<String, C10028k> m33757a = c11498a.m33757a();
            map.put(m33757a.m37648c(), m33757a.m37649d());
        }

        /* renamed from: b */
        public final String m33756b() {
            return this.f38279a;
        }
    }

    /* renamed from: b */
    public final Map<String, C10028k> m33754b() {
        return this.f38278a;
    }
}
