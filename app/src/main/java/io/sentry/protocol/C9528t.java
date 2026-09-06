package io.sentry.protocol;

import io.sentry.C9211a1;
import io.sentry.C9396e5;
import io.sentry.C9417h5;
import io.sentry.C9485n2;
import io.sentry.EnumC9460j5;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9525q;
import io.sentry.util.C9605i;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentrySpan.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.t */
/* loaded from: classes2.dex */
public final class C9528t implements InterfaceC9545r2 {

    /* renamed from: f */
    private final Double f36734f;

    /* renamed from: g */
    private final Double f36735g;

    /* renamed from: h */
    private final C9525q f36736h;

    /* renamed from: i */
    private final C9417h5 f36737i;

    /* renamed from: j */
    private final C9417h5 f36738j;

    /* renamed from: k */
    private final String f36739k;

    /* renamed from: l */
    private final String f36740l;

    /* renamed from: m */
    private final EnumC9460j5 f36741m;

    /* renamed from: n */
    private final String f36742n;

    /* renamed from: o */
    private final Map<String, String> f36743o;

    /* renamed from: p */
    private final Map<String, Object> f36744p;

    /* renamed from: q */
    private Map<String, Object> f36745q;

    /* compiled from: SentrySpan.java */
    /* renamed from: io.sentry.protocol.t$a */
    public static final class a implements InterfaceC9471l2<C9528t> {
        /* renamed from: c */
        private Exception m31468c(String str, InterfaceC9637w1 interfaceC9637w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9528t mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            Map map = null;
            Double d2 = null;
            Double d3 = null;
            C9525q c9525q = null;
            C9417h5 c9417h5 = null;
            C9417h5 c9417h52 = null;
            String str = null;
            String str2 = null;
            EnumC9460j5 enumC9460j5 = null;
            String str3 = null;
            ConcurrentHashMap concurrentHashMap = null;
            Map map2 = null;
            while (true) {
                Map map3 = map2;
                String str4 = str3;
                EnumC9460j5 enumC9460j52 = enumC9460j5;
                String str5 = str2;
                if (c9485n2.m31882N() != EnumC9633b.NAME) {
                    if (d2 == null) {
                        throw m31468c("start_timestamp", interfaceC9637w1);
                    }
                    if (c9525q == null) {
                        throw m31468c("trace_id", interfaceC9637w1);
                    }
                    if (c9417h5 == null) {
                        throw m31468c("span_id", interfaceC9637w1);
                    }
                    if (str == null) {
                        throw m31468c("op", interfaceC9637w1);
                    }
                    C9528t c9528t = new C9528t(d2, d3, c9525q, c9417h5, c9417h52, str, str5, enumC9460j52, str4, map == null ? new HashMap() : map, map3);
                    c9528t.m31467c(concurrentHashMap);
                    c9485n2.m31889j();
                    return c9528t;
                }
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "span_id":
                        c9417h5 = new C9417h5.a().mo30683a(c9485n2, interfaceC9637w1);
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "parent_span_id":
                        c9417h52 = (C9417h5) c9485n2.m31089M0(interfaceC9637w1, new C9417h5.a());
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "description":
                        str2 = c9485n2.m31090N0();
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        break;
                    case "start_timestamp":
                        try {
                            d2 = c9485n2.m31095t0();
                        } catch (NumberFormatException unused) {
                            Date m31094q0 = c9485n2.m31094q0(interfaceC9637w1);
                            d2 = m31094q0 != null ? Double.valueOf(C9211a1.m30007b(m31094q0)) : null;
                        }
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "origin":
                        str3 = c9485n2.m31090N0();
                        map2 = map3;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "status":
                        enumC9460j5 = (EnumC9460j5) c9485n2.m31089M0(interfaceC9637w1, new EnumC9460j5.a());
                        map2 = map3;
                        str3 = str4;
                        str2 = str5;
                        break;
                    case "op":
                        str = c9485n2.m31090N0();
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "data":
                        map2 = (Map) c9485n2.m31088K0();
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "tags":
                        map = (Map) c9485n2.m31088K0();
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "timestamp":
                        try {
                            d3 = c9485n2.m31095t0();
                        } catch (NumberFormatException unused2) {
                            Date m31094q02 = c9485n2.m31094q0(interfaceC9637w1);
                            d3 = m31094q02 != null ? Double.valueOf(C9211a1.m30007b(m31094q02)) : null;
                        }
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    case "trace_id":
                        c9525q = new C9525q.a().mo30683a(c9485n2, interfaceC9637w1);
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        map2 = map3;
                        str3 = str4;
                        enumC9460j5 = enumC9460j52;
                        str2 = str5;
                        break;
                }
            }
        }
    }

    public C9528t(C9396e5 c9396e5) {
        this(c9396e5, c9396e5.m30771r());
    }

    /* renamed from: a */
    private BigDecimal m31465a(Double d2) {
        return BigDecimal.valueOf(d2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: b */
    public String m31466b() {
        return this.f36739k;
    }

    /* renamed from: c */
    public void m31467c(Map<String, Object> map) {
        this.f36745q = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("start_timestamp").mo30824g(interfaceC9637w1, m31465a(this.f36734f));
        if (this.f36735g != null) {
            interfaceC9415h3.mo30828k("timestamp").mo30824g(interfaceC9637w1, m31465a(this.f36735g));
        }
        interfaceC9415h3.mo30828k("trace_id").mo30824g(interfaceC9637w1, this.f36736h);
        interfaceC9415h3.mo30828k("span_id").mo30824g(interfaceC9637w1, this.f36737i);
        if (this.f36738j != null) {
            interfaceC9415h3.mo30828k("parent_span_id").mo30824g(interfaceC9637w1, this.f36738j);
        }
        interfaceC9415h3.mo30828k("op").mo30819b(this.f36739k);
        if (this.f36740l != null) {
            interfaceC9415h3.mo30828k("description").mo30819b(this.f36740l);
        }
        if (this.f36741m != null) {
            interfaceC9415h3.mo30828k("status").mo30824g(interfaceC9637w1, this.f36741m);
        }
        if (this.f36742n != null) {
            interfaceC9415h3.mo30828k("origin").mo30824g(interfaceC9637w1, this.f36742n);
        }
        if (!this.f36743o.isEmpty()) {
            interfaceC9415h3.mo30828k("tags").mo30824g(interfaceC9637w1, this.f36743o);
        }
        if (this.f36744p != null) {
            interfaceC9415h3.mo30828k("data").mo30824g(interfaceC9637w1, this.f36744p);
        }
        Map<String, Object> map = this.f36745q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36745q.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    @ApiStatus.Internal
    public C9528t(C9396e5 c9396e5, Map<String, Object> map) {
        C9613q.m31802c(c9396e5, "span is required");
        this.f36740l = c9396e5.getDescription();
        this.f36739k = c9396e5.m30772t();
        this.f36737i = c9396e5.m30776x();
        this.f36738j = c9396e5.m30774v();
        this.f36736h = c9396e5.m30778z();
        this.f36741m = c9396e5.getStatus();
        this.f36742n = c9396e5.mo30527m().m30795c();
        Map<String, String> m31767b = C9605i.m31767b(c9396e5.m30777y());
        this.f36743o = m31767b == null ? new ConcurrentHashMap<>() : m31767b;
        this.f36735g = Double.valueOf(C9211a1.m30017l(c9396e5.mo30531q().mo30791v(c9396e5.mo30528n())));
        this.f36734f = Double.valueOf(C9211a1.m30017l(c9396e5.mo30531q().mo30792x()));
        this.f36744p = map;
    }

    @ApiStatus.Internal
    public C9528t(Double d2, Double d3, C9525q c9525q, C9417h5 c9417h5, C9417h5 c9417h52, String str, String str2, EnumC9460j5 enumC9460j5, String str3, Map<String, String> map, Map<String, Object> map2) {
        this.f36734f = d2;
        this.f36735g = d3;
        this.f36736h = c9525q;
        this.f36737i = c9417h5;
        this.f36738j = c9417h52;
        this.f36739k = str;
        this.f36740l = str2;
        this.f36741m = enumC9460j5;
        this.f36743o = map;
        this.f36744p = map2;
        this.f36742n = str3;
    }
}
