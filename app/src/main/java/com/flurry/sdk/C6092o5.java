package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.o5 */
/* loaded from: classes2.dex */
public final class C6092o5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final Map<String, String> f16205b;

    public C6092o5(Map<String, String> map) {
        this.f16205b = new HashMap(map);
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.device.properties", C5999e2.m13052a(this.f16205b));
        return mo12963a;
    }
}
