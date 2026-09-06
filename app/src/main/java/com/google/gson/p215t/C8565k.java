package com.google.gson.p215t;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Primitives.java */
/* renamed from: com.google.gson.t.k */
/* loaded from: classes2.dex */
public final class C8565k {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f32567a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f32568b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m27108a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m27108a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m27108a(hashMap, hashMap2, Character.TYPE, Character.class);
        m27108a(hashMap, hashMap2, Double.TYPE, Double.class);
        m27108a(hashMap, hashMap2, Float.TYPE, Float.class);
        m27108a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m27108a(hashMap, hashMap2, Long.TYPE, Long.class);
        m27108a(hashMap, hashMap2, Short.TYPE, Short.class);
        m27108a(hashMap, hashMap2, Void.TYPE, Void.class);
        f32567a = Collections.unmodifiableMap(hashMap);
        f32568b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m27108a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static boolean m27109b(Type type) {
        return f32567a.containsKey(type);
    }
}
