package com.google.gson.p215t;

import com.google.gson.InterfaceC8534f;
import com.google.gson.JsonIOException;
import com.google.gson.p215t.p218o.AbstractC8584b;
import com.google.gson.p219u.C8586a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* renamed from: com.google.gson.t.c */
/* loaded from: classes2.dex */
public final class C8557c {

    /* renamed from: a */
    private final Map<Type, InterfaceC8534f<?>> f32502a;

    /* renamed from: b */
    private final AbstractC8584b f32503b = AbstractC8584b.m27218a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$a */
    class a<T> implements InterfaceC8563i<T> {
        a() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$b */
    class b<T> implements InterfaceC8563i<T> {
        b() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$c */
    class c<T> implements InterfaceC8563i<T> {
        c() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$d */
    class d<T> implements InterfaceC8563i<T> {
        d() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new C8562h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$e */
    class e<T> implements InterfaceC8563i<T> {

        /* renamed from: a */
        private final AbstractC8567m f32508a = AbstractC8567m.m27114b();

        /* renamed from: b */
        final /* synthetic */ Class f32509b;

        /* renamed from: c */
        final /* synthetic */ Type f32510c;

        e(Class cls, Type type) {
            this.f32509b = cls;
            this.f32510c = type;
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            try {
                return (T) this.f32508a.mo27115c(this.f32509b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f32510c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$f */
    class f<T> implements InterfaceC8563i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8534f f32512a;

        /* renamed from: b */
        final /* synthetic */ Type f32513b;

        f(InterfaceC8534f interfaceC8534f, Type type) {
            this.f32512a = interfaceC8534f;
            this.f32513b = type;
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) this.f32512a.m26951a(this.f32513b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$g */
    class g<T> implements InterfaceC8563i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8534f f32515a;

        /* renamed from: b */
        final /* synthetic */ Type f32516b;

        g(InterfaceC8534f interfaceC8534f, Type type) {
            this.f32515a = interfaceC8534f;
            this.f32516b = type;
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) this.f32515a.m26951a(this.f32516b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$h */
    class h<T> implements InterfaceC8563i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f32518a;

        h(Constructor constructor) {
            this.f32518a = constructor;
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            try {
                return (T) this.f32518a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.f32518a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.f32518a + " with no args", e4.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$i */
    class i<T> implements InterfaceC8563i<T> {
        i() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$j */
    class j<T> implements InterfaceC8563i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f32521a;

        j(Type type) {
            this.f32521a = type;
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            Type type = this.f32521a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f32521a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f32521a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$k */
    class k<T> implements InterfaceC8563i<T> {
        k() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$l */
    class l<T> implements InterfaceC8563i<T> {
        l() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$m */
    class m<T> implements InterfaceC8563i<T> {
        m() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.t.c$n */
    class n<T> implements InterfaceC8563i<T> {
        n() {
        }

        @Override // com.google.gson.p215t.InterfaceC8563i
        /* renamed from: a */
        public T mo27071a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public C8557c(Map<Type, InterfaceC8534f<?>> map) {
        this.f32502a = map;
    }

    /* renamed from: b */
    private <T> InterfaceC8563i<T> m27067b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f32503b.mo27217b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> InterfaceC8563i<T> m27068c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C8586a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new d() : new c();
        }
        return null;
    }

    /* renamed from: d */
    private <T> InterfaceC8563i<T> m27069d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    /* renamed from: a */
    public <T> InterfaceC8563i<T> m27070a(C8586a<T> c8586a) {
        Type type = c8586a.getType();
        Class<? super T> rawType = c8586a.getRawType();
        InterfaceC8534f<?> interfaceC8534f = this.f32502a.get(type);
        if (interfaceC8534f != null) {
            return new f(interfaceC8534f, type);
        }
        InterfaceC8534f<?> interfaceC8534f2 = this.f32502a.get(rawType);
        if (interfaceC8534f2 != null) {
            return new g(interfaceC8534f2, type);
        }
        InterfaceC8563i<T> m27067b = m27067b(rawType);
        if (m27067b != null) {
            return m27067b;
        }
        InterfaceC8563i<T> m27068c = m27068c(type, rawType);
        return m27068c != null ? m27068c : m27069d(type, rawType);
    }

    public String toString() {
        return this.f32502a.toString();
    }
}
