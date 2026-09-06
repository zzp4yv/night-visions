package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.C10768m;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import p353j.p354g0.C9674b;

/* compiled from: ByteString.kt */
/* renamed from: j.i */
/* loaded from: classes3.dex */
public class C9677i implements Serializable, Comparable<C9677i> {

    /* renamed from: h */
    private transient int f37053h;

    /* renamed from: i */
    private transient String f37054i;

    /* renamed from: j */
    private final byte[] f37055j;

    /* renamed from: g */
    public static final a f37052g = new a(null);

    /* renamed from: f */
    public static final C9677i f37051f = new C9677i(new byte[0]);

    /* compiled from: ByteString.kt */
    /* renamed from: j.i$a */
    public static final class a {
        private a() {
        }

        /* renamed from: f */
        public static /* synthetic */ C9677i m32099f(a aVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return aVar.m32104e(bArr, i2, i3);
        }

        /* renamed from: a */
        public final C9677i m32100a(String str) {
            C9768m.m32346f(str, "$this$decodeBase64");
            byte[] m31962a = C9660a.m31962a(str);
            if (m31962a != null) {
                return new C9677i(m31962a);
            }
            return null;
        }

        /* renamed from: b */
        public final C9677i m32101b(String str) {
            int m32080e;
            int m32080e2;
            C9768m.m32346f(str, "$this$decodeHex");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                m32080e = C9674b.m32080e(str.charAt(i3));
                m32080e2 = C9674b.m32080e(str.charAt(i3 + 1));
                bArr[i2] = (byte) ((m32080e << 4) + m32080e2);
            }
            return new C9677i(bArr);
        }

        /* renamed from: c */
        public final C9677i m32102c(String str, Charset charset) {
            C9768m.m32346f(str, "$this$encode");
            C9768m.m32346f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new C9677i(bytes);
        }

        /* renamed from: d */
        public final C9677i m32103d(String str) {
            C9768m.m32346f(str, "$this$encodeUtf8");
            C9677i c9677i = new C9677i(C9662b.m31979a(str));
            c9677i.m32090M(str);
            return c9677i;
        }

        /* renamed from: e */
        public final C9677i m32104e(byte[] bArr, int i2, int i3) {
            byte[] m38707h;
            C9768m.m32346f(bArr, "$this$toByteString");
            C9664c.m31982b(bArr.length, i2, i3);
            m38707h = C10768m.m38707h(bArr, i2, i3 + i2);
            return new C9677i(m38707h);
        }

        /* renamed from: g */
        public final C9677i m32105g(InputStream inputStream, int i2) throws IOException {
            C9768m.m32346f(inputStream, "$this$readByteString");
            int i3 = 0;
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
            }
            byte[] bArr = new byte[i2];
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    throw new EOFException();
                }
                i3 += read;
            }
            return new C9677i(bArr);
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public C9677i(byte[] bArr) {
        C9768m.m32346f(bArr, "data");
        this.f37055j = bArr;
    }

    /* renamed from: q */
    public static final C9677i m32084q(String str) {
        return f37052g.m32101b(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        C9677i m32105g = f37052g.m32105g(objectInputStream, objectInputStream.readInt());
        Field declaredField = C9677i.class.getDeclaredField("j");
        C9768m.m32345e(declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, m32105g.f37055j);
    }

    /* renamed from: v */
    public static final C9677i m32085v(String str) {
        return f37052g.m32103d(str);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f37055j.length);
        objectOutputStream.write(this.f37055j);
    }

    /* renamed from: A */
    public final int m32086A() {
        return this.f37053h;
    }

    /* renamed from: D */
    public int mo31966D() {
        return m32098y().length;
    }

    /* renamed from: E */
    public final String m32087E() {
        return this.f37054i;
    }

    /* renamed from: F */
    public String mo31967F() {
        char[] cArr = new char[m32098y().length * 2];
        int i2 = 0;
        for (byte b2 : m32098y()) {
            int i3 = i2 + 1;
            cArr[i2] = C9674b.m32081f()[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = C9674b.m32081f()[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: G */
    public byte[] mo31968G() {
        return m32098y();
    }

    /* renamed from: H */
    public byte mo31969H(int i2) {
        return m32098y()[i2];
    }

    /* renamed from: I */
    public final C9677i m32088I() {
        return mo31978u("MD5");
    }

    /* renamed from: J */
    public boolean mo31970J(int i2, C9677i c9677i, int i3, int i4) {
        C9768m.m32346f(c9677i, "other");
        return c9677i.mo31971K(i3, m32098y(), i2, i4);
    }

    /* renamed from: K */
    public boolean mo31971K(int i2, byte[] bArr, int i3, int i4) {
        C9768m.m32346f(bArr, "other");
        return i2 >= 0 && i2 <= m32098y().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && C9664c.m31981a(m32098y(), i2, bArr, i3, i4);
    }

    /* renamed from: L */
    public final void m32089L(int i2) {
        this.f37053h = i2;
    }

    /* renamed from: M */
    public final void m32090M(String str) {
        this.f37054i = str;
    }

    /* renamed from: N */
    public final C9677i m32091N() {
        return mo31978u("SHA-1");
    }

    /* renamed from: O */
    public final C9677i m32092O() {
        return mo31978u("SHA-256");
    }

    /* renamed from: P */
    public final int m32093P() {
        return mo31966D();
    }

    /* renamed from: Q */
    public final boolean m32094Q(C9677i c9677i) {
        C9768m.m32346f(c9677i, "prefix");
        return mo31970J(0, c9677i, 0, c9677i.m32093P());
    }

    /* renamed from: R */
    public C9677i mo31972R() {
        byte b2;
        for (int i2 = 0; i2 < m32098y().length; i2++) {
            byte b3 = m32098y()[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] m32098y = m32098y();
                byte[] copyOf = Arrays.copyOf(m32098y, m32098y.length);
                C9768m.m32345e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b5 = copyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new C9677i(copyOf);
            }
        }
        return this;
    }

    /* renamed from: S */
    public String m32095S() {
        String m32087E = m32087E();
        if (m32087E != null) {
            return m32087E;
        }
        String m31980b = C9662b.m31980b(mo31968G());
        m32090M(m31980b);
        return m31980b;
    }

    /* renamed from: T */
    public void mo31973T(C9670f c9670f, int i2, int i3) {
        C9768m.m32346f(c9670f, "buffer");
        C9674b.m32079d(this, c9670f, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9677i) {
            C9677i c9677i = (C9677i) obj;
            if (c9677i.m32093P() == m32098y().length && c9677i.mo31971K(0, m32098y(), 0, m32098y().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public String mo31977g() {
        return C9660a.m31964c(m32098y(), null, 1, null);
    }

    public int hashCode() {
        int m32086A = m32086A();
        if (m32086A != 0) {
            return m32086A;
        }
        int hashCode = Arrays.hashCode(m32098y());
        m32089L(hashCode);
        return hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(p353j.C9677i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C9768m.m32346f(r10, r0)
            int r0 = r9.m32093P()
            int r1 = r10.m32093P()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m32097x(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m32097x(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.C9677i.compareTo(j.i):int");
    }

    public String toString() {
        int m32078c;
        String m37507A;
        String m37507A2;
        String m37507A3;
        C9677i c9677i;
        byte[] m38707h;
        if (m32098y().length == 0) {
            return "[size=0]";
        }
        m32078c = C9674b.m32078c(m32098y(), 64);
        if (m32078c != -1) {
            String m32095S = m32095S();
            if (m32095S == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = m32095S.substring(0, m32078c);
            C9768m.m32345e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            m37507A = C10513u.m37507A(substring, "\\", "\\\\", false, 4, null);
            m37507A2 = C10513u.m37507A(m37507A, "\n", "\\n", false, 4, null);
            m37507A3 = C10513u.m37507A(m37507A2, "\r", "\\r", false, 4, null);
            if (m32078c >= m32095S.length()) {
                return "[text=" + m37507A3 + ']';
            }
            return "[size=" + m32098y().length + " text=" + m37507A3 + "…]";
        }
        if (m32098y().length <= 64) {
            return "[hex=" + mo31967F() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(m32098y().length);
        sb.append(" hex=");
        if (!(64 <= m32098y().length)) {
            throw new IllegalArgumentException(("endIndex > length(" + m32098y().length + ')').toString());
        }
        if (64 == m32098y().length) {
            c9677i = this;
        } else {
            m38707h = C10768m.m38707h(m32098y(), 0, 64);
            c9677i = new C9677i(m38707h);
        }
        sb.append(c9677i.mo31967F());
        sb.append("…]");
        return sb.toString();
    }

    /* renamed from: u */
    public C9677i mo31978u(String str) {
        C9768m.m32346f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f37055j, 0, m32093P());
        byte[] digest = messageDigest.digest();
        C9768m.m32345e(digest, "digestBytes");
        return new C9677i(digest);
    }

    /* renamed from: x */
    public final byte m32097x(int i2) {
        return mo31969H(i2);
    }

    /* renamed from: y */
    public final byte[] m32098y() {
        return this.f37055j;
    }
}
