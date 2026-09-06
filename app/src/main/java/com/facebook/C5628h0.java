package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProfileCache.kt */
/* renamed from: com.facebook.h0 */
/* loaded from: classes.dex */
public final class C5628h0 {

    /* renamed from: a */
    public static final a f14302a = new a(null);

    /* renamed from: b */
    private final SharedPreferences f14303b;

    /* compiled from: ProfileCache.kt */
    /* renamed from: com.facebook.h0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public C5628h0() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        SharedPreferences sharedPreferences = C5608a0.m11284c().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C9768m.m32345e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f14303b = sharedPreferences;
    }

    /* renamed from: a */
    public final void m11360a() {
        this.f14303b.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* renamed from: b */
    public final Profile m11361b() {
        String string = this.f14303b.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m11362c(Profile profile) {
        C9768m.m32346f(profile, "profile");
        JSONObject m11253b = profile.m11253b();
        if (m11253b != null) {
            this.f14303b.edit().putString("com.facebook.ProfileManager.CachedProfile", m11253b.toString()).apply();
        }
    }
}
