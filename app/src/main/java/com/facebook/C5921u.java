package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.C10742u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessTokenCache.kt */
/* renamed from: com.facebook.u */
/* loaded from: classes.dex */
public final class C5921u {

    /* renamed from: a */
    public static final a f15569a = new a(null);

    /* renamed from: b */
    private final SharedPreferences f15570b;

    /* renamed from: c */
    private final b f15571c;

    /* renamed from: d */
    private C5624f0 f15572d;

    /* compiled from: AccessTokenCache.kt */
    /* renamed from: com.facebook.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: AccessTokenCache.kt */
    /* renamed from: com.facebook.u$b */
    public static final class b {
        /* renamed from: a */
        public final C5624f0 m12896a() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            return new C5624f0(C5608a0.m11284c(), null, 2, null);
        }
    }

    public C5921u(SharedPreferences sharedPreferences, b bVar) {
        C9768m.m32346f(sharedPreferences, "sharedPreferences");
        C9768m.m32346f(bVar, "tokenCachingStrategyFactory");
        this.f15570b = sharedPreferences;
        this.f15571c = bVar;
    }

    /* renamed from: b */
    private final AccessToken m12888b() {
        String string = this.f15570b.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.f14054f.m11102b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final AccessToken m12889c() {
        Bundle m11351c = m12890d().m11351c();
        if (m11351c == null || !C5624f0.f14287a.m11358g(m11351c)) {
            return null;
        }
        return AccessToken.f14054f.m11103c(m11351c);
    }

    /* renamed from: d */
    private final C5624f0 m12890d() {
        if (this.f15572d == null) {
            synchronized (this) {
                if (this.f15572d == null) {
                    this.f15572d = this.f15571c.m12896a();
                }
                C10742u c10742u = C10742u.f41439a;
            }
        }
        C5624f0 c5624f0 = this.f15572d;
        if (c5624f0 != null) {
            return c5624f0;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: e */
    private final boolean m12891e() {
        return this.f15570b.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private final boolean m12892h() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        return C5608a0.m11305x();
    }

    /* renamed from: a */
    public final void m12893a() {
        this.f15570b.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m12892h()) {
            m12890d().m11350a();
        }
    }

    /* renamed from: f */
    public final AccessToken m12894f() {
        if (m12891e()) {
            return m12888b();
        }
        if (!m12892h()) {
            return null;
        }
        AccessToken m12889c = m12889c();
        if (m12889c == null) {
            return m12889c;
        }
        m12895g(m12889c);
        m12890d().m11350a();
        return m12889c;
    }

    /* renamed from: g */
    public final void m12895g(AccessToken accessToken) {
        C9768m.m32346f(accessToken, "accessToken");
        try {
            this.f15570b.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m11096o().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5921u() {
        /*
            r3 = this;
            com.facebook.a0 r0 = com.facebook.C5608a0.f14199a
            android.content.Context r0 = com.facebook.C5608a0.m11284c()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            com.facebook.u$b r1 = new com.facebook.u$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C5921u.<init>():void");
    }
}
