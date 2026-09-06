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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Gpu.java */
/* renamed from: io.sentry.protocol.g */
/* loaded from: classes2.dex */
public final class C9515g implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36657f;

    /* renamed from: g */
    private Integer f36658g;

    /* renamed from: h */
    private String f36659h;

    /* renamed from: i */
    private String f36660i;

    /* renamed from: j */
    private Integer f36661j;

    /* renamed from: k */
    private String f36662k;

    /* renamed from: l */
    private Boolean f36663l;

    /* renamed from: m */
    private String f36664m;

    /* renamed from: n */
    private String f36665n;

    /* renamed from: o */
    private Map<String, Object> f36666o;

    /* compiled from: Gpu.java */
    /* renamed from: io.sentry.protocol.g$a */
    public static final class a implements InterfaceC9471l2<C9515g> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9515g mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9515g c9515g = new C9515g();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "npot_support":
                        c9515g.f36665n = c9485n2.m31090N0();
                        break;
                    case "vendor_id":
                        c9515g.f36659h = c9485n2.m31090N0();
                        break;
                    case "multi_threaded_rendering":
                        c9515g.f36663l = c9485n2.m31093p0();
                        break;
                    case "id":
                        c9515g.f36658g = c9485n2.m31084E0();
                        break;
                    case "name":
                        c9515g.f36657f = c9485n2.m31090N0();
                        break;
                    case "vendor_name":
                        c9515g.f36660i = c9485n2.m31090N0();
                        break;
                    case "version":
                        c9515g.f36664m = c9485n2.m31090N0();
                        break;
                    case "api_type":
                        c9515g.f36662k = c9485n2.m31090N0();
                        break;
                    case "memory_size":
                        c9515g.f36661j = c9485n2.m31084E0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9515g.m31359j(concurrentHashMap);
            c9485n2.m31889j();
            return c9515g;
        }
    }

    public C9515g() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9515g.class != obj.getClass()) {
            return false;
        }
        C9515g c9515g = (C9515g) obj;
        return C9613q.m31800a(this.f36657f, c9515g.f36657f) && C9613q.m31800a(this.f36658g, c9515g.f36658g) && C9613q.m31800a(this.f36659h, c9515g.f36659h) && C9613q.m31800a(this.f36660i, c9515g.f36660i) && C9613q.m31800a(this.f36661j, c9515g.f36661j) && C9613q.m31800a(this.f36662k, c9515g.f36662k) && C9613q.m31800a(this.f36663l, c9515g.f36663l) && C9613q.m31800a(this.f36664m, c9515g.f36664m) && C9613q.m31800a(this.f36665n, c9515g.f36665n);
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36657f, this.f36658g, this.f36659h, this.f36660i, this.f36661j, this.f36662k, this.f36663l, this.f36664m, this.f36665n);
    }

    /* renamed from: j */
    public void m31359j(Map<String, Object> map) {
        this.f36666o = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36657f != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36657f);
        }
        if (this.f36658g != null) {
            interfaceC9415h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30822e(this.f36658g);
        }
        if (this.f36659h != null) {
            interfaceC9415h3.mo30828k("vendor_id").mo30819b(this.f36659h);
        }
        if (this.f36660i != null) {
            interfaceC9415h3.mo30828k("vendor_name").mo30819b(this.f36660i);
        }
        if (this.f36661j != null) {
            interfaceC9415h3.mo30828k("memory_size").mo30822e(this.f36661j);
        }
        if (this.f36662k != null) {
            interfaceC9415h3.mo30828k("api_type").mo30819b(this.f36662k);
        }
        if (this.f36663l != null) {
            interfaceC9415h3.mo30828k("multi_threaded_rendering").mo30825h(this.f36663l);
        }
        if (this.f36664m != null) {
            interfaceC9415h3.mo30828k("version").mo30819b(this.f36664m);
        }
        if (this.f36665n != null) {
            interfaceC9415h3.mo30828k("npot_support").mo30819b(this.f36665n);
        }
        Map<String, Object> map = this.f36666o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36666o.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9515g(C9515g c9515g) {
        this.f36657f = c9515g.f36657f;
        this.f36658g = c9515g.f36658g;
        this.f36659h = c9515g.f36659h;
        this.f36660i = c9515g.f36660i;
        this.f36661j = c9515g.f36661j;
        this.f36662k = c9515g.f36662k;
        this.f36663l = c9515g.f36663l;
        this.f36664m = c9515g.f36664m;
        this.f36665n = c9515g.f36665n;
        this.f36666o = C9605i.m31767b(c9515g.f36666o);
    }
}
