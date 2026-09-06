package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzer extends zzfk {

    /* renamed from: n */
    private long f26065n;

    public zzer(zzdy zzdyVar, String str, String str2, zzbp.zza.C11431zza c11431zza, long j2, int i2, int i3) {
        super(zzdyVar, str, str2, c11431zza, i2, 25);
        this.f26065n = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f26093k.invoke(null, new Object[0])).longValue();
        synchronized (this.f26092j) {
            this.f26092j.m18094t0(longValue);
            long j2 = this.f26065n;
            if (j2 != 0) {
                this.f26092j.m18066M(longValue - j2);
                this.f26092j.m18069P(this.f26065n);
            }
        }
    }
}
