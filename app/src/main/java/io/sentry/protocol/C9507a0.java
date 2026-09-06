package io.sentry.protocol;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9514f;
import io.sentry.util.C9605i;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: User.java */
/* renamed from: io.sentry.protocol.a0 */
/* loaded from: classes2.dex */
public final class C9507a0 implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36587f;

    /* renamed from: g */
    private String f36588g;

    /* renamed from: h */
    private String f36589h;

    /* renamed from: i */
    private String f36590i;

    /* renamed from: j */
    private String f36591j;

    /* renamed from: k */
    private String f36592k;

    /* renamed from: l */
    private C9514f f36593l;

    /* renamed from: m */
    private Map<String, String> f36594m;

    /* renamed from: n */
    private Map<String, Object> f36595n;

    /* compiled from: User.java */
    /* renamed from: io.sentry.protocol.a0$a */
    public static final class a implements InterfaceC9471l2<C9507a0> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9507a0 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9507a0 c9507a0 = new C9507a0();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "username":
                        c9507a0.f36589h = c9485n2.m31090N0();
                        break;
                    case "id":
                        c9507a0.f36588g = c9485n2.m31090N0();
                        break;
                    case "geo":
                        c9507a0.f36593l = new C9514f.a().mo30683a(c9485n2, interfaceC9637w1);
                        break;
                    case "data":
                        c9507a0.f36594m = C9605i.m31767b((Map) c9485n2.m31088K0());
                        break;
                    case "name":
                        c9507a0.f36592k = c9485n2.m31090N0();
                        break;
                    case "email":
                        c9507a0.f36587f = c9485n2.m31090N0();
                        break;
                    case "other":
                        if (c9507a0.f36594m != null && !c9507a0.f36594m.isEmpty()) {
                            break;
                        } else {
                            c9507a0.f36594m = C9605i.m31767b((Map) c9485n2.m31088K0());
                            break;
                        }
                    case "ip_address":
                        c9507a0.f36591j = c9485n2.m31090N0();
                        break;
                    case "segment":
                        c9507a0.f36590i = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9507a0.m31221p(concurrentHashMap);
            c9485n2.m31889j();
            return c9507a0;
        }
    }

    public C9507a0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9507a0.class != obj.getClass()) {
            return false;
        }
        C9507a0 c9507a0 = (C9507a0) obj;
        return C9613q.m31800a(this.f36587f, c9507a0.f36587f) && C9613q.m31800a(this.f36588g, c9507a0.f36588g) && C9613q.m31800a(this.f36589h, c9507a0.f36589h) && C9613q.m31800a(this.f36590i, c9507a0.f36590i) && C9613q.m31800a(this.f36591j, c9507a0.f36591j);
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36587f, this.f36588g, this.f36589h, this.f36590i, this.f36591j);
    }

    /* renamed from: j */
    public Map<String, String> m31215j() {
        return this.f36594m;
    }

    /* renamed from: k */
    public String m31216k() {
        return this.f36588g;
    }

    /* renamed from: l */
    public String m31217l() {
        return this.f36591j;
    }

    /* renamed from: m */
    public String m31218m() {
        return this.f36590i;
    }

    /* renamed from: n */
    public void m31219n(String str) {
        this.f36588g = str;
    }

    /* renamed from: o */
    public void m31220o(String str) {
        this.f36591j = str;
    }

    /* renamed from: p */
    public void m31221p(Map<String, Object> map) {
        this.f36595n = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36587f != null) {
            interfaceC9415h3.mo30828k("email").mo30819b(this.f36587f);
        }
        if (this.f36588g != null) {
            interfaceC9415h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30819b(this.f36588g);
        }
        if (this.f36589h != null) {
            interfaceC9415h3.mo30828k("username").mo30819b(this.f36589h);
        }
        if (this.f36590i != null) {
            interfaceC9415h3.mo30828k("segment").mo30819b(this.f36590i);
        }
        if (this.f36591j != null) {
            interfaceC9415h3.mo30828k("ip_address").mo30819b(this.f36591j);
        }
        if (this.f36592k != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36592k);
        }
        if (this.f36593l != null) {
            interfaceC9415h3.mo30828k("geo");
            this.f36593l.serialize(interfaceC9415h3, interfaceC9637w1);
        }
        if (this.f36594m != null) {
            interfaceC9415h3.mo30828k("data").mo30824g(interfaceC9637w1, this.f36594m);
        }
        Map<String, Object> map = this.f36595n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36595n.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9507a0(C9507a0 c9507a0) {
        this.f36587f = c9507a0.f36587f;
        this.f36589h = c9507a0.f36589h;
        this.f36588g = c9507a0.f36588g;
        this.f36591j = c9507a0.f36591j;
        this.f36590i = c9507a0.f36590i;
        this.f36592k = c9507a0.f36592k;
        this.f36593l = c9507a0.f36593l;
        this.f36594m = C9605i.m31767b(c9507a0.f36594m);
        this.f36595n = C9605i.m31767b(c9507a0.f36595n);
    }
}
