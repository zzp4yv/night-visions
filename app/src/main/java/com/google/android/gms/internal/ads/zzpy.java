package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpy implements zzqx {

    /* renamed from: f */
    private final zzqx[] f26829f;

    public zzpy(zzqx[] zzqxVarArr) {
        this.f26829f = zzqxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    /* renamed from: a */
    public final long mo15124a() {
        long j2 = Long.MAX_VALUE;
        for (zzqx zzqxVar : this.f26829f) {
            long mo15124a = zzqxVar.mo15124a();
            if (mo15124a != Long.MIN_VALUE) {
                j2 = Math.min(j2, mo15124a);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    /* renamed from: b */
    public final boolean mo15125b(long j2) {
        boolean z;
        boolean z2 = false;
        do {
            long mo15124a = mo15124a();
            if (mo15124a == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzqx zzqxVar : this.f26829f) {
                if (zzqxVar.mo15124a() == mo15124a) {
                    z |= zzqxVar.mo15125b(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
