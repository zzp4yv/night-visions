package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l3 */
/* loaded from: classes2.dex */
final class C7510l3 {

    /* renamed from: a */
    private static final C7510l3 f27826a = new C7510l3();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, InterfaceC7534p3<?>> f27828c = new ConcurrentHashMap();

    /* renamed from: b */
    private final InterfaceC7552s3 f27827b = new C7569v2();

    private C7510l3() {
    }

    /* renamed from: a */
    public static C7510l3 m21234a() {
        return f27826a;
    }

    /* renamed from: b */
    public final <T> InterfaceC7534p3<T> m21235b(Class<T> cls) {
        zzff.m22291f(cls, "messageType");
        InterfaceC7534p3<T> interfaceC7534p3 = (InterfaceC7534p3) this.f27828c.get(cls);
        if (interfaceC7534p3 != null) {
            return interfaceC7534p3;
        }
        InterfaceC7534p3<T> mo21403a = this.f27827b.mo21403a(cls);
        zzff.m22291f(cls, "messageType");
        zzff.m22291f(mo21403a, "schema");
        InterfaceC7534p3<T> interfaceC7534p32 = (InterfaceC7534p3) this.f27828c.putIfAbsent(cls, mo21403a);
        return interfaceC7534p32 != null ? interfaceC7534p32 : mo21403a;
    }

    /* renamed from: c */
    public final <T> InterfaceC7534p3<T> m21236c(T t) {
        return m21235b(t.getClass());
    }
}
