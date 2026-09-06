package io.sentry.profilemeasurements;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfileMeasurementValue.java */
@ApiStatus.Internal
/* renamed from: io.sentry.profilemeasurements.b */
/* loaded from: classes2.dex */
public final class C9504b implements InterfaceC9545r2 {

    /* renamed from: f */
    private Map<String, Object> f36573f;

    /* renamed from: g */
    private String f36574g;

    /* renamed from: h */
    private double f36575h;

    /* compiled from: ProfileMeasurementValue.java */
    /* renamed from: io.sentry.profilemeasurements.b$a */
    public static final class a implements InterfaceC9471l2<C9504b> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9504b mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            C9504b c9504b = new C9504b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("elapsed_since_start_ns")) {
                    String m31090N0 = c9485n2.m31090N0();
                    if (m31090N0 != null) {
                        c9504b.f36574g = m31090N0;
                    }
                } else if (m31879B.equals("value")) {
                    Double m31095t0 = c9485n2.m31095t0();
                    if (m31095t0 != null) {
                        c9504b.f36575h = m31095t0.doubleValue();
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                }
            }
            c9504b.m31183c(concurrentHashMap);
            c9485n2.m31889j();
            return c9504b;
        }
    }

    public C9504b() {
        this(0L, 0);
    }

    /* renamed from: c */
    public void m31183c(Map<String, Object> map) {
        this.f36573f = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9504b.class != obj.getClass()) {
            return false;
        }
        C9504b c9504b = (C9504b) obj;
        return C9613q.m31800a(this.f36573f, c9504b.f36573f) && this.f36574g.equals(c9504b.f36574g) && this.f36575h == c9504b.f36575h;
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36573f, this.f36574g, Double.valueOf(this.f36575h));
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("value").mo30824g(interfaceC9637w1, Double.valueOf(this.f36575h));
        interfaceC9415h3.mo30828k("elapsed_since_start_ns").mo30824g(interfaceC9637w1, this.f36574g);
        Map<String, Object> map = this.f36573f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36573f.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9504b(Long l, Number number) {
        this.f36574g = l.toString();
        this.f36575h = number.doubleValue();
    }
}
