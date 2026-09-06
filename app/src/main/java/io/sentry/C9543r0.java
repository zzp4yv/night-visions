package io.sentry;

import io.sentry.transport.C9576m;
import io.sentry.transport.C9588y;
import io.sentry.transport.InterfaceC9581r;
import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AsyncHttpTransportFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.r0 */
/* loaded from: classes2.dex */
public final class C9543r0 implements InterfaceC9407g2 {
    @Override // io.sentry.InterfaceC9407g2
    /* renamed from: a */
    public InterfaceC9581r mo30812a(C9647x4 c9647x4, C9500p3 c9500p3) {
        C9613q.m31802c(c9647x4, "options is required");
        C9613q.m31802c(c9500p3, "requestDetails is required");
        return new C9576m(c9647x4, new C9588y(c9647x4), c9647x4.getTransportGate(), c9500p3);
    }
}
