package io.sentry;

import io.sentry.util.C9613q;
import java.security.SecureRandom;

/* compiled from: TracesSampler.java */
/* renamed from: io.sentry.p5 */
/* loaded from: classes2.dex */
final class C9502p5 {

    /* renamed from: a */
    private static final Double f36567a = Double.valueOf(1.0d);

    /* renamed from: b */
    private final C9647x4 f36568b;

    /* renamed from: c */
    private final SecureRandom f36569c;

    public C9502p5(C9647x4 c9647x4) {
        this((C9647x4) C9613q.m31802c(c9647x4, "options are required"), new SecureRandom());
    }

    /* renamed from: b */
    private boolean m31175b(Double d2) {
        return d2.doubleValue() >= this.f36569c.nextDouble();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    io.sentry.C9541q5 m31176a(io.sentry.C9546r3 r8) {
        /*
            r7 = this;
            io.sentry.r5 r0 = r8.m31563a()
            io.sentry.q5 r0 = r0.m30799g()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            io.sentry.x4 r0 = r7.f36568b
            io.sentry.x4$d r0 = r0.getProfilesSampler()
            r1 = 0
            if (r0 == 0) goto L2d
            io.sentry.x4 r0 = r7.f36568b     // Catch: java.lang.Throwable -> L1f
            io.sentry.x4$d r0 = r0.getProfilesSampler()     // Catch: java.lang.Throwable -> L1f
            java.lang.Double r0 = r0.m31946a(r8)     // Catch: java.lang.Throwable -> L1f
            goto L2e
        L1f:
            r0 = move-exception
            io.sentry.x4 r2 = r7.f36568b
            io.sentry.w1 r2 = r2.getLogger()
            io.sentry.s4 r3 = io.sentry.EnumC9554s4.ERROR
            java.lang.String r4 = "Error in the 'ProfilesSamplerCallback' callback."
            r2.mo30213b(r3, r4, r0)
        L2d:
            r0 = r1
        L2e:
            if (r0 != 0) goto L36
            io.sentry.x4 r0 = r7.f36568b
            java.lang.Double r0 = r0.getProfilesSampleRate()
        L36:
            if (r0 == 0) goto L40
            boolean r2 = r7.m31175b(r0)
            if (r2 == 0) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            io.sentry.x4 r3 = r7.f36568b
            io.sentry.x4$g r3 = r3.getTracesSampler()
            if (r3 == 0) goto L77
            io.sentry.x4 r3 = r7.f36568b     // Catch: java.lang.Throwable -> L58
            io.sentry.x4$g r3 = r3.getTracesSampler()     // Catch: java.lang.Throwable -> L58
            java.lang.Double r3 = r3.m31951a(r8)     // Catch: java.lang.Throwable -> L58
            goto L67
        L58:
            r3 = move-exception
            io.sentry.x4 r4 = r7.f36568b
            io.sentry.w1 r4 = r4.getLogger()
            io.sentry.s4 r5 = io.sentry.EnumC9554s4.ERROR
            java.lang.String r6 = "Error in the 'TracesSamplerCallback' callback."
            r4.mo30213b(r5, r6, r3)
            r3 = r1
        L67:
            if (r3 == 0) goto L77
            io.sentry.q5 r8 = new io.sentry.q5
            boolean r1 = r7.m31175b(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.<init>(r1, r3, r2, r0)
            return r8
        L77:
            io.sentry.r5 r8 = r8.m31563a()
            io.sentry.q5 r8 = r8.m31569u()
            if (r8 == 0) goto L82
            return r8
        L82:
            io.sentry.x4 r8 = r7.f36568b
            java.lang.Double r8 = r8.getTracesSampleRate()
            io.sentry.x4 r3 = r7.f36568b
            java.lang.Boolean r3 = r3.getEnableTracing()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L99
            java.lang.Double r3 = io.sentry.C9502p5.f36567a
            goto L9a
        L99:
            r3 = r1
        L9a:
            if (r8 != 0) goto L9d
            r8 = r3
        L9d:
            if (r8 == 0) goto Lad
            io.sentry.q5 r1 = new io.sentry.q5
            boolean r3 = r7.m31175b(r8)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r3, r8, r2, r0)
            return r1
        Lad:
            io.sentry.q5 r8 = new io.sentry.q5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.<init>(r0, r1, r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C9502p5.m31176a(io.sentry.r3):io.sentry.q5");
    }

    C9502p5(C9647x4 c9647x4, SecureRandom secureRandom) {
        this.f36568b = c9647x4;
        this.f36569c = secureRandom;
    }
}
