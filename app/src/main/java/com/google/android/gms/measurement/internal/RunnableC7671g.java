package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes2.dex */
final class RunnableC7671g implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ InterfaceC7784s4 f28641f;

    /* renamed from: g */
    private final /* synthetic */ AbstractC7662f f28642g;

    RunnableC7671g(AbstractC7662f abstractC7662f, InterfaceC7784s4 interfaceC7784s4) {
        this.f28642g = abstractC7662f;
        this.f28641f = interfaceC7784s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28641f.mo22832G();
        if (zzw.m23556a()) {
            this.f28641f.mo22835g().m23201z(this);
            return;
        }
        boolean m22775d = this.f28642g.m22775d();
        AbstractC7662f.m22772a(this.f28642g, 0L);
        if (m22775d) {
            this.f28642g.mo22703b();
        }
    }
}
