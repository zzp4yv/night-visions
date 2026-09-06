package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.api.internal.y0 */
/* loaded from: classes2.dex */
final class RunnableC6372y0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ LifecycleCallback f17474f;

    /* renamed from: g */
    final /* synthetic */ String f17475g;

    /* renamed from: h */
    final /* synthetic */ zzd f17476h;

    RunnableC6372y0(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f17476h = zzdVar;
        this.f17474f = lifecycleCallback;
        this.f17475g = str;
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
        zzd zzdVar = this.f17476h;
        i2 = zzdVar.f17635h;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.f17474f;
            bundle = zzdVar.f17636i;
            if (bundle != null) {
                bundle3 = zzdVar.f17636i;
                bundle2 = bundle3.getBundle(this.f17475g);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo14034e(bundle2);
        }
        i3 = this.f17476h.f17635h;
        if (i3 >= 2) {
            this.f17474f.mo14038i();
        }
        i4 = this.f17476h.f17635h;
        if (i4 >= 3) {
            this.f17474f.mo14036g();
        }
        i5 = this.f17476h.f17635h;
        if (i5 >= 4) {
            this.f17474f.mo14039j();
        }
        i6 = this.f17476h.f17635h;
        if (i6 >= 5) {
            this.f17474f.mo14035f();
        }
    }
}
