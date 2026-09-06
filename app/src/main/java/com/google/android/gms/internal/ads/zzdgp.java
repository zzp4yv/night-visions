package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdgp extends zzdob<zzdgp, zza> implements zzdpm {
    private static volatile zzdpv<zzdgp> zzdv;
    private static final zzdgp zzgty;
    private int zzgtw;
    private int zzgtx;

    public static final class zza extends zzdob.zza<zzdgp, zza> implements zzdpm {
        private zza() {
            super(zzdgp.zzgty);
        }

        /* synthetic */ zza(C7280ws c7280ws) {
            this();
        }
    }

    static {
        zzdgp zzdgpVar = new zzdgp();
        zzgty = zzdgpVar;
        zzdob.m19721t(zzdgp.class, zzdgpVar);
    }

    private zzdgp() {
    }

    /* renamed from: z */
    public static zzdgp m19404z() {
        return zzgty;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7280ws c7280ws = null;
        switch (C7280ws.f20869a[i2 - 1]) {
            case 1:
                return new zzdgp();
            case 2:
                return new zza(c7280ws);
            case 3:
                return zzdob.m19719r(zzgty, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzgtw", "zzgtx"});
            case 4:
                return zzgty;
            case 5:
                zzdpv<zzdgp> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdgp.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgty);
                            zzdv = zzdpvVar;
                        }
                    }
                }
                return zzdpvVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: x */
    public final zzdgj m19405x() {
        zzdgj m19381g = zzdgj.m19381g(this.zzgtw);
        return m19381g == null ? zzdgj.UNRECOGNIZED : m19381g;
    }

    /* renamed from: y */
    public final int m19406y() {
        return this.zzgtx;
    }
}
