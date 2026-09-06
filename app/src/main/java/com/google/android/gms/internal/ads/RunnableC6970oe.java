package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.oe */
/* loaded from: classes2.dex */
final class RunnableC6970oe implements Runnable {

    /* renamed from: f */
    private final WeakReference<zzbtb> f20187f;

    private RunnableC6970oe(zzbtb zzbtbVar) {
        this.f20187f = new WeakReference<>(zzbtbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbtb zzbtbVar = this.f20187f.get();
        if (zzbtbVar != null) {
            zzbtbVar.m18321g0();
        }
    }
}
