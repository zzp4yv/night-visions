package p345i.p346a.p347g;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import okhttp3.HttpUrl;
import p345i.p346a.InterfaceC9150b;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.InterfaceC9163i;
import p345i.p346a.p347g.InterfaceC9168n;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;
import p345i.p346a.p347g.p348s.EnumC9179g;
import p345i.p346a.p347g.p349t.AbstractC9180a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: HostInfo.java */
/* renamed from: i.a.g.k */
/* loaded from: classes2.dex */
public class C9165k implements InterfaceC9163i {

    /* renamed from: f */
    private static InterfaceC9699b f35369f = C9700c.m32189i(C9165k.class.getName());

    /* renamed from: g */
    protected String f35370g;

    /* renamed from: h */
    protected InetAddress f35371h;

    /* renamed from: i */
    protected NetworkInterface f35372i;

    /* renamed from: j */
    private final b f35373j;

    /* compiled from: HostInfo.java */
    /* renamed from: i.a.g.k$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35374a;

        static {
            int[] iArr = new int[EnumC9177e.values().length];
            f35374a = iArr;
            try {
                iArr[EnumC9177e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35374a[EnumC9177e.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35374a[EnumC9177e.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: HostInfo.java */
    /* renamed from: i.a.g.k$b */
    private static final class b extends InterfaceC9163i.b {
        public b(C9166l c9166l) {
            mo29579q(c9166l);
        }
    }

    private C9165k(InetAddress inetAddress, String str, C9166l c9166l) {
        this.f35373j = new b(c9166l);
        this.f35371h = inetAddress;
        this.f35370g = str;
        if (inetAddress != null) {
            try {
                this.f35372i = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e2) {
                f35369f.mo32177f("LocalHostInfo() exception ", e2);
            }
        }
    }

    /* renamed from: A */
    public static C9165k m29601A(InetAddress inetAddress, C9166l c9166l, String str) {
        InetAddress localHost;
        String str2 = str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] mo29406a = InterfaceC9150b.a.m29407a().mo29406a();
                        if (mo29406a.length > 0) {
                            localHost = mo29406a[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    f35369f.mo32179h("Could not find any address beside the loopback.");
                }
            } catch (IOException e2) {
                f35369f.mo32177f("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e2.getMessage(), e2);
                localHost = m29606z();
                if (str == null || str.length() <= 0) {
                    str = "computer";
                }
            }
        } else {
            localHost = inetAddress;
        }
        if (str2.length() == 0) {
            str2 = localHost.getHostName();
        }
        if (str2.contains("in-addr.arpa") || str2.equals(localHost.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str = localHost.getHostAddress();
            }
            str2 = str;
        }
        int indexOf = str2.indexOf(".local");
        if (indexOf > 0) {
            str2 = str2.substring(0, indexOf);
        }
        return new C9165k(localHost, str2.replaceAll("[:%\\.]", "-") + ".local.", c9166l);
    }

    /* renamed from: g */
    private AbstractC9162h.a m29602g(boolean z, int i2) {
        if (m29622o() instanceof Inet4Address) {
            return new AbstractC9162h.c(m29624q(), EnumC9176d.CLASS_IN, z, i2, m29622o());
        }
        return null;
    }

    /* renamed from: h */
    private AbstractC9162h.e m29603h(boolean z, int i2) {
        if (!(m29622o() instanceof Inet4Address)) {
            return null;
        }
        return new AbstractC9162h.e(m29622o().getHostAddress() + ".in-addr.arpa.", EnumC9176d.CLASS_IN, z, i2, m29624q());
    }

    /* renamed from: i */
    private AbstractC9162h.a m29604i(boolean z, int i2) {
        if (m29622o() instanceof Inet6Address) {
            return new AbstractC9162h.d(m29624q(), EnumC9176d.CLASS_IN, z, i2, m29622o());
        }
        return null;
    }

    /* renamed from: j */
    private AbstractC9162h.e m29605j(boolean z, int i2) {
        if (!(m29622o() instanceof Inet6Address)) {
            return null;
        }
        return new AbstractC9162h.e(m29622o().getHostAddress() + ".ip6.arpa.", EnumC9176d.CLASS_IN, z, i2, m29624q());
    }

    /* renamed from: z */
    private static InetAddress m29606z() {
        try {
            return InetAddress.getByName(null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* renamed from: B */
    public boolean m29607B() {
        return this.f35373j.m29576n();
    }

    /* renamed from: C */
    public void m29608C(AbstractC9180a abstractC9180a) {
        this.f35373j.m29577o(abstractC9180a);
    }

    /* renamed from: D */
    public boolean m29609D() {
        return this.f35373j.m29578p();
    }

    /* renamed from: E */
    boolean m29610E(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z = false;
        if (m29622o() == null || (address = datagramPacket.getAddress()) == null) {
            return false;
        }
        if ((m29622o().isLinkLocalAddress() || m29622o().isMCLinkLocal()) && !address.isLinkLocalAddress()) {
            z = true;
        }
        if (!address.isLoopbackAddress() || m29622o().isLoopbackAddress()) {
            return z;
        }
        return true;
    }

    /* renamed from: F */
    public boolean m29611F(long j2) {
        return this.f35373j.m29582t(j2);
    }

    /* renamed from: G */
    public boolean m29612G(long j2) {
        if (this.f35371h == null) {
            return true;
        }
        return this.f35373j.m29583u(j2);
    }

    /* renamed from: a */
    public Collection<AbstractC9162h> m29613a(EnumC9176d enumC9176d, boolean z, int i2) {
        ArrayList arrayList = new ArrayList();
        AbstractC9162h.a m29602g = m29602g(z, i2);
        if (m29602g != null && m29602g.m29463s(enumC9176d)) {
            arrayList.add(m29602g);
        }
        AbstractC9162h.a m29604i = m29604i(z, i2);
        if (m29604i != null && m29604i.m29463s(enumC9176d)) {
            arrayList.add(m29604i);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m29614b(AbstractC9180a abstractC9180a, EnumC9179g enumC9179g) {
        this.f35373j.m29564a(abstractC9180a, enumC9179g);
    }

    /* renamed from: c */
    public boolean m29615c() {
        return this.f35373j.m29565b();
    }

    @Override // p345i.p346a.p347g.InterfaceC9163i
    /* renamed from: d */
    public boolean mo29559d(AbstractC9180a abstractC9180a) {
        return this.f35373j.mo29559d(abstractC9180a);
    }

    /* renamed from: e */
    public boolean m29616e() {
        return this.f35373j.m29566c();
    }

    /* renamed from: f */
    public boolean m29617f(AbstractC9162h.a aVar) {
        AbstractC9162h.a m29618k = m29618k(aVar.m29450f(), aVar.m29460p(), 3600);
        return m29618k != null && m29618k.m29542M(aVar) && m29618k.m29552U(aVar) && !m29618k.mo29543N(aVar);
    }

    /* renamed from: k */
    AbstractC9162h.a m29618k(EnumC9177e enumC9177e, boolean z, int i2) {
        int i3 = a.f35374a[enumC9177e.ordinal()];
        if (i3 == 1) {
            return m29602g(z, i2);
        }
        if (i3 == 2 || i3 == 3) {
            return m29604i(z, i2);
        }
        return null;
    }

    /* renamed from: l */
    AbstractC9162h.e m29619l(EnumC9177e enumC9177e, boolean z, int i2) {
        int i3 = a.f35374a[enumC9177e.ordinal()];
        if (i3 == 1) {
            return m29603h(z, i2);
        }
        if (i3 == 2 || i3 == 3) {
            return m29605j(z, i2);
        }
        return null;
    }

    /* renamed from: m */
    Inet4Address m29620m() {
        if (m29622o() instanceof Inet4Address) {
            return (Inet4Address) this.f35371h;
        }
        return null;
    }

    /* renamed from: n */
    Inet6Address m29621n() {
        if (m29622o() instanceof Inet6Address) {
            return (Inet6Address) this.f35371h;
        }
        return null;
    }

    /* renamed from: o */
    public InetAddress m29622o() {
        return this.f35371h;
    }

    /* renamed from: p */
    public NetworkInterface m29623p() {
        return this.f35372i;
    }

    /* renamed from: q */
    public String m29624q() {
        return this.f35370g;
    }

    /* renamed from: r */
    synchronized String m29625r() {
        String mo29706a;
        mo29706a = InterfaceC9168n.c.m29709a().mo29706a(m29622o(), this.f35370g, InterfaceC9168n.d.HOST);
        this.f35370g = mo29706a;
        return mo29706a;
    }

    /* renamed from: s */
    public boolean m29626s() {
        return this.f35373j.m29568f();
    }

    /* renamed from: t */
    public boolean m29627t(AbstractC9180a abstractC9180a, EnumC9179g enumC9179g) {
        return this.f35373j.m29570h(abstractC9180a, enumC9179g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        sb.append(m29624q() != null ? m29624q() : "no name");
        sb.append(", ");
        sb.append(m29623p() != null ? m29623p().getDisplayName() : "???");
        sb.append(":");
        sb.append(m29622o() != null ? m29622o().getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this.f35373j);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m29628u() {
        return this.f35373j.m29571i();
    }

    /* renamed from: v */
    public boolean m29629v() {
        return this.f35373j.m29572j();
    }

    /* renamed from: w */
    public boolean m29630w() {
        return this.f35373j.m29573k();
    }

    /* renamed from: x */
    public boolean m29631x() {
        return this.f35373j.m29574l();
    }

    /* renamed from: y */
    public boolean m29632y() {
        return this.f35373j.m29575m();
    }
}
