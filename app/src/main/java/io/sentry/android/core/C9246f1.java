package io.sentry.android.core;

import io.sentry.C9403f5;
import io.sentry.C9473l4;
import io.sentry.C9484n1;
import io.sentry.InterfaceC9463k1;
import io.sentry.InterfaceC9626v2;
import io.sentry.protocol.C9516h;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9528t;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9613q;
import java.util.List;
import java.util.Map;

/* compiled from: PerformanceAndroidEventProcessor.java */
/* renamed from: io.sentry.android.core.f1 */
/* loaded from: classes2.dex */
final class C9246f1 implements InterfaceC9463k1 {

    /* renamed from: f */
    private boolean f35902f = false;

    /* renamed from: g */
    private final C9245f0 f35903g;

    /* renamed from: h */
    private final SentryAndroidOptions f35904h;

    C9246f1(SentryAndroidOptions sentryAndroidOptions, C9245f0 c9245f0) {
        this.f35904h = (SentryAndroidOptions) C9613q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f35903g = (C9245f0) C9613q.m31802c(c9245f0, "ActivityFramesTracker is required");
    }

    /* renamed from: a */
    private boolean m30200a(List<C9528t> list) {
        for (C9528t c9528t : list) {
            if (c9528t.m31466b().contentEquals("app.start.cold") || c9528t.m31466b().contentEquals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        return c9473l4;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public synchronized C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        Map<String, C9516h> m30196q;
        Long m30391b;
        if (!this.f35904h.isTracingEnabled()) {
            return c9532x;
        }
        if (!this.f35902f && m30200a(c9532x.m31541o0()) && (m30391b = C9307q0.m30389e().m30391b()) != null) {
            c9532x.m31539m0().put(C9307q0.m30389e().m30394f().booleanValue() ? "app_start_cold" : "app_start_warm", new C9516h(Float.valueOf(m30391b.longValue()), InterfaceC9626v2.a.MILLISECOND.apiName()));
            this.f35902f = true;
        }
        C9525q m30579G = c9532x.m30579G();
        C9403f5 m31234e = c9532x.m30575C().m31234e();
        if (m30579G != null && m31234e != null && m31234e.m30794b().contentEquals("ui.load") && (m30196q = this.f35903g.m30196q(m30579G)) != null) {
            c9532x.m31539m0().putAll(m30196q);
        }
        return c9532x;
    }
}
