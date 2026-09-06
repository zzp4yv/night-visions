package io.sentry;

import io.sentry.C9495o5;
import io.sentry.protocol.C9523o;
import io.sentry.protocol.C9525q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeHeader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.i4 */
/* loaded from: classes2.dex */
public final class C9440i4 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final C9525q f36355f;

    /* renamed from: g */
    private final C9523o f36356g;

    /* renamed from: h */
    private final C9495o5 f36357h;

    /* renamed from: i */
    private Date f36358i;

    /* renamed from: j */
    private Map<String, Object> f36359j;

    /* compiled from: SentryEnvelopeHeader.java */
    /* renamed from: io.sentry.i4$a */
    public static final class a implements InterfaceC9471l2<C9440i4> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9440i4 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9525q c9525q = null;
            C9523o c9523o = null;
            C9495o5 c9495o5 = null;
            Date date = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "sdk":
                        c9523o = (C9523o) c9485n2.m31089M0(interfaceC9637w1, new C9523o.a());
                        break;
                    case "trace":
                        c9495o5 = (C9495o5) c9485n2.m31089M0(interfaceC9637w1, new C9495o5.b());
                        break;
                    case "event_id":
                        c9525q = (C9525q) c9485n2.m31089M0(interfaceC9637w1, new C9525q.a());
                        break;
                    case "sent_at":
                        date = c9485n2.m31094q0(interfaceC9637w1);
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                        break;
                }
            }
            C9440i4 c9440i4 = new C9440i4(c9525q, c9523o, c9495o5);
            c9440i4.m30852d(date);
            c9440i4.m30853e(hashMap);
            c9485n2.m31889j();
            return c9440i4;
        }
    }

    public C9440i4(C9525q c9525q, C9523o c9523o) {
        this(c9525q, c9523o, null);
    }

    /* renamed from: a */
    public C9525q m30849a() {
        return this.f36355f;
    }

    /* renamed from: b */
    public C9523o m30850b() {
        return this.f36356g;
    }

    /* renamed from: c */
    public C9495o5 m30851c() {
        return this.f36357h;
    }

    /* renamed from: d */
    public void m30852d(Date date) {
        this.f36358i = date;
    }

    /* renamed from: e */
    public void m30853e(Map<String, Object> map) {
        this.f36359j = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36355f != null) {
            interfaceC9415h3.mo30828k("event_id").mo30824g(interfaceC9637w1, this.f36355f);
        }
        if (this.f36356g != null) {
            interfaceC9415h3.mo30828k("sdk").mo30824g(interfaceC9637w1, this.f36356g);
        }
        if (this.f36357h != null) {
            interfaceC9415h3.mo30828k("trace").mo30824g(interfaceC9637w1, this.f36357h);
        }
        if (this.f36358i != null) {
            interfaceC9415h3.mo30828k("sent_at").mo30824g(interfaceC9637w1, C9211a1.m30012g(this.f36358i));
        }
        Map<String, Object> map = this.f36359j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36359j.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9440i4(C9525q c9525q, C9523o c9523o, C9495o5 c9495o5) {
        this.f36355f = c9525q;
        this.f36356g = c9523o;
        this.f36357h = c9495o5;
    }

    public C9440i4(C9525q c9525q) {
        this(c9525q, null);
    }

    public C9440i4() {
        this(new C9525q());
    }
}
