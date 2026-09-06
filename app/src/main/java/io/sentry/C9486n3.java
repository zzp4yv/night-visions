package io.sentry;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfilingTransactionData.java */
@ApiStatus.Internal
/* renamed from: io.sentry.n3 */
/* loaded from: classes2.dex */
public final class C9486n3 implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36510f;

    /* renamed from: g */
    private String f36511g;

    /* renamed from: h */
    private String f36512h;

    /* renamed from: i */
    private Long f36513i;

    /* renamed from: j */
    private Long f36514j;

    /* renamed from: k */
    private Long f36515k;

    /* renamed from: l */
    private Long f36516l;

    /* renamed from: m */
    private Map<String, Object> f36517m;

    /* compiled from: ProfilingTransactionData.java */
    /* renamed from: io.sentry.n3$a */
    public static final class a implements InterfaceC9471l2<C9486n3> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9486n3 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9486n3 c9486n3 = new C9486n3();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "relative_start_ns":
                        Long m31086G0 = c9485n2.m31086G0();
                        if (m31086G0 == null) {
                            break;
                        } else {
                            c9486n3.f36513i = m31086G0;
                            break;
                        }
                    case "relative_end_ns":
                        Long m31086G02 = c9485n2.m31086G0();
                        if (m31086G02 == null) {
                            break;
                        } else {
                            c9486n3.f36514j = m31086G02;
                            break;
                        }
                    case "id":
                        String m31090N0 = c9485n2.m31090N0();
                        if (m31090N0 == null) {
                            break;
                        } else {
                            c9486n3.f36510f = m31090N0;
                            break;
                        }
                    case "name":
                        String m31090N02 = c9485n2.m31090N0();
                        if (m31090N02 == null) {
                            break;
                        } else {
                            c9486n3.f36512h = m31090N02;
                            break;
                        }
                    case "trace_id":
                        String m31090N03 = c9485n2.m31090N0();
                        if (m31090N03 == null) {
                            break;
                        } else {
                            c9486n3.f36511g = m31090N03;
                            break;
                        }
                    case "relative_cpu_end_ms":
                        Long m31086G03 = c9485n2.m31086G0();
                        if (m31086G03 == null) {
                            break;
                        } else {
                            c9486n3.f36516l = m31086G03;
                            break;
                        }
                    case "relative_cpu_start_ms":
                        Long m31086G04 = c9485n2.m31086G0();
                        if (m31086G04 == null) {
                            break;
                        } else {
                            c9486n3.f36515k = m31086G04;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9486n3.m31107j(concurrentHashMap);
            c9485n2.m31889j();
            return c9486n3;
        }
    }

    public C9486n3() {
        this(C9387d3.m30717r(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9486n3.class != obj.getClass()) {
            return false;
        }
        C9486n3 c9486n3 = (C9486n3) obj;
        return this.f36510f.equals(c9486n3.f36510f) && this.f36511g.equals(c9486n3.f36511g) && this.f36512h.equals(c9486n3.f36512h) && this.f36513i.equals(c9486n3.f36513i) && this.f36515k.equals(c9486n3.f36515k) && C9613q.m31800a(this.f36516l, c9486n3.f36516l) && C9613q.m31800a(this.f36514j, c9486n3.f36514j) && C9613q.m31800a(this.f36517m, c9486n3.f36517m);
    }

    /* renamed from: h */
    public String m31105h() {
        return this.f36510f;
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36510f, this.f36511g, this.f36512h, this.f36513i, this.f36514j, this.f36515k, this.f36516l, this.f36517m);
    }

    /* renamed from: i */
    public void m31106i(Long l, Long l2, Long l3, Long l4) {
        if (this.f36514j == null) {
            this.f36514j = Long.valueOf(l.longValue() - l2.longValue());
            this.f36513i = Long.valueOf(this.f36513i.longValue() - l2.longValue());
            this.f36516l = Long.valueOf(l3.longValue() - l4.longValue());
            this.f36515k = Long.valueOf(this.f36515k.longValue() - l4.longValue());
        }
    }

    /* renamed from: j */
    public void m31107j(Map<String, Object> map) {
        this.f36517m = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30824g(interfaceC9637w1, this.f36510f);
        interfaceC9415h3.mo30828k("trace_id").mo30824g(interfaceC9637w1, this.f36511g);
        interfaceC9415h3.mo30828k("name").mo30824g(interfaceC9637w1, this.f36512h);
        interfaceC9415h3.mo30828k("relative_start_ns").mo30824g(interfaceC9637w1, this.f36513i);
        interfaceC9415h3.mo30828k("relative_end_ns").mo30824g(interfaceC9637w1, this.f36514j);
        interfaceC9415h3.mo30828k("relative_cpu_start_ms").mo30824g(interfaceC9637w1, this.f36515k);
        interfaceC9415h3.mo30828k("relative_cpu_end_ms").mo30824g(interfaceC9637w1, this.f36516l);
        Map<String, Object> map = this.f36517m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36517m.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9486n3(InterfaceC9393e2 interfaceC9393e2, Long l, Long l2) {
        this.f36510f = interfaceC9393e2.mo30525k().toString();
        this.f36511g = interfaceC9393e2.mo30527m().m30803k().toString();
        this.f36512h = interfaceC9393e2.getName();
        this.f36513i = l;
        this.f36515k = l2;
    }
}
