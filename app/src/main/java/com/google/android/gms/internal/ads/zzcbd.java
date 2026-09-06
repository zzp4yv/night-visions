package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbd {

    /* renamed from: a */
    private final Executor f23998a;

    /* renamed from: b */
    private final zzcau f23999b;

    public zzcbd(Executor executor, zzcau zzcauVar) {
        this.f23998a = executor;
        this.f23999b = zzcauVar;
    }

    /* renamed from: a */
    public final zzbbh<List<zzcbg>> m18637a(JSONObject jSONObject, String str) {
        Future m17378o;
        final String optString;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzbar.m17378o(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                String optString2 = optJSONObject.optString("type");
                char c2 = "string".equals(optString2) ? (char) 1 : "image".equals(optString2) ? (char) 2 : (char) 0;
                if (c2 == 1) {
                    m17378o = zzbar.m17378o(new zzcbg(optString, optJSONObject.optString("string_value")));
                } else if (c2 == 2) {
                    m17378o = zzbar.m17367d(this.f23999b.m18633g(optJSONObject, "image_value"), new zzbam(optString) { // from class: com.google.android.gms.internal.ads.wg

                        /* renamed from: a */
                        private final String f20851a;

                        {
                            this.f20851a = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbam
                        /* renamed from: a */
                        public final Object mo14764a(Object obj) {
                            return new zzcbg(this.f20851a, (zzadw) obj);
                        }
                    }, this.f23998a);
                }
                arrayList.add(m17378o);
            }
            m17378o = zzbar.m17378o(null);
            arrayList.add(m17378o);
        }
        return zzbar.m17367d(zzbar.m17376m(arrayList), C7231vg.f20742a, this.f23998a);
    }
}
