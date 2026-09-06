package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9511c0;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ViewHierarchy.java */
/* renamed from: io.sentry.protocol.b0 */
/* loaded from: classes2.dex */
public final class C9509b0 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final String f36599f;

    /* renamed from: g */
    private final List<C9511c0> f36600g;

    /* renamed from: h */
    private Map<String, Object> f36601h;

    /* compiled from: ViewHierarchy.java */
    /* renamed from: io.sentry.protocol.b0$a */
    public static final class a implements InterfaceC9471l2<C9509b0> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9509b0 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            String str = null;
            List list = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("rendering_system")) {
                    str = c9485n2.m31090N0();
                } else if (m31879B.equals("windows")) {
                    list = c9485n2.m31085F0(interfaceC9637w1, new C9511c0.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                }
            }
            c9485n2.m31889j();
            C9509b0 c9509b0 = new C9509b0(str, list);
            c9509b0.m31227a(hashMap);
            return c9509b0;
        }
    }

    public C9509b0(String str, List<C9511c0> list) {
        this.f36599f = str;
        this.f36600g = list;
    }

    /* renamed from: a */
    public void m31227a(Map<String, Object> map) {
        this.f36601h = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36599f != null) {
            interfaceC9415h3.mo30828k("rendering_system").mo30819b(this.f36599f);
        }
        if (this.f36600g != null) {
            interfaceC9415h3.mo30828k("windows").mo30824g(interfaceC9637w1, this.f36600g);
        }
        Map<String, Object> map = this.f36601h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36601h.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
