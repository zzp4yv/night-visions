package p345i.p346a.p347g;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: DNSQuestion.java */
/* renamed from: i.a.g.g */
/* loaded from: classes2.dex */
public class C9161g extends AbstractC9156b {

    /* renamed from: h */
    private static InterfaceC9699b f35333h = C9700c.m32189i(C9161g.class.getName());

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35334a;

        static {
            int[] iArr = new int[EnumC9177e.values().length];
            f35334a = iArr;
            try {
                iArr[EnumC9177e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35334a[EnumC9177e.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35334a[EnumC9177e.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35334a[EnumC9177e.TYPE_ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35334a[EnumC9177e.TYPE_HINFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35334a[EnumC9177e.TYPE_PTR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35334a[EnumC9177e.TYPE_SRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35334a[EnumC9177e.TYPE_TXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$b */
    private static class b extends C9161g {
        b(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: B */
        public boolean mo29527B(C9166l c9166l) {
            String lowerCase = m29447c().toLowerCase();
            return c9166l.m29674n0().m29624q().equals(lowerCase) || c9166l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.AbstractC9156b
        /* renamed from: n */
        public boolean mo29458n(AbstractC9156b abstractC9156b) {
            return abstractC9156b != null;
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: y */
        public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
            String lowerCase = m29447c().toLowerCase();
            if (c9166l.m29674n0().m29624q().equalsIgnoreCase(lowerCase)) {
                set.addAll(c9166l.m29674n0().m29613a(m29449e(), m29460p(), 3600));
            } else {
                if (c9166l.m29685x0().containsKey(lowerCase)) {
                    new f(m29447c(), EnumC9177e.TYPE_PTR, m29449e(), m29460p()).mo29528y(c9166l, set);
                    return;
                }
                Iterator<AbstractC9152d> it = c9166l.m29687y0().values().iterator();
                while (it.hasNext()) {
                    m29529z(c9166l, set, (C9171q) it.next());
                }
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$c */
    private static class c extends C9161g {
        c(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: B */
        public boolean mo29527B(C9166l c9166l) {
            String lowerCase = m29447c().toLowerCase();
            return c9166l.m29674n0().m29624q().equals(lowerCase) || c9166l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: y */
        public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
            AbstractC9162h.a m29618k = c9166l.m29674n0().m29618k(m29450f(), true, 3600);
            if (m29618k != null) {
                set.add(m29618k);
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$d */
    private static class d extends C9161g {
        d(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: B */
        public boolean mo29527B(C9166l c9166l) {
            String lowerCase = m29447c().toLowerCase();
            return c9166l.m29674n0().m29624q().equals(lowerCase) || c9166l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: y */
        public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
            AbstractC9162h.a m29618k = c9166l.m29674n0().m29618k(m29450f(), true, 3600);
            if (m29618k != null) {
                set.add(m29618k);
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$e */
    private static class e extends C9161g {
        e(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$f */
    private static class f extends C9161g {
        f(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: y */
        public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
            Iterator<AbstractC9152d> it = c9166l.m29687y0().values().iterator();
            while (it.hasNext()) {
                m29529z(c9166l, set, (C9171q) it.next());
            }
            if (m29459o()) {
                Iterator<String> it2 = c9166l.m29685x0().keySet().iterator();
                while (it2.hasNext()) {
                    set.add(new AbstractC9162h.e("_services._dns-sd._udp.local.", EnumC9176d.CLASS_IN, false, 3600, c9166l.m29685x0().get(it2.next()).m29693f()));
                }
                return;
            }
            if (!m29455k()) {
                m29453i();
                return;
            }
            String str = m29448d().get(AbstractC9152d.a.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress m29622o = c9166l.m29674n0().m29622o();
            if (str.equalsIgnoreCase(m29622o != null ? m29622o.getHostAddress() : HttpUrl.FRAGMENT_ENCODE_SET)) {
                if (m29461q()) {
                    set.add(c9166l.m29674n0().m29619l(EnumC9177e.TYPE_A, false, 3600));
                }
                if (m29462r()) {
                    set.add(c9166l.m29674n0().m29619l(EnumC9177e.TYPE_AAAA, false, 3600));
                }
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$g */
    private static class g extends C9161g {
        g(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: B */
        public boolean mo29527B(C9166l c9166l) {
            String lowerCase = m29447c().toLowerCase();
            return c9166l.m29674n0().m29624q().equals(lowerCase) || c9166l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: y */
        public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
            String lowerCase = m29447c().toLowerCase();
            if (c9166l.m29674n0().m29624q().equalsIgnoreCase(lowerCase)) {
                set.addAll(c9166l.m29674n0().m29613a(m29449e(), m29460p(), 3600));
            } else if (c9166l.m29685x0().containsKey(lowerCase)) {
                new f(m29447c(), EnumC9177e.TYPE_PTR, m29449e(), m29460p()).mo29528y(c9166l, set);
            } else {
                m29529z(c9166l, set, (C9171q) c9166l.m29687y0().get(lowerCase));
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$h */
    private static class h extends C9161g {
        h(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
            super(str, enumC9177e, enumC9176d, z);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: B */
        public boolean mo29527B(C9166l c9166l) {
            String lowerCase = m29447c().toLowerCase();
            return c9166l.m29674n0().m29624q().equals(lowerCase) || c9166l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9161g
        /* renamed from: y */
        public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
            m29529z(c9166l, set, (C9171q) c9166l.m29687y0().get(m29447c().toLowerCase()));
        }
    }

    C9161g(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
        super(str, enumC9177e, enumC9176d, z);
    }

    /* renamed from: C */
    public static C9161g m29525C(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
        switch (a.f35334a[enumC9177e.ordinal()]) {
            case 1:
                return new c(str, enumC9177e, enumC9176d, z);
            case 2:
                return new d(str, enumC9177e, enumC9176d, z);
            case 3:
                return new d(str, enumC9177e, enumC9176d, z);
            case 4:
                return new b(str, enumC9177e, enumC9176d, z);
            case 5:
                return new e(str, enumC9177e, enumC9176d, z);
            case 6:
                return new f(str, enumC9177e, enumC9176d, z);
            case 7:
                return new g(str, enumC9177e, enumC9176d, z);
            case 8:
                return new h(str, enumC9177e, enumC9176d, z);
            default:
                return new C9161g(str, enumC9177e, enumC9176d, z);
        }
    }

    /* renamed from: A */
    boolean m29526A(AbstractC9156b abstractC9156b) {
        return m29457m(abstractC9156b) && mo29458n(abstractC9156b) && m29447c().equals(abstractC9156b.m29447c());
    }

    /* renamed from: B */
    public boolean mo29527B(C9166l c9166l) {
        return false;
    }

    @Override // p345i.p346a.p347g.AbstractC9156b
    /* renamed from: j */
    public boolean mo29454j(long j2) {
        return false;
    }

    @Override // p345i.p346a.p347g.AbstractC9156b
    /* renamed from: x */
    public void mo29468x(StringBuilder sb) {
    }

    /* renamed from: y */
    public void mo29528y(C9166l c9166l, Set<AbstractC9162h> set) {
    }

    /* renamed from: z */
    protected void m29529z(C9166l c9166l, Set<AbstractC9162h> set, C9171q c9171q) {
        if (c9171q == null || !c9171q.m29731Q()) {
            return;
        }
        if (m29447c().equalsIgnoreCase(c9171q.mo29425o()) || m29447c().equalsIgnoreCase(c9171q.mo29429s()) || m29447c().equalsIgnoreCase(c9171q.m29730O())) {
            set.addAll(c9166l.m29674n0().m29613a(m29449e(), true, 3600));
            set.addAll(c9171q.m29722D(m29449e(), true, 3600, c9166l.m29674n0()));
        }
        if (f35333h.mo32173b()) {
            f35333h.mo32174c(c9166l.m29676p0() + " DNSQuestion(" + m29447c() + ").addAnswersForServiceInfo(): info: " + c9171q + "\n" + set);
        }
    }
}
