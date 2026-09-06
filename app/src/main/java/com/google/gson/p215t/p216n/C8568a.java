package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8546r;
import com.google.gson.p215t.C8556b;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* renamed from: com.google.gson.t.n.a */
/* loaded from: classes2.dex */
public final class C8568a<E> extends AbstractC8545q<Object> {

    /* renamed from: a */
    public static final InterfaceC8546r f32577a = new a();

    /* renamed from: b */
    private final Class<E> f32578b;

    /* renamed from: c */
    private final AbstractC8545q<E> f32579c;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.a$a */
    static class a implements InterfaceC8546r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            Type type = c8586a.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type m27052g = C8556b.m27052g(type);
            return new C8568a(c8533e, c8533e.m26926j(C8586a.get(m27052g)), C8556b.m27056k(m27052g));
        }
    }

    public C8568a(C8533e c8533e, AbstractC8545q<E> abstractC8545q, Class<E> cls) {
        this.f32579c = new C8580m(c8533e, abstractC8545q, cls);
        this.f32578b = cls;
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: b */
    public Object mo26938b(C8552a c8552a) throws IOException {
        if (c8552a.mo27001Q() == EnumC8553b.NULL) {
            c8552a.mo26999I();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c8552a.mo27002a();
        while (c8552a.mo27009l()) {
            arrayList.add(this.f32579c.mo26938b(c8552a));
        }
        c8552a.mo27006f();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f32578b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: d */
    public void mo26939d(C8554c c8554c, Object obj) throws IOException {
        if (obj == null) {
            c8554c.mo27043y();
            return;
        }
        c8554c.mo27035c();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f32579c.mo26939d(c8554c, Array.get(obj, i2));
        }
        c8554c.mo27037f();
    }
}
