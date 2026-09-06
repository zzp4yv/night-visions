package com.facebook.p157o0.p168t0;

import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.C5608a0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RestrictiveDataManager.kt */
/* renamed from: com.facebook.o0.t0.a */
/* loaded from: classes2.dex */
public final class C5896a {

    /* renamed from: b */
    private static boolean f15482b;

    /* renamed from: a */
    public static final C5896a f15481a = new C5896a();

    /* renamed from: c */
    private static final String f15483c = C5896a.class.getCanonicalName();

    /* renamed from: d */
    private static final List<a> f15484d = new ArrayList();

    /* renamed from: e */
    private static final Set<String> f15485e = new CopyOnWriteArraySet();

    /* compiled from: RestrictiveDataManager.kt */
    /* renamed from: com.facebook.o0.t0.a$a */
    public static final class a {

        /* renamed from: a */
        private String f15486a;

        /* renamed from: b */
        private Map<String, String> f15487b;

        public a(String str, Map<String, String> map) {
            C9768m.m32346f(str, "eventName");
            C9768m.m32346f(map, "restrictiveParams");
            this.f15486a = str;
            this.f15487b = map;
        }

        /* renamed from: a */
        public final String m12767a() {
            return this.f15486a;
        }

        /* renamed from: b */
        public final Map<String, String> m12768b() {
            return this.f15487b;
        }

        /* renamed from: c */
        public final void m12769c(Map<String, String> map) {
            C9768m.m32346f(map, "<set-?>");
            this.f15487b = map;
        }
    }

    private C5896a() {
    }

    /* renamed from: a */
    public static final void m12761a() {
        C5896a c5896a = f15481a;
        f15482b = true;
        c5896a.m12763c();
    }

    /* renamed from: b */
    private final String m12762b(String str, String str2) {
        try {
            for (a aVar : new ArrayList(f15484d)) {
                if (aVar != null && C9768m.m32341a(str, aVar.m12767a())) {
                    for (String str3 : aVar.m12768b().keySet()) {
                        if (C9768m.m32341a(str2, str3)) {
                            return aVar.m12768b().get(str3);
                        }
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            Log.w(f15483c, "getMatchedRuleType failed", e2);
            return null;
        }
    }

    /* renamed from: c */
    private final void m12763c() {
        String m11405i;
        try {
            C5639d0 c5639d0 = C5639d0.f14392a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5637c0 m11428o = C5639d0.m11428o(C5608a0.m11285d(), false);
            if (m11428o == null || (m11405i = m11428o.m11405i()) == null) {
                return;
            }
            if (m11405i.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(m11405i);
            f15484d.clear();
            f15485e.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    C9768m.m32345e(next, RoomNotification.KEY);
                    a aVar = new a(next, new HashMap());
                    if (optJSONObject != null) {
                        C5663p0 c5663p0 = C5663p0.f14478a;
                        aVar.m12769c(C5663p0.m11580m(optJSONObject));
                        f15484d.add(aVar);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f15485e.add(aVar.m12767a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private final boolean m12764d(String str) {
        return f15485e.contains(str);
    }

    /* renamed from: e */
    public static final String m12765e(String str) {
        C9768m.m32346f(str, "eventName");
        return (f15482b && f15481a.m12764d(str)) ? "_removed_" : str;
    }

    /* renamed from: f */
    public static final void m12766f(Map<String, String> map, String str) {
        C9768m.m32346f(map, "parameters");
        C9768m.m32346f(str, "eventName");
        if (f15482b) {
            HashMap hashMap = new HashMap();
            for (String str2 : new ArrayList(map.keySet())) {
                String m12762b = f15481a.m12762b(str, str2);
                if (m12762b != null) {
                    hashMap.put(str2, m12762b);
                    map.remove(str2);
                }
            }
            if (!hashMap.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
