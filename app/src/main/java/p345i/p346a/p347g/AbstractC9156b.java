package p345i.p346a.p347g;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9152d;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;

/* compiled from: DNSEntry.java */
/* renamed from: i.a.g.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9156b {

    /* renamed from: a */
    private final String f35297a;

    /* renamed from: b */
    private final String f35298b;

    /* renamed from: c */
    private final String f35299c;

    /* renamed from: d */
    private final EnumC9177e f35300d;

    /* renamed from: e */
    private final EnumC9176d f35301e;

    /* renamed from: f */
    private final boolean f35302f;

    /* renamed from: g */
    final Map<AbstractC9152d.a, String> f35303g;

    AbstractC9156b(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d, boolean z) {
        String str2;
        String str3;
        this.f35298b = str;
        this.f35300d = enumC9177e;
        this.f35301e = enumC9176d;
        this.f35302f = z;
        Map<AbstractC9152d.a, String> m29714J = C9171q.m29714J(m29447c());
        this.f35303g = m29714J;
        String str4 = m29714J.get(AbstractC9152d.a.Domain);
        String str5 = m29714J.get(AbstractC9152d.a.Protocol);
        String str6 = m29714J.get(AbstractC9152d.a.Application);
        String lowerCase = m29714J.get(AbstractC9152d.a.Instance).toLowerCase();
        StringBuilder sb = new StringBuilder();
        int length = str6.length();
        String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str2 = "_" + str6 + ".";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (str5.length() > 0) {
            str3 = "_" + str5 + ".";
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(str4);
        sb.append(".");
        String sb2 = sb.toString();
        this.f35299c = sb2;
        StringBuilder sb3 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb3.append(str7);
        sb3.append(sb2);
        this.f35297a = sb3.toString().toLowerCase();
    }

    /* renamed from: a */
    public int m29445a(AbstractC9156b abstractC9156b) {
        byte[] m29467w = m29467w();
        byte[] m29467w2 = abstractC9156b.m29467w();
        int min = Math.min(m29467w.length, m29467w2.length);
        for (int i2 = 0; i2 < min; i2++) {
            if (m29467w[i2] > m29467w2[i2]) {
                return 1;
            }
            if (m29467w[i2] < m29467w2[i2]) {
                return -1;
            }
        }
        return m29467w.length - m29467w2.length;
    }

    /* renamed from: b */
    public String m29446b() {
        String str = this.f35297a;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: c */
    public String m29447c() {
        String str = this.f35298b;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: d */
    public Map<AbstractC9152d.a, String> m29448d() {
        return Collections.unmodifiableMap(this.f35303g);
    }

    /* renamed from: e */
    public EnumC9176d m29449e() {
        EnumC9176d enumC9176d = this.f35301e;
        return enumC9176d != null ? enumC9176d : EnumC9176d.CLASS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC9156b)) {
            return false;
        }
        AbstractC9156b abstractC9156b = (AbstractC9156b) obj;
        return m29446b().equals(abstractC9156b.m29446b()) && m29450f().equals(abstractC9156b.m29450f()) && m29449e() == abstractC9156b.m29449e();
    }

    /* renamed from: f */
    public EnumC9177e m29450f() {
        EnumC9177e enumC9177e = this.f35300d;
        return enumC9177e != null ? enumC9177e : EnumC9177e.TYPE_IGNORE;
    }

    /* renamed from: g */
    public String m29451g() {
        String str = m29448d().get(AbstractC9152d.a.Subtype);
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: h */
    public String m29452h() {
        String str = this.f35299c;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public int hashCode() {
        return m29446b().hashCode() + m29450f().m29755g() + m29449e().m29752k();
    }

    /* renamed from: i */
    public boolean m29453i() {
        if (!this.f35303g.get(AbstractC9152d.a.Application).equals("dns-sd")) {
            return false;
        }
        String str = this.f35303g.get(AbstractC9152d.a.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* renamed from: j */
    public abstract boolean mo29454j(long j2);

    /* renamed from: k */
    public boolean m29455k() {
        return m29461q() || m29462r();
    }

    /* renamed from: l */
    public boolean mo29456l(AbstractC9156b abstractC9156b) {
        return m29446b().equals(abstractC9156b.m29446b()) && m29464t(abstractC9156b.m29450f()) && m29463s(abstractC9156b.m29449e());
    }

    /* renamed from: m */
    public boolean m29457m(AbstractC9156b abstractC9156b) {
        return abstractC9156b != null && abstractC9156b.m29449e() == m29449e();
    }

    /* renamed from: n */
    public boolean mo29458n(AbstractC9156b abstractC9156b) {
        return abstractC9156b != null && abstractC9156b.m29450f() == m29450f();
    }

    /* renamed from: o */
    public boolean m29459o() {
        return this.f35303g.get(AbstractC9152d.a.Application).equals("dns-sd") && this.f35303g.get(AbstractC9152d.a.Instance).equals("_services");
    }

    /* renamed from: p */
    public boolean m29460p() {
        return this.f35302f;
    }

    /* renamed from: q */
    public boolean m29461q() {
        return this.f35303g.get(AbstractC9152d.a.Domain).endsWith("in-addr.arpa");
    }

    /* renamed from: r */
    public boolean m29462r() {
        return this.f35303g.get(AbstractC9152d.a.Domain).endsWith("ip6.arpa");
    }

    /* renamed from: s */
    public boolean m29463s(EnumC9176d enumC9176d) {
        EnumC9176d enumC9176d2 = EnumC9176d.CLASS_ANY;
        return enumC9176d2 == enumC9176d || enumC9176d2 == m29449e() || m29449e().equals(enumC9176d);
    }

    /* renamed from: t */
    public boolean m29464t(EnumC9177e enumC9177e) {
        return m29450f().equals(enumC9177e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(m29450f());
        sb.append(sb2.toString());
        sb.append(", class: " + m29449e());
        sb.append(this.f35302f ? "-unique," : ",");
        sb.append(" name: " + this.f35298b);
        mo29468x(sb);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m29465u(AbstractC9156b abstractC9156b) {
        return m29451g().equals(abstractC9156b.m29451g());
    }

    /* renamed from: v */
    protected void mo29466v(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(m29447c().getBytes("UTF8"));
        dataOutputStream.writeShort(m29450f().m29755g());
        dataOutputStream.writeShort(m29449e().m29752k());
    }

    /* renamed from: w */
    protected byte[] m29467w() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo29466v(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* renamed from: x */
    protected void mo29468x(StringBuilder sb) {
    }
}
