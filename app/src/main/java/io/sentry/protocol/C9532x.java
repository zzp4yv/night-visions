package io.sentry.protocol;

import io.sentry.AbstractC9342c4;
import io.sentry.C9211a1;
import io.sentry.C9336b5;
import io.sentry.C9396e5;
import io.sentry.C9403f5;
import io.sentry.C9485n2;
import io.sentry.C9541q5;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9516h;
import io.sentry.protocol.C9528t;
import io.sentry.protocol.C9533y;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryTransaction.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.x */
/* loaded from: classes2.dex */
public final class C9532x extends AbstractC9342c4 implements InterfaceC9545r2 {

    /* renamed from: A */
    private C9533y f36779A;

    /* renamed from: B */
    private Map<String, Object> f36780B;

    /* renamed from: u */
    private String f36781u;

    /* renamed from: v */
    private Double f36782v;

    /* renamed from: w */
    private Double f36783w;

    /* renamed from: x */
    private final List<C9528t> f36784x;

    /* renamed from: y */
    private final String f36785y;

    /* renamed from: z */
    private final Map<String, C9516h> f36786z;

    /* compiled from: SentryTransaction.java */
    /* renamed from: io.sentry.protocol.x$a */
    public static final class a implements InterfaceC9471l2<C9532x> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9532x mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9532x c9532x = new C9532x(HttpUrl.FRAGMENT_ENCODE_SET, Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new C9533y(EnumC9534z.CUSTOM.apiName()));
            AbstractC9342c4.a aVar = new AbstractC9342c4.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "start_timestamp":
                        try {
                            Double m31095t0 = c9485n2.m31095t0();
                            if (m31095t0 == null) {
                                break;
                            } else {
                                c9532x.f36782v = m31095t0;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date m31094q0 = c9485n2.m31094q0(interfaceC9637w1);
                            if (m31094q0 == null) {
                                break;
                            } else {
                                c9532x.f36782v = Double.valueOf(C9211a1.m30007b(m31094q0));
                                break;
                            }
                        }
                    case "measurements":
                        Map m31087J0 = c9485n2.m31087J0(interfaceC9637w1, new C9516h.a());
                        if (m31087J0 == null) {
                            break;
                        } else {
                            c9532x.f36786z.putAll(m31087J0);
                            break;
                        }
                    case "type":
                        c9485n2.m31881J();
                        break;
                    case "timestamp":
                        try {
                            Double m31095t02 = c9485n2.m31095t0();
                            if (m31095t02 == null) {
                                break;
                            } else {
                                c9532x.f36783w = m31095t02;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date m31094q02 = c9485n2.m31094q0(interfaceC9637w1);
                            if (m31094q02 == null) {
                                break;
                            } else {
                                c9532x.f36783w = Double.valueOf(C9211a1.m30007b(m31094q02));
                                break;
                            }
                        }
                    case "spans":
                        List m31085F0 = c9485n2.m31085F0(interfaceC9637w1, new C9528t.a());
                        if (m31085F0 == null) {
                            break;
                        } else {
                            c9532x.f36784x.addAll(m31085F0);
                            break;
                        }
                    case "transaction_info":
                        c9532x.f36779A = new C9533y.a().mo30683a(c9485n2, interfaceC9637w1);
                        break;
                    case "transaction":
                        c9532x.f36781u = c9485n2.m31090N0();
                        break;
                    default:
                        if (!aVar.m30604a(c9532x, m31879B, c9485n2, interfaceC9637w1)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                            break;
                        } else {
                            break;
                        }
                }
            }
            c9532x.m31544r0(concurrentHashMap);
            c9485n2.m31889j();
            return c9532x;
        }
    }

    public C9532x(C9336b5 c9336b5) {
        super(c9336b5.mo30525k());
        this.f36784x = new ArrayList();
        this.f36785y = "transaction";
        this.f36786z = new HashMap();
        C9613q.m31802c(c9336b5, "sentryTracer is required");
        this.f36782v = Double.valueOf(C9211a1.m30017l(c9336b5.mo30531q().mo30792x()));
        this.f36783w = Double.valueOf(C9211a1.m30017l(c9336b5.mo30531q().mo30791v(c9336b5.mo30528n())));
        this.f36781u = c9336b5.getName();
        for (C9396e5 c9396e5 : c9336b5.m30533x()) {
            if (Boolean.TRUE.equals(c9396e5.m30767B())) {
                this.f36784x.add(new C9528t(c9396e5));
            }
        }
        C9510c m30575C = m30575C();
        m30575C.putAll(c9336b5.m30534y());
        C9403f5 mo30527m = c9336b5.mo30527m();
        m30575C.m31242n(new C9403f5(mo30527m.m30803k(), mo30527m.m30800h(), mo30527m.m30796d(), mo30527m.m30794b(), mo30527m.m30793a(), mo30527m.m30799g(), mo30527m.m30801i(), mo30527m.m30795c()));
        for (Map.Entry<String, String> entry : mo30527m.m30802j().entrySet()) {
            m30601c0(entry.getKey(), entry.getValue());
        }
        Map<String, Object> m30535z = c9336b5.m30535z();
        if (m30535z != null) {
            for (Map.Entry<String, Object> entry2 : m30535z.entrySet()) {
                m30594V(entry2.getKey(), entry2.getValue());
            }
        }
        this.f36779A = new C9533y(c9336b5.mo30530p().apiName());
    }

    /* renamed from: l0 */
    private BigDecimal m31538l0(Double d2) {
        return BigDecimal.valueOf(d2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: m0 */
    public Map<String, C9516h> m31539m0() {
        return this.f36786z;
    }

    /* renamed from: n0 */
    public C9541q5 m31540n0() {
        C9403f5 m31234e = m30575C().m31234e();
        if (m31234e == null) {
            return null;
        }
        return m31234e.m30799g();
    }

    /* renamed from: o0 */
    public List<C9528t> m31541o0() {
        return this.f36784x;
    }

    /* renamed from: p0 */
    public boolean m31542p0() {
        return this.f36783w != null;
    }

    /* renamed from: q0 */
    public boolean m31543q0() {
        C9541q5 m31540n0 = m31540n0();
        if (m31540n0 == null) {
            return false;
        }
        return m31540n0.m31562c().booleanValue();
    }

    /* renamed from: r0 */
    public void m31544r0(Map<String, Object> map) {
        this.f36780B = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36781u != null) {
            interfaceC9415h3.mo30828k("transaction").mo30819b(this.f36781u);
        }
        interfaceC9415h3.mo30828k("start_timestamp").mo30824g(interfaceC9637w1, m31538l0(this.f36782v));
        if (this.f36783w != null) {
            interfaceC9415h3.mo30828k("timestamp").mo30824g(interfaceC9637w1, m31538l0(this.f36783w));
        }
        if (!this.f36784x.isEmpty()) {
            interfaceC9415h3.mo30828k("spans").mo30824g(interfaceC9637w1, this.f36784x);
        }
        interfaceC9415h3.mo30828k("type").mo30819b("transaction");
        if (!this.f36786z.isEmpty()) {
            interfaceC9415h3.mo30828k("measurements").mo30824g(interfaceC9637w1, this.f36786z);
        }
        interfaceC9415h3.mo30828k("transaction_info").mo30824g(interfaceC9637w1, this.f36779A);
        new AbstractC9342c4.b().m30605a(this, interfaceC9415h3, interfaceC9637w1);
        Map<String, Object> map = this.f36780B;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36780B.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    @ApiStatus.Internal
    public C9532x(String str, Double d2, Double d3, List<C9528t> list, Map<String, C9516h> map, C9533y c9533y) {
        ArrayList arrayList = new ArrayList();
        this.f36784x = arrayList;
        this.f36785y = "transaction";
        HashMap hashMap = new HashMap();
        this.f36786z = hashMap;
        this.f36781u = str;
        this.f36782v = d2;
        this.f36783w = d3;
        arrayList.addAll(list);
        hashMap.putAll(map);
        this.f36779A = c9533y;
    }
}
