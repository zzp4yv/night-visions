package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eb */
/* loaded from: classes2.dex */
final class RunnableC6597eb implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC6486bb f18744f;

    RunnableC6597eb(ViewTreeObserverOnGlobalLayoutListenerC6486bb viewTreeObserverOnGlobalLayoutListenerC6486bb) {
        this.f18744f = viewTreeObserverOnGlobalLayoutListenerC6486bb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
