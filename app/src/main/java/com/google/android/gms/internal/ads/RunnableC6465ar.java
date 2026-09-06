package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* loaded from: classes2.dex */
final class RunnableC6465ar implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzda f18180f;

    RunnableC6465ar(zzda zzdaVar) {
        this.f18180f = zzdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzdy zzdyVar;
        ConditionVariable conditionVariable2;
        if (this.f18180f.f25413e != null) {
            return;
        }
        conditionVariable = zzda.f25409a;
        synchronized (conditionVariable) {
            if (this.f18180f.f25413e != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21805i2)).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzdyVar = this.f18180f.f25412d;
                    zzda.f25410b = new zzwo(zzdyVar.f26008b, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.f18180f.f25413e = Boolean.valueOf(z2);
            conditionVariable2 = zzda.f25409a;
            conditionVariable2.open();
        }
    }
}
