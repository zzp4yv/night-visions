package p241e.p254e.p256b.p257a.p258i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6258u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6260w;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.InterfaceC8768e;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: TransportRuntime_Factory.java */
/* renamed from: e.e.b.a.i.w */
/* loaded from: classes2.dex */
public final class C8847w implements InterfaceC8849b<C8845u> {

    /* renamed from: a */
    private final Provider<InterfaceC8821a> f33622a;

    /* renamed from: b */
    private final Provider<InterfaceC8821a> f33623b;

    /* renamed from: c */
    private final Provider<InterfaceC8768e> f33624c;

    /* renamed from: d */
    private final Provider<C6258u> f33625d;

    /* renamed from: e */
    private final Provider<C6260w> f33626e;

    public C8847w(Provider<InterfaceC8821a> provider, Provider<InterfaceC8821a> provider2, Provider<InterfaceC8768e> provider3, Provider<C6258u> provider4, Provider<C6260w> provider5) {
        this.f33622a = provider;
        this.f33623b = provider2;
        this.f33624c = provider3;
        this.f33625d = provider4;
        this.f33626e = provider5;
    }

    /* renamed from: a */
    public static C8847w m28181a(Provider<InterfaceC8821a> provider, Provider<InterfaceC8821a> provider2, Provider<InterfaceC8768e> provider3, Provider<C6258u> provider4, Provider<C6260w> provider5) {
        return new C8847w(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C8845u m28182c(InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, InterfaceC8768e interfaceC8768e, C6258u c6258u, C6260w c6260w) {
        return new C8845u(interfaceC8821a, interfaceC8821a2, interfaceC8768e, c6258u, c6260w);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8845u get() {
        return m28182c(this.f33622a.get(), this.f33623b.get(), this.f33624c.get(), this.f33625d.get(), this.f33626e.get());
    }
}
