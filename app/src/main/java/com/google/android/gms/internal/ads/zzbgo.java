package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

@zzard
/* loaded from: classes2.dex */
public final class zzbgo extends zzbft implements zzsj<zzrv> {

    /* renamed from: i */
    private String f23004i;

    /* renamed from: j */
    private final zzbde f23005j;

    /* renamed from: k */
    private boolean f23006k;

    /* renamed from: l */
    private final C6818ka f23007l;

    /* renamed from: m */
    private final zzbfl f23008m;

    /* renamed from: n */
    private ByteBuffer f23009n;

    /* renamed from: o */
    private boolean f23010o;

    /* renamed from: p */
    private final Object f23011p;

    /* renamed from: q */
    private boolean f23012q;

    public zzbgo(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        this.f23005j = zzbdeVar;
        this.f23007l = new C6818ka();
        this.f23008m = new zzbfl();
        this.f23011p = new Object();
    }

    /* renamed from: D */
    private final void m17656D() {
        int m15398b = (int) this.f23007l.m15398b();
        int m17615a = (int) this.f23008m.m17615a(this.f23009n);
        int position = this.f23009n.position();
        int round = Math.round(m17615a * (position / m15398b));
        boolean z = round > 0;
        int m17579G = zzbfa.m17579G();
        int m17580H = zzbfa.m17580H();
        String str = this.f23004i;
        m17629k(str, mo17641z(str), position, m15398b, round, m17615a, z, m17579G, m17580H);
    }

    /* renamed from: B */
    public final ByteBuffer m17657B() {
        synchronized (this.f23011p) {
            ByteBuffer byteBuffer = this.f23009n;
            if (byteBuffer != null && !this.f23010o) {
                byteBuffer.flip();
                this.f23010o = true;
            }
            this.f23006k = true;
        }
        return this.f23009n;
    }

    /* renamed from: C */
    public final String m17658C() {
        return this.f23004i;
    }

    /* renamed from: E */
    public final boolean m17659E() {
        return this.f23012q;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        this.f23006k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17593d(zzrv zzrvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: n */
    public final /* synthetic */ void mo17603n(zzrv zzrvVar, zzry zzryVar) {
        zzrv zzrvVar2 = zzrvVar;
        if (zzrvVar2 instanceof zzsa) {
            this.f23007l.m15397a((zzsa) zzrvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo17604o(zzrv zzrvVar, int i2) {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:? -> B:50:0x0138). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    public final boolean mo17640y(String str) {
        String str2;
        this.f23004i = str;
        String mo17641z = mo17641z(str);
        String str3 = "error";
        int i2 = 0;
        try {
            String str4 = this.f22971g;
            zzbde zzbdeVar = this.f23005j;
            zzrv zzsaVar = new zzsa(str4, null, this, zzbdeVar.f22843d, zzbdeVar.f22845f, true, null);
            if (this.f23005j.f22849j) {
                try {
                    zzsaVar = new zzbex(this.f22970f, zzsaVar, null, null);
                } catch (Exception e2) {
                    e = e2;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                    sb.append(canonicalName);
                    sb.append(":");
                    sb.append(message);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb2).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(str);
                    sb3.append(" Exception: ");
                    sb3.append(sb2);
                    zzbad.m17353i(sb3.toString());
                    m17633q(str, mo17641z, str3, sb2);
                    return false;
                }
            }
            zzsaVar.mo15549a(new zzry(Uri.parse(str)));
            zzbdf zzbdfVar = this.f22972h.get();
            if (zzbdfVar != null) {
                zzbdfVar.mo14909g(mo17641z, this);
            }
            Clock zzln = zzk.zzln();
            long mo14608a = zzln.mo14608a();
            long longValue = ((Long) zzyt.m20848e().m16421c(zzacu.f21622F)).longValue();
            long longValue2 = ((Long) zzyt.m20848e().m16421c(zzacu.f21616E)).longValue();
            this.f23009n = ByteBuffer.allocate(this.f23005j.f22842c);
            int i3 = 8192;
            byte[] bArr = new byte[8192];
            long j2 = mo14608a;
            while (true) {
                int read = zzsaVar.read(bArr, i2, Math.min(this.f23009n.remaining(), i3));
                if (read == -1) {
                    this.f23012q = true;
                    m17634s(str, mo17641z, (int) this.f23008m.m17615a(this.f23009n));
                    return true;
                }
                synchronized (this.f23011p) {
                    try {
                        if (this.f23006k) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                this.f23009n.put(bArr, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f23009n.remaining() <= 0) {
                                m17656D();
                                return true;
                            }
                            if (this.f23006k) {
                                int limit = this.f23009n.limit();
                                StringBuilder sb4 = new StringBuilder(35);
                                sb4.append("Precache abort at ");
                                sb4.append(limit);
                                sb4.append(" bytes");
                                throw new IOException(sb4.toString());
                            }
                            long mo14608a2 = zzln.mo14608a();
                            if (mo14608a2 - j2 >= longValue) {
                                m17656D();
                                j2 = mo14608a2;
                            }
                            if (mo14608a2 - mo14608a > 1000 * longValue2) {
                                StringBuilder sb5 = new StringBuilder(49);
                                sb5.append("Timeout exceeded. Limit: ");
                                sb5.append(longValue2);
                                sb5.append(" sec");
                                throw new IOException(sb5.toString());
                            }
                            str3 = str2;
                            i3 = 8192;
                            i2 = 0;
                        } catch (Exception e3) {
                            e = e3;
                            str3 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb6.append(canonicalName2);
                            sb6.append(":");
                            sb6.append(message2);
                            String sb22 = sb6.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb22).length());
                            sb32.append("Failed to preload url ");
                            sb32.append(str);
                            sb32.append(" Exception: ");
                            sb32.append(sb22);
                            zzbad.m17353i(sb32.toString());
                            m17633q(str, mo17641z, str3, sb22);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: z */
    protected final String mo17641z(String str) {
        String valueOf = String.valueOf(super.mo17641z(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }
}
