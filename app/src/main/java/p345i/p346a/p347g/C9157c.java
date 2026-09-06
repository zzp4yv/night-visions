package p345i.p346a.p347g;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.p348s.C9173a;
import p345i.p346a.p347g.p348s.EnumC9174b;
import p345i.p346a.p347g.p348s.EnumC9175c;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: DNSIncoming.java */
/* renamed from: i.a.g.c */
/* loaded from: classes2.dex */
public final class C9157c extends AbstractC9159e {

    /* renamed from: h */
    private static InterfaceC9699b f35304h = C9700c.m32189i(C9157c.class.getName());

    /* renamed from: i */
    public static boolean f35305i = true;

    /* renamed from: j */
    private static final char[] f35306j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: k */
    private final DatagramPacket f35307k;

    /* renamed from: l */
    private final long f35308l;

    /* renamed from: m */
    private final b f35309m;

    /* renamed from: n */
    private int f35310n;

    /* compiled from: DNSIncoming.java */
    /* renamed from: i.a.g.c$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35311a;

        /* renamed from: b */
        static final /* synthetic */ int[] f35312b;

        /* renamed from: c */
        static final /* synthetic */ int[] f35313c;

        static {
            int[] iArr = new int[EnumC9177e.values().length];
            f35313c = iArr;
            try {
                iArr[EnumC9177e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35313c[EnumC9177e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35313c[EnumC9177e.TYPE_CNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35313c[EnumC9177e.TYPE_PTR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35313c[EnumC9177e.TYPE_TXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35313c[EnumC9177e.TYPE_SRV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35313c[EnumC9177e.TYPE_HINFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35313c[EnumC9177e.TYPE_OPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[EnumC9175c.values().length];
            f35312b = iArr2;
            try {
                iArr2[EnumC9175c.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35312b[EnumC9175c.LLQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35312b[EnumC9175c.NSID.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35312b[EnumC9175c.UL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35312b[EnumC9175c.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[EnumC9174b.values().length];
            f35311a = iArr3;
            try {
                iArr3[EnumC9174b.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35311a[EnumC9174b.Compressed.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35311a[EnumC9174b.Extended.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35311a[EnumC9174b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: DNSIncoming.java */
    /* renamed from: i.a.g.c$b */
    public static class b extends ByteArrayInputStream {

        /* renamed from: f */
        private static InterfaceC9699b f35314f = C9700c.m32189i(b.class.getName());

        /* renamed from: g */
        final Map<Integer, String> f35315g;

        public b(byte[] bArr, int i2) {
            this(bArr, 0, i2);
        }

        /* renamed from: a */
        public byte[] m29477a(int i2) {
            byte[] bArr = new byte[i2];
            read(bArr, 0, i2);
            return bArr;
        }

        /* renamed from: b */
        public String m29478b() {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (!z) {
                int m29481e = m29481e();
                if (m29481e == 0) {
                    break;
                }
                int i2 = a.f35311a[EnumC9174b.m29746k(m29481e).ordinal()];
                if (i2 == 1) {
                    int i3 = ((ByteArrayInputStream) this).pos - 1;
                    String str = m29480d(m29481e) + ".";
                    sb.append(str);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    hashMap.put(Integer.valueOf(i3), new StringBuilder(str));
                } else if (i2 == 2) {
                    int m29747q = (EnumC9174b.m29747q(m29481e) << 8) | m29481e();
                    String str2 = this.f35315g.get(Integer.valueOf(m29747q));
                    if (str2 == null) {
                        f35314f.mo32179h("bad domain name: possible circular name detected. Bad offset: 0x" + Integer.toHexString(m29747q) + " at 0x" + Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    sb.append(str2);
                    Iterator it2 = hashMap.values().iterator();
                    while (it2.hasNext()) {
                        ((StringBuilder) it2.next()).append(str2);
                    }
                    z = true;
                } else if (i2 != 3) {
                    f35314f.mo32179h("unsupported dns label type: '" + Integer.toHexString(m29481e & 192) + "'");
                } else {
                    f35314f.mo32174c("Extended label are not currently supported.");
                }
            }
            for (Integer num : hashMap.keySet()) {
                this.f35315g.put(num, ((StringBuilder) hashMap.get(num)).toString());
            }
            return sb.toString();
        }

        /* renamed from: c */
        public String m29479c() {
            return m29480d(m29481e());
        }

        /* renamed from: d */
        public String m29480d(int i2) {
            int i3;
            int m29481e;
            StringBuilder sb = new StringBuilder(i2);
            int i4 = 0;
            while (i4 < i2) {
                int m29481e2 = m29481e();
                switch (m29481e2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        i3 = (m29481e2 & 63) << 4;
                        m29481e = m29481e() & 15;
                        m29481e2 = i3 | m29481e;
                        i4++;
                        break;
                    case 12:
                    case 13:
                        i3 = (m29481e2 & 31) << 6;
                        m29481e = m29481e() & 63;
                        m29481e2 = i3 | m29481e;
                        i4++;
                        break;
                    case 14:
                        m29481e2 = ((m29481e2 & 15) << 12) | ((m29481e() & 63) << 6) | (m29481e() & 63);
                        i4++;
                        i4++;
                        break;
                }
                sb.append((char) m29481e2);
                i4++;
            }
            return sb.toString();
        }

        /* renamed from: e */
        public int m29481e() {
            return read() & 255;
        }

        /* renamed from: f */
        public int m29482f() {
            return (m29481e() << 8) | m29481e();
        }

        public int readInt() {
            return (m29482f() << 16) | m29482f();
        }

        public b(byte[] bArr, int i2, int i3) {
            super(bArr, i2, i3);
            this.f35315g = new HashMap();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9157c(DatagramPacket datagramPacket) throws IOException {
        super(0, 0, datagramPacket.getPort() == C9173a.f35467a);
        this.f35307k = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        b bVar = new b(datagramPacket.getData(), datagramPacket.getLength());
        this.f35309m = bVar;
        this.f35308l = System.currentTimeMillis();
        this.f35310n = 1460;
        try {
            m29506w(bVar.m29482f());
            m29505v(bVar.m29482f());
            if (m29494k() > 0) {
                throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
            }
            int m29482f = bVar.m29482f();
            int m29482f2 = bVar.m29482f();
            int m29482f3 = bVar.m29482f();
            int m29482f4 = bVar.m29482f();
            if (f35304h.mo32173b()) {
                f35304h.mo32174c("DNSIncoming() questions:" + m29482f + " answers:" + m29482f2 + " authorities:" + m29482f3 + " additionals:" + m29482f4);
            }
            if ((m29482f * 5) + ((m29482f2 + m29482f3 + m29482f4) * 11) > datagramPacket.getLength()) {
                throw new IOException("questions:" + m29482f + " answers:" + m29482f2 + " authorities:" + m29482f3 + " additionals:" + m29482f4);
            }
            if (m29482f > 0) {
                for (int i2 = 0; i2 < m29482f; i2++) {
                    this.f35319d.add(m29470E());
                }
            }
            if (m29482f2 > 0) {
                for (int i3 = 0; i3 < m29482f2; i3++) {
                    AbstractC9162h m29469D = m29469D(address);
                    if (m29469D != null) {
                        this.f35320e.add(m29469D);
                    }
                }
            }
            if (m29482f3 > 0) {
                for (int i4 = 0; i4 < m29482f3; i4++) {
                    AbstractC9162h m29469D2 = m29469D(address);
                    if (m29469D2 != null) {
                        this.f35321f.add(m29469D2);
                    }
                }
            }
            if (m29482f4 > 0) {
                for (int i5 = 0; i5 < m29482f4; i5++) {
                    AbstractC9162h m29469D3 = m29469D(address);
                    if (m29469D3 != null) {
                        this.f35322g.add(m29469D3);
                    }
                }
            }
            if (this.f35309m.available() > 0) {
                throw new IOException("Received a message with the wrong length.");
            }
        } catch (Exception e2) {
            f35304h.mo32177f("DNSIncoming() dump " + m29474C(true) + "\n exception ", e2);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8 A[SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p345i.p346a.p347g.AbstractC9162h m29469D(java.net.InetAddress r23) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.C9157c.m29469D(java.net.InetAddress):i.a.g.h");
    }

    /* renamed from: E */
    private C9161g m29470E() {
        String m29478b = this.f35309m.m29478b();
        EnumC9177e m29754k = EnumC9177e.m29754k(this.f35309m.m29482f());
        if (m29754k == EnumC9177e.TYPE_IGNORE) {
            f35304h.mo32179h("Could not find record type: " + m29474C(true));
        }
        int m29482f = this.f35309m.m29482f();
        EnumC9176d m29751g = EnumC9176d.m29751g(m29482f);
        return C9161g.m29525C(m29478b, m29754k, m29751g, m29751g.m29753q(m29482f));
    }

    /* renamed from: x */
    private String m29471x(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            char[] cArr = f35306j;
            sb.append(cArr[i2 / 16]);
            sb.append(cArr[i2 % 16]);
        }
        return sb.toString();
    }

    /* renamed from: A */
    public int m29472A() {
        return (int) (System.currentTimeMillis() - this.f35308l);
    }

    /* renamed from: B */
    public int m29473B() {
        return this.f35310n;
    }

    /* renamed from: C */
    String m29474C(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(m29503t());
        if (z) {
            int length = this.f35307k.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this.f35307k.getData(), 0, bArr, 0, length);
            sb.append(m29504u(bArr));
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m29499p() ? "dns[query," : "dns[response,");
        if (this.f35307k.getAddress() != null) {
            sb.append(this.f35307k.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(this.f35307k.getPort());
        sb.append(", length=");
        sb.append(this.f35307k.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(m29489f()));
        if (m29488e() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m29488e()));
            if ((m29488e() & 32768) != 0) {
                sb.append(":r");
            }
            if ((m29488e() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((m29488e() & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                sb.append(":tc");
            }
        }
        if (m29493j() > 0) {
            sb.append(", questions=");
            sb.append(m29493j());
        }
        if (m29491h() > 0) {
            sb.append(", answers=");
            sb.append(m29491h());
        }
        if (m29492i() > 0) {
            sb.append(", authorities=");
            sb.append(m29492i());
        }
        if (m29490g() > 0) {
            sb.append(", additionals=");
            sb.append(m29490g());
        }
        if (m29493j() > 0) {
            sb.append("\nquestions:");
            for (C9161g c9161g : this.f35319d) {
                sb.append("\n\t");
                sb.append(c9161g);
            }
        }
        if (m29491h() > 0) {
            sb.append("\nanswers:");
            for (AbstractC9162h abstractC9162h : this.f35320e) {
                sb.append("\n\t");
                sb.append(abstractC9162h);
            }
        }
        if (m29492i() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC9162h abstractC9162h2 : this.f35321f) {
                sb.append("\n\t");
                sb.append(abstractC9162h2);
            }
        }
        if (m29490g() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC9162h abstractC9162h3 : this.f35322g) {
                sb.append("\n\t");
                sb.append(abstractC9162h3);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: y */
    void m29475y(C9157c c9157c) {
        if (!m29499p() || !m29501r() || !c9157c.m29499p()) {
            throw new IllegalArgumentException();
        }
        this.f35319d.addAll(c9157c.m29495l());
        this.f35320e.addAll(c9157c.m29486c());
        this.f35321f.addAll(c9157c.m29487d());
        this.f35322g.addAll(c9157c.m29484a());
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C9157c clone() {
        C9157c c9157c = new C9157c(m29488e(), m29489f(), m29498o(), this.f35307k, this.f35308l);
        c9157c.f35310n = this.f35310n;
        c9157c.f35319d.addAll(this.f35319d);
        c9157c.f35320e.addAll(this.f35320e);
        c9157c.f35321f.addAll(this.f35321f);
        c9157c.f35322g.addAll(this.f35322g);
        return c9157c;
    }

    private C9157c(int i2, int i3, boolean z, DatagramPacket datagramPacket, long j2) {
        super(i2, i3, z);
        this.f35307k = datagramPacket;
        this.f35309m = new b(datagramPacket.getData(), datagramPacket.getLength());
        this.f35308l = j2;
    }
}
