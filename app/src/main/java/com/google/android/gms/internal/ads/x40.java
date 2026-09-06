package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class x40 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: f */
    private final /* synthetic */ zzvn f20940f;

    x40(zzvn zzvnVar) {
        this.f20940f = zzvnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo14286E0(ConnectionResult connectionResult) {
        Object obj;
        zzvu zzvuVar;
        Object obj2;
        obj = this.f20940f.f27225b;
        synchronized (obj) {
            this.f20940f.f27228e = null;
            zzvuVar = this.f20940f.f27226c;
            if (zzvuVar != null) {
                zzvn.m20665f(this.f20940f, null);
            }
            obj2 = this.f20940f.f27225b;
            obj2.notifyAll();
        }
    }
}
