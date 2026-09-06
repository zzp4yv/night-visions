package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzet implements Callable {

    /* renamed from: f */
    private final zzdy f26066f;

    /* renamed from: g */
    private final zzbp.zza.C11431zza f26067g;

    public zzet(zzdy zzdyVar, zzbp.zza.C11431zza c11431zza) {
        this.f26066f = zzdyVar;
        this.f26067g = c11431zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        if (this.f26066f.m19899A() != null) {
            this.f26066f.m19899A().get();
        }
        zzbp.zza m19916z = this.f26066f.m19916z();
        if (m19916z == null) {
            return null;
        }
        try {
            synchronized (this.f26067g) {
                zzbp.zza.C11431zza c11431zza = this.f26067g;
                byte[] mo19587g = m19916z.mo19587g();
                c11431zza.mo19592l(mo19587g, 0, mo19587g.length, zzdno.m19703e());
            }
            return null;
        } catch (zzdok unused) {
            return null;
        }
    }
}
