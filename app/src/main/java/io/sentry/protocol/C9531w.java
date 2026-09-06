package io.sentry.protocol;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import io.sentry.C9485n2;
import io.sentry.C9561t4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9530v;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryThread.java */
/* renamed from: io.sentry.protocol.w */
/* loaded from: classes2.dex */
public final class C9531w implements InterfaceC9545r2 {

    /* renamed from: f */
    private Long f36768f;

    /* renamed from: g */
    private Integer f36769g;

    /* renamed from: h */
    private String f36770h;

    /* renamed from: i */
    private String f36771i;

    /* renamed from: j */
    private Boolean f36772j;

    /* renamed from: k */
    private Boolean f36773k;

    /* renamed from: l */
    private Boolean f36774l;

    /* renamed from: m */
    private Boolean f36775m;

    /* renamed from: n */
    private C9530v f36776n;

    /* renamed from: o */
    private Map<String, C9561t4> f36777o;

    /* renamed from: p */
    private Map<String, Object> f36778p;

    /* compiled from: SentryThread.java */
    /* renamed from: io.sentry.protocol.w$a */
    public static final class a implements InterfaceC9471l2<C9531w> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9531w mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9531w c9531w = new C9531w();
            c9485n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "daemon":
                        c9531w.f36774l = c9485n2.m31093p0();
                        break;
                    case "priority":
                        c9531w.f36769g = c9485n2.m31084E0();
                        break;
                    case "held_locks":
                        Map m31087J0 = c9485n2.m31087J0(interfaceC9637w1, new C9561t4.a());
                        if (m31087J0 == null) {
                            break;
                        } else {
                            c9531w.f36777o = new HashMap(m31087J0);
                            break;
                        }
                    case "id":
                        c9531w.f36768f = c9485n2.m31086G0();
                        break;
                    case "main":
                        c9531w.f36775m = c9485n2.m31093p0();
                        break;
                    case "name":
                        c9531w.f36770h = c9485n2.m31090N0();
                        break;
                    case "state":
                        c9531w.f36771i = c9485n2.m31090N0();
                        break;
                    case "crashed":
                        c9531w.f36772j = c9485n2.m31093p0();
                        break;
                    case "current":
                        c9531w.f36773k = c9485n2.m31093p0();
                        break;
                    case "stacktrace":
                        c9531w.f36776n = (C9530v) c9485n2.m31089M0(interfaceC9637w1, new C9530v.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9531w.m31514A(concurrentHashMap);
            c9485n2.m31889j();
            return c9531w;
        }
    }

    /* renamed from: A */
    public void m31514A(Map<String, Object> map) {
        this.f36778p = map;
    }

    /* renamed from: k */
    public Map<String, C9561t4> m31515k() {
        return this.f36777o;
    }

    /* renamed from: l */
    public Long m31516l() {
        return this.f36768f;
    }

    /* renamed from: m */
    public String m31517m() {
        return this.f36770h;
    }

    /* renamed from: n */
    public C9530v m31518n() {
        return this.f36776n;
    }

    /* renamed from: o */
    public Boolean m31519o() {
        return this.f36773k;
    }

    /* renamed from: p */
    public Boolean m31520p() {
        return this.f36775m;
    }

    /* renamed from: q */
    public void m31521q(Boolean bool) {
        this.f36772j = bool;
    }

    /* renamed from: r */
    public void m31522r(Boolean bool) {
        this.f36773k = bool;
    }

    /* renamed from: s */
    public void m31523s(Boolean bool) {
        this.f36774l = bool;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36768f != null) {
            interfaceC9415h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30822e(this.f36768f);
        }
        if (this.f36769g != null) {
            interfaceC9415h3.mo30828k("priority").mo30822e(this.f36769g);
        }
        if (this.f36770h != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f36770h);
        }
        if (this.f36771i != null) {
            interfaceC9415h3.mo30828k("state").mo30819b(this.f36771i);
        }
        if (this.f36772j != null) {
            interfaceC9415h3.mo30828k("crashed").mo30825h(this.f36772j);
        }
        if (this.f36773k != null) {
            interfaceC9415h3.mo30828k("current").mo30825h(this.f36773k);
        }
        if (this.f36774l != null) {
            interfaceC9415h3.mo30828k("daemon").mo30825h(this.f36774l);
        }
        if (this.f36775m != null) {
            interfaceC9415h3.mo30828k("main").mo30825h(this.f36775m);
        }
        if (this.f36776n != null) {
            interfaceC9415h3.mo30828k("stacktrace").mo30824g(interfaceC9637w1, this.f36776n);
        }
        if (this.f36777o != null) {
            interfaceC9415h3.mo30828k("held_locks").mo30824g(interfaceC9637w1, this.f36777o);
        }
        Map<String, Object> map = this.f36778p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36778p.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    /* renamed from: t */
    public void m31524t(Map<String, C9561t4> map) {
        this.f36777o = map;
    }

    /* renamed from: u */
    public void m31525u(Long l) {
        this.f36768f = l;
    }

    /* renamed from: v */
    public void m31526v(Boolean bool) {
        this.f36775m = bool;
    }

    /* renamed from: w */
    public void m31527w(String str) {
        this.f36770h = str;
    }

    /* renamed from: x */
    public void m31528x(Integer num) {
        this.f36769g = num;
    }

    /* renamed from: y */
    public void m31529y(C9530v c9530v) {
        this.f36776n = c9530v;
    }

    /* renamed from: z */
    public void m31530z(String str) {
        this.f36771i = str;
    }
}
