package com.flurry.sdk;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.z3 */
/* loaded from: classes2.dex */
public final class C6181z3 extends AbstractC6111q6 {

    /* renamed from: b */
    public final String f16542b;

    /* renamed from: c */
    public final String f16543c;

    public C6181z3(String str, String str2) {
        this.f16542b = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f16543c = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    @Override // com.flurry.sdk.AbstractC6111q6, com.flurry.sdk.InterfaceC6136t6
    /* renamed from: a */
    public final JSONObject mo12963a() throws JSONException {
        JSONObject mo12963a = super.mo12963a();
        if (!TextUtils.isEmpty(this.f16542b)) {
            mo12963a.put("fl.language", this.f16542b);
        }
        if (!TextUtils.isEmpty(this.f16543c)) {
            mo12963a.put("fl.country", this.f16543c);
        }
        return mo12963a;
    }
}
