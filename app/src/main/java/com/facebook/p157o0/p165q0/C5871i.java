package com.facebook.p157o0.p165q0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C5608a0;
import com.facebook.internal.C5635b0;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.p157o0.C5780a0;
import com.facebook.p157o0.C5792g0;
import com.facebook.p157o0.p163o0.C5853i;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutomaticAnalyticsLogger.kt */
/* renamed from: com.facebook.o0.q0.i */
/* loaded from: classes2.dex */
public final class C5871i {

    /* renamed from: a */
    public static final C5871i f15376a = new C5871i();

    /* renamed from: b */
    private static final String f15377b = C5871i.class.getCanonicalName();

    /* renamed from: c */
    private static final C5792g0 f15378c;

    /* compiled from: AutomaticAnalyticsLogger.kt */
    /* renamed from: com.facebook.o0.q0.i$a */
    private static final class a {

        /* renamed from: a */
        private BigDecimal f15379a;

        /* renamed from: b */
        private Currency f15380b;

        /* renamed from: c */
        private Bundle f15381c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            C9768m.m32346f(bigDecimal, "purchaseAmount");
            C9768m.m32346f(currency, "currency");
            C9768m.m32346f(bundle, "param");
            this.f15379a = bigDecimal;
            this.f15380b = currency;
            this.f15381c = bundle;
        }

        /* renamed from: a */
        public final Currency m12639a() {
            return this.f15380b;
        }

        /* renamed from: b */
        public final Bundle m12640b() {
            return this.f15381c;
        }

        /* renamed from: c */
        public final BigDecimal m12641c() {
            return this.f15379a;
        }
    }

    static {
        C5608a0 c5608a0 = C5608a0.f14199a;
        f15378c = new C5792g0(C5608a0.m11284c());
    }

    private C5871i() {
    }

    /* renamed from: a */
    private final a m12633a(String str, String str2) {
        return m12634b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private final a m12634b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (C9768m.m32341a(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                C9768m.m32345e(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            double d2 = jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d2);
            BigDecimal bigDecimal = new BigDecimal(d2 / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            C9768m.m32345e(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e2) {
            Log.e(f15377b, "Error parsing in-app subscription data.", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static final boolean m12635c() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        String m11285d = C5608a0.m11285d();
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5637c0 m11417c = C5639d0.m11417c(m11285d);
        return m11417c != null && C5608a0.m11288g() && m11417c.m11401e();
    }

    /* renamed from: d */
    public static final void m12636d() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        Context m11284c = C5608a0.m11284c();
        String m11285d = C5608a0.m11285d();
        if (C5608a0.m11288g()) {
            if (m11284c instanceof Application) {
                C5780a0.f14908a.m12168b((Application) m11284c, m11285d);
            } else {
                Log.w(f15377b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    /* renamed from: e */
    public static final void m12637e(String str, long j2) {
        C5608a0 c5608a0 = C5608a0.f14199a;
        Context m11284c = C5608a0.m11284c();
        String m11285d = C5608a0.m11285d();
        C5639d0 c5639d0 = C5639d0.f14392a;
        C5637c0 m11428o = C5639d0.m11428o(m11285d, false);
        if (m11428o == null || !m11428o.m11397a() || j2 <= 0) {
            return;
        }
        C5792g0 c5792g0 = new C5792g0(m11284c);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        c5792g0.m12241c("fb_aa_time_spent_on_view", j2, bundle);
    }

    /* renamed from: f */
    public static final void m12638f(String str, String str2, boolean z) {
        a m12633a;
        C9768m.m32346f(str, "purchase");
        C9768m.m32346f(str2, "skuDetails");
        C5871i c5871i = f15376a;
        if (m12635c() && (m12633a = c5871i.m12633a(str, str2)) != null) {
            boolean z2 = false;
            if (z) {
                C5635b0 c5635b0 = C5635b0.f14356a;
                C5608a0 c5608a0 = C5608a0.f14199a;
                if (C5635b0.m11385b("app_events_if_auto_log_subs", C5608a0.m11285d(), false)) {
                    z2 = true;
                }
            }
            if (z2) {
                f15378c.m12247i(C5853i.f15313a.m12556m(str2) ? "StartTrial" : "Subscribe", m12633a.m12641c(), m12633a.m12639a(), m12633a.m12640b());
            } else {
                f15378c.m12248j(m12633a.m12641c(), m12633a.m12639a(), m12633a.m12640b());
            }
        }
    }
}
