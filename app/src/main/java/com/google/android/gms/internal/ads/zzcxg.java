package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcxg implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final Map<String, Object> f25221a;

    public zzcxg(Map<String, Object> map) {
        this.f25221a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", zzk.zzlg().m17176Y(this.f25221a));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            zzawz.m17082m(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
