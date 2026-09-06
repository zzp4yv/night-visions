package io.sentry.transport;

import io.sentry.C9211a1;
import io.sentry.C9416h4;
import io.sentry.C9484n1;
import io.sentry.C9500p3;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.InterfaceC9361r;
import io.sentry.clientreport.EnumC9368e;
import io.sentry.hints.InterfaceC9423f;
import io.sentry.hints.InterfaceC9424g;
import io.sentry.hints.InterfaceC9428k;
import io.sentry.hints.InterfaceC9433p;
import io.sentry.transport.C9576m;
import io.sentry.util.C9609m;
import io.sentry.util.C9612p;
import io.sentry.util.C9613q;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncHttpTransport.java */
/* renamed from: io.sentry.transport.m */
/* loaded from: classes2.dex */
public final class C9576m implements InterfaceC9581r {

    /* renamed from: f */
    private final C9587x f36881f;

    /* renamed from: g */
    private final InterfaceC9361r f36882g;

    /* renamed from: h */
    private final C9647x4 f36883h;

    /* renamed from: i */
    private final C9588y f36884i;

    /* renamed from: j */
    private final InterfaceC9582s f36885j;

    /* renamed from: k */
    private final C9579p f36886k;

    /* compiled from: AsyncHttpTransport.java */
    /* renamed from: io.sentry.transport.m$b */
    private static final class b implements ThreadFactory {

        /* renamed from: f */
        private int f36887f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryAsyncConnection-");
            int i2 = this.f36887f;
            this.f36887f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncHttpTransport.java */
    /* renamed from: io.sentry.transport.m$c */
    final class c implements Runnable {

        /* renamed from: f */
        private final C9416h4 f36888f;

        /* renamed from: g */
        private final C9484n1 f36889g;

        /* renamed from: h */
        private final InterfaceC9361r f36890h;

        /* renamed from: i */
        private final AbstractC9564a0 f36891i = AbstractC9564a0.m31661a();

        c(C9416h4 c9416h4, C9484n1 c9484n1, InterfaceC9361r interfaceC9361r) {
            this.f36888f = (C9416h4) C9613q.m31802c(c9416h4, "Envelope is required.");
            this.f36889g = c9484n1;
            this.f36890h = (InterfaceC9361r) C9613q.m31802c(interfaceC9361r, "EnvelopeCache is required.");
        }

        /* renamed from: c */
        private AbstractC9564a0 m31679c() {
            AbstractC9564a0 abstractC9564a0 = this.f36891i;
            this.f36888f.m30831b().m30852d(null);
            this.f36890h.mo30163Z(this.f36888f, this.f36889g);
            C9609m.m31788k(this.f36889g, InterfaceC9424g.class, new C9609m.a() { // from class: io.sentry.transport.c
                @Override // io.sentry.util.C9609m.a
                /* renamed from: a */
                public final void mo30156a(Object obj) {
                    C9576m.c.this.m31687e((InterfaceC9424g) obj);
                }
            });
            if (!C9576m.this.f36885j.isConnected()) {
                C9609m.m31789l(this.f36889g, InterfaceC9428k.class, new C9609m.a() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.C9609m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9428k) obj).mo30476d(true);
                    }
                }, new C9609m.b() { // from class: io.sentry.transport.d
                    @Override // io.sentry.util.C9609m.b
                    /* renamed from: a */
                    public final void mo31660a(Object obj, Class cls) {
                        C9576m.c.this.m31690m(obj, cls);
                    }
                });
                return abstractC9564a0;
            }
            final C9416h4 mo30692c = C9576m.this.f36883h.getClientReportRecorder().mo30692c(this.f36888f);
            try {
                mo30692c.m30831b().m30852d(C9211a1.m30015j(C9576m.this.f36883h.getDateProvider().mo30210a().mo30792x()));
                AbstractC9564a0 m31702h = C9576m.this.f36886k.m31702h(mo30692c);
                if (m31702h.mo31665d()) {
                    this.f36890h.mo30636p(this.f36888f);
                    return m31702h;
                }
                String str = "The transport failed to send the envelope with response code " + m31702h.mo31664c();
                C9576m.this.f36883h.getLogger().mo30214c(EnumC9554s4.ERROR, str, new Object[0]);
                if (m31702h.mo31664c() >= 400 && m31702h.mo31664c() != 429) {
                    C9609m.m31787j(this.f36889g, InterfaceC9428k.class, new C9609m.c() { // from class: io.sentry.transport.b
                        @Override // io.sentry.util.C9609m.c
                        /* renamed from: a */
                        public final void mo31666a(Object obj) {
                            C9576m.c.this.m31688g(mo30692c, obj);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e2) {
                C9609m.m31789l(this.f36889g, InterfaceC9428k.class, new C9609m.a() { // from class: io.sentry.transport.e
                    @Override // io.sentry.util.C9609m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9428k) obj).mo30476d(true);
                    }
                }, new C9609m.b() { // from class: io.sentry.transport.a
                    @Override // io.sentry.util.C9609m.b
                    /* renamed from: a */
                    public final void mo31660a(Object obj, Class cls) {
                        C9576m.c.this.m31689j(mo30692c, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31687e(InterfaceC9424g interfaceC9424g) {
            interfaceC9424g.mo30836b();
            C9576m.this.f36883h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31688g(C9416h4 c9416h4, Object obj) {
            C9576m.this.f36883h.getClientReportRecorder().mo30691b(EnumC9368e.NETWORK_ERROR, c9416h4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31689j(C9416h4 c9416h4, Object obj, Class cls) {
            C9612p.m31799a(cls, obj, C9576m.this.f36883h.getLogger());
            C9576m.this.f36883h.getClientReportRecorder().mo30691b(EnumC9368e.NETWORK_ERROR, c9416h4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31690m(Object obj, Class cls) {
            C9612p.m31799a(cls, obj, C9576m.this.f36883h.getLogger());
            C9576m.this.f36883h.getClientReportRecorder().mo30691b(EnumC9368e.NETWORK_ERROR, this.f36888f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31691o(AbstractC9564a0 abstractC9564a0, InterfaceC9433p interfaceC9433p) {
            C9576m.this.f36883h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC9564a0.mo31665d()));
            interfaceC9433p.mo30475c(abstractC9564a0.mo31665d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final AbstractC9564a0 abstractC9564a0 = this.f36891i;
            try {
                abstractC9564a0 = m31679c();
                C9576m.this.f36883h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public C9576m(C9647x4 c9647x4, C9588y c9588y, InterfaceC9582s interfaceC9582s, C9500p3 c9500p3) {
        this(m31670d(c9647x4.getMaxQueueSize(), c9647x4.getEnvelopeDiskCache(), c9647x4.getLogger()), c9647x4, c9588y, interfaceC9582s, new C9579p(c9647x4, c9500p3, c9588y));
    }

    /* renamed from: d */
    private static C9587x m31670d(int i2, final InterfaceC9361r interfaceC9361r, final InterfaceC9637w1 interfaceC9637w1) {
        return new C9587x(1, i2, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.h
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C9576m.m31671e(InterfaceC9361r.this, interfaceC9637w1, runnable, threadPoolExecutor);
            }
        }, interfaceC9637w1);
    }

    /* renamed from: e */
    static /* synthetic */ void m31671e(InterfaceC9361r interfaceC9361r, InterfaceC9637w1 interfaceC9637w1, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!C9609m.m31781d(cVar.f36889g, InterfaceC9423f.class)) {
                interfaceC9361r.mo30163Z(cVar.f36888f, cVar.f36889g);
            }
            m31674k(cVar.f36889g, true);
            interfaceC9637w1.mo30214c(EnumC9554s4.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    /* renamed from: k */
    private static void m31674k(C9484n1 c9484n1, final boolean z) {
        C9609m.m31788k(c9484n1, InterfaceC9433p.class, new C9609m.a() { // from class: io.sentry.transport.i
            @Override // io.sentry.util.C9609m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9433p) obj).mo30475c(false);
            }
        });
        C9609m.m31788k(c9484n1, InterfaceC9428k.class, new C9609m.a() { // from class: io.sentry.transport.j
            @Override // io.sentry.util.C9609m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9428k) obj).mo30476d(z);
            }
        });
    }

    @Override // io.sentry.transport.InterfaceC9581r
    /* renamed from: V */
    public void mo31675V(C9416h4 c9416h4, C9484n1 c9484n1) throws IOException {
        InterfaceC9361r interfaceC9361r = this.f36882g;
        boolean z = false;
        if (C9609m.m31781d(c9484n1, InterfaceC9423f.class)) {
            interfaceC9361r = C9583t.m31704c();
            this.f36883h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        C9416h4 m31716b = this.f36884i.m31716b(c9416h4, c9484n1);
        if (m31716b == null) {
            if (z) {
                this.f36882g.mo30636p(c9416h4);
                return;
            }
            return;
        }
        if (C9609m.m31781d(c9484n1, UncaughtExceptionHandlerIntegration.C9208a.class)) {
            m31716b = this.f36883h.getClientReportRecorder().mo30692c(m31716b);
        }
        Future<?> submit = this.f36881f.submit(new c(m31716b, c9484n1, interfaceC9361r));
        if (submit == null || !submit.isCancelled()) {
            return;
        }
        this.f36883h.getClientReportRecorder().mo30691b(EnumC9368e.QUEUE_OVERFLOW, m31716b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36881f.shutdown();
        this.f36883h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Shutting down", new Object[0]);
        try {
            if (this.f36881f.awaitTermination(1L, TimeUnit.MINUTES)) {
                return;
            }
            this.f36883h.getLogger().mo30214c(EnumC9554s4.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
            this.f36881f.shutdownNow();
        } catch (InterruptedException unused) {
            this.f36883h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.InterfaceC9581r
    /* renamed from: h */
    public void mo31676h(long j2) {
        this.f36881f.m31708b(j2);
    }

    public C9576m(C9587x c9587x, C9647x4 c9647x4, C9588y c9588y, InterfaceC9582s interfaceC9582s, C9579p c9579p) {
        this.f36881f = (C9587x) C9613q.m31802c(c9587x, "executor is required");
        this.f36882g = (InterfaceC9361r) C9613q.m31802c(c9647x4.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f36883h = (C9647x4) C9613q.m31802c(c9647x4, "options is required");
        this.f36884i = (C9588y) C9613q.m31802c(c9588y, "rateLimiter is required");
        this.f36885j = (InterfaceC9582s) C9613q.m31802c(interfaceC9582s, "transportGate is required");
        this.f36886k = (C9579p) C9613q.m31802c(c9579p, "httpConnection is required");
    }
}
