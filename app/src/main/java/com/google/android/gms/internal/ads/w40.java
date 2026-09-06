package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class w40 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: f */
    private final /* synthetic */ zzvn f20832f;

    w40(zzvn zzvnVar) {
        this.f20832f = zzvnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: H */
    public final void mo14284H(int i2) {
        Object obj;
        Object obj2;
        obj = this.f20832f.f27225b;
        synchronized (obj) {
            this.f20832f.f27228e = null;
            obj2 = this.f20832f.f27225b;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    /* renamed from: P */
    public final void mo14285P(Bundle bundle) {
        Object obj;
        Object obj2;
        zzvu zzvuVar;
        zzvu zzvuVar2;
        obj = this.f20832f.f27225b;
        synchronized (obj) {
            try {
                zzvuVar = this.f20832f.f27226c;
                if (zzvuVar != null) {
                    zzvn zzvnVar = this.f20832f;
                    zzvuVar2 = zzvnVar.f27226c;
                    zzvnVar.f27228e = zzvuVar2.m20677e();
                }
            } catch (DeadObjectException e2) {
                zzbad.m17347c("Unable to obtain a cache service instance.", e2);
                this.f20832f.m20663b();
            }
            obj2 = this.f20832f.f27225b;
            obj2.notifyAll();
        }
    }
}
