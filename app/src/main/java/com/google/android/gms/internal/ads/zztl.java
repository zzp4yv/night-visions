package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zztl {

    /* renamed from: a */
    private final u30 f27086a;

    /* renamed from: b */
    private final boolean f27087b;

    /* renamed from: c */
    private final long f27088c;

    /* renamed from: d */
    private final long f27089d;

    /* renamed from: e */
    private long f27090e;

    /* renamed from: f */
    private long f27091f;

    /* renamed from: g */
    private long f27092g;

    /* renamed from: h */
    private boolean f27093h;

    /* renamed from: i */
    private long f27094i;

    /* renamed from: j */
    private long f27095j;

    /* renamed from: k */
    private long f27096k;

    public zztl() {
        this(-1.0d);
    }

    /* renamed from: d */
    private final boolean m20576d(long j2, long j3) {
        return Math.abs((j3 - this.f27094i) - (j2 - this.f27095j)) > 20000000;
    }

    /* renamed from: a */
    public final void m20577a() {
        if (this.f27087b) {
            this.f27086a.m15920c();
        }
    }

    /* renamed from: b */
    public final void m20578b() {
        this.f27093h = false;
        if (this.f27087b) {
            this.f27086a.m15919b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m20579c(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f27093h
            if (r2 == 0) goto L42
            long r2 = r11.f27090e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r11.f27096k
            r4 = 1
            long r2 = r2 + r4
            r11.f27096k = r2
            long r2 = r11.f27092g
            r11.f27091f = r2
        L19:
            long r2 = r11.f27096k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r11.f27095j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f27091f
            long r2 = r2 + r4
            boolean r4 = r11.m20576d(r2, r14)
            if (r4 == 0) goto L33
            r11.f27093h = r6
            goto L42
        L33:
            long r4 = r11.f27094i
            long r4 = r4 + r2
            long r6 = r11.f27095j
            long r4 = r4 - r6
            goto L44
        L3a:
            boolean r2 = r11.m20576d(r0, r14)
            if (r2 == 0) goto L42
            r11.f27093h = r6
        L42:
            r4 = r14
            r2 = r0
        L44:
            boolean r6 = r11.f27093h
            r7 = 0
            if (r6 != 0) goto L53
            r11.f27095j = r0
            r11.f27094i = r14
            r11.f27096k = r7
            r14 = 1
            r11.f27093h = r14
        L53:
            r11.f27090e = r12
            r11.f27092g = r2
            com.google.android.gms.internal.ads.u30 r12 = r11.f27086a
            if (r12 == 0) goto L86
            long r12 = r12.f20609g
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L62
            goto L86
        L62:
            com.google.android.gms.internal.ads.u30 r12 = r11.f27086a
            long r12 = r12.f20609g
            long r14 = r11.f27088c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L75
            long r14 = r12 - r14
            goto L79
        L75:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L79:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L81
            goto L82
        L81:
            r12 = r14
        L82:
            long r14 = r11.f27089d
            long r12 = r12 - r14
            return r12
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.m20579c(long, long):long");
    }

    public zztl(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private zztl(double d2) {
        boolean z = d2 != -1.0d;
        this.f27087b = z;
        if (z) {
            this.f27086a = u30.m15918a();
            long j2 = (long) (1.0E9d / d2);
            this.f27088c = j2;
            this.f27089d = (j2 * 80) / 100;
            return;
        }
        this.f27086a = null;
        this.f27088c = -1L;
        this.f27089d = -1L;
    }
}
