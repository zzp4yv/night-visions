package io.sentry.transport;

import io.sentry.C9416h4;
import io.sentry.C9459j4;
import io.sentry.C9484n1;
import io.sentry.C9647x4;
import io.sentry.EnumC9554s4;
import io.sentry.EnumC9655z0;
import io.sentry.clientreport.EnumC9368e;
import io.sentry.hints.InterfaceC9428k;
import io.sentry.hints.InterfaceC9433p;
import io.sentry.util.C9609m;
import io.sentry.util.C9621u;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* compiled from: RateLimiter.java */
/* renamed from: io.sentry.transport.y */
/* loaded from: classes2.dex */
public final class C9588y {

    /* renamed from: a */
    private final InterfaceC9580q f36908a;

    /* renamed from: b */
    private final C9647x4 f36909b;

    /* renamed from: c */
    private final Map<EnumC9655z0, Date> f36910c;

    public C9588y(InterfaceC9580q interfaceC9580q, C9647x4 c9647x4) {
        this.f36910c = new ConcurrentHashMap();
        this.f36908a = interfaceC9580q;
        this.f36909b = c9647x4;
    }

    /* renamed from: a */
    private void m31709a(EnumC9655z0 enumC9655z0, Date date) {
        Date date2 = this.f36910c.get(enumC9655z0);
        if (date2 == null || date.after(date2)) {
            this.f36910c.put(enumC9655z0, date);
        }
    }

    /* renamed from: c */
    private EnumC9655z0 m31710c(String str) {
        str.hashCode();
        switch (str) {
            case "attachment":
                return EnumC9655z0.Attachment;
            case "profile":
                return EnumC9655z0.Profile;
            case "event":
                return EnumC9655z0.Error;
            case "session":
                return EnumC9655z0.Session;
            case "transaction":
                return EnumC9655z0.Transaction;
            default:
                return EnumC9655z0.Unknown;
        }
    }

    /* renamed from: d */
    private boolean m31711d(String str) {
        Date date;
        EnumC9655z0 m31710c = m31710c(str);
        Date date2 = new Date(this.f36908a.mo30147a());
        Date date3 = this.f36910c.get(EnumC9655z0.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC9655z0.Unknown.equals(m31710c) || (date = this.f36910c.get(m31710c)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    /* renamed from: g */
    private static void m31714g(C9484n1 c9484n1, final boolean z) {
        C9609m.m31788k(c9484n1, InterfaceC9433p.class, new C9609m.a() { // from class: io.sentry.transport.l
            @Override // io.sentry.util.C9609m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9433p) obj).mo30475c(false);
            }
        });
        C9609m.m31788k(c9484n1, InterfaceC9428k.class, new C9609m.a() { // from class: io.sentry.transport.k
            @Override // io.sentry.util.C9609m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9428k) obj).mo30476d(z);
            }
        });
    }

    /* renamed from: h */
    private long m31715h(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    /* renamed from: b */
    public C9416h4 m31716b(C9416h4 c9416h4, C9484n1 c9484n1) {
        ArrayList arrayList = null;
        for (C9459j4 c9459j4 : c9416h4.m30832c()) {
            if (m31711d(c9459j4.m30910i().m30919b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c9459j4);
                this.f36909b.getClientReportRecorder().mo30693d(EnumC9368e.RATELIMIT_BACKOFF, c9459j4);
            }
        }
        if (arrayList == null) {
            return c9416h4;
        }
        this.f36909b.getLogger().mo30214c(EnumC9554s4.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (C9459j4 c9459j42 : c9416h4.m30832c()) {
            if (!arrayList.contains(c9459j42)) {
                arrayList2.add(c9459j42);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C9416h4(c9416h4.m30831b(), arrayList2);
        }
        this.f36909b.getLogger().mo30214c(EnumC9554s4.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
        m31714g(c9484n1, false);
        return null;
    }

    /* renamed from: i */
    public void m31717i(String str, String str2, int i2) {
        if (str == null) {
            if (i2 == 429) {
                m31709a(EnumC9655z0.All, new Date(this.f36908a.mo30147a() + m31715h(str2)));
                return;
            }
            return;
        }
        int i3 = -1;
        String[] split = str.split(",", -1);
        int length = split.length;
        int i4 = 0;
        while (i4 < length) {
            String[] split2 = split[i4].replace(" ", HttpUrl.FRAGMENT_ENCODE_SET).split(":", i3);
            if (split2.length > 0) {
                long m31715h = m31715h(split2[0]);
                if (split2.length > 1) {
                    String str3 = split2[1];
                    Date date = new Date(this.f36908a.mo30147a() + m31715h);
                    if (str3 == null || str3.isEmpty()) {
                        m31709a(EnumC9655z0.All, date);
                    } else {
                        for (String str4 : str3.split(";", i3)) {
                            EnumC9655z0 enumC9655z0 = EnumC9655z0.Unknown;
                            try {
                                String m31818b = C9621u.m31818b(str4);
                                if (m31818b != null) {
                                    enumC9655z0 = EnumC9655z0.valueOf(m31818b);
                                } else {
                                    this.f36909b.getLogger().mo30214c(EnumC9554s4.ERROR, "Couldn't capitalize: %s", str4);
                                }
                            } catch (IllegalArgumentException e2) {
                                this.f36909b.getLogger().mo30212a(EnumC9554s4.INFO, e2, "Unknown category: %s", str4);
                            }
                            if (!EnumC9655z0.Unknown.equals(enumC9655z0)) {
                                m31709a(enumC9655z0, date);
                            }
                        }
                    }
                }
            }
            i4++;
            i3 = -1;
        }
    }

    public C9588y(C9647x4 c9647x4) {
        this(C9578o.m31694b(), c9647x4);
    }
}
