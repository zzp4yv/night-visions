package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.k5 */
/* loaded from: classes2.dex */
public final class C6056k5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final boolean f16100b;

    public C6056k5(boolean z) {
        this.f16100b = z;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.ccpa.optout", this.f16100b);
        return mo12963a;
    }
}
