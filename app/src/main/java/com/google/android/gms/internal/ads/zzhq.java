package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzhq {

    /* renamed from: A */
    private boolean f26215A;

    /* renamed from: B */
    private int f26216B;

    /* renamed from: a */
    private final ConditionVariable f26217a = new ConditionVariable(true);

    /* renamed from: b */
    private final long[] f26218b;

    /* renamed from: c */
    private final C6954nz f26219c;

    /* renamed from: d */
    private AudioTrack f26220d;

    /* renamed from: e */
    private int f26221e;

    /* renamed from: f */
    private int f26222f;

    /* renamed from: g */
    private int f26223g;

    /* renamed from: h */
    private int f26224h;

    /* renamed from: i */
    private int f26225i;

    /* renamed from: j */
    private int f26226j;

    /* renamed from: k */
    private int f26227k;

    /* renamed from: l */
    private int f26228l;

    /* renamed from: m */
    private long f26229m;

    /* renamed from: n */
    private long f26230n;

    /* renamed from: o */
    private boolean f26231o;

    /* renamed from: p */
    private long f26232p;

    /* renamed from: q */
    private Method f26233q;

    /* renamed from: r */
    private long f26234r;

    /* renamed from: s */
    private int f26235s;

    /* renamed from: t */
    private long f26236t;

    /* renamed from: u */
    private long f26237u;

    /* renamed from: v */
    private long f26238v;

    /* renamed from: w */
    private float f26239w;

    /* renamed from: x */
    private byte[] f26240x;

    /* renamed from: y */
    private int f26241y;

    /* renamed from: z */
    private int f26242z;

    public zzhq() {
        C6917mz c6917mz = null;
        if (zzkq.f26428a >= 18) {
            try {
                this.f26233q = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzkq.f26428a >= 19) {
            this.f26219c = new C6991oz();
        } else {
            this.f26219c = new C6954nz(c6917mz);
        }
        this.f26218b = new long[10];
        this.f26239w = 1.0f;
        this.f26235s = 0;
    }

    /* renamed from: i */
    private final long m20038i(long j2) {
        if (!this.f26215A) {
            return j2 / this.f26224h;
        }
        if (this.f26216B == 0) {
            return 0L;
        }
        return ((j2 << 3) * this.f26221e) / (r0 * 1000);
    }

    /* renamed from: j */
    private final long m20039j(long j2) {
        return (j2 * 1000000) / this.f26221e;
    }

    /* renamed from: k */
    private final long m20040k(long j2) {
        return (j2 * this.f26221e) / 1000000;
    }

    /* renamed from: o */
    private final void m20041o() {
        this.f26229m = 0L;
        this.f26228l = 0;
        this.f26227k = 0;
        this.f26230n = 0L;
        this.f26231o = false;
        this.f26232p = 0L;
    }

    /* renamed from: a */
    public final boolean m20042a() {
        return this.f26220d != null;
    }

    /* renamed from: b */
    public final void m20043b() {
        if (m20042a()) {
            m20041o();
            this.f26220d.pause();
        }
    }

    /* renamed from: c */
    public final void m20044c() {
        if (m20042a()) {
            this.f26237u = System.nanoTime() / 1000;
            this.f26220d.play();
        }
    }

    /* renamed from: d */
    public final void m20045d() {
        if (m20042a()) {
            this.f26234r = 0L;
            this.f26242z = 0;
            this.f26236t = 0L;
            this.f26238v = 0L;
            m20041o();
            if (this.f26220d.getPlayState() == 3) {
                this.f26220d.pause();
            }
            AudioTrack audioTrack = this.f26220d;
            this.f26220d = null;
            this.f26219c.mo15657a(null, false);
            this.f26217a.close();
            new C6917mz(this, audioTrack).start();
        }
    }

    /* renamed from: e */
    public final void m20046e(float f2) {
        this.f26239w = f2;
        if (m20042a()) {
            if (zzkq.f26428a >= 21) {
                this.f26220d.setVolume(f2);
            } else {
                this.f26220d.setStereoVolume(f2, f2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m20047f(java.nio.ByteBuffer r17, int r18, int r19, long r20) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhq.m20047f(java.nio.ByteBuffer, int, int, long):int");
    }

    /* renamed from: h */
    public final void m20048h(MediaFormat mediaFormat, int i2) {
        int i3;
        int integer = mediaFormat.getInteger("channel-count");
        if (integer == 1) {
            i3 = 4;
        } else if (integer == 2) {
            i3 = 12;
        } else if (integer == 6) {
            i3 = 252;
        } else {
            if (integer != 8) {
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unsupported channel count: ");
                sb.append(integer);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = 1020;
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        String string = mediaFormat.getString("mime");
        int i4 = "audio/ac3".equals(string) ? 5 : "audio/eac3".equals(string) ? 6 : zzkl.m20137b(string) ? 2 : 0;
        boolean z = i4 == 5 || i4 == 6;
        if (m20042a() && this.f26221e == integer2 && this.f26222f == i3 && !this.f26215A && !z) {
            return;
        }
        m20045d();
        this.f26223g = i4;
        this.f26221e = integer2;
        this.f26222f = i3;
        this.f26215A = z;
        this.f26216B = 0;
        this.f26224h = integer * 2;
        int minBufferSize = AudioTrack.getMinBufferSize(integer2, i3, i4);
        this.f26225i = minBufferSize;
        zzkh.m20129d(minBufferSize != -2);
        int i5 = this.f26225i << 2;
        int m20040k = ((int) m20040k(250000L)) * this.f26224h;
        int max = (int) Math.max(this.f26225i, m20040k(750000L) * this.f26224h);
        if (i5 < m20040k) {
            i5 = m20040k;
        } else if (i5 > max) {
            i5 = max;
        }
        this.f26226j = i5;
    }

    /* renamed from: l */
    public final void m20049l() {
        if (this.f26235s == 1) {
            this.f26235s = 2;
        }
    }

    /* renamed from: m */
    public final boolean m20050m() {
        if (m20042a()) {
            return m20038i(this.f26234r) > this.f26219c.m15659c() || this.f26219c.m15658b();
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m20051n() {
        return this.f26234r > ((long) ((this.f26225i * 3) / 2));
    }

    /* renamed from: p */
    public final long m20052p(boolean z) {
        long j2;
        long j3;
        if (!(m20042a() && this.f26236t != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f26220d.getPlayState() == 3) {
            long m15660d = this.f26219c.m15660d();
            if (m15660d != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f26230n >= 30000) {
                    long[] jArr = this.f26218b;
                    int i2 = this.f26227k;
                    jArr[i2] = m15660d - nanoTime;
                    this.f26227k = (i2 + 1) % 10;
                    int i3 = this.f26228l;
                    if (i3 < 10) {
                        this.f26228l = i3 + 1;
                    }
                    this.f26230n = nanoTime;
                    this.f26229m = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.f26228l;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f26229m += this.f26218b[i4] / i5;
                        i4++;
                    }
                }
                if (!this.f26215A && nanoTime - this.f26232p >= 500000) {
                    boolean mo15661e = this.f26219c.mo15661e();
                    this.f26231o = mo15661e;
                    if (mo15661e) {
                        long mo15662f = this.f26219c.mo15662f() / 1000;
                        long mo15663g = this.f26219c.mo15663g();
                        if (mo15662f < this.f26237u) {
                            this.f26231o = false;
                        } else if (Math.abs(mo15662f - nanoTime) > 5000000) {
                            this.f26231o = false;
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(mo15663g);
                            sb.append(", ");
                            sb.append(mo15662f);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(m15660d);
                            Log.w("AudioTrack", sb.toString());
                        } else if (Math.abs(m20039j(mo15663g) - m15660d) > 5000000) {
                            this.f26231o = false;
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(mo15663g);
                            sb2.append(", ");
                            sb2.append(mo15662f);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(m15660d);
                            Log.w("AudioTrack", sb2.toString());
                        }
                    }
                    if (this.f26233q != null) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.f26220d, null)).intValue() * 1000) - m20039j(m20038i(this.f26226j));
                            this.f26238v = intValue;
                            long max = Math.max(intValue, 0L);
                            this.f26238v = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.f26238v = 0L;
                            }
                        } catch (Exception unused) {
                            this.f26233q = null;
                        }
                    }
                    this.f26232p = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f26231o) {
            return m20039j(this.f26219c.mo15663g() + m20040k(nanoTime2 - (this.f26219c.mo15662f() / 1000))) + this.f26236t;
        }
        if (this.f26228l == 0) {
            j2 = this.f26219c.m15660d();
            j3 = this.f26236t;
        } else {
            j2 = nanoTime2 + this.f26229m;
            j3 = this.f26236t;
        }
        long j4 = j2 + j3;
        return !z ? j4 - this.f26238v : j4;
    }

    /* renamed from: q */
    public final int m20053q(int i2) throws zzhu {
        this.f26217a.block();
        if (i2 == 0) {
            this.f26220d = new AudioTrack(3, this.f26221e, this.f26222f, this.f26223g, this.f26226j, 1);
        } else {
            this.f26220d = new AudioTrack(3, this.f26221e, this.f26222f, this.f26223g, this.f26226j, 1, i2);
        }
        int state = this.f26220d.getState();
        if (state == 1) {
            int audioSessionId = this.f26220d.getAudioSessionId();
            this.f26219c.mo15657a(this.f26220d, this.f26215A);
            m20046e(this.f26239w);
            return audioSessionId;
        }
        try {
            this.f26220d.release();
        } catch (Exception unused) {
        } finally {
            this.f26220d = null;
        }
        throw new zzhu(state, this.f26221e, this.f26222f, this.f26226j);
    }
}
