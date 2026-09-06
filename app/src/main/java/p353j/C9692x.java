package p353j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10494b;
import p353j.p354g0.C9673a;

/* compiled from: RealBufferedSource.kt */
/* renamed from: j.x */
/* loaded from: classes3.dex */
public final class C9692x implements InterfaceC9676h {

    /* renamed from: f */
    public final C9670f f37086f;

    /* renamed from: g */
    public boolean f37087g;

    /* renamed from: h */
    public final InterfaceC9667d0 f37088h;

    public C9692x(InterfaceC9667d0 interfaceC9667d0) {
        C9768m.m32346f(interfaceC9667d0, "source");
        this.f37088h = interfaceC9667d0;
        this.f37086f = new C9670f();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: D0 */
    public C9677i mo32003D0() {
        this.f37086f.mo31999B0(this.f37088h);
        return this.f37086f.mo32003D0();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: L0 */
    public String mo32011L0() {
        return mo32040g0(Long.MAX_VALUE);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: M */
    public byte[] mo32012M() {
        this.f37086f.mo31999B0(this.f37088h);
        return this.f37086f.mo32012M();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: O0 */
    public byte[] mo32015O0(long j2) {
        mo32041g1(j2);
        return this.f37086f.mo32015O0(j2);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: P */
    public long mo32016P(C9677i c9677i) {
        C9768m.m32346f(c9677i, "bytes");
        return m32156c(c9677i, 0L);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: R */
    public boolean mo32019R() {
        if (!this.f37087g) {
            return this.f37086f.mo32019R() && this.f37088h.read(this.f37086f, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: X */
    public void mo32025X(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "sink");
        try {
            mo32041g1(j2);
            this.f37086f.mo32025X(c9670f, j2);
        } catch (EOFException e2) {
            c9670f.mo31999B0(this.f37086f);
            throw e2;
        }
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: Y0 */
    public long mo32026Y0(InterfaceC9663b0 interfaceC9663b0) {
        C9768m.m32346f(interfaceC9663b0, "sink");
        long j2 = 0;
        while (this.f37088h.read(this.f37086f, 8192) != -1) {
            long m32036e = this.f37086f.m32036e();
            if (m32036e > 0) {
                j2 += m32036e;
                interfaceC9663b0.write(this.f37086f, m32036e);
            }
        }
        if (this.f37086f.size() <= 0) {
            return j2;
        }
        long size = j2 + this.f37086f.size();
        C9670f c9670f = this.f37086f;
        interfaceC9663b0.write(c9670f, c9670f.size());
        return size;
    }

    /* renamed from: a */
    public long m32154a(byte b2) {
        return m32155b(b2, 0L, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public long m32155b(byte b2, long j2, long j3) {
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long m32052p = this.f37086f.m32052p(b2, j2, j3);
            if (m32052p != -1) {
                return m32052p;
            }
            long size = this.f37086f.size();
            if (size >= j3 || this.f37088h.read(this.f37086f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
        return -1L;
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: b0 */
    public long mo32031b0(C9677i c9677i) {
        C9768m.m32346f(c9677i, "targetBytes");
        return m32157d(c9677i, 0L);
    }

    /* renamed from: c */
    public long m32156c(C9677i c9677i, long j2) {
        C9768m.m32346f(c9677i, "bytes");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m31996A = this.f37086f.m31996A(c9677i, j2);
            if (m31996A != -1) {
                return m31996A;
            }
            long size = this.f37086f.size();
            if (this.f37088h.read(this.f37086f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - c9677i.m32093P()) + 1);
        }
    }

    @Override // p353j.InterfaceC9667d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f37087g) {
            return;
        }
        this.f37087g = true;
        this.f37088h.close();
        this.f37086f.m32030b();
    }

    /* renamed from: d */
    public long m32157d(C9677i c9677i, long j2) {
        C9768m.m32346f(c9677i, "targetBytes");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m31998B = this.f37086f.m31998B(c9677i, j2);
            if (m31998B != -1) {
                return m31998B;
            }
            long size = this.f37086f.size();
            if (this.f37088h.read(this.f37086f, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r4 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = kotlin.text.C10494b.m37411a(16);
        r2 = kotlin.text.C10494b.m37411a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.C9768m.m32345e(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // p353j.InterfaceC9676h
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo32035d0() {
        /*
            r10 = this;
            r0 = 1
            r10.mo32041g1(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L5b
            j.f r8 = r10.f37086f
            byte r8 = r8.m32047m(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2c
            r9 = 45
            byte r9 = (byte) r9
            if (r8 == r9) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L31
            goto L5b
        L31:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = kotlin.text.C10493a.m37408a(r2)
            int r2 = kotlin.text.C10493a.m37408a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C9768m.m32345e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b:
            j.f r0 = r10.f37086f
            long r0 = r0.mo32035d0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p353j.C9692x.mo32035d0():long");
    }

    /* renamed from: e */
    public boolean m32158e(long j2, C9677i c9677i, int i2, int i3) {
        int i4;
        C9768m.m32346f(c9677i, "bytes");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 >= 0 && i2 >= 0 && i3 >= 0 && c9677i.m32093P() - i2 >= i3) {
            while (i4 < i3) {
                long j3 = i4 + j2;
                i4 = (request(1 + j3) && this.f37086f.m32047m(j3) == c9677i.m32097x(i2 + i4)) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m32159f() {
        mo32041g1(4L);
        return this.f37086f.m32009K();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: g0 */
    public String mo32040g0(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b2 = (byte) 10;
        long m32155b = m32155b(b2, 0L, j3);
        if (m32155b != -1) {
            return C9673a.m32073d(this.f37086f, m32155b);
        }
        if (j3 < Long.MAX_VALUE && request(j3) && this.f37086f.m32047m(j3 - 1) == ((byte) 13) && request(1 + j3) && this.f37086f.m32047m(j3) == b2) {
            return C9673a.m32073d(this.f37086f, j3);
        }
        C9670f c9670f = new C9670f();
        C9670f c9670f2 = this.f37086f;
        c9670f2.m32044j(c9670f, 0L, Math.min(32, c9670f2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f37086f.size(), j2) + " content=" + c9670f.mo32003D0().mo31967F() + "…");
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: g1 */
    public void mo32041g1(long j2) {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    @Override // p353j.InterfaceC9676h, p353j.InterfaceC9672g
    /* renamed from: i */
    public C9670f mo32042i() {
        return this.f37086f;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f37087g;
    }

    /* renamed from: j */
    public short m32160j() {
        mo32041g1(2L);
        return this.f37086f.m32013N();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: m1 */
    public long mo32049m1() {
        byte m32047m;
        int m37411a;
        int m37411a2;
        mo32041g1(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!request(i3)) {
                break;
            }
            m32047m = this.f37086f.m32047m(i2);
            if ((m32047m < ((byte) 48) || m32047m > ((byte) 57)) && ((m32047m < ((byte) 97) || m32047m > ((byte) 102)) && (m32047m < ((byte) 65) || m32047m > ((byte) 70)))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            m37411a = C10494b.m37411a(16);
            m37411a2 = C10494b.m37411a(m37411a);
            String num = Integer.toString(m32047m, m37411a2);
            C9768m.m32345e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.f37086f.mo32049m1();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: o1 */
    public InputStream mo32051o1() {
        return new a();
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: p1 */
    public int mo32053p1(C9688t c9688t) {
        C9768m.m32346f(c9688t, "options");
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int m32074e = C9673a.m32074e(this.f37086f, c9688t, true);
            if (m32074e != -2) {
                if (m32074e != -1) {
                    this.f37086f.skip(c9688t.m32146i()[m32074e].m32093P());
                    return m32074e;
                }
            } else if (this.f37088h.read(this.f37086f, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p353j.InterfaceC9676h
    public InterfaceC9676h peek() {
        return C9685q.m32120d(new C9690v(this));
    }

    @Override // p353j.InterfaceC9667d0
    public long read(C9670f c9670f, long j2) {
        C9768m.m32346f(c9670f, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(true ^ this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f37086f.size() == 0 && this.f37088h.read(this.f37086f, 8192) == -1) {
            return -1L;
        }
        return this.f37086f.read(c9670f, Math.min(j2, this.f37086f.size()));
    }

    @Override // p353j.InterfaceC9676h
    public byte readByte() {
        mo32041g1(1L);
        return this.f37086f.readByte();
    }

    @Override // p353j.InterfaceC9676h
    public void readFully(byte[] bArr) {
        C9768m.m32346f(bArr, "sink");
        try {
            mo32041g1(bArr.length);
            this.f37086f.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f37086f.size() > 0) {
                C9670f c9670f = this.f37086f;
                int read = c9670f.read(bArr, i2, (int) c9670f.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i2 += read;
            }
            throw e2;
        }
    }

    @Override // p353j.InterfaceC9676h
    public int readInt() {
        mo32041g1(4L);
        return this.f37086f.readInt();
    }

    @Override // p353j.InterfaceC9676h
    public long readLong() {
        mo32041g1(8L);
        return this.f37086f.readLong();
    }

    @Override // p353j.InterfaceC9676h
    public short readShort() {
        mo32041g1(2L);
        return this.f37086f.readShort();
    }

    @Override // p353j.InterfaceC9676h
    public boolean request(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f37086f.size() < j2) {
            if (this.f37088h.read(this.f37086f, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // p353j.InterfaceC9676h
    public void skip(long j2) {
        if (!(!this.f37087g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.f37086f.size() == 0 && this.f37088h.read(this.f37086f, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, this.f37086f.size());
            this.f37086f.skip(min);
            j2 -= min;
        }
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: t */
    public C9670f mo32056t() {
        return this.f37086f;
    }

    @Override // p353j.InterfaceC9667d0
    public C9669e0 timeout() {
        return this.f37088h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f37088h + ')';
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: u */
    public C9677i mo32058u(long j2) {
        mo32041g1(j2);
        return this.f37086f.mo32058u(j2);
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: v0 */
    public boolean mo32059v0(long j2, C9677i c9677i) {
        C9768m.m32346f(c9677i, "bytes");
        return m32158e(j2, c9677i, 0, c9677i.m32093P());
    }

    @Override // p353j.InterfaceC9676h
    /* renamed from: w0 */
    public String mo32060w0(Charset charset) {
        C9768m.m32346f(charset, "charset");
        this.f37086f.mo31999B0(this.f37088h);
        return this.f37086f.mo32060w0(charset);
    }

    /* compiled from: RealBufferedSource.kt */
    /* renamed from: j.x$a */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            C9692x c9692x = C9692x.this;
            if (c9692x.f37087g) {
                throw new IOException("closed");
            }
            return (int) Math.min(c9692x.f37086f.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C9692x.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C9692x c9692x = C9692x.this;
            if (c9692x.f37087g) {
                throw new IOException("closed");
            }
            if (c9692x.f37086f.size() == 0) {
                C9692x c9692x2 = C9692x.this;
                if (c9692x2.f37088h.read(c9692x2.f37086f, 8192) == -1) {
                    return -1;
                }
            }
            return C9692x.this.f37086f.readByte() & 255;
        }

        public String toString() {
            return C9692x.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            C9768m.m32346f(bArr, "data");
            if (!C9692x.this.f37087g) {
                C9664c.m31982b(bArr.length, i2, i3);
                if (C9692x.this.f37086f.size() == 0) {
                    C9692x c9692x = C9692x.this;
                    if (c9692x.f37088h.read(c9692x.f37086f, 8192) == -1) {
                        return -1;
                    }
                }
                return C9692x.this.f37086f.read(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C9768m.m32346f(byteBuffer, "sink");
        if (this.f37086f.size() == 0 && this.f37088h.read(this.f37086f, 8192) == -1) {
            return -1;
        }
        return this.f37086f.read(byteBuffer);
    }
}
