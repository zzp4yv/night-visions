package com.squareup.moshi;

import com.squareup.moshi.AbstractC8683f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* compiled from: MapJsonAdapter.java */
/* renamed from: com.squareup.moshi.q */
/* loaded from: classes2.dex */
final class C8694q<K, V> extends AbstractC8683f<Map<K, V>> {

    /* renamed from: a */
    public static final AbstractC8683f.e f33183a = new a();

    /* renamed from: b */
    private final AbstractC8683f<K> f33184b;

    /* renamed from: c */
    private final AbstractC8683f<V> f33185c;

    /* compiled from: MapJsonAdapter.java */
    /* renamed from: com.squareup.moshi.q$a */
    class a implements AbstractC8683f.e {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8683f.e
        /* renamed from: a */
        public AbstractC8683f<?> mo27684a(Type type, Set<? extends Annotation> set, C8695r c8695r) {
            Class<?> m27848g;
            if (!set.isEmpty() || (m27848g = C8698u.m27848g(type)) != Map.class) {
                return null;
            }
            Type[] m27850i = C8698u.m27850i(type, m27848g);
            return new C8694q(c8695r, m27850i[0], m27850i[1]).nullSafe();
        }
    }

    C8694q(C8695r c8695r, Type type, Type type2) {
        this.f33184b = c8695r.m27811d(type);
        this.f33185c = c8695r.m27811d(type2);
    }

    @Override // com.squareup.moshi.AbstractC8683f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(AbstractC8686i abstractC8686i) throws IOException {
        C8693p c8693p = new C8693p();
        abstractC8686i.mo27711b();
        while (abstractC8686i.mo27715f()) {
            abstractC8686i.mo27700B();
            K fromJson = this.f33184b.fromJson(abstractC8686i);
            V fromJson2 = this.f33185c.fromJson(abstractC8686i);
            V put = c8693p.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + abstractC8686i.m27716g() + ": " + put + " and " + fromJson2);
            }
        }
        abstractC8686i.mo27713d();
        return c8693p;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(AbstractC8692o abstractC8692o, Map<K, V> map) throws IOException {
        abstractC8692o.mo27757b();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + abstractC8692o.m27776g());
            }
            abstractC8692o.m27780y();
            this.f33184b.toJson(abstractC8692o, (AbstractC8692o) entry.getKey());
            this.f33185c.toJson(abstractC8692o, (AbstractC8692o) entry.getValue());
        }
        abstractC8692o.mo27759e();
    }

    public String toString() {
        return "JsonAdapter(" + this.f33184b + "=" + this.f33185c + ")";
    }
}
