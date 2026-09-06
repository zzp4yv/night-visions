package com.facebook.p157o0.p164p0;

import com.facebook.C5608a0;
import com.facebook.internal.C5635b0;
import com.facebook.p157o0.p166r0.C5886h;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: IntegrityManager.kt */
/* renamed from: com.facebook.o0.p0.a */
/* loaded from: classes2.dex */
public final class C5859a {

    /* renamed from: a */
    public static final C5859a f15336a = new C5859a();

    /* renamed from: b */
    private static boolean f15337b;

    /* renamed from: c */
    private static boolean f15338c;

    private C5859a() {
    }

    /* renamed from: a */
    public static final void m12579a() {
        f15337b = true;
        C5635b0 c5635b0 = C5635b0.f14356a;
        C5608a0 c5608a0 = C5608a0.f14199a;
        f15338c = C5635b0.m11385b("FBSDKFeatureIntegritySample", C5608a0.m11285d(), false);
    }

    /* renamed from: b */
    private final String m12580b(String str) {
        String str2;
        float[] fArr = new float[30];
        for (int i2 = 0; i2 < 30; i2++) {
            fArr[i2] = 0.0f;
        }
        C5886h c5886h = C5886h.f15431a;
        String[] m12699q = C5886h.m12699q(C5886h.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
        return (m12699q == null || (str2 = m12699q[0]) == null) ? "none" : str2;
    }

    /* renamed from: c */
    public static final void m12581c(Map<String, String> map) {
        C9768m.m32346f(map, "parameters");
        if (!f15337b || map.isEmpty()) {
            return;
        }
        try {
            List<String> m38569E0 = C10749c0.m38569E0(map.keySet());
            JSONObject jSONObject = new JSONObject();
            for (String str : m38569E0) {
                String str2 = map.get(str);
                if (str2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                String str3 = str2;
                C5859a c5859a = f15336a;
                if (c5859a.m12582d(str) || c5859a.m12582d(str3)) {
                    map.remove(str);
                    if (!f15338c) {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    jSONObject.put(str, str3);
                }
            }
            if (jSONObject.length() != 0) {
                String jSONObject2 = jSONObject.toString();
                C9768m.m32345e(jSONObject2, "restrictiveParamJson.toString()");
                map.put("_onDeviceParams", jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private final boolean m12582d(String str) {
        return !C9768m.m32341a("none", m12580b(str));
    }
}
