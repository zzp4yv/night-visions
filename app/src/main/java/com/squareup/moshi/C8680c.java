package com.squareup.moshi;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.p231w.C8702c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: ClassJsonAdapter.java */
/* renamed from: com.squareup.moshi.c */
/* loaded from: classes2.dex */
final class C8680c<T> extends AbstractC8683f<T> {

    /* renamed from: a */
    public static final AbstractC8683f.e f33084a = new a();

    /* renamed from: b */
    private final AbstractC8679b<T> f33085b;

    /* renamed from: c */
    private final b<?>[] f33086c;

    /* renamed from: d */
    private final AbstractC8686i.a f33087d;

    /* compiled from: ClassJsonAdapter.java */
    /* renamed from: com.squareup.moshi.c$a */
    class a implements AbstractC8683f.e {
        a() {
        }

        /* renamed from: b */
        private void m27687b(C8695r c8695r, Type type, Map<String, b<?>> map) {
            InterfaceC8682e interfaceC8682e;
            Class<?> m27848g = C8698u.m27848g(type);
            boolean m27863i = C8702c.m27863i(m27848g);
            for (Field field : m27848g.getDeclaredFields()) {
                if (m27688c(m27863i, field.getModifiers()) && ((interfaceC8682e = (InterfaceC8682e) field.getAnnotation(InterfaceC8682e.class)) == null || !interfaceC8682e.ignore())) {
                    Type m27870p = C8702c.m27870p(type, m27848g, field.getGenericType());
                    Set<? extends Annotation> m27864j = C8702c.m27864j(field);
                    String name = field.getName();
                    AbstractC8683f<T> m27813f = c8695r.m27813f(m27870p, m27864j, name);
                    field.setAccessible(true);
                    String m27866l = C8702c.m27866l(name, interfaceC8682e);
                    b<?> bVar = new b<>(m27866l, field, m27813f);
                    b<?> put = map.put(m27866l, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f33089b + "\n    " + bVar.f33089b);
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m27688c(boolean z, int i2) {
            if (Modifier.isStatic(i2) || Modifier.isTransient(i2)) {
                return false;
            }
            return Modifier.isPublic(i2) || Modifier.isProtected(i2) || !z;
        }

        /* renamed from: d */
        private void m27689d(Type type, Class<?> cls) {
            Class<?> m27848g = C8698u.m27848g(type);
            if (cls.isAssignableFrom(m27848g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + m27848g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.AbstractC8683f.e
        /* renamed from: a */
        public AbstractC8683f<?> mo27684a(Type type, Set<? extends Annotation> set, C8695r c8695r) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> m27848g = C8698u.m27848g(type);
            if (m27848g.isInterface() || m27848g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C8702c.m27863i(m27848g)) {
                m27689d(type, List.class);
                m27689d(type, Set.class);
                m27689d(type, Map.class);
                m27689d(type, Collection.class);
                String str = "Platform " + m27848g;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (m27848g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + m27848g.getName());
            }
            if (m27848g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + m27848g.getName());
            }
            if (m27848g.getEnclosingClass() != null && !Modifier.isStatic(m27848g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + m27848g.getName());
            }
            if (Modifier.isAbstract(m27848g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + m27848g.getName());
            }
            if (C8702c.m27862h(m27848g)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + m27848g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            AbstractC8679b m27685a = AbstractC8679b.m27685a(m27848g);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                m27687b(c8695r, type, treeMap);
                type = C8698u.m27847f(type);
            }
            return new C8680c(m27685a, treeMap).nullSafe();
        }
    }

    /* compiled from: ClassJsonAdapter.java */
    /* renamed from: com.squareup.moshi.c$b */
    static class b<T> {

        /* renamed from: a */
        final String f33088a;

        /* renamed from: b */
        final Field f33089b;

        /* renamed from: c */
        final AbstractC8683f<T> f33090c;

        b(String str, Field field, AbstractC8683f<T> abstractC8683f) {
            this.f33088a = str;
            this.f33089b = field;
            this.f33090c = abstractC8683f;
        }

        /* renamed from: a */
        void m27690a(AbstractC8686i abstractC8686i, Object obj) throws IOException, IllegalAccessException {
            this.f33089b.set(obj, this.f33090c.fromJson(abstractC8686i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        void m27691b(AbstractC8692o abstractC8692o, Object obj) throws IllegalAccessException, IOException {
            this.f33090c.toJson(abstractC8692o, (AbstractC8692o) this.f33089b.get(obj));
        }
    }

    C8680c(AbstractC8679b<T> abstractC8679b, Map<String, b<?>> map) {
        this.f33085b = abstractC8679b;
        this.f33086c = (b[]) map.values().toArray(new b[map.size()]);
        this.f33087d = AbstractC8686i.a.m27724a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
        try {
            T mo27686b = this.f33085b.mo27686b();
            try {
                abstractC8686i.mo27711b();
                while (abstractC8686i.mo27715f()) {
                    int mo27702H = abstractC8686i.mo27702H(this.f33087d);
                    if (mo27702H == -1) {
                        abstractC8686i.mo27706N();
                        abstractC8686i.mo27707Q();
                    } else {
                        this.f33086c[mo27702H].m27690a(abstractC8686i, mo27686b);
                    }
                }
                abstractC8686i.mo27713d();
                return mo27686b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw C8702c.m27873s(e3);
        }
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
        try {
            abstractC8692o.mo27757b();
            for (b<?> bVar : this.f33086c) {
                abstractC8692o.mo27760l(bVar.f33088a);
                bVar.m27691b(abstractC8692o, t);
            }
            abstractC8692o.mo27759e();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f33085b + ")";
    }
}
