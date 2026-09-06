package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.my */
/* loaded from: classes2.dex */
final class RunnableC6916my implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzr f19943f;

    /* renamed from: g */
    private final /* synthetic */ zzd f19944g;

    RunnableC6916my(zzd zzdVar, zzr zzrVar) {
        this.f19944g = zzdVar;
        this.f19943f = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19944g.f25404h.put(this.f19943f);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
