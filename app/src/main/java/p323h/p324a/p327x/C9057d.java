package p323h.p324a.p327x;

import p323h.p324a.p328y.InterfaceC9060a;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9074a;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: Disposables.java */
/* renamed from: h.a.x.d */
/* loaded from: classes2.dex */
public final class C9057d {
    /* renamed from: a */
    public static InterfaceC9056c m29242a() {
        return EnumC9071d.INSTANCE;
    }

    /* renamed from: b */
    public static InterfaceC9056c m29243b() {
        return m29245d(C9074a.f34947b);
    }

    /* renamed from: c */
    public static InterfaceC9056c m29244c(InterfaceC9060a interfaceC9060a) {
        C9075b.m29271c(interfaceC9060a, "run is null");
        return new C9054a(interfaceC9060a);
    }

    /* renamed from: d */
    public static InterfaceC9056c m29245d(Runnable runnable) {
        C9075b.m29271c(runnable, "run is null");
        return new C9059f(runnable);
    }
}
