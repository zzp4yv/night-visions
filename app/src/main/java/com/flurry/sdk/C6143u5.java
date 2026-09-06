package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.u5 */
/* loaded from: classes2.dex */
public final class C6143u5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final long f16407b;

    public C6143u5(long j2) {
        this.f16407b = j2;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.frame.log.counter", this.f16407b);
        return mo12963a;
    }
}
