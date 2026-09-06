package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9517i;
import io.sentry.protocol.C9530v;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryException.java */
/* renamed from: io.sentry.protocol.p */
/* loaded from: classes2.dex */
public final class C9524p implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36718f;

    /* renamed from: g */
    private String f36719g;

    /* renamed from: h */
    private String f36720h;

    /* renamed from: i */
    private Long f36721i;

    /* renamed from: j */
    private C9530v f36722j;

    /* renamed from: k */
    private C9517i f36723k;

    /* renamed from: l */
    private Map<String, Object> f36724l;

    /* compiled from: SentryException.java */
    /* renamed from: io.sentry.protocol.p$a */
    public static final class a implements InterfaceC9471l2<C9524p> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9524p mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9524p c9524p = new C9524p();
            c9485n2.m31884b();
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "thread_id":
                        c9524p.f36721i = c9485n2.m31086G0();
                        break;
                    case "module":
                        c9524p.f36720h = c9485n2.m31090N0();
                        break;
                    case "type":
                        c9524p.f36718f = c9485n2.m31090N0();
                        break;
                    case "value":
                        c9524p.f36719g = c9485n2.m31090N0();
                        break;
                    case "mechanism":
                        c9524p.f36723k = (C9517i) c9485n2.m31089M0(interfaceC9637w1, new C9517i.a());
                        break;
                    case "stacktrace":
                        c9524p.f36722j = (C9530v) c9485n2.m31089M0(interfaceC9637w1, new C9530v.a());
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
            c9524p.m31449o(hashMap);
            return c9524p;
        }
    }

    /* renamed from: g */
    public C9517i m31441g() {
        return this.f36723k;
    }

    /* renamed from: h */
    public Long m31442h() {
        return this.f36721i;
    }

    /* renamed from: i */
    public String m31443i() {
        return this.f36718f;
    }

    /* renamed from: j */
    public void m31444j(C9517i c9517i) {
        this.f36723k = c9517i;
    }

    /* renamed from: k */
    public void m31445k(String str) {
        this.f36720h = str;
    }

    /* renamed from: l */
    public void m31446l(C9530v c9530v) {
        this.f36722j = c9530v;
    }

    /* renamed from: m */
    public void m31447m(Long l) {
        this.f36721i = l;
    }

    /* renamed from: n */
    public void m31448n(String str) {
        this.f36718f = str;
    }

    /* renamed from: o */
    public void m31449o(Map<String, Object> map) {
        this.f36724l = map;
    }

    /* renamed from: p */
    public void m31450p(String str) {
        this.f36719g = str;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36718f != null) {
            interfaceC9415h3.mo30828k("type").mo30819b(this.f36718f);
        }
        if (this.f36719g != null) {
            interfaceC9415h3.mo30828k("value").mo30819b(this.f36719g);
        }
        if (this.f36720h != null) {
            interfaceC9415h3.mo30828k("module").mo30819b(this.f36720h);
        }
        if (this.f36721i != null) {
            interfaceC9415h3.mo30828k("thread_id").mo30822e(this.f36721i);
        }
        if (this.f36722j != null) {
            interfaceC9415h3.mo30828k("stacktrace").mo30824g(interfaceC9637w1, this.f36722j);
        }
        if (this.f36723k != null) {
            interfaceC9415h3.mo30828k("mechanism").mo30824g(interfaceC9637w1, this.f36723k);
        }
        Map<String, Object> map = this.f36724l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36724l.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
