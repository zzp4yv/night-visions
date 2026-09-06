package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.dz */
/* loaded from: classes2.dex */
final class RunnableC6584dz implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ MediaCodec.CryptoException f18707f;

    /* renamed from: g */
    private final /* synthetic */ zzgr f18708g;

    RunnableC6584dz(zzgr zzgrVar, MediaCodec.CryptoException cryptoException) {
        this.f18708g = zzgrVar;
        this.f18707f = cryptoException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgw zzgwVar;
        zzgwVar = this.f18708g.f26148j;
        zzgwVar.mo14749a(this.f18707f);
    }
}
