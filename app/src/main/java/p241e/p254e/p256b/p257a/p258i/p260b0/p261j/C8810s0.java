package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: SQLiteEventStore_Factory.java */
/* renamed from: e.e.b.a.i.b0.j.s0 */
/* loaded from: classes2.dex */
public final class C8810s0 implements InterfaceC8849b<C8808r0> {

    /* renamed from: a */
    private final Provider<InterfaceC8821a> f33529a;

    /* renamed from: b */
    private final Provider<InterfaceC8821a> f33530b;

    /* renamed from: c */
    private final Provider<AbstractC8794k0> f33531c;

    /* renamed from: d */
    private final Provider<C8812t0> f33532d;

    /* renamed from: e */
    private final Provider<String> f33533e;

    public C8810s0(Provider<InterfaceC8821a> provider, Provider<InterfaceC8821a> provider2, Provider<AbstractC8794k0> provider3, Provider<C8812t0> provider4, Provider<String> provider5) {
        this.f33529a = provider;
        this.f33530b = provider2;
        this.f33531c = provider3;
        this.f33532d = provider4;
        this.f33533e = provider5;
    }

    /* renamed from: a */
    public static C8810s0 m28082a(Provider<InterfaceC8821a> provider, Provider<InterfaceC8821a> provider2, Provider<AbstractC8794k0> provider3, Provider<C8812t0> provider4, Provider<String> provider5) {
        return new C8810s0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C8808r0 m28083c(InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, Object obj, Object obj2, Provider<String> provider) {
        return new C8808r0(interfaceC8821a, interfaceC8821a2, (AbstractC8794k0) obj, (C8812t0) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8808r0 get() {
        return m28083c(this.f33529a.get(), this.f33530b.get(), this.f33531c.get(), this.f33532d.get(), this.f33533e);
    }
}
