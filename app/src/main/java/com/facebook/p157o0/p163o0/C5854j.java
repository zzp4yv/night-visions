package com.facebook.p157o0.p163o0;

import android.content.SharedPreferences;
import com.facebook.C5608a0;
import com.facebook.p157o0.p165q0.C5871i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;
import org.json.JSONObject;

/* compiled from: InAppPurchaseLoggerManager.kt */
/* renamed from: com.facebook.o0.o0.j */
/* loaded from: classes2.dex */
public final class C5854j {

    /* renamed from: b */
    private static SharedPreferences f15320b;

    /* renamed from: a */
    public static final C5854j f15319a = new C5854j();

    /* renamed from: c */
    private static final Set<String> f15321c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private static final Map<String, Long> f15322d = new ConcurrentHashMap();

    private C5854j() {
    }

    /* renamed from: d */
    public static final boolean m12557d() {
        f15319a.m12560g();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f15320b;
        if (sharedPreferences == null) {
            C9768m.m32363w("sharedPreferences");
            throw null;
        }
        long j2 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
        if (j2 != 0 && currentTimeMillis - j2 < 86400) {
            return false;
        }
        SharedPreferences sharedPreferences2 = f15320b;
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
            return true;
        }
        C9768m.m32363w("sharedPreferences");
        throw null;
    }

    /* renamed from: e */
    public static final void m12558e(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        C9768m.m32346f(map, "purchaseDetailsMap");
        C9768m.m32346f(map2, "skuDetailsMap");
        C5854j c5854j = f15319a;
        c5854j.m12560g();
        c5854j.m12559f(c5854j.m12563c(c5854j.m12561a(map), map2));
    }

    /* renamed from: f */
    private final void m12559f(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                C5871i c5871i = C5871i.f15376a;
                C5871i.m12638f(key, value, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private final void m12560g() {
        List m37582v0;
        C5608a0 c5608a0 = C5608a0.f14199a;
        SharedPreferences sharedPreferences = C5608a0.m11284c().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        SharedPreferences sharedPreferences2 = C5608a0.m11284c().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
        if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
        }
        SharedPreferences sharedPreferences3 = C5608a0.m11284c().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
        C9768m.m32345e(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
        f15320b = sharedPreferences3;
        Set<String> set = f15321c;
        if (sharedPreferences3 == null) {
            C9768m.m32363w("sharedPreferences");
            throw null;
        }
        Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        set.addAll(stringSet);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            m37582v0 = C10514v.m37582v0(it.next(), new String[]{";"}, false, 2, 2, null);
            f15322d.put(m37582v0.get(0), Long.valueOf(Long.parseLong((String) m37582v0.get(1))));
        }
        m12562b();
    }

    /* renamed from: a */
    public final Map<String, JSONObject> m12561a(Map<String, JSONObject> map) {
        Map m38807s;
        C9768m.m32346f(map, "purchaseDetailsMap");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        m38807s = C10777q0.m38807s(map);
        for (Map.Entry entry : m38807s.entrySet()) {
            String str = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            try {
                if (jSONObject.has("purchaseToken")) {
                    String string = jSONObject.getString("purchaseToken");
                    if (f15322d.containsKey(string)) {
                        map.remove(str);
                    } else {
                        Set<String> set = f15321c;
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) string);
                        sb.append(';');
                        sb.append(currentTimeMillis);
                        set.add(sb.toString());
                    }
                }
            } catch (Exception unused) {
            }
        }
        SharedPreferences sharedPreferences = f15320b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f15321c).apply();
            return new HashMap(map);
        }
        C9768m.m32363w("sharedPreferences");
        throw null;
    }

    /* renamed from: b */
    public final void m12562b() {
        Map m38807s;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f15320b;
        if (sharedPreferences == null) {
            C9768m.m32363w("sharedPreferences");
            throw null;
        }
        long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
        if (j2 == 0) {
            SharedPreferences sharedPreferences2 = f15320b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                return;
            } else {
                C9768m.m32363w("sharedPreferences");
                throw null;
            }
        }
        if (currentTimeMillis - j2 > 604800) {
            m38807s = C10777q0.m38807s(f15322d);
            for (Map.Entry entry : m38807s.entrySet()) {
                String str = (String) entry.getKey();
                long longValue = ((Number) entry.getValue()).longValue();
                if (currentTimeMillis - longValue > 86400) {
                    f15321c.remove(str + ';' + longValue);
                    f15322d.remove(str);
                }
            }
            SharedPreferences sharedPreferences3 = f15320b;
            if (sharedPreferences3 == null) {
                C9768m.m32363w("sharedPreferences");
                throw null;
            }
            sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f15321c).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    /* renamed from: c */
    public final Map<String, String> m12563c(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        C9768m.m32346f(map, "purchaseDetailsMap");
        C9768m.m32346f(map2, "skuDetailsMap");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
            String key = entry.getKey();
            JSONObject value = entry.getValue();
            JSONObject jSONObject = map2.get(key);
            if (value != null && value.has("purchaseTime")) {
                try {
                    if (currentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                        String jSONObject2 = value.toString();
                        C9768m.m32345e(jSONObject2, "purchaseDetail.toString()");
                        String jSONObject3 = jSONObject.toString();
                        C9768m.m32345e(jSONObject3, "skuDetail.toString()");
                        linkedHashMap.put(jSONObject2, jSONObject3);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return linkedHashMap;
    }
}
