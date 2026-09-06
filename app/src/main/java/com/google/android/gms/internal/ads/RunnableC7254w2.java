package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p241e.p254e.p255a.EnumC8748a;

/* renamed from: com.google.android.gms.internal.ads.w2 */
/* loaded from: classes2.dex */
final class RunnableC7254w2 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ EnumC8748a f20824f;

    /* renamed from: g */
    private final /* synthetic */ zzanu f20825g;

    RunnableC7254w2(zzanu zzanuVar, EnumC8748a enumC8748a) {
        this.f20825g = zzanuVar;
        this.f20824f = enumC8748a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamv zzamvVar;
        try {
            zzamvVar = this.f20825g.f22212a;
            zzamvVar.onAdFailedToLoad(zzaog.m16808a(this.f20824f));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
