package io.sentry.profilemeasurements;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.profilemeasurements.C9504b;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfileMeasurement.java */
@ApiStatus.Internal
/* renamed from: io.sentry.profilemeasurements.a */
/* loaded from: classes2.dex */
public final class C9503a implements InterfaceC9545r2 {

    /* renamed from: f */
    private Map<String, Object> f36570f;

    /* renamed from: g */
    private String f36571g;

    /* renamed from: h */
    private Collection<C9504b> f36572h;

    /* compiled from: ProfileMeasurement.java */
    /* renamed from: io.sentry.profilemeasurements.a$a */
    public static final class a implements InterfaceC9471l2<C9503a> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9503a mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            C9503a c9503a = new C9503a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("values")) {
                    List m31085F0 = c9485n2.m31085F0(interfaceC9637w1, new C9504b.a());
                    if (m31085F0 != null) {
                        c9503a.f36572h = m31085F0;
                    }
                } else if (m31879B.equals("unit")) {
                    String m31090N0 = c9485n2.m31090N0();
                    if (m31090N0 != null) {
                        c9503a.f36571g = m31090N0;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                }
            }
            c9503a.m31179c(concurrentHashMap);
            c9485n2.m31889j();
            return c9503a;
        }
    }

    public C9503a() {
        this("unknown", new ArrayList());
    }

    /* renamed from: c */
    public void m31179c(Map<String, Object> map) {
        this.f36570f = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9503a.class != obj.getClass()) {
            return false;
        }
        C9503a c9503a = (C9503a) obj;
        return C9613q.m31800a(this.f36570f, c9503a.f36570f) && this.f36571g.equals(c9503a.f36571g) && new ArrayList(this.f36572h).equals(new ArrayList(c9503a.f36572h));
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36570f, this.f36571g, this.f36572h);
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("unit").mo30824g(interfaceC9637w1, this.f36571g);
        interfaceC9415h3.mo30828k("values").mo30824g(interfaceC9637w1, this.f36572h);
        Map<String, Object> map = this.f36570f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36570f.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9503a(String str, Collection<C9504b> collection) {
        this.f36571g = str;
        this.f36572h = collection;
    }
}
