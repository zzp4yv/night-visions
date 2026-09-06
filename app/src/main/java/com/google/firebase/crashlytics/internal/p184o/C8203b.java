package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.encoders.C8293b;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import com.google.firebase.encoders.p192g.InterfaceC8298a;
import com.google.firebase.encoders.p192g.InterfaceC8299b;
import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* renamed from: com.google.firebase.crashlytics.h.o.b */
/* loaded from: classes2.dex */
public final class C8203b implements InterfaceC8298a {

    /* renamed from: a */
    public static final InterfaceC8298a f31064a = new C8203b();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.b$a */
    private static final class a implements InterfaceC8294c<AbstractC8211j> {

        /* renamed from: a */
        static final a f31065a = new a();

        /* renamed from: b */
        private static final C8293b f31066b = C8293b.m26077d("rolloutId");

        /* renamed from: c */
        private static final C8293b f31067c = C8293b.m26077d("parameterKey");

        /* renamed from: d */
        private static final C8293b f31068d = C8293b.m26077d("parameterValue");

        /* renamed from: e */
        private static final C8293b f31069e = C8293b.m26077d("variantId");

        /* renamed from: f */
        private static final C8293b f31070f = C8293b.m26077d("templateVersion");

        private a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8211j abstractC8211j, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f31066b, abstractC8211j.mo25460e());
            interfaceC8295d.mo26088i(f31067c, abstractC8211j.mo25458c());
            interfaceC8295d.mo26088i(f31068d, abstractC8211j.mo25459d());
            interfaceC8295d.mo26088i(f31069e, abstractC8211j.mo25462g());
            interfaceC8295d.mo26083b(f31070f, abstractC8211j.mo25461f());
        }
    }

    private C8203b() {
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8298a
    /* renamed from: a */
    public void mo13443a(InterfaceC8299b<?> interfaceC8299b) {
        a aVar = a.f31065a;
        interfaceC8299b.mo26092a(AbstractC8211j.class, aVar);
        interfaceC8299b.mo26092a(C8204c.class, aVar);
    }
}
