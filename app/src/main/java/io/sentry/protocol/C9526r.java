package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p024c.p052i.p059j.C0953c;

/* compiled from: SentryPackage.java */
/* renamed from: io.sentry.protocol.r */
/* loaded from: classes2.dex */
public final class C9526r implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36727f;

    /* renamed from: g */
    private String f36728g;

    /* renamed from: h */
    private Map<String, Object> f36729h;

    /* compiled from: SentryPackage.java */
    /* renamed from: io.sentry.protocol.r$a */
    public static final class a implements InterfaceC9471l2<C9526r> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9526r mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("name")) {
                    str = c9485n2.m31881J();
                } else if (m31879B.equals("version")) {
                    str2 = c9485n2.m31881J();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                }
            }
            c9485n2.m31889j();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 != null) {
                C9526r c9526r = new C9526r(str, str2);
                c9526r.m31454a(hashMap);
                return c9526r;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public C9526r(String str, String str2) {
        this.f36727f = (String) C9613q.m31802c(str, "name is required.");
        this.f36728g = (String) C9613q.m31802c(str2, "version is required.");
    }

    /* renamed from: a */
    public void m31454a(Map<String, Object> map) {
        this.f36729h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9526r.class != obj.getClass()) {
            return false;
        }
        C9526r c9526r = (C9526r) obj;
        return C0953c.m6055a(this.f36727f, c9526r.f36727f) && C0953c.m6055a(this.f36728g, c9526r.f36728g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36727f, this.f36728g});
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("name").mo30819b(this.f36727f);
        interfaceC9415h3.mo30828k("version").mo30819b(this.f36728g);
        Map<String, Object> map = this.f36729h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36729h.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
