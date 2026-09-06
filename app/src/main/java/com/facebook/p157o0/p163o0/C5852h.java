package com.facebook.p157o0.p163o0;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseBillingClientWrapper.kt */
/* renamed from: com.facebook.o0.o0.h */
/* loaded from: classes2.dex */
public final class C5852h {

    /* renamed from: c */
    private static C5852h f15287c;

    /* renamed from: g */
    private final Context f15291g;

    /* renamed from: h */
    private final Object f15292h;

    /* renamed from: i */
    private final Class<?> f15293i;

    /* renamed from: j */
    private final Class<?> f15294j;

    /* renamed from: k */
    private final Class<?> f15295k;

    /* renamed from: l */
    private final Class<?> f15296l;

    /* renamed from: m */
    private final Class<?> f15297m;

    /* renamed from: n */
    private final Class<?> f15298n;

    /* renamed from: o */
    private final Class<?> f15299o;

    /* renamed from: p */
    private final Method f15300p;

    /* renamed from: q */
    private final Method f15301q;

    /* renamed from: r */
    private final Method f15302r;

    /* renamed from: s */
    private final Method f15303s;

    /* renamed from: t */
    private final Method f15304t;

    /* renamed from: u */
    private final Method f15305u;

    /* renamed from: v */
    private final Method f15306v;

    /* renamed from: w */
    private final C5856l f15307w;

    /* renamed from: x */
    private final Set<String> f15308x;

    /* renamed from: a */
    public static final b f15285a = new b(null);

    /* renamed from: b */
    private static final AtomicBoolean f15286b = new AtomicBoolean(false);

    /* renamed from: d */
    private static final AtomicBoolean f15288d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final Map<String, JSONObject> f15289e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final Map<String, JSONObject> f15290f = new ConcurrentHashMap();

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$a */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C9768m.m32346f(obj, "proxy");
            C9768m.m32346f(method, "m");
            if (C9768m.m32341a(method.getName(), "onBillingSetupFinished")) {
                C5852h.f15285a.m12537f().set(true);
            } else {
                String name = method.getName();
                C9768m.m32345e(name, "m.name");
                if (C10513u.m37514p(name, "onBillingServiceDisconnected", false, 2, null)) {
                    C5852h.f15285a.m12537f().set(false);
                }
            }
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        private final Object m12532a(Context context, Class<?> cls) {
            Object m12578e;
            Object m12578e2;
            Object m12578e3;
            C5857m c5857m = C5857m.f15334a;
            Class<?> m12574a = C5857m.m12574a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> m12574a2 = C5857m.m12574a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (m12574a == null || m12574a2 == null) {
                return null;
            }
            Method m12577d = C5857m.m12577d(cls, "newBuilder", Context.class);
            Method m12577d2 = C5857m.m12577d(m12574a, "enablePendingPurchases", new Class[0]);
            Method m12577d3 = C5857m.m12577d(m12574a, "setListener", m12574a2);
            Method m12577d4 = C5857m.m12577d(m12574a, "build", new Class[0]);
            if (m12577d == null || m12577d2 == null || m12577d3 == null || m12577d4 == null || (m12578e = C5857m.m12578e(cls, m12577d, null, context)) == null || (m12578e2 = C5857m.m12578e(m12574a, m12577d3, m12578e, Proxy.newProxyInstance(m12574a2.getClassLoader(), new Class[]{m12574a2}, new d()))) == null || (m12578e3 = C5857m.m12578e(m12574a, m12577d2, m12578e2, new Object[0])) == null) {
                return null;
            }
            return C5857m.m12578e(m12574a, m12577d4, m12578e3, new Object[0]);
        }

        /* renamed from: b */
        private final void m12533b(Context context) {
            C5856l m12573b = C5856l.f15325a.m12573b();
            if (m12573b == null) {
                return;
            }
            C5857m c5857m = C5857m.f15334a;
            Class<?> m12574a = C5857m.m12574a("com.android.billingclient.api.BillingClient");
            Class<?> m12574a2 = C5857m.m12574a("com.android.billingclient.api.Purchase");
            Class<?> m12574a3 = C5857m.m12574a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> m12574a4 = C5857m.m12574a("com.android.billingclient.api.SkuDetails");
            Class<?> m12574a5 = C5857m.m12574a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> m12574a6 = C5857m.m12574a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> m12574a7 = C5857m.m12574a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (m12574a == null || m12574a3 == null || m12574a2 == null || m12574a4 == null || m12574a6 == null || m12574a5 == null || m12574a7 == null) {
                return;
            }
            Method m12577d = C5857m.m12577d(m12574a, "queryPurchases", String.class);
            Method m12577d2 = C5857m.m12577d(m12574a3, "getPurchasesList", new Class[0]);
            Method m12577d3 = C5857m.m12577d(m12574a2, "getOriginalJson", new Class[0]);
            Method m12577d4 = C5857m.m12577d(m12574a4, "getOriginalJson", new Class[0]);
            Method m12577d5 = C5857m.m12577d(m12574a5, "getOriginalJson", new Class[0]);
            Method m12577d6 = C5857m.m12577d(m12574a, "querySkuDetailsAsync", m12573b.m12571e(), m12574a6);
            Method m12577d7 = C5857m.m12577d(m12574a, "queryPurchaseHistoryAsync", String.class, m12574a7);
            if (m12577d == null || m12577d2 == null || m12577d3 == null || m12577d4 == null || m12577d5 == null || m12577d6 == null || m12577d7 == null) {
                return;
            }
            Object m12532a = m12532a(context, m12574a);
            if (m12532a == null) {
                return;
            }
            C5852h.f15287c = new C5852h(context, m12532a, m12574a, m12574a3, m12574a2, m12574a4, m12574a5, m12574a6, m12574a7, m12577d, m12577d2, m12577d3, m12577d4, m12577d5, m12577d6, m12577d7, m12573b, null);
            C5852h c5852h = C5852h.f15287c;
            if (c5852h == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            c5852h.m12529t();
        }

        /* renamed from: c */
        public final synchronized C5852h m12534c(Context context) {
            C9768m.m32346f(context, "context");
            if (C5852h.f15286b.get()) {
                return C5852h.f15287c;
            }
            m12533b(context);
            C5852h.f15286b.set(true);
            return C5852h.f15287c;
        }

        /* renamed from: d */
        public final Map<String, JSONObject> m12535d() {
            return C5852h.f15289e;
        }

        /* renamed from: e */
        public final Map<String, JSONObject> m12536e() {
            return C5852h.f15290f;
        }

        /* renamed from: f */
        public final AtomicBoolean m12537f() {
            return C5852h.f15288d;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$c */
    public final class c implements InvocationHandler {

        /* renamed from: a */
        private Runnable f15309a;

        /* renamed from: b */
        final /* synthetic */ C5852h f15310b;

        public c(C5852h c5852h, Runnable runnable) {
            C9768m.m32346f(c5852h, "this$0");
            C9768m.m32346f(runnable, "runnable");
            this.f15310b = c5852h;
            this.f15309a = runnable;
        }

        /* renamed from: a */
        private final void m12538a(List<?> list) {
            for (Object obj : list) {
                try {
                    C5857m c5857m = C5857m.f15334a;
                    Object m12578e = C5857m.m12578e(this.f15310b.f15297m, this.f15310b.f15304t, obj, new Object[0]);
                    String str = m12578e instanceof String ? (String) m12578e : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("packageName", this.f15310b.f15291g.getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            this.f15310b.f15308x.add(string);
                            Map<String, JSONObject> m12535d = C5852h.f15285a.m12535d();
                            C9768m.m32345e(string, "skuID");
                            m12535d.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f15309a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C9768m.m32346f(obj, "proxy");
            C9768m.m32346f(method, "method");
            if (C9768m.m32341a(method.getName(), "onPurchaseHistoryResponse")) {
                Object obj2 = objArr == null ? null : objArr[1];
                if (obj2 != null && (obj2 instanceof List)) {
                    m12538a((List) obj2);
                }
            }
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$d */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C9768m.m32346f(obj, "proxy");
            C9768m.m32346f(method, "m");
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$e */
    public final class e implements InvocationHandler {

        /* renamed from: a */
        private Runnable f15311a;

        /* renamed from: b */
        final /* synthetic */ C5852h f15312b;

        public e(C5852h c5852h, Runnable runnable) {
            C9768m.m32346f(c5852h, "this$0");
            C9768m.m32346f(runnable, "runnable");
            this.f15312b = c5852h;
            this.f15311a = runnable;
        }

        /* renamed from: a */
        public final void m12539a(List<?> list) {
            C9768m.m32346f(list, "skuDetailsObjectList");
            for (Object obj : list) {
                try {
                    C5857m c5857m = C5857m.f15334a;
                    Object m12578e = C5857m.m12578e(this.f15312b.f15296l, this.f15312b.f15303s, obj, new Object[0]);
                    String str = m12578e instanceof String ? (String) m12578e : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            Map<String, JSONObject> m12536e = C5852h.f15285a.m12536e();
                            C9768m.m32345e(string, "skuID");
                            m12536e.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f15311a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C9768m.m32346f(obj, "proxy");
            C9768m.m32346f(method, "m");
            if (C9768m.m32341a(method.getName(), "onSkuDetailsResponse")) {
                Object obj2 = objArr == null ? null : objArr[1];
                if (obj2 != null && (obj2 instanceof List)) {
                    m12539a((List) obj2);
                }
            }
            return null;
        }
    }

    private C5852h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C5856l c5856l) {
        this.f15291g = context;
        this.f15292h = obj;
        this.f15293i = cls;
        this.f15294j = cls2;
        this.f15295k = cls3;
        this.f15296l = cls4;
        this.f15297m = cls5;
        this.f15298n = cls6;
        this.f15299o = cls7;
        this.f15300p = method;
        this.f15301q = method2;
        this.f15302r = method3;
        this.f15303s = method4;
        this.f15304t = method5;
        this.f15305u = method6;
        this.f15306v = method7;
        this.f15307w = c5856l;
        this.f15308x = new CopyOnWriteArraySet();
    }

    public /* synthetic */ C5852h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C5856l c5856l, C9756g c9756g) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, c5856l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m12526q(C5852h c5852h, Runnable runnable) {
        C9768m.m32346f(c5852h, "this$0");
        C9768m.m32346f(runnable, "$queryPurchaseHistoryRunnable");
        c5852h.m12528s("inapp", new ArrayList(c5852h.f15308x), runnable);
    }

    /* renamed from: r */
    private final void m12527r(String str, Runnable runnable) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f15299o.getClassLoader(), new Class[]{this.f15299o}, new c(this, runnable));
        C5857m c5857m = C5857m.f15334a;
        C5857m.m12578e(this.f15293i, this.f15306v, this.f15292h, str, newProxyInstance);
    }

    /* renamed from: s */
    private final void m12528s(String str, List<String> list, Runnable runnable) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f15298n.getClassLoader(), new Class[]{this.f15298n}, new e(this, runnable));
        Object m12570d = this.f15307w.m12570d(str, list);
        C5857m c5857m = C5857m.f15334a;
        C5857m.m12578e(this.f15293i, this.f15305u, this.f15292h, m12570d, newProxyInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m12529t() {
        Method m12577d;
        C5857m c5857m = C5857m.f15334a;
        Class<?> m12574a = C5857m.m12574a("com.android.billingclient.api.BillingClientStateListener");
        if (m12574a == null || (m12577d = C5857m.m12577d(this.f15293i, "startConnection", m12574a)) == null) {
            return;
        }
        C5857m.m12578e(this.f15293i, m12577d, this.f15292h, Proxy.newProxyInstance(m12574a.getClassLoader(), new Class[]{m12574a}, new a()));
    }

    /* renamed from: o */
    public final void m12530o(String str, Runnable runnable) {
        C9768m.m32346f(str, "skuType");
        C9768m.m32346f(runnable, "querySkuRunnable");
        C5857m c5857m = C5857m.f15334a;
        Object m12578e = C5857m.m12578e(this.f15294j, this.f15301q, C5857m.m12578e(this.f15293i, this.f15300p, this.f15292h, "inapp"), new Object[0]);
        List list = m12578e instanceof List ? (List) m12578e : null;
        if (list == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C5857m c5857m2 = C5857m.f15334a;
                Object m12578e2 = C5857m.m12578e(this.f15295k, this.f15302r, obj, new Object[0]);
                String str2 = m12578e2 instanceof String ? (String) m12578e2 : null;
                if (str2 != null) {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("productId")) {
                        String string = jSONObject.getString("productId");
                        arrayList.add(string);
                        Map<String, JSONObject> map = f15289e;
                        C9768m.m32345e(string, "skuID");
                        map.put(string, jSONObject);
                    }
                }
            }
            m12528s(str, arrayList, runnable);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: p */
    public final void m12531p(String str, final Runnable runnable) {
        C9768m.m32346f(str, "skuType");
        C9768m.m32346f(runnable, "queryPurchaseHistoryRunnable");
        m12527r(str, new Runnable() { // from class: com.facebook.o0.o0.e
            @Override // java.lang.Runnable
            public final void run() {
                C5852h.m12526q(C5852h.this, runnable);
            }
        });
    }
}
