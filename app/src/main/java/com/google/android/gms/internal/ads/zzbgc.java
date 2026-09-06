package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbgc implements zzaho<zzbdf> {
    /* renamed from: b */
    private static Integer m17644b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            zzbad.m17353i(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbdf zzbdfVar, Map map) {
        zzbft zzbftVar;
        zzbdf zzbdfVar2 = zzbdfVar;
        if (zzbad.m17345a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzbad.m17349e(sb.toString());
        }
        zzk.zzmc();
        if (map.containsKey("abort")) {
            if (zzbfs.m17619g(zzbdfVar2)) {
                return;
            }
            zzbad.m17353i("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzbad.m17353i(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzbfs.m17620h(zzbdfVar2) != null) {
                zzbad.m17353i("Precache task is already running.");
                return;
            }
            if (zzbdfVar2.mo14901c() == null) {
                zzbad.m17353i("Precache requires a dependency provider.");
                return;
            }
            zzbde zzbdeVar = new zzbde((String) map.get("flags"));
            Integer m17644b = m17644b(map, "player");
            if (m17644b == null) {
                m17644b = 0;
            }
            zzbftVar = zzbdfVar2.mo14901c().zzbqr.mo17616a(zzbdfVar2, m17644b.intValue(), null, zzbdeVar);
            new zzbfq(zzbdfVar2, zzbftVar, str, strArr).zzvi();
        } else {
            zzbfq m17620h = zzbfs.m17620h(zzbdfVar2);
            if (m17620h == null) {
                zzbad.m17353i("Precache must specify a source.");
                return;
            }
            zzbftVar = m17620h.f22966b;
        }
        Integer m17644b2 = m17644b(map, "minBufferMs");
        if (m17644b2 != null) {
            zzbftVar.mo17635t(m17644b2.intValue());
        }
        Integer m17644b3 = m17644b(map, "maxBufferMs");
        if (m17644b3 != null) {
            zzbftVar.mo17636u(m17644b3.intValue());
        }
        Integer m17644b4 = m17644b(map, "bufferForPlaybackMs");
        if (m17644b4 != null) {
            zzbftVar.mo17637v(m17644b4.intValue());
        }
        Integer m17644b5 = m17644b(map, "bufferForPlaybackAfterRebufferMs");
        if (m17644b5 != null) {
            zzbftVar.mo17638w(m17644b5.intValue());
        }
    }
}
