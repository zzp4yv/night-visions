package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.s5 */
/* loaded from: classes2.dex */
public final class C6127s5 extends AbstractC6111q6 {

    /* renamed from: b */
    public int f16330b;

    /* renamed from: c */
    public String f16331c;

    public C6127s5(int i2, String str) {
        this.f16330b = 0;
        this.f16331c = "Unknown";
        this.f16330b = i2;
        this.f16331c = str;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.flush.frame.code", this.f16330b);
        mo12963a.put("fl.flush.frame.reason", this.f16331c);
        return mo12963a;
    }
}
