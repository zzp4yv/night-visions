package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.protocol.C9522n;
import io.sentry.protocol.DebugImage;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DebugMeta.java */
/* renamed from: io.sentry.protocol.d */
/* loaded from: classes2.dex */
public final class C9512d implements InterfaceC9545r2 {

    /* renamed from: f */
    private C9522n f36615f;

    /* renamed from: g */
    private List<DebugImage> f36616g;

    /* renamed from: h */
    private Map<String, Object> f36617h;

    /* compiled from: DebugMeta.java */
    /* renamed from: io.sentry.protocol.d$a */
    public static final class a implements InterfaceC9471l2<C9512d> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9512d mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            C9512d c9512d = new C9512d();
            c9485n2.m31884b();
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("images")) {
                    c9512d.f36616g = c9485n2.m31085F0(interfaceC9637w1, new DebugImage.C9505a());
                } else if (m31879B.equals("sdk_info")) {
                    c9512d.f36615f = (C9522n) c9485n2.m31089M0(interfaceC9637w1, new C9522n.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                }
            }
            c9485n2.m31889j();
            c9512d.m31270e(hashMap);
            return c9512d;
        }
    }

    /* renamed from: c */
    public List<DebugImage> m31268c() {
        return this.f36616g;
    }

    /* renamed from: d */
    public void m31269d(List<DebugImage> list) {
        this.f36616g = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: e */
    public void m31270e(Map<String, Object> map) {
        this.f36617h = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36615f != null) {
            interfaceC9415h3.mo30828k("sdk_info").mo30824g(interfaceC9637w1, this.f36615f);
        }
        if (this.f36616g != null) {
            interfaceC9415h3.mo30828k("images").mo30824g(interfaceC9637w1, this.f36616g);
        }
        Map<String, Object> map = this.f36617h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36617h.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
