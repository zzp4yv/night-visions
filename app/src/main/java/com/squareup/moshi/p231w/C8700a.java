package com.squareup.moshi.p231w;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.AbstractC8692o;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;

/* compiled from: NonNullJsonAdapter.java */
/* renamed from: com.squareup.moshi.w.a */
/* loaded from: classes2.dex */
public final class C8700a<T> extends AbstractC8683f<T> {

    /* renamed from: a */
    private final AbstractC8683f<T> f33223a;

    public C8700a(AbstractC8683f<T> abstractC8683f) {
        this.f33223a = abstractC8683f;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
        if (abstractC8686i.mo27699A() != AbstractC8686i.b.NULL) {
            return this.f33223a.fromJson(abstractC8686i);
        }
        throw new JsonDataException("Unexpected null at " + abstractC8686i.m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
        if (t != null) {
            this.f33223a.toJson(abstractC8692o, (AbstractC8692o) t);
            return;
        }
        throw new JsonDataException("Unexpected null at " + abstractC8692o.m27776g());
    }

    public String toString() {
        return this.f33223a + ".nonNull()";
    }
}
