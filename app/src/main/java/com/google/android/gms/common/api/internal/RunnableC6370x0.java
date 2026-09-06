package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* loaded from: classes2.dex */
final class RunnableC6370x0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ LifecycleCallback f17470f;

    /* renamed from: g */
    final /* synthetic */ String f17471g;

    /* renamed from: h */
    final /* synthetic */ zzb f17472h;

    RunnableC6370x0(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f17472h = zzbVar;
        this.f17470f = lifecycleCallback;
        this.f17471g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzb zzbVar = this.f17472h;
        i2 = zzbVar.f17631h;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.f17470f;
            bundle = zzbVar.f17632i;
            if (bundle != null) {
                bundle3 = zzbVar.f17632i;
                bundle2 = bundle3.getBundle(this.f17471g);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo14034e(bundle2);
        }
        i3 = this.f17472h.f17631h;
        if (i3 >= 2) {
            this.f17470f.mo14038i();
        }
        i4 = this.f17472h.f17631h;
        if (i4 >= 3) {
            this.f17470f.mo14036g();
        }
        i5 = this.f17472h.f17631h;
        if (i5 >= 4) {
            this.f17470f.mo14039j();
        }
        i6 = this.f17472h.f17631h;
        if (i6 >= 5) {
            this.f17470f.mo14035f();
        }
    }
}
