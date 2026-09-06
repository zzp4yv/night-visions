package io.sentry;

import io.sentry.transport.C9584u;
import io.sentry.transport.InterfaceC9581r;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NoOpTransportFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.g3 */
/* loaded from: classes2.dex */
public final class C9408g3 implements InterfaceC9407g2 {

    /* renamed from: a */
    private static final C9408g3 f36337a = new C9408g3();

    private C9408g3() {
    }

    /* renamed from: b */
    public static C9408g3 m30813b() {
        return f36337a;
    }

    @Override // io.sentry.InterfaceC9407g2
    /* renamed from: a */
    public InterfaceC9581r mo30812a(C9647x4 c9647x4, C9500p3 c9500p3) {
        return C9584u.m31705a();
    }
}
