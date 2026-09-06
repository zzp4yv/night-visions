package p353j;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.C10768m;
import kotlin.jvm.internal.C9768m;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import p353j.p354g0.C9673a;

/* compiled from: Buffer.kt */
/* renamed from: j.f */
/* loaded from: classes3.dex */
public final class C9670f implements InterfaceC9676h, InterfaceC9672g, Cloneable, ByteChannel {

    /* renamed from: f */
    public C9693y f37038f;

    /* renamed from: g */
    private long f37039g;

    /* compiled from: Buffer.kt */
    /* renamed from: j.f$a */
    public static final class a implements Closeable {

        /* renamed from: f */
        public C9670f f37040f;

        /* renamed from: g */
        public boolean f37041g;

        /* renamed from: h */
        private C9693y f37042h;

        /* renamed from: j */
        public byte[] f37044j;

        /* renamed from: i */
        public long f37043i = -1;

        /* renamed from: k */
        public int f37045k = -1;

        /* renamed from: l */
        public int f37046l = -1;

        /* renamed from: a */
        public final C9693y m32063a() {
            return this.f37042h;
        }

        /* renamed from: b */
        public final int m32064b() {
            long j2 = this.f37043i;
            C9670f c9670f = this.f37040f;
            C9768m.m32343c(c9670f);
            if (!(j2 != c9670f.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j3 = this.f37043i;
            return m32066d(j3 == -1 ? 0L : j3 + (this.f37046l - this.f37045k));
        }

        /* renamed from: c */
        public final long m32065c(long j2) {
            C9670f c9670f = this.f37040f;
            if (c9670f == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f37041g) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = c9670f.size();
            int i2 = 1;
            if (j2 <= size) {
                if (!(j2 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                }
                long j3 = size - j2;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    C9693y c9693y = c9670f.f37038f;
                    C9768m.m32343c(c9693y);
                    C9693y c9693y2 = c9693y.f37097h;
                    C9768m.m32343c(c9693y2);
                    int i3 = c9693y2.f37093d;
                    long j4 = i3 - c9693y2.f37092c;
                    if (j4 > j3) {
                        c9693y2.f37093d = i3 - ((int) j3);
                        break;
                    }
                    c9670f.f37038f = c9693y2.m32162b();
                    C9694z.m32169b(c9693y2);
                    j3 -= j4;
                }
                m32067e(null);
                this.f37043i = j2;
                this.f37044j = null;
                this.f37045k = -1;
                this.f37046l = -1;
            } else if (j2 > size) {
                long j5 = j2 - size;
                boolean z = true;
                while (j5 > 0) {
                    C9693y m32054q0 = c9670f.m32054q0(i2);
                    int min = (int) Math.min(j5, 8192 - m32054q0.f37093d);
                    m32054q0.f37093d += min;
                    j5 -= min;
                    if (z) {
                        m32067e(m32054q0);
                        this.f37043i = size;
                        this.f37044j = m32054q0.f37091b;
                        int i4 = m32054q0.f37093d;
                        this.f37045k = i4 - min;
                        this.f37046l = i4;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            c9670f.m32038f0(j2);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f37040f != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f37040f = null;
            m32067e(null);
            this.f37043i = -1L;
            this.f37044j = null;
            this.f37045k = -1;
            this.f37046l = -1;
        }

        /* renamed from: d */
        public final int m32066d(long j2) {
            C9693y c9693y;
            C9670f c9670f = this.f37040f;
            if (c9670f == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 < -1 || j2 > c9670f.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + c9670f.size());
            }
            if (j2 == -1 || j2 == c9670f.size()) {
                m32067e(null);
                this.f37043i = j2;
                this.f37044j = null;
                this.f37045k = -1;
                this.f37046l = -1;
                return -1;
            }
            long j3 = 0;
            long size = c9670f.size();
            C9693y c9693y2 = c9670f.f37038f;
            if (m32063a() != null) {
                long j4 = this.f37043i;
                int i2 = this.f37045k;
                C9768m.m32343c(m32063a());
                long j5 = j4 - (i2 - r12.f37092c);
                if (j5 > j2) {
                    c9693y2 = m32063a();
                    size = j5;
                    c9693y = c9693y2;
                } else {
                    c9693y = m32063a();
                    j3 = j5;
                }
            } else {
                c9693y = c9693y2;
            }
            if (size - j2 > j2 - j3) {
                while (true) {
                    C9768m.m32343c(c9693y);
                    int i3 = c9693y.f37093d;
                    int i4 = c9693y.f37092c;
                    if (j2 < (i3 - i4) + j3) {
                        break;
                    }
                    j3 += i3 - i4;
                    c9693y = c9693y.f37096g;
                }
            } else {
                while (size > j2) {
                    C9768m.m32343c(c9693y2);
                    c9693y2 = c9693y2.f37097h;
                    C9768m.m32343c(c9693y2);
                    size -= c9693y2.f37093d - c9693y2.f37092c;
                }
                j3 = size;
                c9693y = c9693y2;
            }
            if (this.f37041g) {
                C9768m.m32343c(c9693y);
                if (c9693y.f37094e) {
                    C9693y m32166f = c9693y.m32166f();
                    if (c9670f.f37038f == c9693y) {
                        c9670f.f37038f = m32166f;
                    }
                    c9693y = c9693y.m32163c(m32166f);
                    C9693y c9693y3 = c9693y.f37097h;
                    C9768m.m32343c(c9693y3);
                    c9693y3.m32162b();
                }
            }
            m32067e(c9693y);
            this.f37043i = j2;
            C9768m.m32343c(c9693y);
            this.f37044j = c9693y.f37091b;
            int i5 = c9693y.f37092c + ((int) (j2 - j3));
            this.f37045k = i5;
            int i6 = c9693y.f37093d;
            this.f37046l = i6;
            return i6 - i5;
        }

        /* renamed from: e */
        public final void m32067e(C9693y c9693y) {
            this.f37042h = c9693y;
        }
    }

    /* compiled from: Buffer.kt */
    /* renamed from: j.f$c */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C9670f.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            C9670f.this.writeByte(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            C9768m.m32346f(bArr, "data");
            C9670f.this.write(bArr, i2, i3);
        }
    }

    /* renamed from: J */
    public static /* synthetic */ a m31995J(C9670f c9670f, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = new a();
        }
        return c9670f.m32008I(aVar);
    }

    /* renamed from: A */
    public long m31996A(C9677i c9677i, long j2) throws IOException {
        long j3 = j2;
        C9768m.m32346f(c9677i, "bytes");
        if (!(c9677i.m32093P() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        C9693y c9693y = this.f37038f;
        if (c9693y != null) {
            if (size() - j3 < j3) {
                long size = size();
                while (size > j3) {
                    c9693y = c9693y.f37097h;
                    C9768m.m32343c(c9693y);
                    size -= c9693y.f37093d - c9693y.f37092c;
                }
                byte[] mo31968G = c9677i.mo31968G();
                byte b2 = mo31968G[0];
                int m32093P = c9677i.m32093P();
                long size2 = (size() - m32093P) + 1;
                while (size < size2) {
                    byte[] bArr = c9693y.f37091b;
                    long j5 = size;
                    int min = (int) Math.min(c9693y.f37093d, (c9693y.f37092c + size2) - size);
                    for (int i2 = (int) ((c9693y.f37092c + j3) - j5); i2 < min; i2++) {
                        if (bArr[i2] == b2 && C9673a.m32072c(c9693y, i2 + 1, mo31968G, 1, m32093P)) {
                            return (i2 - c9693y.f37092c) + j5;
                        }
                    }
                    j3 = j5 + (c9693y.f37093d - c9693y.f37092c);
                    c9693y = c9693y.f37096g;
                    C9768m.m32343c(c9693y);
                    size = j3;
                }
            } else {
                while (true) {
                    long j6 = (c9693y.f37093d - c9693y.f37092c) + j4;
                    if (j6 > j3) {
                        break;
                    }
                    c9693y = c9693y.f37096g;
                    C9768m.m32343c(c9693y);
                    j4 = j6;
                }
                byte[] mo31968G2 = c9677i.mo31968G();
                byte b3 = mo31968G2[0];
                int m32093P2 = c9677i.m32093P();
                long size3 = (size() - m32093P2) + 1;
                while (j4 < size3) {
                    byte[] bArr2 = c9693y.f37091b;
                    long j7 = size3;
                    int min2 = (int) Math.min(c9693y.f37093d, (c9693y.f37092c + size3) - j4);
                    for (int i3 = (int) ((c9693y.f37092c + j3) - j4); i3 < min2; i3++) {
                        if (bArr2[i3] == b3 && C9673a.m32072c(c9693y, i3 + 1, mo31968G2, 1, m32093P2)) {
                            return (i3 - c9693y.f37092c) + j4;
                        }
                    }
                    j4 += c9693y.f37093d - c9693y.f37092c;
                    c9693y = c9693y.f37096g;
                    C9768m.m32343c(c9693y);
                    j3 = j4;
                    size3 = j7;
                }
            }
        }
        return -1L;
    }

    /* renamed from: B */
    public long m31998B(C9677i c9677i, long j2) {
        int i2;
        int i3;
        C9768m.m32346f(c9677i, "targetBytes");
        long j3 = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        C9693y c9693y = this.f37038f;
        if (c9693y == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            j3 = size();
            while (j3 > j2) {
                c9693y = c9693y.f37097h;
                C9768m.m32343c(c9693y);
                j3 -= c9693y.f37093d - c9693y.f37092c;
            }
            if (c9677i.m32093P() == 2) {
                byte m32097x = c9677i.m32097x(0);
                byte m32097x2 = c9677i.m32097x(1);
                while (j3 < size()) {
                    byte[] bArr = c9693y.f37091b;
                    i2 = (int) ((c9693y.f37092c + j2) - j3);
                    int i4 = c9693y.f37093d;
                    while (i2 < i4) {
                        byte b2 = bArr[i2];
                        if (b2 != m32097x && b2 != m32097x2) {
                            i2++;
                        }
                        i3 = c9693y.f37092c;
                    }
                    j3 += c9693y.f37093d - c9693y.f37092c;
                    c9693y = c9693y.f37096g;
                    C9768m.m32343c(c9693y);
                    j2 = j3;
                }
                return -1L;
            }
            byte[] mo31968G = c9677i.mo31968G();
            while (j3 < size()) {
                byte[] bArr2 = c9693y.f37091b;
                i2 = (int) ((c9693y.f37092c + j2) - j3);
                int i5 = c9693y.f37093d;
                while (i2 < i5) {
                    byte b3 = bArr2[i2];
                    for (byte b4 : mo31968G) {
                        if (b3 == b4) {
                            i3 = c9693y.f37092c;
                        }
                    }
                    i2++;
                }
                j3 += c9693y.f37093d - c9693y.f37092c;
                c9693y = c9693y.f37096g;
                C9768m.m32343c(c9693y);
                j2 = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (c9693y.f37093d - c9693y.f37092c) + j3;
            if (j4 > j2) {
                break;
            }
            c9693y = c9693y.f37096g;
            C9768m.m32343c(c9693y);
            j3 = j4;
        }
        if (c9677i.m32093P() == 2) {
            byte m32097x3 = c9677i.m32097x(0);
            byte m32097x4 = c9677i.m32097x(1);
            while (j3 < size()) {
                byte[] bArr3 = c9693y.f37091b;
                i2 = (int) ((c9693y.f37092c + j2) - j3);
                int i6 = c9693y.f37093d;
                while (i2 < i6) {
                    byte b5 = bArr3[i2];
                    if (b5 != m32097x3 && b5 != m32097x4) {
                        i2++;
                    }
                    i3 = c9693y.f37092c;
                }
                j3 += c9693y.f37093d - c9693y.f37092c;
                c9693y = c9693y.f37096g;
                C9768m.m32343c(c9693y);
                j2 = j3;
            }
            return -1L;
        }
        byte[] mo31968G2 = c9677i.mo31968G();
        while (j3 < size()) {
            byte[] bArr4 = c9693y.f37091b;
            i2 = (int) ((c9693y.f37092c + j2) - j3);
            int i7 = c9693y.f37093d;
            while (i2 < i7) {
                byte b6 = bArr4[i2];
                for (byte b7 : mo31968G2) {
                    if (b6 == b7) {
                        i3 = c9693y.f37092c;
                    }
                }
                i2++;
            }
            j3 += c9693y.f37093d - c9693y.f37092c;
            c9693y = c9693y.f37096g;
            C9768m.m32343c(c9693y);
            j2 = j3;
        }
        return -1L;
        return (i2 - i3) + j3;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: B0 */
    public long mo31999B0(InterfaceC9667d0 interfaceC9667d0) throws IOException {
        C9768m.m32346f(interfaceC9667d0, "source");
        long j2 = 0;
        while (true) {
            long read = interfaceC9667d0.read(this, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    /* renamed from: D */
    public OutputStream m32002D() {
        return new c();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: D0 */
    public C9677i mo32003D0() {
        return mo32058u(size());
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C9670f write(byte[] bArr, int i2, int i3) {
        C9768m.m32346f(bArr, "source");
        long j2 = i3;
        C9664c.m31982b(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            C9693y m32054q0 = m32054q0(1);
            int min = Math.min(i4 - i2, 8192 - m32054q0.f37093d);
            int i5 = i2 + min;
            C10768m.m38703d(bArr, m32054q0.f37091b, m32054q0.f37093d, i2, i5);
            m32054q0.f37093d += min;
            i2 = i5;
        }
        m32038f0(size() + j2);
        return this;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public C9670f writeByte(int i2) {
        C9693y m32054q0 = m32054q0(1);
        byte[] bArr = m32054q0.f37091b;
        int i3 = m32054q0.f37093d;
        m32054q0.f37093d = i3 + 1;
        bArr[i3] = (byte) i2;
        m32038f0(size() + 1);
        return this;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C9670f mo32043i1(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return mo32055r0("-9223372036854775808");
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C9693y m32054q0 = m32054q0(i2);
        byte[] bArr = m32054q0.f37091b;
        int i3 = m32054q0.f37093d + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = C9673a.m32071b()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        m32054q0.f37093d += i2;
        m32038f0(size() + i2);
        return this;
    }

    /* renamed from: H */
    public boolean m32007H(long j2, C9677i c9677i, int i2, int i3) {
        C9768m.m32346f(c9677i, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || size() - j2 < i3 || c9677i.m32093P() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (m32047m(i4 + j2) != c9677i.m32097x(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public final a m32008I(a aVar) {
        C9768m.m32346f(aVar, "unsafeCursor");
        return C9673a.m32070a(this, aVar);
    }

    /* renamed from: K */
    public int m32009K() throws EOFException {
        return C9664c.m31983c(readInt());
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public C9670f mo32001C0(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        C9693y m32054q0 = m32054q0(i2);
        byte[] bArr = m32054q0.f37091b;
        int i3 = m32054q0.f37093d;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = C9673a.m32071b()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        m32054q0.f37093d += i2;
        m32038f0(size() + i2);
        return this;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: L0 */
    public String mo32011L0() throws EOFException {
        return mo32040g0(Long.MAX_VALUE);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: M */
    public byte[] mo32012M() {
        return mo32015O0(size());
    }

    /* renamed from: N */
    public short m32013N() throws EOFException {
        return C9664c.m31984d(readShort());
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public C9670f writeInt(int i2) {
        C9693y m32054q0 = m32054q0(4);
        byte[] bArr = m32054q0.f37091b;
        int i3 = m32054q0.f37093d;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        m32054q0.f37093d = i6 + 1;
        m32038f0(size() + 4);
        return this;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: O0 */
    public byte[] mo32015O0(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: P */
    public long mo32016P(C9677i c9677i) throws IOException {
        C9768m.m32346f(c9677i, "bytes");
        return m31996A(c9677i, 0L);
    }

    /* renamed from: Q */
    public String m32017Q(long j2, Charset charset) throws EOFException {
        C9768m.m32346f(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f37039g < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C9693y c9693y = this.f37038f;
        C9768m.m32343c(c9693y);
        int i2 = c9693y.f37092c;
        if (i2 + j2 > c9693y.f37093d) {
            return new String(mo32015O0(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(c9693y.f37091b, i2, i3, charset);
        int i4 = c9693y.f37092c + i3;
        c9693y.f37092c = i4;
        this.f37039g -= j2;
        if (i4 == c9693y.f37093d) {
            this.f37038f = c9693y.m32162b();
            C9694z.m32169b(c9693y);
        }
        return str;
    }

    /* renamed from: Q0 */
    public C9670f m32018Q0(long j2) {
        C9693y m32054q0 = m32054q0(8);
        byte[] bArr = m32054q0.f37091b;
        int i2 = m32054q0.f37093d;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        m32054q0.f37093d = i9 + 1;
        m32038f0(size() + 8);
        return this;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: R */
    public boolean mo32019R() {
        return this.f37039g == 0;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public C9670f writeShort(int i2) {
        C9693y m32054q0 = m32054q0(2);
        byte[] bArr = m32054q0.f37091b;
        int i3 = m32054q0.f37093d;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        m32054q0.f37093d = i4 + 1;
        m32038f0(size() + 2);
        return this;
    }

    /* renamed from: T */
    public String m32021T() {
        return m32017Q(this.f37039g, Charsets.f40651b);
    }

    /* renamed from: T0 */
    public C9670f m32022T0(String str, int i2, int i3, Charset charset) {
        C9768m.m32346f(str, "string");
        C9768m.m32346f(charset, "charset");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        if (C9768m.m32341a(charset, Charsets.f40651b)) {
            return mo31997A0(str, i2, i3);
        }
        String substring = str.substring(i2, i3);
        C9768m.m32345e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = substring.getBytes(charset);
        C9768m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    /* renamed from: V0 */
    public C9670f m32024V0(String str, Charset charset) {
        C9768m.m32346f(str, "string");
        C9768m.m32346f(charset, "charset");
        return m32022T0(str, 0, str.length(), charset);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: X */
    public void mo32025X(C9670f c9670f, long j2) throws EOFException {
        C9768m.m32346f(c9670f, "sink");
        if (size() >= j2) {
            c9670f.write(this, j2);
        } else {
            c9670f.write(this, size());
            throw new EOFException();
        }
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: Y0 */
    public long mo32026Y0(InterfaceC9663b0 interfaceC9663b0) throws IOException {
        C9768m.m32346f(interfaceC9663b0, "sink");
        long size = size();
        if (size > 0) {
            interfaceC9663b0.write(this, size);
        }
        return size;
    }

    /* renamed from: Z */
    public String m32027Z(long j2) throws EOFException {
        return m32017Q(j2, Charsets.f40651b);
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C9670f mo32055r0(String str) {
        C9768m.m32346f(str, "string");
        return mo31997A0(str, 0, str.length());
    }

    /* renamed from: a0 */
    public int m32029a0() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (size() == 0) {
            throw new EOFException();
        }
        byte m32047m = m32047m(0L);
        if ((m32047m & 128) == 0) {
            i2 = m32047m & Byte.MAX_VALUE;
            i3 = 1;
            i4 = 0;
        } else if ((m32047m & 224) == 192) {
            i2 = m32047m & 31;
            i3 = 2;
            i4 = 128;
        } else if ((m32047m & 240) == 224) {
            i2 = m32047m & 15;
            i3 = 3;
            i4 = RecyclerView.AbstractC0599l.FLAG_MOVED;
        } else {
            if ((m32047m & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i2 = m32047m & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (size() < j2) {
            throw new EOFException("size < " + i3 + ": " + size() + " (to read code point prefixed 0x" + C9664c.m31985e(m32047m) + ')');
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte m32047m2 = m32047m(j3);
            if ((m32047m2 & 192) != 128) {
                skip(j3);
                return 65533;
            }
            i2 = (i2 << 6) | (m32047m2 & 63);
        }
        skip(j2);
        if (i2 > 1114111) {
            return 65533;
        }
        if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
            return 65533;
        }
        return i2;
    }

    /* renamed from: b */
    public final void m32030b() {
        skip(size());
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: b0 */
    public long mo32031b0(C9677i c9677i) {
        C9768m.m32346f(c9677i, "targetBytes");
        return m31998B(c9677i, 0L);
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C9670f mo31997A0(String str, int i2, int i3) {
        C9768m.m32346f(str, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                C9693y m32054q0 = m32054q0(1);
                byte[] bArr = m32054q0.f37091b;
                int i4 = m32054q0.f37093d - i2;
                int min = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) charAt;
                while (i5 < min) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) charAt2;
                    i5++;
                }
                int i6 = m32054q0.f37093d;
                int i7 = (i4 + i5) - i6;
                m32054q0.f37093d = i6 + i7;
                m32038f0(size() + i7);
                i2 = i5;
            } else {
                if (charAt < 2048) {
                    C9693y m32054q02 = m32054q0(2);
                    byte[] bArr2 = m32054q02.f37091b;
                    int i8 = m32054q02.f37093d;
                    bArr2[i8] = (byte) ((charAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                    m32054q02.f37093d = i8 + 2;
                    m32038f0(size() + 2);
                } else if (charAt < 55296 || charAt > 57343) {
                    C9693y m32054q03 = m32054q0(3);
                    byte[] bArr3 = m32054q03.f37091b;
                    int i9 = m32054q03.f37093d;
                    bArr3[i9] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt & '?') | 128);
                    m32054q03.f37093d = i9 + 3;
                    m32038f0(size() + 3);
                } else {
                    int i10 = i2 + 1;
                    char charAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        writeByte(63);
                        i2 = i10;
                    } else {
                        int i11 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C9693y m32054q04 = m32054q0(4);
                        byte[] bArr4 = m32054q04.f37091b;
                        int i12 = m32054q04.f37093d;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        m32054q04.f37093d = i12 + 4;
                        m32038f0(size() + 4);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
        return this;
    }

    @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C9670f clone() {
        return m32037f();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[EDGE_INSN: B:48:0x00c4->B:42:0x00c4 BREAK  A[LOOP:0: B:4:0x0011->B:47:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    @Override // p353j.InterfaceC9676h
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo32035d0() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.C9670f.mo32035d0():long");
    }

    /* renamed from: e */
    public final long m32036e() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C9693y c9693y = this.f37038f;
        C9768m.m32343c(c9693y);
        C9693y c9693y2 = c9693y.f37097h;
        C9768m.m32343c(c9693y2);
        if (c9693y2.f37093d < 8192 && c9693y2.f37095f) {
            size -= r3 - c9693y2.f37092c;
        }
        return size;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9670f)) {
                return false;
            }
            C9670f c9670f = (C9670f) obj;
            if (size() != c9670f.size()) {
                return false;
            }
            if (size() != 0) {
                C9693y c9693y = this.f37038f;
                C9768m.m32343c(c9693y);
                C9693y c9693y2 = c9670f.f37038f;
                C9768m.m32343c(c9693y2);
                int i2 = c9693y.f37092c;
                int i3 = c9693y2.f37092c;
                long j2 = 0;
                while (j2 < size()) {
                    long min = Math.min(c9693y.f37093d - i2, c9693y2.f37093d - i3);
                    long j3 = 0;
                    while (j3 < min) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (c9693y.f37091b[i2] != c9693y2.f37091b[i3]) {
                            return false;
                        }
                        j3++;
                        i2 = i4;
                        i3 = i5;
                    }
                    if (i2 == c9693y.f37093d) {
                        c9693y = c9693y.f37096g;
                        C9768m.m32343c(c9693y);
                        i2 = c9693y.f37092c;
                    }
                    if (i3 == c9693y2.f37093d) {
                        c9693y2 = c9693y2.f37096g;
                        C9768m.m32343c(c9693y2);
                        i3 = c9693y2.f37092c;
                    }
                    j2 += min;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C9670f m32037f() {
        C9670f c9670f = new C9670f();
        if (size() != 0) {
            C9693y c9693y = this.f37038f;
            C9768m.m32343c(c9693y);
            C9693y m32164d = c9693y.m32164d();
            c9670f.f37038f = m32164d;
            m32164d.f37097h = m32164d;
            m32164d.f37096g = m32164d;
            for (C9693y c9693y2 = c9693y.f37096g; c9693y2 != c9693y; c9693y2 = c9693y2.f37096g) {
                C9693y c9693y3 = m32164d.f37097h;
                C9768m.m32343c(c9693y3);
                C9768m.m32343c(c9693y2);
                c9693y3.m32163c(c9693y2.m32164d());
            }
            c9670f.m32038f0(size());
        }
        return c9670f;
    }

    /* renamed from: f0 */
    public final void m32038f0(long j2) {
        this.f37039g = j2;
    }

    /* renamed from: f1 */
    public C9670f m32039f1(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            C9693y m32054q0 = m32054q0(2);
            byte[] bArr = m32054q0.f37091b;
            int i3 = m32054q0.f37093d;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            m32054q0.f37093d = i3 + 2;
            m32038f0(size() + 2);
        } else if (55296 <= i2 && 57343 >= i2) {
            writeByte(63);
        } else if (i2 < 65536) {
            C9693y m32054q02 = m32054q0(3);
            byte[] bArr2 = m32054q02.f37091b;
            int i4 = m32054q02.f37093d;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            m32054q02.f37093d = i4 + 3;
            m32038f0(size() + 3);
        } else {
            if (i2 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C9664c.m31986f(i2));
            }
            C9693y m32054q03 = m32054q0(4);
            byte[] bArr3 = m32054q03.f37091b;
            int i5 = m32054q03.f37093d;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            m32054q03.f37093d = i5 + 4;
            m32038f0(size() + 4);
        }
        return this;
    }

    @Override // p353j.InterfaceC9672g, p353j.InterfaceC9663b0, java.io.Flushable
    public void flush() {
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: g0 */
    public String mo32040g0(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        byte b2 = (byte) 10;
        long m32052p = m32052p(b2, 0L, j3);
        if (m32052p != -1) {
            return C9673a.m32073d(this, m32052p);
        }
        if (j3 < size() && m32047m(j3 - 1) == ((byte) 13) && m32047m(j3) == b2) {
            return C9673a.m32073d(this, j3);
        }
        C9670f c9670f = new C9670f();
        m32044j(c9670f, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + c9670f.mo32003D0().mo31967F() + (char) 8230);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: g1 */
    public void mo32041g1(long j2) throws EOFException {
        if (this.f37039g < j2) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        C9693y c9693y = this.f37038f;
        if (c9693y == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = c9693y.f37093d;
            for (int i4 = c9693y.f37092c; i4 < i3; i4++) {
                i2 = (i2 * 31) + c9693y.f37091b[i4];
            }
            c9693y = c9693y.f37096g;
            C9768m.m32343c(c9693y);
        } while (c9693y != this.f37038f);
        return i2;
    }

    @Override // p353j.InterfaceC9676h, p353j.InterfaceC9672g
    /* renamed from: i */
    public C9670f mo32042i() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final C9670f m32044j(C9670f c9670f, long j2, long j3) {
        C9768m.m32346f(c9670f, "out");
        C9664c.m31982b(size(), j2, j3);
        if (j3 != 0) {
            c9670f.m32038f0(c9670f.size() + j3);
            C9693y c9693y = this.f37038f;
            while (true) {
                C9768m.m32343c(c9693y);
                int i2 = c9693y.f37093d;
                int i3 = c9693y.f37092c;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                c9693y = c9693y.f37096g;
            }
            while (j3 > 0) {
                C9768m.m32343c(c9693y);
                C9693y m32164d = c9693y.m32164d();
                int i4 = m32164d.f37092c + ((int) j2);
                m32164d.f37092c = i4;
                m32164d.f37093d = Math.min(i4 + ((int) j3), m32164d.f37093d);
                C9693y c9693y2 = c9670f.f37038f;
                if (c9693y2 == null) {
                    m32164d.f37097h = m32164d;
                    m32164d.f37096g = m32164d;
                    c9670f.f37038f = m32164d;
                } else {
                    C9768m.m32343c(c9693y2);
                    C9693y c9693y3 = c9693y2.f37097h;
                    C9768m.m32343c(c9693y3);
                    c9693y3.m32163c(m32164d);
                }
                j3 -= m32164d.f37093d - m32164d.f37092c;
                c9693y = c9693y.f37096g;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C9670f mo32000C() {
        return this;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C9670f mo32032c0() {
        return this;
    }

    /* renamed from: m */
    public final byte m32047m(long j2) {
        C9664c.m31982b(size(), j2, 1L);
        C9693y c9693y = this.f37038f;
        if (c9693y == null) {
            C9768m.m32343c(null);
            throw null;
        }
        if (size() - j2 < j2) {
            long size = size();
            while (size > j2) {
                c9693y = c9693y.f37097h;
                C9768m.m32343c(c9693y);
                size -= c9693y.f37093d - c9693y.f37092c;
            }
            C9768m.m32343c(c9693y);
            return c9693y.f37091b[(int) ((c9693y.f37092c + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (c9693y.f37093d - c9693y.f37092c) + j3;
            if (j4 > j2) {
                C9768m.m32343c(c9693y);
                return c9693y.f37091b[(int) ((c9693y.f37092c + j2) - j3)];
            }
            c9693y = c9693y.f37096g;
            C9768m.m32343c(c9693y);
            j3 = j4;
        }
    }

    /* renamed from: m0 */
    public final C9677i m32048m0() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return m32050n0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:36:0x00ae BREAK  A[LOOP:0: B:4:0x000d->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // p353j.InterfaceC9676h
    /* renamed from: m1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo32049m1() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            j.y r6 = r15.f37038f
            kotlin.jvm.internal.C9768m.m32343c(r6)
            byte[] r7 = r6.f37091b
            int r8 = r6.f37092c
            int r9 = r6.f37093d
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            j.f r0 = new j.f
            r0.<init>()
            j.f r0 = r0.mo32001C0(r4)
            j.f r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m32021T()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p353j.C9664c.m31985e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            j.y r7 = r6.m32162b()
            r15.f37038f = r7
            p353j.C9694z.m32169b(r6)
            goto La8
        La6:
            r6.f37092c = r8
        La8:
            if (r1 != 0) goto Lae
            j.y r6 = r15.f37038f
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.m32038f0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            goto Lbf
        Lbe:
            throw r0
        Lbf:
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.C9670f.mo32049m1():long");
    }

    /* renamed from: n0 */
    public final C9677i m32050n0(int i2) {
        if (i2 == 0) {
            return C9677i.f37051f;
        }
        C9664c.m31982b(size(), 0L, i2);
        C9693y c9693y = this.f37038f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            C9768m.m32343c(c9693y);
            int i6 = c9693y.f37093d;
            int i7 = c9693y.f37092c;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            c9693y = c9693y.f37096g;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        C9693y c9693y2 = this.f37038f;
        int i8 = 0;
        while (i3 < i2) {
            C9768m.m32343c(c9693y2);
            bArr[i8] = c9693y2.f37091b;
            i3 += c9693y2.f37093d - c9693y2.f37092c;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = c9693y2.f37092c;
            c9693y2.f37094e = true;
            i8++;
            c9693y2 = c9693y2.f37096g;
        }
        return new C9661a0(bArr, iArr);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: o1 */
    public InputStream mo32051o1() {
        return new b();
    }

    /* renamed from: p */
    public long m32052p(byte b2, long j2, long j3) {
        C9693y c9693y;
        int i2;
        long j4 = 0;
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > size()) {
            j3 = size();
        }
        if (j2 == j3 || (c9693y = this.f37038f) == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            j4 = size();
            while (j4 > j2) {
                c9693y = c9693y.f37097h;
                C9768m.m32343c(c9693y);
                j4 -= c9693y.f37093d - c9693y.f37092c;
            }
            while (j4 < j3) {
                byte[] bArr = c9693y.f37091b;
                int min = (int) Math.min(c9693y.f37093d, (c9693y.f37092c + j3) - j4);
                i2 = (int) ((c9693y.f37092c + j2) - j4);
                while (i2 < min) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                j4 += c9693y.f37093d - c9693y.f37092c;
                c9693y = c9693y.f37096g;
                C9768m.m32343c(c9693y);
                j2 = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (c9693y.f37093d - c9693y.f37092c) + j4;
            if (j5 > j2) {
                break;
            }
            c9693y = c9693y.f37096g;
            C9768m.m32343c(c9693y);
            j4 = j5;
        }
        while (j4 < j3) {
            byte[] bArr2 = c9693y.f37091b;
            int min2 = (int) Math.min(c9693y.f37093d, (c9693y.f37092c + j3) - j4);
            i2 = (int) ((c9693y.f37092c + j2) - j4);
            while (i2 < min2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            j4 += c9693y.f37093d - c9693y.f37092c;
            c9693y = c9693y.f37096g;
            C9768m.m32343c(c9693y);
            j2 = j4;
        }
        return -1L;
        return (i2 - c9693y.f37092c) + j4;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: p1 */
    public int mo32053p1(C9688t c9688t) {
        C9768m.m32346f(c9688t, "options");
        int m32075f = C9673a.m32075f(this, c9688t, false, 2, null);
        if (m32075f == -1) {
            return -1;
        }
        skip(c9688t.m32146i()[m32075f].m32093P());
        return m32075f;
    }

    @Override // p353j.InterfaceC9676h
    public InterfaceC9676h peek() {
        return C9685q.m32120d(new C9690v(this));
    }

    /* renamed from: q0 */
    public final C9693y m32054q0(int i2) {
        if (!(i2 >= 1 && i2 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C9693y c9693y = this.f37038f;
        if (c9693y != null) {
            C9768m.m32343c(c9693y);
            C9693y c9693y2 = c9693y.f37097h;
            C9768m.m32343c(c9693y2);
            return (c9693y2.f37093d + i2 > 8192 || !c9693y2.f37095f) ? c9693y2.m32163c(C9694z.m32170c()) : c9693y2;
        }
        C9693y m32170c = C9694z.m32170c();
        this.f37038f = m32170c;
        m32170c.f37097h = m32170c;
        m32170c.f37096g = m32170c;
        return m32170c;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C9768m.m32346f(byteBuffer, "sink");
        C9693y c9693y = this.f37038f;
        if (c9693y == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c9693y.f37093d - c9693y.f37092c);
        byteBuffer.put(c9693y.f37091b, c9693y.f37092c, min);
        int i2 = c9693y.f37092c + min;
        c9693y.f37092c = i2;
        this.f37039g -= min;
        if (i2 == c9693y.f37093d) {
            this.f37038f = c9693y.m32162b();
            C9694z.m32169b(c9693y);
        }
        return min;
    }

    @Override // p353j.InterfaceC9676h
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        C9693y c9693y = this.f37038f;
        C9768m.m32343c(c9693y);
        int i2 = c9693y.f37092c;
        int i3 = c9693y.f37093d;
        int i4 = i2 + 1;
        byte b2 = c9693y.f37091b[i2];
        m32038f0(size() - 1);
        if (i4 == i3) {
            this.f37038f = c9693y.m32162b();
            C9694z.m32169b(c9693y);
        } else {
            c9693y.f37092c = i4;
        }
        return b2;
    }

    @Override // p353j.InterfaceC9676h
    public void readFully(byte[] bArr) throws EOFException {
        C9768m.m32346f(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    @Override // p353j.InterfaceC9676h
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        C9693y c9693y = this.f37038f;
        C9768m.m32343c(c9693y);
        int i2 = c9693y.f37092c;
        int i3 = c9693y.f37093d;
        if (i3 - i2 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c9693y.f37091b;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        m32038f0(size() - 4);
        if (i9 == i3) {
            this.f37038f = c9693y.m32162b();
            C9694z.m32169b(c9693y);
        } else {
            c9693y.f37092c = i9;
        }
        return i10;
    }

    @Override // p353j.InterfaceC9676h
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        C9693y c9693y = this.f37038f;
        C9768m.m32343c(c9693y);
        int i2 = c9693y.f37092c;
        int i3 = c9693y.f37093d;
        if (i3 - i2 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = c9693y.f37091b;
        long j2 = (bArr[i2] & 255) << 56;
        long j3 = j2 | ((bArr[r6] & 255) << 48);
        long j4 = j3 | ((bArr[r1] & 255) << 40);
        int i4 = i2 + 1 + 1 + 1 + 1;
        long j5 = ((bArr[r6] & 255) << 32) | j4;
        long j6 = j5 | ((bArr[i4] & 255) << 24);
        long j7 = j6 | ((bArr[r8] & 255) << 16);
        long j8 = j7 | ((bArr[r1] & 255) << 8);
        int i5 = i4 + 1 + 1 + 1 + 1;
        long j9 = j8 | (bArr[r8] & 255);
        m32038f0(size() - 8);
        if (i5 == i3) {
            this.f37038f = c9693y.m32162b();
            C9694z.m32169b(c9693y);
        } else {
            c9693y.f37092c = i5;
        }
        return j9;
    }

    @Override // p353j.InterfaceC9676h
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        C9693y c9693y = this.f37038f;
        C9768m.m32343c(c9693y);
        int i2 = c9693y.f37092c;
        int i3 = c9693y.f37093d;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c9693y.f37091b;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        m32038f0(size() - 2);
        if (i5 == i3) {
            this.f37038f = c9693y.m32162b();
            C9694z.m32169b(c9693y);
        } else {
            c9693y.f37092c = i5;
        }
        return (short) i6;
    }

    @Override // p353j.InterfaceC9676h
    public boolean request(long j2) {
        return this.f37039g >= j2;
    }

    public final long size() {
        return this.f37039g;
    }

    @Override // p353j.InterfaceC9676h
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            C9693y c9693y = this.f37038f;
            if (c9693y == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, c9693y.f37093d - c9693y.f37092c);
            long j3 = min;
            m32038f0(size() - j3);
            j2 -= j3;
            int i2 = c9693y.f37092c + min;
            c9693y.f37092c = i2;
            if (i2 == c9693y.f37093d) {
                this.f37038f = c9693y.m32162b();
                C9694z.m32169b(c9693y);
            }
        }
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: t */
    public C9670f mo32056t() {
        return this;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C9670f mo32023U0(C9677i c9677i) {
        C9768m.m32346f(c9677i, "byteString");
        c9677i.mo31973T(this, 0, c9677i.m32093P());
        return this;
    }

    @Override // p353j.InterfaceC9667d0
    public C9669e0 timeout() {
        return C9669e0.NONE;
    }

    public String toString() {
        return m32048m0().toString();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: u */
    public C9677i mo32058u(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        if (j2 < RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) {
            return new C9677i(mo32015O0(j2));
        }
        C9677i m32050n0 = m32050n0((int) j2);
        skip(j2);
        return m32050n0;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: v0 */
    public boolean mo32059v0(long j2, C9677i c9677i) {
        C9768m.m32346f(c9677i, "bytes");
        return m32007H(j2, c9677i, 0, c9677i.m32093P());
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: w0 */
    public String mo32060w0(Charset charset) {
        C9768m.m32346f(charset, "charset");
        return m32017Q(this.f37039g, charset);
    }

    /* renamed from: x0 */
    public C9670f m32061x0(InterfaceC9667d0 interfaceC9667d0, long j2) throws IOException {
        C9768m.m32346f(interfaceC9667d0, "source");
        while (j2 > 0) {
            long read = interfaceC9667d0.read(this, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return this;
    }

    @Override // p353j.InterfaceC9672g
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C9670f write(byte[] bArr) {
        C9768m.m32346f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* compiled from: Buffer.kt */
    /* renamed from: j.f$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C9670f.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C9670f.this.size() > 0) {
                return C9670f.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C9670f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            C9768m.m32346f(bArr, "sink");
            return C9670f.this.read(bArr, i2, i3);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        C9768m.m32346f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            C9693y m32054q0 = m32054q0(1);
            int min = Math.min(i2, 8192 - m32054q0.f37093d);
            byteBuffer.get(m32054q0.f37091b, m32054q0.f37093d, min);
            i2 -= min;
            m32054q0.f37093d += min;
        }
        this.f37039g += remaining;
        return remaining;
    }

    public int read(byte[] bArr, int i2, int i3) {
        C9768m.m32346f(bArr, "sink");
        C9664c.m31982b(bArr.length, i2, i3);
        C9693y c9693y = this.f37038f;
        if (c9693y == null) {
            return -1;
        }
        int min = Math.min(i3, c9693y.f37093d - c9693y.f37092c);
        byte[] bArr2 = c9693y.f37091b;
        int i4 = c9693y.f37092c;
        C10768m.m38703d(bArr2, bArr, i2, i4, i4 + min);
        c9693y.f37092c += min;
        m32038f0(size() - min);
        if (c9693y.f37092c != c9693y.f37093d) {
            return min;
        }
        this.f37038f = c9693y.m32162b();
        C9694z.m32169b(c9693y);
        return min;
    }

    @Override // p353j.InterfaceC9663b0
    public void write(C9670f c9670f, long j2) {
        C9693y c9693y;
        C9768m.m32346f(c9670f, "source");
        if (c9670f != this) {
            C9664c.m31982b(c9670f.size(), 0L, j2);
            while (j2 > 0) {
                C9693y c9693y2 = c9670f.f37038f;
                C9768m.m32343c(c9693y2);
                int i2 = c9693y2.f37093d;
                C9768m.m32343c(c9670f.f37038f);
                if (j2 < i2 - r2.f37092c) {
                    C9693y c9693y3 = this.f37038f;
                    if (c9693y3 != null) {
                        C9768m.m32343c(c9693y3);
                        c9693y = c9693y3.f37097h;
                    } else {
                        c9693y = null;
                    }
                    if (c9693y != null && c9693y.f37095f) {
                        if ((c9693y.f37093d + j2) - (c9693y.f37094e ? 0 : c9693y.f37092c) <= 8192) {
                            C9693y c9693y4 = c9670f.f37038f;
                            C9768m.m32343c(c9693y4);
                            c9693y4.m32167g(c9693y, (int) j2);
                            c9670f.m32038f0(c9670f.size() - j2);
                            m32038f0(size() + j2);
                            return;
                        }
                    }
                    C9693y c9693y5 = c9670f.f37038f;
                    C9768m.m32343c(c9693y5);
                    c9670f.f37038f = c9693y5.m32165e((int) j2);
                }
                C9693y c9693y6 = c9670f.f37038f;
                C9768m.m32343c(c9693y6);
                long j3 = c9693y6.f37093d - c9693y6.f37092c;
                c9670f.f37038f = c9693y6.m32162b();
                C9693y c9693y7 = this.f37038f;
                if (c9693y7 == null) {
                    this.f37038f = c9693y6;
                    c9693y6.f37097h = c9693y6;
                    c9693y6.f37096g = c9693y6;
                } else {
                    C9768m.m32343c(c9693y7);
                    C9693y c9693y8 = c9693y7.f37097h;
                    C9768m.m32343c(c9693y8);
                    c9693y8.m32163c(c9693y6).m32161a();
                }
                c9670f.m32038f0(c9670f.size() - j3);
                m32038f0(size() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // p353j.InterfaceC9667d0
    public long read(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j2 > size()) {
            j2 = size();
        }
        c9670f.write(this, j2);
        return j2;
    }
}
