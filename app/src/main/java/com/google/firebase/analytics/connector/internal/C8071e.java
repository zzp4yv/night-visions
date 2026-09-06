package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p179a.InterfaceC8062a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes2.dex */
final class C8071e implements AppMeasurement.OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ C8068b f30666a;

    public C8071e(C8068b c8068b) {
        this.f30666a = c8068b;
    }

    @Override // com.google.android.gms.measurement.internal.zzha
    /* renamed from: a */
    public final void mo22696a(String str, String str2, Bundle bundle, long j2) {
        InterfaceC8062a.b bVar;
        if (this.f30666a.f30653a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C8069c.m24964f(str2));
            bVar = this.f30666a.f30654b;
            bVar.mo24953a(2, bundle2);
        }
    }
}
