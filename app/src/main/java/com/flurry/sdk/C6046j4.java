package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.j4 */
/* loaded from: classes2.dex */
public final class C6046j4 extends AbstractC6111q6 {

    /* renamed from: b */
    public final Map<String, Map<String, String>> f16031b;

    public C6046j4(Map<String, Map<String, String>> map) {
        this.f16031b = new HashMap(map);
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        Map<String, Map<String, String>> map = this.f16031b;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
                for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                    jSONObject2 = jSONObject3;
                }
                jSONObject.put(entry.getKey(), jSONObject2);
            }
        }
        mo12963a.put("fl.session.property", jSONObject);
        return mo12963a;
    }
}
