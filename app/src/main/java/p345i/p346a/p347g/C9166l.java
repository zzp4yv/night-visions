package p345i.p346a.p347g;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9149a;
import p345i.p346a.AbstractC9151c;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.InterfaceC9153e;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.C9167m;
import p345i.p346a.p347g.InterfaceC9164j;
import p345i.p346a.p347g.InterfaceC9168n;
import p345i.p346a.p347g.p348s.C9173a;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;
import p345i.p346a.p347g.p348s.EnumC9179g;
import p345i.p346a.p347g.p349t.AbstractC9180a;
import p345i.p346a.p347g.p352u.ThreadFactoryC9191a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: JmDNSImpl.java */
/* renamed from: i.a.g.l */
/* loaded from: classes2.dex */
public class C9166l extends AbstractC9149a implements InterfaceC9163i, InterfaceC9164j {

    /* renamed from: g */
    private static InterfaceC9699b f35375g = C9700c.m32189i(C9166l.class.getName());

    /* renamed from: h */
    private static final Random f35376h = new Random();

    /* renamed from: A */
    private final String f35377A;

    /* renamed from: i */
    private volatile InetAddress f35379i;

    /* renamed from: j */
    private volatile MulticastSocket f35380j;

    /* renamed from: k */
    private final List<InterfaceC9158d> f35381k;

    /* renamed from: l */
    final ConcurrentMap<String, List<C9167m.a>> f35382l;

    /* renamed from: m */
    private final Set<C9167m.b> f35383m;

    /* renamed from: n */
    private final C9155a f35384n;

    /* renamed from: o */
    private final ConcurrentMap<String, AbstractC9152d> f35385o;

    /* renamed from: p */
    private final ConcurrentMap<String, j> f35386p;

    /* renamed from: q */
    private volatile AbstractC9149a.a f35387q;

    /* renamed from: r */
    protected Thread f35388r;

    /* renamed from: s */
    private C9165k f35389s;

    /* renamed from: t */
    private Thread f35390t;

    /* renamed from: u */
    private int f35391u;

    /* renamed from: v */
    private long f35392v;

    /* renamed from: y */
    private C9157c f35395y;

    /* renamed from: z */
    private final ConcurrentMap<String, i> f35396z;

    /* renamed from: w */
    private final ExecutorService f35393w = Executors.newSingleThreadExecutor(new ThreadFactoryC9191a("JmDNS"));

    /* renamed from: x */
    private final ReentrantLock f35394x = new ReentrantLock();

    /* renamed from: B */
    private final Object f35378B = new Object();

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9167m.a f35397f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9151c f35398g;

        a(C9167m.a aVar, AbstractC9151c abstractC9151c) {
            this.f35397f = aVar;
            this.f35398g = abstractC9151c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35397f.m29703f(this.f35398g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9167m.b f35400f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9151c f35401g;

        b(C9167m.b bVar, AbstractC9151c abstractC9151c) {
            this.f35400f = bVar;
            this.f35401g = abstractC9151c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35400f.m29704c(this.f35401g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$c */
    class c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9167m.b f35403f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9151c f35404g;

        c(C9167m.b bVar, AbstractC9151c abstractC9151c) {
            this.f35403f = bVar;
            this.f35404g = abstractC9151c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35403f.m29705d(this.f35404g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$d */
    class d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9167m.a f35406f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9151c f35407g;

        d(C9167m.a aVar, AbstractC9151c abstractC9151c) {
            this.f35406f = aVar;
            this.f35407g = abstractC9151c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35406f.m29701d(this.f35407g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$e */
    class e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9167m.a f35409f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9151c f35410g;

        e(C9167m.a aVar, AbstractC9151c abstractC9151c) {
            this.f35409f = aVar;
            this.f35410g = abstractC9151c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35409f.m29702e(this.f35410g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$f */
    class f extends Thread {
        f(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C9166l.this.m29643D();
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$g */
    static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f35413a;

        static {
            int[] iArr = new int[h.values().length];
            f35413a = iArr;
            try {
                iArr[h.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35413a[h.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$h */
    public enum h {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$i */
    private static class i implements InterfaceC9153e {

        /* renamed from: c */
        private final String f35422c;

        /* renamed from: a */
        private final ConcurrentMap<String, AbstractC9152d> f35420a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<String, AbstractC9151c> f35421b = new ConcurrentHashMap();

        /* renamed from: d */
        private volatile boolean f35423d = true;

        public i(String str) {
            this.f35422c = str;
        }

        @Override // p345i.p346a.InterfaceC9153e
        public void serviceAdded(AbstractC9151c abstractC9151c) {
            synchronized (this) {
                AbstractC9152d mo29412e = abstractC9151c.mo29412e();
                if (mo29412e == null || !mo29412e.mo29431u()) {
                    C9171q m29682u1 = ((C9166l) abstractC9151c.mo29411d()).m29682u1(abstractC9151c.mo29414g(), abstractC9151c.mo29413f(), mo29412e != null ? mo29412e.mo29427q() : HttpUrl.FRAGMENT_ENCODE_SET, true);
                    if (m29682u1 != null) {
                        this.f35420a.put(abstractC9151c.mo29413f(), m29682u1);
                    } else {
                        this.f35421b.put(abstractC9151c.mo29413f(), abstractC9151c);
                    }
                } else {
                    this.f35420a.put(abstractC9151c.mo29413f(), mo29412e);
                }
            }
        }

        @Override // p345i.p346a.InterfaceC9153e
        public void serviceRemoved(AbstractC9151c abstractC9151c) {
            synchronized (this) {
                this.f35420a.remove(abstractC9151c.mo29413f());
                this.f35421b.remove(abstractC9151c.mo29413f());
            }
        }

        @Override // p345i.p346a.InterfaceC9153e
        public void serviceResolved(AbstractC9151c abstractC9151c) {
            synchronized (this) {
                this.f35420a.put(abstractC9151c.mo29413f(), abstractC9151c.mo29412e());
                this.f35421b.remove(abstractC9151c.mo29413f());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this.f35422c);
            if (this.f35420a.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this.f35420a.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f35420a.get(str));
                }
            }
            if (this.f35421b.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this.f35421b.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f35421b.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$j */
    public static class j extends AbstractMap<String, String> implements Cloneable {

        /* renamed from: f */
        private final Set<Map.Entry<String, String>> f35424f = new HashSet();

        /* renamed from: g */
        private final String f35425g;

        /* compiled from: JmDNSImpl.java */
        /* renamed from: i.a.g.l$j$a */
        private static class a implements Map.Entry<String, String>, Serializable, Cloneable {

            /* renamed from: f */
            private final String f35426f;

            /* renamed from: g */
            private final String f35427g;

            public a(String str) {
                str = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                this.f35427g = str;
                this.f35426f = str.toLowerCase();
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a clone() {
                return this;
            }

            @Override // java.util.Map.Entry
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public String getKey() {
                return this.f35426f;
            }

            @Override // java.util.Map.Entry
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public String getValue() {
                return this.f35427g;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            @Override // java.util.Map.Entry
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public String setValue(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                String str = this.f35426f;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f35427g;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return this.f35426f + "=" + this.f35427g;
            }
        }

        public j(String str) {
            this.f35425g = str;
        }

        /* renamed from: b */
        public boolean m29690b(String str) {
            if (str == null || m29692e(str)) {
                return false;
            }
            this.f35424f.add(new a(str));
            return true;
        }

        @Override // java.util.AbstractMap
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public j clone() {
            j jVar = new j(m29693f());
            Iterator<Map.Entry<String, String>> it = entrySet().iterator();
            while (it.hasNext()) {
                jVar.m29690b(it.next().getValue());
            }
            return jVar;
        }

        /* renamed from: e */
        public boolean m29692e(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return this.f35424f;
        }

        /* renamed from: f */
        public String m29693f() {
            return this.f35425g;
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder(200);
            if (isEmpty()) {
                sb.append("empty");
            } else {
                Iterator<String> it = values().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(", ");
                }
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        }
    }

    public C9166l(InetAddress inetAddress, String str) throws IOException {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("JmDNS instance created");
        }
        this.f35384n = new C9155a(100);
        this.f35381k = Collections.synchronizedList(new ArrayList());
        this.f35382l = new ConcurrentHashMap();
        this.f35383m = Collections.synchronizedSet(new HashSet());
        this.f35396z = new ConcurrentHashMap();
        this.f35385o = new ConcurrentHashMap(20);
        this.f35386p = new ConcurrentHashMap(20);
        C9165k m29601A = C9165k.m29601A(inetAddress, this, str);
        this.f35389s = m29601A;
        this.f35377A = str == null ? m29601A.m29624q() : str;
        m29640f1(m29674n0());
        m29633A1(m29687y0().values());
        mo29589j();
    }

    /* renamed from: A1 */
    private void m29633A1(Collection<? extends AbstractC9152d> collection) {
        if (this.f35390t == null) {
            C9172r c9172r = new C9172r(this);
            this.f35390t = c9172r;
            c9172r.start();
        }
        mo29590k();
        Iterator<? extends AbstractC9152d> it = collection.iterator();
        while (it.hasNext()) {
            try {
                m29672l1(new C9171q(it.next()));
            } catch (Exception e2) {
                f35375g.mo32177f("start() Registration exception ", e2);
            }
        }
    }

    /* renamed from: B1 */
    static String m29634B1(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* renamed from: H */
    private List<AbstractC9162h> m29635H(List<AbstractC9162h> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC9162h abstractC9162h : list) {
            if (abstractC9162h.m29450f().equals(EnumC9177e.TYPE_A) || abstractC9162h.m29450f().equals(EnumC9177e.TYPE_AAAA)) {
                arrayList2.add(abstractC9162h);
            } else {
                arrayList.add(abstractC9162h);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: J */
    private void m29636J(String str, InterfaceC9153e interfaceC9153e, boolean z) {
        C9167m.a aVar = new C9167m.a(interfaceC9153e, z);
        String lowerCase = str.toLowerCase();
        List<C9167m.a> list = this.f35382l.get(lowerCase);
        if (list == null) {
            if (this.f35382l.putIfAbsent(lowerCase, new LinkedList()) == null && this.f35396z.putIfAbsent(lowerCase, new i(str)) == null) {
                m29636J(lowerCase, this.f35396z.get(lowerCase), true);
            }
            list = this.f35382l.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC9156b> it = m29663Z().m29438c().iterator();
        while (it.hasNext()) {
            AbstractC9162h abstractC9162h = (AbstractC9162h) it.next();
            if (abstractC9162h.m29450f() == EnumC9177e.TYPE_SRV && abstractC9162h.m29446b().endsWith(lowerCase)) {
                arrayList.add(new C9170p(this, abstractC9162h.m29452h(), m29634B1(abstractC9162h.m29452h(), abstractC9162h.m29447c()), abstractC9162h.m29532C()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.m29701d((AbstractC9151c) it2.next());
        }
        mo29586c(str);
    }

    /* renamed from: T */
    private void m29637T() {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("closeMulticastSocket()");
        }
        if (this.f35380j != null) {
            try {
                try {
                    this.f35380j.leaveGroup(this.f35379i);
                } catch (Exception e2) {
                    f35375g.mo32177f("closeMulticastSocket() Close socket exception ", e2);
                }
            } catch (SocketException unused) {
            }
            this.f35380j.close();
            while (true) {
                Thread thread = this.f35390t;
                if (thread == null || !thread.isAlive()) {
                    break;
                }
                synchronized (this) {
                    try {
                        Thread thread2 = this.f35390t;
                        if (thread2 != null && thread2.isAlive()) {
                            if (f35375g.mo32173b()) {
                                f35375g.mo32174c("closeMulticastSocket(): waiting for jmDNS monitor");
                            }
                            wait(1000L);
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            this.f35390t = null;
            this.f35380j = null;
        }
    }

    /* renamed from: Y */
    private void m29638Y() {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("disposeServiceCollectors()");
        }
        for (String str : this.f35396z.keySet()) {
            i iVar = this.f35396z.get(str);
            if (iVar != null) {
                m29679s1(str, iVar);
                this.f35396z.remove(str, iVar);
            }
        }
    }

    /* renamed from: c1 */
    private boolean m29639c1(C9171q c9171q) {
        boolean z;
        AbstractC9152d abstractC9152d;
        String m29727L = c9171q.m29727L();
        long currentTimeMillis = System.currentTimeMillis();
        do {
            z = false;
            for (AbstractC9156b abstractC9156b : m29663Z().m29441f(c9171q.m29727L())) {
                if (EnumC9177e.TYPE_SRV.equals(abstractC9156b.m29450f()) && !abstractC9156b.mo29454j(currentTimeMillis)) {
                    AbstractC9162h.f fVar = (AbstractC9162h.f) abstractC9156b;
                    if (fVar.m29554T() != c9171q.mo29422l() || !fVar.m29556V().equals(this.f35389s.m29624q())) {
                        if (f35375g.mo32173b()) {
                            f35375g.mo32174c("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + abstractC9156b + " s.server=" + fVar.m29556V() + " " + this.f35389s.m29624q() + " equals:" + fVar.m29556V().equals(this.f35389s.m29624q()));
                        }
                        c9171q.m29741d0(InterfaceC9168n.c.m29709a().mo29706a(this.f35389s.m29622o(), c9171q.mo29421k(), InterfaceC9168n.d.SERVICE));
                        z = true;
                        abstractC9152d = this.f35385o.get(c9171q.m29727L());
                        if (abstractC9152d != null && abstractC9152d != c9171q) {
                            c9171q.m29741d0(InterfaceC9168n.c.m29709a().mo29706a(this.f35389s.m29622o(), c9171q.mo29421k(), InterfaceC9168n.d.SERVICE));
                            z = true;
                        }
                    }
                }
            }
            abstractC9152d = this.f35385o.get(c9171q.m29727L());
            if (abstractC9152d != null) {
                c9171q.m29741d0(InterfaceC9168n.c.m29709a().mo29706a(this.f35389s.m29622o(), c9171q.mo29421k(), InterfaceC9168n.d.SERVICE));
                z = true;
            }
        } while (z);
        return !m29727L.equals(c9171q.m29727L());
    }

    /* renamed from: f1 */
    private void m29640f1(C9165k c9165k) throws IOException {
        if (this.f35379i == null) {
            if (c9165k.m29622o() instanceof Inet6Address) {
                this.f35379i = InetAddress.getByName("FF02::FB");
            } else {
                this.f35379i = InetAddress.getByName("224.0.0.251");
            }
        }
        if (this.f35380j != null) {
            m29637T();
        }
        this.f35380j = new MulticastSocket(C9173a.f35467a);
        if (c9165k != null && c9165k.m29623p() != null) {
            try {
                this.f35380j.setNetworkInterface(c9165k.m29623p());
            } catch (SocketException e2) {
                if (f35375g.mo32173b()) {
                    f35375g.mo32174c("openMulticastSocket() Set network interface exception: " + e2.getMessage());
                }
            }
        }
        this.f35380j.setTimeToLive(255);
        this.f35380j.joinGroup(this.f35379i);
    }

    /* renamed from: q0 */
    public static Random m29641q0() {
        return f35376h;
    }

    @Override // p345i.p346a.AbstractC9149a
    /* renamed from: B */
    public void mo29403B() {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("unregisterAllServices()");
        }
        Iterator<String> it = this.f35385o.keySet().iterator();
        while (it.hasNext()) {
            C9171q c9171q = (C9171q) this.f35385o.get(it.next());
            if (c9171q != null) {
                if (f35375g.mo32173b()) {
                    f35375g.mo32174c("Cancelling service info: " + c9171q);
                }
                c9171q.m29724F();
            }
        }
        mo29588f();
        for (String str : this.f35385o.keySet()) {
            C9171q c9171q2 = (C9171q) this.f35385o.get(str);
            if (c9171q2 != null) {
                if (f35375g.mo32173b()) {
                    f35375g.mo32174c("Wait for service info cancel: " + c9171q2);
                }
                c9171q2.m29745k0(5000L);
                this.f35385o.remove(str, c9171q2);
            }
        }
    }

    /* renamed from: C1 */
    public void m29642C1(long j2, AbstractC9162h abstractC9162h, h hVar) {
        ArrayList arrayList;
        List<C9167m.a> emptyList;
        synchronized (this.f35381k) {
            arrayList = new ArrayList(this.f35381k);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC9158d) it.next()).mo29483b(m29663Z(), j2, abstractC9162h);
        }
        if (EnumC9177e.TYPE_PTR.equals(abstractC9162h.m29450f())) {
            AbstractC9151c mo29531B = abstractC9162h.mo29531B(this);
            if (mo29531B.mo29412e() == null || !mo29531B.mo29412e().mo29431u()) {
                C9171q m29680t0 = m29680t0(mo29531B.mo29414g(), mo29531B.mo29413f(), HttpUrl.FRAGMENT_ENCODE_SET, false);
                if (m29680t0.mo29431u()) {
                    mo29531B = new C9170p(this, mo29531B.mo29414g(), mo29531B.mo29413f(), m29680t0);
                }
            }
            List<C9167m.a> list = this.f35382l.get(mo29531B.mo29414g().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    emptyList = new ArrayList(list);
                }
            } else {
                emptyList = Collections.emptyList();
            }
            if (f35375g.mo32175d()) {
                f35375g.mo32180i(m29676p0() + ".updating record for event: " + mo29531B + " list " + emptyList + " operation: " + hVar);
            }
            if (emptyList.isEmpty()) {
                return;
            }
            int i2 = g.f35413a[hVar.ordinal()];
            if (i2 == 1) {
                for (C9167m.a aVar : emptyList) {
                    if (aVar.m29699b()) {
                        aVar.m29701d(mo29531B);
                    } else {
                        this.f35393w.submit(new d(aVar, mo29531B));
                    }
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            for (C9167m.a aVar2 : emptyList) {
                if (aVar2.m29699b()) {
                    aVar2.m29702e(mo29531B);
                } else {
                    this.f35393w.submit(new e(aVar2, mo29531B));
                }
            }
        }
    }

    /* renamed from: D */
    void m29643D() {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + "recover() Cleanning up");
        }
        f35375g.mo32179h("RECOVERING");
        mo29584a();
        ArrayList arrayList = new ArrayList(m29687y0().values());
        mo29403B();
        m29638Y();
        m29646E1(5000L);
        mo29593p();
        m29637T();
        m29663Z().clear();
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + "recover() All is clean");
        }
        if (!m29660V0()) {
            f35375g.mo32179h(m29676p0() + "recover() Could not recover we are Down!");
            if (m29665a0() != null) {
                m29665a0().m29405a(m29667e0(), arrayList);
                return;
            }
            return;
        }
        Iterator<AbstractC9152d> it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9171q) it.next()).m29737X();
        }
        m29671k1();
        try {
            m29640f1(m29674n0());
            m29633A1(arrayList);
        } catch (Exception e2) {
            f35375g.mo32177f(m29676p0() + "recover() Start services exception ", e2);
        }
        f35375g.mo32179h(m29676p0() + "recover() We are back!");
    }

    /* renamed from: D1 */
    public boolean m29644D1(long j2) {
        return this.f35389s.m29611F(j2);
    }

    /* renamed from: E0 */
    public MulticastSocket m29645E0() {
        return this.f35380j;
    }

    /* renamed from: E1 */
    public boolean m29646E1(long j2) {
        return this.f35389s.m29612G(j2);
    }

    /* renamed from: F0 */
    public int m29647F0() {
        return this.f35391u;
    }

    /* renamed from: G0 */
    void m29648G0(C9157c c9157c, InetAddress inetAddress, int i2) throws IOException {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + ".handle query: " + c9157c);
        }
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis() + 120;
        Iterator<AbstractC9162h> it = c9157c.m29485b().iterator();
        while (it.hasNext()) {
            z |= it.next().mo29535F(this, currentTimeMillis);
        }
        m29655N0();
        try {
            C9157c c9157c2 = this.f35395y;
            if (c9157c2 != null) {
                c9157c2.m29475y(c9157c);
            } else {
                C9157c clone = c9157c.clone();
                if (c9157c.m29501r()) {
                    this.f35395y = clone;
                }
                mo29592m(clone, inetAddress, i2);
            }
            m29657Q0();
            long currentTimeMillis2 = System.currentTimeMillis();
            Iterator<? extends AbstractC9162h> it2 = c9157c.m29486c().iterator();
            while (it2.hasNext()) {
                m29650J0(it2.next(), currentTimeMillis2);
            }
            if (z) {
                mo29590k();
            }
        } catch (Throwable th) {
            m29657Q0();
            throw th;
        }
    }

    /* renamed from: I */
    public void m29649I(InterfaceC9158d interfaceC9158d, C9161g c9161g) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f35381k.add(interfaceC9158d);
        if (c9161g != null) {
            for (AbstractC9156b abstractC9156b : m29663Z().m29441f(c9161g.m29447c().toLowerCase())) {
                if (c9161g.m29526A(abstractC9156b) && !abstractC9156b.mo29454j(currentTimeMillis)) {
                    interfaceC9158d.mo29483b(m29663Z(), currentTimeMillis, abstractC9156b);
                }
            }
        }
    }

    /* renamed from: J0 */
    void m29650J0(AbstractC9162h abstractC9162h, long j2) {
        h hVar = h.Noop;
        boolean mo29454j = abstractC9162h.mo29454j(j2);
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + " handle response: " + abstractC9162h);
        }
        if (!abstractC9162h.m29459o() && !abstractC9162h.m29453i()) {
            boolean m29460p = abstractC9162h.m29460p();
            AbstractC9162h abstractC9162h2 = (AbstractC9162h) m29663Z().m29440e(abstractC9162h);
            if (f35375g.mo32173b()) {
                f35375g.mo32174c(m29676p0() + " handle response cached record: " + abstractC9162h2);
            }
            if (m29460p) {
                for (AbstractC9156b abstractC9156b : m29663Z().m29441f(abstractC9162h.m29446b())) {
                    if (abstractC9162h.m29450f().equals(abstractC9156b.m29450f()) && abstractC9162h.m29449e().equals(abstractC9156b.m29449e()) && abstractC9156b != abstractC9162h2) {
                        ((AbstractC9162h) abstractC9156b).m29545P(j2);
                    }
                }
            }
            if (abstractC9162h2 != null) {
                if (mo29454j) {
                    if (abstractC9162h.m29534E() == 0) {
                        hVar = h.Noop;
                        abstractC9162h2.m29545P(j2);
                    } else {
                        hVar = h.Remove;
                        m29663Z().m29443i(abstractC9162h2);
                    }
                } else if (abstractC9162h.mo29543N(abstractC9162h2) && (abstractC9162h.m29465u(abstractC9162h2) || abstractC9162h.m29451g().length() <= 0)) {
                    abstractC9162h2.m29541L(abstractC9162h);
                    abstractC9162h = abstractC9162h2;
                } else if (abstractC9162h.mo29538I()) {
                    hVar = h.Update;
                    m29663Z().m29444j(abstractC9162h, abstractC9162h2);
                } else {
                    hVar = h.Add;
                    m29663Z().m29437b(abstractC9162h);
                }
            } else if (!mo29454j) {
                hVar = h.Add;
                m29663Z().m29437b(abstractC9162h);
            }
        }
        if (abstractC9162h.m29450f() == EnumC9177e.TYPE_PTR) {
            if (abstractC9162h.m29459o()) {
                if (mo29454j) {
                    return;
                }
                m29675n1(((AbstractC9162h.e) abstractC9162h).m29553T());
                return;
            } else if ((m29675n1(abstractC9162h.m29447c()) | false) && hVar == h.Noop) {
                hVar = h.RegisterServiceType;
            }
        }
        if (hVar != h.Noop) {
            m29642C1(j2, abstractC9162h, hVar);
        }
    }

    /* renamed from: K */
    public void m29651K(AbstractC9180a abstractC9180a, EnumC9179g enumC9179g) {
        this.f35389s.m29614b(abstractC9180a, enumC9179g);
    }

    /* renamed from: K0 */
    void m29652K0(C9157c c9157c) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        for (AbstractC9162h abstractC9162h : m29635H(c9157c.m29485b())) {
            m29650J0(abstractC9162h, currentTimeMillis);
            if (EnumC9177e.TYPE_A.equals(abstractC9162h.m29450f()) || EnumC9177e.TYPE_AAAA.equals(abstractC9162h.m29450f())) {
                z |= abstractC9162h.mo29536G(this);
            } else {
                z2 |= abstractC9162h.mo29536G(this);
            }
        }
        if (z || z2) {
            mo29590k();
        }
    }

    /* renamed from: M0 */
    void m29653M0(AbstractC9151c abstractC9151c) {
        ArrayList arrayList;
        List<C9167m.a> list = this.f35382l.get(abstractC9151c.mo29414g().toLowerCase());
        if (list == null || list.isEmpty() || abstractC9151c.mo29412e() == null || !abstractC9151c.mo29412e().mo29431u()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f35393w.submit(new a((C9167m.a) it.next(), abstractC9151c));
        }
    }

    /* renamed from: N */
    public boolean m29654N() {
        return this.f35389s.m29615c();
    }

    /* renamed from: N0 */
    public void m29655N0() {
        this.f35394x.lock();
    }

    /* renamed from: Q */
    public void m29656Q() {
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (AbstractC9156b abstractC9156b : m29663Z().m29438c()) {
            try {
                AbstractC9162h abstractC9162h = (AbstractC9162h) abstractC9156b;
                if (abstractC9162h.mo29454j(currentTimeMillis)) {
                    m29642C1(currentTimeMillis, abstractC9162h, h.Remove);
                    m29663Z().m29443i(abstractC9162h);
                } else if (abstractC9162h.m29540K(currentTimeMillis)) {
                    abstractC9162h.m29537H();
                    String lowerCase = abstractC9162h.m29532C().mo29429s().toLowerCase();
                    if (hashSet.add(lowerCase)) {
                        m29681t1(lowerCase);
                    }
                }
            } catch (Exception e2) {
                f35375g.mo32177f(m29676p0() + ".Error while reaping records: " + abstractC9156b, e2);
                f35375g.mo32179h(toString());
            }
        }
    }

    /* renamed from: Q0 */
    public void m29657Q0() {
        this.f35394x.unlock();
    }

    /* renamed from: R0 */
    public boolean m29658R0() {
        return this.f35389s.m29626s();
    }

    /* renamed from: T0 */
    public boolean m29659T0(AbstractC9180a abstractC9180a, EnumC9179g enumC9179g) {
        return this.f35389s.m29627t(abstractC9180a, enumC9179g);
    }

    /* renamed from: V0 */
    public boolean m29660V0() {
        return this.f35389s.m29628u();
    }

    /* renamed from: W */
    public boolean m29661W() {
        return this.f35389s.m29616e();
    }

    /* renamed from: X0 */
    public boolean m29662X0() {
        return this.f35389s.m29629v();
    }

    /* renamed from: Z */
    public C9155a m29663Z() {
        return this.f35384n;
    }

    /* renamed from: Z0 */
    public boolean m29664Z0() {
        return this.f35389s.m29631x();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: a */
    public void mo29584a() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29584a();
    }

    /* renamed from: a0 */
    public AbstractC9149a.a m29665a0() {
        return this.f35387q;
    }

    /* renamed from: a1 */
    public boolean m29666a1() {
        return this.f35389s.m29632y();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: b */
    public void mo29585b() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29585b();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: c */
    public void mo29586c(String str) {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29586c(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (m29664Z0()) {
            return;
        }
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("Cancelling JmDNS: " + this);
        }
        if (m29661W()) {
            f35375g.mo32174c("Canceling the timer");
            mo29587e();
            mo29403B();
            m29638Y();
            if (f35375g.mo32173b()) {
                f35375g.mo32174c("Wait for JmDNS cancel: " + this);
            }
            m29646E1(5000L);
            f35375g.mo32174c("Canceling the state timer");
            mo29585b();
            this.f35393w.shutdown();
            m29637T();
            if (this.f35388r != null) {
                Runtime.getRuntime().removeShutdownHook(this.f35388r);
            }
            InterfaceC9164j.b.m29596b().m29598a(m29667e0());
            if (f35375g.mo32173b()) {
                f35375g.mo32174c("JmDNS closed.");
            }
        }
        mo29559d(null);
    }

    @Override // p345i.p346a.p347g.InterfaceC9163i
    /* renamed from: d */
    public boolean mo29559d(AbstractC9180a abstractC9180a) {
        return this.f35389s.mo29559d(abstractC9180a);
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: e */
    public void mo29587e() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29587e();
    }

    /* renamed from: e0 */
    public C9166l m29667e0() {
        return this;
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: f */
    public void mo29588f() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29588f();
    }

    /* renamed from: f0 */
    public InetAddress m29668f0() {
        return this.f35379i;
    }

    /* renamed from: h1 */
    public void m29669h1() {
        f35375g.mo32174c(m29676p0() + "recover()");
        if (m29664Z0() || isClosed() || m29662X0() || m29660V0()) {
            return;
        }
        synchronized (this.f35378B) {
            if (m29654N()) {
                f35375g.mo32174c(m29676p0() + "recover() thread " + Thread.currentThread().getName());
                StringBuilder sb = new StringBuilder();
                sb.append(m29676p0());
                sb.append(".recover()");
                new f(sb.toString()).start();
            }
        }
    }

    /* renamed from: i0 */
    public InetAddress m29670i0() throws IOException {
        return this.f35389s.m29622o();
    }

    public boolean isClosed() {
        return this.f35389s.m29630w();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: j */
    public void mo29589j() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29589j();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: k */
    public void mo29590k() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29590k();
    }

    /* renamed from: k1 */
    public boolean m29671k1() {
        return this.f35389s.m29607B();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: l */
    public void mo29591l() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29591l();
    }

    /* renamed from: l1 */
    public void m29672l1(AbstractC9152d abstractC9152d) throws IOException {
        if (m29664Z0() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C9171q c9171q = (C9171q) abstractC9152d;
        if (c9171q.m29726K() != null) {
            if (c9171q.m29726K() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (this.f35385o.get(c9171q.m29727L()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        c9171q.m29740c0(this);
        m29675n1(c9171q.m29730O());
        c9171q.m29737X();
        c9171q.m29743g0(this.f35389s.m29624q());
        c9171q.m29720B(this.f35389s.m29620m());
        c9171q.m29721C(this.f35389s.m29621n());
        m29644D1(6000L);
        m29639c1(c9171q);
        while (this.f35385o.putIfAbsent(c9171q.m29727L(), c9171q) != null) {
            m29639c1(c9171q);
        }
        mo29590k();
        c9171q.m29744j0(6000L);
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("registerService() JmDNS registered service as " + c9171q);
        }
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: m */
    public void mo29592m(C9157c c9157c, InetAddress inetAddress, int i2) {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29592m(c9157c, inetAddress, i2);
    }

    /* renamed from: m0 */
    public long m29673m0() {
        return this.f35392v;
    }

    /* renamed from: n0 */
    public C9165k m29674n0() {
        return this.f35389s;
    }

    /* renamed from: n1 */
    public boolean m29675n1(String str) {
        boolean z;
        j jVar;
        Map<AbstractC9152d.a, String> m29714J = C9171q.m29714J(str);
        String str2 = m29714J.get(AbstractC9152d.a.Domain);
        String str3 = m29714J.get(AbstractC9152d.a.Protocol);
        String str4 = m29714J.get(AbstractC9152d.a.Application);
        String str5 = m29714J.get(AbstractC9152d.a.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? "_" + str4 + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(str3.length() > 0 ? "_" + str3 + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(str2);
        sb.append(".");
        String sb2 = sb.toString();
        String lowerCase = sb2.toLowerCase();
        if (f35375g.mo32173b()) {
            InterfaceC9699b interfaceC9699b = f35375g;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m29676p0());
            sb3.append(".registering service type: ");
            sb3.append(str);
            sb3.append(" as: ");
            sb3.append(sb2);
            sb3.append(str5.length() > 0 ? " subtype: " + str5 : HttpUrl.FRAGMENT_ENCODE_SET);
            interfaceC9699b.mo32174c(sb3.toString());
        }
        boolean z2 = true;
        if (this.f35386p.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f35386p.putIfAbsent(lowerCase, new j(sb2)) == null;
            if (z) {
                Set<C9167m.b> set = this.f35383m;
                C9167m.b[] bVarArr = (C9167m.b[]) set.toArray(new C9167m.b[set.size()]);
                C9170p c9170p = new C9170p(this, sb2, HttpUrl.FRAGMENT_ENCODE_SET, null);
                for (C9167m.b bVar : bVarArr) {
                    this.f35393w.submit(new b(bVar, c9170p));
                }
            }
        }
        if (str5.length() <= 0 || (jVar = this.f35386p.get(lowerCase)) == null || jVar.m29692e(str5)) {
            return z;
        }
        synchronized (jVar) {
            if (jVar.m29692e(str5)) {
                z2 = z;
            } else {
                jVar.m29690b(str5);
                Set<C9167m.b> set2 = this.f35383m;
                C9167m.b[] bVarArr2 = (C9167m.b[]) set2.toArray(new C9167m.b[set2.size()]);
                C9170p c9170p2 = new C9170p(this, "_" + str5 + "._sub." + sb2, HttpUrl.FRAGMENT_ENCODE_SET, null);
                for (C9167m.b bVar2 : bVarArr2) {
                    this.f35393w.submit(new c(bVar2, c9170p2));
                }
            }
        }
        return z2;
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: p */
    public void mo29593p() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29593p();
    }

    /* renamed from: p0 */
    public String m29676p0() {
        return this.f35377A;
    }

    /* renamed from: q1 */
    public void m29677q1(AbstractC9180a abstractC9180a) {
        this.f35389s.m29608C(abstractC9180a);
    }

    /* renamed from: r1 */
    public void m29678r1(InterfaceC9158d interfaceC9158d) {
        this.f35381k.remove(interfaceC9158d);
    }

    /* renamed from: s1 */
    public void m29679s1(String str, InterfaceC9153e interfaceC9153e) {
        String lowerCase = str.toLowerCase();
        List<C9167m.a> list = this.f35382l.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C9167m.a(interfaceC9153e, false));
                if (list.isEmpty()) {
                    this.f35382l.remove(lowerCase, list);
                }
            }
        }
    }

    /* renamed from: t0 */
    C9171q m29680t0(String str, String str2, String str3, boolean z) {
        C9171q c9171q;
        C9171q c9171q2;
        String str4;
        AbstractC9152d mo29533D;
        AbstractC9152d mo29533D2;
        AbstractC9152d mo29533D3;
        AbstractC9152d mo29533D4;
        C9171q c9171q3 = new C9171q(str, str2, str3, 0, 0, 0, z, null);
        C9155a m29663Z = m29663Z();
        EnumC9176d enumC9176d = EnumC9176d.CLASS_ANY;
        AbstractC9156b m29440e = m29663Z.m29440e(new AbstractC9162h.e(str, enumC9176d, false, 0, c9171q3.mo29425o()));
        if (!(m29440e instanceof AbstractC9162h) || (c9171q = (C9171q) ((AbstractC9162h) m29440e).mo29533D(z)) == null) {
            return c9171q3;
        }
        Map<AbstractC9152d.a, String> m29729N = c9171q.m29729N();
        byte[] bArr = null;
        AbstractC9156b m29439d = m29663Z().m29439d(c9171q3.mo29425o(), EnumC9177e.TYPE_SRV, enumC9176d);
        if (!(m29439d instanceof AbstractC9162h) || (mo29533D4 = ((AbstractC9162h) m29439d).mo29533D(z)) == null) {
            c9171q2 = c9171q;
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            c9171q2 = new C9171q(m29729N, mo29533D4.mo29422l(), mo29533D4.mo29430t(), mo29533D4.mo29423m(), z, (byte[]) null);
            bArr = mo29533D4.mo29428r();
            str4 = mo29533D4.mo29426p();
        }
        Iterator<? extends AbstractC9156b> it = m29663Z().m29442h(str4, EnumC9177e.TYPE_A, enumC9176d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC9156b next = it.next();
            if ((next instanceof AbstractC9162h) && (mo29533D3 = ((AbstractC9162h) next).mo29533D(z)) != null) {
                for (Inet4Address inet4Address : mo29533D3.mo29418h()) {
                    c9171q2.m29720B(inet4Address);
                }
                c9171q2.m29719A(mo29533D3.mo29428r());
            }
        }
        for (AbstractC9156b abstractC9156b : m29663Z().m29442h(str4, EnumC9177e.TYPE_AAAA, EnumC9176d.CLASS_ANY)) {
            if ((abstractC9156b instanceof AbstractC9162h) && (mo29533D2 = ((AbstractC9162h) abstractC9156b).mo29533D(z)) != null) {
                for (Inet6Address inet6Address : mo29533D2.mo29419i()) {
                    c9171q2.m29721C(inet6Address);
                }
                c9171q2.m29719A(mo29533D2.mo29428r());
            }
        }
        AbstractC9156b m29439d2 = m29663Z().m29439d(c9171q2.mo29425o(), EnumC9177e.TYPE_TXT, EnumC9176d.CLASS_ANY);
        if ((m29439d2 instanceof AbstractC9162h) && (mo29533D = ((AbstractC9162h) m29439d2).mo29533D(z)) != null) {
            c9171q2.m29719A(mo29533D.mo29428r());
        }
        if (c9171q2.mo29428r().length == 0) {
            c9171q2.m29719A(bArr);
        }
        return c9171q2.mo29431u() ? c9171q2 : c9171q3;
    }

    /* renamed from: t1 */
    public void m29681t1(String str) {
        if (this.f35396z.containsKey(str.toLowerCase())) {
            mo29586c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [i.a.g.l$j, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    public String toString() {
        StringBuilder sb = new StringBuilder(RecyclerView.AbstractC0599l.FLAG_MOVED);
        sb.append("\n");
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this.f35389s);
        sb.append("\n\t---- Services -----");
        for (String str : this.f35385o.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f35385o.get(str));
        }
        sb.append("\n");
        sb.append("\t---- Types ----");
        Iterator<String> it = this.f35386p.keySet().iterator();
        while (it.hasNext()) {
            j jVar = this.f35386p.get(it.next());
            sb.append("\n\t\tType: ");
            sb.append(jVar.m29693f());
            sb.append(": ");
            if (jVar.isEmpty()) {
                jVar = "no subtypes";
            }
            sb.append(jVar);
        }
        sb.append("\n");
        sb.append(this.f35384n.toString());
        sb.append("\n");
        sb.append("\t---- Service Collectors ----");
        for (String str2 : this.f35396z.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(this.f35396z.get(str2));
        }
        sb.append("\n");
        sb.append("\t---- Service Listeners ----");
        for (String str3 : this.f35382l.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this.f35382l.get(str3));
        }
        return sb.toString();
    }

    /* renamed from: u1 */
    C9171q m29682u1(String str, String str2, String str3, boolean z) {
        m29656Q();
        String lowerCase = str.toLowerCase();
        m29675n1(str);
        if (this.f35396z.putIfAbsent(lowerCase, new i(str)) == null) {
            m29636J(lowerCase, this.f35396z.get(lowerCase), true);
        }
        C9171q m29680t0 = m29680t0(str, str2, str3, z);
        mo29595y(m29680t0);
        return m29680t0;
    }

    /* renamed from: v1 */
    public void m29683v1(C9157c c9157c) {
        m29655N0();
        try {
            if (this.f35395y == c9157c) {
                this.f35395y = null;
            }
        } finally {
            m29657Q0();
        }
    }

    /* renamed from: w1 */
    public boolean m29684w1() {
        return this.f35389s.m29609D();
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: x */
    public void mo29594x() {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29594x();
    }

    /* renamed from: x0 */
    public Map<String, j> m29685x0() {
        return this.f35386p;
    }

    /* renamed from: x1 */
    public void m29686x1(C9160f c9160f) throws IOException {
        InetAddress inetAddress;
        int i2;
        if (c9160f.m29497n()) {
            return;
        }
        if (c9160f.m29510D() != null) {
            inetAddress = c9160f.m29510D().getAddress();
            i2 = c9160f.m29510D().getPort();
        } else {
            inetAddress = this.f35379i;
            i2 = C9173a.f35467a;
        }
        byte[] m29509C = c9160f.m29509C();
        DatagramPacket datagramPacket = new DatagramPacket(m29509C, m29509C.length, inetAddress, i2);
        if (f35375g.mo32175d()) {
            try {
                C9157c c9157c = new C9157c(datagramPacket);
                if (f35375g.mo32175d()) {
                    f35375g.mo32180i("send(" + m29676p0() + ") JmDNS out:" + c9157c.m29474C(true));
                }
            } catch (IOException e2) {
                f35375g.mo32172a(C9166l.class.toString(), "send(" + m29676p0() + ") - JmDNS can not parse what it sends!!!", e2);
            }
        }
        MulticastSocket multicastSocket = this.f35380j;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // p345i.p346a.p347g.InterfaceC9164j
    /* renamed from: y */
    public void mo29595y(C9171q c9171q) {
        InterfaceC9164j.b.m29596b().m29599c(m29667e0()).mo29595y(c9171q);
    }

    /* renamed from: y0 */
    public Map<String, AbstractC9152d> m29687y0() {
        return this.f35385o;
    }

    /* renamed from: y1 */
    public void m29688y1(long j2) {
        this.f35392v = j2;
    }

    @Override // p345i.p346a.AbstractC9149a
    /* renamed from: z */
    public void mo29404z(String str, InterfaceC9153e interfaceC9153e) {
        m29636J(str, interfaceC9153e, false);
    }

    /* renamed from: z1 */
    public void m29689z1(int i2) {
        this.f35391u = i2;
    }
}
