package io.sentry;

import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Runtime f35734f;

    /* renamed from: g */
    private Thread f35735g;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f35734f = (Runtime) C9613q.m31802c(runtime, "Runtime is required");
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(final InterfaceC9625v1 interfaceC9625v1, final C9647x4 c9647x4) {
        C9613q.m31802c(interfaceC9625v1, "Hub is required");
        C9613q.m31802c(c9647x4, "SentryOptions is required");
        if (!c9647x4.isEnableShutdownHook()) {
            c9647x4.getLogger().mo30214c(EnumC9554s4.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: io.sentry.q0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9625v1.this.mo31147h(c9647x4.getFlushTimeoutMillis());
            }
        });
        this.f35735g = thread;
        this.f35734f.addShutdownHook(thread);
        c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        mo30003a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Thread thread = this.f35735g;
        if (thread != null) {
            try {
                this.f35734f.removeShutdownHook(thread);
            } catch (IllegalStateException e2) {
                String message = e2.getMessage();
                if (message == null || !message.equals("Shutdown in progress")) {
                    throw e2;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
