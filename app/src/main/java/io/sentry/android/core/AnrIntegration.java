package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.C9438i2;
import io.sentry.C9473l4;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.C9242e0;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.C9418a;
import io.sentry.hints.InterfaceC9419b;
import io.sentry.hints.InterfaceC9434q;
import io.sentry.protocol.C9517i;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AnrIntegration implements Integration, Closeable {

    /* renamed from: f */
    @SuppressLint({"StaticFieldLeak"})
    private static C9242e0 f35769f;

    /* renamed from: g */
    private static final Object f35770g = new Object();

    /* renamed from: h */
    private final Context f35771h;

    /* renamed from: i */
    private C9647x4 f35772i;

    /* renamed from: io.sentry.android.core.AnrIntegration$a */
    static final class C9216a implements InterfaceC9419b, InterfaceC9434q {

        /* renamed from: a */
        private final boolean f35773a;

        C9216a(boolean z) {
            this.f35773a = z;
        }

        @Override // io.sentry.hints.InterfaceC9419b
        /* renamed from: c */
        public /* synthetic */ Long mo30102c() {
            return C9418a.m30835b(this);
        }

        @Override // io.sentry.hints.InterfaceC9419b
        /* renamed from: d */
        public boolean mo30103d() {
            return true;
        }

        @Override // io.sentry.hints.InterfaceC9419b
        /* renamed from: f */
        public String mo30104f() {
            return this.f35773a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f35771h = context;
    }

    /* renamed from: b */
    private Throwable m30097b(boolean z, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.m30117a());
        C9517i c9517i = new C9517i();
        c9517i.m31372j("ANR");
        return new ExceptionMechanismException(c9517i, applicationNotResponding2, applicationNotResponding2.m30117a(), true);
    }

    /* renamed from: j */
    private void m30099j(final InterfaceC9625v1 interfaceC9625v1, final SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC9637w1 logger = sentryAndroidOptions.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f35770g) {
                if (f35769f == null) {
                    sentryAndroidOptions.getLogger().mo30214c(enumC9554s4, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C9242e0 c9242e0 = new C9242e0(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C9242e0.a() { // from class: io.sentry.android.core.v
                        @Override // io.sentry.android.core.C9242e0.a
                        /* renamed from: a */
                        public final void mo30178a(ApplicationNotResponding applicationNotResponding) {
                            AnrIntegration.this.m30100f(interfaceC9625v1, sentryAndroidOptions, applicationNotResponding);
                        }
                    }, sentryAndroidOptions.getLogger(), this.f35771h);
                    f35769f = c9242e0;
                    c9242e0.start();
                    sentryAndroidOptions.getLogger().mo30214c(enumC9554s4, "AnrIntegration installed.", new Object[0]);
                    mo30003a();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public final void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        this.f35772i = (C9647x4) C9613q.m31802c(c9647x4, "SentryOptions is required");
        m30099j(interfaceC9625v1, (SentryAndroidOptions) c9647x4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (f35770g) {
            C9242e0 c9242e0 = f35769f;
            if (c9242e0 != null) {
                c9242e0.interrupt();
                f35769f = null;
                C9647x4 c9647x4 = this.f35772i;
                if (c9647x4 != null) {
                    c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "AnrIntegration removed.", new Object[0]);
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m30100f(InterfaceC9625v1 interfaceC9625v1, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean equals = Boolean.TRUE.equals(C9309r0.m30399a().m30400b());
        C9473l4 c9473l4 = new C9473l4(m30097b(equals, sentryAndroidOptions, applicationNotResponding));
        c9473l4.m31011z0(EnumC9554s4.ERROR);
        interfaceC9625v1.mo31159t(c9473l4, C9609m.m31778a(new C9216a(equals)));
    }
}
