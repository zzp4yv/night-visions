package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C5608a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5705x;
import com.facebook.p157o0.p160m0.p161n.C5840e;
import com.facebook.p157o0.p165q0.C5871i;
import com.facebook.p157o0.p165q0.C5872j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager.kt */
/* renamed from: com.facebook.internal.d0 */
/* loaded from: classes2.dex */
public final class C5639d0 {

    /* renamed from: a */
    public static final C5639d0 f14392a = new C5639d0();

    /* renamed from: b */
    private static final String f14393b = C5639d0.class.getSimpleName();

    /* renamed from: c */
    private static final List<String> f14394c;

    /* renamed from: d */
    private static final Map<String, C5637c0> f14395d;

    /* renamed from: e */
    private static final AtomicReference<a> f14396e;

    /* renamed from: f */
    private static final ConcurrentLinkedQueue<b> f14397f;

    /* renamed from: g */
    private static boolean f14398g;

    /* renamed from: h */
    private static JSONArray f14399h;

    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d0$a */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d0$b */
    public interface b {
        /* renamed from: a */
        void mo11431a(C5637c0 c5637c0);

        void onError();
    }

    static {
        List<String> m38891m;
        m38891m = C10784u.m38891m("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules");
        f14394c = m38891m;
        f14395d = new ConcurrentHashMap();
        f14396e = new AtomicReference<>(a.NOT_LOADED);
        f14397f = new ConcurrentLinkedQueue<>();
    }

    private C5639d0() {
    }

    /* renamed from: a */
    public static final void m11415a(b bVar) {
        C9768m.m32346f(bVar, "callback");
        f14397f.add(bVar);
        m11421g();
    }

    /* renamed from: b */
    private final JSONObject m11416b(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f14394c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest m11236x = GraphRequest.f14159a.m11236x(null, "app", null);
        m11236x.m11174E(true);
        m11236x.m11177H(bundle);
        JSONObject m11340d = m11236x.m11179j().m11340d();
        return m11340d == null ? new JSONObject() : m11340d;
    }

    /* renamed from: c */
    public static final C5637c0 m11417c(String str) {
        if (str != null) {
            return f14395d.get(str);
        }
        return null;
    }

    /* renamed from: g */
    public static final void m11421g() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        final Context m11284c = C5608a0.m11284c();
        final String m11285d = C5608a0.m11285d();
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11557a0(m11285d)) {
            f14396e.set(a.ERROR);
            f14392a.m11425l();
            return;
        }
        if (f14395d.containsKey(m11285d)) {
            f14396e.set(a.SUCCESS);
            f14392a.m11425l();
            return;
        }
        AtomicReference<a> atomicReference = f14396e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!(atomicReference.compareAndSet(aVar, aVar2) || atomicReference.compareAndSet(a.ERROR, aVar2))) {
            f14392a.m11425l();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m11285d}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        C5608a0.m11292k().execute(new Runnable() { // from class: com.facebook.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                C5639d0.m11422h(m11284c, format, m11285d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m11422h(Context context, String str, String str2) {
        JSONObject jSONObject;
        C9768m.m32346f(context, "$context");
        C9768m.m32346f(str, "$settingsKey");
        C9768m.m32346f(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        C5637c0 c5637c0 = null;
        String string = sharedPreferences.getString(str, null);
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (!C5663p0.m11557a0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e2) {
                C5663p0 c5663p02 = C5663p0.f14478a;
                C5663p0.m11573i0("FacebookSDK", e2);
                jSONObject = null;
            }
            if (jSONObject != null) {
                c5637c0 = f14392a.m11429i(str2, jSONObject);
            }
        }
        C5639d0 c5639d0 = f14392a;
        JSONObject m11416b = c5639d0.m11416b(str2);
        if (m11416b != null) {
            c5639d0.m11429i(str2, m11416b);
            sharedPreferences.edit().putString(str, m11416b.toString()).apply();
        }
        if (c5637c0 != null) {
            String m11406j = c5637c0.m11406j();
            if (!f14398g && m11406j != null && m11406j.length() > 0) {
                f14398g = true;
                Log.w(f14393b, m11406j);
            }
        }
        C5635b0 c5635b0 = C5635b0.f14356a;
        C5635b0.m11394m(str2, true);
        C5871i c5871i = C5871i.f15376a;
        C5871i.m12636d();
        f14396e.set(f14395d.containsKey(str2) ? a.SUCCESS : a.ERROR);
        c5639d0.m11425l();
    }

    /* renamed from: j */
    private final Map<String, Map<String, C5637c0.b>> m11423j(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int i2 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    C5637c0.b.a aVar = C5637c0.b.f14386a;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    C9768m.m32345e(optJSONObject, "dialogConfigData.optJSONObject(i)");
                    C5637c0.b m11414a = aVar.m11414a(optJSONObject);
                    if (m11414a != null) {
                        String m11411a = m11414a.m11411a();
                        Map map = (Map) hashMap.get(m11411a);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(m11411a, map);
                        }
                        map.put(m11414a.m11412b(), m11414a);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return hashMap;
    }

    /* renamed from: k */
    private final JSONArray m11424k(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: l */
    private final synchronized void m11425l() {
        a aVar = f14396e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            final C5637c0 c5637c0 = f14395d.get(C5608a0.m11285d());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f14397f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b poll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5639d0.m11426m(C5639d0.b.this);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f14397f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b poll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5639d0.m11427n(C5639d0.b.this, c5637c0);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m11426m(b bVar) {
        bVar.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m11427n(b bVar, C5637c0 c5637c0) {
        bVar.mo11431a(c5637c0);
    }

    /* renamed from: o */
    public static final C5637c0 m11428o(String str, boolean z) {
        C9768m.m32346f(str, "applicationId");
        if (!z) {
            Map<String, C5637c0> map = f14395d;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C5639d0 c5639d0 = f14392a;
        JSONObject m11416b = c5639d0.m11416b(str);
        if (m11416b == null) {
            return null;
        }
        C5637c0 m11429i = c5639d0.m11429i(str, m11416b);
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C9768m.m32341a(str, C5608a0.m11285d())) {
            f14396e.set(a.SUCCESS);
            c5639d0.m11425l();
        }
        return m11429i;
    }

    /* renamed from: i */
    public final C5637c0 m11429i(String str, JSONObject jSONObject) {
        C9768m.m32346f(str, "applicationId");
        C9768m.m32346f(jSONObject, "settingsJSON");
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        C5705x.a aVar = C5705x.f14638a;
        C5705x m11826a = aVar.m11826a(optJSONArray);
        if (m11826a == null) {
            m11826a = aVar.m11827b();
        }
        C5705x c5705x = m11826a;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        f14399h = optJSONArray2;
        if (optJSONArray2 != null) {
            C5647h0 c5647h0 = C5647h0.f14422a;
            if (C5647h0.m11442b()) {
                C5840e c5840e = C5840e.f15254a;
                C5840e.m12466c(optJSONArray2 == null ? null : optJSONArray2.toString());
            }
        }
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject.optString("gdpv4_nux_content", HttpUrl.FRAGMENT_ENCODE_SET);
        C9768m.m32345e(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        C5872j c5872j = C5872j.f15382a;
        int optInt2 = jSONObject.optInt("app_events_session_timeout", C5872j.m12642a());
        EnumSet<EnumC5661o0> m11524a = EnumC5661o0.f14470f.m11524a(jSONObject.optLong("seamless_login"));
        Map<String, Map<String, C5637c0.b>> m11423j = m11423j(jSONObject.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        C9768m.m32345e(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject.optString("smart_login_menu_icon_url");
        C9768m.m32345e(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject.optString("sdk_update_message");
        C9768m.m32345e(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C5637c0 c5637c0 = new C5637c0(optBoolean, optString, optBoolean2, optInt2, m11524a, m11423j, z, c5705x, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"), m11424k(jSONObject.optJSONObject("protected_mode_rules"), "standard_params"), m11424k(jSONObject.optJSONObject("protected_mode_rules"), "maca_rules"));
        f14395d.put(str, c5637c0);
        return c5637c0;
    }
}
