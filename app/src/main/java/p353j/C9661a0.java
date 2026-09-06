package p353j;

import java.security.MessageDigest;
import kotlin.collections.C10768m;
import kotlin.jvm.internal.C9768m;
import p353j.p354g0.C9675c;

/* compiled from: SegmentedByteString.kt */
/* renamed from: j.a0 */
/* loaded from: classes3.dex */
public final class C9661a0 extends C9677i {

    /* renamed from: k */
    private final transient byte[][] f37031k;

    /* renamed from: l */
    private final transient int[] f37032l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9661a0(byte[][] bArr, int[] iArr) {
        super(C9677i.f37051f.m32098y());
        C9768m.m32346f(bArr, "segments");
        C9768m.m32346f(iArr, "directory");
        this.f37031k = bArr;
        this.f37032l = iArr;
    }

    /* renamed from: X */
    private final C9677i m31965X() {
        return new C9677i(m31976W());
    }

    private final Object writeReplace() {
        C9677i m31965X = m31965X();
        if (m31965X != null) {
            return m31965X;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // p353j.C9677i
    /* renamed from: D */
    public int mo31966D() {
        return m31974U()[m31975V().length - 1];
    }

    @Override // p353j.C9677i
    /* renamed from: F */
    public String mo31967F() {
        return m31965X().mo31967F();
    }

    @Override // p353j.C9677i
    /* renamed from: G */
    public byte[] mo31968G() {
        return m31976W();
    }

    @Override // p353j.C9677i
    /* renamed from: H */
    public byte mo31969H(int i2) {
        C9664c.m31982b(m31974U()[m31975V().length - 1], i2, 1L);
        int m32083b = C9675c.m32083b(this, i2);
        return m31975V()[m32083b][(i2 - (m32083b == 0 ? 0 : m31974U()[m32083b - 1])) + m31974U()[m31975V().length + m32083b]];
    }

    @Override // p353j.C9677i
    /* renamed from: J */
    public boolean mo31970J(int i2, C9677i c9677i, int i3, int i4) {
        C9768m.m32346f(c9677i, "other");
        if (i2 < 0 || i2 > m32093P() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int m32083b = C9675c.m32083b(this, i2);
        while (i2 < i5) {
            int i6 = m32083b == 0 ? 0 : m31974U()[m32083b - 1];
            int i7 = m31974U()[m32083b] - i6;
            int i8 = m31974U()[m31975V().length + m32083b];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!c9677i.mo31971K(i3, m31975V()[m32083b], i8 + (i2 - i6), min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            m32083b++;
        }
        return true;
    }

    @Override // p353j.C9677i
    /* renamed from: K */
    public boolean mo31971K(int i2, byte[] bArr, int i3, int i4) {
        C9768m.m32346f(bArr, "other");
        if (i2 < 0 || i2 > m32093P() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int m32083b = C9675c.m32083b(this, i2);
        while (i2 < i5) {
            int i6 = m32083b == 0 ? 0 : m31974U()[m32083b - 1];
            int i7 = m31974U()[m32083b] - i6;
            int i8 = m31974U()[m31975V().length + m32083b];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!C9664c.m31981a(m31975V()[m32083b], i8 + (i2 - i6), bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            m32083b++;
        }
        return true;
    }

    @Override // p353j.C9677i
    /* renamed from: R */
    public C9677i mo31972R() {
        return m31965X().mo31972R();
    }

    @Override // p353j.C9677i
    /* renamed from: T */
    public void mo31973T(C9670f c9670f, int i2, int i3) {
        C9768m.m32346f(c9670f, "buffer");
        int i4 = i2 + i3;
        int m32083b = C9675c.m32083b(this, i2);
        while (i2 < i4) {
            int i5 = m32083b == 0 ? 0 : m31974U()[m32083b - 1];
            int i6 = m31974U()[m32083b] - i5;
            int i7 = m31974U()[m31975V().length + m32083b];
            int min = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            C9693y c9693y = new C9693y(m31975V()[m32083b], i8, i8 + min, true, false);
            C9693y c9693y2 = c9670f.f37038f;
            if (c9693y2 == null) {
                c9693y.f37097h = c9693y;
                c9693y.f37096g = c9693y;
                c9670f.f37038f = c9693y;
            } else {
                C9768m.m32343c(c9693y2);
                C9693y c9693y3 = c9693y2.f37097h;
                C9768m.m32343c(c9693y3);
                c9693y3.m32163c(c9693y);
            }
            i2 += min;
            m32083b++;
        }
        c9670f.m32038f0(c9670f.size() + i3);
    }

    /* renamed from: U */
    public final int[] m31974U() {
        return this.f37032l;
    }

    /* renamed from: V */
    public final byte[][] m31975V() {
        return this.f37031k;
    }

    /* renamed from: W */
    public byte[] m31976W() {
        byte[] bArr = new byte[m32093P()];
        int length = m31975V().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = m31974U()[length + i2];
            int i6 = m31974U()[i2];
            int i7 = i6 - i3;
            C10768m.m38703d(m31975V()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // p353j.C9677i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9677i) {
            C9677i c9677i = (C9677i) obj;
            if (c9677i.m32093P() == m32093P() && mo31970J(0, c9677i, 0, m32093P())) {
                return true;
            }
        }
        return false;
    }

    @Override // p353j.C9677i
    /* renamed from: g */
    public String mo31977g() {
        return m31965X().mo31977g();
    }

    @Override // p353j.C9677i
    public int hashCode() {
        int m32086A = m32086A();
        if (m32086A != 0) {
            return m32086A;
        }
        int length = m31975V().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = m31974U()[length + i2];
            int i6 = m31974U()[i2];
            byte[] bArr = m31975V()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        m32089L(i3);
        return i3;
    }

    @Override // p353j.C9677i
    public String toString() {
        return m31965X().toString();
    }

    @Override // p353j.C9677i
    /* renamed from: u */
    public C9677i mo31978u(String str) {
        C9768m.m32346f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m31975V().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = m31974U()[length + i2];
            int i5 = m31974U()[i2];
            messageDigest.update(m31975V()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        C9768m.m32345e(digest, "digestBytes");
        return new C9677i(digest);
    }
}
