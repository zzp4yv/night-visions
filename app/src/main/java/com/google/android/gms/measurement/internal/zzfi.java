package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfi {

    /* renamed from: a */
    private final String f29234a;

    /* renamed from: b */
    private final boolean f29235b;

    /* renamed from: c */
    private boolean f29236c;

    /* renamed from: d */
    private boolean f29237d;

    /* renamed from: e */
    private final /* synthetic */ C7774r3 f29238e;

    public zzfi(C7774r3 c7774r3, String str, boolean z) {
        this.f29238e = c7774r3;
        Preconditions.m14368g(str);
        this.f29234a = str;
        this.f29235b = z;
    }

    /* renamed from: a */
    public final void m23157a(boolean z) {
        SharedPreferences m22813N;
        m22813N = this.f29238e.m22813N();
        SharedPreferences.Editor edit = m22813N.edit();
        edit.putBoolean(this.f29234a, z);
        edit.apply();
        this.f29237d = z;
    }

    /* renamed from: b */
    public final boolean m23158b() {
        SharedPreferences m22813N;
        if (!this.f29236c) {
            this.f29236c = true;
            m22813N = this.f29238e.m22813N();
            this.f29237d = m22813N.getBoolean(this.f29234a, this.f29235b);
        }
        return this.f29237d;
    }
}
