package com.flurry.sdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.a6 */
/* loaded from: classes2.dex */
public final class C5966a6 extends AbstractC6111q6 {

    /* renamed from: b */
    public final String f15664b;

    /* renamed from: c */
    public final boolean f15665c;

    public C5966a6(String str, boolean z) {
        this.f15664b = str;
        this.f15665c = z;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        if (!TextUtils.isEmpty(this.f15664b)) {
            mo12963a.put("fl.notification.key", this.f15664b);
        }
        mo12963a.put("fl.notification.enabled", this.f15665c);
        return mo12963a;
    }
}
