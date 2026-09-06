package io.sentry;

import io.sentry.C9417h5;
import io.sentry.EnumC9460j5;
import io.sentry.protocol.C9525q;
import io.sentry.util.C9605i;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SpanContext.java */
/* renamed from: io.sentry.f5 */
/* loaded from: classes2.dex */
public class C9403f5 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final C9525q f36323f;

    /* renamed from: g */
    private final C9417h5 f36324g;

    /* renamed from: h */
    private final C9417h5 f36325h;

    /* renamed from: i */
    private transient C9541q5 f36326i;

    /* renamed from: j */
    protected String f36327j;

    /* renamed from: k */
    protected String f36328k;

    /* renamed from: l */
    protected EnumC9460j5 f36329l;

    /* renamed from: m */
    protected Map<String, String> f36330m;

    /* renamed from: n */
    protected String f36331n;

    /* renamed from: o */
    private Map<String, Object> f36332o;

    /* compiled from: SpanContext.java */
    /* renamed from: io.sentry.f5$a */
    public static final class a implements InterfaceC9471l2<C9403f5> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9403f5 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            String str = null;
            C9525q c9525q = null;
            C9417h5 c9417h5 = null;
            C9417h5 c9417h52 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            EnumC9460j5 enumC9460j5 = null;
            String str3 = null;
            Map<String, String> map = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "span_id":
                        c9417h5 = new C9417h5.a().mo30683a(c9485n2, interfaceC9637w1);
                        break;
                    case "parent_span_id":
                        c9417h52 = (C9417h5) c9485n2.m31089M0(interfaceC9637w1, new C9417h5.a());
                        break;
                    case "description":
                        str2 = c9485n2.m31881J();
                        break;
                    case "origin":
                        str3 = c9485n2.m31881J();
                        break;
                    case "status":
                        enumC9460j5 = (EnumC9460j5) c9485n2.m31089M0(interfaceC9637w1, new EnumC9460j5.a());
                        break;
                    case "op":
                        str = c9485n2.m31881J();
                        break;
                    case "tags":
                        map = C9605i.m31767b((Map) c9485n2.m31088K0());
                        break;
                    case "trace_id":
                        c9525q = new C9525q.a().mo30683a(c9485n2, interfaceC9637w1);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            if (c9525q == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (c9417h5 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            C9403f5 c9403f5 = new C9403f5(c9525q, c9417h5, str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str, c9417h52, null);
            c9403f5.m30804l(str2);
            c9403f5.m30807o(enumC9460j5);
            c9403f5.m30805m(str3);
            if (map != null) {
                c9403f5.f36330m = map;
            }
            c9403f5.m30808p(concurrentHashMap);
            c9485n2.m31889j();
            return c9403f5;
        }
    }

    public C9403f5(String str) {
        this(new C9525q(), new C9417h5(), str, null, null);
    }

    /* renamed from: a */
    public String m30793a() {
        return this.f36328k;
    }

    /* renamed from: b */
    public String m30794b() {
        return this.f36327j;
    }

    /* renamed from: c */
    public String m30795c() {
        return this.f36331n;
    }

    /* renamed from: d */
    public C9417h5 m30796d() {
        return this.f36325h;
    }

    /* renamed from: e */
    public Boolean m30797e() {
        C9541q5 c9541q5 = this.f36326i;
        if (c9541q5 == null) {
            return null;
        }
        return c9541q5.m31560a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9403f5)) {
            return false;
        }
        C9403f5 c9403f5 = (C9403f5) obj;
        return this.f36323f.equals(c9403f5.f36323f) && this.f36324g.equals(c9403f5.f36324g) && C9613q.m31800a(this.f36325h, c9403f5.f36325h) && this.f36327j.equals(c9403f5.f36327j) && C9613q.m31800a(this.f36328k, c9403f5.f36328k) && this.f36329l == c9403f5.f36329l;
    }

    /* renamed from: f */
    public Boolean m30798f() {
        C9541q5 c9541q5 = this.f36326i;
        if (c9541q5 == null) {
            return null;
        }
        return c9541q5.m31562c();
    }

    /* renamed from: g */
    public C9541q5 m30799g() {
        return this.f36326i;
    }

    /* renamed from: h */
    public C9417h5 m30800h() {
        return this.f36324g;
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36323f, this.f36324g, this.f36325h, this.f36327j, this.f36328k, this.f36329l);
    }

    /* renamed from: i */
    public EnumC9460j5 m30801i() {
        return this.f36329l;
    }

    /* renamed from: j */
    public Map<String, String> m30802j() {
        return this.f36330m;
    }

    /* renamed from: k */
    public C9525q m30803k() {
        return this.f36323f;
    }

    /* renamed from: l */
    public void m30804l(String str) {
        this.f36328k = str;
    }

    /* renamed from: m */
    public void m30805m(String str) {
        this.f36331n = str;
    }

    @ApiStatus.Internal
    /* renamed from: n */
    public void m30806n(C9541q5 c9541q5) {
        this.f36326i = c9541q5;
    }

    /* renamed from: o */
    public void m30807o(EnumC9460j5 enumC9460j5) {
        this.f36329l = enumC9460j5;
    }

    /* renamed from: p */
    public void m30808p(Map<String, Object> map) {
        this.f36332o = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("trace_id");
        this.f36323f.serialize(interfaceC9415h3, interfaceC9637w1);
        interfaceC9415h3.mo30828k("span_id");
        this.f36324g.serialize(interfaceC9415h3, interfaceC9637w1);
        if (this.f36325h != null) {
            interfaceC9415h3.mo30828k("parent_span_id");
            this.f36325h.serialize(interfaceC9415h3, interfaceC9637w1);
        }
        interfaceC9415h3.mo30828k("op").mo30819b(this.f36327j);
        if (this.f36328k != null) {
            interfaceC9415h3.mo30828k("description").mo30819b(this.f36328k);
        }
        if (this.f36329l != null) {
            interfaceC9415h3.mo30828k("status").mo30824g(interfaceC9637w1, this.f36329l);
        }
        if (this.f36331n != null) {
            interfaceC9415h3.mo30828k("origin").mo30824g(interfaceC9637w1, this.f36331n);
        }
        if (!this.f36330m.isEmpty()) {
            interfaceC9415h3.mo30828k("tags").mo30824g(interfaceC9637w1, this.f36330m);
        }
        Map<String, Object> map = this.f36332o;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36332o.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9403f5(C9525q c9525q, C9417h5 c9417h5, String str, C9417h5 c9417h52, C9541q5 c9541q5) {
        this(c9525q, c9417h5, c9417h52, str, null, c9541q5, null, "manual");
    }

    @ApiStatus.Internal
    public C9403f5(C9525q c9525q, C9417h5 c9417h5, C9417h5 c9417h52, String str, String str2, C9541q5 c9541q5, EnumC9460j5 enumC9460j5, String str3) {
        this.f36330m = new ConcurrentHashMap();
        this.f36331n = "manual";
        this.f36323f = (C9525q) C9613q.m31802c(c9525q, "traceId is required");
        this.f36324g = (C9417h5) C9613q.m31802c(c9417h5, "spanId is required");
        this.f36327j = (String) C9613q.m31802c(str, "operation is required");
        this.f36325h = c9417h52;
        this.f36326i = c9541q5;
        this.f36328k = str2;
        this.f36329l = enumC9460j5;
        this.f36331n = str3;
    }

    public C9403f5(C9403f5 c9403f5) {
        this.f36330m = new ConcurrentHashMap();
        this.f36331n = "manual";
        this.f36323f = c9403f5.f36323f;
        this.f36324g = c9403f5.f36324g;
        this.f36325h = c9403f5.f36325h;
        this.f36326i = c9403f5.f36326i;
        this.f36327j = c9403f5.f36327j;
        this.f36328k = c9403f5.f36328k;
        this.f36329l = c9403f5.f36329l;
        Map<String, String> m31767b = C9605i.m31767b(c9403f5.f36330m);
        if (m31767b != null) {
            this.f36330m = m31767b;
        }
    }
}
