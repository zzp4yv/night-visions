package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8546r;
import com.google.gson.p215t.C8556b;
import com.google.gson.p215t.C8557c;
import com.google.gson.p215t.InterfaceC8563i;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.b */
/* loaded from: classes2.dex */
public final class C8569b implements InterfaceC8546r {

    /* renamed from: f */
    private final C8557c f32580f;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.b$a */
    private static final class a<E> extends AbstractC8545q<Collection<E>> {

        /* renamed from: a */
        private final AbstractC8545q<E> f32581a;

        /* renamed from: b */
        private final InterfaceC8563i<? extends Collection<E>> f32582b;

        public a(C8533e c8533e, Type type, AbstractC8545q<E> abstractC8545q, InterfaceC8563i<? extends Collection<E>> interfaceC8563i) {
            this.f32581a = new C8580m(c8533e, abstractC8545q, type);
            this.f32582b = interfaceC8563i;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            Collection<E> mo27071a = this.f32582b.mo27071a();
            c8552a.mo27002a();
            while (c8552a.mo27009l()) {
                mo27071a.add(this.f32581a.mo26938b(c8552a));
            }
            c8552a.mo27006f();
            return mo27071a;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Collection<E> collection) throws IOException {
            if (collection == null) {
                c8554c.mo27043y();
                return;
            }
            c8554c.mo27035c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f32581a.mo26939d(c8554c, it.next());
            }
            c8554c.mo27037f();
        }
    }

    public C8569b(C8557c c8557c) {
        this.f32580f = c8557c;
    }

    @Override // com.google.gson.InterfaceC8546r
    /* renamed from: b */
    public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
        Type type = c8586a.getType();
        Class<? super T> rawType = c8586a.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type m27053h = C8556b.m27053h(type, rawType);
        return new a(c8533e, m27053h, c8533e.m26926j(C8586a.get(m27053h)), this.f32580f.m27070a(c8586a));
    }
}
