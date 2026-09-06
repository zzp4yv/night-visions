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

/* compiled from: Request.java */
/* renamed from: io.sentry.protocol.l */
/* loaded from: classes2.dex */
public final class C9520l implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36690f;

    /* renamed from: g */
    private String f36691g;

    /* renamed from: h */
    private String f36692h;

    /* renamed from: i */
    private Object f36693i;

    /* renamed from: j */
    private String f36694j;

    /* renamed from: k */
    private Map<String, String> f36695k;

    /* renamed from: l */
    private Map<String, String> f36696l;

    /* renamed from: m */
    private Long f36697m;

    /* renamed from: n */
    private Map<String, String> f36698n;

    /* renamed from: o */
    private String f36699o;

    /* renamed from: p */
    private String f36700p;

    /* renamed from: q */
    private Map<String, Object> f36701q;

    /* compiled from: Request.java */
    /* renamed from: io.sentry.protocol.l$a */
    public static final class a implements InterfaceC9471l2<C9520l> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9520l mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9520l c9520l = new C9520l();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "fragment":
                        c9520l.f36699o = c9485n2.m31090N0();
                        break;
                    case "method":
                        c9520l.f36691g = c9485n2.m31090N0();
                        break;
                    case "env":
                        Map map = (Map) c9485n2.m31088K0();
                        if (map == null) {
                            break;
                        } else {
                            c9520l.f36696l = C9605i.m31767b(map);
                            break;
                        }
                    case "url":
                        c9520l.f36690f = c9485n2.m31090N0();
                        break;
                    case "data":
                        c9520l.f36693i = c9485n2.m31088K0();
                        break;
                    case "other":
                        Map map2 = (Map) c9485n2.m31088K0();
                        if (map2 == null) {
                            break;
                        } else {
                            c9520l.f36698n = C9605i.m31767b(map2);
                            break;
                        }
                    case "headers":
                        Map map3 = (Map) c9485n2.m31088K0();
                        if (map3 == null) {
                            break;
                        } else {
                            c9520l.f36695k = C9605i.m31767b(map3);
                            break;
                        }
                    case "cookies":
                        c9520l.f36694j = c9485n2.m31090N0();
                        break;
                    case "body_size":
                        c9520l.f36697m = c9485n2.m31086G0();
                        break;
                    case "query_string":
                        c9520l.f36692h = c9485n2.m31090N0();
                        break;
                    case "api_target":
                        c9520l.f36700p = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9520l.m31408m(concurrentHashMap);
            c9485n2.m31889j();
            return c9520l;
        }
    }

    public C9520l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9520l.class != obj.getClass()) {
            return false;
        }
        C9520l c9520l = (C9520l) obj;
        return C9613q.m31800a(this.f36690f, c9520l.f36690f) && C9613q.m31800a(this.f36691g, c9520l.f36691g) && C9613q.m31800a(this.f36692h, c9520l.f36692h) && C9613q.m31800a(this.f36694j, c9520l.f36694j) && C9613q.m31800a(this.f36695k, c9520l.f36695k) && C9613q.m31800a(this.f36696l, c9520l.f36696l) && C9613q.m31800a(this.f36697m, c9520l.f36697m) && C9613q.m31800a(this.f36699o, c9520l.f36699o) && C9613q.m31800a(this.f36700p, c9520l.f36700p);
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36690f, this.f36691g, this.f36692h, this.f36694j, this.f36695k, this.f36696l, this.f36697m, this.f36699o, this.f36700p);
    }

    /* renamed from: l */
    public Map<String, String> m31407l() {
        return this.f36695k;
    }

    /* renamed from: m */
    public void m31408m(Map<String, Object> map) {
        this.f36701q = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36690f != null) {
            interfaceC9415h3.mo30828k("url").mo30819b(this.f36690f);
        }
        if (this.f36691g != null) {
            interfaceC9415h3.mo30828k("method").mo30819b(this.f36691g);
        }
        if (this.f36692h != null) {
            interfaceC9415h3.mo30828k("query_string").mo30819b(this.f36692h);
        }
        if (this.f36693i != null) {
            interfaceC9415h3.mo30828k("data").mo30824g(interfaceC9637w1, this.f36693i);
        }
        if (this.f36694j != null) {
            interfaceC9415h3.mo30828k("cookies").mo30819b(this.f36694j);
        }
        if (this.f36695k != null) {
            interfaceC9415h3.mo30828k("headers").mo30824g(interfaceC9637w1, this.f36695k);
        }
        if (this.f36696l != null) {
            interfaceC9415h3.mo30828k("env").mo30824g(interfaceC9637w1, this.f36696l);
        }
        if (this.f36698n != null) {
            interfaceC9415h3.mo30828k("other").mo30824g(interfaceC9637w1, this.f36698n);
        }
        if (this.f36699o != null) {
            interfaceC9415h3.mo30828k("fragment").mo30824g(interfaceC9637w1, this.f36699o);
        }
        if (this.f36697m != null) {
            interfaceC9415h3.mo30828k("body_size").mo30824g(interfaceC9637w1, this.f36697m);
        }
        if (this.f36700p != null) {
            interfaceC9415h3.mo30828k("api_target").mo30824g(interfaceC9637w1, this.f36700p);
        }
        Map<String, Object> map = this.f36701q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36701q.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9520l(C9520l c9520l) {
        this.f36690f = c9520l.f36690f;
        this.f36694j = c9520l.f36694j;
        this.f36691g = c9520l.f36691g;
        this.f36692h = c9520l.f36692h;
        this.f36695k = C9605i.m31767b(c9520l.f36695k);
        this.f36696l = C9605i.m31767b(c9520l.f36696l);
        this.f36698n = C9605i.m31767b(c9520l.f36698n);
        this.f36701q = C9605i.m31767b(c9520l.f36701q);
        this.f36693i = c9520l.f36693i;
        this.f36699o = c9520l.f36699o;
        this.f36697m = c9520l.f36697m;
        this.f36700p = c9520l.f36700p;
    }
}
