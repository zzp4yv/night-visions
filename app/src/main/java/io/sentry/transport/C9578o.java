package io.sentry.transport;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: CurrentDateProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.transport.o */
/* loaded from: classes2.dex */
public final class C9578o implements InterfaceC9580q {

    /* renamed from: a */
    private static final InterfaceC9580q f36894a = new C9578o();

    private C9578o() {
    }

    /* renamed from: b */
    public static InterfaceC9580q m31694b() {
        return f36894a;
    }

    @Override // io.sentry.transport.InterfaceC9580q
    /* renamed from: a */
    public final long mo30147a() {
        return System.currentTimeMillis();
    }
}
