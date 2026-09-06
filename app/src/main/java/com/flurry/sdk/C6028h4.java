package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.h4 */
/* loaded from: classes2.dex */
public final class C6028h4 extends AbstractC6111q6 {

    /* renamed from: b */
    public final String f15951b;

    /* renamed from: c */
    public final String f15952c;

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.session.property.param.name", this.f15951b);
        mo12963a.put("fl.session.property.param.value", this.f15952c);
        return mo12963a;
    }
}
