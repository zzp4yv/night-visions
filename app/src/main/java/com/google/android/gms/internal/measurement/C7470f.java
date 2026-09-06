package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes2.dex */
final class C7470f extends zzx.AbstractRunnableC7600a {

    /* renamed from: j */
    private final /* synthetic */ zzk f27721j;

    /* renamed from: k */
    private final /* synthetic */ zzx f27722k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7470f(zzx zzxVar, zzk zzkVar) {
        super(zzxVar);
        this.f27722k = zzxVar;
        this.f27721j = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7600a
    /* renamed from: a */
    final void mo20969a() throws RemoteException {
        zzm zzmVar;
        zzmVar = this.f27722k.f28411p;
        zzmVar.getCachedAppInstanceId(this.f27721j);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7600a
    /* renamed from: b */
    protected final void mo20978b() {
        this.f27721j.mo22444J(null);
    }
}
