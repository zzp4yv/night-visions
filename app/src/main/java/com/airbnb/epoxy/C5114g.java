package com.airbnb.epoxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ControllerHelperLookup.java */
/* renamed from: com.airbnb.epoxy.g */
/* loaded from: classes.dex */
class C5114g {

    /* renamed from: a */
    private static final Map<Class<?>, Constructor<?>> f12234a = new LinkedHashMap();

    /* renamed from: b */
    private static final NoOpControllerHelper f12235b = new NoOpControllerHelper();

    /* renamed from: a */
    private static Constructor<?> m9292a(Class<?> cls) {
        Constructor<?> m9292a;
        Map<Class<?>, Constructor<?>> map = f12234a;
        Constructor<?> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            m9292a = Class.forName(name + "_EpoxyHelper").getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            m9292a = m9292a(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for " + name, e2);
        }
        f12234a.put(cls, m9292a);
        return m9292a;
    }

    /* renamed from: b */
    static AbstractC5112f m9293b(AbstractC5128n abstractC5128n) {
        Constructor<?> m9292a = m9292a(abstractC5128n.getClass());
        if (m9292a == null) {
            return f12235b;
        }
        try {
            return (AbstractC5112f) m9292a.newInstance(abstractC5128n);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to invoke " + m9292a, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Unable to invoke " + m9292a, e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to get Epoxy helper class.", cause);
        }
    }
}
