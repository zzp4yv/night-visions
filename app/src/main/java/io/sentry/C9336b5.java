package io.sentry;

import io.sentry.C9553s3;
import io.sentry.protocol.C9507a0;
import io.sentry.protocol.C9510c;
import io.sentry.protocol.C9516h;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;
import io.sentry.protocol.EnumC9534z;
import io.sentry.util.C9613q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryTracer.java */
@ApiStatus.Internal
/* renamed from: io.sentry.b5 */
/* loaded from: classes2.dex */
public final class C9336b5 implements InterfaceC9393e2 {

    /* renamed from: b */
    private final C9396e5 f36154b;

    /* renamed from: d */
    private final InterfaceC9625v1 f36156d;

    /* renamed from: e */
    private String f36157e;

    /* renamed from: g */
    private volatile TimerTask f36159g;

    /* renamed from: h */
    private volatile Timer f36160h;

    /* renamed from: k */
    private final C9591u0 f36163k;

    /* renamed from: l */
    private EnumC9534z f36164l;

    /* renamed from: m */
    private final Map<String, C9516h> f36165m;

    /* renamed from: n */
    private final EnumC9414h2 f36166n;

    /* renamed from: p */
    private final InterfaceC9596u5 f36168p;

    /* renamed from: q */
    private final C9562t5 f36169q;

    /* renamed from: a */
    private final C9525q f36153a = new C9525q();

    /* renamed from: c */
    private final List<C9396e5> f36155c = new CopyOnWriteArrayList();

    /* renamed from: f */
    private b f36158f = b.f36171a;

    /* renamed from: i */
    private final Object f36161i = new Object();

    /* renamed from: j */
    private final AtomicBoolean f36162j = new AtomicBoolean(false);

    /* renamed from: o */
    private final C9510c f36167o = new C9510c();

    /* compiled from: SentryTracer.java */
    /* renamed from: io.sentry.b5$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C9336b5.this.m30504w();
        }
    }

    /* compiled from: SentryTracer.java */
    /* renamed from: io.sentry.b5$b */
    private static final class b {

        /* renamed from: a */
        static final b f36171a = m30539d();

        /* renamed from: b */
        private final boolean f36172b;

        /* renamed from: c */
        private final EnumC9460j5 f36173c;

        private b(boolean z, EnumC9460j5 enumC9460j5) {
            this.f36172b = z;
            this.f36173c = enumC9460j5;
        }

        /* renamed from: c */
        static b m30538c(EnumC9460j5 enumC9460j5) {
            return new b(true, enumC9460j5);
        }

        /* renamed from: d */
        private static b m30539d() {
            return new b(false, null);
        }
    }

    C9336b5(C9548r5 c9548r5, InterfaceC9625v1 interfaceC9625v1, C9562t5 c9562t5, InterfaceC9596u5 interfaceC9596u5) {
        this.f36160h = null;
        C9613q.m31802c(c9548r5, "context is required");
        C9613q.m31802c(interfaceC9625v1, "hub is required");
        this.f36165m = new ConcurrentHashMap();
        this.f36154b = new C9396e5(c9548r5, this, interfaceC9625v1, c9562t5.m31652g(), c9562t5);
        this.f36157e = c9548r5.m31568t();
        this.f36166n = c9548r5.m31567s();
        this.f36156d = interfaceC9625v1;
        this.f36168p = interfaceC9596u5;
        this.f36164l = c9548r5.m31570v();
        this.f36169q = c9562t5;
        if (c9548r5.m31566r() != null) {
            this.f36163k = c9548r5.m31566r();
        } else {
            this.f36163k = new C9591u0(interfaceC9625v1.mo31156q().getLogger());
        }
        if (interfaceC9596u5 != null && Boolean.TRUE.equals(m30508E())) {
            interfaceC9596u5.mo30544b(this);
        }
        if (c9562t5.m31651f() != null) {
            this.f36160h = new Timer(true);
            mo30526l();
        }
    }

    /* renamed from: D */
    private boolean m30494D() {
        ArrayList arrayList = new ArrayList(this.f36155c);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C9396e5) it.next()).mo30516b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30510H(C9396e5 c9396e5) {
        b bVar = this.f36158f;
        if (this.f36169q.m31651f() == null) {
            if (bVar.f36172b) {
                mo30518d(bVar.f36173c);
            }
        } else if (!this.f36169q.m31655j() || m30494D()) {
            mo30526l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30511J(C9553s3 c9553s3, InterfaceC9393e2 interfaceC9393e2) {
        if (interfaceC9393e2 == this) {
            c9553s3.m31594e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30512L(final C9553s3 c9553s3) {
        c9553s3.m31589D(new C9553s3.c() { // from class: io.sentry.p0
            @Override // io.sentry.C9553s3.c
            /* renamed from: a */
            public final void mo30201a(InterfaceC9393e2 interfaceC9393e2) {
                C9336b5.this.m30511J(c9553s3, interfaceC9393e2);
            }
        });
    }

    /* renamed from: P */
    private void m30499P() {
        synchronized (this) {
            if (this.f36163k.m31753q()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f36156d.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.n0
                    @Override // io.sentry.InterfaceC9560t3
                    /* renamed from: a */
                    public final void mo30217a(C9553s3 c9553s3) {
                        atomicReference.set(c9553s3.m31610w());
                    }
                });
                this.f36163k.m31738E(this, (C9507a0) atomicReference.get(), this.f36156d.mo31156q(), m30506B());
                this.f36163k.m31740a();
            }
        }
    }

    /* renamed from: s */
    private void m30501s() {
        synchronized (this.f36161i) {
            if (this.f36159g != null) {
                this.f36159g.cancel();
                this.f36162j.set(false);
                this.f36159g = null;
            }
        }
    }

    /* renamed from: t */
    private InterfaceC9386d2 m30502t(C9417h5 c9417h5, String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2, C9441i5 c9441i5) {
        if (this.f36154b.mo30516b()) {
            return C9341c3.m30546r();
        }
        if (!this.f36166n.equals(enumC9414h2)) {
            return C9341c3.m30546r();
        }
        C9613q.m31802c(c9417h5, "parentSpanId is required");
        C9613q.m31802c(str, "operation is required");
        m30501s();
        C9396e5 c9396e5 = new C9396e5(this.f36154b.m30778z(), c9417h5, this, str, this.f36156d, abstractC9402f4, c9441i5, new InterfaceC9410g5() { // from class: io.sentry.o0
            @Override // io.sentry.InterfaceC9410g5
            /* renamed from: a */
            public final void mo30814a(C9396e5 c9396e52) {
                C9336b5.this.m30510H(c9396e52);
            }
        });
        c9396e5.mo30524j(str2);
        c9396e5.m30768C("thread.id", String.valueOf(Thread.currentThread().getId()));
        c9396e5.m30768C("thread.name", this.f36156d.mo31156q().getMainThreadChecker().mo30277d() ? "main" : Thread.currentThread().getName());
        this.f36155c.add(c9396e5);
        return c9396e5;
    }

    /* renamed from: u */
    private InterfaceC9386d2 m30503u(String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2, C9441i5 c9441i5) {
        if (this.f36154b.mo30516b()) {
            return C9341c3.m30546r();
        }
        if (!this.f36166n.equals(enumC9414h2)) {
            return C9341c3.m30546r();
        }
        if (this.f36155c.size() < this.f36156d.mo31156q().getMaxSpans()) {
            return this.f36154b.m30770E(str, str2, abstractC9402f4, enumC9414h2, c9441i5);
        }
        this.f36156d.mo31156q().getLogger().mo30214c(EnumC9554s4.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return C9341c3.m30546r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m30504w() {
        EnumC9460j5 status = getStatus();
        if (status == null) {
            status = EnumC9460j5.OK;
        }
        mo30518d(status);
        this.f36162j.set(false);
    }

    /* renamed from: A */
    C9396e5 m30505A() {
        return this.f36154b;
    }

    /* renamed from: B */
    public C9541q5 m30506B() {
        return this.f36154b.m30775w();
    }

    /* renamed from: C */
    public List<C9396e5> m30507C() {
        return this.f36155c;
    }

    /* renamed from: E */
    public Boolean m30508E() {
        return this.f36154b.m30766A();
    }

    /* renamed from: F */
    public Boolean m30509F() {
        return this.f36154b.m30767B();
    }

    /* renamed from: N */
    InterfaceC9386d2 m30513N(C9417h5 c9417h5, String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2, C9441i5 c9441i5) {
        return m30502t(c9417h5, str, str2, abstractC9402f4, enumC9414h2, c9441i5);
    }

    /* renamed from: O */
    public InterfaceC9386d2 m30514O(String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2, C9441i5 c9441i5) {
        return m30503u(str, str2, abstractC9402f4, enumC9414h2, c9441i5);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: a */
    public C9495o5 mo30515a() {
        if (!this.f36156d.mo31156q().isTraceSampling()) {
            return null;
        }
        m30499P();
        return this.f36163k.m31739F();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: b */
    public boolean mo30516b() {
        return this.f36154b.mo30516b();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: c */
    public boolean mo30517c(AbstractC9402f4 abstractC9402f4) {
        return this.f36154b.mo30517c(abstractC9402f4);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: d */
    public void mo30518d(EnumC9460j5 enumC9460j5) {
        mo30529o(enumC9460j5, null);
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: e */
    public void mo30519e(EnumC9460j5 enumC9460j5, boolean z) {
        if (mo30516b()) {
            return;
        }
        AbstractC9402f4 mo30210a = this.f36156d.mo31156q().getDateProvider().mo30210a();
        List<C9396e5> list = this.f36155c;
        ListIterator<C9396e5> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C9396e5 previous = listIterator.previous();
            previous.m30769D(null);
            previous.mo30529o(enumC9460j5, mo30210a);
        }
        m30532v(enumC9460j5, mo30210a, z);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: f */
    public InterfaceC9386d2 mo30520f(String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2) {
        return m30514O(str, str2, abstractC9402f4, enumC9414h2, new C9441i5());
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: g */
    public void mo30521g() {
        mo30518d(getStatus());
    }

    @Override // io.sentry.InterfaceC9386d2
    public String getDescription() {
        return this.f36154b.getDescription();
    }

    @Override // io.sentry.InterfaceC9393e2
    public String getName() {
        return this.f36157e;
    }

    @Override // io.sentry.InterfaceC9386d2
    public EnumC9460j5 getStatus() {
        return this.f36154b.getStatus();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: h */
    public void mo30522h(String str, Number number, InterfaceC9626v2 interfaceC9626v2) {
        if (this.f36154b.mo30516b()) {
            return;
        }
        this.f36165m.put(str, new C9516h(number, interfaceC9626v2.apiName()));
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: i */
    public C9396e5 mo30523i() {
        ArrayList arrayList = new ArrayList(this.f36155c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((C9396e5) arrayList.get(size)).mo30516b()) {
                return (C9396e5) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: j */
    public void mo30524j(String str) {
        if (this.f36154b.mo30516b()) {
            return;
        }
        this.f36154b.mo30524j(str);
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: k */
    public C9525q mo30525k() {
        return this.f36153a;
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: l */
    public void mo30526l() {
        synchronized (this.f36161i) {
            m30501s();
            if (this.f36160h != null) {
                this.f36162j.set(true);
                this.f36159g = new a();
                try {
                    this.f36160h.schedule(this.f36159g, this.f36169q.m31651f().longValue());
                } catch (Throwable th) {
                    this.f36156d.mo31156q().getLogger().mo30213b(EnumC9554s4.WARNING, "Failed to schedule finish timer", th);
                    m30504w();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: m */
    public C9403f5 mo30527m() {
        return this.f36154b.mo30527m();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: n */
    public AbstractC9402f4 mo30528n() {
        return this.f36154b.mo30528n();
    }

    @Override // io.sentry.InterfaceC9386d2
    @ApiStatus.Internal
    /* renamed from: o */
    public void mo30529o(EnumC9460j5 enumC9460j5, AbstractC9402f4 abstractC9402f4) {
        m30532v(enumC9460j5, abstractC9402f4, true);
    }

    @Override // io.sentry.InterfaceC9393e2
    /* renamed from: p */
    public EnumC9534z mo30530p() {
        return this.f36164l;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: q */
    public AbstractC9402f4 mo30531q() {
        return this.f36154b.mo30531q();
    }

    /* renamed from: v */
    public void m30532v(EnumC9460j5 enumC9460j5, AbstractC9402f4 abstractC9402f4, boolean z) {
        AbstractC9402f4 mo30528n = this.f36154b.mo30528n();
        if (abstractC9402f4 == null) {
            abstractC9402f4 = mo30528n;
        }
        if (abstractC9402f4 == null) {
            abstractC9402f4 = this.f36156d.mo31156q().getDateProvider().mo30210a();
        }
        for (C9396e5 c9396e5 : this.f36155c) {
            if (c9396e5.m30773u().m30855a()) {
                c9396e5.mo30529o(enumC9460j5 != null ? enumC9460j5 : mo30527m().f36329l, abstractC9402f4);
            }
        }
        this.f36158f = b.m30538c(enumC9460j5);
        if (this.f36154b.mo30516b()) {
            return;
        }
        if (!this.f36169q.m31655j() || m30494D()) {
            InterfaceC9596u5 interfaceC9596u5 = this.f36168p;
            List<C9465k3> m30542e = interfaceC9596u5 != null ? interfaceC9596u5.m30542e(this) : null;
            Boolean bool = Boolean.TRUE;
            C9479m3 mo30350a = (bool.equals(m30509F()) && bool.equals(m30508E())) ? this.f36156d.mo31156q().getTransactionProfiler().mo30350a(this, m30542e) : null;
            if (m30542e != null) {
                m30542e.clear();
            }
            for (C9396e5 c9396e52 : this.f36155c) {
                if (!c9396e52.mo30516b()) {
                    c9396e52.m30769D(null);
                    c9396e52.mo30529o(EnumC9460j5.DEADLINE_EXCEEDED, abstractC9402f4);
                }
            }
            this.f36154b.mo30529o(this.f36158f.f36173c, abstractC9402f4);
            this.f36156d.mo31154o(new InterfaceC9560t3() { // from class: io.sentry.m0
                @Override // io.sentry.InterfaceC9560t3
                /* renamed from: a */
                public final void mo30217a(C9553s3 c9553s3) {
                    C9336b5.this.m30512L(c9553s3);
                }
            });
            C9532x c9532x = new C9532x(this);
            InterfaceC9555s5 m31653h = this.f36169q.m31653h();
            if (m31653h != null) {
                m31653h.mo30354a(this);
            }
            if (this.f36160h != null) {
                synchronized (this.f36161i) {
                    if (this.f36160h != null) {
                        this.f36160h.cancel();
                        this.f36160h = null;
                    }
                }
            }
            if (z && this.f36155c.isEmpty() && this.f36169q.m31651f() != null) {
                this.f36156d.mo31156q().getLogger().mo30214c(EnumC9554s4.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f36157e);
            } else {
                c9532x.m31539m0().putAll(this.f36165m);
                this.f36156d.mo31157r(c9532x, mo30515a(), null, mo30350a);
            }
        }
    }

    /* renamed from: x */
    public List<C9396e5> m30533x() {
        return this.f36155c;
    }

    @ApiStatus.Internal
    /* renamed from: y */
    public C9510c m30534y() {
        return this.f36167o;
    }

    /* renamed from: z */
    public Map<String, Object> m30535z() {
        return this.f36154b.m30771r();
    }
}
