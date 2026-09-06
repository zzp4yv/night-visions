package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC6263a;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: WorkInitializer_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.x */
/* loaded from: classes2.dex */
public final class C6261x implements InterfaceC8849b<C6260w> {

    /* renamed from: a */
    private final Provider<Executor> f16861a;

    /* renamed from: b */
    private final Provider<InterfaceC8792j0> f16862b;

    /* renamed from: c */
    private final Provider<InterfaceC6262y> f16863c;

    /* renamed from: d */
    private final Provider<InterfaceC6263a> f16864d;

    public C6261x(Provider<Executor> provider, Provider<InterfaceC8792j0> provider2, Provider<InterfaceC6262y> provider3, Provider<InterfaceC6263a> provider4) {
        this.f16861a = provider;
        this.f16862b = provider2;
        this.f16863c = provider3;
        this.f16864d = provider4;
    }

    /* renamed from: a */
    public static C6261x m13596a(Provider<Executor> provider, Provider<InterfaceC8792j0> provider2, Provider<InterfaceC6262y> provider3, Provider<InterfaceC6263a> provider4) {
        return new C6261x(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C6260w m13597c(Executor executor, InterfaceC8792j0 interfaceC8792j0, InterfaceC6262y interfaceC6262y, InterfaceC6263a interfaceC6263a) {
        return new C6260w(executor, interfaceC8792j0, interfaceC6262y, interfaceC6263a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6260w get() {
        return m13597c(this.f16861a.get(), this.f16862b.get(), this.f16863c.get(), this.f16864d.get());
    }
}
