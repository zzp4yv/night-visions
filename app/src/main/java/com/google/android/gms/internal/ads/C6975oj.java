package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oj */
/* loaded from: classes2.dex */
final /* synthetic */ class C6975oj implements zzczc {

    /* renamed from: a */
    static final zzczc f20196a = new C6975oj();

    private C6975oj() {
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    /* renamed from: a */
    public final Object mo14763a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optInt("error_code") == 6) {
            return zzalo.f22108c.mo14955a(jSONObject.getJSONObject("response"));
        }
        throw new zzcif(jSONObject.getString("error_reason"), jSONObject.optInt("error_code", 0));
    }
}
