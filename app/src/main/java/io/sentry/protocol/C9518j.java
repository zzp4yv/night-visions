package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Message.java */
/* renamed from: io.sentry.protocol.j */
/* loaded from: classes2.dex */
public final class C9518j implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36679f;

    /* renamed from: g */
    private String f36680g;

    /* renamed from: h */
    private List<String> f36681h;

    /* renamed from: i */
    private Map<String, Object> f36682i;

    /* compiled from: Message.java */
    /* renamed from: io.sentry.protocol.j$a */
    public static final class a implements InterfaceC9471l2<C9518j> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9518j mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9518j c9518j = new C9518j();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "params":
                        List list = (List) c9485n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            c9518j.f36681h = list;
                            break;
                        }
                    case "message":
                        c9518j.f36680g = c9485n2.m31090N0();
                        break;
                    case "formatted":
                        c9518j.f36679f = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9518j.m31380f(concurrentHashMap);
            c9485n2.m31889j();
            return c9518j;
        }
    }

    /* renamed from: d */
    public void m31378d(String str) {
        this.f36679f = str;
    }

    /* renamed from: e */
    public void m31379e(String str) {
        this.f36680g = str;
    }

    /* renamed from: f */
    public void m31380f(Map<String, Object> map) {
        this.f36682i = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36679f != null) {
            interfaceC9415h3.mo30828k("formatted").mo30819b(this.f36679f);
        }
        if (this.f36680g != null) {
            interfaceC9415h3.mo30828k("message").mo30819b(this.f36680g);
        }
        List<String> list = this.f36681h;
        if (list != null && !list.isEmpty()) {
            interfaceC9415h3.mo30828k("params").mo30824g(interfaceC9637w1, this.f36681h);
        }
        Map<String, Object> map = this.f36682i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36682i.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
