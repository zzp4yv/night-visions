package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.f */
/* loaded from: classes2.dex */
final class RunnableC6622f implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ BinderC6585e f18844f;

    RunnableC6622f(BinderC6585e binderC6585e) {
        this.f18844f = binderC6585e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyz zzyzVar;
        zzyz zzyzVar2;
        zzyzVar = this.f18844f.f18709f.f21567f;
        if (zzyzVar != null) {
            try {
                zzyzVar2 = this.f18844f.f18709f.f21567f;
                zzyzVar2.onAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.m17348d("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
