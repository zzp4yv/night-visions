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

/* compiled from: OperatingSystem.java */
/* renamed from: io.sentry.protocol.k */
/* loaded from: classes2.dex */
public final class C9519k implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36683f;

    /* renamed from: g */
    private String f36684g;

    /* renamed from: h */
    private String f36685h;

    /* renamed from: i */
    private String f36686i;

    /* renamed from: j */
    private String f36687j;

    /* renamed from: k */
    private Boolean f36688k;

    /* renamed from: l */
    private Map<String, Object> f36689l;

    /* compiled from: OperatingSystem.java */
    /* renamed from: io.sentry.protocol.k$a */
    public static final class a implements InterfaceC9471l2<C9519k> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9519k mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9519k c9519k = new C9519k();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "rooted":
                        c9519k.f36688k = c9485n2.m31093p0();
                        break;
                    case "raw_description":
                        c9519k.f36685h = c9485n2.m31090N0();
                        break;
                    case "name":
                        c9519k.f36683f = c9485n2.m31090N0();
                        break;
                    case "build":
                        c9519k.f36686i = c9485n2.m31090N0();
                        break;
                    case "version":
                        c9519k.f36684g = c9485n2.m31090N0();
                        break;
                    case "kernel_version":
                        c9519k.f36687j = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9519k.m31393l(concurrentHashMap);
            c9485n2.m31889j();
            return c9519k;
        }
    }

    public C9519k() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9519k.class != obj.getClass()) {
            return false;
        }
        C9519k c9519k = (C9519k) obj;
        return C9613q.m31800a(this.f36683f, c9519k.f36683f) && C9613q.m31800a(this.f36684g, c9519k.f36684g) && C9613q.m31800a(this.f36685h, c9519k.f36685h) && C9613q.m31800a(this.f36686i, c9519k.f36686i) && C9613q.m31800a(this.f36687j, c9519k.f36687j) && C9613q.m31800a(this.f36688k, c9519k.f36688k);
    }

    /* renamed from: g */
    public String m31388g() {
        return this.f36683f;
    }

    /* renamed from: h */
    public void m31389h(String str) {
        this.f36686i = str;
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36683f, this.f36684g, this.f36685h, this.f36686i, this.f36687j, this.f36688k);
    }

    /* renamed from: i */
    public void m31390i(String str) {
        this.f36687j = str;
    }

    /* renamed from: j */
    public void m31391j(String str) {
        this.f36683f = str;
    }

    /* renamed from: k */
    public void m31392k(Boolean bool) {
        this.f36688k = bool;
    }

    /* renamed from: l */
    public void m31393l(Map<String, Object> map) {
        this.f36689l = map;
    }

    /* renamed from: m */
    public void m31394m(String str) {
        this.f36684g = str;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36683f != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36683f);
        }
        if (this.f36684g != null) {
            interfaceC9415h3.mo30828k("version").mo30819b(this.f36684g);
        }
        if (this.f36685h != null) {
            interfaceC9415h3.mo30828k("raw_description").mo30819b(this.f36685h);
        }
        if (this.f36686i != null) {
            interfaceC9415h3.mo30828k("build").mo30819b(this.f36686i);
        }
        if (this.f36687j != null) {
            interfaceC9415h3.mo30828k("kernel_version").mo30819b(this.f36687j);
        }
        if (this.f36688k != null) {
            interfaceC9415h3.mo30828k("rooted").mo30825h(this.f36688k);
        }
        Map<String, Object> map = this.f36689l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36689l.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9519k(C9519k c9519k) {
        this.f36683f = c9519k.f36683f;
        this.f36684g = c9519k.f36684g;
        this.f36685h = c9519k.f36685h;
        this.f36686i = c9519k.f36686i;
        this.f36687j = c9519k.f36687j;
        this.f36688k = c9519k.f36688k;
        this.f36689l = C9605i.m31767b(c9519k.f36689l);
    }
}
