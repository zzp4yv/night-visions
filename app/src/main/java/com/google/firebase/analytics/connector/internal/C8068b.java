package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p179a.InterfaceC8062a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.b */
/* loaded from: classes2.dex */
public final class C8068b {

    /* renamed from: a */
    Set<String> f30653a;

    /* renamed from: b */
    private InterfaceC8062a.b f30654b;

    /* renamed from: c */
    private AppMeasurement f30655c;

    /* renamed from: d */
    private C8071e f30656d;

    public C8068b(AppMeasurement appMeasurement, InterfaceC8062a.b bVar) {
        this.f30654b = bVar;
        this.f30655c = appMeasurement;
        C8071e c8071e = new C8071e(this);
        this.f30656d = c8071e;
        this.f30655c.m22662a(c8071e);
        this.f30653a = new HashSet();
    }
}
