package io.sentry.clientreport;

import io.sentry.C9211a1;
import io.sentry.C9485n2;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.clientreport.C9369f;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReport.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.b */
/* loaded from: classes2.dex */
public final class C9365b implements InterfaceC9545r2 {

    /* renamed from: f */
    private final Date f36240f;

    /* renamed from: g */
    private final List<C9369f> f36241g;

    /* renamed from: h */
    private Map<String, Object> f36242h;

    /* compiled from: ClientReport.java */
    /* renamed from: io.sentry.clientreport.b$a */
    public static final class a implements InterfaceC9471l2<C9365b> {
        /* renamed from: c */
        private Exception m30682c(String str, InterfaceC9637w1 interfaceC9637w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9365b mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            ArrayList arrayList = new ArrayList();
            c9485n2.m31884b();
            Date date = null;
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                String m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                if (m31879B.equals("discarded_events")) {
                    arrayList.addAll(c9485n2.m31085F0(interfaceC9637w1, new C9369f.a()));
                } else if (m31879B.equals("timestamp")) {
                    date = c9485n2.m31094q0(interfaceC9637w1);
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                }
            }
            c9485n2.m31889j();
            if (date == null) {
                throw m30682c("timestamp", interfaceC9637w1);
            }
            if (arrayList.isEmpty()) {
                throw m30682c("discarded_events", interfaceC9637w1);
            }
            C9365b c9365b = new C9365b(date, arrayList);
            c9365b.m30681b(hashMap);
            return c9365b;
        }
    }

    public C9365b(Date date, List<C9369f> list) {
        this.f36240f = date;
        this.f36241g = list;
    }

    /* renamed from: a */
    public List<C9369f> m30680a() {
        return this.f36241g;
    }

    /* renamed from: b */
    public void m30681b(Map<String, Object> map) {
        this.f36242h = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        interfaceC9415h3.mo30828k("timestamp").mo30819b(C9211a1.m30012g(this.f36240f));
        interfaceC9415h3.mo30828k("discarded_events").mo30824g(interfaceC9637w1, this.f36241g);
        Map<String, Object> map = this.f36242h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.f36242h.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }
}
