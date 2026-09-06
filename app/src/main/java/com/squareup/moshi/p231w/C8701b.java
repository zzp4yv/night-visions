package com.squareup.moshi.p231w;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.AbstractC8692o;
import java.io.IOException;

/* compiled from: NullSafeJsonAdapter.java */
/* renamed from: com.squareup.moshi.w.b */
/* loaded from: classes2.dex */
public final class C8701b<T> extends AbstractC8683f<T> {

    /* renamed from: a */
    private final AbstractC8683f<T> f33224a;

    public C8701b(AbstractC8683f<T> abstractC8683f) {
        this.f33224a = abstractC8683f;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
        return abstractC8686i.mo27699A() == AbstractC8686i.b.NULL ? (T) abstractC8686i.mo27722x() : this.f33224a.fromJson(abstractC8686i);
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
        if (t == null) {
            abstractC8692o.mo27761m();
        } else {
            this.f33224a.toJson(abstractC8692o, (AbstractC8692o) t);
        }
    }

    public String toString() {
        return this.f33224a + ".nullSafe()";
    }
}
