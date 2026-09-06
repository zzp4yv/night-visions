package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.g5 */
/* loaded from: classes2.dex */
public final class C6020g5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final int f15926b;

    public C6020g5(int i2) {
        this.f15926b = i2 < 0 ? 0 : i2;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.app.orientation", this.f15926b);
        return mo12963a;
    }
}
