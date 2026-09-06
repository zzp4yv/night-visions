package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SdkInfo.java */
/* renamed from: io.sentry.protocol.n */
/* loaded from: classes2.dex */
public final class C9522n implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36708f;

    /* renamed from: g */
    private Integer f36709g;

    /* renamed from: h */
    private Integer f36710h;

    /* renamed from: i */
    private Integer f36711i;

    /* renamed from: j */
    private Map<String, Object> f36712j;

    /* compiled from: SdkInfo.java */
    /* renamed from: io.sentry.protocol.n$a */
    public static final class a implements InterfaceC9471l2<C9522n> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9522n mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9522n c9522n = new C9522n();
            c9485n2.m31884b();
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "sdk_name":
                        c9522n.f36708f = c9485n2.m31090N0();
                        break;
                    case "version_patchlevel":
                        c9522n.f36711i = c9485n2.m31084E0();
                        break;
                    case "version_major":
                        c9522n.f36709g = c9485n2.m31084E0();
                        break;
                    case "version_minor":
                        c9522n.f36710h = c9485n2.m31084E0();
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
            c9522n.m31421e(hashMap);
            return c9522n;
        }
    }

    /* renamed from: e */
    public void m31421e(Map<String, Object> map) {
        this.f36712j = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36708f != null) {
            interfaceC9415h3.mo30828k("sdk_name").mo30819b(this.f36708f);
        }
        if (this.f36709g != null) {
            interfaceC9415h3.mo30828k("version_major").mo30822e(this.f36709g);
        }
        if (this.f36710h != null) {
            interfaceC9415h3.mo30828k("version_minor").mo30822e(this.f36710h);
        }
        if (this.f36711i != null) {
            interfaceC9415h3.mo30828k("version_patchlevel").mo30822e(this.f36711i);
        }
        Map<String, Object> map = this.f36712j;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36712j.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
