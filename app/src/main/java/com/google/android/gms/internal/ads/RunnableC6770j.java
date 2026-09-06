package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.j */
/* loaded from: classes2.dex */
final class RunnableC6770j implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzabx f19408f;

    RunnableC6770j(zzabx zzabxVar) {
        this.f19408f = zzabxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatb zzatbVar;
        zzatb zzatbVar2;
        zzatbVar = this.f19408f.f21570f;
        if (zzatbVar != null) {
            try {
                zzatbVar2 = this.f19408f.f21570f;
                zzatbVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e2) {
                zzbad.m17348d("Could not notify onRewardedVideoAdFailedToLoad event.", e2);
            }
        }
    }
}
