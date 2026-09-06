package io.sentry.android.core;

import io.sentry.C9438i2;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NdkIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Class<?> f35808f;

    /* renamed from: g */
    private SentryAndroidOptions f35809g;

    public NdkIntegration(Class<?> cls) {
        this.f35808f = cls;
    }

    /* renamed from: b */
    private void m30131b(C9647x4 c9647x4) {
        c9647x4.setEnableNdk(false);
        c9647x4.setEnableScopeSync(false);
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public final void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9613q.m31802c(c9647x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9647x4 : null, "SentryAndroidOptions is required");
        this.f35809g = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        InterfaceC9637w1 logger = this.f35809g.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || this.f35808f == null) {
            m30131b(this.f35809g);
            return;
        }
        if (this.f35809g.getCacheDirPath() == null) {
            this.f35809g.getLogger().mo30214c(EnumC9554s4.ERROR, "No cache dir path is defined in options.", new Object[0]);
            m30131b(this.f35809g);
            return;
        }
        try {
            this.f35808f.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f35809g);
            this.f35809g.getLogger().mo30214c(enumC9554s4, "NdkIntegration installed.", new Object[0]);
            mo30003a();
        } catch (NoSuchMethodException e2) {
            m30131b(this.f35809g);
            this.f35809g.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to invoke the SentryNdk.init method.", e2);
        } catch (Throwable th) {
            m30131b(this.f35809g);
            this.f35809g.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f35809g;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f35808f;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                        this.f35809g.getLogger().mo30214c(EnumC9554s4.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } catch (NoSuchMethodException e2) {
                        this.f35809g.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to invoke the SentryNdk.close method.", e2);
                    }
                } finally {
                    m30131b(this.f35809g);
                }
                m30131b(this.f35809g);
            }
        } catch (Throwable th) {
            m30131b(this.f35809g);
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }
}
