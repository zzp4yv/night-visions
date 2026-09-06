package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.p183n.InterfaceC8166d0;
import com.google.firebase.crashlytics.internal.p190t.C8274d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.t.l */
/* loaded from: classes2.dex */
class C8282l implements InterfaceC8278h {
    C8282l() {
    }

    /* renamed from: b */
    private static C8274d.a m26067b(JSONObject jSONObject) {
        return new C8274d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    private static C8274d.b m26068c(JSONObject jSONObject) {
        return new C8274d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m26069d(InterfaceC8166d0 interfaceC8166d0, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j2 * 1000) + interfaceC8166d0.mo25232a();
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8278h
    /* renamed from: a */
    public C8274d mo26036a(InterfaceC8166d0 interfaceC8166d0, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C8274d(m26069d(interfaceC8166d0, optInt2, jSONObject), jSONObject.has("session") ? m26068c(jSONObject.getJSONObject("session")) : m26068c(new JSONObject()), m26067b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
