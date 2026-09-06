package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcxo {

    /* renamed from: a */
    public final List<String> f25272a;

    /* renamed from: b */
    public final String f25273b;

    /* renamed from: c */
    public final int f25274c;

    /* renamed from: d */
    public final String f25275d;

    /* renamed from: e */
    public final int f25276e;

    /* renamed from: f */
    public final long f25277f;

    zzcxo(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzazc.m17260b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i3 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j2 = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f25272a = emptyList;
        this.f25274c = i2;
        this.f25273b = str;
        this.f25275d = str2;
        this.f25276e = i3;
        this.f25277f = j2;
    }
}
