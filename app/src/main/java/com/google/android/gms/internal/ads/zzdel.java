package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdel extends zzdob<zzdel, zza> implements zzdpm {
    private static volatile zzdpv<zzdel> zzdv;
    private static final zzdel zzgrj;
    private int zzgre;

    public static final class zza extends zzdob.zza<zzdel, zza> implements zzdpm {
        private zza() {
            super(zzdel.zzgrj);
        }

        /* synthetic */ zza(C6688gs c6688gs) {
            this();
        }
    }

    static {
        zzdel zzdelVar = new zzdel();
        zzgrj = zzdelVar;
        zzdob.m19721t(zzdel.class, zzdelVar);
    }

    private zzdel() {
    }

    /* renamed from: y */
    public static zzdel m19293y() {
        return zzgrj;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6688gs c6688gs = null;
        switch (C6688gs.f18990a[i2 - 1]) {
            case 1:
                return new zzdel();
            case 2:
                return new zza(c6688gs);
            case 3:
                return zzdob.m19719r(zzgrj, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzgre"});
            case 4:
                return zzgrj;
            case 5:
                zzdpv<zzdel> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdel.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgrj);
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
    public final int m19295x() {
        return this.zzgre;
    }
}
