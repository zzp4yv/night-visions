package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.j6 */
/* loaded from: classes2.dex */
public final class C6048j6 extends AbstractC6111q6 {

    /* renamed from: b */
    public final Map<EnumC6068m, String> f16032b;

    /* renamed from: c */
    public final boolean f16033c;

    public C6048j6(Map<EnumC6068m, String> map, boolean z) {
        this.f16032b = new HashMap(map);
        this.f16033c = z;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<EnumC6068m, String> entry : this.f16032b.entrySet()) {
            jSONObject.put(entry.getKey().name(), entry.getValue());
        }
        mo12963a.put("fl.reported.id", jSONObject);
        mo12963a.put("fl.ad.tracking", this.f16033c);
        return mo12963a;
    }
}
