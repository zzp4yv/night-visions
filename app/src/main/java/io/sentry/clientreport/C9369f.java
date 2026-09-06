package io.sentry.clientreport;

import io.sentry.C9485n2;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DiscardedEvent.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.f */
/* loaded from: classes2.dex */
public final class C9369f implements InterfaceC9545r2 {

    /* renamed from: f */
    private final String f36247f;

    /* renamed from: g */
    private final String f36248g;

    /* renamed from: h */
    private final Long f36249h;

    /* renamed from: i */
    private Map<String, Object> f36250i;

    /* compiled from: DiscardedEvent.java */
    /* renamed from: io.sentry.clientreport.f$a */
    public static final class a implements InterfaceC9471l2<C9369f> {
        /* renamed from: c */
        private Exception m30699c(String str, InterfaceC9637w1 interfaceC9637w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9369f mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            String str = null;
            String str2 = null;
            Long l = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "quantity":
                        l = c9485n2.m31086G0();
                        break;
                    case "reason":
                        str = c9485n2.m31090N0();
                        break;
                    case "category":
                        str2 = c9485n2.m31090N0();
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
            if (str == null) {
                throw m30699c("reason", interfaceC9637w1);
            }
            if (str2 == null) {
                throw m30699c("category", interfaceC9637w1);
            }
            if (l == null) {
                throw m30699c("quantity", interfaceC9637w1);
            }
            C9369f c9369f = new C9369f(str, str2, l);
            c9369f.m30698d(hashMap);
            return c9369f;
        }
    }

    public C9369f(String str, String str2, Long l) {
        this.f36247f = str;
        this.f36248g = str2;
        this.f36249h = l;
    }

    /* renamed from: a */
    public String m30695a() {
        return this.f36248g;
    }

    /* renamed from: b */
    public Long m30696b() {
        return this.f36249h;
    }

    /* renamed from: c */
    public String m30697c() {
        return this.f36247f;
    }

    /* renamed from: d */
    public void m30698d(Map<String, Object> map) {
        this.f36250i = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("reason").mo30819b(this.f36247f);
        interfaceC9415h3.mo30828k("category").mo30819b(this.f36248g);
        interfaceC9415h3.mo30828k("quantity").mo30822e(this.f36249h);
        Map<String, Object> map = this.f36250i;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36250i.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f36247f + "', category='" + this.f36248g + "', quantity=" + this.f36249h + '}';
    }
}
