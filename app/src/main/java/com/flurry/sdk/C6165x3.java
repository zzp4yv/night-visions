package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.x3 */
/* loaded from: classes2.dex */
public final class C6165x3 extends AbstractC6111q6 {

    /* renamed from: b */
    public final int f16515b;

    /* renamed from: c */
    public final boolean f16516c;

    public C6165x3(int i2, boolean z) {
        this.f16515b = i2;
        this.f16516c = z;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.event.count", this.f16515b);
        mo12963a.put("fl.event.set.complete", this.f16516c);
        return mo12963a;
    }
}
