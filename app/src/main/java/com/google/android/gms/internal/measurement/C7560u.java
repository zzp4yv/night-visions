package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes2.dex */
final class C7560u extends zzx.AbstractRunnableC7600a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27899j;

    /* renamed from: k */
    private final /* synthetic */ zzx.C7602c f27900k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7560u(zzx.C7602c c7602c, Activity activity) {
        super(zzx.this);
        this.f27900k = c7602c;
        this.f27899j = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7600a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzm zzmVar;
        zzmVar = zzx.this.f28411p;
        zzmVar.onActivityResumed(ObjectWrapper.m14708E0(this.f27899j), this.f28413g);
    }
}
