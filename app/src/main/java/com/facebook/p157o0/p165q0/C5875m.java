package com.facebook.p157o0.p165q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C5608a0;
import java.util.UUID;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: SessionInfo.kt */
/* renamed from: com.facebook.o0.q0.m */
/* loaded from: classes2.dex */
public final class C5875m {

    /* renamed from: a */
    public static final a f15393a = new a(null);

    /* renamed from: b */
    private final Long f15394b;

    /* renamed from: c */
    private Long f15395c;

    /* renamed from: d */
    private UUID f15396d;

    /* renamed from: e */
    private int f15397e;

    /* renamed from: f */
    private Long f15398f;

    /* renamed from: g */
    private C5877o f15399g;

    /* compiled from: SessionInfo.kt */
    /* renamed from: com.facebook.o0.q0.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final void m12663a() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            C5877o.f15403a.m12671a();
        }

        /* renamed from: b */
        public final C5875m m12664b() {
            C5608a0 c5608a0 = C5608a0.f14199a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c());
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j2 == 0 || j3 == 0 || string == null) {
                return null;
            }
            C5875m c5875m = new C5875m(Long.valueOf(j2), Long.valueOf(j3), null, 4, null);
            c5875m.f15397e = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            c5875m.m12661l(C5877o.f15403a.m12672b());
            c5875m.m12658i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            C9768m.m32345e(fromString, "fromString(sessionIDStr)");
            c5875m.m12659j(fromString);
            return c5875m;
        }
    }

    public C5875m(Long l, Long l2, UUID uuid) {
        C9768m.m32346f(uuid, "sessionId");
        this.f15394b = l;
        this.f15395c = l2;
        this.f15396d = uuid;
    }

    /* renamed from: b */
    public final Long m12651b() {
        Long l = this.f15398f;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    /* renamed from: c */
    public final int m12652c() {
        return this.f15397e;
    }

    /* renamed from: d */
    public final UUID m12653d() {
        return this.f15396d;
    }

    /* renamed from: e */
    public final Long m12654e() {
        return this.f15395c;
    }

    /* renamed from: f */
    public final long m12655f() {
        Long l;
        if (this.f15394b == null || (l = this.f15395c) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.f15394b.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public final C5877o m12656g() {
        return this.f15399g;
    }

    /* renamed from: h */
    public final void m12657h() {
        this.f15397e++;
    }

    /* renamed from: i */
    public final void m12658i(Long l) {
        this.f15398f = l;
    }

    /* renamed from: j */
    public final void m12659j(UUID uuid) {
        C9768m.m32346f(uuid, "<set-?>");
        this.f15396d = uuid;
    }

    /* renamed from: k */
    public final void m12660k(Long l) {
        this.f15395c = l;
    }

    /* renamed from: l */
    public final void m12661l(C5877o c5877o) {
        this.f15399g = c5877o;
    }

    /* renamed from: m */
    public final void m12662m() {
        C5608a0 c5608a0 = C5608a0.f14199a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c()).edit();
        Long l = this.f15394b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l == null ? 0L : l.longValue());
        Long l2 = this.f15395c;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f15397e);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f15396d.toString());
        edit.apply();
        C5877o c5877o = this.f15399g;
        if (c5877o == null || c5877o == null) {
            return;
        }
        c5877o.m12670a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C5875m(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.C9756g r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.C9768m.m32345e(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p165q0.C5875m.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.a0.d.g):void");
    }
}
