package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONException;

/* compiled from: AuthenticationTokenCache.kt */
/* renamed from: com.facebook.x */
/* loaded from: classes.dex */
public final class C5924x {

    /* renamed from: a */
    public static final a f15603a = new a(null);

    /* renamed from: b */
    private final SharedPreferences f15604b;

    /* compiled from: AuthenticationTokenCache.kt */
    /* renamed from: com.facebook.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public C5924x(SharedPreferences sharedPreferences) {
        C9768m.m32346f(sharedPreferences, "sharedPreferences");
        this.f15604b = sharedPreferences;
    }

    /* renamed from: a */
    public final void m12938a() {
        this.f15604b.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    /* renamed from: b */
    public final void m12939b(AuthenticationToken authenticationToken) {
        C9768m.m32346f(authenticationToken, "authenticationToken");
        try {
            this.f15604b.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m11110b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5924x() {
        /*
            r3 = this;
            com.facebook.a0 r0 = com.facebook.C5608a0.f14199a
            android.content.Context r0 = com.facebook.C5608a0.m11284c()
            java.lang.String r1 = "com.facebook.AuthenticationTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C9768m.m32345e(r0, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C5924x.<init>():void");
    }
}
