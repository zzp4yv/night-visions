package p241e.p254e.p256b.p257a.p258i.p260b0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8851d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* renamed from: e.e.b.a.i.b0.i */
/* loaded from: classes2.dex */
public final class C8772i implements InterfaceC8849b<InterfaceC6262y> {

    /* renamed from: a */
    private final Provider<Context> f33460a;

    /* renamed from: b */
    private final Provider<InterfaceC8792j0> f33461b;

    /* renamed from: c */
    private final Provider<AbstractC6257t> f33462c;

    /* renamed from: d */
    private final Provider<InterfaceC8821a> f33463d;

    public C8772i(Provider<Context> provider, Provider<InterfaceC8792j0> provider2, Provider<AbstractC6257t> provider3, Provider<InterfaceC8821a> provider4) {
        this.f33460a = provider;
        this.f33461b = provider2;
        this.f33462c = provider3;
        this.f33463d = provider4;
    }

    /* renamed from: a */
    public static C8772i m27971a(Provider<Context> provider, Provider<InterfaceC8792j0> provider2, Provider<AbstractC6257t> provider3, Provider<InterfaceC8821a> provider4) {
        return new C8772i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static InterfaceC6262y m27972c(Context context, InterfaceC8792j0 interfaceC8792j0, AbstractC6257t abstractC6257t, InterfaceC8821a interfaceC8821a) {
        return (InterfaceC6262y) C8851d.m28189c(AbstractC8771h.m27970a(context, interfaceC8792j0, abstractC6257t, interfaceC8821a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6262y get() {
        return m27972c(this.f33460a.get(), this.f33461b.get(), this.f33462c.get(), this.f33463d.get());
    }
}
