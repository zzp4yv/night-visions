package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzagz {

    /* renamed from: a */
    public static final zzaho<zzbgz> f22017a = C7362z.f21346a;

    /* renamed from: b */
    public static final zzaho<zzbgz> f22018b = C6438a0.f18064a;

    /* renamed from: c */
    public static final zzaho<zzbgz> f22019c = C6475b0.f18209a;

    /* renamed from: d */
    public static final zzaho<zzbgz> f22020d = new C6586e0();

    /* renamed from: e */
    public static final zzaho<zzbgz> f22021e = new C6623f0();

    /* renamed from: f */
    public static final zzaho<zzbgz> f22022f = C6512c0.f18374a;

    /* renamed from: g */
    public static final zzaho<Object> f22023g = new C6660g0();

    /* renamed from: h */
    public static final zzaho<zzbgz> f22024h = new C6697h0();

    /* renamed from: i */
    public static final zzaho<zzbgz> f22025i = C6549d0.f18476a;

    /* renamed from: j */
    public static final zzaho<zzbgz> f22026j = new C6734i0();

    /* renamed from: k */
    public static final zzaho<zzbgz> f22027k = new C6771j0();

    /* renamed from: l */
    public static final zzaho<zzbdf> f22028l = new zzbfo();

    /* renamed from: m */
    public static final zzaho<zzbdf> f22029m = new zzbfp();

    /* renamed from: n */
    public static final zzaho<zzbgz> f22030n = new zzagy();

    /* renamed from: o */
    public static final zzahu f22031o = new zzahu();

    /* renamed from: p */
    public static final zzaho<zzbgz> f22032p = new C6808k0();

    /* renamed from: q */
    public static final zzaho<zzbgz> f22033q = new C6845l0();

    /* renamed from: r */
    public static final zzaho<zzbgz> f22034r = new C6882m0();

    /* renamed from: a */
    static final /* synthetic */ void m16563a(zzaji zzajiVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbad.m17353i("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzdh mo14903d = ((zzbif) zzajiVar).mo14903d();
            if (mo14903d != null && mo14903d.m19454e(parse)) {
                parse = mo14903d.m19452a(parse, ((zzbhx) zzajiVar).getContext(), ((zzbih) zzajiVar).getView(), ((zzbhx) zzajiVar).mo14897a());
            }
        } catch (zzdi unused) {
            zzbad.m17353i(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        zzbhx zzbhxVar = (zzbhx) zzajiVar;
        new zzazi(zzbhxVar.getContext(), ((zzbig) zzajiVar).mo14899b().f22750f, zzavx.m17020b(parse, zzbhxVar.getContext())).zzvi();
    }

    /* renamed from: b */
    static final /* synthetic */ void m16564b(zzbhx zzbhxVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbad.m17353i("URL missing from httpTrack GMSG.");
        } else {
            new zzazi(zzbhxVar.getContext(), ((zzbig) zzbhxVar).mo14899b().f22750f, str).zzvi();
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m16565c(zzbif zzbifVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzdh mo14903d = zzbifVar.mo14903d();
            if (mo14903d != null) {
                mo14903d.m19455f().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzbad.m17353i("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: d */
    static final /* synthetic */ void m16566d(zzbhx zzbhxVar, Map map) {
        PackageManager packageManager = zzbhxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                String valueOf = String.valueOf(optString7);
                                zzbad.m17347c(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e3) {
                            zzbad.m17347c("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        zzbad.m17347c("Error parsing the intent data.", e4);
                    }
                }
                ((zzaji) zzbhxVar).mo14915j("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzaji) zzbhxVar).mo14915j("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzaji) zzbhxVar).mo14915j("openableIntents", new JSONObject());
        }
    }

    /* renamed from: e */
    static final /* synthetic */ void m16567e(zzbhx zzbhxVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzbad.m17353i("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbhxVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzaji) zzbhxVar).mo14940y("openableURLs", hashMap);
    }
}
