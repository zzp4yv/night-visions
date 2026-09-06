package com.facebook.p157o0.p166r0;

import kotlin.jvm.internal.C9768m;

/* compiled from: Operator.kt */
/* renamed from: com.facebook.o0.r0.i */
/* loaded from: classes2.dex */
public final class C5887i {

    /* renamed from: a */
    public static final C5887i f15449a = new C5887i();

    private C5887i() {
    }

    /* renamed from: a */
    public static final void m12724a(C5884f c5884f, C5884f c5884f2) {
        C9768m.m32346f(c5884f, "x");
        C9768m.m32346f(c5884f2, "b");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        int m12674b3 = c5884f.m12674b(2);
        float[] m12673a = c5884f.m12673a();
        float[] m12673a2 = c5884f2.m12673a();
        if (m12674b <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (m12674b2 > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (m12674b3 > 0) {
                        int i6 = 0;
                        while (true) {
                            int i7 = i6 + 1;
                            int i8 = (i2 * m12674b2 * m12674b3) + (i4 * m12674b3) + i6;
                            m12673a[i8] = m12673a[i8] + m12673a2[i6];
                            if (i7 >= m12674b3) {
                                break;
                            } else {
                                i6 = i7;
                            }
                        }
                    }
                    if (i5 >= m12674b2) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
            }
            if (i3 >= m12674b) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: b */
    public static final C5884f m12725b(C5884f[] c5884fArr) {
        int i2;
        C9768m.m32346f(c5884fArr, "tensors");
        int m12674b = c5884fArr[0].m12674b(0);
        int length = c5884fArr.length - 1;
        if (length >= 0) {
            int i3 = 0;
            i2 = 0;
            while (true) {
                int i4 = i3 + 1;
                i2 += c5884fArr[i3].m12674b(1);
                if (i4 > length) {
                    break;
                }
                i3 = i4;
            }
        } else {
            i2 = 0;
        }
        C5884f c5884f = new C5884f(new int[]{m12674b, i2});
        float[] m12673a = c5884f.m12673a();
        if (m12674b > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                int i7 = i5 * i2;
                int length2 = c5884fArr.length - 1;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        int i9 = i8 + 1;
                        float[] m12673a2 = c5884fArr[i8].m12673a();
                        int m12674b2 = c5884fArr[i8].m12674b(1);
                        System.arraycopy(m12673a2, i5 * m12674b2, m12673a, i7, m12674b2);
                        i7 += m12674b2;
                        if (i9 > length2) {
                            break;
                        }
                        i8 = i9;
                    }
                }
                if (i6 >= m12674b) {
                    break;
                }
                i5 = i6;
            }
        }
        return c5884f;
    }

    /* renamed from: c */
    public static final C5884f m12726c(C5884f c5884f, C5884f c5884f2) {
        C5884f c5884f3;
        int i2;
        int i3;
        C9768m.m32346f(c5884f, "x");
        C9768m.m32346f(c5884f2, "w");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        int m12674b3 = c5884f.m12674b(2);
        int m12674b4 = c5884f2.m12674b(0);
        int i4 = (m12674b2 - m12674b4) + 1;
        int m12674b5 = c5884f2.m12674b(2);
        C5884f c5884f4 = new C5884f(new int[]{m12674b, i4, m12674b5});
        float[] m12673a = c5884f.m12673a();
        float[] m12673a2 = c5884f4.m12673a();
        float[] m12673a3 = c5884f2.m12673a();
        if (m12674b <= 0) {
            return c5884f4;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (m12674b5 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i4 > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            float f2 = 0.0f;
                            if (m12674b4 > 0) {
                                int i11 = 0;
                                while (true) {
                                    c5884f3 = c5884f4;
                                    int i12 = i11 + 1;
                                    if (m12674b3 > 0) {
                                        int i13 = 0;
                                        while (true) {
                                            i3 = m12674b;
                                            int i14 = i13 + 1;
                                            f2 += m12673a[(m12674b2 * m12674b3 * i5) + ((i11 + i9) * m12674b3) + i13] * m12673a3[(((i11 * m12674b3) + i13) * m12674b5) + i7];
                                            if (i14 >= m12674b3) {
                                                break;
                                            }
                                            i13 = i14;
                                            m12674b = i3;
                                        }
                                    } else {
                                        i3 = m12674b;
                                    }
                                    if (i12 >= m12674b4) {
                                        break;
                                    }
                                    i11 = i12;
                                    c5884f4 = c5884f3;
                                    m12674b = i3;
                                }
                            } else {
                                i3 = m12674b;
                                c5884f3 = c5884f4;
                            }
                            m12673a2[(i4 * m12674b5 * i5) + (i9 * m12674b5) + i7] = f2;
                            if (i10 >= i4) {
                                break;
                            }
                            i9 = i10;
                            c5884f4 = c5884f3;
                            m12674b = i3;
                        }
                    } else {
                        i3 = m12674b;
                        c5884f3 = c5884f4;
                    }
                    if (i8 >= m12674b5) {
                        break;
                    }
                    i7 = i8;
                    c5884f4 = c5884f3;
                    m12674b = i3;
                }
                i2 = i3;
            } else {
                c5884f3 = c5884f4;
                i2 = m12674b;
            }
            if (i6 >= i2) {
                return c5884f3;
            }
            m12674b = i2;
            i5 = i6;
            c5884f4 = c5884f3;
        }
    }

    /* renamed from: d */
    public static final C5884f m12727d(C5884f c5884f, C5884f c5884f2, C5884f c5884f3) {
        C9768m.m32346f(c5884f, "x");
        C9768m.m32346f(c5884f2, "w");
        C9768m.m32346f(c5884f3, "b");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f3.m12674b(0);
        C5884f m12731h = m12731h(c5884f, c5884f2);
        float[] m12673a = c5884f3.m12673a();
        float[] m12673a2 = m12731h.m12673a();
        if (m12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (m12674b2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        int i6 = (i2 * m12674b2) + i4;
                        m12673a2[i6] = m12673a2[i6] + m12673a[i4];
                        if (i5 >= m12674b2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= m12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return m12731h;
    }

    /* renamed from: e */
    public static final C5884f m12728e(String[] strArr, int i2, C5884f c5884f) {
        C9768m.m32346f(strArr, "texts");
        C9768m.m32346f(c5884f, "w");
        int length = strArr.length;
        int m12674b = c5884f.m12674b(1);
        C5884f c5884f2 = new C5884f(new int[]{length, i2, m12674b});
        float[] m12673a = c5884f2.m12673a();
        float[] m12673a2 = c5884f.m12673a();
        if (length > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int[] m12739d = C5888j.f15450a.m12739d(strArr[i3], i2);
                if (i2 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        System.arraycopy(m12673a2, m12739d[i5] * m12674b, m12673a, (m12674b * i2 * i3) + (i5 * m12674b), m12674b);
                        if (i6 >= i2) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        return c5884f2;
    }

    /* renamed from: f */
    public static final void m12729f(C5884f c5884f, int i2) {
        C9768m.m32346f(c5884f, "x");
        if (i2 >= c5884f.m12675c()) {
            return;
        }
        int m12675c = c5884f.m12675c();
        int i3 = 1;
        if (i2 < m12675c) {
            int i4 = i2;
            while (true) {
                int i5 = i4 + 1;
                i3 *= c5884f.m12674b(i4);
                if (i5 >= m12675c) {
                    break;
                } else {
                    i4 = i5;
                }
            }
        }
        int[] iArr = new int[i2 + 1];
        int i6 = 0;
        if (i2 > 0) {
            while (true) {
                int i7 = i6 + 1;
                iArr[i6] = c5884f.m12674b(i6);
                if (i7 >= i2) {
                    break;
                } else {
                    i6 = i7;
                }
            }
        }
        iArr[i2] = i3;
        c5884f.m12676d(iArr);
    }

    /* renamed from: g */
    public static final C5884f m12730g(C5884f c5884f, int i2) {
        int i3;
        C9768m.m32346f(c5884f, "x");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        int m12674b3 = c5884f.m12674b(2);
        int i4 = (m12674b2 - i2) + 1;
        C5884f c5884f2 = new C5884f(new int[]{m12674b, i4, m12674b3});
        float[] m12673a = c5884f.m12673a();
        float[] m12673a2 = c5884f2.m12673a();
        if (m12674b > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (m12674b3 > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        if (i4 > 0) {
                            int i9 = 0;
                            while (true) {
                                int i10 = i9 + 1;
                                int i11 = i9 * m12674b3;
                                int i12 = (i5 * i4 * m12674b3) + i11 + i7;
                                int i13 = (i5 * m12674b2 * m12674b3) + i11 + i7;
                                m12673a2[i12] = Float.MIN_VALUE;
                                if (i2 > 0) {
                                    int i14 = 0;
                                    while (true) {
                                        int i15 = i14 + 1;
                                        i3 = m12674b2;
                                        m12673a2[i12] = Math.max(m12673a2[i12], m12673a[i13 + (i14 * m12674b3)]);
                                        if (i15 >= i2) {
                                            break;
                                        }
                                        i14 = i15;
                                        m12674b2 = i3;
                                    }
                                } else {
                                    i3 = m12674b2;
                                }
                                if (i10 >= i4) {
                                    break;
                                }
                                i9 = i10;
                                m12674b2 = i3;
                            }
                        } else {
                            i3 = m12674b2;
                        }
                        if (i8 >= m12674b3) {
                            break;
                        }
                        i7 = i8;
                        m12674b2 = i3;
                    }
                } else {
                    i3 = m12674b2;
                }
                if (i6 >= m12674b) {
                    break;
                }
                i5 = i6;
                m12674b2 = i3;
            }
        }
        return c5884f2;
    }

    /* renamed from: h */
    public static final C5884f m12731h(C5884f c5884f, C5884f c5884f2) {
        C9768m.m32346f(c5884f, "x");
        C9768m.m32346f(c5884f2, "w");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f2.m12674b(0);
        int m12674b3 = c5884f2.m12674b(1);
        C5884f c5884f3 = new C5884f(new int[]{m12674b, m12674b3});
        float[] m12673a = c5884f.m12673a();
        float[] m12673a2 = c5884f2.m12673a();
        float[] m12673a3 = c5884f3.m12673a();
        if (m12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (m12674b3 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        int i6 = (i2 * m12674b3) + i4;
                        m12673a3[i6] = 0.0f;
                        if (m12674b2 > 0) {
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                m12673a3[i6] = m12673a3[i6] + (m12673a[(i2 * m12674b2) + i7] * m12673a2[(i7 * m12674b3) + i4]);
                                if (i8 >= m12674b2) {
                                    break;
                                }
                                i7 = i8;
                            }
                        }
                        if (i5 >= m12674b3) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= m12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5884f3;
    }

    /* renamed from: i */
    public static final void m12732i(C5884f c5884f) {
        C9768m.m32346f(c5884f, "x");
        float[] m12673a = c5884f.m12673a();
        int length = m12673a.length - 1;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (m12673a[i2] < 0.0f) {
                m12673a[i2] = 0.0f;
            }
            if (i3 > length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: j */
    public static final void m12733j(C5884f c5884f) {
        C9768m.m32346f(c5884f, "x");
        int i2 = 0;
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        float[] m12673a = c5884f.m12673a();
        if (m12674b <= 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            int i4 = i2 * m12674b2;
            int i5 = i4 + m12674b2;
            float f2 = Float.MIN_VALUE;
            float f3 = 0.0f;
            if (i4 < i5) {
                int i6 = i4;
                while (true) {
                    int i7 = i6 + 1;
                    if (m12673a[i6] > f2) {
                        f2 = m12673a[i6];
                    }
                    if (i7 >= i5) {
                        break;
                    } else {
                        i6 = i7;
                    }
                }
            }
            if (i4 < i5) {
                int i8 = i4;
                while (true) {
                    int i9 = i8 + 1;
                    m12673a[i8] = (float) Math.exp(m12673a[i8] - f2);
                    f3 += m12673a[i8];
                    if (i9 >= i5) {
                        break;
                    } else {
                        i8 = i9;
                    }
                }
            }
            if (i4 < i5) {
                while (true) {
                    int i10 = i4 + 1;
                    m12673a[i4] = m12673a[i4] / f3;
                    if (i10 >= i5) {
                        break;
                    } else {
                        i4 = i10;
                    }
                }
            }
            if (i3 >= m12674b) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: k */
    public static final C5884f m12734k(C5884f c5884f) {
        C9768m.m32346f(c5884f, "x");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        C5884f c5884f2 = new C5884f(new int[]{m12674b2, m12674b});
        float[] m12673a = c5884f.m12673a();
        float[] m12673a2 = c5884f2.m12673a();
        if (m12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (m12674b2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        m12673a2[(i4 * m12674b) + i2] = m12673a[(i2 * m12674b2) + i4];
                        if (i5 >= m12674b2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= m12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5884f2;
    }

    /* renamed from: l */
    public static final C5884f m12735l(C5884f c5884f) {
        C9768m.m32346f(c5884f, "x");
        int m12674b = c5884f.m12674b(0);
        int m12674b2 = c5884f.m12674b(1);
        int m12674b3 = c5884f.m12674b(2);
        C5884f c5884f2 = new C5884f(new int[]{m12674b3, m12674b2, m12674b});
        float[] m12673a = c5884f.m12673a();
        float[] m12673a2 = c5884f2.m12673a();
        if (m12674b > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (m12674b2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (m12674b3 > 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                m12673a2[(i6 * m12674b * m12674b2) + (i4 * m12674b) + i2] = m12673a[(i2 * m12674b2 * m12674b3) + (i4 * m12674b3) + i6];
                                if (i7 >= m12674b3) {
                                    break;
                                }
                                i6 = i7;
                            }
                        }
                        if (i5 >= m12674b2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 >= m12674b) {
                    break;
                }
                i2 = i3;
            }
        }
        return c5884f2;
    }
}
