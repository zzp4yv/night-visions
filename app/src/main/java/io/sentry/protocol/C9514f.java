package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Geo.java */
/* renamed from: io.sentry.protocol.f */
/* loaded from: classes2.dex */
public final class C9514f implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36653f;

    /* renamed from: g */
    private String f36654g;

    /* renamed from: h */
    private String f36655h;

    /* renamed from: i */
    private Map<String, Object> f36656i;

    /* compiled from: Geo.java */
    /* renamed from: io.sentry.protocol.f$a */
    public static final class a implements InterfaceC9471l2<C9514f> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9514f mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9514f c9514f = new C9514f();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "region":
                        c9514f.f36655h = c9485n2.m31090N0();
                        break;
                    case "city":
                        c9514f.f36653f = c9485n2.m31090N0();
                        break;
                    case "country_code":
                        c9514f.f36654g = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9514f.m31348d(concurrentHashMap);
            c9485n2.m31889j();
            return c9514f;
        }
    }

    /* renamed from: d */
    public void m31348d(Map<String, Object> map) {
        this.f36656i = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36653f != null) {
            interfaceC9415h3.mo30828k("city").mo30819b(this.f36653f);
        }
        if (this.f36654g != null) {
            interfaceC9415h3.mo30828k("country_code").mo30819b(this.f36654g);
        }
        if (this.f36655h != null) {
            interfaceC9415h3.mo30828k("region").mo30819b(this.f36655h);
        }
        Map<String, Object> map = this.f36656i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36656i.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
