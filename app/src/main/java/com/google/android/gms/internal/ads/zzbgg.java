package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

@zzard
/* loaded from: classes2.dex */
public final class zzbgg extends zzbft {

    /* renamed from: i */
    private String f22991i;

    /* renamed from: j */
    private final zzbde f22992j;

    /* renamed from: k */
    private boolean f22993k;

    /* renamed from: l */
    private final zzbfl f22994l;

    /* renamed from: m */
    private ByteBuffer f22995m;

    /* renamed from: n */
    private boolean f22996n;

    /* renamed from: o */
    private final Object f22997o;

    /* renamed from: p */
    private boolean f22998p;

    public zzbgg(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        this.f22992j = zzbdeVar;
        this.f22994l = new zzbfl();
        this.f22997o = new Object();
    }

    /* renamed from: D */
    private final void m17646D() {
        int position = this.f22995m.position();
        boolean z = position > 0;
        int m17497g = zzbdk.m17497g();
        int m17498h = zzbdk.m17498h();
        String str = this.f22991i;
        m17630l(str, mo17641z(str), position, 0, z, m17497g, m17498h);
    }

    /* renamed from: B */
    public final ByteBuffer m17647B() {
        synchronized (this.f22997o) {
            ByteBuffer byteBuffer = this.f22995m;
            if (byteBuffer != null && !this.f22996n) {
                byteBuffer.flip();
                this.f22996n = true;
            }
            this.f22993k = true;
        }
        return this.f22995m;
    }

    /* renamed from: C */
    public final String m17648C() {
        return this.f22991i;
    }

    /* renamed from: E */
    public final boolean m17649E() {
        return this.f22998p;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        this.f22993k = true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:? -> B:50:0x0136). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    public final boolean mo17640y(String str) {
        String str2;
        this.f22991i = str;
        String mo17641z = mo17641z(str);
        String str3 = "error";
        int i2 = 0;
        try {
            String str4 = this.f22971g;
            zzbde zzbdeVar = this.f22992j;
            zzjp zzjsVar = new zzjs(str4, null, null, zzbdeVar.f22843d, zzbdeVar.f22845f, true);
            if (this.f22992j.f22849j) {
                try {
                    zzjsVar = new zzbeh(this.f22970f, zzjsVar, null);
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
            zzjsVar.mo14852a(new zzjq(Uri.parse(str)));
            zzbdf zzbdfVar = this.f22972h.get();
            if (zzbdfVar != null) {
                zzbdfVar.mo14909g(mo17641z, this);
            }
            Clock zzln = zzk.zzln();
            long mo14608a = zzln.mo14608a();
            long longValue = ((Long) zzyt.m20848e().m16421c(zzacu.f21622F)).longValue();
            long longValue2 = ((Long) zzyt.m20848e().m16421c(zzacu.f21616E)).longValue();
            this.f22995m = ByteBuffer.allocate(this.f22992j.f22842c);
            int i3 = 8192;
            byte[] bArr = new byte[8192];
            long j2 = mo14608a;
            while (true) {
                int read = zzjsVar.read(bArr, i2, Math.min(this.f22995m.remaining(), i3));
                if (read == -1) {
                    this.f22998p = true;
                    m17634s(str, mo17641z, (int) this.f22994l.m17615a(this.f22995m));
                    return true;
                }
                synchronized (this.f22997o) {
                    try {
                        if (this.f22993k) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                this.f22995m.put(bArr, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f22995m.remaining() <= 0) {
                                m17646D();
                                return true;
                            }
                            if (this.f22993k) {
                                int limit = this.f22995m.limit();
                                StringBuilder sb4 = new StringBuilder(35);
                                sb4.append("Precache abort at ");
                                sb4.append(limit);
                                sb4.append(" bytes");
                                throw new IOException(sb4.toString());
                            }
                            long mo14608a2 = zzln.mo14608a();
                            if (mo14608a2 - j2 >= longValue) {
                                m17646D();
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
                            i2 = 0;
                            i3 = 8192;
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
