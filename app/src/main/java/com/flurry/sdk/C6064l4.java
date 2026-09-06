package com.flurry.sdk;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.l4 */
/* loaded from: classes2.dex */
public final class C6064l4 extends AbstractC6111q6 {

    /* renamed from: b */
    public final String f16108b;

    public C6064l4(String str) {
        this.f16108b = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        if (!TextUtils.isEmpty(this.f16108b)) {
            mo12963a.put("fl.timezone.value", this.f16108b);
        }
        return mo12963a;
    }
}
