package io.sentry;

import io.sentry.protocol.C9507a0;
import io.sentry.util.C9621u;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Session.java */
/* renamed from: io.sentry.d5 */
/* loaded from: classes2.dex */
public final class C9389d5 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final Date f36269f;

    /* renamed from: g */
    private Date f36270g;

    /* renamed from: h */
    private final AtomicInteger f36271h;

    /* renamed from: i */
    private final String f36272i;

    /* renamed from: j */
    private final UUID f36273j;

    /* renamed from: k */
    private Boolean f36274k;

    /* renamed from: l */
    private b f36275l;

    /* renamed from: m */
    private Long f36276m;

    /* renamed from: n */
    private Double f36277n;

    /* renamed from: o */
    private final String f36278o;

    /* renamed from: p */
    private String f36279p;

    /* renamed from: q */
    private final String f36280q;

    /* renamed from: r */
    private final String f36281r;

    /* renamed from: s */
    private String f36282s;

    /* renamed from: t */
    private final Object f36283t;

    /* renamed from: u */
    private Map<String, Object> f36284u;

    /* compiled from: Session.java */
    /* renamed from: io.sentry.d5$a */
    public static final class a implements InterfaceC9471l2<C9389d5> {
        /* renamed from: c */
        private Exception m30754c(String str, InterfaceC9637w1 interfaceC9637w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9389d5 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            char c2;
            String str;
            char c3;
            c9485n2.m31884b();
            Integer num = null;
            b bVar = null;
            Date date = null;
            Date date2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            UUID uuid = null;
            Boolean bool = null;
            Long l = null;
            Double d2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                String str8 = str5;
                String str9 = str4;
                String str10 = str3;
                Double d3 = d2;
                if (c9485n2.m31882N() != EnumC9633b.NAME) {
                    Long l2 = l;
                    if (bVar == null) {
                        throw m30754c("status", interfaceC9637w1);
                    }
                    if (date == null) {
                        throw m30754c("started", interfaceC9637w1);
                    }
                    if (num == null) {
                        throw m30754c("errors", interfaceC9637w1);
                    }
                    if (str6 == null) {
                        throw m30754c("release", interfaceC9637w1);
                    }
                    C9389d5 c9389d5 = new C9389d5(bVar, date, date2, num.intValue(), str2, uuid, bool, l2, d3, str10, str9, str8, str6, str7);
                    c9389d5.m30751o(concurrentHashMap);
                    c9485n2.m31889j();
                    return c9389d5;
                }
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                Long l3 = l;
                switch (m31879B.hashCode()) {
                    case -1992012396:
                        if (m31879B.equals("duration")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1897185151:
                        if (m31879B.equals("started")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1294635157:
                        if (m31879B.equals("errors")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -892481550:
                        if (m31879B.equals("status")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 99455:
                        if (m31879B.equals("did")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 113759:
                        if (m31879B.equals("seq")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 113870:
                        if (m31879B.equals("sid")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3237136:
                        if (m31879B.equals("init")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 55126294:
                        if (m31879B.equals("timestamp")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 93152418:
                        if (m31879B.equals("attrs")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 213717026:
                        if (m31879B.equals("abnormal_mechanism")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        d2 = c9485n2.m31095t0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        l = l3;
                        break;
                    case 1:
                        date = c9485n2.m31094q0(interfaceC9637w1);
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 2:
                        num = c9485n2.m31084E0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 3:
                        String m31818b = C9621u.m31818b(c9485n2.m31090N0());
                        if (m31818b != null) {
                            bVar = b.valueOf(m31818b);
                        }
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 4:
                        str2 = c9485n2.m31090N0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 5:
                        l = c9485n2.m31086G0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        break;
                    case 6:
                        try {
                            str = c9485n2.m31090N0();
                            try {
                                uuid = UUID.fromString(str);
                            } catch (IllegalArgumentException unused) {
                                interfaceC9637w1.mo30214c(EnumC9554s4.ERROR, "%s sid is not valid.", str);
                                str5 = str8;
                                str4 = str9;
                                str3 = str10;
                                d2 = d3;
                                l = l3;
                            }
                        } catch (IllegalArgumentException unused2) {
                            str = null;
                        }
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                    case 7:
                        bool = c9485n2.m31093p0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case '\b':
                        date2 = c9485n2.m31094q0(interfaceC9637w1);
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case '\t':
                        c9485n2.m31884b();
                        str4 = str9;
                        str3 = str10;
                        while (c9485n2.m31882N() == EnumC9633b.NAME) {
                            String m31879B2 = c9485n2.m31879B();
                            m31879B2.hashCode();
                            switch (m31879B2.hashCode()) {
                                case -85904877:
                                    if (m31879B2.equals("environment")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1090594823:
                                    if (m31879B2.equals("release")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1480014044:
                                    if (m31879B2.equals("ip_address")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1917799825:
                                    if (m31879B2.equals("user_agent")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    str8 = c9485n2.m31090N0();
                                    break;
                                case 1:
                                    str6 = c9485n2.m31090N0();
                                    break;
                                case 2:
                                    str3 = c9485n2.m31090N0();
                                    break;
                                case 3:
                                    str4 = c9485n2.m31090N0();
                                    break;
                                default:
                                    c9485n2.m31888i0();
                                    break;
                            }
                        }
                        c9485n2.m31889j();
                        str5 = str8;
                        d2 = d3;
                        l = l3;
                        break;
                    case '\n':
                        str7 = c9485n2.m31090N0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                }
            }
        }
    }

    /* compiled from: Session.java */
    /* renamed from: io.sentry.d5$b */
    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public C9389d5(b bVar, Date date, Date date2, int i2, String str, UUID uuid, Boolean bool, Long l, Double d2, String str2, String str3, String str4, String str5, String str6) {
        this.f36283t = new Object();
        this.f36275l = bVar;
        this.f36269f = date;
        this.f36270g = date2;
        this.f36271h = new AtomicInteger(i2);
        this.f36272i = str;
        this.f36273j = uuid;
        this.f36274k = bool;
        this.f36276m = l;
        this.f36277n = d2;
        this.f36278o = str2;
        this.f36279p = str3;
        this.f36280q = str4;
        this.f36281r = str5;
        this.f36282s = str6;
    }

    /* renamed from: a */
    private double m30737a(Date date) {
        double abs = Math.abs(date.getTime() - this.f36269f.getTime());
        Double.isNaN(abs);
        return abs / 1000.0d;
    }

    /* renamed from: i */
    private long m30738i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9389d5 clone() {
        return new C9389d5(this.f36275l, this.f36269f, this.f36270g, this.f36271h.get(), this.f36272i, this.f36273j, this.f36274k, this.f36276m, this.f36277n, this.f36278o, this.f36279p, this.f36280q, this.f36281r, this.f36282s);
    }

    /* renamed from: c */
    public void m30740c() {
        m30741d(C9211a1.m30008c());
    }

    /* renamed from: d */
    public void m30741d(Date date) {
        synchronized (this.f36283t) {
            this.f36274k = null;
            if (this.f36275l == b.Ok) {
                this.f36275l = b.Exited;
            }
            if (date != null) {
                this.f36270g = date;
            } else {
                this.f36270g = C9211a1.m30008c();
            }
            Date date2 = this.f36270g;
            if (date2 != null) {
                this.f36277n = Double.valueOf(m30737a(date2));
                this.f36276m = Long.valueOf(m30738i(this.f36270g));
            }
        }
    }

    /* renamed from: e */
    public int m30742e() {
        return this.f36271h.get();
    }

    /* renamed from: f */
    public String m30743f() {
        return this.f36282s;
    }

    /* renamed from: g */
    public Boolean m30744g() {
        return this.f36274k;
    }

    /* renamed from: h */
    public String m30745h() {
        return this.f36281r;
    }

    /* renamed from: j */
    public UUID m30746j() {
        return this.f36273j;
    }

    /* renamed from: k */
    public Date m30747k() {
        Date date = this.f36269f;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    /* renamed from: l */
    public b m30748l() {
        return this.f36275l;
    }

    /* renamed from: m */
    public boolean m30749m() {
        return this.f36275l != b.Ok;
    }

    @ApiStatus.Internal
    /* renamed from: n */
    public void m30750n() {
        this.f36274k = Boolean.TRUE;
    }

    /* renamed from: o */
    public void m30751o(Map<String, Object> map) {
        this.f36284u = map;
    }

    /* renamed from: p */
    public boolean m30752p(b bVar, String str, boolean z) {
        return m30753q(bVar, str, z, null);
    }

    /* renamed from: q */
    public boolean m30753q(b bVar, String str, boolean z, String str2) {
        boolean z2;
        synchronized (this.f36283t) {
            boolean z3 = false;
            z2 = true;
            if (bVar != null) {
                try {
                    this.f36275l = bVar;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str != null) {
                this.f36279p = str;
                z3 = true;
            }
            if (z) {
                this.f36271h.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.f36282s = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f36274k = null;
                Date m30008c = C9211a1.m30008c();
                this.f36270g = m30008c;
                if (m30008c != null) {
                    this.f36276m = Long.valueOf(m30738i(m30008c));
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36273j != null) {
            interfaceC9415h3.mo30828k("sid").mo30819b(this.f36273j.toString());
        }
        if (this.f36272i != null) {
            interfaceC9415h3.mo30828k("did").mo30819b(this.f36272i);
        }
        if (this.f36274k != null) {
            interfaceC9415h3.mo30828k("init").mo30825h(this.f36274k);
        }
        interfaceC9415h3.mo30828k("started").mo30824g(interfaceC9637w1, this.f36269f);
        interfaceC9415h3.mo30828k("status").mo30824g(interfaceC9637w1, this.f36275l.name().toLowerCase(Locale.ROOT));
        if (this.f36276m != null) {
            interfaceC9415h3.mo30828k("seq").mo30822e(this.f36276m);
        }
        interfaceC9415h3.mo30828k("errors").mo30818a(this.f36271h.intValue());
        if (this.f36277n != null) {
            interfaceC9415h3.mo30828k("duration").mo30822e(this.f36277n);
        }
        if (this.f36270g != null) {
            interfaceC9415h3.mo30828k("timestamp").mo30824g(interfaceC9637w1, this.f36270g);
        }
        if (this.f36282s != null) {
            interfaceC9415h3.mo30828k("abnormal_mechanism").mo30824g(interfaceC9637w1, this.f36282s);
        }
        interfaceC9415h3.mo30828k("attrs");
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("release").mo30824g(interfaceC9637w1, this.f36281r);
        if (this.f36280q != null) {
            interfaceC9415h3.mo30828k("environment").mo30824g(interfaceC9637w1, this.f36280q);
        }
        if (this.f36278o != null) {
            interfaceC9415h3.mo30828k("ip_address").mo30824g(interfaceC9637w1, this.f36278o);
        }
        if (this.f36279p != null) {
            interfaceC9415h3.mo30828k("user_agent").mo30824g(interfaceC9637w1, this.f36279p);
        }
        interfaceC9415h3.mo30821d();
        Map<String, Object> map = this.f36284u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36284u.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public C9389d5(String str, C9507a0 c9507a0, String str2, String str3) {
        this(b.Ok, C9211a1.m30008c(), C9211a1.m30008c(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, c9507a0 != null ? c9507a0.m31217l() : null, null, str2, str3, null);
    }
}
