package com.flurry.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.i5 */
/* loaded from: classes2.dex */
public final class C6038i5 extends AbstractC6111q6 {

    /* renamed from: b */
    public final int f15997b;

    /* renamed from: c */
    public final int f15998c;

    public C6038i5(int i2, int i3) {
        this.f15998c = i2 < 0 ? EnumC6022g7.UNKNOWN.f15931j : i2;
        this.f15997b = i3 < 0 ? EnumC6022g7.UNKNOWN.f15931j : i3;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        mo12963a.put("fl.app.current.state", this.f15997b);
        mo12963a.put("fl.app.previous.state", this.f15998c);
        return mo12963a;
    }
}
