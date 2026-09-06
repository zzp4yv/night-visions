package com.squareup.moshi;

import com.squareup.moshi.AbstractC8683f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: ArrayJsonAdapter.java */
/* renamed from: com.squareup.moshi.a */
/* loaded from: classes2.dex */
final class C8678a extends AbstractC8683f<Object> {

    /* renamed from: a */
    public static final AbstractC8683f.e f33071a = new a();

    /* renamed from: b */
    private final Class<?> f33072b;

    /* renamed from: c */
    private final AbstractC8683f<Object> f33073c;

    /* compiled from: ArrayJsonAdapter.java */
    /* renamed from: com.squareup.moshi.a$a */
    class a implements AbstractC8683f.e {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8683f.e
        /* renamed from: a */
        public AbstractC8683f<?> mo27684a(Type type, Set<? extends Annotation> set, C8695r c8695r) {
            Type m27842a = C8698u.m27842a(type);
            if (m27842a != null && set.isEmpty()) {
                return new C8678a(C8698u.m27848g(m27842a), c8695r.m27811d(m27842a)).nullSafe();
            }
            return null;
        }
    }

    C8678a(Class<?> cls, AbstractC8683f<Object> abstractC8683f) {
        this.f33072b = cls;
        this.f33073c = abstractC8683f;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public Object fromJson(AbstractC8686i abstractC8686i) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC8686i.mo27710a();
        while (abstractC8686i.mo27715f()) {
            arrayList.add(this.f33073c.fromJson(abstractC8686i));
        }
        abstractC8686i.mo27712c();
        Object newInstance = Array.newInstance(this.f33072b, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public void toJson(AbstractC8692o abstractC8692o, Object obj) throws IOException {
        abstractC8692o.mo27756a();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f33073c.toJson(abstractC8692o, (AbstractC8692o) Array.get(obj, i2));
        }
        abstractC8692o.mo27758d();
    }

    public String toString() {
        return this.f33073c + ".array()";
    }
}
