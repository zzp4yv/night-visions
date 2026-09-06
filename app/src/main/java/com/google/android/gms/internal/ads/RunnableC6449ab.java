package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ab */
/* loaded from: classes2.dex */
final class RunnableC6449ab implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzbhk f18105f;

    RunnableC6449ab(zzbhk zzbhkVar) {
        this.f18105f = zzbhkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgz zzbgzVar;
        zzbgzVar = this.f18105f.f23047f;
        zzbgzVar.destroy();
    }
}
