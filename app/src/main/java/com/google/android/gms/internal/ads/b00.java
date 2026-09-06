package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Stack;

/* loaded from: classes2.dex */
final class b00 implements e00 {

    /* renamed from: a */
    private final byte[] f18210a = new byte[8];

    /* renamed from: b */
    private final Stack<d00> f18211b = new Stack<>();

    /* renamed from: c */
    private final g00 f18212c = new g00();

    /* renamed from: d */
    private f00 f18213d;

    /* renamed from: e */
    private int f18214e;

    /* renamed from: f */
    private int f18215f;

    /* renamed from: g */
    private long f18216g;

    b00() {
    }

    /* renamed from: d */
    private final long m14833d(zzie zzieVar, int i2) throws IOException, InterruptedException {
        zzieVar.readFully(this.f18210a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.f18210a[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.e00
    /* renamed from: a */
    public final void mo14834a() {
        this.f18214e = 0;
        this.f18211b.clear();
        this.f18212c.m15153a();
    }

    @Override // com.google.android.gms.internal.ads.e00
    /* renamed from: b */
    public final void mo14835b(f00 f00Var) {
        this.f18213d = f00Var;
    }

    @Override // com.google.android.gms.internal.ads.e00
    /* renamed from: c */
    public final boolean mo14836c(zzie zzieVar) throws IOException, InterruptedException {
        long j2;
        int i2;
        zzkh.m20129d(this.f18213d != null);
        while (true) {
            if (!this.f18211b.isEmpty()) {
                long position = zzieVar.getPosition();
                j2 = this.f18211b.peek().f18478b;
                if (position >= j2) {
                    f00 f00Var = this.f18213d;
                    i2 = this.f18211b.pop().f18477a;
                    f00Var.mo15122k(i2);
                    return true;
                }
            }
            if (this.f18214e == 0) {
                long m15154b = this.f18212c.m15154b(zzieVar, true, false);
                if (m15154b == -1) {
                    return false;
                }
                this.f18215f = (int) m15154b;
                this.f18214e = 1;
            }
            if (this.f18214e == 1) {
                this.f18216g = this.f18212c.m15154b(zzieVar, false, true);
                this.f18214e = 2;
            }
            int mo15121j = this.f18213d.mo15121j(this.f18215f);
            if (mo15121j != 0) {
                if (mo15121j == 1) {
                    long position2 = zzieVar.getPosition();
                    this.f18211b.add(new d00(this.f18215f, this.f18216g + position2));
                    this.f18213d.mo15120i(this.f18215f, position2, this.f18216g);
                    this.f18214e = 0;
                    return true;
                }
                if (mo15121j == 2) {
                    long j3 = this.f18216g;
                    if (j3 <= 8) {
                        this.f18213d.mo15117c(this.f18215f, m14833d(zzieVar, (int) j3));
                        this.f18214e = 0;
                        return true;
                    }
                    long j4 = this.f18216g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j4);
                    throw new IllegalStateException(sb.toString());
                }
                if (mo15121j == 3) {
                    long j5 = this.f18216g;
                    if (j5 > 2147483647L) {
                        long j6 = this.f18216g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j6);
                        throw new IllegalStateException(sb2.toString());
                    }
                    f00 f00Var2 = this.f18213d;
                    int i3 = this.f18215f;
                    int i4 = (int) j5;
                    byte[] bArr = new byte[i4];
                    zzieVar.readFully(bArr, 0, i4);
                    f00Var2.mo15118g(i3, new String(bArr, Charset.forName("UTF-8")));
                    this.f18214e = 0;
                    return true;
                }
                if (mo15121j == 4) {
                    this.f18213d.mo15123l(this.f18215f, (int) this.f18216g, zzieVar);
                    this.f18214e = 0;
                    return true;
                }
                if (mo15121j != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(mo15121j);
                    throw new IllegalStateException(sb3.toString());
                }
                long j7 = this.f18216g;
                if (j7 != 4 && j7 != 8) {
                    long j8 = this.f18216g;
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j8);
                    throw new IllegalStateException(sb4.toString());
                }
                int i5 = (int) j7;
                this.f18213d.mo15119h(this.f18215f, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(m14833d(zzieVar, i5)));
                this.f18214e = 0;
                return true;
            }
            zzieVar.mo20061a((int) this.f18216g);
            this.f18214e = 0;
        }
    }
}
