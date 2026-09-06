package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.gw */
/* loaded from: classes2.dex */
final class C6692gw {

    /* renamed from: a */
    private static final C6692gw f18995a = new C6692gw();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, InterfaceC6877lw<?>> f18997c = new ConcurrentHashMap();

    /* renamed from: b */
    private final InterfaceC6914mw f18996b = new C7024pv();

    private C6692gw() {
    }

    /* renamed from: b */
    public static C6692gw m15176b() {
        return f18995a;
    }

    /* renamed from: a */
    public final <T> InterfaceC6877lw<T> m15177a(T t) {
        return m15178c(t.getClass());
    }

    /* renamed from: c */
    public final <T> InterfaceC6877lw<T> m15178c(Class<T> cls) {
        zzdod.m19743d(cls, "messageType");
        InterfaceC6877lw<T> interfaceC6877lw = (InterfaceC6877lw) this.f18997c.get(cls);
        if (interfaceC6877lw != null) {
            return interfaceC6877lw;
        }
        InterfaceC6877lw<T> mo15574a = this.f18996b.mo15574a(cls);
        zzdod.m19743d(cls, "messageType");
        zzdod.m19743d(mo15574a, "schema");
        InterfaceC6877lw<T> interfaceC6877lw2 = (InterfaceC6877lw) this.f18997c.putIfAbsent(cls, mo15574a);
        return interfaceC6877lw2 != null ? interfaceC6877lw2 : mo15574a;
    }
}
