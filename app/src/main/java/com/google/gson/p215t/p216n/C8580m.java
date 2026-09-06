package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.p215t.p216n.C8576i;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* renamed from: com.google.gson.t.n.m */
/* loaded from: classes2.dex */
final class C8580m<T> extends AbstractC8545q<T> {

    /* renamed from: a */
    private final C8533e f32635a;

    /* renamed from: b */
    private final AbstractC8545q<T> f32636b;

    /* renamed from: c */
    private final Type f32637c;

    C8580m(C8533e c8533e, AbstractC8545q<T> abstractC8545q, Type type) {
        this.f32635a = c8533e;
        this.f32636b = abstractC8545q;
        this.f32637c = type;
    }

    /* renamed from: e */
    private Type m27148e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: b */
    public T mo26938b(C8552a c8552a) throws IOException {
        return this.f32636b.mo26938b(c8552a);
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: d */
    public void mo26939d(C8554c c8554c, T t) throws IOException {
        AbstractC8545q<T> abstractC8545q = this.f32636b;
        Type m27148e = m27148e(this.f32637c, t);
        if (m27148e != this.f32637c) {
            abstractC8545q = this.f32635a.m26926j(C8586a.get(m27148e));
            if (abstractC8545q instanceof C8576i.b) {
                AbstractC8545q<T> abstractC8545q2 = this.f32636b;
                if (!(abstractC8545q2 instanceof C8576i.b)) {
                    abstractC8545q = abstractC8545q2;
                }
            }
        }
        abstractC8545q.mo26939d(c8554c, t);
    }
}
