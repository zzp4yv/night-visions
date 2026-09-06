package com.google.android.datatransport.cct.p177f;

import com.google.firebase.encoders.C8293b;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import com.google.firebase.encoders.p192g.InterfaceC8298a;
import com.google.firebase.encoders.p192g.InterfaceC8299b;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: com.google.android.datatransport.cct.f.b */
/* loaded from: classes2.dex */
public final class C6210b implements InterfaceC8298a {

    /* renamed from: a */
    public static final InterfaceC8298a f16600a = new C6210b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$a */
    private static final class a implements InterfaceC8294c<AbstractC6209a> {

        /* renamed from: a */
        static final a f16601a = new a();

        /* renamed from: b */
        private static final C8293b f16602b = C8293b.m26077d("sdkVersion");

        /* renamed from: c */
        private static final C8293b f16603c = C8293b.m26077d("model");

        /* renamed from: d */
        private static final C8293b f16604d = C8293b.m26077d("hardware");

        /* renamed from: e */
        private static final C8293b f16605e = C8293b.m26077d("device");

        /* renamed from: f */
        private static final C8293b f16606f = C8293b.m26077d("product");

        /* renamed from: g */
        private static final C8293b f16607g = C8293b.m26077d("osBuild");

        /* renamed from: h */
        private static final C8293b f16608h = C8293b.m26077d("manufacturer");

        /* renamed from: i */
        private static final C8293b f16609i = C8293b.m26077d("fingerprint");

        /* renamed from: j */
        private static final C8293b f16610j = C8293b.m26077d("locale");

        /* renamed from: k */
        private static final C8293b f16611k = C8293b.m26077d("country");

        /* renamed from: l */
        private static final C8293b f16612l = C8293b.m26077d("mccMnc");

        /* renamed from: m */
        private static final C8293b f16613m = C8293b.m26077d("applicationBuild");

        private a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6209a abstractC6209a, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f16602b, abstractC6209a.mo13429m());
            interfaceC8295d.mo26088i(f16603c, abstractC6209a.mo13426j());
            interfaceC8295d.mo26088i(f16604d, abstractC6209a.mo13422f());
            interfaceC8295d.mo26088i(f16605e, abstractC6209a.mo13420d());
            interfaceC8295d.mo26088i(f16606f, abstractC6209a.mo13428l());
            interfaceC8295d.mo26088i(f16607g, abstractC6209a.mo13427k());
            interfaceC8295d.mo26088i(f16608h, abstractC6209a.mo13424h());
            interfaceC8295d.mo26088i(f16609i, abstractC6209a.mo13421e());
            interfaceC8295d.mo26088i(f16610j, abstractC6209a.mo13423g());
            interfaceC8295d.mo26088i(f16611k, abstractC6209a.mo13419c());
            interfaceC8295d.mo26088i(f16612l, abstractC6209a.mo13425i());
            interfaceC8295d.mo26088i(f16613m, abstractC6209a.mo13418b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$b */
    private static final class b implements InterfaceC8294c<AbstractC6218j> {

        /* renamed from: a */
        static final b f16614a = new b();

        /* renamed from: b */
        private static final C8293b f16615b = C8293b.m26077d("logRequest");

        private b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6218j abstractC6218j, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f16615b, abstractC6218j.mo13451c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$c */
    private static final class c implements InterfaceC8294c<AbstractC6219k> {

        /* renamed from: a */
        static final c f16616a = new c();

        /* renamed from: b */
        private static final C8293b f16617b = C8293b.m26077d("clientType");

        /* renamed from: c */
        private static final C8293b f16618c = C8293b.m26077d("androidClientInfo");

        private c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6219k abstractC6219k, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f16617b, abstractC6219k.mo13453c());
            interfaceC8295d.mo26088i(f16618c, abstractC6219k.mo13452b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$d */
    private static final class d implements InterfaceC8294c<AbstractC6220l> {

        /* renamed from: a */
        static final d f16619a = new d();

        /* renamed from: b */
        private static final C8293b f16620b = C8293b.m26077d("eventTimeMs");

        /* renamed from: c */
        private static final C8293b f16621c = C8293b.m26077d("eventCode");

        /* renamed from: d */
        private static final C8293b f16622d = C8293b.m26077d("eventUptimeMs");

        /* renamed from: e */
        private static final C8293b f16623e = C8293b.m26077d("sourceExtension");

        /* renamed from: f */
        private static final C8293b f16624f = C8293b.m26077d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C8293b f16625g = C8293b.m26077d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C8293b f16626h = C8293b.m26077d("networkConnectionInfo");

        private d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6220l abstractC6220l, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26083b(f16620b, abstractC6220l.mo13458c());
            interfaceC8295d.mo26088i(f16621c, abstractC6220l.mo13457b());
            interfaceC8295d.mo26083b(f16622d, abstractC6220l.mo13459d());
            interfaceC8295d.mo26088i(f16623e, abstractC6220l.mo13461f());
            interfaceC8295d.mo26088i(f16624f, abstractC6220l.mo13462g());
            interfaceC8295d.mo26083b(f16625g, abstractC6220l.mo13463h());
            interfaceC8295d.mo26088i(f16626h, abstractC6220l.mo13460e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$e */
    private static final class e implements InterfaceC8294c<AbstractC6221m> {

        /* renamed from: a */
        static final e f16627a = new e();

        /* renamed from: b */
        private static final C8293b f16628b = C8293b.m26077d("requestTimeMs");

        /* renamed from: c */
        private static final C8293b f16629c = C8293b.m26077d("requestUptimeMs");

        /* renamed from: d */
        private static final C8293b f16630d = C8293b.m26077d("clientInfo");

        /* renamed from: e */
        private static final C8293b f16631e = C8293b.m26077d("logSource");

        /* renamed from: f */
        private static final C8293b f16632f = C8293b.m26077d("logSourceName");

        /* renamed from: g */
        private static final C8293b f16633g = C8293b.m26077d("logEvent");

        /* renamed from: h */
        private static final C8293b f16634h = C8293b.m26077d("qosTier");

        private e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6221m abstractC6221m, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26083b(f16628b, abstractC6221m.mo13477g());
            interfaceC8295d.mo26083b(f16629c, abstractC6221m.mo13478h());
            interfaceC8295d.mo26088i(f16630d, abstractC6221m.mo13472b());
            interfaceC8295d.mo26088i(f16631e, abstractC6221m.mo13474d());
            interfaceC8295d.mo26088i(f16632f, abstractC6221m.mo13475e());
            interfaceC8295d.mo26088i(f16633g, abstractC6221m.mo13473c());
            interfaceC8295d.mo26088i(f16634h, abstractC6221m.mo13476f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.f.b$f */
    private static final class f implements InterfaceC8294c<AbstractC6223o> {

        /* renamed from: a */
        static final f f16635a = new f();

        /* renamed from: b */
        private static final C8293b f16636b = C8293b.m26077d("networkType");

        /* renamed from: c */
        private static final C8293b f16637c = C8293b.m26077d("mobileSubtype");

        private f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC6223o abstractC6223o, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f16636b, abstractC6223o.mo13489c());
            interfaceC8295d.mo26088i(f16637c, abstractC6223o.mo13488b());
        }
    }

    private C6210b() {
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8298a
    /* renamed from: a */
    public void mo13443a(InterfaceC8299b<?> interfaceC8299b) {
        b bVar = b.f16614a;
        interfaceC8299b.mo26092a(AbstractC6218j.class, bVar);
        interfaceC8299b.mo26092a(C6212d.class, bVar);
        e eVar = e.f16627a;
        interfaceC8299b.mo26092a(AbstractC6221m.class, eVar);
        interfaceC8299b.mo26092a(C6215g.class, eVar);
        c cVar = c.f16616a;
        interfaceC8299b.mo26092a(AbstractC6219k.class, cVar);
        interfaceC8299b.mo26092a(C6213e.class, cVar);
        a aVar = a.f16601a;
        interfaceC8299b.mo26092a(AbstractC6209a.class, aVar);
        interfaceC8299b.mo26092a(C6211c.class, aVar);
        d dVar = d.f16619a;
        interfaceC8299b.mo26092a(AbstractC6220l.class, dVar);
        interfaceC8299b.mo26092a(C6214f.class, dVar);
        f fVar = f.f16635a;
        interfaceC8299b.mo26092a(AbstractC6223o.class, fVar);
        interfaceC8299b.mo26092a(C6217i.class, fVar);
    }
}
