package io.sentry;

import io.sentry.C9389d5;
import io.sentry.C9553s3;
import io.sentry.C9647x4;
import io.sentry.clientreport.EnumC9368e;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.InterfaceC9419b;
import io.sentry.hints.InterfaceC9421d;
import io.sentry.hints.InterfaceC9434q;
import io.sentry.protocol.C9510c;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;
import io.sentry.transport.InterfaceC9581r;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import io.sentry.util.C9622v;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryClient.java */
/* renamed from: io.sentry.d4 */
/* loaded from: classes2.dex */
public final class C9388d4 implements InterfaceC9212a2 {

    /* renamed from: b */
    private final C9647x4 f36265b;

    /* renamed from: c */
    private final InterfaceC9581r f36266c;

    /* renamed from: d */
    private final SecureRandom f36267d;

    /* renamed from: e */
    private final b f36268e = new b();

    /* renamed from: a */
    private boolean f36264a = true;

    /* compiled from: SentryClient.java */
    /* renamed from: io.sentry.d4$b */
    private static final class b implements Comparator<C9624v0> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C9624v0 c9624v0, C9624v0 c9624v02) {
            return c9624v0.m31838j().compareTo(c9624v02.m31838j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C9388d4(C9647x4 c9647x4) {
        this.f36265b = (C9647x4) C9613q.m31802c(c9647x4, "SentryOptions is required.");
        InterfaceC9407g2 transportFactory = c9647x4.getTransportFactory();
        if (transportFactory instanceof C9408g3) {
            transportFactory = new C9543r0();
            c9647x4.setTransportFactory(transportFactory);
        }
        this.f36266c = transportFactory.mo30812a(c9647x4, new C9539q3(c9647x4).m31554a());
        this.f36267d = c9647x4.getSampleRate() != null ? new SecureRandom() : null;
    }

    /* renamed from: d */
    private void m30718d(C9553s3 c9553s3, C9484n1 c9484n1) {
        if (c9553s3 != null) {
            c9484n1.m31071a(c9553s3.m31596i());
        }
    }

    /* renamed from: e */
    private <T extends AbstractC9342c4> T m30719e(T t, C9553s3 c9553s3) {
        if (c9553s3 != null) {
            if (t.m30583K() == null) {
                t.m30598Z(c9553s3.m31604q());
            }
            if (t.m30589Q() == null) {
                t.m30603e0(c9553s3.m31610w());
            }
            if (t.m30586N() == null) {
                t.m30602d0(new HashMap(c9553s3.m31607t()));
            } else {
                for (Map.Entry<String, String> entry : c9553s3.m31607t().entrySet()) {
                    if (!t.m30586N().containsKey(entry.getKey())) {
                        t.m30586N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t.m30574B() == null) {
                t.m30590R(new ArrayList(c9553s3.m31597j()));
            } else {
                m30733v(t, c9553s3.m31597j());
            }
            if (t.m30580H() == null) {
                t.m30595W(new HashMap(c9553s3.m31600m()));
            } else {
                for (Map.Entry<String, Object> entry2 : c9553s3.m31600m().entrySet()) {
                    if (!t.m30580H().containsKey(entry2.getKey())) {
                        t.m30580H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C9510c m30575C = t.m30575C();
            for (Map.Entry<String, Object> entry3 : new C9510c(c9553s3.m31598k()).entrySet()) {
                if (!m30575C.containsKey(entry3.getKey())) {
                    m30575C.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t;
    }

    /* renamed from: f */
    private C9473l4 m30720f(C9473l4 c9473l4, C9553s3 c9553s3, C9484n1 c9484n1) {
        if (c9553s3 == null) {
            return c9473l4;
        }
        m30719e(c9473l4, c9553s3);
        if (c9473l4.m31005t0() == null) {
            c9473l4.m30998E0(c9553s3.m31609v());
        }
        if (c9473l4.m31001p0() == null) {
            c9473l4.m31010y0(c9553s3.m31601n());
        }
        if (c9553s3.m31602o() != null) {
            c9473l4.m31011z0(c9553s3.m31602o());
        }
        InterfaceC9386d2 m31606s = c9553s3.m31606s();
        if (c9473l4.m30575C().m31234e() == null) {
            if (m31606s == null) {
                c9473l4.m30575C().m31242n(C9548r5.m31565q(c9553s3.m31603p()));
            } else {
                c9473l4.m30575C().m31242n(m31606s.mo30527m());
            }
        }
        return m30728q(c9473l4, c9484n1, c9553s3.m31599l());
    }

    /* renamed from: g */
    private C9416h4 m30721g(AbstractC9342c4 abstractC9342c4, List<C9550s0> list, C9389d5 c9389d5, C9495o5 c9495o5, C9479m3 c9479m3) throws IOException, SentryEnvelopeException {
        C9525q c9525q;
        ArrayList arrayList = new ArrayList();
        if (abstractC9342c4 != null) {
            arrayList.add(C9459j4.m30890d(this.f36265b.getSerializer(), abstractC9342c4));
            c9525q = abstractC9342c4.m30579G();
        } else {
            c9525q = null;
        }
        if (c9389d5 != null) {
            arrayList.add(C9459j4.m30892f(this.f36265b.getSerializer(), c9389d5));
        }
        if (c9479m3 != null) {
            arrayList.add(C9459j4.m30891e(c9479m3, this.f36265b.getMaxTraceFileSize(), this.f36265b.getSerializer()));
            if (c9525q == null) {
                c9525q = new C9525q(c9479m3.m31061z());
            }
        }
        if (list != null) {
            Iterator<C9550s0> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C9459j4.m30888b(this.f36265b.getSerializer(), this.f36265b.getLogger(), it.next(), this.f36265b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9416h4(new C9440i4(c9525q, this.f36265b.getSdkVersion(), c9495o5), arrayList);
    }

    /* renamed from: i */
    private C9473l4 m30722i(C9473l4 c9473l4, C9484n1 c9484n1) {
        C9647x4.b beforeSend = this.f36265b.getBeforeSend();
        if (beforeSend == null) {
            return c9473l4;
        }
        try {
            return beforeSend.m31944a(c9473l4, c9484n1);
        } catch (Throwable th) {
            this.f36265b.getLogger().mo30213b(EnumC9554s4.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    /* renamed from: k */
    private C9532x m30723k(C9532x c9532x, C9484n1 c9484n1) {
        C9647x4.c beforeSendTransaction = this.f36265b.getBeforeSendTransaction();
        if (beforeSendTransaction == null) {
            return c9532x;
        }
        try {
            return beforeSendTransaction.m31945a(c9532x, c9484n1);
        } catch (Throwable th) {
            this.f36265b.getLogger().mo30213b(EnumC9554s4.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    /* renamed from: l */
    private List<C9550s0> m30724l(List<C9550s0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C9550s0 c9550s0 : list) {
            if (c9550s0.m31581j()) {
                arrayList.add(c9550s0);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private List<C9550s0> m30725m(C9484n1 c9484n1) {
        List<C9550s0> m31075e = c9484n1.m31075e();
        C9550s0 m31076f = c9484n1.m31076f();
        if (m31076f != null) {
            m31075e.add(m31076f);
        }
        C9550s0 m31078h = c9484n1.m31078h();
        if (m31078h != null) {
            m31075e.add(m31078h);
        }
        C9550s0 m31077g = c9484n1.m31077g();
        if (m31077g != null) {
            m31075e.add(m31077g);
        }
        return m31075e;
    }

    /* renamed from: n */
    static /* synthetic */ void m30726n(C9389d5 c9389d5) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30734p(C9473l4 c9473l4, C9484n1 c9484n1, C9389d5 c9389d5) {
        if (c9389d5 == null) {
            this.f36265b.getLogger().mo30214c(EnumC9554s4.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String str = null;
        C9389d5.b bVar = c9473l4.m31007v0() ? C9389d5.b.Crashed : null;
        boolean z = C9389d5.b.Crashed == bVar || c9473l4.m31008w0();
        String str2 = (c9473l4.m30583K() == null || c9473l4.m30583K().m31407l() == null || !c9473l4.m30583K().m31407l().containsKey("user-agent")) ? null : c9473l4.m30583K().m31407l().get("user-agent");
        Object m31780c = C9609m.m31780c(c9484n1);
        if (m31780c instanceof InterfaceC9419b) {
            str = ((InterfaceC9419b) m31780c).mo30104f();
            bVar = C9389d5.b.Abnormal;
        }
        if (c9389d5.m30753q(bVar, str2, z, str) && c9389d5.m30749m()) {
            c9389d5.m30740c();
        }
    }

    /* renamed from: q */
    private C9473l4 m30728q(C9473l4 c9473l4, C9484n1 c9484n1, List<InterfaceC9463k1> list) {
        Iterator<InterfaceC9463k1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC9463k1 next = it.next();
            try {
                boolean z = next instanceof InterfaceC9557t0;
                boolean m31781d = C9609m.m31781d(c9484n1, InterfaceC9421d.class);
                if (m31781d && z) {
                    c9473l4 = next.mo30135b(c9473l4, c9484n1);
                } else if (!m31781d && !z) {
                    c9473l4 = next.mo30135b(c9473l4, c9484n1);
                }
            } catch (Throwable th) {
                this.f36265b.getLogger().mo30212a(EnumC9554s4.ERROR, th, "An exception occurred while processing event by processor: %s", next.getClass().getName());
            }
            if (c9473l4 == null) {
                this.f36265b.getLogger().mo30214c(EnumC9554s4.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.f36265b.getClientReportRecorder().mo30690a(EnumC9368e.EVENT_PROCESSOR, EnumC9655z0.Error);
                break;
            }
        }
        return c9473l4;
    }

    /* renamed from: r */
    private C9532x m30729r(C9532x c9532x, C9484n1 c9484n1, List<InterfaceC9463k1> list) {
        Iterator<InterfaceC9463k1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC9463k1 next = it.next();
            try {
                c9532x = next.mo30136e(c9532x, c9484n1);
            } catch (Throwable th) {
                this.f36265b.getLogger().mo30212a(EnumC9554s4.ERROR, th, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
            }
            if (c9532x == null) {
                this.f36265b.getLogger().mo30214c(EnumC9554s4.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                this.f36265b.getClientReportRecorder().mo30690a(EnumC9368e.EVENT_PROCESSOR, EnumC9655z0.Transaction);
                break;
            }
        }
        return c9532x;
    }

    /* renamed from: s */
    private boolean m30730s() {
        return this.f36265b.getSampleRate() == null || this.f36267d == null || this.f36265b.getSampleRate().doubleValue() >= this.f36267d.nextDouble();
    }

    /* renamed from: t */
    private boolean m30731t(AbstractC9342c4 abstractC9342c4, C9484n1 c9484n1) {
        if (C9609m.m31794q(c9484n1)) {
            return true;
        }
        this.f36265b.getLogger().mo30214c(EnumC9554s4.DEBUG, "Event was cached so not applying scope: %s", abstractC9342c4.m30579G());
        return false;
    }

    /* renamed from: u */
    private boolean m30732u(C9389d5 c9389d5, C9389d5 c9389d52) {
        if (c9389d52 == null) {
            return false;
        }
        if (c9389d5 == null) {
            return true;
        }
        C9389d5.b m30748l = c9389d52.m30748l();
        C9389d5.b bVar = C9389d5.b.Crashed;
        if (m30748l == bVar && c9389d5.m30748l() != bVar) {
            return true;
        }
        return c9389d52.m30742e() > 0 && c9389d5.m30742e() <= 0;
    }

    /* renamed from: v */
    private void m30733v(AbstractC9342c4 abstractC9342c4, Collection<C9624v0> collection) {
        List<C9624v0> m30574B = abstractC9342c4.m30574B();
        if (m30574B == null || collection.isEmpty()) {
            return;
        }
        m30574B.addAll(collection);
        Collections.sort(m30574B, this.f36268e);
    }

    @Override // io.sentry.InterfaceC9212a2
    @ApiStatus.Internal
    /* renamed from: a */
    public void mo30021a(C9389d5 c9389d5, C9484n1 c9484n1) {
        C9613q.m31802c(c9389d5, "Session is required.");
        if (c9389d5.m30745h() == null || c9389d5.m30745h().isEmpty()) {
            this.f36265b.getLogger().mo30214c(EnumC9554s4.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            mo30025j(C9416h4.m30830a(this.f36265b.getSerializer(), c9389d5, this.f36265b.getSdkVersion()), c9484n1);
        } catch (IOException e2) {
            this.f36265b.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to capture session.", e2);
        }
    }

    @Override // io.sentry.InterfaceC9212a2
    /* renamed from: b */
    public C9525q mo30022b(C9473l4 c9473l4, C9553s3 c9553s3, C9484n1 c9484n1) {
        C9473l4 c9473l42;
        InterfaceC9393e2 m31608u;
        C9495o5 mo30515a;
        C9495o5 c9495o5;
        C9613q.m31802c(c9473l4, "SentryEvent is required.");
        if (c9484n1 == null) {
            c9484n1 = new C9484n1();
        }
        if (m30731t(c9473l4, c9484n1)) {
            m30718d(c9553s3, c9484n1);
        }
        InterfaceC9637w1 logger = this.f36265b.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "Capturing event: %s", c9473l4.m30579G());
        Throwable m30587O = c9473l4.m30587O();
        if (m30587O != null && this.f36265b.containsIgnoredExceptionForType(m30587O)) {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Event was dropped as the exception %s is ignored", m30587O.getClass());
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9368e.EVENT_PROCESSOR, EnumC9655z0.Error);
            return C9525q.f36725f;
        }
        if (m30731t(c9473l4, c9484n1) && (c9473l4 = m30720f(c9473l4, c9553s3, c9484n1)) == null) {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Event was dropped by applyScope", new Object[0]);
            return C9525q.f36725f;
        }
        C9473l4 m30728q = m30728q(c9473l4, c9484n1, this.f36265b.getEventProcessors());
        if (m30728q != null && (m30728q = m30722i(m30728q, c9484n1)) == null) {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Event was dropped by beforeSend", new Object[0]);
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9368e.BEFORE_SEND, EnumC9655z0.Error);
        }
        if (m30728q == null) {
            return C9525q.f36725f;
        }
        C9389d5 m31588C = c9553s3 != null ? c9553s3.m31588C(new C9553s3.b() { // from class: io.sentry.v
            @Override // io.sentry.C9553s3.b
            /* renamed from: a */
            public final void mo31615a(C9389d5 c9389d5) {
                C9388d4.m30726n(c9389d5);
            }
        }) : null;
        C9389d5 m30735w = (m31588C == null || !m31588C.m30749m()) ? m30735w(m30728q, c9484n1, c9553s3) : null;
        if (m30730s()) {
            c9473l42 = m30728q;
        } else {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Event %s was dropped due to sampling decision.", m30728q.m30579G());
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9368e.SAMPLE_RATE, EnumC9655z0.Error);
            c9473l42 = null;
        }
        boolean m30732u = m30732u(m31588C, m30735w);
        if (c9473l42 == null && !m30732u) {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return C9525q.f36725f;
        }
        C9525q c9525q = C9525q.f36725f;
        if (c9473l42 != null && c9473l42.m30579G() != null) {
            c9525q = c9473l42.m30579G();
        }
        try {
            if (C9609m.m31781d(c9484n1, InterfaceC9421d.class)) {
                if (c9473l42 != null) {
                    mo30515a = C9591u0.m31728b(c9473l42, this.f36265b).m31739F();
                    c9495o5 = mo30515a;
                }
                c9495o5 = null;
            } else {
                if (c9553s3 != null) {
                    InterfaceC9393e2 m31608u2 = c9553s3.m31608u();
                    mo30515a = m31608u2 != null ? m31608u2.mo30515a() : C9622v.m31826d(c9553s3, this.f36265b).m31130h();
                    c9495o5 = mo30515a;
                }
                c9495o5 = null;
            }
            C9416h4 m30721g = m30721g(c9473l42, c9473l42 != null ? m30725m(c9484n1) : null, m30735w, c9495o5, null);
            c9484n1.m31072b();
            if (m30721g != null) {
                this.f36266c.mo31675V(m30721g, c9484n1);
            }
        } catch (SentryEnvelopeException | IOException e2) {
            this.f36265b.getLogger().mo30212a(EnumC9554s4.WARNING, e2, "Capturing event %s failed.", c9525q);
            c9525q = C9525q.f36725f;
        }
        if (c9553s3 != null && (m31608u = c9553s3.m31608u()) != null && C9609m.m31781d(c9484n1, InterfaceC9434q.class)) {
            m31608u.mo30519e(EnumC9460j5.ABORTED, false);
        }
        return c9525q;
    }

    @Override // io.sentry.InterfaceC9212a2
    /* renamed from: c */
    public C9525q mo30023c(C9532x c9532x, C9495o5 c9495o5, C9553s3 c9553s3, C9484n1 c9484n1, C9479m3 c9479m3) {
        C9532x c9532x2 = c9532x;
        C9613q.m31802c(c9532x, "Transaction is required.");
        C9484n1 c9484n12 = c9484n1 == null ? new C9484n1() : c9484n1;
        if (m30731t(c9532x, c9484n12)) {
            m30718d(c9553s3, c9484n12);
        }
        InterfaceC9637w1 logger = this.f36265b.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "Capturing transaction: %s", c9532x.m30579G());
        C9525q c9525q = C9525q.f36725f;
        C9525q m30579G = c9532x.m30579G() != null ? c9532x.m30579G() : c9525q;
        if (m30731t(c9532x, c9484n12)) {
            c9532x2 = (C9532x) m30719e(c9532x, c9553s3);
            if (c9532x2 != null && c9553s3 != null) {
                c9532x2 = m30729r(c9532x2, c9484n12, c9553s3.m31599l());
            }
            if (c9532x2 == null) {
                this.f36265b.getLogger().mo30214c(enumC9554s4, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c9532x2 != null) {
            c9532x2 = m30729r(c9532x2, c9484n12, this.f36265b.getEventProcessors());
        }
        if (c9532x2 == null) {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Transaction was dropped by Event processors.", new Object[0]);
            return c9525q;
        }
        C9532x m30723k = m30723k(c9532x2, c9484n12);
        if (m30723k == null) {
            this.f36265b.getLogger().mo30214c(enumC9554s4, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9368e.BEFORE_SEND, EnumC9655z0.Transaction);
            return c9525q;
        }
        try {
            C9416h4 m30721g = m30721g(m30723k, m30724l(m30725m(c9484n12)), null, c9495o5, c9479m3);
            c9484n12.m31072b();
            if (m30721g == null) {
                return c9525q;
            }
            this.f36266c.mo31675V(m30721g, c9484n12);
            return m30579G;
        } catch (SentryEnvelopeException | IOException e2) {
            this.f36265b.getLogger().mo30212a(EnumC9554s4.WARNING, e2, "Capturing transaction %s failed.", m30579G);
            return C9525q.f36725f;
        }
    }

    @Override // io.sentry.InterfaceC9212a2
    public void close() {
        this.f36265b.getLogger().mo30214c(EnumC9554s4.INFO, "Closing SentryClient.", new Object[0]);
        try {
            mo30024h(this.f36265b.getShutdownTimeoutMillis());
            this.f36266c.close();
        } catch (IOException e2) {
            this.f36265b.getLogger().mo30213b(EnumC9554s4.WARNING, "Failed to close the connection to the Sentry Server.", e2);
        }
        for (InterfaceC9463k1 interfaceC9463k1 : this.f36265b.getEventProcessors()) {
            if (interfaceC9463k1 instanceof Closeable) {
                try {
                    ((Closeable) interfaceC9463k1).close();
                } catch (IOException e3) {
                    this.f36265b.getLogger().mo30214c(EnumC9554s4.WARNING, "Failed to close the event processor {}.", interfaceC9463k1, e3);
                }
            }
        }
        this.f36264a = false;
    }

    @Override // io.sentry.InterfaceC9212a2
    /* renamed from: h */
    public void mo30024h(long j2) {
        this.f36266c.mo31676h(j2);
    }

    @Override // io.sentry.InterfaceC9212a2
    @ApiStatus.Internal
    /* renamed from: j */
    public C9525q mo30025j(C9416h4 c9416h4, C9484n1 c9484n1) {
        C9613q.m31802c(c9416h4, "SentryEnvelope is required.");
        if (c9484n1 == null) {
            c9484n1 = new C9484n1();
        }
        try {
            c9484n1.m31072b();
            this.f36266c.mo31675V(c9416h4, c9484n1);
            C9525q m30849a = c9416h4.m30831b().m30849a();
            return m30849a != null ? m30849a : C9525q.f36725f;
        } catch (IOException e2) {
            this.f36265b.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to capture envelope.", e2);
            return C9525q.f36725f;
        }
    }

    /* renamed from: w */
    C9389d5 m30735w(final C9473l4 c9473l4, final C9484n1 c9484n1, C9553s3 c9553s3) {
        if (C9609m.m31794q(c9484n1)) {
            if (c9553s3 != null) {
                return c9553s3.m31588C(new C9553s3.b() { // from class: io.sentry.w
                    @Override // io.sentry.C9553s3.b
                    /* renamed from: a */
                    public final void mo31615a(C9389d5 c9389d5) {
                        C9388d4.this.m30734p(c9473l4, c9484n1, c9389d5);
                    }
                });
            }
            this.f36265b.getLogger().mo30214c(EnumC9554s4.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }
}
