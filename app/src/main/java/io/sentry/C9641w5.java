package io.sentry;

import io.sentry.protocol.C9525q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UserFeedback.java */
/* renamed from: io.sentry.w5 */
/* loaded from: classes2.dex */
public final class C9641w5 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final C9525q f37005f;

    /* renamed from: g */
    private String f37006g;

    /* renamed from: h */
    private String f37007h;

    /* renamed from: i */
    private String f37008i;

    /* renamed from: j */
    private Map<String, Object> f37009j;

    /* compiled from: UserFeedback.java */
    /* renamed from: io.sentry.w5$a */
    public static final class a implements InterfaceC9471l2<C9641w5> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9641w5 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9525q c9525q = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "comments":
                        str3 = c9485n2.m31090N0();
                        break;
                    case "name":
                        str = c9485n2.m31090N0();
                        break;
                    case "email":
                        str2 = c9485n2.m31090N0();
                        break;
                    case "event_id":
                        c9525q = new C9525q.a().mo30683a(c9485n2, interfaceC9637w1);
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
            if (c9525q != null) {
                C9641w5 c9641w5 = new C9641w5(c9525q, str, str2, str3);
                c9641w5.m31935a(hashMap);
                return c9641w5;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C9641w5(C9525q c9525q, String str, String str2, String str3) {
        this.f37005f = c9525q;
        this.f37006g = str;
        this.f37007h = str2;
        this.f37008i = str3;
    }

    /* renamed from: a */
    public void m31935a(Map<String, Object> map) {
        this.f37009j = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("event_id");
        this.f37005f.serialize(interfaceC9415h3, interfaceC9637w1);
        if (this.f37006g != null) {
            interfaceC9415h3.mo30828k("name").mo30819b(this.f37006g);
        }
        if (this.f37007h != null) {
            interfaceC9415h3.mo30828k("email").mo30819b(this.f37007h);
        }
        if (this.f37008i != null) {
            interfaceC9415h3.mo30828k("comments").mo30819b(this.f37008i);
        }
        Map<String, Object> map = this.f37009j;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f37009j.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f37005f + ", name='" + this.f37006g + "', email='" + this.f37007h + "', comments='" + this.f37008i + "'}";
    }
}
