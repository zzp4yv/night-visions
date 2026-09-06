package io.sentry.protocol;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9605i;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Device.java */
/* renamed from: io.sentry.protocol.e */
/* loaded from: classes2.dex */
public final class C9513e implements InterfaceC9545r2 {

    /* renamed from: A */
    private Integer f36618A;

    /* renamed from: B */
    private Float f36619B;

    /* renamed from: C */
    private Integer f36620C;

    /* renamed from: D */
    private Date f36621D;

    /* renamed from: E */
    private TimeZone f36622E;

    /* renamed from: F */
    private String f36623F;

    /* renamed from: G */
    @Deprecated
    private String f36624G;

    /* renamed from: H */
    private String f36625H;

    /* renamed from: I */
    private String f36626I;

    /* renamed from: J */
    private Float f36627J;

    /* renamed from: K */
    private Integer f36628K;

    /* renamed from: L */
    private Double f36629L;

    /* renamed from: M */
    private String f36630M;

    /* renamed from: N */
    private Map<String, Object> f36631N;

    /* renamed from: f */
    private String f36632f;

    /* renamed from: g */
    private String f36633g;

    /* renamed from: h */
    private String f36634h;

    /* renamed from: i */
    private String f36635i;

    /* renamed from: j */
    private String f36636j;

    /* renamed from: k */
    private String f36637k;

    /* renamed from: l */
    private String[] f36638l;

    /* renamed from: m */
    private Float f36639m;

    /* renamed from: n */
    private Boolean f36640n;

    /* renamed from: o */
    private Boolean f36641o;

    /* renamed from: p */
    private b f36642p;

    /* renamed from: q */
    private Boolean f36643q;

    /* renamed from: r */
    private Long f36644r;

    /* renamed from: s */
    private Long f36645s;

    /* renamed from: t */
    private Long f36646t;

    /* renamed from: u */
    private Boolean f36647u;

    /* renamed from: v */
    private Long f36648v;

    /* renamed from: w */
    private Long f36649w;

    /* renamed from: x */
    private Long f36650x;

    /* renamed from: y */
    private Long f36651y;

    /* renamed from: z */
    private Integer f36652z;

    /* compiled from: Device.java */
    /* renamed from: io.sentry.protocol.e$a */
    public static final class a implements InterfaceC9471l2<C9513e> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9513e mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9513e c9513e = new C9513e();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "timezone":
                        c9513e.f36622E = c9485n2.m31091Q0(interfaceC9637w1);
                        break;
                    case "boot_time":
                        if (c9485n2.m31882N() != EnumC9633b.STRING) {
                            break;
                        } else {
                            c9513e.f36621D = c9485n2.m31094q0(interfaceC9637w1);
                            break;
                        }
                    case "simulator":
                        c9513e.f36643q = c9485n2.m31093p0();
                        break;
                    case "manufacturer":
                        c9513e.f36633g = c9485n2.m31090N0();
                        break;
                    case "language":
                        c9513e.f36624G = c9485n2.m31090N0();
                        break;
                    case "processor_count":
                        c9513e.f36628K = c9485n2.m31084E0();
                        break;
                    case "orientation":
                        c9513e.f36642p = (b) c9485n2.m31089M0(interfaceC9637w1, new b.a());
                        break;
                    case "battery_temperature":
                        c9513e.f36627J = c9485n2.m31097y0();
                        break;
                    case "family":
                        c9513e.f36635i = c9485n2.m31090N0();
                        break;
                    case "locale":
                        c9513e.f36625H = c9485n2.m31090N0();
                        break;
                    case "online":
                        c9513e.f36641o = c9485n2.m31093p0();
                        break;
                    case "battery_level":
                        c9513e.f36639m = c9485n2.m31097y0();
                        break;
                    case "model_id":
                        c9513e.f36637k = c9485n2.m31090N0();
                        break;
                    case "screen_density":
                        c9513e.f36619B = c9485n2.m31097y0();
                        break;
                    case "screen_dpi":
                        c9513e.f36620C = c9485n2.m31084E0();
                        break;
                    case "free_memory":
                        c9513e.f36645s = c9485n2.m31086G0();
                        break;
                    case "id":
                        c9513e.f36623F = c9485n2.m31090N0();
                        break;
                    case "name":
                        c9513e.f36632f = c9485n2.m31090N0();
                        break;
                    case "low_memory":
                        c9513e.f36647u = c9485n2.m31093p0();
                        break;
                    case "archs":
                        List list = (List) c9485n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c9513e.f36638l = strArr;
                            break;
                        }
                    case "brand":
                        c9513e.f36634h = c9485n2.m31090N0();
                        break;
                    case "model":
                        c9513e.f36636j = c9485n2.m31090N0();
                        break;
                    case "cpu_description":
                        c9513e.f36630M = c9485n2.m31090N0();
                        break;
                    case "processor_frequency":
                        c9513e.f36629L = c9485n2.m31095t0();
                        break;
                    case "connection_type":
                        c9513e.f36626I = c9485n2.m31090N0();
                        break;
                    case "screen_width_pixels":
                        c9513e.f36652z = c9485n2.m31084E0();
                        break;
                    case "external_storage_size":
                        c9513e.f36650x = c9485n2.m31086G0();
                        break;
                    case "storage_size":
                        c9513e.f36648v = c9485n2.m31086G0();
                        break;
                    case "usable_memory":
                        c9513e.f36646t = c9485n2.m31086G0();
                        break;
                    case "memory_size":
                        c9513e.f36644r = c9485n2.m31086G0();
                        break;
                    case "charging":
                        c9513e.f36640n = c9485n2.m31093p0();
                        break;
                    case "external_free_storage":
                        c9513e.f36651y = c9485n2.m31086G0();
                        break;
                    case "free_storage":
                        c9513e.f36649w = c9485n2.m31086G0();
                        break;
                    case "screen_height_pixels":
                        c9513e.f36618A = c9485n2.m31084E0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9513e.m31342s0(concurrentHashMap);
            c9485n2.m31889j();
            return c9513e;
        }
    }

    /* compiled from: Device.java */
    /* renamed from: io.sentry.protocol.e$b */
    public enum b implements InterfaceC9545r2 {
        PORTRAIT,
        LANDSCAPE;

        /* compiled from: Device.java */
        /* renamed from: io.sentry.protocol.e$b$a */
        public static final class a implements InterfaceC9471l2<b> {
            @Override // io.sentry.InterfaceC9471l2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
                return b.valueOf(c9485n2.m31881J().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC9545r2
        public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
            interfaceC9415h3.mo30819b(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C9513e() {
    }

    /* renamed from: I */
    public String m31306I() {
        return this.f36626I;
    }

    /* renamed from: J */
    public String m31307J() {
        return this.f36623F;
    }

    /* renamed from: K */
    public String m31308K() {
        return this.f36624G;
    }

    /* renamed from: L */
    public String m31309L() {
        return this.f36625H;
    }

    /* renamed from: M */
    public void m31310M(String[] strArr) {
        this.f36638l = strArr;
    }

    /* renamed from: N */
    public void m31311N(Float f2) {
        this.f36639m = f2;
    }

    /* renamed from: O */
    public void m31312O(Float f2) {
        this.f36627J = f2;
    }

    /* renamed from: P */
    public void m31313P(Date date) {
        this.f36621D = date;
    }

    /* renamed from: Q */
    public void m31314Q(String str) {
        this.f36634h = str;
    }

    /* renamed from: R */
    public void m31315R(Boolean bool) {
        this.f36640n = bool;
    }

    /* renamed from: S */
    public void m31316S(String str) {
        this.f36626I = str;
    }

    /* renamed from: T */
    public void m31317T(Long l) {
        this.f36651y = l;
    }

    /* renamed from: U */
    public void m31318U(Long l) {
        this.f36650x = l;
    }

    /* renamed from: V */
    public void m31319V(String str) {
        this.f36635i = str;
    }

    /* renamed from: W */
    public void m31320W(Long l) {
        this.f36645s = l;
    }

    /* renamed from: X */
    public void m31321X(Long l) {
        this.f36649w = l;
    }

    /* renamed from: Y */
    public void m31322Y(String str) {
        this.f36623F = str;
    }

    /* renamed from: Z */
    public void m31323Z(String str) {
        this.f36624G = str;
    }

    /* renamed from: a0 */
    public void m31324a0(String str) {
        this.f36625H = str;
    }

    /* renamed from: b0 */
    public void m31325b0(Boolean bool) {
        this.f36647u = bool;
    }

    /* renamed from: c0 */
    public void m31326c0(String str) {
        this.f36633g = str;
    }

    /* renamed from: d0 */
    public void m31327d0(Long l) {
        this.f36644r = l;
    }

    /* renamed from: e0 */
    public void m31328e0(String str) {
        this.f36636j = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9513e.class != obj.getClass()) {
            return false;
        }
        C9513e c9513e = (C9513e) obj;
        return C9613q.m31800a(this.f36632f, c9513e.f36632f) && C9613q.m31800a(this.f36633g, c9513e.f36633g) && C9613q.m31800a(this.f36634h, c9513e.f36634h) && C9613q.m31800a(this.f36635i, c9513e.f36635i) && C9613q.m31800a(this.f36636j, c9513e.f36636j) && C9613q.m31800a(this.f36637k, c9513e.f36637k) && Arrays.equals(this.f36638l, c9513e.f36638l) && C9613q.m31800a(this.f36639m, c9513e.f36639m) && C9613q.m31800a(this.f36640n, c9513e.f36640n) && C9613q.m31800a(this.f36641o, c9513e.f36641o) && this.f36642p == c9513e.f36642p && C9613q.m31800a(this.f36643q, c9513e.f36643q) && C9613q.m31800a(this.f36644r, c9513e.f36644r) && C9613q.m31800a(this.f36645s, c9513e.f36645s) && C9613q.m31800a(this.f36646t, c9513e.f36646t) && C9613q.m31800a(this.f36647u, c9513e.f36647u) && C9613q.m31800a(this.f36648v, c9513e.f36648v) && C9613q.m31800a(this.f36649w, c9513e.f36649w) && C9613q.m31800a(this.f36650x, c9513e.f36650x) && C9613q.m31800a(this.f36651y, c9513e.f36651y) && C9613q.m31800a(this.f36652z, c9513e.f36652z) && C9613q.m31800a(this.f36618A, c9513e.f36618A) && C9613q.m31800a(this.f36619B, c9513e.f36619B) && C9613q.m31800a(this.f36620C, c9513e.f36620C) && C9613q.m31800a(this.f36621D, c9513e.f36621D) && C9613q.m31800a(this.f36623F, c9513e.f36623F) && C9613q.m31800a(this.f36624G, c9513e.f36624G) && C9613q.m31800a(this.f36625H, c9513e.f36625H) && C9613q.m31800a(this.f36626I, c9513e.f36626I) && C9613q.m31800a(this.f36627J, c9513e.f36627J) && C9613q.m31800a(this.f36628K, c9513e.f36628K) && C9613q.m31800a(this.f36629L, c9513e.f36629L) && C9613q.m31800a(this.f36630M, c9513e.f36630M);
    }

    /* renamed from: f0 */
    public void m31329f0(String str) {
        this.f36637k = str;
    }

    /* renamed from: g0 */
    public void m31330g0(String str) {
        this.f36632f = str;
    }

    /* renamed from: h0 */
    public void m31331h0(Boolean bool) {
        this.f36641o = bool;
    }

    public int hashCode() {
        return (C9613q.m31801b(this.f36632f, this.f36633g, this.f36634h, this.f36635i, this.f36636j, this.f36637k, this.f36639m, this.f36640n, this.f36641o, this.f36642p, this.f36643q, this.f36644r, this.f36645s, this.f36646t, this.f36647u, this.f36648v, this.f36649w, this.f36650x, this.f36651y, this.f36652z, this.f36618A, this.f36619B, this.f36620C, this.f36621D, this.f36622E, this.f36623F, this.f36624G, this.f36625H, this.f36626I, this.f36627J, this.f36628K, this.f36629L, this.f36630M) * 31) + Arrays.hashCode(this.f36638l);
    }

    /* renamed from: i0 */
    public void m31332i0(b bVar) {
        this.f36642p = bVar;
    }

    /* renamed from: j0 */
    public void m31333j0(Integer num) {
        this.f36628K = num;
    }

    /* renamed from: k0 */
    public void m31334k0(Double d2) {
        this.f36629L = d2;
    }

    /* renamed from: l0 */
    public void m31335l0(Float f2) {
        this.f36619B = f2;
    }

    /* renamed from: m0 */
    public void m31336m0(Integer num) {
        this.f36620C = num;
    }

    /* renamed from: n0 */
    public void m31337n0(Integer num) {
        this.f36618A = num;
    }

    /* renamed from: o0 */
    public void m31338o0(Integer num) {
        this.f36652z = num;
    }

    /* renamed from: p0 */
    public void m31339p0(Boolean bool) {
        this.f36643q = bool;
    }

    /* renamed from: q0 */
    public void m31340q0(Long l) {
        this.f36648v = l;
    }

    /* renamed from: r0 */
    public void m31341r0(TimeZone timeZone) {
        this.f36622E = timeZone;
    }

    /* renamed from: s0 */
    public void m31342s0(Map<String, Object> map) {
        this.f36631N = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36632f != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36632f);
        }
        if (this.f36633g != null) {
            interfaceC9415h3.mo30828k("manufacturer").mo30819b(this.f36633g);
        }
        if (this.f36634h != null) {
            interfaceC9415h3.mo30828k("brand").mo30819b(this.f36634h);
        }
        if (this.f36635i != null) {
            interfaceC9415h3.mo30828k("family").mo30819b(this.f36635i);
        }
        if (this.f36636j != null) {
            interfaceC9415h3.mo30828k("model").mo30819b(this.f36636j);
        }
        if (this.f36637k != null) {
            interfaceC9415h3.mo30828k("model_id").mo30819b(this.f36637k);
        }
        if (this.f36638l != null) {
            interfaceC9415h3.mo30828k("archs").mo30824g(interfaceC9637w1, this.f36638l);
        }
        if (this.f36639m != null) {
            interfaceC9415h3.mo30828k("battery_level").mo30822e(this.f36639m);
        }
        if (this.f36640n != null) {
            interfaceC9415h3.mo30828k("charging").mo30825h(this.f36640n);
        }
        if (this.f36641o != null) {
            interfaceC9415h3.mo30828k("online").mo30825h(this.f36641o);
        }
        if (this.f36642p != null) {
            interfaceC9415h3.mo30828k("orientation").mo30824g(interfaceC9637w1, this.f36642p);
        }
        if (this.f36643q != null) {
            interfaceC9415h3.mo30828k("simulator").mo30825h(this.f36643q);
        }
        if (this.f36644r != null) {
            interfaceC9415h3.mo30828k("memory_size").mo30822e(this.f36644r);
        }
        if (this.f36645s != null) {
            interfaceC9415h3.mo30828k("free_memory").mo30822e(this.f36645s);
        }
        if (this.f36646t != null) {
            interfaceC9415h3.mo30828k("usable_memory").mo30822e(this.f36646t);
        }
        if (this.f36647u != null) {
            interfaceC9415h3.mo30828k("low_memory").mo30825h(this.f36647u);
        }
        if (this.f36648v != null) {
            interfaceC9415h3.mo30828k("storage_size").mo30822e(this.f36648v);
        }
        if (this.f36649w != null) {
            interfaceC9415h3.mo30828k("free_storage").mo30822e(this.f36649w);
        }
        if (this.f36650x != null) {
            interfaceC9415h3.mo30828k("external_storage_size").mo30822e(this.f36650x);
        }
        if (this.f36651y != null) {
            interfaceC9415h3.mo30828k("external_free_storage").mo30822e(this.f36651y);
        }
        if (this.f36652z != null) {
            interfaceC9415h3.mo30828k("screen_width_pixels").mo30822e(this.f36652z);
        }
        if (this.f36618A != null) {
            interfaceC9415h3.mo30828k("screen_height_pixels").mo30822e(this.f36618A);
        }
        if (this.f36619B != null) {
            interfaceC9415h3.mo30828k("screen_density").mo30822e(this.f36619B);
        }
        if (this.f36620C != null) {
            interfaceC9415h3.mo30828k("screen_dpi").mo30822e(this.f36620C);
        }
        if (this.f36621D != null) {
            interfaceC9415h3.mo30828k("boot_time").mo30824g(interfaceC9637w1, this.f36621D);
        }
        if (this.f36622E != null) {
            interfaceC9415h3.mo30828k("timezone").mo30824g(interfaceC9637w1, this.f36622E);
        }
        if (this.f36623F != null) {
            interfaceC9415h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30819b(this.f36623F);
        }
        if (this.f36624G != null) {
            interfaceC9415h3.mo30828k("language").mo30819b(this.f36624G);
        }
        if (this.f36626I != null) {
            interfaceC9415h3.mo30828k("connection_type").mo30819b(this.f36626I);
        }
        if (this.f36627J != null) {
            interfaceC9415h3.mo30828k("battery_temperature").mo30822e(this.f36627J);
        }
        if (this.f36625H != null) {
            interfaceC9415h3.mo30828k("locale").mo30819b(this.f36625H);
        }
        if (this.f36628K != null) {
            interfaceC9415h3.mo30828k("processor_count").mo30822e(this.f36628K);
        }
        if (this.f36629L != null) {
            interfaceC9415h3.mo30828k("processor_frequency").mo30822e(this.f36629L);
        }
        if (this.f36630M != null) {
            interfaceC9415h3.mo30828k("cpu_description").mo30819b(this.f36630M);
        }
        Map<String, Object> map = this.f36631N;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36631N.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9513e(C9513e c9513e) {
        this.f36632f = c9513e.f36632f;
        this.f36633g = c9513e.f36633g;
        this.f36634h = c9513e.f36634h;
        this.f36635i = c9513e.f36635i;
        this.f36636j = c9513e.f36636j;
        this.f36637k = c9513e.f36637k;
        this.f36640n = c9513e.f36640n;
        this.f36641o = c9513e.f36641o;
        this.f36642p = c9513e.f36642p;
        this.f36643q = c9513e.f36643q;
        this.f36644r = c9513e.f36644r;
        this.f36645s = c9513e.f36645s;
        this.f36646t = c9513e.f36646t;
        this.f36647u = c9513e.f36647u;
        this.f36648v = c9513e.f36648v;
        this.f36649w = c9513e.f36649w;
        this.f36650x = c9513e.f36650x;
        this.f36651y = c9513e.f36651y;
        this.f36652z = c9513e.f36652z;
        this.f36618A = c9513e.f36618A;
        this.f36619B = c9513e.f36619B;
        this.f36620C = c9513e.f36620C;
        this.f36621D = c9513e.f36621D;
        this.f36623F = c9513e.f36623F;
        this.f36624G = c9513e.f36624G;
        this.f36626I = c9513e.f36626I;
        this.f36627J = c9513e.f36627J;
        this.f36639m = c9513e.f36639m;
        String[] strArr = c9513e.f36638l;
        this.f36638l = strArr != null ? (String[]) strArr.clone() : null;
        this.f36625H = c9513e.f36625H;
        TimeZone timeZone = c9513e.f36622E;
        this.f36622E = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f36628K = c9513e.f36628K;
        this.f36629L = c9513e.f36629L;
        this.f36630M = c9513e.f36630M;
        this.f36631N = C9605i.m31767b(c9513e.f36631N);
    }
}
