package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdef extends zzdob<zzdef, zza> implements zzdpm {
    private static volatile zzdpv<zzdef> zzdv;
    private static final zzdef zzgrf;
    private int zzgre;

    public static final class zza extends zzdob.zza<zzdef, zza> implements zzdpm {
        private zza() {
            super(zzdef.zzgrf);
        }

        /* synthetic */ zza(C6577ds c6577ds) {
            this();
        }
    }

    static {
        zzdef zzdefVar = new zzdef();
        zzgrf = zzdefVar;
        zzdob.m19721t(zzdef.class, zzdefVar);
    }

    private zzdef() {
    }

    /* renamed from: y */
    public static zzdef m19271y() {
        return zzgrf;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6577ds c6577ds = null;
        switch (C6577ds.f18699a[i2 - 1]) {
            case 1:
                return new zzdef();
            case 2:
                return new zza(c6577ds);
            case 3:
                return zzdob.m19719r(zzgrf, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzgre"});
            case 4:
                return zzgrf;
            case 5:
                zzdpv<zzdef> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdef.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgrf);
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
    public final int m19273x() {
        return this.zzgre;
    }
}
