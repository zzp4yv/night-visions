package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MeasurementValue.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.h */
/* loaded from: classes2.dex */
public final class C9516h implements InterfaceC9545r2 {

    /* renamed from: f */
    private final Number f36667f;

    /* renamed from: g */
    private final String f36668g;

    /* renamed from: h */
    private Map<String, Object> f36669h;

    /* compiled from: MeasurementValue.java */
    /* renamed from: io.sentry.protocol.h$a */
    public static final class a implements InterfaceC9471l2<C9516h> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9516h mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("unit")) {
                    str = c9485n2.m31090N0();
                } else if (m31879B.equals("value")) {
                    number = (Number) c9485n2.m31088K0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                }
            }
            c9485n2.m31889j();
            if (number != null) {
                C9516h c9516h = new C9516h(number, str);
                c9516h.m31361a(concurrentHashMap);
                return c9516h;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C9516h(Number number, String str) {
        this.f36667f = number;
        this.f36668g = str;
    }

    /* renamed from: a */
    public void m31361a(Map<String, Object> map) {
        this.f36669h = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("value").mo30822e(this.f36667f);
        if (this.f36668g != null) {
            interfaceC9415h3.mo30828k("unit").mo30819b(this.f36668g);
        }
        Map<String, Object> map = this.f36669h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36669h.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
