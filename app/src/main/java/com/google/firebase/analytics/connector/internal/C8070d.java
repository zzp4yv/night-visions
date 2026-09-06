package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p179a.InterfaceC8062a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* loaded from: classes2.dex */
public final class C8070d {

    /* renamed from: a */
    private InterfaceC8062a.b f30663a;

    /* renamed from: b */
    private AppMeasurement f30664b;

    /* renamed from: c */
    private C8072f f30665c;

    public C8070d(AppMeasurement appMeasurement, InterfaceC8062a.b bVar) {
        this.f30663a = bVar;
        this.f30664b = appMeasurement;
        C8072f c8072f = new C8072f(this);
        this.f30665c = c8072f;
        this.f30664b.m22662a(c8072f);
    }
}
