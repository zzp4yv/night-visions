package io.sentry.android.core;

import io.sentry.C9438i2;
import io.sentry.C9458j3;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9625v1;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {

    /* renamed from: f */
    private FileObserverC9323y0 f35796f;

    /* renamed from: g */
    private InterfaceC9637w1 f35797g;

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        /* renamed from: e */
        protected String mo30121e(C9647x4 c9647x4) {
            return c9647x4.getOutboxPath();
        }
    }

    /* renamed from: b */
    public static EnvelopeFileObserverIntegration m30120b() {
        return new OutboxEnvelopeFileObserverIntegration();
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
        C9613q.m31802c(c9647x4, "SentryOptions is required");
        this.f35797g = c9647x4.getLogger();
        String mo30121e = mo30121e(c9647x4);
        if (mo30121e == null) {
            this.f35797g.mo30214c(EnumC9554s4.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        InterfaceC9637w1 interfaceC9637w1 = this.f35797g;
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        interfaceC9637w1.mo30214c(enumC9554s4, "Registering EnvelopeFileObserverIntegration for path: %s", mo30121e);
        FileObserverC9323y0 fileObserverC9323y0 = new FileObserverC9323y0(mo30121e, new C9458j3(interfaceC9625v1, c9647x4.getEnvelopeReader(), c9647x4.getSerializer(), this.f35797g, c9647x4.getFlushTimeoutMillis()), this.f35797g, c9647x4.getFlushTimeoutMillis());
        this.f35796f = fileObserverC9323y0;
        try {
            fileObserverC9323y0.startWatching();
            this.f35797g.mo30214c(enumC9554s4, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            c9647x4.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FileObserverC9323y0 fileObserverC9323y0 = this.f35796f;
        if (fileObserverC9323y0 != null) {
            fileObserverC9323y0.stopWatching();
            InterfaceC9637w1 interfaceC9637w1 = this.f35797g;
            if (interfaceC9637w1 != null) {
                interfaceC9637w1.mo30214c(EnumC9554s4.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    /* renamed from: e */
    abstract String mo30121e(C9647x4 c9647x4);
}
