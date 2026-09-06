package com.facebook.p157o0.p163o0;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
/* renamed from: com.facebook.o0.o0.l */
/* loaded from: classes2.dex */
public final class C5856l {

    /* renamed from: b */
    private static C5856l f15326b;

    /* renamed from: d */
    private final Class<?> f15328d;

    /* renamed from: e */
    private final Class<?> f15329e;

    /* renamed from: f */
    private final Method f15330f;

    /* renamed from: g */
    private final Method f15331g;

    /* renamed from: h */
    private final Method f15332h;

    /* renamed from: i */
    private final Method f15333i;

    /* renamed from: a */
    public static final a f15325a = new a(null);

    /* renamed from: c */
    private static final AtomicBoolean f15327c = new AtomicBoolean(false);

    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    /* renamed from: com.facebook.o0.o0.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        private final void m12572a() {
            C5857m c5857m = C5857m.f15334a;
            Class<?> m12574a = C5857m.m12574a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> m12574a2 = C5857m.m12574a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (m12574a == null || m12574a2 == null) {
                return;
            }
            Method m12577d = C5857m.m12577d(m12574a, "newBuilder", new Class[0]);
            Method m12577d2 = C5857m.m12577d(m12574a2, "setType", String.class);
            Method m12577d3 = C5857m.m12577d(m12574a2, "setSkusList", List.class);
            Method m12577d4 = C5857m.m12577d(m12574a2, "build", new Class[0]);
            if (m12577d == null || m12577d2 == null || m12577d3 == null || m12577d4 == null) {
                return;
            }
            C5856l.f15326b = new C5856l(m12574a, m12574a2, m12577d, m12577d2, m12577d3, m12577d4);
        }

        /* renamed from: b */
        public final C5856l m12573b() {
            if (C5856l.f15327c.get()) {
                return C5856l.f15326b;
            }
            m12572a();
            C5856l.f15327c.set(true);
            return C5856l.f15326b;
        }
    }

    public C5856l(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        C9768m.m32346f(cls, "skuDetailsParamsClazz");
        C9768m.m32346f(cls2, "builderClazz");
        C9768m.m32346f(method, "newBuilderMethod");
        C9768m.m32346f(method2, "setTypeMethod");
        C9768m.m32346f(method3, "setSkusListMethod");
        C9768m.m32346f(method4, "buildMethod");
        this.f15328d = cls;
        this.f15329e = cls2;
        this.f15330f = method;
        this.f15331g = method2;
        this.f15332h = method3;
        this.f15333i = method4;
    }

    /* renamed from: d */
    public final Object m12570d(String str, List<String> list) {
        Object m12578e;
        Object m12578e2;
        C5857m c5857m = C5857m.f15334a;
        Object m12578e3 = C5857m.m12578e(this.f15328d, this.f15330f, null, new Object[0]);
        if (m12578e3 == null || (m12578e = C5857m.m12578e(this.f15329e, this.f15331g, m12578e3, str)) == null || (m12578e2 = C5857m.m12578e(this.f15329e, this.f15332h, m12578e, list)) == null) {
            return null;
        }
        return C5857m.m12578e(this.f15329e, this.f15333i, m12578e2, new Object[0]);
    }

    /* renamed from: e */
    public final Class<?> m12571e() {
        return this.f15328d;
    }
}
