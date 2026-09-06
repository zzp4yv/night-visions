package io.sentry;

import io.sentry.AbstractC9342c4;
import io.sentry.EnumC9554s4;
import io.sentry.protocol.C9518j;
import io.sentry.protocol.C9524p;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9531w;
import io.sentry.util.C9605i;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryEvent.java */
/* renamed from: io.sentry.l4 */
/* loaded from: classes2.dex */
public final class C9473l4 extends AbstractC9342c4 implements InterfaceC9545r2 {

    /* renamed from: A */
    private String f36451A;

    /* renamed from: B */
    private List<String> f36452B;

    /* renamed from: C */
    private Map<String, Object> f36453C;

    /* renamed from: D */
    private Map<String, String> f36454D;

    /* renamed from: u */
    private Date f36455u;

    /* renamed from: v */
    private C9518j f36456v;

    /* renamed from: w */
    private String f36457w;

    /* renamed from: x */
    private C9343c5<C9531w> f36458x;

    /* renamed from: y */
    private C9343c5<C9524p> f36459y;

    /* renamed from: z */
    private EnumC9554s4 f36460z;

    /* compiled from: SentryEvent.java */
    /* renamed from: io.sentry.l4$a */
    public static final class a implements InterfaceC9471l2<C9473l4> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9473l4 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            C9473l4 c9473l4 = new C9473l4();
            AbstractC9342c4.a aVar = new AbstractC9342c4.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "fingerprint":
                        List list = (List) c9485n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            c9473l4.f36452B = list;
                            break;
                        }
                    case "threads":
                        c9485n2.m31884b();
                        c9485n2.m31879B();
                        c9473l4.f36458x = new C9343c5(c9485n2.m31085F0(interfaceC9637w1, new C9531w.a()));
                        c9485n2.m31889j();
                        break;
                    case "logger":
                        c9473l4.f36457w = c9485n2.m31090N0();
                        break;
                    case "timestamp":
                        Date m31094q0 = c9485n2.m31094q0(interfaceC9637w1);
                        if (m31094q0 == null) {
                            break;
                        } else {
                            c9473l4.f36455u = m31094q0;
                            break;
                        }
                    case "level":
                        c9473l4.f36460z = (EnumC9554s4) c9485n2.m31089M0(interfaceC9637w1, new EnumC9554s4.a());
                        break;
                    case "message":
                        c9473l4.f36456v = (C9518j) c9485n2.m31089M0(interfaceC9637w1, new C9518j.a());
                        break;
                    case "modules":
                        c9473l4.f36454D = C9605i.m31767b((Map) c9485n2.m31088K0());
                        break;
                    case "exception":
                        c9485n2.m31884b();
                        c9485n2.m31879B();
                        c9473l4.f36459y = new C9343c5(c9485n2.m31085F0(interfaceC9637w1, new C9524p.a()));
                        c9485n2.m31889j();
                        break;
                    case "transaction":
                        c9473l4.f36451A = c9485n2.m31090N0();
                        break;
                    default:
                        if (!aVar.m30604a(c9473l4, m31879B, c9485n2, interfaceC9637w1)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                            break;
                        } else {
                            break;
                        }
                }
            }
            c9473l4.m30999F0(concurrentHashMap);
            c9485n2.m31889j();
            return c9473l4;
        }
    }

    C9473l4(C9525q c9525q, Date date) {
        super(c9525q);
        this.f36455u = date;
    }

    /* renamed from: A0 */
    public void m30994A0(C9518j c9518j) {
        this.f36456v = c9518j;
    }

    /* renamed from: B0 */
    public void m30995B0(Map<String, String> map) {
        this.f36454D = C9605i.m31768c(map);
    }

    /* renamed from: C0 */
    public void m30996C0(List<C9531w> list) {
        this.f36458x = new C9343c5<>(list);
    }

    /* renamed from: D0 */
    public void m30997D0(Date date) {
        this.f36455u = date;
    }

    /* renamed from: E0 */
    public void m30998E0(String str) {
        this.f36451A = str;
    }

    /* renamed from: F0 */
    public void m30999F0(Map<String, Object> map) {
        this.f36453C = map;
    }

    /* renamed from: o0 */
    public List<C9524p> m31000o0() {
        C9343c5<C9524p> c9343c5 = this.f36459y;
        if (c9343c5 == null) {
            return null;
        }
        return c9343c5.m30606a();
    }

    /* renamed from: p0 */
    public List<String> m31001p0() {
        return this.f36452B;
    }

    /* renamed from: q0 */
    public EnumC9554s4 m31002q0() {
        return this.f36460z;
    }

    /* renamed from: r0 */
    Map<String, String> m31003r0() {
        return this.f36454D;
    }

    /* renamed from: s0 */
    public List<C9531w> m31004s0() {
        C9343c5<C9531w> c9343c5 = this.f36458x;
        if (c9343c5 != null) {
            return c9343c5.m30606a();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("timestamp").mo30824g(interfaceC9637w1, this.f36455u);
        if (this.f36456v != null) {
            interfaceC9415h3.mo30828k("message").mo30824g(interfaceC9637w1, this.f36456v);
        }
        if (this.f36457w != null) {
            interfaceC9415h3.mo30828k("logger").mo30819b(this.f36457w);
        }
        C9343c5<C9531w> c9343c5 = this.f36458x;
        if (c9343c5 != null && !c9343c5.m30606a().isEmpty()) {
            interfaceC9415h3.mo30828k("threads");
            interfaceC9415h3.mo30823f();
            interfaceC9415h3.mo30828k("values").mo30824g(interfaceC9637w1, this.f36458x.m30606a());
            interfaceC9415h3.mo30821d();
        }
        C9343c5<C9524p> c9343c52 = this.f36459y;
        if (c9343c52 != null && !c9343c52.m30606a().isEmpty()) {
            interfaceC9415h3.mo30828k("exception");
            interfaceC9415h3.mo30823f();
            interfaceC9415h3.mo30828k("values").mo30824g(interfaceC9637w1, this.f36459y.m30606a());
            interfaceC9415h3.mo30821d();
        }
        if (this.f36460z != null) {
            interfaceC9415h3.mo30828k("level").mo30824g(interfaceC9637w1, this.f36460z);
        }
        if (this.f36451A != null) {
            interfaceC9415h3.mo30828k("transaction").mo30819b(this.f36451A);
        }
        if (this.f36452B != null) {
            interfaceC9415h3.mo30828k("fingerprint").mo30824g(interfaceC9637w1, this.f36452B);
        }
        if (this.f36454D != null) {
            interfaceC9415h3.mo30828k("modules").mo30824g(interfaceC9637w1, this.f36454D);
        }
        new AbstractC9342c4.b().m30605a(this, interfaceC9415h3, interfaceC9637w1);
        Map<String, Object> map = this.f36453C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36453C.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    /* renamed from: t0 */
    public String m31005t0() {
        return this.f36451A;
    }

    /* renamed from: u0 */
    public C9524p m31006u0() {
        C9343c5<C9524p> c9343c5 = this.f36459y;
        if (c9343c5 == null) {
            return null;
        }
        for (C9524p c9524p : c9343c5.m30606a()) {
            if (c9524p.m31441g() != null && c9524p.m31441g().m31370h() != null && !c9524p.m31441g().m31370h().booleanValue()) {
                return c9524p;
            }
        }
        return null;
    }

    /* renamed from: v0 */
    public boolean m31007v0() {
        return m31006u0() != null;
    }

    /* renamed from: w0 */
    public boolean m31008w0() {
        C9343c5<C9524p> c9343c5 = this.f36459y;
        return (c9343c5 == null || c9343c5.m30606a().isEmpty()) ? false : true;
    }

    /* renamed from: x0 */
    public void m31009x0(List<C9524p> list) {
        this.f36459y = new C9343c5<>(list);
    }

    /* renamed from: y0 */
    public void m31010y0(List<String> list) {
        this.f36452B = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: z0 */
    public void m31011z0(EnumC9554s4 enumC9554s4) {
        this.f36460z = enumC9554s4;
    }

    public C9473l4(Throwable th) {
        this();
        this.f36196o = th;
    }

    public C9473l4() {
        this(new C9525q(), C9211a1.m30008c());
    }
}
