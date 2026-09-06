package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p179a.InterfaceC8062a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.f */
/* loaded from: classes2.dex */
final class C8072f implements AppMeasurement.OnEventListener {

    /* renamed from: a */
    private final /* synthetic */ C8070d f30667a;

    public C8072f(C8070d c8070d) {
        this.f30667a = c8070d;
    }

    @Override // com.google.android.gms.measurement.internal.zzha
    /* renamed from: a */
    public final void mo22696a(String str, String str2, Bundle bundle, long j2) {
        InterfaceC8062a.b bVar;
        if (str == null || str.equals("crash") || !C8069c.m24963e(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        bVar = this.f30667a.f30663a;
        bVar.mo24953a(3, bundle2);
    }
}
