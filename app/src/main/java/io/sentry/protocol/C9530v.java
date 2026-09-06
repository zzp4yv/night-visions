package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9529u;
import io.sentry.util.C9605i;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackTrace.java */
/* renamed from: io.sentry.protocol.v */
/* loaded from: classes2.dex */
public final class C9530v implements InterfaceC9545r2 {

    /* renamed from: f */
    private List<C9529u> f36764f;

    /* renamed from: g */
    private Map<String, String> f36765g;

    /* renamed from: h */
    private Boolean f36766h;

    /* renamed from: i */
    private Map<String, Object> f36767i;

    /* compiled from: SentryStackTrace.java */
    /* renamed from: io.sentry.protocol.v$a */
    public static final class a implements InterfaceC9471l2<C9530v> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9530v mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9530v c9530v = new C9530v();
            c9485n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "frames":
                        c9530v.f36764f = c9485n2.m31085F0(interfaceC9637w1, new C9529u.a());
                        break;
                    case "registers":
                        c9530v.f36765g = C9605i.m31767b((Map) c9485n2.m31088K0());
                        break;
                    case "snapshot":
                        c9530v.f36766h = c9485n2.m31093p0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9530v.m31502f(concurrentHashMap);
            c9485n2.m31889j();
            return c9530v;
        }
    }

    public C9530v() {
    }

    /* renamed from: d */
    public List<C9529u> m31500d() {
        return this.f36764f;
    }

    /* renamed from: e */
    public void m31501e(Boolean bool) {
        this.f36766h = bool;
    }

    /* renamed from: f */
    public void m31502f(Map<String, Object> map) {
        this.f36767i = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36764f != null) {
            interfaceC9415h3.mo30828k("frames").mo30824g(interfaceC9637w1, this.f36764f);
        }
        if (this.f36765g != null) {
            interfaceC9415h3.mo30828k("registers").mo30824g(interfaceC9637w1, this.f36765g);
        }
        if (this.f36766h != null) {
            interfaceC9415h3.mo30828k("snapshot").mo30825h(this.f36766h);
        }
        Map<String, Object> map = this.f36767i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36767i.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9530v(List<C9529u> list) {
        this.f36764f = list;
    }
}
