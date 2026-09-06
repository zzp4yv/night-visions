package com.google.gson.p215t;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* renamed from: com.google.gson.t.m */
/* loaded from: classes2.dex */
public abstract class AbstractC8567m {

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.t.m$a */
    static class a extends AbstractC8567m {

        /* renamed from: a */
        final /* synthetic */ Method f32572a;

        /* renamed from: b */
        final /* synthetic */ Object f32573b;

        a(Method method, Object obj) {
            this.f32572a = method;
            this.f32573b = obj;
        }

        @Override // com.google.gson.p215t.AbstractC8567m
        /* renamed from: c */
        public <T> T mo27115c(Class<T> cls) throws Exception {
            AbstractC8567m.m27113a(cls);
            return (T) this.f32572a.invoke(this.f32573b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.t.m$b */
    static class b extends AbstractC8567m {

        /* renamed from: a */
        final /* synthetic */ Method f32574a;

        /* renamed from: b */
        final /* synthetic */ int f32575b;

        b(Method method, int i2) {
            this.f32574a = method;
            this.f32575b = i2;
        }

        @Override // com.google.gson.p215t.AbstractC8567m
        /* renamed from: c */
        public <T> T mo27115c(Class<T> cls) throws Exception {
            AbstractC8567m.m27113a(cls);
            return (T) this.f32574a.invoke(null, cls, Integer.valueOf(this.f32575b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.t.m$c */
    static class c extends AbstractC8567m {

        /* renamed from: a */
        final /* synthetic */ Method f32576a;

        c(Method method) {
            this.f32576a = method;
        }

        @Override // com.google.gson.p215t.AbstractC8567m
        /* renamed from: c */
        public <T> T mo27115c(Class<T> cls) throws Exception {
            AbstractC8567m.m27113a(cls);
            return (T) this.f32576a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.t.m$d */
    static class d extends AbstractC8567m {
        d() {
        }

        @Override // com.google.gson.p215t.AbstractC8567m
        /* renamed from: c */
        public <T> T mo27115c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m27113a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static AbstractC8567m m27114b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo27115c(Class<T> cls) throws Exception;
}
