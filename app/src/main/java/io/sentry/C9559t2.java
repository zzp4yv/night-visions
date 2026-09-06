package io.sentry;

import io.sentry.hints.InterfaceC9419b;
import io.sentry.hints.InterfaceC9423f;
import io.sentry.protocol.C9507a0;
import io.sentry.protocol.C9512d;
import io.sentry.protocol.C9524p;
import io.sentry.protocol.C9532x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MainEventProcessor.java */
@ApiStatus.Internal
/* renamed from: io.sentry.t2 */
/* loaded from: classes2.dex */
public final class C9559t2 implements InterfaceC9463k1, Closeable {

    /* renamed from: f */
    private final C9647x4 f36847f;

    /* renamed from: g */
    private final C9215a5 f36848g;

    /* renamed from: h */
    private final C9480m4 f36849h;

    /* renamed from: i */
    private volatile C9491o1 f36850i = null;

    public C9559t2(C9647x4 c9647x4) {
        C9647x4 c9647x42 = (C9647x4) C9613q.m31802c(c9647x4, "The SentryOptions is required.");
        this.f36847f = c9647x42;
        C9659z4 c9659z4 = new C9659z4(c9647x42);
        this.f36849h = new C9480m4(c9659z4);
        this.f36848g = new C9215a5(c9659z4, c9647x42);
    }

    /* renamed from: A */
    private void m31619A(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30584L() == null) {
            abstractC9342c4.m30599a0(this.f36847f.getSdkVersion());
        }
    }

    /* renamed from: B */
    private void m31620B(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30585M() == null) {
            abstractC9342c4.m30600b0(this.f36847f.getServerName());
        }
        if (this.f36847f.isAttachServerName() && abstractC9342c4.m30585M() == null) {
            m31624a();
            if (this.f36850i != null) {
                abstractC9342c4.m30600b0(this.f36850i.m31116b());
            }
        }
    }

    /* renamed from: D */
    private void m31621D(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30586N() == null) {
            abstractC9342c4.m30602d0(new HashMap(this.f36847f.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f36847f.getTags().entrySet()) {
            if (!abstractC9342c4.m30586N().containsKey(entry.getKey())) {
                abstractC9342c4.m30601c0(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: H */
    private void m31622H(C9473l4 c9473l4, C9484n1 c9484n1) {
        if (c9473l4.m31004s0() == null) {
            ArrayList arrayList = null;
            List<C9524p> m31000o0 = c9473l4.m31000o0();
            if (m31000o0 != null && !m31000o0.isEmpty()) {
                for (C9524p c9524p : m31000o0) {
                    if (c9524p.m31441g() != null && c9524p.m31442h() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c9524p.m31442h());
                    }
                }
            }
            if (this.f36847f.isAttachThreads() || C9609m.m31781d(c9484n1, InterfaceC9419b.class)) {
                Object m31780c = C9609m.m31780c(c9484n1);
                c9473l4.m30996C0(this.f36848g.m30054b(arrayList, m31780c instanceof InterfaceC9419b ? ((InterfaceC9419b) m31780c).mo30103d() : false));
            } else if (this.f36847f.isAttachStacktrace()) {
                if ((m31000o0 == null || m31000o0.isEmpty()) && !m31625c(c9484n1)) {
                    c9473l4.m30996C0(this.f36848g.m30053a());
                }
            }
        }
    }

    /* renamed from: I */
    private boolean m31623I(AbstractC9342c4 abstractC9342c4, C9484n1 c9484n1) {
        if (C9609m.m31794q(c9484n1)) {
            return true;
        }
        this.f36847f.getLogger().mo30214c(EnumC9554s4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC9342c4.m30579G());
        return false;
    }

    /* renamed from: a */
    private void m31624a() {
        if (this.f36850i == null) {
            synchronized (this) {
                if (this.f36850i == null) {
                    this.f36850i = C9491o1.m31110c();
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m31625c(C9484n1 c9484n1) {
        return C9609m.m31781d(c9484n1, InterfaceC9423f.class);
    }

    /* renamed from: d */
    private void m31626d(AbstractC9342c4 abstractC9342c4) {
        if (this.f36847f.isSendDefaultPii()) {
            if (abstractC9342c4.m30589Q() == null) {
                C9507a0 c9507a0 = new C9507a0();
                c9507a0.m31220o("{{auto}}");
                abstractC9342c4.m30603e0(c9507a0);
            } else if (abstractC9342c4.m30589Q().m31217l() == null) {
                abstractC9342c4.m30589Q().m31220o("{{auto}}");
            }
        }
    }

    /* renamed from: f */
    private void m31627f(AbstractC9342c4 abstractC9342c4) {
        m31635z(abstractC9342c4);
        m31631m(abstractC9342c4);
        m31620B(abstractC9342c4);
        m31630l(abstractC9342c4);
        m31619A(abstractC9342c4);
        m31621D(abstractC9342c4);
        m31626d(abstractC9342c4);
    }

    /* renamed from: j */
    private void m31628j(AbstractC9342c4 abstractC9342c4) {
        m31634y(abstractC9342c4);
    }

    /* renamed from: k */
    private void m31629k(AbstractC9342c4 abstractC9342c4) {
        ArrayList arrayList = new ArrayList();
        if (this.f36847f.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(this.f36847f.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : this.f36847f.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C9512d m30576D = abstractC9342c4.m30576D();
        if (m30576D == null) {
            m30576D = new C9512d();
        }
        if (m30576D.m31268c() == null) {
            m30576D.m31269d(arrayList);
        } else {
            m30576D.m31268c().addAll(arrayList);
        }
        abstractC9342c4.m30591S(m30576D);
    }

    /* renamed from: l */
    private void m31630l(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30577E() == null) {
            abstractC9342c4.m30592T(this.f36847f.getDist());
        }
    }

    /* renamed from: m */
    private void m31631m(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30578F() == null) {
            abstractC9342c4.m30593U(this.f36847f.getEnvironment());
        }
    }

    /* renamed from: p */
    private void m31632p(C9473l4 c9473l4) {
        Throwable m30588P = c9473l4.m30588P();
        if (m30588P != null) {
            c9473l4.m31009x0(this.f36849h.m31066c(m30588P));
        }
    }

    /* renamed from: x */
    private void m31633x(C9473l4 c9473l4) {
        Map<String, String> mo30866a = this.f36847f.getModulesLoader().mo30866a();
        if (mo30866a == null) {
            return;
        }
        Map<String, String> m31003r0 = c9473l4.m31003r0();
        if (m31003r0 == null) {
            c9473l4.m30995B0(mo30866a);
        } else {
            m31003r0.putAll(mo30866a);
        }
    }

    /* renamed from: y */
    private void m31634y(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30581I() == null) {
            abstractC9342c4.m30596X("java");
        }
    }

    /* renamed from: z */
    private void m31635z(AbstractC9342c4 abstractC9342c4) {
        if (abstractC9342c4.m30582J() == null) {
            abstractC9342c4.m30597Y(this.f36847f.getRelease());
        }
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: b */
    public C9473l4 mo30135b(C9473l4 c9473l4, C9484n1 c9484n1) {
        m31628j(c9473l4);
        m31632p(c9473l4);
        m31629k(c9473l4);
        m31633x(c9473l4);
        if (m31623I(c9473l4, c9484n1)) {
            m31627f(c9473l4);
            m31622H(c9473l4, c9484n1);
        }
        return c9473l4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f36850i != null) {
            this.f36850i.m31115a();
        }
    }

    @Override // io.sentry.InterfaceC9463k1
    /* renamed from: e */
    public C9532x mo30136e(C9532x c9532x, C9484n1 c9484n1) {
        m31628j(c9532x);
        m31629k(c9532x);
        if (m31623I(c9532x, c9484n1)) {
            m31627f(c9532x);
        }
        return c9532x;
    }
}
