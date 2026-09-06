package com.bumptech.glide.load.p129n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: ModelLoaderRegistry.java */
/* renamed from: com.bumptech.glide.load.n.p */
/* loaded from: classes.dex */
public class C5431p {

    /* renamed from: a */
    private final C5433r f13657a;

    /* renamed from: b */
    private final a f13658b;

    /* compiled from: ModelLoaderRegistry.java */
    /* renamed from: com.bumptech.glide.load.n.p$a */
    private static class a {

        /* renamed from: a */
        private final Map<Class<?>, C11409a<?>> f13659a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.n.p$a$a, reason: collision with other inner class name */
        private static class C11409a<Model> {

            /* renamed from: a */
            final List<InterfaceC5429n<Model, ?>> f13660a;

            public C11409a(List<InterfaceC5429n<Model, ?>> list) {
                this.f13660a = list;
            }
        }

        a() {
        }

        /* renamed from: a */
        public void m10563a() {
            this.f13659a.clear();
        }

        /* renamed from: b */
        public <Model> List<InterfaceC5429n<Model, ?>> m10564b(Class<Model> cls) {
            C11409a<?> c11409a = this.f13659a.get(cls);
            if (c11409a == null) {
                return null;
            }
            return (List<InterfaceC5429n<Model, ?>>) c11409a.f13660a;
        }

        /* renamed from: c */
        public <Model> void m10565c(Class<Model> cls, List<InterfaceC5429n<Model, ?>> list) {
            if (this.f13659a.put(cls, new C11409a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C5431p(InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this(new C5433r(interfaceC0956f));
    }

    /* renamed from: b */
    private static <A> Class<A> m10558b(A a2) {
        return (Class<A>) a2.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<InterfaceC5429n<A, ?>> m10559e(Class<A> cls) {
        List<InterfaceC5429n<A, ?>> m10564b;
        m10564b = this.f13658b.m10564b(cls);
        if (m10564b == null) {
            m10564b = Collections.unmodifiableList(this.f13657a.m10572e(cls));
            this.f13658b.m10565c(cls, m10564b);
        }
        return m10564b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m10560a(Class<Model> cls, Class<Data> cls2, InterfaceC5430o<? extends Model, ? extends Data> interfaceC5430o) {
        this.f13657a.m10570b(cls, cls2, interfaceC5430o);
        this.f13658b.m10563a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> m10561c(Class<?> cls) {
        return this.f13657a.m10573g(cls);
    }

    /* renamed from: d */
    public <A> List<InterfaceC5429n<A, ?>> m10562d(A a2) {
        List<InterfaceC5429n<A, ?>> m10559e = m10559e(m10558b(a2));
        int size = m10559e.size();
        List<InterfaceC5429n<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC5429n<A, ?> interfaceC5429n = m10559e.get(i2);
            if (interfaceC5429n.mo10508a(a2)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i2);
                    z = false;
                }
                emptyList.add(interfaceC5429n);
            }
        }
        return emptyList;
    }

    private C5431p(C5433r c5433r) {
        this.f13658b = new a();
        this.f13657a = c5433r;
    }
}
