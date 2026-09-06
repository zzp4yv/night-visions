package com.facebook.p157o0.p165q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C5608a0;
import kotlin.jvm.internal.C9756g;

/* compiled from: SourceApplicationInfo.kt */
/* renamed from: com.facebook.o0.q0.o */
/* loaded from: classes2.dex */
public final class C5877o {

    /* renamed from: a */
    public static final a f15403a = new a(null);

    /* renamed from: b */
    private final String f15404b;

    /* renamed from: c */
    private final boolean f15405c;

    /* compiled from: SourceApplicationInfo.kt */
    /* renamed from: com.facebook.o0.q0.o$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final void m12671a() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        /* renamed from: b */
        public final C5877o m12672b() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c());
            C9756g c9756g = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new C5877o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), c9756g);
            }
            return null;
        }
    }

    private C5877o(String str, boolean z) {
        this.f15404b = str;
        this.f15405c = z;
    }

    public /* synthetic */ C5877o(String str, boolean z, C9756g c9756g) {
        this(str, z);
    }

    /* renamed from: a */
    public final void m12670a() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f15404b);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f15405c);
        edit.apply();
    }

    public String toString() {
        String str = this.f15405c ? "Applink" : "Unclassified";
        if (this.f15404b == null) {
            return str;
        }
        return str + '(' + ((Object) this.f15404b) + ')';
    }
}
