package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.d8 */
/* loaded from: classes2.dex */
final class RunnableC6557d8 implements Runnable {
    RunnableC6557d8(C6520c8 c6520c8) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
