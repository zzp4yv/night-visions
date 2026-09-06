package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.AbstractC9342c4;
import io.sentry.C9211a1;
import io.sentry.C9473l4;
import io.sentry.C9484n1;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9463k1;
import io.sentry.android.core.C9313t0;
import io.sentry.android.core.internal.util.C9278h;
import io.sentry.protocol.C9506a;
import io.sentry.protocol.C9507a0;
import io.sentry.protocol.C9519k;
import io.sentry.protocol.C9531w;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: DefaultAndroidEventProcessor.java */
/* renamed from: io.sentry.android.core.v0 */
/* loaded from: classes2.dex */
final class C9317v0 implements InterfaceC9463k1 {

    /* renamed from: f */
    final Context f36110f;

    /* renamed from: g */
    private final C9311s0 f36111g;

    /* renamed from: h */
    private final SentryAndroidOptions f36112h;

    /* renamed from: i */
    private final Future<C9319w0> f36113i;

    public C9317v0(final Context context, C9311s0 c9311s0, final SentryAndroidOptions sentryAndroidOptions) {
        this.f36110f = (Context) C9613q.m31802c(context, "The application context is required.");
        this.f36111g = (C9311s0) C9613q.m31802c(c9311s0, "The BuildInfoProvider is required.");
        this.f36112h = (SentryAndroidOptions) C9613q.m31802c(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f36113i = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9319w0 m30460p;
                m30460p = C9319w0.m30460p(context, sentryAndroidOptions);
                return m30460p;
            }
        });
        newSingleThreadExecutor.shutdown();
    }

    /* renamed from: d */
    private void m30432d(AbstractC9342c4 abstractC9342c4) {
        String str;
        C9519k m31232c = abstractC9342c4.m30575C().m31232c();
        try {
            abstractC9342c4.m30575C().m31239k(this.f36113i.get().m30471r());
        } catch (Throwable th) {
            this.f36112h.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to retrieve os system", th);
        }
        if (m31232c != null) {
            String m31388g = m31232c.m31388g();
            if (m31388g == null || m31388g.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + m31388g.trim().toLowerCase(Locale.ROOT);
            }
            abstractC9342c4.m30575C().put(str, m31232c);
        }
    }

    /* renamed from: f */
    private void m30433f(AbstractC9342c4 abstractC9342c4) {
        C9507a0 m30589Q = abstractC9342c4.m30589Q();
        if (m30589Q == null) {
            abstractC9342c4.m30603e0(m30443a(this.f36110f));
        } else if (m30589Q.m31216k() == null) {
            m30589Q.m31219n(C9229a1.m30148a(this.f36110f));
        }
    }

    /* renamed from: g */
    private void m30434g(AbstractC9342c4 abstractC9342c4, C9484n1 c9484n1) {
        C9506a m31230a = abstractC9342c4.m30575C().m31230a();
        if (m31230a == null) {
            m31230a = new C9506a();
        }
        m30435h(m31230a, c9484n1);
        m30439l(abstractC9342c4, m31230a);
        abstractC9342c4.m30575C().m31235f(m31230a);
    }

    /* renamed from: h */
    private void m30435h(C9506a c9506a, C9484n1 c9484n1) {
        Boolean m30400b;
        c9506a.m31198m(C9313t0.m30410b(this.f36110f, this.f36112h.getLogger()));
        c9506a.m31199n(C9211a1.m30019n(C9307q0.m30389e().m30393d()));
        if (C9609m.m31782e(c9484n1) || c9506a.m31195j() != null || (m30400b = C9309r0.m30399a().m30400b()) == null) {
            return;
        }
        c9506a.m31201p(Boolean.valueOf(!m30400b.booleanValue()));
    }

    /* renamed from: i */
    private void m30436i(AbstractC9342c4 abstractC9342c4, boolean z, boolean z2) {
        m30433f(abstractC9342c4);
        m30437j(abstractC9342c4, z, z2);
        m30440m(abstractC9342c4);
    }

    /* renamed from: j */
    private void m30437j(AbstractC9342c4 abstractC9342c4, boolean z, boolean z2) {
        if (abstractC9342c4.m30575C().m31231b() == null) {
            try {
                abstractC9342c4.m30575C().m31237i(this.f36113i.get().m30470a(z, z2));
            } catch (Throwable th) {
                this.f36112h.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to retrieve device info", th);
            }
            m30432d(abstractC9342c4);
        }
    }

    /* renamed from: k */
    private void m30438k(AbstractC9342c4 abstractC9342c4, String str) {
        if (abstractC9342c4.m30577E() == null) {
            abstractC9342c4.m30592T(str);
        }
    }

    /* renamed from: l */
    private void m30439l(AbstractC9342c4 abstractC9342c4, C9506a c9506a) {
        PackageInfo m30417i = C9313t0.m30417i(this.f36110f, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, this.f36112h.getLogger(), this.f36111g);
        if (m30417i != null) {
            m30438k(abstractC9342c4, C9313t0.m30419k(m30417i, this.f36111g));
            C9313t0.m30425q(m30417i, this.f36111g, c9506a);
        }
    }

    /* renamed from: m */
    private void m30440m(AbstractC9342c4 abstractC9342c4) {
        try {
            C9313t0.a m30472t = this.f36113i.get().m30472t();
            if (m30472t != null) {
                for (Map.Entry<String, String> entry : m30472t.m30426a().entrySet()) {
                    abstractC9342c4.m30601c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f36112h.getLogger().mo30213b(EnumC9554s4.ERROR, "Error getting side loaded info.", th);
        }
    }

    /* renamed from: n */
    private void m30441n(C9473l4 c9473l4, C9484n1 c9484n1) {
        if (c9473l4.m31004s0() != null) {
            boolean m31782e = C9609m.m31782e(c9484n1);
            for (C9531w c9531w : c9473l4.m31004s0()) {
                boolean mo30275b = C9278h.m30273e().mo30275b(c9531w);
                if (c9531w.m31519o() == null) {
                    c9531w.m31522r(Boolean.valueOf(mo30275b));
                }
                if (!m31782e && c9531w.m31520p() == null) {
                    c9531w.m31526v(Boolean.valueOf(mo30275b));
                }
            }
        }
    }

    /* renamed from: o */
    private boolean m30442o(AbstractC9342c4 abstractC9342c4, C9484n1 c9484n1) {
        if (C9609m.m31794q(c9484n1)) {
            return true;
        }
        this.f36112h.getLogger().mo30214c(EnumC9554s4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC9342c4.m30579G());
        return false;
    }

    /* renamed from: a */
    public C9507a0 m30443a(Context context) {
        C9507a0 c9507a0 = new C9507a0();
        c9507a0.m31219n(C9229a1.m30148a(context));
        return c9507a0;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        boolean m30442o = m30442o(c9473l4, c9484n1);
        if (m30442o) {
            m30434g(c9473l4, c9484n1);
            m30441n(c9473l4, c9484n1);
        }
        m30436i(c9473l4, true, m30442o);
        return c9473l4;
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        boolean m30442o = m30442o(c9532x, c9484n1);
        if (m30442o) {
            m30434g(c9532x, c9484n1);
        }
        m30436i(c9532x, false, m30442o);
        return c9532x;
    }
}
