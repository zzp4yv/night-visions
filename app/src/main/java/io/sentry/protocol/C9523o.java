package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.C9540q4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9526r;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: SdkVersion.java */
/* renamed from: io.sentry.protocol.o */
/* loaded from: classes2.dex */
public final class C9523o implements InterfaceC9545r2 {

    /* renamed from: f */
    private String f36713f;

    /* renamed from: g */
    private String f36714g;

    /* renamed from: h */
    private Set<C9526r> f36715h;

    /* renamed from: i */
    private Set<String> f36716i;

    /* renamed from: j */
    private Map<String, Object> f36717j;

    /* compiled from: SdkVersion.java */
    /* renamed from: io.sentry.protocol.o$a */
    public static final class a implements InterfaceC9471l2<C9523o> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9523o mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c9485n2.m31884b();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "name":
                        str = c9485n2.m31881J();
                        break;
                    case "version":
                        str2 = c9485n2.m31881J();
                        break;
                    case "packages":
                        List m31085F0 = c9485n2.m31085F0(interfaceC9637w1, new C9526r.a());
                        if (m31085F0 == null) {
                            break;
                        } else {
                            arrayList.addAll(m31085F0);
                            break;
                        }
                    case "integrations":
                        List list = (List) c9485n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                        break;
                }
            }
            c9485n2.m31889j();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            C9523o c9523o = new C9523o(str, str2);
            c9523o.f36715h = new CopyOnWriteArraySet(arrayList);
            c9523o.f36716i = new CopyOnWriteArraySet(arrayList2);
            c9523o.m31432i(hashMap);
            return c9523o;
        }
    }

    public C9523o(String str, String str2) {
        this.f36713f = (String) C9613q.m31802c(str, "name is required.");
        this.f36714g = (String) C9613q.m31802c(str2, "version is required.");
    }

    /* renamed from: k */
    public static C9523o m31425k(C9523o c9523o, String str, String str2) {
        C9613q.m31802c(str, "name is required.");
        C9613q.m31802c(str2, "version is required.");
        if (c9523o == null) {
            return new C9523o(str, str2);
        }
        c9523o.m31431h(str);
        c9523o.m31433j(str2);
        return c9523o;
    }

    /* renamed from: c */
    public void m31426c(String str, String str2) {
        C9540q4.m31555c().m31557b(str, str2);
    }

    /* renamed from: d */
    public Set<String> m31427d() {
        Set<String> set = this.f36716i;
        return set != null ? set : C9540q4.m31555c().m31558d();
    }

    /* renamed from: e */
    public String m31428e() {
        return this.f36713f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9523o.class != obj.getClass()) {
            return false;
        }
        C9523o c9523o = (C9523o) obj;
        return this.f36713f.equals(c9523o.f36713f) && this.f36714g.equals(c9523o.f36714g);
    }

    /* renamed from: f */
    public Set<C9526r> m31429f() {
        Set<C9526r> set = this.f36715h;
        return set != null ? set : C9540q4.m31555c().m31559e();
    }

    /* renamed from: g */
    public String m31430g() {
        return this.f36714g;
    }

    /* renamed from: h */
    public void m31431h(String str) {
        this.f36713f = (String) C9613q.m31802c(str, "name is required.");
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36713f, this.f36714g);
    }

    /* renamed from: i */
    public void m31432i(Map<String, Object> map) {
        this.f36717j = map;
    }

    /* renamed from: j */
    public void m31433j(String str) {
        this.f36714g = (String) C9613q.m31802c(str, "version is required.");
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("name").mo30819b(this.f36713f);
        interfaceC9415h3.mo30828k("version").mo30819b(this.f36714g);
        Set<C9526r> m31429f = m31429f();
        Set<String> m31427d = m31427d();
        if (!m31429f.isEmpty()) {
            interfaceC9415h3.mo30828k("packages").mo30824g(interfaceC9637w1, m31429f);
        }
        if (!m31427d.isEmpty()) {
            interfaceC9415h3.mo30828k("integrations").mo30824g(interfaceC9637w1, m31427d);
        }
        Map<String, Object> map = this.f36717j;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36717j.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
