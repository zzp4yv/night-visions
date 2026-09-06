package io.sentry.protocol;

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

/* compiled from: Browser.java */
/* renamed from: io.sentry.protocol.b */
/* loaded from: classes2.dex */
public final class C9508b implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36596f;

    /* renamed from: g */
    private String f36597g;

    /* renamed from: h */
    private Map<String, Object> f36598h;

    /* compiled from: Browser.java */
    /* renamed from: io.sentry.protocol.b$a */
    public static final class a implements InterfaceC9471l2<C9508b> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9508b mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            C9508b c9508b = new C9508b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("name")) {
                    c9508b.f36596f = c9485n2.m31090N0();
                } else if (m31879B.equals("version")) {
                    c9508b.f36597g = c9485n2.m31090N0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                }
            }
            c9508b.m31225c(concurrentHashMap);
            c9485n2.m31889j();
            return c9508b;
        }
    }

    public C9508b() {
    }

    /* renamed from: c */
    public void m31225c(Map<String, Object> map) {
        this.f36598h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9508b.class != obj.getClass()) {
            return false;
        }
        C9508b c9508b = (C9508b) obj;
        return C9613q.m31800a(this.f36596f, c9508b.f36596f) && C9613q.m31800a(this.f36597g, c9508b.f36597g);
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36596f, this.f36597g);
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36596f != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36596f);
        }
        if (this.f36597g != null) {
            interfaceC9415h3.mo30828k("version").mo30819b(this.f36597g);
        }
        Map<String, Object> map = this.f36598h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36598h.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9508b(C9508b c9508b) {
        this.f36596f = c9508b.f36596f;
        this.f36597g = c9508b.f36597g;
        this.f36598h = C9605i.m31767b(c9508b.f36598h);
    }
}
