package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.d4 */
/* loaded from: classes2.dex */
public final class C5991d4 extends AbstractC6111q6 {

    /* renamed from: b */
    public final int f15791b;

    public C5991d4(int i2) {
        this.f15791b = i2;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.error.count", this.f15791b);
        return mo12963a;
    }
}
