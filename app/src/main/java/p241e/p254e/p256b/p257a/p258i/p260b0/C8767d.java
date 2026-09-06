package p241e.p254e.p256b.p257a.p258i.p260b0;

import com.google.android.datatransport.runtime.backends.InterfaceC6229e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6263a;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: DefaultScheduler_Factory.java */
/* renamed from: e.e.b.a.i.b0.d */
/* loaded from: classes2.dex */
public final class C8767d implements InterfaceC8849b<C8766c> {

    /* renamed from: a */
    private final Provider<Executor> f33454a;

    /* renamed from: b */
    private final Provider<InterfaceC6229e> f33455b;

    /* renamed from: c */
    private final Provider<InterfaceC6262y> f33456c;

    /* renamed from: d */
    private final Provider<InterfaceC8792j0> f33457d;

    /* renamed from: e */
    private final Provider<InterfaceC6263a> f33458e;

    public C8767d(Provider<Executor> provider, Provider<InterfaceC6229e> provider2, Provider<InterfaceC6262y> provider3, Provider<InterfaceC8792j0> provider4, Provider<InterfaceC6263a> provider5) {
        this.f33454a = provider;
        this.f33455b = provider2;
        this.f33456c = provider3;
        this.f33457d = provider4;
        this.f33458e = provider5;
    }

    /* renamed from: a */
    public static C8767d m27963a(Provider<Executor> provider, Provider<InterfaceC6229e> provider2, Provider<InterfaceC6262y> provider3, Provider<InterfaceC8792j0> provider4, Provider<InterfaceC6263a> provider5) {
        return new C8767d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C8766c m27964c(Executor executor, InterfaceC6229e interfaceC6229e, InterfaceC6262y interfaceC6262y, InterfaceC8792j0 interfaceC8792j0, InterfaceC6263a interfaceC6263a) {
        return new C8766c(executor, interfaceC6229e, interfaceC6262y, interfaceC8792j0, interfaceC6263a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8766c get() {
        return m27964c(this.f33454a.get(), this.f33455b.get(), this.f33456c.get(), this.f33457d.get(), this.f33458e.get());
    }
}
