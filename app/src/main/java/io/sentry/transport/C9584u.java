package io.sentry.transport;

import io.sentry.C9416h4;
import io.sentry.C9484n1;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NoOpTransport.java */
@ApiStatus.Internal
/* renamed from: io.sentry.transport.u */
/* loaded from: classes2.dex */
public final class C9584u implements InterfaceC9581r {

    /* renamed from: f */
    private static final C9584u f36901f = new C9584u();

    private C9584u() {
    }

    /* renamed from: a */
    public static C9584u m31705a() {
        return f36901f;
    }

    @Override // io.sentry.transport.InterfaceC9581r
    /* renamed from: V */
    public void mo31675V(C9416h4 c9416h4, C9484n1 c9484n1) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.transport.InterfaceC9581r
    /* renamed from: h */
    public void mo31676h(long j2) {
    }
}
