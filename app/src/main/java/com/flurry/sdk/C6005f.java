package com.flurry.sdk;

import android.content.SharedPreferences;
import com.flurry.sdk.C6035i2;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.f */
/* loaded from: classes2.dex */
public final class C6005f extends C6062l2 {

    /* renamed from: o */
    String f15838o;

    /* renamed from: p */
    boolean f15839p;

    /* renamed from: q */
    AtomicBoolean f15840q;

    C6005f() {
        super("AdvertisingIdProvider", C6035i2.m13111a(C6035i2.b.PROVIDER));
        this.f15840q = new AtomicBoolean(false);
        this.f15838o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f15839p = false;
    }

    /* renamed from: s */
    private static AdvertisingIdClient.Info m13056s() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C5969b0.m12964a());
            return new AdvertisingIdClient.Info(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Exception e2) {
            C5988d1.m13037j("AdvertisingIdProvider", "GOOGLE PLAY SERVICES ERROR: " + e2.getMessage());
            C5988d1.m13037j("AdvertisingIdProvider", "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        } catch (NoClassDefFoundError unused) {
            C5988d1.m13037j("AdvertisingIdProvider", "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        }
    }

    /* renamed from: a */
    public final void m13057a() {
        AdvertisingIdClient.Info m13056s = m13056s();
        if (m13056s != null) {
            this.f15838o = m13056s.getId();
            this.f15839p = !m13056s.isLimitAdTrackingEnabled();
            this.f15840q.set(true);
            C6098p2.m13255d("advertising_id", m13056s.getId());
            boolean isLimitAdTrackingEnabled = m13056s.isLimitAdTrackingEnabled();
            SharedPreferences.Editor edit = C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            edit.putBoolean(String.format(Locale.US, "com.flurry.sdk.%s", "ad_tracking_enabled"), isLimitAdTrackingEnabled);
            edit.apply();
        }
    }
}
