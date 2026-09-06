package com.facebook.p157o0.p159l0;

import com.facebook.EnumC5626g0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5651j0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.p159l0.C5814h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10740s;
import kotlin.C10742u;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9767l0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.C10514v;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* renamed from: com.facebook.o0.l0.h */
/* loaded from: classes.dex */
public final class C5814h {

    /* renamed from: a */
    public static final C5814h f15048a = new C5814h();

    /* renamed from: b */
    private static final HashSet<Integer> f15049b;

    /* renamed from: c */
    private static final HashSet<Integer> f15050c;

    /* renamed from: d */
    public static a f15051d;

    /* renamed from: e */
    public static List<Map<String, Object>> f15052e;

    /* renamed from: f */
    private static int f15053f;

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    /* renamed from: com.facebook.o0.l0.h$a */
    public static final class a {

        /* renamed from: a */
        private final String f15054a;

        /* renamed from: b */
        private final String f15055b;

        /* renamed from: c */
        private final String f15056c;

        public a(String str, String str2, String str3) {
            C9768m.m32346f(str, "datasetID");
            C9768m.m32346f(str2, "cloudBridgeURL");
            C9768m.m32346f(str3, "accessKey");
            this.f15054a = str;
            this.f15055b = str2;
            this.f15056c = str3;
        }

        /* renamed from: a */
        public final String m12349a() {
            return this.f15056c;
        }

        /* renamed from: b */
        public final String m12350b() {
            return this.f15055b;
        }

        /* renamed from: c */
        public final String m12351c() {
            return this.f15054a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9768m.m32341a(this.f15054a, aVar.f15054a) && C9768m.m32341a(this.f15055b, aVar.f15055b) && C9768m.m32341a(this.f15056c, aVar.f15056c);
        }

        public int hashCode() {
            return (((this.f15054a.hashCode() * 31) + this.f15055b.hashCode()) * 31) + this.f15056c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f15054a + ", cloudBridgeURL=" + this.f15055b + ", accessKey=" + this.f15056c + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    /* renamed from: com.facebook.o0.l0.h$b */
    static final class b extends Lambda implements Function2<String, Integer, C10742u> {

        /* renamed from: f */
        final /* synthetic */ List<Map<String, Object>> f15057f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f15057f = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m12352c(Integer num, List list) {
            boolean m38577K;
            C9768m.m32346f(list, "$processedEvents");
            m38577K = C10749c0.m38577K(C5814h.f15049b, num);
            if (m38577K) {
                return;
            }
            C5814h.f15048a.m12345f(num, list, 5);
        }

        /* renamed from: b */
        public final void m12354b(String str, final Integer num) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            final List<Map<String, Object>> list = this.f15057f;
            C5663p0.m11527B0(new Runnable() { // from class: com.facebook.o0.l0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5814h.b.m12352c(num, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C10742u invoke(String str, Integer num) {
            m12354b(str, num);
            return C10742u.f41439a;
        }
    }

    static {
        HashSet<Integer> m38918e;
        HashSet<Integer> m38918e2;
        m38918e = C10789w0.m38918e(200, 202);
        f15049b = m38918e;
        m38918e2 = C10789w0.m38918e(503, 504, 429);
        f15050c = m38918e2;
    }

    private C5814h() {
    }

    /* renamed from: c */
    public static final void m12337c(String str, String str2, String str3) {
        C9768m.m32346f(str, "datasetID");
        C9768m.m32346f(str2, "url");
        C9768m.m32346f(str3, "accessKey");
        C5651j0.a aVar = C5651j0.f14429a;
        EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
        C5814h c5814h = f15048a;
        aVar.m11455c(enumC5626g0, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        c5814h.m12347i(new a(str, str2, str3));
        c5814h.m12348j(new ArrayList());
    }

    /* renamed from: k */
    private final List<Map<String, Object>> m12339k(GraphRequest graphRequest) {
        Map<String, ? extends Object> m38809u;
        JSONObject m11183p = graphRequest.m11183p();
        if (m11183p == null) {
            return null;
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        m38809u = C10777q0.m38809u(C5663p0.m11578l(m11183p));
        Object m11188v = graphRequest.m11188v();
        if (m11188v == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        m38809u.put("custom_events", m11188v);
        StringBuilder sb = new StringBuilder();
        for (String str : m38809u.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(m38809u.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        C5651j0.f14429a.m11455c(EnumC5626g0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return C5813g.f15026a.m12325e(m38809u);
    }

    /* renamed from: l */
    public static final void m12340l(final GraphRequest graphRequest) {
        C9768m.m32346f(graphRequest, "request");
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11527B0(new Runnable() { // from class: com.facebook.o0.l0.b
            @Override // java.lang.Runnable
            public final void run() {
                C5814h.m12341m(GraphRequest.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m12341m(GraphRequest graphRequest) {
        List m38616v0;
        Map<String, String> m38794f;
        C9768m.m32346f(graphRequest, "$request");
        String m11184q = graphRequest.m11184q();
        List m37582v0 = m11184q == null ? null : C10514v.m37582v0(m11184q, new String[]{"/"}, false, 0, 6, null);
        if (m37582v0 == null || m37582v0.size() != 2) {
            C5651j0.f14429a.m11455c(EnumC5626g0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            C5814h c5814h = f15048a;
            String str = c5814h.m12343d().m12350b() + "/capi/" + c5814h.m12343d().m12351c() + "/events";
            List<Map<String, Object>> m12339k = c5814h.m12339k(graphRequest);
            if (m12339k == null) {
                return;
            }
            c5814h.m12342b(m12339k);
            int min = Math.min(c5814h.m12344e().size(), 10);
            m38616v0 = C10749c0.m38616v0(c5814h.m12344e(), new IntRange(0, min - 1));
            c5814h.m12344e().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) m38616v0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", c5814h.m12343d().m12349a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            C5651j0.a aVar = C5651j0.f14429a;
            EnumC5626g0 enumC5626g0 = EnumC5626g0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            C9768m.m32345e(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.m11455c(enumC5626g0, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            m38794f = C10775p0.m38794f(C10740s.m38547a("Content-Type", "application/json"));
            c5814h.m12346h(str, "POST", jSONObject3, m38794f, 60000, new b(m38616v0));
        } catch (UninitializedPropertyAccessException e2) {
            C5651j0.f14429a.m11455c(EnumC5626g0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e2);
        }
    }

    /* renamed from: b */
    public final void m12342b(List<? extends Map<String, ? extends Object>> list) {
        List m38581M;
        if (list != null) {
            m12344e().addAll(list);
        }
        int max = Math.max(0, m12344e().size() - 1000);
        if (max > 0) {
            m38581M = C10749c0.m38581M(m12344e(), max);
            m12348j(C9767l0.m32327b(m38581M));
        }
    }

    /* renamed from: d */
    public final a m12343d() {
        a aVar = f15051d;
        if (aVar != null) {
            return aVar;
        }
        C9768m.m32363w("credentials");
        throw null;
    }

    /* renamed from: e */
    public final List<Map<String, Object>> m12344e() {
        List<Map<String, Object>> list = f15052e;
        if (list != null) {
            return list;
        }
        C9768m.m32363w("transformedEvents");
        throw null;
    }

    /* renamed from: f */
    public final void m12345f(Integer num, List<? extends Map<String, ? extends Object>> list, int i2) {
        boolean m38577K;
        C9768m.m32346f(list, "processedEvents");
        m38577K = C10749c0.m38577K(f15050c, num);
        if (m38577K) {
            if (f15053f >= i2) {
                m12344e().clear();
                f15053f = 0;
            } else {
                m12344e().addAll(0, list);
                f15053f++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[Catch: IOException -> 0x00f7, UnknownHostException -> 0x010a, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x010a, IOException -> 0x00f7, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0045, B:10:0x0051, B:14:0x0061, B:16:0x009b, B:23:0x00b5, B:30:0x00bc, B:31:0x00bf, B:33:0x00c0, B:35:0x00e3, B:39:0x0024, B:42:0x002b, B:43:0x002f, B:45:0x0035, B:47:0x00ef, B:48:0x00f6), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[Catch: IOException -> 0x00f7, UnknownHostException -> 0x010a, TryCatch #4 {UnknownHostException -> 0x010a, IOException -> 0x00f7, blocks: (B:3:0x0011, B:5:0x001c, B:8:0x0045, B:10:0x0051, B:14:0x0061, B:16:0x009b, B:23:0x00b5, B:30:0x00bc, B:31:0x00bf, B:33:0x00c0, B:35:0x00e3, B:39:0x0024, B:42:0x002b, B:43:0x002f, B:45:0x0035, B:47:0x00ef, B:48:0x00f6), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12346h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, int r12, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.C10742u> r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p159l0.C5814h.m12346h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.a0.c.p):void");
    }

    /* renamed from: i */
    public final void m12347i(a aVar) {
        C9768m.m32346f(aVar, "<set-?>");
        f15051d = aVar;
    }

    /* renamed from: j */
    public final void m12348j(List<Map<String, Object>> list) {
        C9768m.m32346f(list, "<set-?>");
        f15052e = list;
    }
}
