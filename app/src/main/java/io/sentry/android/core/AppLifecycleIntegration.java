package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C9438i2;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.internal.util.C9278h;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {

    /* renamed from: f */
    volatile LifecycleWatcher f35791f;

    /* renamed from: g */
    private SentryAndroidOptions f35792g;

    /* renamed from: h */
    private final C9235c1 f35793h;

    public AppLifecycleIntegration() {
        this(new C9235c1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m30116k(InterfaceC9625v1 interfaceC9625v1) {
        SentryAndroidOptions sentryAndroidOptions = this.f35792g;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f35791f = new LifecycleWatcher(interfaceC9625v1, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f35792g.isEnableAutoSessionTracking(), this.f35792g.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.m3827h().getLifecycle().mo3861a(this.f35791f);
            this.f35792g.getLogger().mo30214c(EnumC9554s4.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            mo30003a();
        } catch (Throwable th) {
            this.f35791f = null;
            this.f35792g.getLogger().mo30213b(EnumC9554s4.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m30115f() {
        LifecycleWatcher lifecycleWatcher = this.f35791f;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.m3827h().getLifecycle().mo3863c(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.f35792g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9554s4.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f35791f = null;
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:14:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:14:0x0098). Please report as a decompilation issue!!! */
    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(final InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        this.f35792g = sentryAndroidOptions;
        InterfaceC9637w1 logger = sentryAndroidOptions.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f35792g.isEnableAutoSessionTracking()));
        this.f35792g.getLogger().mo30214c(enumC9554s4, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f35792g.isEnableAppLifecycleBreadcrumbs()));
        if (this.f35792g.isEnableAutoSessionTracking() || this.f35792g.isEnableAppLifecycleBreadcrumbs()) {
            try {
                Class.forName("androidx.lifecycle.DefaultLifecycleObserver");
                Class.forName("androidx.lifecycle.ProcessLifecycleOwner");
                if (C9278h.m30273e().mo30277d()) {
                    m30113j(interfaceC9625v1);
                    c9647x4 = c9647x4;
                } else {
                    this.f35793h.m30155b(new Runnable() { // from class: io.sentry.android.core.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLifecycleIntegration.this.m30116k(interfaceC9625v1);
                        }
                    });
                    c9647x4 = c9647x4;
                }
            } catch (ClassNotFoundException e2) {
                InterfaceC9637w1 logger2 = c9647x4.getLogger();
                logger2.mo30213b(EnumC9554s4.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e2);
                c9647x4 = logger2;
            } catch (IllegalStateException e3) {
                InterfaceC9637w1 logger3 = c9647x4.getLogger();
                logger3.mo30213b(EnumC9554s4.ERROR, "AppLifecycleIntegration could not be installed", e3);
                c9647x4 = logger3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f35791f == null) {
            return;
        }
        if (C9278h.m30273e().mo30277d()) {
            m30112e();
        } else {
            this.f35793h.m30155b(new Runnable() { // from class: io.sentry.android.core.w
                @Override // java.lang.Runnable
                public final void run() {
                    AppLifecycleIntegration.this.m30115f();
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    AppLifecycleIntegration(C9235c1 c9235c1) {
        this.f35793h = c9235c1;
    }
}
