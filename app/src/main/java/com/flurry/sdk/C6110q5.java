package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.q5 */
/* loaded from: classes2.dex */
public final class C6110q5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final boolean f16290b = true;

    /* renamed from: c */
    public final String f16291c;

    public C6110q5(String str) {
        this.f16291c = str;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.background.enabled", this.f16290b);
        mo12963a.put("fl.sdk.version.code", this.f16291c);
        return mo12963a;
    }
}
