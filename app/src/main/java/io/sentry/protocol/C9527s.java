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

/* compiled from: SentryRuntime.java */
/* renamed from: io.sentry.protocol.s */
/* loaded from: classes2.dex */
public final class C9527s implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36730f;

    /* renamed from: g */
    private String f36731g;

    /* renamed from: h */
    private String f36732h;

    /* renamed from: i */
    private Map<String, Object> f36733i;

    /* compiled from: SentryRuntime.java */
    /* renamed from: io.sentry.protocol.s$a */
    public static final class a implements InterfaceC9471l2<C9527s> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9527s mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9527s c9527s = new C9527s();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "raw_description":
                        c9527s.f36732h = c9485n2.m31090N0();
                        break;
                    case "name":
                        c9527s.f36730f = c9485n2.m31090N0();
                        break;
                    case "version":
                        c9527s.f36731g = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9527s.m31462g(concurrentHashMap);
            c9485n2.m31889j();
            return c9527s;
        }
    }

    public C9527s() {
    }

    /* renamed from: d */
    public String m31459d() {
        return this.f36730f;
    }

    /* renamed from: e */
    public String m31460e() {
        return this.f36731g;
    }

    /* renamed from: f */
    public void m31461f(String str) {
        this.f36730f = str;
    }

    /* renamed from: g */
    public void m31462g(Map<String, Object> map) {
        this.f36733i = map;
    }

    /* renamed from: h */
    public void m31463h(String str) {
        this.f36731g = str;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36730f != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36730f);
        }
        if (this.f36731g != null) {
            interfaceC9415h3.mo30828k("version").mo30819b(this.f36731g);
        }
        if (this.f36732h != null) {
            interfaceC9415h3.mo30828k("raw_description").mo30819b(this.f36732h);
        }
        Map<String, Object> map = this.f36733i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36733i.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9527s(C9527s c9527s) {
        this.f36730f = c9527s.f36730f;
        this.f36731g = c9527s.f36731g;
        this.f36732h = c9527s.f36732h;
        this.f36733i = C9605i.m31767b(c9527s.f36733i);
    }
}
