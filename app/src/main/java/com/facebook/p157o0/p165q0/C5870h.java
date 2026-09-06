package com.facebook.p157o0.p165q0;

import android.content.Context;
import com.facebook.EnumC5626g0;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5664q;
import com.facebook.p157o0.C5780a0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsLoggerUtility.kt */
/* renamed from: com.facebook.o0.q0.h */
/* loaded from: classes2.dex */
public final class C5870h {

    /* renamed from: a */
    public static final C5870h f15371a = new C5870h();

    /* renamed from: b */
    private static final Map<a, String> f15372b;

    /* compiled from: AppEventsLoggerUtility.kt */
    /* renamed from: com.facebook.o0.q0.h$a */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    static {
        HashMap m38799k;
        m38799k = C10777q0.m38799k(C10740s.m38547a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C10740s.m38547a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f15372b = m38799k;
    }

    private C5870h() {
    }

    /* renamed from: a */
    public static final JSONObject m12631a(a aVar, C5664q c5664q, String str, boolean z, Context context) throws JSONException {
        C9768m.m32346f(aVar, "activityType");
        C9768m.m32346f(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f15372b.get(aVar));
        String m12171e = C5780a0.f14908a.m12171e();
        if (m12171e != null) {
            jSONObject.put("app_user_id", m12171e);
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11529C0(jSONObject, c5664q, str, z, context);
        try {
            C5663p0.m11531D0(jSONObject, context);
        } catch (Exception e2) {
            C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        C5663p0 c5663p02 = C5663p0.f14478a;
        JSONObject m11525A = C5663p0.m11525A();
        if (m11525A != null) {
            Iterator<String> keys = m11525A.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, m11525A.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
