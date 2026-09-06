package com.flurry.sdk;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: com.flurry.sdk.p2 */
/* loaded from: classes2.dex */
public final class C6098p2 {
    /* renamed from: a */
    public static void m13252a(String str) {
        C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit().remove(str).apply();
    }

    /* renamed from: b */
    public static void m13253b(String str, int i2) {
        SharedPreferences.Editor edit = C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putInt(String.format(Locale.US, "com.flurry.sdk.%s", str), i2);
        edit.apply();
    }

    /* renamed from: c */
    public static void m13254c(String str, long j2) {
        SharedPreferences.Editor edit = C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putLong(String.format(Locale.US, "com.flurry.sdk.%s", str), j2);
        edit.apply();
    }

    /* renamed from: d */
    public static void m13255d(String str, String str2) {
        SharedPreferences.Editor edit = C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putString(String.format(Locale.US, "com.flurry.sdk.%s", str), str2);
        edit.apply();
    }

    /* renamed from: e */
    public static int m13256e(String str, int i2) {
        return C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getInt(String.format(Locale.US, "com.flurry.sdk.%s", str), i2);
    }

    /* renamed from: f */
    public static long m13257f(String str, long j2) {
        return C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong(String.format(Locale.US, "com.flurry.sdk.%s", str), j2);
    }

    /* renamed from: g */
    public static String m13258g(String str, String str2) {
        return C5969b0.m12964a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getString(String.format(Locale.US, "com.flurry.sdk.%s", str), str2);
    }
}
