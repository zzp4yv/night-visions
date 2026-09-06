package com.facebook.p157o0.p163o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C5608a0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseEventManager.kt */
/* renamed from: com.facebook.o0.o0.i */
/* loaded from: classes2.dex */
public final class C5853i {

    /* renamed from: a */
    public static final C5853i f15313a = new C5853i();

    /* renamed from: b */
    private static final HashMap<String, Method> f15314b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Class<?>> f15315c = new HashMap<>();

    /* renamed from: d */
    private static final String f15316d;

    /* renamed from: e */
    private static final SharedPreferences f15317e;

    /* renamed from: f */
    private static final SharedPreferences f15318f;

    static {
        C5608a0 c5608a0 = C5608a0.f14199a;
        f15316d = C5608a0.m11284c().getPackageName();
        f15317e = C5608a0.m11284c().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        f15318f = C5608a0.m11284c().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    private C5853i() {
    }

    /* renamed from: a */
    public static final Object m12540a(Context context, IBinder iBinder) {
        C9768m.m32346f(context, "context");
        return f15313a.m12552n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    /* renamed from: b */
    public static final void m12541b() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f15317e;
        long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
        if (j2 == 0) {
            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } else if (currentTimeMillis - j2 > 604800) {
            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    /* renamed from: c */
    private final ArrayList<String> m12542c(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor edit = f15318f.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString("productId");
                long j2 = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j2 / 1000) <= 86400 && !C9768m.m32341a(f15318f.getString(string, HttpUrl.FRAGMENT_ENCODE_SET), string2)) {
                    edit.putString(string, string2);
                    arrayList2.add(next);
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: d */
    private final Class<?> m12543d(Context context, String str) {
        HashMap<String, Class<?>> hashMap = f15315c;
        Class<?> cls = hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        C5857m c5857m = C5857m.f15334a;
        Class<?> m12575b = C5857m.m12575b(context, str);
        if (m12575b != null) {
            hashMap.put(str, m12575b);
        }
        return m12575b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private final Method m12544e(Class<?> cls, String str) {
        Class[] clsArr;
        Method m12576c;
        HashMap<String, Method> hashMap = f15314b;
        Method method = hashMap.get(str);
        if (method != null) {
            return method;
        }
        switch (str.hashCode()) {
            case -1801122596:
                if (str.equals("getPurchases")) {
                    Class cls2 = Integer.TYPE;
                    C9768m.m32345e(cls2, "TYPE");
                    clsArr = new Class[]{cls2, String.class, String.class, String.class};
                    break;
                }
                clsArr = null;
                break;
            case -1450694211:
                if (str.equals("isBillingSupported")) {
                    Class cls3 = Integer.TYPE;
                    C9768m.m32345e(cls3, "TYPE");
                    clsArr = new Class[]{cls3, String.class, String.class};
                    break;
                }
                clsArr = null;
                break;
            case -1123215065:
                if (str.equals("asInterface")) {
                    clsArr = new Class[]{IBinder.class};
                    break;
                }
                clsArr = null;
                break;
            case -594356707:
                if (str.equals("getPurchaseHistory")) {
                    Class cls4 = Integer.TYPE;
                    C9768m.m32345e(cls4, "TYPE");
                    clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                    break;
                }
                clsArr = null;
                break;
            case -573310373:
                if (str.equals("getSkuDetails")) {
                    Class cls5 = Integer.TYPE;
                    C9768m.m32345e(cls5, "TYPE");
                    clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                    break;
                }
                clsArr = null;
                break;
            default:
                clsArr = null;
                break;
        }
        if (clsArr == null) {
            C5857m c5857m = C5857m.f15334a;
            m12576c = C5857m.m12576c(cls, str, null);
        } else {
            C5857m c5857m2 = C5857m.f15334a;
            m12576c = C5857m.m12576c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (m12576c != null) {
            hashMap.put(str, m12576c);
        }
        return m12576c;
    }

    /* renamed from: f */
    private final ArrayList<String> m12545f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        ArrayList<String> arrayList = new ArrayList<>();
        if (m12553o(context, obj, str)) {
            String str2 = null;
            int i2 = 0;
            boolean z = false;
            do {
                Object m12552n = m12552n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f15316d, str, str2, new Bundle()});
                if (m12552n != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) m12552n;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                z = true;
                                break;
                            }
                            arrayList.add(next);
                            i2++;
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i2 < 30 || str2 == null) {
                            break;
                            break;
                        }
                    }
                }
                str2 = null;
                if (i2 < 30) {
                    break;
                }
            } while (!z);
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final ArrayList<String> m12546g(Context context, Object obj) {
        C5853i c5853i;
        Class<?> m12543d;
        C9768m.m32346f(context, "context");
        ArrayList<String> arrayList = new ArrayList<>();
        return (obj == null || (m12543d = (c5853i = f15313a).m12543d(context, "com.android.vending.billing.IInAppBillingService")) == null || c5853i.m12544e(m12543d, "getPurchaseHistory") == null) ? arrayList : c5853i.m12542c(c5853i.m12545f(context, obj, "inapp"));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[EDGE_INSN: B:20:0x005b->B:23:0x005b BREAK  A[LOOP:0: B:8:0x0012->B:19:?], SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList<java.lang.String> m12547h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r14 != 0) goto L8
            return r0
        L8:
            boolean r1 = r12.m12553o(r13, r14, r15)
            if (r1 == 0) goto L5b
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L12:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r11[r1] = r6
            r6 = 1
            java.lang.String r7 = com.facebook.p157o0.p163o0.C5853i.f15316d
            r11[r6] = r7
            r6 = 2
            r11[r6] = r15
            r11[r5] = r3
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.m12552n(r7, r8, r9, r10, r11)
            if (r3 == 0) goto L54
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L54
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L5b
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L55
        L54:
            r3 = r2
        L55:
            r5 = 30
            if (r4 >= r5) goto L5b
            if (r3 != 0) goto L12
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p163o0.C5853i.m12547h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    public static final ArrayList<String> m12548i(Context context, Object obj) {
        C9768m.m32346f(context, "context");
        C5853i c5853i = f15313a;
        return c5853i.m12542c(c5853i.m12547h(context, obj, "inapp"));
    }

    /* renamed from: j */
    public static final ArrayList<String> m12549j(Context context, Object obj) {
        C9768m.m32346f(context, "context");
        C5853i c5853i = f15313a;
        return c5853i.m12542c(c5853i.m12547h(context, obj, "subs"));
    }

    /* renamed from: k */
    public static final Map<String, String> m12550k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        C9768m.m32346f(context, "context");
        C9768m.m32346f(arrayList, "skuList");
        Map<String, String> m12554p = f15313a.m12554p(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!m12554p.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        m12554p.putAll(f15313a.m12551l(context, arrayList2, obj, z));
        return m12554p;
    }

    /* renamed from: l */
    private final Map<String, String> m12551l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        int size;
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            int i2 = 0;
            objArr[0] = 3;
            objArr[1] = f15316d;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object m12552n = m12552n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (m12552n != null) {
                Bundle bundle2 = (Bundle) m12552n;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            String str = arrayList.get(i2);
                            C9768m.m32345e(str, "skuList[i]");
                            String str2 = stringArrayList.get(i2);
                            C9768m.m32345e(str2, "skuDetailsList[i]");
                            linkedHashMap.put(str, str2);
                            if (i3 > size) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    m12555q(linkedHashMap);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: n */
    private final Object m12552n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method m12544e;
        Class<?> m12543d = m12543d(context, str);
        if (m12543d == null || (m12544e = m12544e(m12543d, str2)) == null) {
            return null;
        }
        C5857m c5857m = C5857m.f15334a;
        return C5857m.m12578e(m12543d, m12544e, obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: o */
    private final boolean m12553o(Context context, Object obj, String str) {
        Object m12552n;
        return (obj == null || (m12552n = m12552n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f15316d, str})) == null || ((Integer) m12552n).intValue() != 0) ? false : true;
    }

    /* renamed from: p */
    private final Map<String, String> m12554p(ArrayList<String> arrayList) {
        List m37582v0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String string = f15317e.getString(next, null);
            if (string != null) {
                m37582v0 = C10514v.m37582v0(string, new String[]{";"}, false, 2, 2, null);
                if (currentTimeMillis - Long.parseLong((String) m37582v0.get(0)) < 43200) {
                    C9768m.m32345e(next, "sku");
                    linkedHashMap.put(next, m37582v0.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: q */
    private final void m12555q(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = f15317e.edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
        }
        edit.apply();
    }

    /* renamed from: m */
    public final boolean m12556m(String str) {
        C9768m.m32346f(str, "skuDetail");
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString != null) {
                return optString.length() > 0;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }
}
