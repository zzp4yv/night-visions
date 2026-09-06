package io.sentry.protocol;

import io.sentry.C9403f5;
import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9506a;
import io.sentry.protocol.C9508b;
import io.sentry.protocol.C9513e;
import io.sentry.protocol.C9515g;
import io.sentry.protocol.C9519k;
import io.sentry.protocol.C9521m;
import io.sentry.protocol.C9527s;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Contexts.java */
/* renamed from: io.sentry.protocol.c */
/* loaded from: classes2.dex */
public final class C9510c extends ConcurrentHashMap<String, Object> implements InterfaceC9545r2 {

    /* renamed from: f */
    private final Object f36602f = new Object();

    /* compiled from: Contexts.java */
    /* renamed from: io.sentry.protocol.c$a */
    public static final class a implements InterfaceC9471l2<C9510c> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9510c mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            C9510c c9510c = new C9510c();
            c9485n2.m31884b();
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "device":
                        c9510c.m31237i(new C9513e.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "response":
                        c9510c.m31240l(new C9521m.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "os":
                        c9510c.m31239k(new C9519k.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "app":
                        c9510c.m31235f(new C9506a.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "gpu":
                        c9510c.m31238j(new C9515g.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "trace":
                        c9510c.m31242n(new C9403f5.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "browser":
                        c9510c.m31236h(new C9508b.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    case "runtime":
                        c9510c.m31241m(new C9527s.a().mo30683a(c9485n2, interfaceC9637w1));
                        break;
                    default:
                        Object m31088K0 = c9485n2.m31088K0();
                        if (m31088K0 == null) {
                            break;
                        } else {
                            c9510c.put(m31879B, m31088K0);
                            break;
                        }
                }
            }
            c9485n2.m31889j();
            return c9510c;
        }
    }

    public C9510c() {
    }

    /* renamed from: o */
    private <T> T m31229o(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    /* renamed from: a */
    public C9506a m31230a() {
        return (C9506a) m31229o("app", C9506a.class);
    }

    /* renamed from: b */
    public C9513e m31231b() {
        return (C9513e) m31229o("device", C9513e.class);
    }

    /* renamed from: c */
    public C9519k m31232c() {
        return (C9519k) m31229o("os", C9519k.class);
    }

    /* renamed from: d */
    public C9527s m31233d() {
        return (C9527s) m31229o("runtime", C9527s.class);
    }

    /* renamed from: e */
    public C9403f5 m31234e() {
        return (C9403f5) m31229o("trace", C9403f5.class);
    }

    /* renamed from: f */
    public void m31235f(C9506a c9506a) {
        put("app", c9506a);
    }

    /* renamed from: h */
    public void m31236h(C9508b c9508b) {
        put("browser", c9508b);
    }

    /* renamed from: i */
    public void m31237i(C9513e c9513e) {
        put("device", c9513e);
    }

    /* renamed from: j */
    public void m31238j(C9515g c9515g) {
        put("gpu", c9515g);
    }

    /* renamed from: k */
    public void m31239k(C9519k c9519k) {
        put("os", c9519k);
    }

    /* renamed from: l */
    public void m31240l(C9521m c9521m) {
        synchronized (this.f36602f) {
            put("response", c9521m);
        }
    }

    /* renamed from: m */
    public void m31241m(C9527s c9527s) {
        put("runtime", c9527s);
    }

    /* renamed from: n */
    public void m31242n(C9403f5 c9403f5) {
        C9613q.m31802c(c9403f5, "traceContext is required");
        put("trace", c9403f5);
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9510c(C9510c c9510c) {
        for (Map.Entry<String, Object> entry : c9510c.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C9506a)) {
                    m31235f(new C9506a((C9506a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C9508b)) {
                    m31236h(new C9508b((C9508b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C9513e)) {
                    m31237i(new C9513e((C9513e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof C9519k)) {
                    m31239k(new C9519k((C9519k) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C9527s)) {
                    m31241m(new C9527s((C9527s) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C9515g)) {
                    m31238j(new C9515g((C9515g) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof C9403f5)) {
                    m31242n(new C9403f5((C9403f5) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof C9521m)) {
                    m31240l(new C9521m((C9521m) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
