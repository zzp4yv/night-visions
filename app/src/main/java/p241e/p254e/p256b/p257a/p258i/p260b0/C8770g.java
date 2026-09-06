package p241e.p254e.p256b.p257a.p258i.p260b0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8851d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* renamed from: e.e.b.a.i.b0.g */
/* loaded from: classes2.dex */
public final class C8770g implements InterfaceC8849b<AbstractC6257t> {

    /* renamed from: a */
    private final Provider<InterfaceC8821a> f33459a;

    public C8770g(Provider<InterfaceC8821a> provider) {
        this.f33459a = provider;
    }

    /* renamed from: a */
    public static AbstractC6257t m27967a(InterfaceC8821a interfaceC8821a) {
        return (AbstractC6257t) C8851d.m28189c(AbstractC8769f.m27966a(interfaceC8821a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8770g m27968b(Provider<InterfaceC8821a> provider) {
        return new C8770g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC6257t get() {
        return m27967a(this.f33459a.get());
    }
}
