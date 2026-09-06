package io.sentry.android.core;

import io.sentry.C9438i2;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9594u3;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9646x3;
import io.sentry.util.C9611o;
import io.sentry.util.C9613q;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class SendCachedEnvelopeIntegration implements Integration {

    /* renamed from: f */
    private final InterfaceC9646x3 f35831f;

    /* renamed from: g */
    private final C9611o<Boolean> f35832g;

    public SendCachedEnvelopeIntegration(InterfaceC9646x3 interfaceC9646x3, C9611o<Boolean> c9611o) {
        this.f35831f = (InterfaceC9646x3) C9613q.m31802c(interfaceC9646x3, "SendFireAndForgetFactory is required");
        this.f35832g = c9611o;
    }

    /* renamed from: b */
    static /* synthetic */ void m30137b(InterfaceC9594u3 interfaceC9594u3, SentryAndroidOptions sentryAndroidOptions) {
        try {
            interfaceC9594u3.mo31571a();
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed trying to send cached events.", th);
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        if (!this.f35831f.mo31942c(c9647x4.getCacheDirPath(), c9647x4.getLogger())) {
            c9647x4.getLogger().mo30214c(EnumC9554s4.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final InterfaceC9594u3 mo31941b = this.f35831f.mo31941b(interfaceC9625v1, sentryAndroidOptions);
        if (mo31941b == null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future<?> submit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SendCachedEnvelopeIntegration.m30137b(InterfaceC9594u3.this, sentryAndroidOptions);
                }
            });
            if (this.f35832g.m31798a().booleanValue()) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (RejectedExecutionException e2) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e2);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }
}
