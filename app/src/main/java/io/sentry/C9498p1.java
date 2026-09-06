package io.sentry;

import io.sentry.C9467k5;
import io.sentry.C9553s3;
import io.sentry.clientreport.EnumC9368e;
import io.sentry.hints.C9430m;
import io.sentry.hints.C9432o;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9607k;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import io.sentry.util.C9614r;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Hub.java */
/* renamed from: io.sentry.p1 */
/* loaded from: classes2.dex */
public final class C9498p1 implements InterfaceC9625v1 {

    /* renamed from: a */
    private volatile C9525q f36556a;

    /* renamed from: b */
    private final C9647x4 f36557b;

    /* renamed from: c */
    private volatile boolean f36558c;

    /* renamed from: d */
    private final C9467k5 f36559d;

    /* renamed from: e */
    private final C9502p5 f36560e;

    /* renamed from: f */
    private final Map<Throwable, C9614r<WeakReference<InterfaceC9386d2>, String>> f36561f;

    /* renamed from: g */
    private final InterfaceC9596u5 f36562g;

    public C9498p1(C9647x4 c9647x4) {
        this(c9647x4, m31142d(c9647x4));
    }

    /* renamed from: a */
    private void m31139a(C9473l4 c9473l4) {
        C9614r<WeakReference<InterfaceC9386d2>, String> c9614r;
        InterfaceC9386d2 interfaceC9386d2;
        if (!this.f36557b.isTracingEnabled() || c9473l4.m30587O() == null || (c9614r = this.f36561f.get(C9607k.m31774a(c9473l4.m30587O()))) == null) {
            return;
        }
        WeakReference<InterfaceC9386d2> m31803a = c9614r.m31803a();
        if (c9473l4.m30575C().m31234e() == null && m31803a != null && (interfaceC9386d2 = m31803a.get()) != null) {
            c9473l4.m30575C().m31242n(interfaceC9386d2.mo30527m());
        }
        String m31804b = c9614r.m31804b();
        if (c9473l4.m31005t0() != null || m31804b == null) {
            return;
        }
        c9473l4.m30998E0(m31804b);
    }

    /* renamed from: b */
    private C9553s3 m31140b(C9553s3 c9553s3, InterfaceC9560t3 interfaceC9560t3) {
        if (interfaceC9560t3 != null) {
            try {
                C9553s3 c9553s32 = new C9553s3(c9553s3);
                interfaceC9560t3.mo30217a(c9553s32);
                return c9553s32;
            } catch (Throwable th) {
                this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return c9553s3;
    }

    /* renamed from: c */
    private C9525q m31141c(C9473l4 c9473l4, C9484n1 c9484n1, InterfaceC9560t3 interfaceC9560t3) {
        C9525q c9525q = C9525q.f36725f;
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c9525q;
        }
        if (c9473l4 == null) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return c9525q;
        }
        try {
            m31139a(c9473l4);
            C9467k5.a m30923a = this.f36559d.m30923a();
            c9525q = m30923a.m30925a().mo30022b(c9473l4, m31140b(m30923a.m30927c(), interfaceC9560t3), c9484n1);
            this.f36556a = c9525q;
            return c9525q;
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error while capturing event with id: " + c9473l4.m30579G(), th);
            return c9525q;
        }
    }

    /* renamed from: d */
    private static C9467k5.a m31142d(C9647x4 c9647x4) {
        m31146u(c9647x4);
        return new C9467k5.a(c9647x4, new C9388d4(c9647x4), new C9553s3(c9647x4));
    }

    /* renamed from: e */
    private InterfaceC9393e2 m31143e(C9548r5 c9548r5, C9562t5 c9562t5) {
        final InterfaceC9393e2 interfaceC9393e2;
        C9613q.m31802c(c9548r5, "transactionContext is required");
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC9393e2 = C9387d3.m30717r();
        } else if (!this.f36557b.getInstrumenter().equals(c9548r5.m31567s())) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c9548r5.m31567s(), this.f36557b.getInstrumenter());
            interfaceC9393e2 = C9387d3.m30717r();
        } else if (this.f36557b.isTracingEnabled()) {
            C9541q5 m31176a = this.f36560e.m31176a(new C9546r3(c9548r5, c9562t5.m31650e()));
            c9548r5.m30806n(m31176a);
            C9336b5 c9336b5 = new C9336b5(c9548r5, this, c9562t5, this.f36562g);
            if (m31176a.m31562c().booleanValue() && m31176a.m31560a().booleanValue()) {
                this.f36557b.getTransactionProfiler().mo30351b(c9336b5);
            }
            interfaceC9393e2 = c9336b5;
        } else {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC9393e2 = C9387d3.m30717r();
        }
        if (c9562t5.m31654i()) {
            mo31154o(new InterfaceC9560t3() { // from class: io.sentry.h
                @Override // io.sentry.InterfaceC9560t3
                /* renamed from: a */
                public final void mo30217a(C9553s3 c9553s3) {
                    c9553s3.m31613z(InterfaceC9393e2.this);
                }
            });
        }
        return interfaceC9393e2;
    }

    /* renamed from: u */
    private static void m31146u(C9647x4 c9647x4) {
        C9613q.m31802c(c9647x4, "SentryOptions is required.");
        if (c9647x4.getDsn() == null || c9647x4.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    public void close() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : this.f36557b.getIntegrations()) {
                if (integration instanceof Closeable) {
                    try {
                        ((Closeable) integration).close();
                    } catch (IOException e2) {
                        this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Failed to close the integration {}.", integration, e2);
                    }
                }
            }
            mo31154o(new InterfaceC9560t3() { // from class: io.sentry.i
                @Override // io.sentry.InterfaceC9560t3
                /* renamed from: a */
                public final void mo30217a(C9553s3 c9553s3) {
                    c9553s3.m31591b();
                }
            });
            this.f36557b.getTransactionProfiler().close();
            this.f36557b.getTransactionPerformanceCollector().close();
            this.f36557b.getExecutorService().mo30029a(this.f36557b.getShutdownTimeoutMillis());
            this.f36559d.m30923a().m30925a().close();
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error while closing the Hub.", th);
        }
        this.f36558c = false;
    }

    @Override // io.sentry.InterfaceC9625v1
    public void endSession() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C9467k5.a m30923a = this.f36559d.m30923a();
        C9389d5 m31595g = m30923a.m30927c().m31595g();
        if (m31595g != null) {
            m30923a.m30925a().mo30021a(m31595g, C9609m.m31778a(new C9430m()));
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: h */
    public void mo31147h(long j2) {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f36559d.m30923a().m30925a().mo30024h(j2);
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: i */
    public /* synthetic */ void mo31148i(C9624v0 c9624v0) {
        C9592u1.m31760a(this, c9624v0);
    }

    @Override // io.sentry.InterfaceC9625v1
    public boolean isEnabled() {
        return this.f36558c;
    }

    @Override // io.sentry.InterfaceC9625v1
    @ApiStatus.Internal
    /* renamed from: j */
    public C9525q mo31149j(C9416h4 c9416h4, C9484n1 c9484n1) {
        C9613q.m31802c(c9416h4, "SentryEnvelope is required.");
        C9525q c9525q = C9525q.f36725f;
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c9525q;
        }
        try {
            C9525q mo30025j = this.f36559d.m30923a().m30925a().mo30025j(c9416h4, c9484n1);
            return mo30025j != null ? mo30025j : c9525q;
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error while capturing envelope.", th);
            return c9525q;
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: k */
    public /* synthetic */ C9525q mo31150k(C9473l4 c9473l4) {
        return C9592u1.m31762c(this, c9473l4);
    }

    @Override // io.sentry.InterfaceC9625v1
    @ApiStatus.Internal
    /* renamed from: l */
    public InterfaceC9393e2 mo31151l(C9548r5 c9548r5, C9562t5 c9562t5) {
        return m31143e(c9548r5, c9562t5);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: m */
    public /* synthetic */ C9525q mo31152m(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1) {
        return C9592u1.m31763d(this, c9532x, c9495o5, c9484n1);
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: n */
    public void mo31153n(C9624v0 c9624v0, C9484n1 c9484n1) {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c9624v0 == null) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f36559d.m30923a().m30927c().m31590a(c9624v0, c9484n1);
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: o */
    public void mo31154o(InterfaceC9560t3 interfaceC9560t3) {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC9560t3.mo30217a(this.f36559d.m30923a().m30927c());
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    @ApiStatus.Internal
    /* renamed from: p */
    public void mo31155p(Throwable th, InterfaceC9386d2 interfaceC9386d2, String str) {
        C9613q.m31802c(th, "throwable is required");
        C9613q.m31802c(interfaceC9386d2, "span is required");
        C9613q.m31802c(str, "transactionName is required");
        Throwable m31774a = C9607k.m31774a(th);
        if (this.f36561f.containsKey(m31774a)) {
            return;
        }
        this.f36561f.put(m31774a, new C9614r<>(new WeakReference(interfaceC9386d2), str));
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: q */
    public C9647x4 mo31156q() {
        return this.f36559d.m30923a().m30926b();
    }

    @Override // io.sentry.InterfaceC9625v1
    @ApiStatus.Internal
    /* renamed from: r */
    public C9525q mo31157r(C9532x c9532x, C9495o5 c9495o5, C9484n1 c9484n1, C9479m3 c9479m3) {
        C9613q.m31802c(c9532x, "transaction is required");
        C9525q c9525q = C9525q.f36725f;
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c9525q;
        }
        if (!c9532x.m31542p0()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c9532x.m30579G());
            return c9525q;
        }
        if (!Boolean.TRUE.equals(Boolean.valueOf(c9532x.m31543q0()))) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.DEBUG, "Transaction %s was dropped due to sampling decision.", c9532x.m30579G());
            this.f36557b.getClientReportRecorder().mo30690a(EnumC9368e.SAMPLE_RATE, EnumC9655z0.Transaction);
            return c9525q;
        }
        try {
            C9467k5.a m30923a = this.f36559d.m30923a();
            return m30923a.m30925a().mo30023c(c9532x, c9495o5, m30923a.m30927c(), c9484n1, c9479m3);
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error while capturing transaction with id: " + c9532x.m30579G(), th);
            return c9525q;
        }
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: s */
    public /* synthetic */ C9525q mo31158s(C9416h4 c9416h4) {
        return C9592u1.m31761b(this, c9416h4);
    }

    @Override // io.sentry.InterfaceC9625v1
    public void startSession() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C9467k5.a m30923a = this.f36559d.m30923a();
        C9553s3.d m31586A = m30923a.m30927c().m31586A();
        if (m31586A == null) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (m31586A.m31617b() != null) {
            m30923a.m30925a().mo30021a(m31586A.m31617b(), C9609m.m31778a(new C9430m()));
        }
        m30923a.m30925a().mo30021a(m31586A.m31616a(), C9609m.m31778a(new C9432o()));
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: t */
    public C9525q mo31159t(C9473l4 c9473l4, C9484n1 c9484n1) {
        return m31141c(c9473l4, c9484n1, null);
    }

    private C9498p1(C9647x4 c9647x4, C9467k5 c9467k5) {
        this.f36561f = Collections.synchronizedMap(new WeakHashMap());
        m31146u(c9647x4);
        this.f36557b = c9647x4;
        this.f36560e = new C9502p5(c9647x4);
        this.f36559d = c9467k5;
        this.f36556a = C9525q.f36725f;
        this.f36562g = c9647x4.getTransactionPerformanceCollector();
        this.f36558c = true;
    }

    @Override // io.sentry.InterfaceC9625v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC9625v1 m41048clone() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9554s4.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new C9498p1(this.f36557b, new C9467k5(this.f36559d));
    }

    private C9498p1(C9647x4 c9647x4, C9467k5.a aVar) {
        this(c9647x4, new C9467k5(c9647x4.getLogger(), aVar));
    }
}
