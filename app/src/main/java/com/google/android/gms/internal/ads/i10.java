package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class i10 {

    /* renamed from: a */
    private final int f19257a;

    /* renamed from: b */
    private final int f19258b;

    /* renamed from: c */
    private final int f19259c;

    /* renamed from: d */
    private final int f19260d;

    /* renamed from: e */
    private final int f19261e;

    /* renamed from: f */
    private final short[] f19262f;

    /* renamed from: g */
    private int f19263g;

    /* renamed from: h */
    private short[] f19264h;

    /* renamed from: i */
    private int f19265i;

    /* renamed from: j */
    private short[] f19266j;

    /* renamed from: k */
    private int f19267k;

    /* renamed from: l */
    private short[] f19268l;

    /* renamed from: q */
    private int f19273q;

    /* renamed from: r */
    private int f19274r;

    /* renamed from: s */
    private int f19275s;

    /* renamed from: t */
    private int f19276t;

    /* renamed from: v */
    private int f19278v;

    /* renamed from: w */
    private int f19279w;

    /* renamed from: x */
    private int f19280x;

    /* renamed from: m */
    private int f19269m = 0;

    /* renamed from: n */
    private int f19270n = 0;

    /* renamed from: u */
    private int f19277u = 0;

    /* renamed from: o */
    private float f19271o = 1.0f;

    /* renamed from: p */
    private float f19272p = 1.0f;

    public i10(int i2, int i3) {
        this.f19257a = i2;
        this.f19258b = i3;
        this.f19259c = i2 / 400;
        int i4 = i2 / 65;
        this.f19260d = i4;
        int i5 = i4 * 2;
        this.f19261e = i5;
        this.f19262f = new short[i5];
        this.f19263g = i5;
        this.f19264h = new short[i5 * i3];
        this.f19265i = i5;
        this.f19266j = new short[i5 * i3];
        this.f19267k = i5;
        this.f19268l = new short[i5 * i3];
    }

    /* renamed from: b */
    private final int m15319b(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f19258b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s = sArr[i5 + i11];
                short s2 = sArr[i5 + i3 + i11];
                i10 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.f19279w = i6 / i8;
        this.f19280x = i9 / i7;
        return i8;
    }

    /* renamed from: d */
    private static void m15320d(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    /* renamed from: f */
    private final void m15321f(short[] sArr, int i2, int i3) {
        m15322g(i3);
        int i4 = this.f19258b;
        System.arraycopy(sArr, i2 * i4, this.f19266j, this.f19274r * i4, i4 * i3);
        this.f19274r += i3;
    }

    /* renamed from: g */
    private final void m15322g(int i2) {
        int i3 = this.f19274r + i2;
        int i4 = this.f19265i;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f19265i = i5;
            this.f19266j = Arrays.copyOf(this.f19266j, i5 * this.f19258b);
        }
    }

    /* renamed from: h */
    private final void m15323h(int i2) {
        int i3 = this.f19273q + i2;
        int i4 = this.f19263g;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f19263g = i5;
            this.f19264h = Arrays.copyOf(this.f19264h, i5 * this.f19258b);
        }
    }

    /* renamed from: j */
    private final void m15324j(short[] sArr, int i2, int i3) {
        int i4 = this.f19261e / i3;
        int i5 = this.f19258b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f19262f[i8] = (short) (i9 / i6);
        }
    }

    /* renamed from: m */
    private final void m15325m() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f19274r;
        float f2 = this.f19271o / this.f19272p;
        double d2 = f2;
        int i9 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i10 = this.f19273q;
            if (i10 >= this.f19261e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f19276t;
                    if (i12 > 0) {
                        int min = Math.min(this.f19261e, i12);
                        m15321f(this.f19264h, i11, min);
                        this.f19276t -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.f19264h;
                        int i13 = this.f19257a;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.f19258b == i9 && i14 == i9) {
                            i2 = m15319b(sArr, i11, this.f19259c, this.f19260d);
                        } else {
                            m15324j(sArr, i11, i14);
                            int m15319b = m15319b(this.f19262f, 0, this.f19259c / i14, this.f19260d / i14);
                            if (i14 != i9) {
                                int i15 = m15319b * i14;
                                int i16 = i14 << 2;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f19259c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.f19260d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f19258b == i9) {
                                    i2 = m15319b(sArr, i11, i17, i18);
                                } else {
                                    m15324j(sArr, i11, i9);
                                    i2 = m15319b(this.f19262f, 0, i17, i18);
                                }
                            } else {
                                i2 = m15319b;
                            }
                        }
                        int i21 = this.f19279w;
                        int i22 = i21 != 0 && this.f19277u != 0 && this.f19280x <= i21 * 3 && (i21 << 1) > this.f19278v * 3 ? this.f19277u : i2;
                        this.f19278v = i21;
                        this.f19277u = i2;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.f19264h;
                            if (f2 >= 2.0f) {
                                i4 = (int) (i22 / (f2 - 1.0f));
                            } else {
                                this.f19276t = (int) ((i22 * (2.0f - f2)) / (f2 - 1.0f));
                                i4 = i22;
                            }
                            m15322g(i4);
                            int i23 = i4;
                            m15320d(i4, this.f19258b, this.f19266j, this.f19274r, sArr2, i11, sArr2, i11 + i22);
                            this.f19274r += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.f19264h;
                            if (f2 < 0.5f) {
                                i3 = (int) ((i24 * f2) / (1.0f - f2));
                            } else {
                                this.f19276t = (int) ((i24 * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
                                i3 = i24;
                            }
                            int i25 = i24 + i3;
                            m15322g(i25);
                            int i26 = this.f19258b;
                            System.arraycopy(sArr3, i11 * i26, this.f19266j, this.f19274r * i26, i26 * i24);
                            m15320d(i3, this.f19258b, this.f19266j, this.f19274r + i24, sArr3, i24 + i11, sArr3, i11);
                            this.f19274r += i25;
                            i11 += i3;
                        }
                    }
                    if (this.f19261e + i11 > i10) {
                        break;
                    } else {
                        i9 = 1;
                    }
                }
                int i27 = this.f19273q - i11;
                short[] sArr4 = this.f19264h;
                int i28 = this.f19258b;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.f19273q = i27;
            }
        } else {
            m15321f(this.f19264h, 0, this.f19273q);
            this.f19273q = 0;
        }
        float f3 = this.f19272p;
        if (f3 == 1.0f || this.f19274r == i8) {
            return;
        }
        int i29 = this.f19257a;
        int i30 = (int) (i29 / f3);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.f19274r - i8;
        int i32 = this.f19275s + i31;
        int i33 = this.f19267k;
        if (i32 > i33) {
            int i34 = i33 + (i33 / 2) + i31;
            this.f19267k = i34;
            this.f19268l = Arrays.copyOf(this.f19268l, i34 * this.f19258b);
        }
        short[] sArr5 = this.f19266j;
        int i35 = this.f19258b;
        System.arraycopy(sArr5, i8 * i35, this.f19268l, this.f19275s * i35, i35 * i31);
        this.f19274r = i8;
        this.f19275s += i31;
        int i36 = 0;
        while (true) {
            i5 = this.f19275s;
            if (i36 >= i5 - 1) {
                break;
            }
            while (true) {
                i6 = this.f19269m;
                int i37 = (i6 + 1) * i30;
                i7 = this.f19270n;
                if (i37 <= i7 * i29) {
                    break;
                }
                m15322g(1);
                int i38 = 0;
                while (true) {
                    int i39 = this.f19258b;
                    if (i38 < i39) {
                        short[] sArr6 = this.f19266j;
                        int i40 = (this.f19274r * i39) + i38;
                        short[] sArr7 = this.f19268l;
                        int i41 = (i36 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f19270n * i29;
                        int i43 = this.f19269m;
                        int i44 = i43 * i30;
                        int i45 = (i43 + 1) * i30;
                        int i46 = i45 - i42;
                        int i47 = i45 - i44;
                        sArr6[i40] = (short) (((s * i46) + ((i47 - i46) * s2)) / i47);
                        i38++;
                    }
                }
                this.f19270n++;
                this.f19274r++;
            }
            int i48 = i6 + 1;
            this.f19269m = i48;
            if (i48 == i29) {
                this.f19269m = 0;
                zzsk.m20481e(i7 == i30);
                this.f19270n = 0;
            }
            i36++;
        }
        int i49 = i5 - 1;
        if (i49 != 0) {
            short[] sArr8 = this.f19268l;
            int i50 = this.f19258b;
            System.arraycopy(sArr8, i49 * i50, sArr8, 0, (i5 - i49) * i50);
            this.f19275s -= i49;
        }
    }

    /* renamed from: a */
    public final void m15326a(float f2) {
        this.f19271o = f2;
    }

    /* renamed from: c */
    public final void m15327c(float f2) {
        this.f19272p = f2;
    }

    /* renamed from: e */
    public final void m15328e(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f19258b;
        int i3 = remaining / i2;
        m15323h(i3);
        shortBuffer.get(this.f19264h, this.f19273q * this.f19258b, ((i2 * i3) << 1) / 2);
        this.f19273q += i3;
        m15325m();
    }

    /* renamed from: i */
    public final void m15329i(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f19258b, this.f19274r);
        shortBuffer.put(this.f19266j, 0, this.f19258b * min);
        int i2 = this.f19274r - min;
        this.f19274r = i2;
        short[] sArr = this.f19266j;
        int i3 = this.f19258b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    /* renamed from: k */
    public final void m15330k() {
        int i2;
        int i3 = this.f19273q;
        float f2 = this.f19271o;
        float f3 = this.f19272p;
        int i4 = this.f19274r + ((int) ((((i3 / (f2 / f3)) + this.f19275s) / f3) + 0.5f));
        m15323h((this.f19261e * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f19261e;
            int i6 = this.f19258b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.f19264h[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.f19273q += i2 * 2;
        m15325m();
        if (this.f19274r > i4) {
            this.f19274r = i4;
        }
        this.f19273q = 0;
        this.f19276t = 0;
        this.f19275s = 0;
    }

    /* renamed from: l */
    public final int m15331l() {
        return this.f19274r;
    }
}
