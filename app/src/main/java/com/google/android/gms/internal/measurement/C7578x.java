package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes2.dex */
final class C7578x extends zzx.AbstractRunnableC7600a {

    /* renamed from: j */
    private final /* synthetic */ Activity f27923j;

    /* renamed from: k */
    private final /* synthetic */ zzx.C7602c f27924k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7578x(zzx.C7602c c7602c, Activity activity) {
        super(zzx.this);
        this.f27924k = c7602c;
        this.f27923j = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7600a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzm zzmVar;
        zzmVar = zzx.this.f28411p;
        zzmVar.onActivityPaused(ObjectWrapper.m14708E0(this.f27923j), this.f28413g);
    }
}
