package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdev extends zzdob<zzdev, zza> implements zzdpm {
    private static volatile zzdpv<zzdev> zzdv;
    private static final zzdev zzgrp;
    private int zzgqu;

    public static final class zza extends zzdob.zza<zzdev, zza> implements zzdpm {
        private zza() {
            super(zzdev.zzgrp);
        }

        /* synthetic */ zza(C6762is c6762is) {
            this();
        }
    }

    static {
        zzdev zzdevVar = new zzdev();
        zzgrp = zzdevVar;
        zzdob.m19721t(zzdev.class, zzdevVar);
    }

    private zzdev() {
    }

    /* renamed from: y */
    public static zzdev m19307y(zzdmr zzdmrVar) throws zzdok {
        return (zzdev) zzdob.m19713k(zzgrp, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6762is c6762is = null;
        switch (C6762is.f19398a[i2 - 1]) {
            case 1:
                return new zzdev();
            case 2:
                return new zza(c6762is);
            case 3:
                return zzdob.m19719r(zzgrp, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzgqu"});
            case 4:
                return zzgrp;
            case 5:
                zzdpv<zzdev> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdev.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgrp);
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
    public final int m19309x() {
        return this.zzgqu;
    }
}
