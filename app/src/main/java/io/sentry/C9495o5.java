package io.sentry;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import io.sentry.protocol.C9525q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TraceContext.java */
@ApiStatus.Experimental
/* renamed from: io.sentry.o5 */
/* loaded from: classes2.dex */
public final class C9495o5 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final C9525q f36539f;

    /* renamed from: g */
    private final String f36540g;

    /* renamed from: h */
    private final String f36541h;

    /* renamed from: i */
    private final String f36542i;

    /* renamed from: j */
    private final String f36543j;

    /* renamed from: k */
    private final String f36544k;

    /* renamed from: l */
    private final String f36545l;

    /* renamed from: m */
    private final String f36546m;

    /* renamed from: n */
    private final String f36547n;

    /* renamed from: o */
    private Map<String, Object> f36548o;

    /* compiled from: TraceContext.java */
    /* renamed from: io.sentry.o5$b */
    public static final class b implements InterfaceC9471l2<C9495o5> {
        /* renamed from: c */
        private Exception m31133c(String str, InterfaceC9637w1 interfaceC9637w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9495o5 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String str;
            String str2;
            String m31879B;
            c9485n2.m31884b();
            c cVar = null;
            String str3 = null;
            C9525q c9525q = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (true) {
                String str11 = str10;
                if (c9485n2.m31882N() != EnumC9633b.NAME) {
                    if (c9525q == null) {
                        throw m31133c("trace_id", interfaceC9637w1);
                    }
                    if (str5 == null) {
                        throw m31133c("public_key", interfaceC9637w1);
                    }
                    if (cVar != null) {
                        if (str3 == null) {
                            str3 = cVar.m31135a();
                        }
                        if (str4 == null) {
                            str2 = cVar.m31136b();
                            str = str3;
                            C9495o5 c9495o5 = new C9495o5(c9525q, str5, str6, str7, str, str2, str8, str9, str11);
                            c9495o5.m31132b(concurrentHashMap);
                            c9485n2.m31889j();
                            return c9495o5;
                        }
                    }
                    str = str3;
                    str2 = str4;
                    C9495o5 c9495o52 = new C9495o5(c9525q, str5, str6, str7, str, str2, str8, str9, str11);
                    c9495o52.m31132b(concurrentHashMap);
                    c9485n2.m31889j();
                    return c9495o52;
                }
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "user_segment":
                        str4 = c9485n2.m31090N0();
                        break;
                    case "user_id":
                        str3 = c9485n2.m31090N0();
                        break;
                    case "environment":
                        str7 = c9485n2.m31090N0();
                        break;
                    case "user":
                        cVar = (c) c9485n2.m31089M0(interfaceC9637w1, new c.a());
                        break;
                    case "sample_rate":
                        str9 = c9485n2.m31090N0();
                        break;
                    case "release":
                        str6 = c9485n2.m31090N0();
                        break;
                    case "trace_id":
                        c9525q = new C9525q.a().mo30683a(c9485n2, interfaceC9637w1);
                        break;
                    case "sampled":
                        str10 = c9485n2.m31090N0();
                        continue;
                    case "public_key":
                        str5 = c9485n2.m31881J();
                        break;
                    case "transaction":
                        str8 = c9485n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                        break;
                }
                str10 = str11;
            }
        }
    }

    /* compiled from: TraceContext.java */
    @Deprecated
    /* renamed from: io.sentry.o5$c */
    private static final class c {

        /* renamed from: a */
        private String f36549a;

        /* renamed from: b */
        private String f36550b;

        /* renamed from: c */
        private Map<String, Object> f36551c;

        /* compiled from: TraceContext.java */
        /* renamed from: io.sentry.o5$c$a */
        public static final class a implements InterfaceC9471l2<c> {
            @Override // io.sentry.InterfaceC9471l2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
                c9485n2.m31884b();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (c9485n2.m31882N() == EnumC9633b.NAME) {
                    String m31879B = c9485n2.m31879B();
                    m31879B.hashCode();
                    if (m31879B.equals(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)) {
                        str = c9485n2.m31090N0();
                    } else if (m31879B.equals("segment")) {
                        str2 = c9485n2.m31090N0();
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, concurrentHashMap, m31879B);
                    }
                }
                c cVar = new c(str, str2);
                cVar.m31137c(concurrentHashMap);
                c9485n2.m31889j();
                return cVar;
            }
        }

        /* renamed from: a */
        public String m31135a() {
            return this.f36549a;
        }

        /* renamed from: b */
        public String m31136b() {
            return this.f36550b;
        }

        /* renamed from: c */
        public void m31137c(Map<String, Object> map) {
            this.f36551c = map;
        }

        private c(String str, String str2) {
            this.f36549a = str;
            this.f36550b = str2;
        }
    }

    C9495o5(C9525q c9525q, String str) {
        this(c9525q, str, null, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public String m31131a() {
        return this.f36546m;
    }

    /* renamed from: b */
    public void m31132b(Map<String, Object> map) {
        this.f36548o = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("trace_id").mo30824g(interfaceC9637w1, this.f36539f);
        interfaceC9415h3.mo30828k("public_key").mo30819b(this.f36540g);
        if (this.f36541h != null) {
            interfaceC9415h3.mo30828k("release").mo30819b(this.f36541h);
        }
        if (this.f36542i != null) {
            interfaceC9415h3.mo30828k("environment").mo30819b(this.f36542i);
        }
        if (this.f36543j != null) {
            interfaceC9415h3.mo30828k(TimeLineFollowFragment.BundleKeys.USER_ID).mo30819b(this.f36543j);
        }
        if (this.f36544k != null) {
            interfaceC9415h3.mo30828k("user_segment").mo30819b(this.f36544k);
        }
        if (this.f36545l != null) {
            interfaceC9415h3.mo30828k("transaction").mo30819b(this.f36545l);
        }
        if (this.f36546m != null) {
            interfaceC9415h3.mo30828k("sample_rate").mo30819b(this.f36546m);
        }
        if (this.f36547n != null) {
            interfaceC9415h3.mo30828k("sampled").mo30819b(this.f36547n);
        }
        Map<String, Object> map = this.f36548o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36548o.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9495o5(C9525q c9525q, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f36539f = c9525q;
        this.f36540g = str;
        this.f36541h = str2;
        this.f36542i = str3;
        this.f36543j = str4;
        this.f36544k = str5;
        this.f36545l = str6;
        this.f36546m = str7;
        this.f36547n = str8;
    }
}
