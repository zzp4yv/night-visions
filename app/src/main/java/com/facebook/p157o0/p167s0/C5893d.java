package com.facebook.p157o0.p167s0;

import android.os.Bundle;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.C5908v;
import com.facebook.p157o0.p162n0.C5843a;
import com.facebook.p157o0.p167s0.C5894e;
import java.util.List;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;

/* compiled from: RemoteServiceParametersHelper.kt */
/* renamed from: com.facebook.o0.s0.d */
/* loaded from: classes2.dex */
public final class C5893d {

    /* renamed from: a */
    public static final C5893d f15460a = new C5893d();

    /* renamed from: b */
    private static final String f15461b = C5894e.class.getSimpleName();

    private C5893d() {
    }

    /* renamed from: a */
    public static final Bundle m12748a(C5894e.a aVar, String str, List<C5908v> list) {
        C9768m.m32346f(aVar, "eventType");
        C9768m.m32346f(str, "applicationId");
        C9768m.m32346f(list, "appEvents");
        Bundle bundle = new Bundle();
        bundle.putString("event", aVar.toString());
        bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, str);
        if (C5894e.a.CUSTOM_APP_EVENTS == aVar) {
            JSONArray m12749b = f15460a.m12749b(list, str);
            if (m12749b.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", m12749b.toString());
        }
        return bundle;
    }

    /* renamed from: b */
    private final JSONArray m12749b(List<C5908v> list, String str) {
        JSONArray jSONArray = new JSONArray();
        List<C5908v> m38571G0 = C10749c0.m38571G0(list);
        C5843a c5843a = C5843a.f15262a;
        C5843a.m12490d(m38571G0);
        boolean m12750c = m12750c(str);
        for (C5908v c5908v : m38571G0) {
            if (!c5908v.m12839g()) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11575j0(f15461b, C9768m.m32354n("Event with invalid checksum: ", c5908v));
            } else if ((!c5908v.m12840h()) || (c5908v.m12840h() && m12750c)) {
                jSONArray.put(c5908v.m12837e());
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    private final boolean m12750c(String str) {
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5637c0 m11428o = C5639d0.m11428o(str, false);
        if (m11428o != null) {
            return m11428o.m11410n();
        }
        return false;
    }
}
