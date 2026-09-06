package p241e.p254e.p256b.p257a.p258i.p262c0;

import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8851d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* renamed from: e.e.b.a.i.c0.d */
/* loaded from: classes2.dex */
public final class C8824d implements InterfaceC8849b<InterfaceC8821a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* renamed from: e.e.b.a.i.c0.d$a */
    private static final class a {

        /* renamed from: a */
        private static final C8824d f33570a = new C8824d();
    }

    /* renamed from: a */
    public static C8824d m28117a() {
        return a.f33570a;
    }

    /* renamed from: c */
    public static InterfaceC8821a m28118c() {
        return (InterfaceC8821a) C8851d.m28189c(AbstractC8822b.m28112b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC8821a get() {
        return m28118c();
    }
}
