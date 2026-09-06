package p345i.p346a.p347g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.p347g.AbstractC9162h;
import p345i.p346a.p347g.InterfaceC9163i;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;
import p345i.p346a.p347g.p348s.EnumC9179g;
import p345i.p346a.p347g.p349t.AbstractC9180a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: ServiceInfoImpl.java */
/* renamed from: i.a.g.q */
/* loaded from: classes2.dex */
public class C9171q extends AbstractC9152d implements InterfaceC9158d, InterfaceC9163i {

    /* renamed from: g */
    private static InterfaceC9699b f35445g = C9700c.m32189i(C9171q.class.getName());

    /* renamed from: h */
    private String f35446h;

    /* renamed from: i */
    private String f35447i;

    /* renamed from: j */
    private String f35448j;

    /* renamed from: k */
    private String f35449k;

    /* renamed from: l */
    private String f35450l;

    /* renamed from: m */
    private String f35451m;

    /* renamed from: n */
    private int f35452n;

    /* renamed from: o */
    private int f35453o;

    /* renamed from: p */
    private int f35454p;

    /* renamed from: q */
    private byte[] f35455q;

    /* renamed from: r */
    private Map<String, byte[]> f35456r;

    /* renamed from: s */
    private final Set<Inet4Address> f35457s;

    /* renamed from: t */
    private final Set<Inet6Address> f35458t;

    /* renamed from: u */
    private transient String f35459u;

    /* renamed from: v */
    private boolean f35460v;

    /* renamed from: w */
    private boolean f35461w;

    /* renamed from: x */
    private final b f35462x;

    /* compiled from: ServiceInfoImpl.java */
    /* renamed from: i.a.g.q$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35463a;

        static {
            int[] iArr = new int[EnumC9177e.values().length];
            f35463a = iArr;
            try {
                iArr[EnumC9177e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35463a[EnumC9177e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35463a[EnumC9177e.TYPE_SRV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35463a[EnumC9177e.TYPE_TXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35463a[EnumC9177e.TYPE_PTR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: ServiceInfoImpl.java */
    /* renamed from: i.a.g.q$b */
    private static final class b extends InterfaceC9163i.b {

        /* renamed from: l */
        private final C9171q f35464l;

        public b(C9171q c9171q) {
            this.f35464l = c9171q;
        }

        @Override // p345i.p346a.p347g.InterfaceC9163i.b
        /* renamed from: q */
        public void mo29579q(C9166l c9166l) {
            super.mo29579q(c9166l);
        }

        @Override // p345i.p346a.p347g.InterfaceC9163i.b
        /* renamed from: s */
        protected void mo29581s(AbstractC9180a abstractC9180a) {
            super.mo29581s(abstractC9180a);
            if (this.f35358h == null && this.f35464l.m29735U()) {
                lock();
                try {
                    if (this.f35358h == null && this.f35464l.m29735U()) {
                        if (this.f35359i.m29761k()) {
                            m29580r(EnumC9179g.f35575i);
                            if (m29567e() != null) {
                                m29567e().mo29591l();
                            }
                        }
                        this.f35464l.m29742f0(false);
                    }
                } finally {
                    unlock();
                }
            }
        }
    }

    public C9171q(String str, String str2, String str3, int i2, int i3, int i4, boolean z, byte[] bArr) {
        this(m29713I(str, str2, str3), i2, i3, i4, z, bArr);
    }

    /* renamed from: G */
    protected static Map<AbstractC9152d.a, String> m29712G(Map<AbstractC9152d.a, String> map) {
        HashMap hashMap = new HashMap(5);
        AbstractC9152d.a aVar = AbstractC9152d.a.Domain;
        String str = "local";
        String str2 = map.containsKey(aVar) ? map.get(aVar) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        hashMap.put(aVar, m29716a0(str));
        AbstractC9152d.a aVar2 = AbstractC9152d.a.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(aVar2) ? map.get(aVar2) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        hashMap.put(aVar2, m29716a0(str3));
        AbstractC9152d.a aVar3 = AbstractC9152d.a.Application;
        boolean containsKey = map.containsKey(aVar3);
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str6 = containsKey ? map.get(aVar3) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str6 == null || str6.length() == 0) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        hashMap.put(aVar3, m29716a0(str6));
        AbstractC9152d.a aVar4 = AbstractC9152d.a.Instance;
        String str7 = map.containsKey(aVar4) ? map.get(aVar4) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str7 == null || str7.length() == 0) {
            str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        hashMap.put(aVar4, m29716a0(str7));
        AbstractC9152d.a aVar5 = AbstractC9152d.a.Subtype;
        String str8 = map.containsKey(aVar5) ? map.get(aVar5) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        hashMap.put(aVar5, m29716a0(str5));
        return hashMap;
    }

    /* renamed from: I */
    public static Map<AbstractC9152d.a, String> m29713I(String str, String str2, String str3) {
        Map<AbstractC9152d.a, String> m29714J = m29714J(str);
        m29714J.put(AbstractC9152d.a.Instance, str2);
        m29714J.put(AbstractC9152d.a.Subtype, str3);
        return m29712G(m29714J);
    }

    /* renamed from: J */
    public static Map<AbstractC9152d.a, String> m29714J(String str) {
        String m29716a0;
        String substring;
        String str2;
        int indexOf;
        String substring2;
        String str3;
        String str4;
        String lowerCase = str.toLowerCase();
        boolean contains = lowerCase.contains("in-addr.arpa");
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (contains || lowerCase.contains("ip6.arpa")) {
            int indexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            m29716a0 = m29716a0(str.substring(0, indexOf2));
            substring = str.substring(indexOf2);
        } else {
            if (lowerCase.contains("_") || !lowerCase.contains(".")) {
                if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (indexOf = lowerCase.indexOf("._")) > 0) {
                    substring2 = str.substring(0, indexOf);
                    int i2 = indexOf + 1;
                    if (i2 < lowerCase.length()) {
                        str3 = lowerCase.substring(i2);
                        str = str.substring(i2);
                    } else {
                        str3 = lowerCase;
                    }
                } else {
                    str3 = lowerCase;
                    substring2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int lastIndexOf = str3.lastIndexOf("._");
                if (lastIndexOf > 0) {
                    int i3 = lastIndexOf + 2;
                    str4 = str.substring(i3, str3.indexOf(46, i3));
                } else {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (str4.length() > 0) {
                    int indexOf3 = str3.indexOf("_" + str4.toLowerCase() + ".");
                    int length = str4.length() + indexOf3 + 2;
                    int length2 = str3.length() - (str3.endsWith(".") ? 1 : 0);
                    String substring3 = length2 > length ? str.substring(length, length2) : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (indexOf3 > 0) {
                        lowerCase = str.substring(0, indexOf3 - 1);
                        substring = substring3;
                    } else {
                        substring = substring3;
                        lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                } else {
                    substring = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int indexOf4 = lowerCase.toLowerCase().indexOf("._sub");
                if (indexOf4 > 0) {
                    str5 = m29716a0(lowerCase.substring(0, indexOf4));
                    lowerCase = lowerCase.substring(indexOf4 + 5);
                }
                m29716a0 = substring2;
                String str6 = str5;
                str5 = str4;
                str2 = str6;
                HashMap hashMap = new HashMap(5);
                hashMap.put(AbstractC9152d.a.Domain, m29716a0(substring));
                hashMap.put(AbstractC9152d.a.Protocol, str5);
                hashMap.put(AbstractC9152d.a.Application, m29716a0(lowerCase));
                hashMap.put(AbstractC9152d.a.Instance, m29716a0);
                hashMap.put(AbstractC9152d.a.Subtype, str2);
                return hashMap;
            }
            int indexOf5 = lowerCase.indexOf(46);
            m29716a0 = m29716a0(str.substring(0, indexOf5));
            substring = m29716a0(str.substring(indexOf5));
        }
        lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
        str2 = lowerCase;
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put(AbstractC9152d.a.Domain, m29716a0(substring));
        hashMap2.put(AbstractC9152d.a.Protocol, str5);
        hashMap2.put(AbstractC9152d.a.Application, m29716a0(lowerCase));
        hashMap2.put(AbstractC9152d.a.Instance, m29716a0);
        hashMap2.put(AbstractC9152d.a.Subtype, str2);
        return hashMap2;
    }

    /* renamed from: P */
    private final boolean m29715P() {
        return this.f35457s.size() > 0 || this.f35458t.size() > 0;
    }

    /* renamed from: a0 */
    private static String m29716a0(String str) {
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String trim = str.trim();
        if (trim.startsWith(".")) {
            trim = trim.substring(1);
        }
        if (trim.startsWith("_")) {
            trim = trim.substring(1);
        }
        return trim.endsWith(".") ? trim.substring(0, trim.length() - 1) : trim;
    }

    /* renamed from: h0 */
    private static byte[] m29717h0(Map<String, ?> map) {
        byte[] bArr = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    m29718l0(byteArrayOutputStream2, str);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            m29718l0(byteArrayOutputStream2, (String) obj);
                        } else {
                            if (!(obj instanceof byte[])) {
                                throw new IllegalArgumentException("invalid property value: " + obj);
                            }
                            byte[] bArr2 = (byte[]) obj;
                            if (bArr2.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr2, 0, bArr2.length);
                            } else {
                                obj = null;
                            }
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (byteArray.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(str);
                        sb.append(obj != null ? HttpUrl.FRAGMENT_ENCODE_SET : "=" + obj);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray.length);
                    byteArrayOutputStream.write(byteArray, 0, byteArray.length);
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException("unexpected exception: " + e2);
            }
        }
        return (bArr == null || bArr.length <= 0) ? AbstractC9162h.f35336i : bArr;
    }

    /* renamed from: l0 */
    static void m29718l0(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= 1 && charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt > 2047) {
                outputStream.write(((charAt >> '\f') & 15) | 224);
                outputStream.write(((charAt >> 6) & 63) | 128);
                outputStream.write(((charAt >> 0) & 63) | 128);
            } else {
                outputStream.write(((charAt >> 6) & 31) | 192);
                outputStream.write(((charAt >> 0) & 63) | 128);
            }
        }
    }

    /* renamed from: A */
    void m29719A(byte[] bArr) {
        this.f35455q = bArr;
        this.f35456r = null;
    }

    /* renamed from: B */
    void m29720B(Inet4Address inet4Address) {
        this.f35457s.add(inet4Address);
    }

    /* renamed from: C */
    void m29721C(Inet6Address inet6Address) {
        this.f35458t.add(inet6Address);
    }

    /* renamed from: D */
    public Collection<AbstractC9162h> m29722D(EnumC9176d enumC9176d, boolean z, int i2, C9165k c9165k) {
        ArrayList arrayList = new ArrayList();
        if (enumC9176d == EnumC9176d.CLASS_ANY || enumC9176d == EnumC9176d.CLASS_IN) {
            if (mo29427q().length() > 0) {
                arrayList.add(new AbstractC9162h.e(m29730O(), EnumC9176d.CLASS_IN, false, i2, mo29425o()));
            }
            String mo29429s = mo29429s();
            EnumC9176d enumC9176d2 = EnumC9176d.CLASS_IN;
            arrayList.add(new AbstractC9162h.e(mo29429s, enumC9176d2, false, i2, mo29425o()));
            arrayList.add(new AbstractC9162h.f(mo29425o(), enumC9176d2, z, i2, this.f35454p, this.f35453o, this.f35452n, c9165k.m29624q()));
            arrayList.add(new AbstractC9162h.g(mo29425o(), enumC9176d2, z, i2, mo29428r()));
        }
        return arrayList;
    }

    /* renamed from: E */
    public void m29723E(AbstractC9180a abstractC9180a, EnumC9179g enumC9179g) {
        this.f35462x.m29564a(abstractC9180a, enumC9179g);
    }

    /* renamed from: F */
    public boolean m29724F() {
        return this.f35462x.m29565b();
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C9171q clone() {
        C9171q c9171q = new C9171q(m29729N(), this.f35452n, this.f35453o, this.f35454p, this.f35460v, this.f35455q);
        for (Inet6Address inet6Address : mo29419i()) {
            c9171q.f35458t.add(inet6Address);
        }
        for (Inet4Address inet4Address : mo29418h()) {
            c9171q.f35457s.add(inet4Address);
        }
        return c9171q;
    }

    /* renamed from: K */
    public C9166l m29726K() {
        return this.f35462x.m29567e();
    }

    /* renamed from: L */
    public String m29727L() {
        if (this.f35459u == null) {
            this.f35459u = mo29425o().toLowerCase();
        }
        return this.f35459u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r0.clear();
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized java.util.Map<java.lang.String, byte[]> m29728M() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9.f35456r     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L77
            byte[] r0 = r9.mo29428r()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L77
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            r1 = 0
            r2 = 0
        L12:
            byte[] r3 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r3 = r3.length     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r2 >= r3) goto L75
            byte[] r3 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r4 = r2 + 1
            r2 = r3[r2]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L69
            int r3 = r4 + r2
            byte[] r5 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r5 = r5.length     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r3 <= r5) goto L2f
            goto L69
        L2f:
            r5 = 0
        L30:
            if (r5 >= r2) goto L41
            byte[] r6 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r7 = r4 + r5
            r6 = r6[r7]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r7 = 61
            if (r6 == r7) goto L41
            int r5 = r5 + 1
            goto L30
        L41:
            byte[] r6 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            java.lang.String r6 = r9.m29736V(r6, r4, r5)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r6 != 0) goto L4f
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L75
        L4f:
            if (r5 != r2) goto L57
            byte[] r2 = p345i.p346a.AbstractC9152d.f35290f     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r0.put(r6, r2)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L67
        L57:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            byte[] r8 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r0.put(r6, r7)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
        L67:
            r2 = r3
            goto L12
        L69:
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L75
        L6d:
            r1 = move-exception
            k.b.b r2 = p345i.p346a.p347g.C9171q.f35445g     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Malformed TXT Field "
            r2.mo32177f(r3, r1)     // Catch: java.lang.Throwable -> L82
        L75:
            r9.f35456r = r0     // Catch: java.lang.Throwable -> L82
        L77:
            java.util.Map<java.lang.String, byte[]> r0 = r9.f35456r     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7c
            goto L80
        L7c:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r9)
            return r0
        L82:
            r0 = move-exception
            monitor-exit(r9)
            goto L86
        L85:
            throw r0
        L86:
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.C9171q.m29728M():java.util.Map");
    }

    /* renamed from: N */
    public Map<AbstractC9152d.a, String> m29729N() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(AbstractC9152d.a.Domain, mo29417g());
        hashMap.put(AbstractC9152d.a.Protocol, mo29424n());
        hashMap.put(AbstractC9152d.a.Application, mo29416f());
        hashMap.put(AbstractC9152d.a.Instance, mo29421k());
        hashMap.put(AbstractC9152d.a.Subtype, mo29427q());
        return hashMap;
    }

    /* renamed from: O */
    public String m29730O() {
        String str;
        String mo29427q = mo29427q();
        StringBuilder sb = new StringBuilder();
        if (mo29427q.length() > 0) {
            str = "_" + mo29427q.toLowerCase() + "._sub.";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        sb.append(mo29429s());
        return sb.toString();
    }

    /* renamed from: Q */
    public boolean m29731Q() {
        return this.f35462x.m29568f();
    }

    /* renamed from: R */
    public boolean m29732R() {
        return this.f35462x.m29569g();
    }

    /* renamed from: S */
    public boolean m29733S(AbstractC9180a abstractC9180a, EnumC9179g enumC9179g) {
        return this.f35462x.m29570h(abstractC9180a, enumC9179g);
    }

    /* renamed from: T */
    public boolean m29734T() {
        return this.f35462x.m29575m();
    }

    /* renamed from: U */
    public boolean m29735U() {
        return this.f35461w;
    }

    /* renamed from: V */
    String m29736V(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        StringBuffer stringBuffer = new StringBuffer();
        int i7 = i2 + i3;
        while (i2 < i7) {
            int i8 = i2 + 1;
            int i9 = bArr[i2] & 255;
            switch (i9 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    stringBuffer.append((char) i9);
                    i2 = i8;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i5 = i8 + 1;
                    if (i5 < i3) {
                        i4 = (i9 & 63) << 4;
                        i6 = bArr[i8] & 15;
                        break;
                    } else {
                        return null;
                    }
                case 12:
                case 13:
                    if (i8 < i3) {
                        i4 = (i9 & 31) << 6;
                        i5 = i8 + 1;
                        i6 = bArr[i8] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    if (i8 + 2 >= i3) {
                        return null;
                    }
                    int i10 = i8 + 1;
                    int i11 = ((i9 & 15) << 12) | ((bArr[i8] & 63) << 6);
                    i8 = i10 + 1;
                    i9 = i11 | (bArr[i10] & 63);
                    continue;
                    stringBuffer.append((char) i9);
                    i2 = i8;
            }
            i9 = i4 | i6;
            i8 = i5;
            stringBuffer.append((char) i9);
            i2 = i8;
        }
        return stringBuffer.toString();
    }

    /* renamed from: X */
    public boolean m29737X() {
        return this.f35462x.m29576n();
    }

    /* renamed from: Z */
    public void m29738Z(AbstractC9180a abstractC9180a) {
        this.f35462x.m29577o(abstractC9180a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p345i.p346a.p347g.InterfaceC9158d
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo29483b(p345i.p346a.p347g.C9155a r5, long r6, p345i.p346a.p347g.AbstractC9156b r8) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.C9171q.mo29483b(i.a.g.a, long, i.a.g.b):void");
    }

    /* renamed from: b0 */
    public boolean m29739b0() {
        return this.f35462x.m29578p();
    }

    /* renamed from: c0 */
    public void m29740c0(C9166l c9166l) {
        this.f35462x.mo29579q(c9166l);
    }

    @Override // p345i.p346a.p347g.InterfaceC9163i
    /* renamed from: d */
    public boolean mo29559d(AbstractC9180a abstractC9180a) {
        return this.f35462x.mo29559d(abstractC9180a);
    }

    /* renamed from: d0 */
    void m29741d0(String str) {
        this.f35449k = str;
        this.f35459u = null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9171q) && mo29425o().equals(((C9171q) obj).mo29425o());
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: f */
    public String mo29416f() {
        String str = this.f35448j;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: f0 */
    public void m29742f0(boolean z) {
        this.f35461w = z;
        if (z) {
            this.f35462x.mo29581s(null);
        }
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: g */
    public String mo29417g() {
        String str = this.f35446h;
        return str != null ? str : "local";
    }

    /* renamed from: g0 */
    void m29743g0(String str) {
        this.f35451m = str;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: h */
    public Inet4Address[] mo29418h() {
        Set<Inet4Address> set = this.f35457s;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    public int hashCode() {
        return mo29425o().hashCode();
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: i */
    public Inet6Address[] mo29419i() {
        Set<Inet6Address> set = this.f35458t;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: j */
    public InetAddress[] mo29420j() {
        ArrayList arrayList = new ArrayList(this.f35457s.size() + this.f35458t.size());
        arrayList.addAll(this.f35457s);
        arrayList.addAll(this.f35458t);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    /* renamed from: j0 */
    public boolean m29744j0(long j2) {
        return this.f35462x.m29582t(j2);
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: k */
    public String mo29421k() {
        String str = this.f35449k;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: k0 */
    public boolean m29745k0(long j2) {
        return this.f35462x.m29583u(j2);
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: l */
    public int mo29422l() {
        return this.f35452n;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: m */
    public int mo29423m() {
        return this.f35454p;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: n */
    public String mo29424n() {
        String str = this.f35447i;
        return str != null ? str : "tcp";
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: o */
    public String mo29425o() {
        String str;
        String str2;
        String mo29417g = mo29417g();
        String mo29424n = mo29424n();
        String mo29416f = mo29416f();
        String mo29421k = mo29421k();
        StringBuilder sb = new StringBuilder();
        int length = mo29421k.length();
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str = mo29421k + ".";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (mo29416f.length() > 0) {
            str2 = "_" + mo29416f + ".";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (mo29424n.length() > 0) {
            str3 = "_" + mo29424n + ".";
        }
        sb.append(str3);
        sb.append(mo29417g);
        sb.append(".");
        return sb.toString();
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: p */
    public String mo29426p() {
        String str = this.f35451m;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: q */
    public String mo29427q() {
        String str = this.f35450l;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: r */
    public byte[] mo29428r() {
        byte[] bArr = this.f35455q;
        return (bArr == null || bArr.length <= 0) ? AbstractC9162h.f35336i : bArr;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: s */
    public String mo29429s() {
        String str;
        String mo29417g = mo29417g();
        String mo29424n = mo29424n();
        String mo29416f = mo29416f();
        StringBuilder sb = new StringBuilder();
        int length = mo29416f.length();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str = "_" + mo29416f + ".";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (mo29424n.length() > 0) {
            str2 = "_" + mo29424n + ".";
        }
        sb.append(str2);
        sb.append(mo29417g);
        sb.append(".");
        return sb.toString();
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: t */
    public int mo29430t() {
        return this.f35453o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C9171q.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        int length = mo29421k().length();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb2.append(length > 0 ? mo29421k() + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(m29730O());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] mo29420j = mo29420j();
        if (mo29420j.length > 0) {
            for (InetAddress inetAddress : mo29420j) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(mo29422l());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(mo29422l());
        }
        sb.append("' status: '");
        sb.append(this.f35462x.toString());
        sb.append(mo29433w() ? "' is persistent," : "',");
        sb.append(" has ");
        if (!mo29431u()) {
            str = "NO ";
        }
        sb.append(str);
        sb.append("data");
        if (mo29428r().length > 0) {
            Map<String, byte[]> m29728M = m29728M();
            if (m29728M.isEmpty()) {
                sb.append(" empty");
            } else {
                sb.append("\n");
                for (String str2 : m29728M.keySet()) {
                    sb.append("\t" + str2 + ": " + new String(m29728M.get(str2)) + "\n");
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: u */
    public synchronized boolean mo29431u() {
        boolean z;
        if (mo29426p() != null && m29715P() && mo29428r() != null) {
            z = mo29428r().length > 0;
        }
        return z;
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: v */
    public boolean mo29432v(AbstractC9152d abstractC9152d) {
        if (abstractC9152d == null) {
            return false;
        }
        if (abstractC9152d instanceof C9171q) {
            C9171q c9171q = (C9171q) abstractC9152d;
            return this.f35457s.size() == c9171q.f35457s.size() && this.f35458t.size() == c9171q.f35458t.size() && this.f35457s.equals(c9171q.f35457s) && this.f35458t.equals(c9171q.f35458t);
        }
        InetAddress[] mo29420j = mo29420j();
        InetAddress[] mo29420j2 = abstractC9152d.mo29420j();
        return mo29420j.length == mo29420j2.length && new HashSet(Arrays.asList(mo29420j)).equals(new HashSet(Arrays.asList(mo29420j2)));
    }

    @Override // p345i.p346a.AbstractC9152d
    /* renamed from: w */
    public boolean mo29433w() {
        return this.f35460v;
    }

    public C9171q(Map<AbstractC9152d.a, String> map, int i2, int i3, int i4, boolean z, Map<String, ?> map2) {
        this(map, i2, i3, i4, z, m29717h0(map2));
    }

    C9171q(Map<AbstractC9152d.a, String> map, int i2, int i3, int i4, boolean z, String str) {
        this(map, i2, i3, i4, z, (byte[]) null);
        this.f35451m = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            m29718l0(byteArrayOutputStream, str);
            this.f35455q = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException("unexpected exception: " + e2);
        }
    }

    C9171q(Map<AbstractC9152d.a, String> map, int i2, int i3, int i4, boolean z, byte[] bArr) {
        Map<AbstractC9152d.a, String> m29712G = m29712G(map);
        this.f35446h = m29712G.get(AbstractC9152d.a.Domain);
        this.f35447i = m29712G.get(AbstractC9152d.a.Protocol);
        this.f35448j = m29712G.get(AbstractC9152d.a.Application);
        this.f35449k = m29712G.get(AbstractC9152d.a.Instance);
        this.f35450l = m29712G.get(AbstractC9152d.a.Subtype);
        this.f35452n = i2;
        this.f35453o = i3;
        this.f35454p = i4;
        this.f35455q = bArr;
        m29742f0(false);
        this.f35462x = new b(this);
        this.f35460v = z;
        this.f35457s = Collections.synchronizedSet(new LinkedHashSet());
        this.f35458t = Collections.synchronizedSet(new LinkedHashSet());
    }

    C9171q(AbstractC9152d abstractC9152d) {
        this.f35457s = Collections.synchronizedSet(new LinkedHashSet());
        this.f35458t = Collections.synchronizedSet(new LinkedHashSet());
        if (abstractC9152d != null) {
            this.f35446h = abstractC9152d.mo29417g();
            this.f35447i = abstractC9152d.mo29424n();
            this.f35448j = abstractC9152d.mo29416f();
            this.f35449k = abstractC9152d.mo29421k();
            this.f35450l = abstractC9152d.mo29427q();
            this.f35452n = abstractC9152d.mo29422l();
            this.f35453o = abstractC9152d.mo29430t();
            this.f35454p = abstractC9152d.mo29423m();
            this.f35455q = abstractC9152d.mo29428r();
            this.f35460v = abstractC9152d.mo29433w();
            for (Inet6Address inet6Address : abstractC9152d.mo29419i()) {
                this.f35458t.add(inet6Address);
            }
            for (Inet4Address inet4Address : abstractC9152d.mo29418h()) {
                this.f35457s.add(inet4Address);
            }
        }
        this.f35462x = new b(this);
    }
}
