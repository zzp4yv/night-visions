package com.google.gson;

import com.google.gson.p215t.C8562h;
import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* renamed from: com.google.gson.l */
/* loaded from: classes2.dex */
public final class C8540l extends AbstractC8538j {

    /* renamed from: a */
    private final C8562h<String, AbstractC8538j> f32450a = new C8562h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8540l) && ((C8540l) obj).f32450a.equals(this.f32450a));
    }

    public int hashCode() {
        return this.f32450a.hashCode();
    }

    /* renamed from: q */
    public void m26961q(String str, AbstractC8538j abstractC8538j) {
        if (abstractC8538j == null) {
            abstractC8538j = C8539k.f32449a;
        }
        this.f32450a.put(str, abstractC8538j);
    }

    /* renamed from: r */
    public Set<Map.Entry<String, AbstractC8538j>> m26962r() {
        return this.f32450a.entrySet();
    }
}
