package com.facebook;

import android.content.Intent;
import com.facebook.internal.C5663p0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import p024c.p076q.p077a.C0997a;

/* compiled from: ProfileManager.kt */
/* renamed from: com.facebook.i0 */
/* loaded from: classes.dex */
public final class C5630i0 {

    /* renamed from: a */
    public static final a f14305a = new a(null);

    /* renamed from: b */
    private static volatile C5630i0 f14306b;

    /* renamed from: c */
    private final C0997a f14307c;

    /* renamed from: d */
    private final C5628h0 f14308d;

    /* renamed from: e */
    private Profile f14309e;

    /* compiled from: ProfileManager.kt */
    /* renamed from: com.facebook.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final synchronized C5630i0 m11370a() {
            C5630i0 c5630i0;
            if (C5630i0.f14306b == null) {
                C5608a0 c5608a0 = C5608a0.f14199a;
                C0997a m6341b = C0997a.m6341b(C5608a0.m11284c());
                C9768m.m32345e(m6341b, "getInstance(applicationContext)");
                C5630i0.f14306b = new C5630i0(m6341b, new C5628h0());
            }
            c5630i0 = C5630i0.f14306b;
            if (c5630i0 == null) {
                C9768m.m32363w("instance");
                throw null;
            }
            return c5630i0;
        }
    }

    public C5630i0(C0997a c0997a, C5628h0 c5628h0) {
        C9768m.m32346f(c0997a, "localBroadcastManager");
        C9768m.m32346f(c5628h0, "profileCache");
        this.f14307c = c0997a;
        this.f14308d = c5628h0;
    }

    /* renamed from: e */
    private final void m11365e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f14307c.m6344d(intent);
    }

    /* renamed from: g */
    private final void m11366g(Profile profile, boolean z) {
        Profile profile2 = this.f14309e;
        this.f14309e = profile;
        if (z) {
            if (profile != null) {
                this.f14308d.m11362c(profile);
            } else {
                this.f14308d.m11360a();
            }
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11560c(profile2, profile)) {
            return;
        }
        m11365e(profile2, profile);
    }

    /* renamed from: c */
    public final Profile m11367c() {
        return this.f14309e;
    }

    /* renamed from: d */
    public final boolean m11368d() {
        Profile m11361b = this.f14308d.m11361b();
        if (m11361b == null) {
            return false;
        }
        m11366g(m11361b, false);
        return true;
    }

    /* renamed from: f */
    public final void m11369f(Profile profile) {
        m11366g(profile, true);
    }
}
