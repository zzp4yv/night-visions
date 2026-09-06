package io.sentry;

import io.sentry.C9624v0;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.C9507a0;
import io.sentry.protocol.C9510c;
import io.sentry.protocol.C9512d;
import io.sentry.protocol.C9520l;
import io.sentry.protocol.C9523o;
import io.sentry.protocol.C9525q;
import io.sentry.util.C9605i;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryBaseEvent.java */
/* renamed from: io.sentry.c4 */
/* loaded from: classes2.dex */
public abstract class AbstractC9342c4 {

    /* renamed from: f */
    private C9525q f36187f;

    /* renamed from: g */
    private final C9510c f36188g;

    /* renamed from: h */
    private C9523o f36189h;

    /* renamed from: i */
    private C9520l f36190i;

    /* renamed from: j */
    private Map<String, String> f36191j;

    /* renamed from: k */
    private String f36192k;

    /* renamed from: l */
    private String f36193l;

    /* renamed from: m */
    private String f36194m;

    /* renamed from: n */
    private C9507a0 f36195n;

    /* renamed from: o */
    protected transient Throwable f36196o;

    /* renamed from: p */
    private String f36197p;

    /* renamed from: q */
    private String f36198q;

    /* renamed from: r */
    private List<C9624v0> f36199r;

    /* renamed from: s */
    private C9512d f36200s;

    /* renamed from: t */
    private Map<String, Object> f36201t;

    /* compiled from: SentryBaseEvent.java */
    /* renamed from: io.sentry.c4$a */
    public static final class a {
        /* renamed from: a */
        public boolean m30604a(AbstractC9342c4 abstractC9342c4, String str, C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            str.hashCode();
            switch (str) {
                case "debug_meta":
                    abstractC9342c4.f36200s = (C9512d) c9485n2.m31089M0(interfaceC9637w1, new C9512d.a());
                    return true;
                case "server_name":
                    abstractC9342c4.f36197p = c9485n2.m31090N0();
                    return true;
                case "contexts":
                    abstractC9342c4.f36188g.putAll(new C9510c.a().mo30683a(c9485n2, interfaceC9637w1));
                    return true;
                case "environment":
                    abstractC9342c4.f36193l = c9485n2.m31090N0();
                    return true;
                case "breadcrumbs":
                    abstractC9342c4.f36199r = c9485n2.m31085F0(interfaceC9637w1, new C9624v0.a());
                    return true;
                case "sdk":
                    abstractC9342c4.f36189h = (C9523o) c9485n2.m31089M0(interfaceC9637w1, new C9523o.a());
                    return true;
                case "dist":
                    abstractC9342c4.f36198q = c9485n2.m31090N0();
                    return true;
                case "tags":
                    abstractC9342c4.f36191j = C9605i.m31767b((Map) c9485n2.m31088K0());
                    return true;
                case "user":
                    abstractC9342c4.f36195n = (C9507a0) c9485n2.m31089M0(interfaceC9637w1, new C9507a0.a());
                    return true;
                case "extra":
                    abstractC9342c4.f36201t = C9605i.m31767b((Map) c9485n2.m31088K0());
                    return true;
                case "event_id":
                    abstractC9342c4.f36187f = (C9525q) c9485n2.m31089M0(interfaceC9637w1, new C9525q.a());
                    return true;
                case "release":
                    abstractC9342c4.f36192k = c9485n2.m31090N0();
                    return true;
                case "request":
                    abstractC9342c4.f36190i = (C9520l) c9485n2.m31089M0(interfaceC9637w1, new C9520l.a());
                    return true;
                case "platform":
                    abstractC9342c4.f36194m = c9485n2.m31090N0();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* compiled from: SentryBaseEvent.java */
    /* renamed from: io.sentry.c4$b */
    public static final class b {
        /* renamed from: a */
        public void m30605a(AbstractC9342c4 abstractC9342c4, InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
            if (abstractC9342c4.f36187f != null) {
                interfaceC9415h3.mo30828k("event_id").mo30824g(interfaceC9637w1, abstractC9342c4.f36187f);
            }
            interfaceC9415h3.mo30828k("contexts").mo30824g(interfaceC9637w1, abstractC9342c4.f36188g);
            if (abstractC9342c4.f36189h != null) {
                interfaceC9415h3.mo30828k("sdk").mo30824g(interfaceC9637w1, abstractC9342c4.f36189h);
            }
            if (abstractC9342c4.f36190i != null) {
                interfaceC9415h3.mo30828k("request").mo30824g(interfaceC9637w1, abstractC9342c4.f36190i);
            }
            if (abstractC9342c4.f36191j != null && !abstractC9342c4.f36191j.isEmpty()) {
                interfaceC9415h3.mo30828k("tags").mo30824g(interfaceC9637w1, abstractC9342c4.f36191j);
            }
            if (abstractC9342c4.f36192k != null) {
                interfaceC9415h3.mo30828k("release").mo30819b(abstractC9342c4.f36192k);
            }
            if (abstractC9342c4.f36193l != null) {
                interfaceC9415h3.mo30828k("environment").mo30819b(abstractC9342c4.f36193l);
            }
            if (abstractC9342c4.f36194m != null) {
                interfaceC9415h3.mo30828k("platform").mo30819b(abstractC9342c4.f36194m);
            }
            if (abstractC9342c4.f36195n != null) {
                interfaceC9415h3.mo30828k("user").mo30824g(interfaceC9637w1, abstractC9342c4.f36195n);
            }
            if (abstractC9342c4.f36197p != null) {
                interfaceC9415h3.mo30828k("server_name").mo30819b(abstractC9342c4.f36197p);
            }
            if (abstractC9342c4.f36198q != null) {
                interfaceC9415h3.mo30828k("dist").mo30819b(abstractC9342c4.f36198q);
            }
            if (abstractC9342c4.f36199r != null && !abstractC9342c4.f36199r.isEmpty()) {
                interfaceC9415h3.mo30828k("breadcrumbs").mo30824g(interfaceC9637w1, abstractC9342c4.f36199r);
            }
            if (abstractC9342c4.f36200s != null) {
                interfaceC9415h3.mo30828k("debug_meta").mo30824g(interfaceC9637w1, abstractC9342c4.f36200s);
            }
            if (abstractC9342c4.f36201t == null || abstractC9342c4.f36201t.isEmpty()) {
                return;
            }
            interfaceC9415h3.mo30828k("extra").mo30824g(interfaceC9637w1, abstractC9342c4.f36201t);
        }
    }

    protected AbstractC9342c4(C9525q c9525q) {
        this.f36188g = new C9510c();
        this.f36187f = c9525q;
    }

    /* renamed from: B */
    public List<C9624v0> m30574B() {
        return this.f36199r;
    }

    /* renamed from: C */
    public C9510c m30575C() {
        return this.f36188g;
    }

    /* renamed from: D */
    public C9512d m30576D() {
        return this.f36200s;
    }

    /* renamed from: E */
    public String m30577E() {
        return this.f36198q;
    }

    /* renamed from: F */
    public String m30578F() {
        return this.f36193l;
    }

    /* renamed from: G */
    public C9525q m30579G() {
        return this.f36187f;
    }

    /* renamed from: H */
    public Map<String, Object> m30580H() {
        return this.f36201t;
    }

    /* renamed from: I */
    public String m30581I() {
        return this.f36194m;
    }

    /* renamed from: J */
    public String m30582J() {
        return this.f36192k;
    }

    /* renamed from: K */
    public C9520l m30583K() {
        return this.f36190i;
    }

    /* renamed from: L */
    public C9523o m30584L() {
        return this.f36189h;
    }

    /* renamed from: M */
    public String m30585M() {
        return this.f36197p;
    }

    @ApiStatus.Internal
    /* renamed from: N */
    public Map<String, String> m30586N() {
        return this.f36191j;
    }

    /* renamed from: O */
    public Throwable m30587O() {
        Throwable th = this.f36196o;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).m30781c() : th;
    }

    @ApiStatus.Internal
    /* renamed from: P */
    public Throwable m30588P() {
        return this.f36196o;
    }

    /* renamed from: Q */
    public C9507a0 m30589Q() {
        return this.f36195n;
    }

    /* renamed from: R */
    public void m30590R(List<C9624v0> list) {
        this.f36199r = C9605i.m31766a(list);
    }

    /* renamed from: S */
    public void m30591S(C9512d c9512d) {
        this.f36200s = c9512d;
    }

    /* renamed from: T */
    public void m30592T(String str) {
        this.f36198q = str;
    }

    /* renamed from: U */
    public void m30593U(String str) {
        this.f36193l = str;
    }

    /* renamed from: V */
    public void m30594V(String str, Object obj) {
        if (this.f36201t == null) {
            this.f36201t = new HashMap();
        }
        this.f36201t.put(str, obj);
    }

    /* renamed from: W */
    public void m30595W(Map<String, Object> map) {
        this.f36201t = C9605i.m31768c(map);
    }

    /* renamed from: X */
    public void m30596X(String str) {
        this.f36194m = str;
    }

    /* renamed from: Y */
    public void m30597Y(String str) {
        this.f36192k = str;
    }

    /* renamed from: Z */
    public void m30598Z(C9520l c9520l) {
        this.f36190i = c9520l;
    }

    /* renamed from: a0 */
    public void m30599a0(C9523o c9523o) {
        this.f36189h = c9523o;
    }

    /* renamed from: b0 */
    public void m30600b0(String str) {
        this.f36197p = str;
    }

    /* renamed from: c0 */
    public void m30601c0(String str, String str2) {
        if (this.f36191j == null) {
            this.f36191j = new HashMap();
        }
        this.f36191j.put(str, str2);
    }

    /* renamed from: d0 */
    public void m30602d0(Map<String, String> map) {
        this.f36191j = C9605i.m31768c(map);
    }

    /* renamed from: e0 */
    public void m30603e0(C9507a0 c9507a0) {
        this.f36195n = c9507a0;
    }

    protected AbstractC9342c4() {
        this(new C9525q());
    }
}
