package p241e.p254e.p256b.p257a.p258i.p262c0;

import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8851d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: TimeModule_EventClockFactory.java */
/* renamed from: e.e.b.a.i.c0.c */
/* loaded from: classes2.dex */
public final class C8823c implements InterfaceC8849b<InterfaceC8821a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* renamed from: e.e.b.a.i.c0.c$a */
    private static final class a {

        /* renamed from: a */
        private static final C8823c f33569a = new C8823c();
    }

    /* renamed from: a */
    public static C8823c m28113a() {
        return a.f33569a;
    }

    /* renamed from: b */
    public static InterfaceC8821a m28114b() {
        return (InterfaceC8821a) C8851d.m28189c(AbstractC8822b.m28111a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8821a get() {
        return m28114b();
    }
}
