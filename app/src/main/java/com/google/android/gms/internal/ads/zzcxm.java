package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcxm {

    /* renamed from: A */
    public final JSONObject f25228A;

    /* renamed from: B */
    public final boolean f25229B;

    /* renamed from: C */
    public final boolean f25230C;

    /* renamed from: D */
    public final boolean f25231D;

    /* renamed from: E */
    public final boolean f25232E;

    /* renamed from: F */
    public final boolean f25233F;

    /* renamed from: G */
    public final boolean f25234G;

    /* renamed from: H */
    public final int f25235H;

    /* renamed from: I */
    public final int f25236I;

    /* renamed from: J */
    public final boolean f25237J;

    /* renamed from: K */
    public final String f25238K;

    /* renamed from: L */
    public final JSONObject f25239L;

    /* renamed from: M */
    public final boolean f25240M;

    /* renamed from: N */
    public final boolean f25241N;

    /* renamed from: O */
    public final int f25242O;

    /* renamed from: a */
    public final List<String> f25243a;

    /* renamed from: b */
    public final int f25244b;

    /* renamed from: c */
    public final List<String> f25245c;

    /* renamed from: d */
    public final List<String> f25246d;

    /* renamed from: e */
    public final int f25247e;

    /* renamed from: f */
    public final List<String> f25248f;

    /* renamed from: g */
    public final List<String> f25249g;

    /* renamed from: h */
    public final List<String> f25250h;

    /* renamed from: i */
    public final List<String> f25251i;

    /* renamed from: j */
    public final String f25252j;

    /* renamed from: k */
    public final String f25253k;

    /* renamed from: l */
    public final zzato f25254l;

    /* renamed from: m */
    public final List<String> f25255m;

    /* renamed from: n */
    public final List<String> f25256n;

    /* renamed from: o */
    public final List<zzcxn> f25257o;

    /* renamed from: p */
    public final zzcxq f25258p;

    /* renamed from: q */
    public final List<String> f25259q;

    /* renamed from: r */
    public final List<zzcxn> f25260r;

    /* renamed from: s */
    public final JSONObject f25261s;

    /* renamed from: t */
    public final String f25262t;

    /* renamed from: u */
    public final String f25263u;

    /* renamed from: v */
    public final String f25264v;

    /* renamed from: w */
    public final String f25265w;

    /* renamed from: x */
    public final zzauy f25266x;

    /* renamed from: y */
    public final String f25267y;

    /* renamed from: z */
    public final JSONObject f25268z;

    zzcxm(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> list;
        char c2;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<zzcxn> emptyList10 = Collections.emptyList();
        List<String> emptyList11 = Collections.emptyList();
        List<zzcxn> emptyList12 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jsonReader.beginObject();
        List<String> list2 = emptyList11;
        List<zzcxn> list3 = emptyList12;
        JSONObject jSONObject5 = jSONObject;
        JSONObject jSONObject6 = jSONObject4;
        zzauy zzauyVar = null;
        zzcxq zzcxqVar = null;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i6 = 0;
        JSONObject jSONObject7 = jSONObject3;
        zzato zzatoVar = null;
        JSONObject jSONObject8 = jSONObject2;
        String str8 = str7;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str9 = nextName == null ? HttpUrl.FRAGMENT_ENCODE_SET : nextName;
            List<zzcxn> list4 = emptyList10;
            switch (str9.hashCode()) {
                case -1980587809:
                    list = emptyList9;
                    if (str9.equals("debug_signals")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    if (str9.equals("omid_settings")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    if (str9.equals("is_custom_close_blocked")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    if (str9.equals("orientation")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    if (str9.equals("enable_omid")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    if (str9.equals("showable_impression_type")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    if (str9.equals("ad_sizes")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    if (str9.equals("adapters")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    if (str9.equals("extras")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    if (str9.equals("allow_pub_rendered_attribution")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    if (str9.equals("ad_type")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    if (str9.equals("is_scroll_aware")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    if (str9.equals("fill_urls")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    if (str9.equals("allocation_id")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    if (str9.equals("video_complete_urls")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    if (str9.equals("active_view")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    if (str9.equals("valid_from_timestamp")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    if (str9.equals("click_urls")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    if (str9.equals("safe_browsing")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    if (str9.equals("imp_urls")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    if (str9.equals("render_timeout_ms")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    if (str9.equals("allow_custom_click_gesture")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    if (str9.equals("ad")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    if (str9.equals(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    if (str9.equals("data")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    if (str9.equals("render_test_label")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    if (str9.equals("qdata")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    if (str9.equals("ad_load_urls")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    if (str9.equals("is_closable_area_disabled")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    if (str9.equals("debug_dialog_string")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 673261304:
                    list = emptyList9;
                    if (str9.equals("reward_granted_urls")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    if (str9.equals("container_sizes")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    if (str9.equals("impression_type")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    if (str9.equals("transaction_id")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    if (str9.equals("rewards")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    if (str9.equals("allow_pub_owned_ad_view")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    if (str9.equals("bid_response")) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    if (str9.equals("video_start_urls")) {
                        c2 = '%';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    if (str9.equals("video_reward_urls")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    if (str9.equals("renderers")) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    if (str9.equals("is_analytics_logging_enabled")) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2072888499:
                    list = emptyList9;
                    if (str9.equals("manual_tracking_urls")) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    list = emptyList9;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    jSONObject8 = zzazc.m17271m(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 1:
                    jSONObject6 = zzazc.m17271m(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 2:
                    z5 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 3:
                    String nextString = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString)) {
                        zzk.zzli();
                        i4 = 6;
                    } else if ("portrait".equalsIgnoreCase(nextString)) {
                        zzk.zzli();
                        i4 = 7;
                    } else {
                        i4 = -1;
                    }
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 4:
                    z7 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 5:
                    i6 = jsonReader.nextInt();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 6:
                    list3 = zzcxn.m19022a(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 7:
                    list2 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\b':
                    jSONObject7 = zzazc.m17271m(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\t':
                    z = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\n':
                    String nextString2 = jsonReader.nextString();
                    i3 = "banner".equals(nextString2) ? 1 : "interstitial".equals(nextString2) ? 2 : "native_express".equals(nextString2) ? 3 : "native".equals(nextString2) ? 4 : "rewarded".equals(nextString2) ? 5 : 0;
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 11:
                    z9 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\f':
                    emptyList8 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\r':
                    str2 = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 14:
                    emptyList7 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 15:
                    str5 = zzazc.m17271m(jsonReader).toString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 16:
                    str8 = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 17:
                    emptyList2 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 18:
                    zzauyVar = zzauy.m16981y(zzazc.m17271m(jsonReader));
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 19:
                    emptyList3 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 20:
                    i5 = jsonReader.nextInt();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 21:
                    z3 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 22:
                    zzcxqVar = new zzcxq(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 24:
                    jSONObject5 = zzazc.m17271m(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 25:
                    z4 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 26:
                    str4 = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 27:
                    emptyList4 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 28:
                    z6 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 29:
                    str6 = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 30:
                    zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case 31:
                    emptyList10 = zzcxn.m19022a(jsonReader);
                    emptyList9 = list;
                    break;
                case ' ':
                    int nextInt = jsonReader.nextInt();
                    i2 = (nextInt == 0 || nextInt == 1) ? nextInt : 0;
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '!':
                    str = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\"':
                    zzatoVar = zzato.m16942y(zzazc.m17272n(jsonReader));
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '#':
                    z2 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '$':
                    str7 = jsonReader.nextString();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '%':
                    emptyList5 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '&':
                    emptyList6 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '\'':
                    emptyList = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case '(':
                    z8 = jsonReader.nextBoolean();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
                case ')':
                    emptyList9 = zzazc.m17260b(jsonReader);
                    emptyList10 = list4;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList10 = list4;
                    emptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.f25243a = emptyList;
        this.f25244b = i3;
        this.f25245c = emptyList2;
        this.f25246d = emptyList3;
        this.f25248f = emptyList4;
        this.f25247e = i2;
        this.f25249g = emptyList5;
        this.f25250h = emptyList6;
        this.f25251i = emptyList7;
        this.f25252j = str;
        this.f25253k = str8;
        this.f25254l = zzatoVar;
        this.f25255m = emptyList8;
        this.f25256n = emptyList9;
        this.f25257o = emptyList10;
        this.f25258p = zzcxqVar;
        this.f25259q = list2;
        this.f25260r = list3;
        this.f25262t = str2;
        this.f25261s = jSONObject5;
        this.f25263u = str3;
        this.f25264v = str4;
        this.f25265w = str5;
        this.f25266x = zzauyVar;
        this.f25267y = str6;
        this.f25268z = jSONObject8;
        this.f25228A = jSONObject7;
        this.f25229B = z;
        this.f25230C = z2;
        this.f25231D = z3;
        this.f25232E = z4;
        this.f25233F = z5;
        this.f25234G = z6;
        this.f25235H = i4;
        this.f25236I = i5;
        this.f25237J = z7;
        this.f25238K = str7;
        this.f25239L = jSONObject6;
        this.f25240M = z8;
        this.f25241N = z9;
        this.f25242O = i6;
    }
}
