package com.bumptech.glide.p122l;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.p122l.InterfaceC5327a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* renamed from: com.bumptech.glide.l.e */
/* loaded from: classes.dex */
public class C5331e implements InterfaceC5327a {

    /* renamed from: a */
    private static final String f13194a = "e";

    /* renamed from: b */
    private int[] f13195b;

    /* renamed from: c */
    private final int[] f13196c;

    /* renamed from: d */
    private final InterfaceC5327a.a f13197d;

    /* renamed from: e */
    private ByteBuffer f13198e;

    /* renamed from: f */
    private byte[] f13199f;

    /* renamed from: g */
    private short[] f13200g;

    /* renamed from: h */
    private byte[] f13201h;

    /* renamed from: i */
    private byte[] f13202i;

    /* renamed from: j */
    private byte[] f13203j;

    /* renamed from: k */
    private int[] f13204k;

    /* renamed from: l */
    private int f13205l;

    /* renamed from: m */
    private C5329c f13206m;

    /* renamed from: n */
    private Bitmap f13207n;

    /* renamed from: o */
    private boolean f13208o;

    /* renamed from: p */
    private int f13209p;

    /* renamed from: q */
    private int f13210q;

    /* renamed from: r */
    private int f13211r;

    /* renamed from: s */
    private int f13212s;

    /* renamed from: t */
    private Boolean f13213t;

    /* renamed from: u */
    private Bitmap.Config f13214u;

    public C5331e(InterfaceC5327a.a aVar, C5329c c5329c, ByteBuffer byteBuffer, int i2) {
        this(aVar);
        m10151r(c5329c, byteBuffer, i2);
    }

    /* renamed from: j */
    private int m10142j(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.f13210q + i2; i10++) {
            byte[] bArr = this.f13203j;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.f13195b[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.f13210q + i12; i13++) {
            byte[] bArr2 = this.f13203j;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.f13195b[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    /* renamed from: k */
    private void m10143k(C5328b c5328b) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f13204k;
        int i7 = c5328b.f13169d;
        int i8 = this.f13210q;
        int i9 = i7 / i8;
        int i10 = c5328b.f13167b / i8;
        int i11 = c5328b.f13168c / i8;
        int i12 = c5328b.f13166a / i8;
        boolean z = this.f13205l == 0;
        int i13 = this.f13212s;
        int i14 = this.f13211r;
        byte[] bArr = this.f13203j;
        int[] iArr2 = this.f13195b;
        Boolean bool = this.f13213t;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i9) {
            Boolean bool2 = bool;
            if (c5328b.f13170e) {
                if (i17 >= i9) {
                    i2 = i9;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i17 + i15;
            } else {
                i2 = i9;
                i3 = i17;
                i17 = i16;
            }
            int i20 = i17 + i10;
            boolean z2 = i8 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i12;
                int i23 = i22 + i11;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i4 = i3;
                int i25 = i16 * i8 * c5328b.f13168c;
                if (z2) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i8;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i23 - i22) * i8) + i25;
                    int i30 = i22;
                    while (true) {
                        i5 = i11;
                        if (i30 < i23) {
                            int m10142j = m10142j(i25, i29, c5328b.f13168c);
                            if (m10142j != 0) {
                                iArr[i30] = m10142j;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i25 += i8;
                            i30++;
                            i11 = i5;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i17 = i4;
                }
            } else {
                i4 = i3;
            }
            i6 = i10;
            i5 = i11;
            bool = bool2;
            i16++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i17 = i4;
        }
        Boolean bool3 = bool;
        if (this.f13213t == null) {
            this.f13213t = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* renamed from: l */
    private void m10144l(C5328b c5328b) {
        C5328b c5328b2 = c5328b;
        int[] iArr = this.f13204k;
        int i2 = c5328b2.f13169d;
        int i3 = c5328b2.f13167b;
        int i4 = c5328b2.f13168c;
        int i5 = c5328b2.f13166a;
        boolean z = this.f13205l == 0;
        int i6 = this.f13212s;
        byte[] bArr = this.f13203j;
        int[] iArr2 = this.f13195b;
        int i7 = 0;
        byte b2 = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = c5328b2.f13168c * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b3 = bArr[i12];
                int i14 = i2;
                int i15 = b3 & 255;
                if (i15 != b2) {
                    int i16 = iArr2[i15];
                    if (i16 != 0) {
                        iArr[i13] = i16;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i13++;
                i2 = i14;
            }
            i7++;
            c5328b2 = c5328b;
        }
        this.f13213t = Boolean.valueOf(this.f13213t == null && z && b2 != -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: m */
    private void m10145m(C5328b c5328b) {
        int i2;
        int i3;
        short s;
        C5331e c5331e = this;
        if (c5328b != null) {
            c5331e.f13198e.position(c5328b.f13175j);
        }
        if (c5328b == null) {
            C5329c c5329c = c5331e.f13206m;
            i2 = c5329c.f13182f;
            i3 = c5329c.f13183g;
        } else {
            i2 = c5328b.f13168c;
            i3 = c5328b.f13169d;
        }
        int i4 = i2 * i3;
        byte[] bArr = c5331e.f13203j;
        if (bArr == null || bArr.length < i4) {
            c5331e.f13203j = c5331e.f13197d.mo10118e(i4);
        }
        byte[] bArr2 = c5331e.f13203j;
        if (c5331e.f13200g == null) {
            c5331e.f13200g = new short[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        short[] sArr = c5331e.f13200g;
        if (c5331e.f13201h == null) {
            c5331e.f13201h = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        byte[] bArr3 = c5331e.f13201h;
        if (c5331e.f13202i == null) {
            c5331e.f13202i = new byte[4097];
        }
        byte[] bArr4 = c5331e.f13202i;
        int m10148q = m10148q();
        int i5 = 1 << m10148q;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = m10148q + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = c5331e.f13199f;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            if (i15 == 0) {
                i15 = m10147p();
                if (i15 <= 0) {
                    c5331e.f13209p = 3;
                    break;
                }
                i16 = 0;
            }
            i18 += (bArr5[i16] & 255) << i17;
            i16++;
            i15--;
            int i23 = i17 + 8;
            int i24 = i13;
            int i25 = i12;
            int i26 = i20;
            int i27 = i8;
            int i28 = i21;
            while (true) {
                if (i23 < i25) {
                    i20 = i26;
                    i13 = i24;
                    i17 = i23;
                    c5331e = this;
                    i21 = i28;
                    i8 = i27;
                    i12 = i25;
                    break;
                }
                int i29 = i7;
                int i30 = i18 & i14;
                i18 >>= i25;
                i23 -= i25;
                if (i30 == i5) {
                    i14 = i9;
                    i25 = i27;
                    i24 = i29;
                    i7 = i24;
                    i26 = -1;
                } else {
                    if (i30 == i6) {
                        i17 = i23;
                        i21 = i28;
                        i13 = i24;
                        i8 = i27;
                        i7 = i29;
                        i20 = i26;
                        i12 = i25;
                        c5331e = this;
                        break;
                    }
                    if (i26 == -1) {
                        bArr2[i19] = bArr3[i30];
                        i19++;
                        i10++;
                        i26 = i30;
                        i28 = i26;
                        i7 = i29;
                        i23 = i23;
                    } else {
                        if (i30 >= i24) {
                            bArr4[i22] = (byte) i28;
                            i22++;
                            s = i26;
                        } else {
                            s = i30;
                        }
                        while (s >= i5) {
                            bArr4[i22] = bArr3[s];
                            i22++;
                            s = sArr[s];
                        }
                        i28 = bArr3[s] & 255;
                        byte b2 = (byte) i28;
                        bArr2[i19] = b2;
                        while (true) {
                            i19++;
                            i10++;
                            if (i22 <= 0) {
                                break;
                            }
                            i22--;
                            bArr2[i19] = bArr4[i22];
                        }
                        byte[] bArr6 = bArr4;
                        if (i24 < 4096) {
                            sArr[i24] = (short) i26;
                            bArr3[i24] = b2;
                            i24++;
                            if ((i24 & i14) == 0 && i24 < 4096) {
                                i25++;
                                i14 += i24;
                            }
                        }
                        i26 = i30;
                        i7 = i29;
                        i23 = i23;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i19, i4, (byte) 0);
    }

    /* renamed from: o */
    private Bitmap m10146o() {
        Boolean bool = this.f13213t;
        Bitmap mo10114a = this.f13197d.mo10114a(this.f13212s, this.f13211r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f13214u);
        mo10114a.setHasAlpha(true);
        return mo10114a;
    }

    /* renamed from: p */
    private int m10147p() {
        int m10148q = m10148q();
        if (m10148q <= 0) {
            return m10148q;
        }
        ByteBuffer byteBuffer = this.f13198e;
        byteBuffer.get(this.f13199f, 0, Math.min(m10148q, byteBuffer.remaining()));
        return m10148q;
    }

    /* renamed from: q */
    private int m10148q() {
        return this.f13198e.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m10149s(C5328b c5328b, C5328b c5328b2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.f13204k;
        int i4 = 0;
        if (c5328b2 == null) {
            Bitmap bitmap2 = this.f13207n;
            if (bitmap2 != null) {
                this.f13197d.mo10116c(bitmap2);
            }
            this.f13207n = null;
            Arrays.fill(iArr, 0);
        }
        if (c5328b2 != null && c5328b2.f13172g == 3 && this.f13207n == null) {
            Arrays.fill(iArr, 0);
        }
        if (c5328b2 != null && (i3 = c5328b2.f13172g) > 0) {
            if (i3 == 2) {
                if (!c5328b.f13171f) {
                    C5329c c5329c = this.f13206m;
                    int i5 = c5329c.f13188l;
                    if (c5328b.f13176k == null || c5329c.f13186j != c5328b.f13173h) {
                        i4 = i5;
                    }
                } else if (this.f13205l == 0) {
                    this.f13213t = Boolean.TRUE;
                }
                int i6 = c5328b2.f13169d;
                int i7 = this.f13210q;
                int i8 = i6 / i7;
                int i9 = c5328b2.f13167b / i7;
                int i10 = c5328b2.f13168c / i7;
                int i11 = c5328b2.f13166a / i7;
                int i12 = this.f13212s;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.f13212s;
                }
            } else if (i3 == 3 && (bitmap = this.f13207n) != null) {
                int i17 = this.f13212s;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.f13211r);
            }
        }
        m10145m(c5328b);
        if (c5328b.f13170e || this.f13210q != 1) {
            m10143k(c5328b);
        } else {
            m10144l(c5328b);
        }
        if (this.f13208o && ((i2 = c5328b.f13172g) == 0 || i2 == 1)) {
            if (this.f13207n == null) {
                this.f13207n = m10146o();
            }
            Bitmap bitmap3 = this.f13207n;
            int i18 = this.f13212s;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.f13211r);
        }
        Bitmap m10146o = m10146o();
        int i19 = this.f13212s;
        m10146o.setPixels(iArr, 0, i19, 0, 0, i19, this.f13211r);
        return m10146o;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: a */
    public synchronized Bitmap mo10105a() {
        if (this.f13206m.f13179c <= 0 || this.f13205l < 0) {
            String str = f13194a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f13206m.f13179c + ", framePointer=" + this.f13205l);
            }
            this.f13209p = 1;
        }
        int i2 = this.f13209p;
        if (i2 != 1 && i2 != 2) {
            this.f13209p = 0;
            if (this.f13199f == null) {
                this.f13199f = this.f13197d.mo10118e(255);
            }
            C5328b c5328b = this.f13206m.f13181e.get(this.f13205l);
            int i3 = this.f13205l - 1;
            C5328b c5328b2 = i3 >= 0 ? this.f13206m.f13181e.get(i3) : null;
            int[] iArr = c5328b.f13176k;
            if (iArr == null) {
                iArr = this.f13206m.f13177a;
            }
            this.f13195b = iArr;
            if (iArr != null) {
                if (c5328b.f13171f) {
                    System.arraycopy(iArr, 0, this.f13196c, 0, iArr.length);
                    int[] iArr2 = this.f13196c;
                    this.f13195b = iArr2;
                    iArr2[c5328b.f13173h] = 0;
                }
                return m10149s(c5328b, c5328b2);
            }
            String str2 = f13194a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "No valid color table found for frame #" + this.f13205l);
            }
            this.f13209p = 1;
            return null;
        }
        String str3 = f13194a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f13209p);
        }
        return null;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: b */
    public ByteBuffer mo10106b() {
        return this.f13198e;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: c */
    public void mo10107c() {
        this.f13205l = (this.f13205l + 1) % this.f13206m.f13179c;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    public void clear() {
        this.f13206m = null;
        byte[] bArr = this.f13203j;
        if (bArr != null) {
            this.f13197d.mo10117d(bArr);
        }
        int[] iArr = this.f13204k;
        if (iArr != null) {
            this.f13197d.mo10119f(iArr);
        }
        Bitmap bitmap = this.f13207n;
        if (bitmap != null) {
            this.f13197d.mo10116c(bitmap);
        }
        this.f13207n = null;
        this.f13198e = null;
        this.f13213t = null;
        byte[] bArr2 = this.f13199f;
        if (bArr2 != null) {
            this.f13197d.mo10117d(bArr2);
        }
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: d */
    public int mo10108d() {
        return this.f13206m.f13179c;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: e */
    public int mo10109e() {
        int i2;
        if (this.f13206m.f13179c <= 0 || (i2 = this.f13205l) < 0) {
            return 0;
        }
        return m10150n(i2);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: f */
    public void mo10110f(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f13214u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: g */
    public void mo10111g() {
        this.f13205l = -1;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: h */
    public int mo10112h() {
        return this.f13205l;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5327a
    /* renamed from: i */
    public int mo10113i() {
        return this.f13198e.limit() + this.f13203j.length + (this.f13204k.length * 4);
    }

    /* renamed from: n */
    public int m10150n(int i2) {
        if (i2 >= 0) {
            C5329c c5329c = this.f13206m;
            if (i2 < c5329c.f13179c) {
                return c5329c.f13181e.get(i2).f13174i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void m10151r(C5329c c5329c, ByteBuffer byteBuffer, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
        int highestOneBit = Integer.highestOneBit(i2);
        this.f13209p = 0;
        this.f13206m = c5329c;
        this.f13205l = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f13198e = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f13198e.order(ByteOrder.LITTLE_ENDIAN);
        this.f13208o = false;
        Iterator<C5328b> it = c5329c.f13181e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f13172g == 3) {
                this.f13208o = true;
                break;
            }
        }
        this.f13210q = highestOneBit;
        int i3 = c5329c.f13182f;
        this.f13212s = i3 / highestOneBit;
        int i4 = c5329c.f13183g;
        this.f13211r = i4 / highestOneBit;
        this.f13203j = this.f13197d.mo10118e(i3 * i4);
        this.f13204k = this.f13197d.mo10115b(this.f13212s * this.f13211r);
    }

    public C5331e(InterfaceC5327a.a aVar) {
        this.f13196c = new int[256];
        this.f13214u = Bitmap.Config.ARGB_8888;
        this.f13197d = aVar;
        this.f13206m = new C5329c();
    }
}
