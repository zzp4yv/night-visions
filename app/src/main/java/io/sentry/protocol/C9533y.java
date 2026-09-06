package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TransactionInfo.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.y */
/* loaded from: classes2.dex */
public final class C9533y implements InterfaceC9545r2 {

    /* renamed from: f */
    private final String f36787f;

    /* renamed from: g */
    private Map<String, Object> f36788g;

    /* compiled from: TransactionInfo.java */
    /* renamed from: io.sentry.protocol.y$a */
    public static final class a implements InterfaceC9471l2<C9533y> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9533y mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            c9485n2.m31884b();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("source")) {
                    str = c9485n2.m31090N0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                }
            }
            C9533y c9533y = new C9533y(str);
            c9533y.m31546a(concurrentHashMap);
            c9485n2.m31889j();
            return c9533y;
        }
    }

    public C9533y(String str) {
        this.f36787f = str;
    }

    /* renamed from: a */
    public void m31546a(Map<String, Object> map) {
        this.f36788g = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36787f != null) {
            interfaceC9415h3.mo30828k("source").mo30824g(interfaceC9637w1, this.f36787f);
        }
        Map<String, Object> map = this.f36788g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36788g.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
