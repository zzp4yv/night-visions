package com.facebook.p157o0.p164p0;

import android.os.Build;
import android.os.Bundle;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.C5608a0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MACARuleMatchingManager.kt */
/* renamed from: com.facebook.o0.p0.b */
/* loaded from: classes2.dex */
public final class C5860b {

    /* renamed from: b */
    private static boolean f15340b;

    /* renamed from: c */
    private static JSONArray f15341c;

    /* renamed from: a */
    public static final C5860b f15339a = new C5860b();

    /* renamed from: d */
    private static String[] f15342d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private C5860b() {
    }

    /* renamed from: a */
    public static final void m12583a() {
        f15339a.m12589g();
        if (f15341c != null) {
            f15340b = true;
        }
    }

    /* renamed from: b */
    public static final void m12584b(Bundle bundle, String str) {
        String language;
        String country;
        C9768m.m32346f(bundle, "params");
        C9768m.m32346f(str, "event");
        bundle.putString("event", str);
        StringBuilder sb = new StringBuilder();
        C5663p0 c5663p0 = C5663p0.f14478a;
        Locale m11607G = c5663p0.m11607G();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (m11607G == null || (language = m11607G.getLanguage()) == null) {
            language = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(language);
        sb.append('_');
        Locale m11607G2 = c5663p0.m11607G();
        if (m11607G2 == null || (country = m11607G2.getCountry()) == null) {
            country = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(country);
        bundle.putString("_locale", sb.toString());
        String m11608N = c5663p0.m11608N();
        if (m11608N == null) {
            m11608N = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("_appVersion", m11608N);
        bundle.putString("_deviceOS", "ANDROID");
        bundle.putString("_platform", "mobile");
        String str3 = Build.MODEL;
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("_deviceModel", str3);
        C5608a0 c5608a0 = C5608a0.f14199a;
        bundle.putString("_nativeAppID", C5608a0.m11285d());
        String m11608N2 = c5663p0.m11608N();
        if (m11608N2 != null) {
            str2 = m11608N2;
        }
        bundle.putString("_nativeAppShortVersion", str2);
        bundle.putString("_timezone", c5663p0.m11606B());
        bundle.putString("_carrier", c5663p0.m11610w());
        bundle.putString("_deviceOSTypeName", "ANDROID");
        bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
        bundle.putLong("_remainingDiskGB", c5663p0.m11609u());
    }

    /* renamed from: c */
    public static final String m12585c(JSONObject jSONObject) {
        C9768m.m32346f(jSONObject, "logic");
        Iterator<String> keys = jSONObject.keys();
        if (keys.hasNext()) {
            return keys.next();
        }
        return null;
    }

    /* renamed from: d */
    public static final String m12586d(Bundle bundle) {
        String optString;
        JSONArray jSONArray = f15341c;
        if (jSONArray == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
        if (valueOf != null && valueOf.intValue() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        JSONArray jSONArray2 = f15341c;
        if (jSONArray2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int length = jSONArray2.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                String optString2 = jSONArray2.optString(i2);
                if (optString2 != null) {
                    JSONObject jSONObject = new JSONObject(optString2);
                    long optLong = jSONObject.optLong(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                    if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && m12588f(optString, bundle)) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        String jSONArray3 = new JSONArray((Collection) arrayList).toString();
        C9768m.m32345e(jSONArray3, "JSONArray(res).toString()");
        return jSONArray3;
    }

    /* renamed from: e */
    public static final ArrayList<String> m12587e(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int i2 = 0;
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArray.get(i2).toString());
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final boolean m12588f(String str, Bundle bundle) {
        JSONObject jSONObject;
        String m12585c;
        int length;
        if (str == null || bundle == null || (m12585c = m12585c((jSONObject = new JSONObject(str)))) == null) {
            return false;
        }
        Object obj = jSONObject.get(m12585c);
        int hashCode = m12585c.hashCode();
        if (hashCode != 3555) {
            if (hashCode != 96727) {
                if (hashCode == 109267 && m12585c.equals("not")) {
                    return !m12588f(obj.toString(), bundle);
                }
            } else if (m12585c.equals("and")) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray == null) {
                    return false;
                }
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (!m12588f(jSONArray.get(i2).toString(), bundle)) {
                            return false;
                        }
                        if (i3 >= length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return true;
            }
        } else if (m12585c.equals("or")) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (m12588f(jSONArray2.get(i4).toString(), bundle)) {
                        return true;
                    }
                    if (i5 >= length) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return false;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null) {
            return false;
        }
        return m12592j(m12585c, jSONObject2, bundle);
    }

    /* renamed from: g */
    private final void m12589g() {
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        C5637c0 m11428o = C5639d0.m11428o(C5608a0.m11285d(), false);
        if (m11428o == null) {
            return;
        }
        f15341c = m11428o.m11402f();
    }

    /* renamed from: h */
    public static final void m12590h(Bundle bundle, String str) {
        C9768m.m32346f(str, "event");
        if (!f15340b || bundle == null) {
            return;
        }
        try {
            m12584b(bundle, str);
            bundle.putString("_audiencePropertyIds", m12586d(bundle));
            bundle.putString("cs_maca", "1");
            m12591i(bundle);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final void m12591i(Bundle bundle) {
        C9768m.m32346f(bundle, "params");
        String[] strArr = f15342d;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            bundle.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ad  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m12592j(java.lang.String r8, org.json.JSONObject r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p164p0.C5860b.m12592j(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
