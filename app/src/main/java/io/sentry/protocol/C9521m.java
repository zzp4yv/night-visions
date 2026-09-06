package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9605i;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Response.java */
/* renamed from: io.sentry.protocol.m */
/* loaded from: classes2.dex */
public final class C9521m implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36702f;

    /* renamed from: g */
    private Map<String, String> f36703g;

    /* renamed from: h */
    private Integer f36704h;

    /* renamed from: i */
    private Long f36705i;

    /* renamed from: j */
    private Object f36706j;

    /* renamed from: k */
    private Map<String, Object> f36707k;

    /* compiled from: Response.java */
    /* renamed from: io.sentry.protocol.m$a */
    public static final class a implements InterfaceC9471l2<C9521m> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9521m mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9521m c9521m = new C9521m();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "status_code":
                        c9521m.f36704h = c9485n2.m31084E0();
                        break;
                    case "data":
                        c9521m.f36706j = c9485n2.m31088K0();
                        break;
                    case "headers":
                        Map map = (Map) c9485n2.m31088K0();
                        if (map == null) {
                            break;
                        } else {
                            c9521m.f36703g = C9605i.m31767b(map);
                            break;
                        }
                    case "cookies":
                        c9521m.f36702f = c9485n2.m31090N0();
                        break;
                    case "body_size":
                        c9521m.f36705i = c9485n2.m31086G0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9521m.m31415f(concurrentHashMap);
            c9485n2.m31889j();
            return c9521m;
        }
    }

    public C9521m() {
    }

    /* renamed from: f */
    public void m31415f(Map<String, Object> map) {
        this.f36707k = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36702f != null) {
            interfaceC9415h3.mo30828k("cookies").mo30819b(this.f36702f);
        }
        if (this.f36703g != null) {
            interfaceC9415h3.mo30828k("headers").mo30824g(interfaceC9637w1, this.f36703g);
        }
        if (this.f36704h != null) {
            interfaceC9415h3.mo30828k("status_code").mo30824g(interfaceC9637w1, this.f36704h);
        }
        if (this.f36705i != null) {
            interfaceC9415h3.mo30828k("body_size").mo30824g(interfaceC9637w1, this.f36705i);
        }
        if (this.f36706j != null) {
            interfaceC9415h3.mo30828k("data").mo30824g(interfaceC9637w1, this.f36706j);
        }
        Map<String, Object> map = this.f36707k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36707k.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9521m(C9521m c9521m) {
        this.f36702f = c9521m.f36702f;
        this.f36703g = C9605i.m31767b(c9521m.f36703g);
        this.f36707k = C9605i.m31767b(c9521m.f36707k);
        this.f36704h = c9521m.f36704h;
        this.f36705i = c9521m.f36705i;
        this.f36706j = c9521m.f36706j;
    }
}
