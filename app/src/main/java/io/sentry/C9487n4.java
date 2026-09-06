package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryExecutorService.java */
@ApiStatus.Internal
/* renamed from: io.sentry.n4 */
/* loaded from: classes2.dex */
public final class C9487n4 implements InterfaceC9333b2 {

    /* renamed from: a */
    private final ScheduledExecutorService f36518a;

    /* compiled from: SentryExecutorService.java */
    /* renamed from: io.sentry.n4$b */
    private static final class b implements ThreadFactory {

        /* renamed from: f */
        private int f36519f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryExecutorServiceThreadFactory-");
            int i2 = this.f36519f;
            this.f36519f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    C9487n4(ScheduledExecutorService scheduledExecutorService) {
        this.f36518a = scheduledExecutorService;
    }

    @Override // io.sentry.InterfaceC9333b2
    /* renamed from: a */
    public void mo30029a(long j2) {
        synchronized (this.f36518a) {
            if (!this.f36518a.isShutdown()) {
                this.f36518a.shutdown();
                try {
                    if (!this.f36518a.awaitTermination(j2, TimeUnit.MILLISECONDS)) {
                        this.f36518a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f36518a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9333b2
    /* renamed from: b */
    public Future<?> mo30030b(Runnable runnable, long j2) {
        return this.f36518a.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC9333b2
    public boolean isClosed() {
        boolean isShutdown;
        synchronized (this.f36518a) {
            isShutdown = this.f36518a.isShutdown();
        }
        return isShutdown;
    }

    @Override // io.sentry.InterfaceC9333b2
    public Future<?> submit(Runnable runnable) {
        return this.f36518a.submit(runnable);
    }

    public C9487n4() {
        this(Executors.newSingleThreadScheduledExecutor(new b()));
    }
}
