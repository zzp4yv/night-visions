package io.sentry;

import io.sentry.util.C9605i;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryLockReason.java */
/* renamed from: io.sentry.t4 */
/* loaded from: classes2.dex */
public final class C9561t4 implements InterfaceC9545r2 {

    /* renamed from: f */
    private int f36851f;

    /* renamed from: g */
    private String f36852g;

    /* renamed from: h */
    private String f36853h;

    /* renamed from: i */
    private String f36854i;

    /* renamed from: j */
    private Long f36855j;

    /* renamed from: k */
    private Map<String, Object> f36856k;

    /* compiled from: SentryLockReason.java */
    /* renamed from: io.sentry.t4$a */
    public static final class a implements InterfaceC9471l2<C9561t4> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9561t4 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9561t4 c9561t4 = new C9561t4();
            c9485n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "package_name":
                        c9561t4.f36853h = c9485n2.m31090N0();
                        break;
                    case "thread_id":
                        c9561t4.f36855j = c9485n2.m31086G0();
                        break;
                    case "address":
                        c9561t4.f36852g = c9485n2.m31090N0();
                        break;
                    case "class_name":
                        c9561t4.f36854i = c9485n2.m31090N0();
                        break;
                    case "type":
                        c9561t4.f36851f = c9485n2.m31894z();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
            }
            c9561t4.m31648m(concurrentHashMap);
            c9485n2.m31889j();
            return c9561t4;
        }
    }

    public C9561t4() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9561t4.class != obj.getClass()) {
            return false;
        }
        return C9613q.m31800a(this.f36852g, ((C9561t4) obj).f36852g);
    }

    /* renamed from: f */
    public String m31641f() {
        return this.f36852g;
    }

    /* renamed from: g */
    public int m31642g() {
        return this.f36851f;
    }

    /* renamed from: h */
    public void m31643h(String str) {
        this.f36852g = str;
    }

    public int hashCode() {
        return C9613q.m31801b(this.f36852g);
    }

    /* renamed from: i */
    public void m31644i(String str) {
        this.f36854i = str;
    }

    /* renamed from: j */
    public void m31645j(String str) {
        this.f36853h = str;
    }

    /* renamed from: k */
    public void m31646k(Long l) {
        this.f36855j = l;
    }

    /* renamed from: l */
    public void m31647l(int i2) {
        this.f36851f = i2;
    }

    /* renamed from: m */
    public void m31648m(Map<String, Object> map) {
        this.f36856k = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("type").mo30818a(this.f36851f);
        if (this.f36852g != null) {
            interfaceC9415h3.mo30828k("address").mo30819b(this.f36852g);
        }
        if (this.f36853h != null) {
            interfaceC9415h3.mo30828k("package_name").mo30819b(this.f36853h);
        }
        if (this.f36854i != null) {
            interfaceC9415h3.mo30828k("class_name").mo30819b(this.f36854i);
        }
        if (this.f36855j != null) {
            interfaceC9415h3.mo30828k("thread_id").mo30822e(this.f36855j);
        }
        Map<String, Object> map = this.f36856k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36856k.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9561t4(C9561t4 c9561t4) {
        this.f36851f = c9561t4.f36851f;
        this.f36852g = c9561t4.f36852g;
        this.f36853h = c9561t4.f36853h;
        this.f36854i = c9561t4.f36854i;
        this.f36855j = c9561t4.f36855j;
        this.f36856k = C9605i.m31767b(c9561t4.f36856k);
    }
}
