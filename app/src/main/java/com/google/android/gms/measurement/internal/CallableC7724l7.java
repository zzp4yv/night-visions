package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* loaded from: classes2.dex */
final class CallableC7724l7 implements Callable<String> {

    /* renamed from: f */
    private final /* synthetic */ zzm f28759f;

    /* renamed from: g */
    private final /* synthetic */ zzkc f28760g;

    CallableC7724l7(zzkc zzkcVar, zzm zzmVar) {
        this.f28760g = zzkcVar;
        this.f28759f = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        C7845z3 m23442T = this.f28760g.m23442T(this.f28759f);
        if (m23442T != null) {
            return m23442T.m22944x();
        }
        this.f28760g.mo22836h().m23140K().m23147a("App info was null when attempting to get app instance id");
        return null;
    }
}
