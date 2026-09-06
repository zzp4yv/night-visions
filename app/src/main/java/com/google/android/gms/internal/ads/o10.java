package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class o10 implements r10 {

    /* renamed from: a */
    private final byte[] f20123a = new byte[8];

    /* renamed from: b */
    private final Stack<q10> f20124b = new Stack<>();

    /* renamed from: c */
    private final x10 f20125c = new x10();

    /* renamed from: d */
    private s10 f20126d;

    /* renamed from: e */
    private int f20127e;

    /* renamed from: f */
    private int f20128f;

    /* renamed from: g */
    private long f20129g;

    o10() {
    }

    /* renamed from: d */
    private final long m15665d(zzno zznoVar, int i2) throws IOException, InterruptedException {
        zznoVar.readFully(this.f20123a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.f20123a[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.r10
    /* renamed from: a */
    public final void mo15666a() {
        this.f20127e = 0;
        this.f20124b.clear();
        this.f20125c.m16004a();
    }

    @Override // com.google.android.gms.internal.ads.r10
    /* renamed from: b */
    public final void mo15667b(s10 s10Var) {
        this.f20126d = s10Var;
    }

    @Override // com.google.android.gms.internal.ads.r10
    /* renamed from: c */
    public final boolean mo15668c(zzno zznoVar) throws IOException, InterruptedException {
        String str;
        int m16003d;
        int m16002c;
        long j2;
        int i2;
        zzsk.m20481e(this.f20126d != null);
        while (true) {
            if (!this.f20124b.isEmpty()) {
                long position = zznoVar.getPosition();
                j2 = this.f20124b.peek().f20367b;
                if (position >= j2) {
                    s10 s10Var = this.f20126d;
                    i2 = this.f20124b.pop().f20366a;
                    s10Var.mo15842k(i2);
                    return true;
                }
            }
            if (this.f20127e == 0) {
                long m16005b = this.f20125c.m16005b(zznoVar, true, false, 4);
                if (m16005b == -2) {
                    zznoVar.mo20324c();
                    while (true) {
                        zznoVar.mo20325d(this.f20123a, 0, 4);
                        m16003d = x10.m16003d(this.f20123a[0]);
                        if (m16003d != -1 && m16003d <= 4) {
                            m16002c = (int) x10.m16002c(this.f20123a, m16003d, false);
                            if (this.f20126d.mo15835a(m16002c)) {
                                break;
                            }
                        }
                        zznoVar.mo20322a(1);
                    }
                    zznoVar.mo20322a(m16003d);
                    m16005b = m16002c;
                }
                if (m16005b == -1) {
                    return false;
                }
                this.f20128f = (int) m16005b;
                this.f20127e = 1;
            }
            if (this.f20127e == 1) {
                this.f20129g = this.f20125c.m16005b(zznoVar, false, true, 8);
                this.f20127e = 2;
            }
            int mo15841j = this.f20126d.mo15841j(this.f20128f);
            if (mo15841j != 0) {
                if (mo15841j == 1) {
                    long position2 = zznoVar.getPosition();
                    this.f20124b.add(new q10(this.f20128f, this.f20129g + position2));
                    this.f20126d.mo15840i(this.f20128f, position2, this.f20129g);
                    this.f20127e = 0;
                    return true;
                }
                if (mo15841j == 2) {
                    long j3 = this.f20129g;
                    if (j3 <= 8) {
                        this.f20126d.mo15837c(this.f20128f, m15665d(zznoVar, (int) j3));
                        this.f20127e = 0;
                        return true;
                    }
                    long j4 = this.f20129g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j4);
                    throw new zzlm(sb.toString());
                }
                if (mo15841j == 3) {
                    long j5 = this.f20129g;
                    if (j5 > 2147483647L) {
                        long j6 = this.f20129g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j6);
                        throw new zzlm(sb2.toString());
                    }
                    s10 s10Var2 = this.f20126d;
                    int i3 = this.f20128f;
                    int i4 = (int) j5;
                    if (i4 == 0) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        byte[] bArr = new byte[i4];
                        zznoVar.readFully(bArr, 0, i4);
                        str = new String(bArr);
                    }
                    s10Var2.mo15838g(i3, str);
                    this.f20127e = 0;
                    return true;
                }
                if (mo15841j == 4) {
                    this.f20126d.mo15836b(this.f20128f, (int) this.f20129g, zznoVar);
                    this.f20127e = 0;
                    return true;
                }
                if (mo15841j != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(mo15841j);
                    throw new zzlm(sb3.toString());
                }
                long j7 = this.f20129g;
                if (j7 != 4 && j7 != 8) {
                    long j8 = this.f20129g;
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j8);
                    throw new zzlm(sb4.toString());
                }
                int i5 = (int) j7;
                this.f20126d.mo15839h(this.f20128f, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(m15665d(zznoVar, i5)));
                this.f20127e = 0;
                return true;
            }
            zznoVar.mo20322a((int) this.f20129g);
            this.f20127e = 0;
        }
    }
}
