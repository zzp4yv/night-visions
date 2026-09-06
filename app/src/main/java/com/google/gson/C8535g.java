package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* renamed from: com.google.gson.g */
/* loaded from: classes2.dex */
public final class C8535g extends AbstractC8538j implements Iterable<AbstractC8538j> {

    /* renamed from: f */
    private final List<AbstractC8538j> f32448f = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8535g) && ((C8535g) obj).f32448f.equals(this.f32448f));
    }

    public int hashCode() {
        return this.f32448f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC8538j> iterator() {
        return this.f32448f.iterator();
    }

    /* renamed from: q */
    public void m26952q(AbstractC8538j abstractC8538j) {
        if (abstractC8538j == null) {
            abstractC8538j = C8539k.f32449a;
        }
        this.f32448f.add(abstractC8538j);
    }
}
