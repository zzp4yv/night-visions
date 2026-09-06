package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9605i;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Mechanism.java */
/* renamed from: io.sentry.protocol.i */
/* loaded from: classes2.dex */
public final class C9517i implements InterfaceC9545r2 {

    /* renamed from: f */
    private final transient Thread f36670f;

    /* renamed from: g */
    private String f36671g;

    /* renamed from: h */
    private String f36672h;

    /* renamed from: i */
    private String f36673i;

    /* renamed from: j */
    private Boolean f36674j;

    /* renamed from: k */
    private Map<String, Object> f36675k;

    /* renamed from: l */
    private Map<String, Object> f36676l;

    /* renamed from: m */
    private Boolean f36677m;

    /* renamed from: n */
    private Map<String, Object> f36678n;

    /* compiled from: Mechanism.java */
    /* renamed from: io.sentry.protocol.i$a */
    public static final class a implements InterfaceC9471l2<C9517i> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9517i mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9517i c9517i = new C9517i();
            c9485n2.m31884b();
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "description":
                        c9517i.f36672h = c9485n2.m31090N0();
                        break;
                    case "data":
                        c9517i.f36676l = C9605i.m31767b((Map) c9485n2.m31088K0());
                        break;
                    case "meta":
                        c9517i.f36675k = C9605i.m31767b((Map) c9485n2.m31088K0());
                        break;
                    case "type":
                        c9517i.f36671g = c9485n2.m31090N0();
                        break;
                    case "handled":
                        c9517i.f36674j = c9485n2.m31093p0();
                        break;
                    case "synthetic":
                        c9517i.f36677m = c9485n2.m31093p0();
                        break;
                    case "help_link":
                        c9517i.f36673i = c9485n2.m31090N0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                        break;
                }
            }
            c9485n2.m31889j();
            c9517i.m31373k(hashMap);
            return c9517i;
        }
    }

    public C9517i() {
        this(null);
    }

    /* renamed from: h */
    public Boolean m31370h() {
        return this.f36674j;
    }

    /* renamed from: i */
    public void m31371i(Boolean bool) {
        this.f36674j = bool;
    }

    /* renamed from: j */
    public void m31372j(String str) {
        this.f36671g = str;
    }

    /* renamed from: k */
    public void m31373k(Map<String, Object> map) {
        this.f36678n = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36671g != null) {
            interfaceC9415h3.mo30828k("type").mo30819b(this.f36671g);
        }
        if (this.f36672h != null) {
            interfaceC9415h3.mo30828k("description").mo30819b(this.f36672h);
        }
        if (this.f36673i != null) {
            interfaceC9415h3.mo30828k("help_link").mo30819b(this.f36673i);
        }
        if (this.f36674j != null) {
            interfaceC9415h3.mo30828k("handled").mo30825h(this.f36674j);
        }
        if (this.f36675k != null) {
            interfaceC9415h3.mo30828k("meta").mo30824g(interfaceC9637w1, this.f36675k);
        }
        if (this.f36676l != null) {
            interfaceC9415h3.mo30828k("data").mo30824g(interfaceC9637w1, this.f36676l);
        }
        if (this.f36677m != null) {
            interfaceC9415h3.mo30828k("synthetic").mo30825h(this.f36677m);
        }
        Map<String, Object> map = this.f36678n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36678n.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9517i(Thread thread) {
        this.f36670f = thread;
    }
}
