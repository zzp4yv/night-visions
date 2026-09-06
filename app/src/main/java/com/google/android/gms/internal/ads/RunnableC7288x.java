package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

/* renamed from: com.google.android.gms.internal.ads.x */
/* loaded from: classes2.dex */
final class RunnableC7288x implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ PublisherAdView f20886f;

    /* renamed from: g */
    private final /* synthetic */ zzzk f20887g;

    /* renamed from: h */
    private final /* synthetic */ zzagq f20888h;

    RunnableC7288x(zzagq zzagqVar, PublisherAdView publisherAdView, zzzk zzzkVar) {
        this.f20888h = zzagqVar;
        this.f20886f = publisherAdView;
        this.f20887g = zzzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (!this.f20886f.zza(this.f20887g)) {
            zzbad.m17353i("Could not bind.");
        } else {
            onPublisherAdViewLoadedListener = this.f20888h.f22012f;
            onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.f20886f);
        }
    }
}
