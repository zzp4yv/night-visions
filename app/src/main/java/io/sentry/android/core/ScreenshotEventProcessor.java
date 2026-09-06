package io.sentry.android.core;

import android.app.Activity;
import io.sentry.C9438i2;
import io.sentry.C9456j1;
import io.sentry.C9473l4;
import io.sentry.C9484n1;
import io.sentry.C9550s0;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9457j2;
import io.sentry.InterfaceC9463k1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C9277g;
import io.sentry.android.core.internal.util.C9284n;
import io.sentry.android.core.internal.util.C9289s;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements InterfaceC9463k1, InterfaceC9457j2 {

    /* renamed from: f */
    private final SentryAndroidOptions f35828f;

    /* renamed from: g */
    private final C9311s0 f35829g;

    /* renamed from: h */
    private final C9284n f35830h = new C9284n(C9277g.m30272b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C9311s0 c9311s0) {
        this.f35828f = (SentryAndroidOptions) C9613q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f35829g = (C9311s0) C9613q.m31802c(c9311s0, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            mo30003a();
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        if (!c9473l4.m31008w0()) {
            return c9473l4;
        }
        if (!this.f35828f.isAttachScreenshot()) {
            this.f35828f.getLogger().mo30214c(EnumC9554s4.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return c9473l4;
        }
        Activity m30429b = C9315u0.m30427c().m30429b();
        if (m30429b != null && !C9609m.m31782e(c9484n1)) {
            boolean m30291a = this.f35830h.m30291a();
            SentryAndroidOptions.InterfaceC9225a beforeScreenshotCaptureCallback = this.f35828f.getBeforeScreenshotCaptureCallback();
            if (beforeScreenshotCaptureCallback != null) {
                if (!beforeScreenshotCaptureCallback.m30138a(c9473l4, c9484n1, m30291a)) {
                    return c9473l4;
                }
            } else if (m30291a) {
                return c9473l4;
            }
            byte[] m30307d = C9289s.m30307d(m30429b, this.f35828f.getMainThreadChecker(), this.f35828f.getLogger(), this.f35829g);
            if (m30307d == null) {
                return c9473l4;
            }
            c9484n1.m31080k(C9550s0.m31572a(m30307d));
            c9484n1.m31079j("android:activity", m30429b);
        }
        return c9473l4;
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public /* synthetic */ C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        return C9456j1.m30876a(this, c9532x, c9484n1);
    }
}
