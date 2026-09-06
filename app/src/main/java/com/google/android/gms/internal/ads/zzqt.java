package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzqt implements zznw {

    /* renamed from: a */
    private final zzrt f26855a;

    /* renamed from: b */
    private final int f26856b;

    /* renamed from: c */
    private final h30 f26857c;

    /* renamed from: d */
    private final zzqs f26858d;

    /* renamed from: e */
    private final zzst f26859e;

    /* renamed from: f */
    private final AtomicInteger f26860f;

    /* renamed from: g */
    private i30 f26861g;

    /* renamed from: h */
    private i30 f26862h;

    /* renamed from: i */
    private zzlh f26863i;

    /* renamed from: j */
    private boolean f26864j;

    /* renamed from: k */
    private zzlh f26865k;

    /* renamed from: l */
    private long f26866l;

    /* renamed from: m */
    private int f26867m;

    /* renamed from: n */
    private zzqv f26868n;

    public zzqt(zzrt zzrtVar) {
        this.f26855a = zzrtVar;
        int mo20454a = zzrtVar.mo20454a();
        this.f26856b = mo20454a;
        this.f26857c = new h30();
        this.f26858d = new zzqs();
        this.f26859e = new zzst(32);
        this.f26860f = new AtomicInteger();
        this.f26867m = mo20454a;
        i30 i30Var = new i30(0L, mo20454a);
        this.f26861g = i30Var;
        this.f26862h = i30Var;
    }

    /* renamed from: g */
    private final void m20396g(long j2, byte[] bArr, int i2) {
        m20398j(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.f26861g.f19285a);
            int min = Math.min(i2 - i3, this.f26856b - i4);
            zzrs zzrsVar = this.f26861g.f19288d;
            System.arraycopy(zzrsVar.f26940a, zzrsVar.m20453a(i4), bArr, i3, min);
            j2 += min;
            i3 += min;
            if (j2 == this.f26861g.f19286b) {
                this.f26855a.mo20458i(zzrsVar);
                this.f26861g = this.f26861g.m15333a();
            }
        }
    }

    /* renamed from: i */
    private final int m20397i(int i2) {
        if (this.f26867m == this.f26856b) {
            this.f26867m = 0;
            i30 i30Var = this.f26862h;
            if (i30Var.f19287c) {
                this.f26862h = i30Var.f19289e;
            }
            i30 i30Var2 = this.f26862h;
            zzrs mo20457h = this.f26855a.mo20457h();
            i30 i30Var3 = new i30(this.f26862h.f19286b, this.f26856b);
            i30Var2.f19288d = mo20457h;
            i30Var2.f19289e = i30Var3;
            i30Var2.f19287c = true;
        }
        return Math.min(i2, this.f26856b - this.f26867m);
    }

    /* renamed from: j */
    private final void m20398j(long j2) {
        while (true) {
            i30 i30Var = this.f26861g;
            if (j2 < i30Var.f19286b) {
                return;
            }
            this.f26855a.mo20458i(i30Var.f19288d);
            this.f26861g = this.f26861g.m15333a();
        }
    }

    /* renamed from: m */
    private final void m20399m() {
        this.f26857c.m15254g();
        i30 i30Var = this.f26861g;
        if (i30Var.f19287c) {
            i30 i30Var2 = this.f26862h;
            boolean z = i30Var2.f19287c;
            int i2 = (z ? 1 : 0) + (((int) (i30Var2.f19285a - i30Var.f19285a)) / this.f26856b);
            zzrs[] zzrsVarArr = new zzrs[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zzrsVarArr[i3] = i30Var.f19288d;
                i30Var = i30Var.m15333a();
            }
            this.f26855a.mo20456g(zzrsVarArr);
        }
        i30 i30Var3 = new i30(0L, this.f26856b);
        this.f26861g = i30Var3;
        this.f26862h = i30Var3;
        this.f26866l = 0L;
        this.f26867m = this.f26856b;
        this.f26855a.mo20455f();
    }

    /* renamed from: r */
    private final boolean m20400r() {
        return this.f26860f.compareAndSet(0, 1);
    }

    /* renamed from: s */
    private final void m20401s() {
        if (this.f26860f.compareAndSet(1, 0)) {
            return;
        }
        m20399m();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    /* renamed from: a */
    public final void mo20337a(zzlh zzlhVar) {
        zzlh zzlhVar2 = zzlhVar == null ? null : zzlhVar;
        boolean m15252e = this.f26857c.m15252e(zzlhVar2);
        this.f26865k = zzlhVar;
        this.f26864j = false;
        zzqv zzqvVar = this.f26868n;
        if (zzqvVar == null || !m15252e) {
            return;
        }
        zzqvVar.mo16026i(zzlhVar2);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    /* renamed from: b */
    public final void mo20338b(zzst zzstVar, int i2) {
        if (!m20400r()) {
            zzstVar.m20511l(i2);
            return;
        }
        while (i2 > 0) {
            int m20397i = m20397i(i2);
            zzrs zzrsVar = this.f26862h.f19288d;
            zzstVar.m20513n(zzrsVar.f26940a, zzrsVar.m20453a(this.f26867m), m20397i);
            this.f26867m += m20397i;
            this.f26866l += m20397i;
            i2 -= m20397i;
        }
        m20401s();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    /* renamed from: c */
    public final void mo20339c(long j2, int i2, int i3, int i4, zznx zznxVar) {
        if (!m20400r()) {
            this.f26857c.m15250c(j2);
            return;
        }
        try {
            this.f26857c.m15249b(j2, i2, this.f26866l - i3, i3, zznxVar);
        } finally {
            m20401s();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    /* renamed from: d */
    public final int mo20340d(zzno zznoVar, int i2, boolean z) throws IOException, InterruptedException {
        if (!m20400r()) {
            int mo20326e = zznoVar.mo20326e(i2);
            if (mo20326e != -1) {
                return mo20326e;
            }
            throw new EOFException();
        }
        try {
            int m20397i = m20397i(i2);
            zzrs zzrsVar = this.f26862h.f19288d;
            int read = zznoVar.read(zzrsVar.f26940a, zzrsVar.m20453a(this.f26867m), m20397i);
            if (read == -1) {
                throw new EOFException();
            }
            this.f26867m += read;
            this.f26866l += read;
            return read;
        } finally {
            m20401s();
        }
    }

    /* renamed from: e */
    public final void m20402e() {
        if (this.f26860f.getAndSet(2) == 0) {
            m20399m();
        }
    }

    /* renamed from: f */
    public final int m20403f(zzlj zzljVar, zznd zzndVar, boolean z, boolean z2, long j2) {
        int i2;
        int m15248a = this.f26857c.m15248a(zzljVar, zzndVar, z, z2, this.f26863i, this.f26858d);
        if (m15248a == -5) {
            this.f26863i = zzljVar.f26486a;
            return -5;
        }
        if (m15248a != -4) {
            if (m15248a == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!zzndVar.m20297f()) {
            if (zzndVar.f26631d < j2) {
                zzndVar.m20294c(Integer.MIN_VALUE);
            }
            if (zzndVar.m20306j()) {
                zzqs zzqsVar = this.f26858d;
                long j3 = zzqsVar.f26852b;
                this.f26859e.m20509j(1);
                m20396g(j3, this.f26859e.f27013a, 1);
                long j4 = j3 + 1;
                byte b2 = this.f26859e.f27013a[0];
                boolean z3 = (b2 & 128) != 0;
                int i3 = b2 & Byte.MAX_VALUE;
                zzmz zzmzVar = zzndVar.f26629b;
                if (zzmzVar.f26607a == null) {
                    zzmzVar.f26607a = new byte[16];
                }
                m20396g(j4, zzmzVar.f26607a, i3);
                long j5 = j4 + i3;
                if (z3) {
                    this.f26859e.m20509j(2);
                    m20396g(j5, this.f26859e.f27013a, 2);
                    j5 += 2;
                    i2 = this.f26859e.m20507h();
                } else {
                    i2 = 1;
                }
                zzmz zzmzVar2 = zzndVar.f26629b;
                int[] iArr = zzmzVar2.f26610d;
                if (iArr == null || iArr.length < i2) {
                    iArr = new int[i2];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = zzmzVar2.f26611e;
                if (iArr3 == null || iArr3.length < i2) {
                    iArr3 = new int[i2];
                }
                int[] iArr4 = iArr3;
                if (z3) {
                    int i4 = i2 * 6;
                    this.f26859e.m20509j(i4);
                    m20396g(j5, this.f26859e.f27013a, i4);
                    j5 += i4;
                    this.f26859e.m20510k(0);
                    for (int i5 = 0; i5 < i2; i5++) {
                        iArr2[i5] = this.f26859e.m20507h();
                        iArr4[i5] = this.f26859e.m20518s();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = zzqsVar.f26851a - ((int) (j5 - zzqsVar.f26852b));
                }
                zznx zznxVar = zzqsVar.f26854d;
                zzmz zzmzVar3 = zzndVar.f26629b;
                zzmzVar3.m20299a(i2, iArr2, iArr4, zznxVar.f26661b, zzmzVar3.f26607a, zznxVar.f26660a);
                long j6 = zzqsVar.f26852b;
                int i6 = (int) (j5 - j6);
                zzqsVar.f26852b = j6 + i6;
                zzqsVar.f26851a -= i6;
            }
            zzndVar.m20305h(this.f26858d.f26851a);
            zzqs zzqsVar2 = this.f26858d;
            long j7 = zzqsVar2.f26852b;
            ByteBuffer byteBuffer = zzndVar.f26630c;
            int i7 = zzqsVar2.f26851a;
            m20398j(j7);
            while (i7 > 0) {
                int i8 = (int) (j7 - this.f26861g.f19285a);
                int min = Math.min(i7, this.f26856b - i8);
                zzrs zzrsVar = this.f26861g.f19288d;
                byteBuffer.put(zzrsVar.f26940a, zzrsVar.m20453a(i8), min);
                j7 += min;
                i7 -= min;
                if (j7 == this.f26861g.f19286b) {
                    this.f26855a.mo20458i(zzrsVar);
                    this.f26861g = this.f26861g.m15333a();
                }
            }
            m20398j(this.f26858d.f26853c);
        }
        return -4;
    }

    /* renamed from: h */
    public final void m20404h(zzqv zzqvVar) {
        this.f26868n = zzqvVar;
    }

    /* renamed from: k */
    public final boolean m20405k(long j2, boolean z) {
        long m15251d = this.f26857c.m15251d(j2, z);
        if (m15251d == -1) {
            return false;
        }
        m20398j(m15251d);
        return true;
    }

    /* renamed from: l */
    public final long m20406l() {
        return this.f26857c.m15253f();
    }

    /* renamed from: n */
    public final int m20407n() {
        return this.f26857c.m15256i();
    }

    /* renamed from: o */
    public final boolean m20408o() {
        return this.f26857c.m15257j();
    }

    /* renamed from: p */
    public final zzlh m20409p() {
        return this.f26857c.m15258k();
    }

    /* renamed from: q */
    public final void m20410q() {
        long m15259l = this.f26857c.m15259l();
        if (m15259l != -1) {
            m20398j(m15259l);
        }
    }

    /* renamed from: t */
    public final void m20411t(boolean z) {
        int andSet = this.f26860f.getAndSet(z ? 0 : 2);
        m20399m();
        this.f26857c.m15255h();
        if (andSet == 2) {
            this.f26863i = null;
        }
    }
}
