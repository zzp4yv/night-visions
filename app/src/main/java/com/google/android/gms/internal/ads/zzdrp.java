package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes2.dex */
public final class zzdrp {

    /* renamed from: a */
    private final ByteBuffer f25841a;

    /* renamed from: b */
    private zzdni f25842b;

    /* renamed from: c */
    private int f25843c;

    private zzdrp(byte[] bArr, int i2, int i3) {
        this(ByteBuffer.wrap(bArr, i2, i3));
    }

    /* renamed from: a */
    private static int m19794a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        long j2 = i4 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static int m19795d(int i2, int i3) {
        return m19802o(i2) + m19803p(i3);
    }

    /* renamed from: e */
    public static zzdrp m19796e(byte[] bArr) {
        return m19808v(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static int m19797g(int i2, zzdrw zzdrwVar) {
        int m19802o = m19802o(i2);
        int m19825c = zzdrwVar.m19825c();
        return m19802o + m19804q(m19825c) + m19825c;
    }

    /* renamed from: h */
    public static int m19798h(int i2, byte[] bArr) {
        return m19802o(i2) + m19804q(bArr.length) + bArr.length;
    }

    /* renamed from: i */
    private static void m19799i(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i4 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128) {
                    byteBuffer.put((byte) charAt2);
                } else if (charAt2 < 2048) {
                    byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                    byteBuffer.put((byte) ((charAt2 & '?') | 128));
                } else {
                    if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i5 = i4 + 1;
                        if (i5 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i4 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((charAt2 & '?') | 128));
                }
                i4++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i6 = remaining + arrayOffset;
            while (i4 < length2) {
                int i7 = i4 + arrayOffset;
                if (i7 >= i6 || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                array[i7] = (byte) charAt;
                i4++;
            }
            if (i4 == length2) {
                i2 = arrayOffset + length2;
            } else {
                i2 = arrayOffset + i4;
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128 || i2 >= i6) {
                        if (charAt4 < 2048 && i2 <= i6 - 2) {
                            int i8 = i2 + 1;
                            array[i2] = (byte) ((charAt4 >>> 6) | 960);
                            i2 = i8 + 1;
                            array[i8] = (byte) ((charAt4 & '?') | 128);
                        } else {
                            if ((charAt4 >= 55296 && 57343 >= charAt4) || i2 > i6 - 3) {
                                if (i2 > i6 - 4) {
                                    StringBuilder sb2 = new StringBuilder(37);
                                    sb2.append("Failed writing ");
                                    sb2.append(charAt4);
                                    sb2.append(" at index ");
                                    sb2.append(i2);
                                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                                }
                                int i9 = i4 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt5 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt4, charAt5)) {
                                        int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                        int i10 = i2 + 1;
                                        array[i2] = (byte) ((codePoint2 >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                        i2 = i12 + 1;
                                        array[i12] = (byte) ((codePoint2 & 63) | 128);
                                        i4 = i9;
                                    } else {
                                        i4 = i9;
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder(39);
                                sb3.append("Unpaired surrogate at index ");
                                sb3.append(i4 - 1);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            int i13 = i2 + 1;
                            array[i2] = (byte) ((charAt4 >>> '\f') | 480);
                            int i14 = i13 + 1;
                            array[i13] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            i3 = i14 + 1;
                            array[i14] = (byte) ((charAt4 & '?') | 128);
                        }
                        i4++;
                    } else {
                        i3 = i2 + 1;
                        array[i2] = (byte) charAt4;
                    }
                    i2 = i3;
                    i4++;
                }
            }
            byteBuffer.position(i2 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e2) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e2);
            throw bufferOverflowException;
        }
    }

    /* renamed from: m */
    public static int m19800m(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: n */
    public static int m19801n(int i2, String str) {
        return m19802o(i2) + m19805r(str);
    }

    /* renamed from: o */
    public static int m19802o(int i2) {
        return m19804q(i2 << 3);
    }

    /* renamed from: p */
    public static int m19803p(int i2) {
        if (i2 >= 0) {
            return m19804q(i2);
        }
        return 10;
    }

    /* renamed from: q */
    private static int m19804q(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: r */
    public static int m19805r(String str) {
        int m19794a = m19794a(str);
        return m19804q(m19794a) + m19794a;
    }

    /* renamed from: s */
    private final void m19806s(int i2) throws IOException {
        byte b2 = (byte) i2;
        if (!this.f25841a.hasRemaining()) {
            throw new zzdrq(this.f25841a.position(), this.f25841a.limit());
        }
        this.f25841a.put(b2);
    }

    /* renamed from: t */
    private final void m19807t(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            m19806s((i2 & 127) | 128);
            i2 >>>= 7;
        }
        m19806s(i2);
    }

    /* renamed from: v */
    public static zzdrp m19808v(byte[] bArr, int i2, int i3) {
        return new zzdrp(bArr, 0, i3);
    }

    /* renamed from: b */
    public final void m19809b(int i2, zzdrw zzdrwVar) throws IOException {
        m19816w(i2, 2);
        if (zzdrwVar.f25854a < 0) {
            zzdrwVar.m19825c();
        }
        m19807t(zzdrwVar.f25854a);
        zzdrwVar.mo19818a(this);
    }

    /* renamed from: c */
    public final void m19810c(int i2, byte[] bArr) throws IOException {
        m19816w(i2, 2);
        m19807t(bArr.length);
        int length = bArr.length;
        if (this.f25841a.remaining() < length) {
            throw new zzdrq(this.f25841a.position(), this.f25841a.limit());
        }
        this.f25841a.put(bArr, 0, length);
    }

    /* renamed from: f */
    public final void m19811f() {
        if (this.f25841a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f25841a.remaining())));
        }
    }

    /* renamed from: j */
    public final void m19812j(int i2, zzdpk zzdpkVar) throws IOException {
        if (this.f25842b == null) {
            this.f25842b = zzdni.m19614E0(this.f25841a);
            this.f25843c = this.f25841a.position();
        } else if (this.f25843c != this.f25841a.position()) {
            this.f25842b.mo19677c(this.f25841a.array(), this.f25843c, this.f25841a.position() - this.f25843c);
            this.f25843c = this.f25841a.position();
        }
        zzdni zzdniVar = this.f25842b;
        zzdniVar.mo19684h(i2, zzdpkVar);
        zzdniVar.mo19675b();
        this.f25843c = this.f25841a.position();
    }

    /* renamed from: k */
    public final void m19813k(int i2, String str) throws IOException {
        m19816w(i2, 2);
        try {
            int m19804q = m19804q(str.length());
            if (m19804q != m19804q(str.length() * 3)) {
                m19807t(m19794a(str));
                m19799i(str, this.f25841a);
                return;
            }
            int position = this.f25841a.position();
            if (this.f25841a.remaining() < m19804q) {
                throw new zzdrq(position + m19804q, this.f25841a.limit());
            }
            this.f25841a.position(position + m19804q);
            m19799i(str, this.f25841a);
            int position2 = this.f25841a.position();
            this.f25841a.position(position);
            m19807t((position2 - position) - m19804q);
            this.f25841a.position(position2);
        } catch (BufferOverflowException e2) {
            zzdrq zzdrqVar = new zzdrq(this.f25841a.position(), this.f25841a.limit());
            zzdrqVar.initCause(e2);
            throw zzdrqVar;
        }
    }

    /* renamed from: l */
    public final void m19814l(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            m19806s((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        m19806s((int) j2);
    }

    /* renamed from: u */
    public final void m19815u(int i2, boolean z) throws IOException {
        m19816w(3, 0);
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (!this.f25841a.hasRemaining()) {
            throw new zzdrq(this.f25841a.position(), this.f25841a.limit());
        }
        this.f25841a.put(b2);
    }

    /* renamed from: w */
    public final void m19816w(int i2, int i3) throws IOException {
        m19807t((i2 << 3) | i3);
    }

    /* renamed from: x */
    public final void m19817x(int i2, int i3) throws IOException {
        m19816w(i2, 0);
        if (i3 >= 0) {
            m19807t(i3);
        } else {
            m19814l(i3);
        }
    }

    private zzdrp(ByteBuffer byteBuffer) {
        this.f25841a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
