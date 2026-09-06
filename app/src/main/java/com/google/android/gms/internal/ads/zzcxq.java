package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcxq implements zzazf {

    /* renamed from: a */
    public final String f25278a;

    /* renamed from: b */
    public final String f25279b;

    /* renamed from: c */
    public final JSONObject f25280c;

    /* renamed from: d */
    private final JSONObject f25281d;

    zzcxq(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject m17271m = zzazc.m17271m(jsonReader);
        this.f25281d = m17271m;
        this.f25278a = m17271m.optString("ad_html", null);
        this.f25279b = m17271m.optString("ad_base_url", null);
        this.f25280c = m17271m.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.internal.ads.zzazf
    /* renamed from: a */
    public final void mo17274a(JsonWriter jsonWriter) throws IOException {
        zzazc.m17266h(jsonWriter, this.f25281d);
    }
}
