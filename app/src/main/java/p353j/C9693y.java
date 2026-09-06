package p353j;

import java.util.Arrays;
import kotlin.collections.C10768m;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: Segment.kt */
/* renamed from: j.y */
/* loaded from: classes3.dex */
public final class C9693y {

    /* renamed from: a */
    public static final a f37090a = new a(null);

    /* renamed from: b */
    public final byte[] f37091b;

    /* renamed from: c */
    public int f37092c;

    /* renamed from: d */
    public int f37093d;

    /* renamed from: e */
    public boolean f37094e;

    /* renamed from: f */
    public boolean f37095f;

    /* renamed from: g */
    public C9693y f37096g;

    /* renamed from: h */
    public C9693y f37097h;

    /* compiled from: Segment.kt */
    /* renamed from: j.y$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public C9693y() {
        this.f37091b = new byte[8192];
        this.f37095f = true;
        this.f37094e = false;
    }

    /* renamed from: a */
    public final void m32161a() {
        C9693y c9693y = this.f37097h;
        int i2 = 0;
        if (!(c9693y != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C9768m.m32343c(c9693y);
        if (c9693y.f37095f) {
            int i3 = this.f37093d - this.f37092c;
            C9693y c9693y2 = this.f37097h;
            C9768m.m32343c(c9693y2);
            int i4 = 8192 - c9693y2.f37093d;
            C9693y c9693y3 = this.f37097h;
            C9768m.m32343c(c9693y3);
            if (!c9693y3.f37094e) {
                C9693y c9693y4 = this.f37097h;
                C9768m.m32343c(c9693y4);
                i2 = c9693y4.f37092c;
            }
            if (i3 > i4 + i2) {
                return;
            }
            C9693y c9693y5 = this.f37097h;
            C9768m.m32343c(c9693y5);
            m32167g(c9693y5, i3);
            m32162b();
            C9694z.m32169b(this);
        }
    }

    /* renamed from: b */
    public final C9693y m32162b() {
        C9693y c9693y = this.f37096g;
        if (c9693y == this) {
            c9693y = null;
        }
        C9693y c9693y2 = this.f37097h;
        C9768m.m32343c(c9693y2);
        c9693y2.f37096g = this.f37096g;
        C9693y c9693y3 = this.f37096g;
        C9768m.m32343c(c9693y3);
        c9693y3.f37097h = this.f37097h;
        this.f37096g = null;
        this.f37097h = null;
        return c9693y;
    }

    /* renamed from: c */
    public final C9693y m32163c(C9693y c9693y) {
        C9768m.m32346f(c9693y, "segment");
        c9693y.f37097h = this;
        c9693y.f37096g = this.f37096g;
        C9693y c9693y2 = this.f37096g;
        C9768m.m32343c(c9693y2);
        c9693y2.f37097h = c9693y;
        this.f37096g = c9693y;
        return c9693y;
    }

    /* renamed from: d */
    public final C9693y m32164d() {
        this.f37094e = true;
        return new C9693y(this.f37091b, this.f37092c, this.f37093d, true, false);
    }

    /* renamed from: e */
    public final C9693y m32165e(int i2) {
        C9693y m32170c;
        if (!(i2 > 0 && i2 <= this.f37093d - this.f37092c)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i2 >= 1024) {
            m32170c = m32164d();
        } else {
            m32170c = C9694z.m32170c();
            byte[] bArr = this.f37091b;
            byte[] bArr2 = m32170c.f37091b;
            int i3 = this.f37092c;
            C10768m.m38705f(bArr, bArr2, 0, i3, i3 + i2, 2, null);
        }
        m32170c.f37093d = m32170c.f37092c + i2;
        this.f37092c += i2;
        C9693y c9693y = this.f37097h;
        C9768m.m32343c(c9693y);
        c9693y.m32163c(m32170c);
        return m32170c;
    }

    /* renamed from: f */
    public final C9693y m32166f() {
        byte[] bArr = this.f37091b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C9768m.m32345e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C9693y(copyOf, this.f37092c, this.f37093d, false, true);
    }

    /* renamed from: g */
    public final void m32167g(C9693y c9693y, int i2) {
        C9768m.m32346f(c9693y, "sink");
        if (!c9693y.f37095f) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = c9693y.f37093d;
        if (i3 + i2 > 8192) {
            if (c9693y.f37094e) {
                throw new IllegalArgumentException();
            }
            int i4 = c9693y.f37092c;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c9693y.f37091b;
            C10768m.m38705f(bArr, bArr, 0, i4, i3, 2, null);
            c9693y.f37093d -= c9693y.f37092c;
            c9693y.f37092c = 0;
        }
        byte[] bArr2 = this.f37091b;
        byte[] bArr3 = c9693y.f37091b;
        int i5 = c9693y.f37093d;
        int i6 = this.f37092c;
        C10768m.m38703d(bArr2, bArr3, i5, i6, i6 + i2);
        c9693y.f37093d += i2;
        this.f37092c += i2;
    }

    public C9693y(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        C9768m.m32346f(bArr, "data");
        this.f37091b = bArr;
        this.f37092c = i2;
        this.f37093d = i3;
        this.f37094e = z;
        this.f37095f = z2;
    }
}
