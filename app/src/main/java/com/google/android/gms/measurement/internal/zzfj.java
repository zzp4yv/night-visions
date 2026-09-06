package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfj {

    /* renamed from: a */
    private final String f29239a;

    /* renamed from: b */
    private final String f29240b;

    /* renamed from: c */
    private boolean f29241c;

    /* renamed from: d */
    private String f29242d;

    /* renamed from: e */
    private final /* synthetic */ C7774r3 f29243e;

    public zzfj(C7774r3 c7774r3, String str, String str2) {
        this.f29243e = c7774r3;
        Preconditions.m14368g(str);
        this.f29239a = str;
        this.f29240b = null;
    }

    /* renamed from: a */
    public final String m23159a() {
        SharedPreferences m22813N;
        if (!this.f29241c) {
            this.f29241c = true;
            m22813N = this.f29243e.m22813N();
            this.f29242d = m22813N.getString(this.f29239a, null);
        }
        return this.f29242d;
    }

    /* renamed from: b */
    public final void m23160b(String str) {
        SharedPreferences m22813N;
        if (zzkk.m23514t0(str, this.f29242d)) {
            return;
        }
        m22813N = this.f29243e.m22813N();
        SharedPreferences.Editor edit = m22813N.edit();
        edit.putString(this.f29239a, str);
        edit.apply();
        this.f29242d = str;
    }
}
