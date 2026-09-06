package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* loaded from: classes2.dex */
final class RunnableC6352o0 implements Runnable {

    /* renamed from: f */
    private final C6350n0 f17434f;

    /* renamed from: g */
    final /* synthetic */ zal f17435g;

    RunnableC6352o0(zal zalVar, C6350n0 c6350n0) {
        this.f17435g = zalVar;
        this.f17434f = c6350n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17435g.f17600g) {
            ConnectionResult m14070a = this.f17434f.m14070a();
            if (m14070a.m13794Y()) {
                zal zalVar = this.f17435g;
                zalVar.f17375f.startActivityForResult(GoogleApiActivity.m13865b(zalVar.m14032b(), m14070a.m13793W(), this.f17434f.m14071b(), false), 1);
            } else if (this.f17435g.f17603j.mo13814m(m14070a.m13797y())) {
                zal zalVar2 = this.f17435g;
                zalVar2.f17603j.m13822z(zalVar2.m14032b(), this.f17435g.f17375f, m14070a.m13797y(), 2, this.f17435g);
            } else {
                if (m14070a.m13797y() != 18) {
                    this.f17435g.mo14115l(m14070a, this.f17434f.m14071b());
                    return;
                }
                Dialog m13804t = GoogleApiAvailability.m13804t(this.f17435g.m14032b(), this.f17435g);
                zal zalVar3 = this.f17435g;
                zalVar3.f17603j.m13820v(zalVar3.m14032b().getApplicationContext(), new C6354p0(this, m13804t));
            }
        }
    }
}
