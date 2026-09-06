package com.flurry.sdk;

import com.flurry.sdk.C6034i1;
import com.flurry.sdk.C6035i2;
import com.flurry.sdk.C6052k1;
import com.flurry.sdk.C6114r0.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.flurry.sdk.p0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6096p0 extends C6062l2 {

    /* renamed from: o */
    protected final String f16221o;

    /* renamed from: p */
    protected String f16222p;

    /* renamed from: q */
    protected InterfaceC6087o0 f16223q;

    /* renamed from: r */
    Set<String> f16224r;

    /* renamed from: s */
    public C6114r0 f16225s;

    /* renamed from: t */
    private C6153w f16226t;

    /* renamed from: u */
    private InterfaceC6013f7<C6145v> f16227u;

    /* renamed from: com.flurry.sdk.p0$a */
    final class a implements InterfaceC6013f7<C6145v> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6145v c6145v) {
            C6145v c6145v2 = c6145v;
            C5988d1.m13039l(AbstractC6096p0.this.f16221o, "NetworkAvailabilityChanged : NetworkAvailable = " + c6145v2.f16408a);
            if (c6145v2.f16408a) {
                AbstractC6096p0.this.m13244d();
            }
        }
    }

    /* renamed from: com.flurry.sdk.p0$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ byte[] f16229h;

        /* renamed from: i */
        final /* synthetic */ String f16230i;

        /* renamed from: j */
        final /* synthetic */ String f16231j;

        b(byte[] bArr, String str, String str2) {
            this.f16229h = bArr;
            this.f16230i = str;
            this.f16231j = str2;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            AbstractC6096p0.this.m13248x(this.f16229h, this.f16230i, this.f16231j);
        }
    }

    /* renamed from: com.flurry.sdk.p0$c */
    final class c extends AbstractRunnableC6008f2 {
        c() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            AbstractC6096p0.this.m13249y();
        }
    }

    /* renamed from: com.flurry.sdk.p0$d */
    final class d implements C6034i1.b<byte[], String> {

        /* renamed from: a */
        final /* synthetic */ String f16234a;

        /* renamed from: b */
        final /* synthetic */ String f16235b;

        /* renamed from: c */
        final /* synthetic */ String f16236c;

        /* renamed from: com.flurry.sdk.p0$d$a */
        final class a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ int f16238h;

            /* renamed from: i */
            final /* synthetic */ String f16239i;

            a(int i2, String str) {
                this.f16238h = i2;
                this.f16239i = str;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                AbstractC6096p0.this.mo13245u(this.f16238h, AbstractC6096p0.m13241s(this.f16239i), d.this.f16234a);
            }
        }

        d(String str, String str2, String str3) {
            this.f16234a = str;
            this.f16235b = str2;
            this.f16236c = str3;
        }

        @Override // com.flurry.sdk.C6034i1.b
        /* renamed from: a */
        public final /* synthetic */ void mo13110a(C6034i1<byte[], String> c6034i1, String str) {
            String str2 = str;
            int i2 = c6034i1.f16043A;
            if (i2 != 200) {
                AbstractC6096p0.this.mo13007m(new a(i2, str2));
            }
            if ((i2 < 200 || i2 >= 300) && i2 != 400) {
                C5988d1.m13042o(AbstractC6096p0.this.f16221o, "Analytics report sent with error " + this.f16235b);
                AbstractC6096p0 abstractC6096p0 = AbstractC6096p0.this;
                abstractC6096p0.mo13007m(abstractC6096p0.new f(this.f16234a));
                return;
            }
            C5988d1.m13042o(AbstractC6096p0.this.f16221o, "Analytics report sent to " + this.f16235b);
            C5988d1.m13030c(3, AbstractC6096p0.this.f16221o, "FlurryDataSender: report " + this.f16234a + " sent. HTTP response: " + i2);
            String str3 = AbstractC6096p0.this.f16221o;
            StringBuilder sb = new StringBuilder("FlurryDataSender:");
            sb.append(AbstractC6096p0.m13241s(str2));
            C5988d1.m13030c(3, str3, sb.toString());
            if (str2 != null) {
                C5988d1.m13030c(3, AbstractC6096p0.this.f16221o, "HTTP response: ".concat(str2));
            }
            AbstractC6096p0 abstractC6096p02 = AbstractC6096p0.this;
            abstractC6096p02.mo13007m(abstractC6096p02.new e(i2, this.f16234a, this.f16236c));
            AbstractC6096p0.this.m13244d();
        }
    }

    /* renamed from: com.flurry.sdk.p0$e */
    final class e extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ int f16241h;

        /* renamed from: i */
        final /* synthetic */ String f16242i;

        /* renamed from: j */
        final /* synthetic */ String f16243j;

        e(int i2, String str, String str2) {
            this.f16241h = i2;
            this.f16242i = str;
            this.f16243j = str2;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            InterfaceC6087o0 interfaceC6087o0 = AbstractC6096p0.this.f16223q;
            if (interfaceC6087o0 != null) {
                if (this.f16241h == 200) {
                    interfaceC6087o0.mo13135a();
                } else {
                    interfaceC6087o0.mo13136d();
                }
            }
            if (!AbstractC6096p0.this.f16225s.m13286e(this.f16242i, this.f16243j)) {
                C5988d1.m13030c(6, AbstractC6096p0.this.f16221o, "Internal error. Block wasn't deleted with id = " + this.f16242i);
            }
            if (AbstractC6096p0.this.f16224r.remove(this.f16242i)) {
                return;
            }
            C5988d1.m13030c(6, AbstractC6096p0.this.f16221o, "Internal error. Block with id = " + this.f16242i + " was not in progress state");
        }
    }

    /* renamed from: com.flurry.sdk.p0$f */
    final class f extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ String f16245h;

        f(String str) {
            this.f16245h = str;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            InterfaceC6087o0 interfaceC6087o0 = AbstractC6096p0.this.f16223q;
            if (interfaceC6087o0 != null) {
                interfaceC6087o0.mo13136d();
            }
            if (AbstractC6096p0.this.f16224r.remove(this.f16245h)) {
                return;
            }
            C5988d1.m13030c(6, AbstractC6096p0.this.f16221o, "Internal error. Block with id = " + this.f16245h + " was not in progress state");
        }
    }

    public AbstractC6096p0(String str, String str2) {
        super(str2, C6035i2.m13111a(C6035i2.b.REPORTS));
        this.f16224r = new HashSet();
        this.f16226t = C6004e7.m13055a().f15823c;
        a aVar = new a();
        this.f16227u = aVar;
        this.f16221o = str2;
        this.f16222p = "AnalyticsData_";
        this.f16226t.mo13050v(aVar);
        this.f16225s = new C6114r0(str);
    }

    /* renamed from: A */
    private boolean m13239A() {
        return m13240B() <= 5;
    }

    /* renamed from: B */
    private int m13240B() {
        return this.f16224r.size();
    }

    /* renamed from: s */
    static /* synthetic */ String m13241s(String str) {
        if (str != null && str.contains("<body>") && str.contains("</body>")) {
            return str.substring(str.indexOf("<body>") + 6, str.indexOf("</body>"));
        }
        StringBuilder sb = new StringBuilder("Can not parse http error message: ");
        if (str == null) {
            str = "NULL";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void m13243a() {
        C6114r0 c6114r0 = this.f16225s;
        String str = c6114r0.f16300b;
        ArrayList<String> arrayList = new ArrayList();
        File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "isOldIndexFilePresent: for " + str + fileStreamPath.exists());
        if (fileStreamPath.exists()) {
            List<String> m13284b = c6114r0.m13284b(str);
            if (m13284b != null && m13284b.size() > 0) {
                arrayList.addAll(m13284b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c6114r0.m13287g((String) it.next());
                }
            }
            C6114r0.m13279h(str);
        } else {
            List list = (List) new C5985c7(C5969b0.m12964a().getFileStreamPath(C6114r0.m13280i(c6114r0.f16300b)), str, 1, c6114r0.new a()).m13011a();
            if (list == null) {
                C5988d1.m13039l("FlurryDataSenderIndex", "New main file also not found. returning..");
                m13244d();
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C6122s0) it2.next()).f16315a);
                }
            }
        }
        for (String str2 : arrayList) {
            List<String> m13288j = c6114r0.m13288j(str2);
            if (m13288j != null && !m13288j.isEmpty()) {
                c6114r0.f16301c.put(str2, m13288j);
            }
        }
        m13244d();
    }

    /* renamed from: d */
    protected final void m13244d() {
        mo13007m(new c());
    }

    /* renamed from: u */
    protected abstract void mo13245u(int i2, String str, String str2);

    /* renamed from: v */
    public final void m13246v(InterfaceC6087o0 interfaceC6087o0) {
        this.f16223q = interfaceC6087o0;
    }

    /* renamed from: w */
    public final void m13247w(byte[] bArr, String str, String str2) {
        if (bArr == null || bArr.length == 0) {
            C5988d1.m13030c(6, this.f16221o, "Report that has to be sent is EMPTY or NULL");
        } else {
            mo13007m(new b(bArr, str, str2));
            m13244d();
        }
    }

    /* renamed from: x */
    protected final void m13248x(byte[] bArr, String str, String str2) {
        String str3 = this.f16222p + str + "_" + str2;
        C6105q0 c6105q0 = new C6105q0(bArr);
        String str4 = c6105q0.f16272a;
        C6105q0.m13265b(str4).m13012b(c6105q0);
        C5988d1.m13030c(5, this.f16221o, "Saving Block File " + str4 + " at " + C5969b0.m12964a().getFileStreamPath(C6105q0.m13264a(str4)));
        this.f16225s.m13285c(c6105q0, str3);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [RequestObjectType, byte[]] */
    /* renamed from: y */
    protected final void m13249y() {
        if (!C6162x0.m13370a()) {
            C5988d1.m13030c(5, this.f16221o, "Reports were not sent! No Internet connection!");
            return;
        }
        List<String> m13283a = this.f16225s.m13283a();
        if (m13283a.isEmpty()) {
            C5988d1.m13030c(4, this.f16221o, "No more reports to send.");
            return;
        }
        for (String str : m13283a) {
            if (!m13239A()) {
                return;
            }
            List<String> m13289k = this.f16225s.m13289k(str);
            C5988d1.m13030c(4, this.f16221o, "Number of not sent blocks = " + m13289k.size());
            for (String str2 : m13289k) {
                if (!this.f16224r.contains(str2)) {
                    if (m13239A()) {
                        C6105q0 m13011a = C6105q0.m13265b(str2).m13011a();
                        if (m13011a == null) {
                            C5988d1.m13030c(6, this.f16221o, "Internal ERROR! Cannot read!");
                            this.f16225s.m13286e(str2, str);
                        } else {
                            ?? r6 = m13011a.f16273b;
                            if (r6 == 0 || r6.length == 0) {
                                C5988d1.m13030c(6, this.f16221o, "Internal ERROR! Report is empty!");
                                this.f16225s.m13286e(str2, str);
                            } else {
                                C5988d1.m13030c(5, this.f16221o, "Reading block info ".concat(String.valueOf(str2)));
                                this.f16224r.add(str2);
                                String mo13250z = mo13250z();
                                C5988d1.m13030c(4, this.f16221o, "FlurryDataSender: start upload data with id = " + str2 + " to " + mo13250z);
                                C6034i1 c6034i1 = new C6034i1();
                                c6034i1.f16052l = mo13250z;
                                c6034i1.f15912h = 100000;
                                c6034i1.f16053m = C6052k1.c.kPost;
                                c6034i1.m13147b("Content-Type", "application/octet-stream");
                                c6034i1.m13147b("X-Flurry-Api-Key", C6051k0.m13141a().m13143b());
                                c6034i1.f15982J = new C6115r1();
                                c6034i1.f15983K = new C6155w1();
                                c6034i1.f15980H = r6;
                                C5986d c5986d = C6004e7.m13055a().f15829i;
                                c6034i1.f16046D = c5986d != null && c5986d.f15744r;
                                c6034i1.f15979G = new d(str2, mo13250z, str);
                                C6170y0.m13378f().m12984c(this, c6034i1);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: z */
    protected abstract String mo13250z();
}
