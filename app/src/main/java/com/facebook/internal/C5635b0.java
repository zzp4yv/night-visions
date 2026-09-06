package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.C5608a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5635b0;
import com.facebook.internal.p147s0.C5669a;
import com.facebook.internal.p147s0.C5670b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppGateKeepersManager.kt */
/* renamed from: com.facebook.internal.b0 */
/* loaded from: classes2.dex */
public final class C5635b0 {

    /* renamed from: a */
    public static final C5635b0 f14356a = new C5635b0();

    /* renamed from: b */
    private static final String f14357b = C9757g0.m32298b(C5635b0.class).mo32291q();

    /* renamed from: c */
    private static final AtomicBoolean f14358c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<a> f14359d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static final Map<String, JSONObject> f14360e = new ConcurrentHashMap();

    /* renamed from: f */
    private static Long f14361f;

    /* renamed from: g */
    private static C5670b f14362g;

    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* renamed from: com.facebook.internal.b0$a */
    public interface a {
        void onCompleted();
    }

    private C5635b0() {
    }

    /* renamed from: a */
    private final JSONObject m11384a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        C5608a0 c5608a0 = C5608a0.f14199a;
        bundle.putString("sdk_version", C5608a0.m11300s());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.C5599c c5599c = GraphRequest.f14159a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        GraphRequest m11236x = c5599c.m11236x(null, format, null);
        m11236x.m11177H(bundle);
        JSONObject m11340d = m11236x.m11179j().m11340d();
        return m11340d == null ? new JSONObject() : m11340d;
    }

    /* renamed from: b */
    public static final boolean m11385b(String str, String str2, boolean z) {
        Boolean bool;
        C9768m.m32346f(str, "name");
        Map<String, Boolean> m11395c = f14356a.m11395c(str2);
        return (m11395c.containsKey(str) && (bool = m11395c.get(str)) != null) ? bool.booleanValue() : z;
    }

    /* renamed from: d */
    private final boolean m11386d(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    /* renamed from: h */
    public static final synchronized void m11389h(a aVar) {
        synchronized (C5635b0.class) {
            if (aVar != null) {
                f14359d.add(aVar);
            }
            C5608a0 c5608a0 = C5608a0.f14199a;
            final String m11285d = C5608a0.m11285d();
            C5635b0 c5635b0 = f14356a;
            if (c5635b0.m11386d(f14361f) && f14360e.containsKey(m11285d)) {
                c5635b0.m11392k();
                return;
            }
            final Context m11284c = C5608a0.m11284c();
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m11285d}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            if (m11284c == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = m11284c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            C5663p0 c5663p0 = C5663p0.f14478a;
            if (!C5663p0.m11557a0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    C5663p0 c5663p02 = C5663p0.f14478a;
                    C5663p0.m11573i0("FacebookSDK", e2);
                }
                if (jSONObject != null) {
                    m11391j(m11285d, jSONObject);
                }
            }
            C5608a0 c5608a02 = C5608a0.f14199a;
            Executor m11292k = C5608a0.m11292k();
            if (m11292k == null) {
                return;
            }
            if (f14358c.compareAndSet(false, true)) {
                m11292k.execute(new Runnable() { // from class: com.facebook.internal.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5635b0.m11390i(m11285d, m11284c, format);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m11390i(String str, Context context, String str2) {
        C9768m.m32346f(str, "$applicationId");
        C9768m.m32346f(context, "$context");
        C9768m.m32346f(str2, "$gateKeepersKey");
        C5635b0 c5635b0 = f14356a;
        JSONObject m11384a = c5635b0.m11384a(str);
        if (m11384a.length() != 0) {
            m11391j(str, m11384a);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, m11384a.toString()).apply();
            f14361f = Long.valueOf(System.currentTimeMillis());
        }
        c5635b0.m11392k();
        f14358c.set(false);
    }

    /* renamed from: j */
    public static final synchronized JSONObject m11391j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (C5635b0.class) {
            C9768m.m32346f(str, "applicationId");
            jSONObject2 = f14360e.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i2 = 0;
            JSONObject jSONObject3 = null;
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                        jSONObject2.put(jSONObject4.getString(RoomNotification.KEY), jSONObject4.getBoolean("value"));
                    } catch (JSONException e2) {
                        C5663p0 c5663p0 = C5663p0.f14478a;
                        C5663p0.m11573i0("FacebookSDK", e2);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            f14360e.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: k */
    private final void m11392k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f14359d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5635b0.m11393l(C5635b0.a.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m11393l(a aVar) {
        aVar.onCompleted();
    }

    /* renamed from: m */
    public static final JSONObject m11394m(String str, boolean z) {
        C9768m.m32346f(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = f14360e;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject m11384a = f14356a.m11384a(str);
        C5608a0 c5608a0 = C5608a0.f14199a;
        Context m11284c = C5608a0.m11284c();
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        m11284c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, m11384a.toString()).apply();
        return m11391j(str, m11384a);
    }

    /* renamed from: c */
    public final Map<String, Boolean> m11395c(String str) {
        m11396g();
        if (str != null) {
            Map<String, JSONObject> map = f14360e;
            if (map.containsKey(str)) {
                C5670b c5670b = f14362g;
                List<C5669a> m11703a = c5670b == null ? null : c5670b.m11703a(str);
                if (m11703a != null) {
                    HashMap hashMap = new HashMap();
                    for (C5669a c5669a : m11703a) {
                        hashMap.put(c5669a.m11701a(), Boolean.valueOf(c5669a.m11702b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C9768m.m32345e(next, RoomNotification.KEY);
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C5670b c5670b2 = f14362g;
                if (c5670b2 == null) {
                    c5670b2 = new C5670b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new C5669a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                c5670b2.m11704b(str, arrayList);
                f14362g = c5670b2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    /* renamed from: g */
    public final void m11396g() {
        m11389h(null);
    }
}
