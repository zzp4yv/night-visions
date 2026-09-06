package com.google.zxing.common.reedsolomon;

/* compiled from: GenericGFPoly.java */
/* renamed from: com.google.zxing.common.reedsolomon.b */
/* loaded from: classes2.dex */
final class C8591b {

    /* renamed from: a */
    private final C8590a f32765a;

    /* renamed from: b */
    private final int[] f32766b;

    C8591b(C8590a c8590a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f32765a = c8590a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f32766b = iArr;
            return;
        }
        int i2 = 1;
        while (i2 < length && iArr[i2] == 0) {
            i2++;
        }
        if (i2 == length) {
            this.f32766b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i2];
        this.f32766b = iArr2;
        System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    C8591b m27233a(C8591b c8591b) {
        if (!this.f32765a.equals(c8591b.f32765a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m27238f()) {
            return c8591b;
        }
        if (c8591b.m27238f()) {
            return this;
        }
        int[] iArr = this.f32766b;
        int[] iArr2 = c8591b.f32766b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i2 = length; i2 < iArr.length; i2++) {
            iArr3[i2] = C8590a.m27225a(iArr2[i2 - length], iArr[i2]);
        }
        return new C8591b(this.f32765a, iArr3);
    }

    /* renamed from: b */
    C8591b[] m27234b(C8591b c8591b) {
        if (!this.f32765a.equals(c8591b.f32765a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c8591b.m27238f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C8591b m27229e = this.f32765a.m27229e();
        int m27230f = this.f32765a.m27230f(c8591b.m27235c(c8591b.m27237e()));
        C8591b c8591b2 = this;
        while (c8591b2.m27237e() >= c8591b.m27237e() && !c8591b2.m27238f()) {
            int m27237e = c8591b2.m27237e() - c8591b.m27237e();
            int m27232h = this.f32765a.m27232h(c8591b2.m27235c(c8591b2.m27237e()), m27230f);
            C8591b m27240h = c8591b.m27240h(m27237e, m27232h);
            m27229e = m27229e.m27233a(this.f32765a.m27226b(m27237e, m27232h));
            c8591b2 = c8591b2.m27233a(m27240h);
        }
        return new C8591b[]{m27229e, c8591b2};
    }

    /* renamed from: c */
    int m27235c(int i2) {
        return this.f32766b[(r0.length - 1) - i2];
    }

    /* renamed from: d */
    int[] m27236d() {
        return this.f32766b;
    }

    /* renamed from: e */
    int m27237e() {
        return this.f32766b.length - 1;
    }

    /* renamed from: f */
    boolean m27238f() {
        return this.f32766b[0] == 0;
    }

    /* renamed from: g */
    C8591b m27239g(C8591b c8591b) {
        if (!this.f32765a.equals(c8591b.f32765a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m27238f() || c8591b.m27238f()) {
            return this.f32765a.m27229e();
        }
        int[] iArr = this.f32766b;
        int length = iArr.length;
        int[] iArr2 = c8591b.f32766b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            for (int i4 = 0; i4 < length2; i4++) {
                int i5 = i2 + i4;
                iArr3[i5] = C8590a.m27225a(iArr3[i5], this.f32765a.m27232h(i3, iArr2[i4]));
            }
        }
        return new C8591b(this.f32765a, iArr3);
    }

    /* renamed from: h */
    C8591b m27240h(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.f32765a.m27229e();
        }
        int length = this.f32766b.length;
        int[] iArr = new int[i2 + length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = this.f32765a.m27232h(this.f32766b[i4], i3);
        }
        return new C8591b(this.f32765a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m27237e() * 8);
        for (int m27237e = m27237e(); m27237e >= 0; m27237e--) {
            int m27235c = m27235c(m27237e);
            if (m27235c != 0) {
                if (m27235c < 0) {
                    sb.append(" - ");
                    m27235c = -m27235c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m27237e == 0 || m27235c != 1) {
                    int m27231g = this.f32765a.m27231g(m27235c);
                    if (m27231g == 0) {
                        sb.append('1');
                    } else if (m27231g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(m27231g);
                    }
                }
                if (m27237e != 0) {
                    if (m27237e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m27237e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
